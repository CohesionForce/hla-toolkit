package com.cohesionforce.hla.dsl.generator

import com.cohesionforce.hla.dsl.fom.AttributeClass
import com.cohesionforce.hla.dsl.fom.InteractionClass
import com.cohesionforce.hla.dsl.omt.ComplexDataType
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType
import com.cohesionforce.hla.dsl.omt.Interaction
import com.cohesionforce.hla.dsl.omt.Parameter
import com.cohesionforce.hla.dsl.omt.TypeReference
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.apache.commons.lang.WordUtils

class HLAInteractionGenerator {
	
	var attributeSet = "";
	
	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateClass(InteractionClass interactionClass, IFileSystemAccess2 fsa) {
		
		attributeSet = interactionClass.ref.name.strip.toFirstLower + "Attributes"
		
		fsa.generateFile(
			"com/cohesionforce/hla/interactions/" + interactionClass.ref.name.strip + "Interaction.java", '''		
			package com.cohesionforce.hla.interactions;
			
			import com.cohesionforce.hla.AvroInteractionWrapper;
			import com.cohesionforce.hla.HLAClassConverter;
			import com.cohesionforce.hla.interactions.avro.*;
			import com.cohesionforce.hla.enumerations.avro.*;
			import com.cohesionforce.hla.types.avro.*;
			
			import hla.rti.ArrayIndexOutOfBounds;
			import hla.rti.AttributeNotKnown;
			import hla.rti.FederateInternalError;
			import hla.rti.InteractionParameterNotKnown;
			import hla.rti.ReceivedInteraction;
			import hla.rti.RTIambassador;
			import hla.rti.RTIexception;
			import hla.rti.ReflectedAttributes;
			import hla.rti.jlc.EncodingHelpers;
			import hla.rti.jlc.RtiFactory;
			
			public class «interactionClass.ref.name.strip»Interaction extends AvroInteractionWrapper<«interactionClass.ref.name.strip»> {

				// Attribute Handles
				«interactionClass.generateAttrDefinitions»
				
				public int init(RTIambassador rtiamb) throws RTIexception {
					interactionName = "«interactionClass.getClassName»";
					interactionHandle = rtiamb.getInteractionClassHandle(interactionName);
					
					«interactionClass.generateInitAttributes»
					
					rtiamb.subscribeInteractionClass(interactionHandle);
					rtiamb.publishInteractionClass(interactionHandle);
		
					return interactionHandle;
				}
			
				public «interactionClass.ref.name.strip» receive(final ReceivedInteraction theInteraction,
							final byte[] userSuppliedTag, long receiveTime) throws FederateInternalError, InteractionParameterNotKnown {
							
					«interactionClass.ref.name.strip» avroReturn = new «interactionClass.ref.name.strip»();
					final int num_params = theInteraction.size();
					
					try {
						for (int param = 0; param < num_params; ++param) {
							final int handle = theInteraction.getParameterHandle(param);
							«interactionClass.generateReflectAttributes»
							throw new InteractionParameterNotKnown("handle is " + handle);
						}
					} catch (final ArrayIndexOutOfBounds ex) {
						throw new FederateInternalError(ex.toString());
					}
					avroReturn.setReceiveTime(receiveTime);
					return avroReturn;
				}
				
			}
			''')
	}
	
