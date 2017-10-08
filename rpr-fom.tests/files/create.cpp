
#include <RTI/RTI1516.h>
#include <RTI/NullFederateAmbassador.h>
#include <iostream>
#include <cstdlib>

using namespace rti1516e;
using namespace std;

#define NUM_OBJECTS 5000


#define CLASS L"BaseEntity.PhysicalEntity.Platform.GroundVehicle"
#define ATTR1 L"HLAprivilegeToDeleteObject"
#define ATTR2 L"EntityType"
#define ATTR3 L"Spatial"
#define ATTR4 L"ForceIdentifier"
#define ATTR5 L"Marking"


class CreateAmbassador : public NullFederateAmbassador
{
public:

    RTIambassador *rtiAmb;

    CreateAmbassador(RTIambassador *r) : rtiAmb(r) {}
    ~CreateAmbassador() throw () {} 

    // 7.11
    virtual void requestAttributeOwnershipRelease (
	ObjectInstanceHandle theObject,
	AttributeHandleSet const & candidateAttributes,
	VariableLengthData const & theUserSuppliedTag)
	throw (
            FederateInternalError)
    {
	// Print it
	wcout << "got request for object " << theObject << endl;
	wcout << "  with attributes ";
	AttributeHandleSet::iterator ii;
	for (ii=candidateAttributes.begin(); 
	     ii!=candidateAttributes.end();
	     ++ii)
	{
	    wcout << L" " << *ii;
	}
	wcout << endl << endl;

	// And give it away
	AttributeHandleSet givenAttributes;
	rtiAmb->attributeOwnershipDivestitureIfWanted(theObject, 
						      candidateAttributes,
						      givenAttributes);

	wcout << "gave away object " << theObject << endl;
	wcout << "  attributes ";
	AttributeHandleSet::iterator jj;
	for (jj=givenAttributes.begin(); 
	     jj!=givenAttributes.end();
	     ++jj)
	{
	    wcout << L" " << *jj;
	}
	wcout << endl << endl;
    }
   

};


int main(int argc, char **argv)
{
    setenv("RTI_RID_FILE", "AFMSTT.rid", 0);

    // Connect, create, and join a federation
    RTIambassadorFactory factory;
    RTIambassador *rtiAmb = factory.createRTIambassador().release();
    CreateAmbassador *fedAmb = new CreateAmbassador(rtiAmb);

    try {
	rtiAmb->connect(*fedAmb, HLA_EVOKED);
    } catch (Exception &e) {
	wcerr << e << endl;
	exit(-1);
    }

    try {
	rtiAmb->createFederationExecution(L"Ownzor",
					  L"FederateConfig.txt");
    } catch (FederationExecutionAlreadyExists &e) {
    } catch (Exception &e) {
	wcerr << e << endl;
	exit(-1);
    }

    try {
	rtiAmb->joinFederationExecution(L"Creator",
					L"Ownzor");
    } catch (Exception &e) {
	wcerr << e << endl;
	exit(-1);
    }

    unsigned i;

    try {

	ObjectClassHandle objclass = rtiAmb->getObjectClassHandle(CLASS);
	AttributeHandle attr1 = rtiAmb->getAttributeHandle(objclass, ATTR1);
	AttributeHandle attr2 = rtiAmb->getAttributeHandle(objclass, ATTR2);
	AttributeHandle attr3 = rtiAmb->getAttributeHandle(objclass, ATTR3);
	AttributeHandle attr4 = rtiAmb->getAttributeHandle(objclass, ATTR4);
	AttributeHandle attr5 = rtiAmb->getAttributeHandle(objclass, ATTR5);

	// Publish
	AttributeHandleSet attrs;
	attrs.insert(attr2);
	attrs.insert(attr3);
	attrs.insert(attr4);
	attrs.insert(attr5);
	rtiAmb->publishObjectClassAttributes(objclass, attrs);

	// Tick for a little bit to let the subscriptions get happy
	rtiAmb->evokeMultipleCallbacks(10, 10);

	// Now create for a while
	for (i=0; i<NUM_OBJECTS; i++)
	{
	    ObjectInstanceHandle curObj =
	      rtiAmb->registerObjectInstance(objclass);

	    // Set up some fake attrs to send out
	    const char *fake = "This is fake.  This is fake.  This is fake.";
	    VariableLengthData v2(fake, 6);
	    VariableLengthData v3(fake, 44);
	    VariableLengthData v4(fake, 1);
	    VariableLengthData v5(fake, 22);
	    
	    AttributeHandleValueMap values;
	    values[attr2] = v2;
	    values[attr3] = v3;
	    values[attr4] = v4;
	    values[attr5] = v5;

	    VariableLengthData tag("12345678", 9);

	    // Update it once
	    rtiAmb->updateAttributeValues(curObj, values, tag);

	    wcout << "created object " << curObj << endl;

	    // Tick a bit every so often
	    if ((i % 10) == 0)
	    {
		rtiAmb->evokeMultipleCallbacks(0.1, 0.1);
	    }

	    // And do that again.
	}

    } catch (Exception &e) {
	wcout << e << endl;
	exit(-1);
    }

    try {
	rtiAmb->resignFederationExecution(DELETE_OBJECTS_THEN_DIVEST);
    } catch (Exception &e) {
	wcout << e << endl;
	exit(-1);
    }

    try {
	rtiAmb->destroyFederationExecution(L"Ownzor");
    } catch (FederatesCurrentlyJoined &e){
    } catch (Exception &e) {
	wcout << e << endl;
	exit(-1);
    }
    
    try {
	rtiAmb->disconnect();
    } catch (Exception &e) {
	wcout << e << endl;
	exit(-1);
    } 
    
    exit(0);

}
    

