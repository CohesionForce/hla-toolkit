
#include <RTI/RTI1516.h>
#include <RTI/NullFederateAmbassador.h>
#include <iostream>
#include <time.h>
#include <cstdlib>

using namespace rti1516e;
using namespace std;


#define CLASS L"BaseEntity.PhysicalEntity.Platform.GroundVehicle"
#define ATTR1 L"HLAprivilegeToDeleteObject"
#define ATTR2 L"EntityType"
#define ATTR3 L"Spatial"
#define ATTR4 L"ForceIdentifier"
#define ATTR5 L"Marking"

static AttributeHandleSet askingAttrs;


class GrabAmbassador : public NullFederateAmbassador
{
public:

    RTIambassador *rtiAmb;
    set<ObjectInstanceHandle> objs;
    time_t tt;

    GrabAmbassador(RTIambassador *r) : rtiAmb(r) {}
    ~GrabAmbassador() throw () {} 
    
    
    virtual void discoverObjectInstance (
	ObjectInstanceHandle theObject,
	ObjectClassHandle theObjectClass,
	std::wstring const & theObjectInstanceName)
	throw (
            FederateInternalError)
    {
	// Print it
	wcout << "discovered object " << theObject << endl;
	objs.insert(theObject);
    }

    virtual void discoverObjectInstance (
	ObjectInstanceHandle theObject,
	ObjectClassHandle theObjectClass,
	std::wstring const & theObjectInstanceName,
	FederateHandle producingFederate)
	throw (
            FederateInternalError)
    {
	// Print it
	wcout << "discovered object " << theObject << endl;
	objs.insert(theObject);
    }


    void pull()
    {
	set<ObjectInstanceHandle>::iterator oo;
	for (oo=objs.begin(); oo!=objs.end(); ++oo)
	{
	    // Print it
	    wcout << "requesting object " << *oo << endl;
	    wcout << "  with attributes ";
	    AttributeHandleSet::iterator ii;
	    for (ii=askingAttrs.begin(); 
		 ii!=askingAttrs.end();
		 ++ii)
	    {
		wcout << L" " << *ii;
	    }
	    wcout << endl << endl;
	    
	    // And ask for it
	    rtiAmb->attributeOwnershipAcquisition(*oo, askingAttrs,
						  VariableLengthData());
	}
	objs.clear();
    }

    // 7.7
    virtual void attributeOwnershipAcquisitionNotification (
	ObjectInstanceHandle theObject,
	AttributeHandleSet const & securedAttributes,
	VariableLengthData const & theUserSuppliedTag)
	throw (
            FederateInternalError)
    {
	// Print it
	wcout << "acquired object " << theObject << endl;
	wcout << "  with attributes ";
	AttributeHandleSet::iterator ii;
	for (ii=securedAttributes.begin(); 
	     ii!=securedAttributes.end();
	     ++ii)
	{
	    wcout << L" " << *ii;
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
    GrabAmbassador *fedAmb = new GrabAmbassador(rtiAmb);

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
	rtiAmb->joinFederationExecution(L"Grabber",
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

	// Subscribe
	AttributeHandleSet attrs;
	attrs.insert(attr2);
	attrs.insert(attr3);
	attrs.insert(attr4);
	attrs.insert(attr5);
	rtiAmb->subscribeObjectClassAttributes(objclass, attrs);
	rtiAmb->publishObjectClassAttributes(objclass, attrs);

	askingAttrs.insert(attr1);
	askingAttrs.insert(attr2);
	askingAttrs.insert(attr3);
//	askingAttrs.insert(attr4);
//	askingAttrs.insert(attr5);

	// Now, tick forever, and see what we get.
	while (1)
	{
	    rtiAmb->evokeMultipleCallbacks(0, 1);
	    fedAmb->pull();
	}
    } catch (Exception &e) {
	wcout << e << endl;
	exit(-1);
    }

    // NOTREACHED
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
    