	def CharSequence generateReflectAttributes(InteractionClass interactionClass) { '''
		«IF interactionClass.eContainer instanceof InteractionClass»
			«(interactionClass.eContainer as InteractionClass).generateReflectAttributes»
		«ENDIF»
		«FOR parameter: interactionClass.parameters»
						if (handle == «parameter.ref.name.strip.toFirstLower»Param) {
						«IF parameter.ref.dataType.refType !== null»
							«IF parameter.ref.dataType.refType instanceof EnumeratedDataType»
							«(parameter.ref.dataType.refType as EnumeratedDataType).name.strip» temp = «(parameter.ref.dataType.refType as EnumeratedDataType).name.strip».values()[0];
								HLAClassConverter.fill«(parameter.ref.dataType.refType as EnumeratedDataType).name.strip»(theInteraction.getValue(param), temp, 0);
								avroReturn.set«parameter.ref.name.methodName»(temp);
								continue;
							«ELSE»
							«(parameter.ref.dataType.refType as ComplexDataType).name.strip» temp = new «(parameter.ref.dataType.refType as ComplexDataType).name.strip»(); 
								HLAClassConverter.fill«(parameter.ref.dataType.refType as ComplexDataType).name.strip»(theInteraction.getValue(param), temp, 0);
								avroReturn.set«parameter.ref.name.methodName»(temp);
								continue;
							«ENDIF»
						«ELSE»
							«IF parameter.ref.dataType.dataType.strip == "unsigned short"»
								avroReturn.set«parameter.ref.name.methodName»(Integer.valueOf(EncodingHelpers.decodeShort(theInteraction.getValue(param))));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "short"»
								avroReturn.set«parameter.ref.name.methodName»(Integer.valueOf(EncodingHelpers.decodeShort(theInteraction.getValue(param))));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "unsigned long"»
								avroReturn.set«parameter.ref.name.methodName»(EncodingHelpers.decodeInt(theInteraction.getValue(param)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "long"»
								avroReturn.set«parameter.ref.name.methodName»(EncodingHelpers.decodeInt(theInteraction.getValue(param)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "unsigned long long"»
								avroReturn.set«parameter.ref.name.methodName»(EncodingHelpers.decodeLong(theInteraction.getValue(param)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "long long"»
								avroReturn.set«parameter.ref.name.methodName»(EncodingHelpers.decodeLong(theInteraction.getValue(param)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "double"»
								avroReturn.set«parameter.ref.name.methodName»(EncodingHelpers.decodeDouble(theInteraction.getValue(param)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "float"»
								avroReturn.set«parameter.ref.name.methodName»(EncodingHelpers.decodeFloat(theInteraction.getValue(param)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "boolean"»
								avroReturn.set«parameter.ref.name.methodName»(EncodingHelpers.decodeBoolean(theInteraction.getValue(param)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "any"»
								//TODO: How do we handle this type? "any"
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "string"»
								avroReturn.set«parameter.ref.name.methodName»(EncodingHelpers.decodeString(theInteraction.getValue(param)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "char"»
								avroReturn.set«parameter.ref.name.methodName»(Integer.valueOf(EncodingHelpers.decodeChar(theInteraction.getValue(param))));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "octet"»
								avroReturn.set«parameter.ref.name.methodName»(Integer.valueOf(EncodingHelpers.decodeByte(theInteraction.getValue(param))));
								continue;
							«ELSE»
								//TODO Handle type «parameter.ref.dataType.dataType»
								continue;
							«ENDIF»
						«ENDIF»
						}
		«ENDFOR»
	'''}
	
	def CharSequence generateAttrDefinitions(InteractionClass interactionClass) { '''
		«IF interactionClass.eContainer instanceof InteractionClass»
			«(interactionClass.eContainer as InteractionClass).generateAttrDefinitions»
		«ENDIF»
		«FOR parameter: interactionClass.parameters»
			private int «parameter.ref.name.strip.toFirstLower»Param;
		«ENDFOR»
	'''}
	
	def CharSequence generateInitAttributes(InteractionClass interactionClass) {'''
		«IF interactionClass.eContainer instanceof InteractionClass»
			«(interactionClass.eContainer as InteractionClass).generateInitAttributes»
		«ENDIF»
		«FOR parameter: interactionClass.parameters»
			«parameter.ref.name.strip.toFirstLower»Param = rtiamb.getParameterHandle("«parameter.ref.name.strip»", interactionHandle);
		«ENDFOR»
	'''
	}
	
	def CharSequence getClassName(InteractionClass interactionClass) {
		var name = interactionClass.ref.name.strip
		var classRef = interactionClass.eContainer
		while(classRef instanceof InteractionClass) {
			name = classRef.ref.name.strip+"."+name
			classRef = (classRef as InteractionClass).eContainer
		}
		
		return name
	}
	
	def String strip(String string) {
		return string.replace("\"","")
	}
	
	def dispatch CharSequence getImports(Interaction interactionClass) { '''
		import com.cohesionforce.hla.interactions.avro.«interactionClass.name.strip»;
		«FOR attribute: interactionClass.components.filter(Parameter)»
		«IF attribute.dataType.refType !== null»
			«attribute.dataType.refType.getImports»
		«ENDIF»
	«ENDFOR»
	'''
	}
	
	def dispatch CharSequence getImports(TypeReference typeRef) { '''
		«IF typeRef instanceof ComplexDataType»
			import com.cohesionforce.hla.interactions.avro.«(typeRef as ComplexDataType).name.strip»;
		«ELSE»
			import com.cohesionforce.hla.enumerations.avro.«(typeRef as EnumeratedDataType).name.strip»;
		«ENDIF»
	'''}
	
	def String methodName(String string) {
		// Convert from _ to camel case
		var test = string.strip
		if(test.contains("_")) {
			test = WordUtils.capitalize(test, "_".toCharArray)
		}
		test = test.replace("_","")
		test = test.toFirstUpper
   		return test
	}
	
}