package com.cohesionforce.hla.dsl.generator

import com.cohesionforce.hla.dsl.fom.AttributeClass
import com.cohesionforce.hla.dsl.omt.Attribute
import com.cohesionforce.hla.dsl.omt.ComplexDataType
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType
import com.cohesionforce.hla.dsl.omt.TypeReference
import org.eclipse.xtext.generator.IFileSystemAccess2
import com.cohesionforce.hla.dsl.fom.InteractionClass
import com.cohesionforce.hla.dsl.omt.Parameter

class HLAInteractionGenerator {
	
	var attributeSet = "";
	
	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateClass(InteractionClass interactionClass, IFileSystemAccess2 fsa) {
		
		attributeSet = interactionClass.ref.name.strip.toFirstLower + "Attributes"
		
		fsa.generateFile(
			"com/cohesionforce/hla/interactions/" + interactionClass.ref.name.strip + "Class.java", '''		
			package com.cohesionforce.hla.interactions;
			
			import com.cohesionforce.hla.AvroWrapper;
			import com.cohesionforce.hla.HLAClassConverter;
			import com.cohesionforce.hla.interactions.avro.*;
			import com.cohesionforce.hla.enumerations.avro.*;
			
			import hla.rti.ArrayIndexOutOfBounds;
			import hla.rti.AttributeNotKnown;
			import hla.rti.FederateInternalError;
			import hla.rti.LogicalTime;
			import hla.rti.RTIambassador;
			import hla.rti.RTIexception;
			import hla.rti.ReflectedAttributes;
			import hla.rti.jlc.EncodingHelpers;
			import hla.rti.jlc.RtiFactory;
			
			public class «interactionClass.ref.name.strip»Class extends AvroWrapper<«interactionClass.ref.name.strip»> {

				// Attribute Handles
				«interactionClass.generateAttrDefinitions»
				
				public int init(RtiFactory factory, RTIambassador rtiamb) throws RTIexception {
					className = "«interactionClass.getClassName»";
					classHandle = rtiamb.getObjectClassHandle(className);
					attrHandleSet = factory.createAttributeHandleSet();
					
					«interactionClass.generateInitAttributes»
					
					rtiamb.subscribeObjectClassAttributes(classHandle, attrHandleSet);
					rtiamb.publishObjectClass(classHandle, attrHandleSet);
		
					return classHandle;
				}
			
				public «interactionClass.ref.name.strip» reflect(final ReflectedAttributes attrs, final LogicalTime time, long receiveTime)
						throws AttributeNotKnown, FederateInternalError {
							
					«interactionClass.ref.name.strip» avroReturn = new «interactionClass.ref.name.strip»();
					final int num_attrs = attrs.size();
					
					try {
						for (int attr = 0; attr < num_attrs; ++attr) {
							final int handle = attrs.getAttributeHandle(attr);
							«interactionClass.generateReflectAttributes»
							throw new AttributeNotKnown("handle is " + handle);
						}
					} catch (final ArrayIndexOutOfBounds ex) {
						throw new FederateInternalError(ex.toString());
					}
					double timeValue = ((rtis13.LogicalTimeDouble) time).value_;
					avroReturn.setSimTime(timeValue);
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
						if (handle == «parameter.ref.name.strip.toFirstLower»Attr) {
						«IF parameter.ref.dataType.refType !== null»
							«IF parameter.ref.dataType.refType instanceof EnumeratedDataType»
							«(parameter.ref.dataType.refType as EnumeratedDataType).name.strip» temp = «(parameter.ref.dataType.refType as EnumeratedDataType).name.strip».values()[0];
								HLAClassConverter.fill«(parameter.ref.dataType.refType as EnumeratedDataType).name.strip»(attrs.getValue(attr), temp, 0);
								avroReturn.set«parameter.ref.name.strip»(temp);
								continue;
							«ELSE»
							«(parameter.ref.dataType.refType as ComplexDataType).name.strip» temp = new «(parameter.ref.dataType.refType as ComplexDataType).name.strip»(); 
								HLAClassConverter.fill«(parameter.ref.dataType.refType as ComplexDataType).name.strip»(attrs.getValue(attr), temp, 0);
								avroReturn.set«parameter.ref.name.strip»(temp);
								continue;
							«ENDIF»
						«ELSE»
							«IF parameter.ref.dataType.dataType.strip == "unsigned short"»
								avroReturn.set«parameter.ref.name.strip»(Integer.valueOf(EncodingHelpers.decodeShort(attrs.getValue(attr))));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "short"»
								avroReturn.set«parameter.ref.name.strip»(Integer.valueOf(EncodingHelpers.decodeShort(attrs.getValue(attr))));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "unsigned long"»
								avroReturn.set«parameter.ref.name.strip»(EncodingHelpers.decodeInt(attrs.getValue(attr)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "long"»
								avroReturn.set«parameter.ref.name.strip»(EncodingHelpers.decodeInt(attrs.getValue(attr)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "unsigned long long"»
								avroReturn.set«parameter.ref.name.strip»(EncodingHelpers.decodeLong(attrs.getValue(attr)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "long long"»
								avroReturn.set«parameter.ref.name.strip»(EncodingHelpers.decodeLong(attrs.getValue(attr)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "double"»
								avroReturn.set«parameter.ref.name.strip»(EncodingHelpers.decodeDouble(attrs.getValue(attr)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "float"»
								avroReturn.set«parameter.ref.name.strip»(EncodingHelpers.decodeFloat(attrs.getValue(attr)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "boolean"»
								avroReturn.set«parameter.ref.name.strip»(EncodingHelpers.decodeBoolean(attrs.getValue(attr)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "any"»
								//TODO: How do we handle this type? "any"
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "string"»
								avroReturn.set«parameter.ref.name.strip»(EncodingHelpers.decodeString(attrs.getValue(attr)));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "char"»
								avroReturn.set«parameter.ref.name.strip»(Integer.valueOf(EncodingHelpers.decodeChar(attrs.getValue(attr))));
								continue;
							«ELSEIF parameter.ref.dataType.dataType.strip == "octet"»
								avroReturn.set«parameter.ref.name.strip»(Integer.valueOf(EncodingHelpers.decodeByte(attrs.getValue(attr))));
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
			private int «parameter.ref.name.strip.toFirstLower»Attr;
		«ENDFOR»
	'''}
	
	def CharSequence generateInitAttributes(InteractionClass interactionClass) {'''
		«IF interactionClass.eContainer instanceof InteractionClass»
			«(interactionClass.eContainer as InteractionClass).generateInitAttributes»
		«ENDIF»
		«FOR parameter: interactionClass.parameters»
			«parameter.ref.name.strip.toFirstLower»Attr = rtiamb.getAttributeHandle("«parameter.ref.name.strip»", classHandle);
			attrHandleSet.add(«parameter.ref.name.strip.toFirstLower»Attr);
		«ENDFOR»
	'''
	}
	
	def CharSequence getClassName(InteractionClass attributeClass) {
		var name = attributeClass.ref.name.strip
		var classRef = attributeClass.eContainer
		while(classRef instanceof AttributeClass) {
			name = classRef.ref.name.strip+"."+name
			classRef = (classRef as AttributeClass).eContainer
		}
		
		return name
	}
	
	def String strip(String string) {
		return string.replace("\"","")
	}
	
	def dispatch CharSequence getImports(com.cohesionforce.hla.dsl.omt.Interaction interactionClass) { '''
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
			import com.cohesionforce.hla.classes.avro.«(typeRef as ComplexDataType).name.strip»;
		«ELSE»
			import com.cohesionforce.hla.classes.avro.«(typeRef as EnumeratedDataType).name.strip»;
		«ENDIF»
	'''}
	
}