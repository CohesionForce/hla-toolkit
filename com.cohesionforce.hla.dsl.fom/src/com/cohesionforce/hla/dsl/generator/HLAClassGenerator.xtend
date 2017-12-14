package com.cohesionforce.hla.dsl.generator

import com.cohesionforce.hla.dsl.fom.AttributeClass
import com.cohesionforce.hla.dsl.omt.Attribute
import com.cohesionforce.hla.dsl.omt.ComplexDataType
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType
import com.cohesionforce.hla.dsl.omt.TypeReference
import org.eclipse.xtext.generator.IFileSystemAccess2

class HLAClassGenerator {
	
	var attributeSet = "";
	
	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateClass(AttributeClass attributeClass, IFileSystemAccess2 fsa) {
		
		attributeSet = attributeClass.ref.name.strip.toFirstLower + "Attributes"
		
		fsa.generateFile(
			"com/cohesionforce/hla/classes/" + attributeClass.ref.name.strip + "Class.java", '''		
			package com.cohesionforce.hla.classes;
			
			import com.cohesionforce.hla.AvroClassWrapper;
			import com.cohesionforce.hla.HLAClassConverter;
			import com.cohesionforce.hla.classes.avro.*;
			import com.cohesionforce.hla.enumerations.avro.*;
			import com.cohesionforce.hla.types.avro.*;
			
			import hla.rti.ArrayIndexOutOfBounds;
			import hla.rti.AttributeNotKnown;
			import hla.rti.FederateInternalError;
			import hla.rti.LogicalTime;
			import hla.rti.RTIambassador;
			import hla.rti.RTIexception;
			import hla.rti.ReflectedAttributes;
			import hla.rti.jlc.EncodingHelpers;
			import hla.rti.jlc.RtiFactory;
			
			public class «attributeClass.ref.name.strip»Class extends AvroClassWrapper<«attributeClass.ref.name.strip»> {

				// Attribute Handles
				«attributeClass.generateAttrDefinitions»
				
				public int init(RtiFactory factory, RTIambassador rtiamb) throws RTIexception {
					className = "«attributeClass.getClassName»";
					classHandle = rtiamb.getObjectClassHandle(className);
					attrHandleSet = factory.createAttributeHandleSet();
					
					«attributeClass.generateInitAttributes»
					
					rtiamb.subscribeObjectClassAttributes(classHandle, attrHandleSet);
					rtiamb.publishObjectClass(classHandle, attrHandleSet);
		
					return classHandle;
				}
			
				public «attributeClass.ref.name.strip» reflect(final ReflectedAttributes attrs, final LogicalTime time, long receiveTime)
						throws AttributeNotKnown, FederateInternalError {
							
					«attributeClass.ref.name.strip» avroReturn = new «attributeClass.ref.name.strip»();
					final int num_attrs = attrs.size();
					
					try {
						for (int attr = 0; attr < num_attrs; ++attr) {
							final int handle = attrs.getAttributeHandle(attr);
							«attributeClass.generateReflectAttributes»
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
	
	def CharSequence generateReflectAttributes(AttributeClass attributeClass) { '''
		«IF attributeClass.eContainer instanceof AttributeClass»
			«(attributeClass.eContainer as AttributeClass).generateReflectAttributes»
		«ENDIF»
		«FOR attribute: attributeClass.attributes»
						if (handle == «attribute.ref.name.strip.toFirstLower»Attr) {
						«IF attribute.ref.dataType.refType !== null»
							«IF attribute.ref.dataType.refType instanceof EnumeratedDataType»
								«(attribute.ref.dataType.refType as EnumeratedDataType).name.strip» temp = HLAClassConverter.get«(attribute.ref.dataType.refType as EnumeratedDataType).name.strip»(attrs.getValue(attr), 0);
								avroReturn.set«attribute.ref.name.strip»(temp);
								continue;
							«ELSE»
							«(attribute.ref.dataType.refType as ComplexDataType).name.strip» temp = new «(attribute.ref.dataType.refType as ComplexDataType).name.strip»(); 
								HLAClassConverter.fill«(attribute.ref.dataType.refType as ComplexDataType).name.strip»(attrs.getValue(attr), temp, 0);
								avroReturn.set«attribute.ref.name.strip»(temp);
								continue;
							«ENDIF»
						«ELSE»
							«IF attribute.ref.dataType.dataType.strip == "unsigned short"»
								avroReturn.set«attribute.ref.name.strip»(Integer.valueOf(EncodingHelpers.decodeShort(attrs.getValue(attr))));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "short"»
								avroReturn.set«attribute.ref.name.strip»(Integer.valueOf(EncodingHelpers.decodeShort(attrs.getValue(attr))));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "unsigned long"»
								avroReturn.set«attribute.ref.name.strip»(EncodingHelpers.decodeInt(attrs.getValue(attr)));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "long"»
								avroReturn.set«attribute.ref.name.strip»(EncodingHelpers.decodeInt(attrs.getValue(attr)));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "unsigned long long"»
								avroReturn.set«attribute.ref.name.strip»(EncodingHelpers.decodeLong(attrs.getValue(attr)));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "long long"»
								avroReturn.set«attribute.ref.name.strip»(EncodingHelpers.decodeLong(attrs.getValue(attr)));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "double"»
								avroReturn.set«attribute.ref.name.strip»(EncodingHelpers.decodeDouble(attrs.getValue(attr)));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "float"»
								avroReturn.set«attribute.ref.name.strip»(EncodingHelpers.decodeFloat(attrs.getValue(attr)));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "boolean"»
								avroReturn.set«attribute.ref.name.strip»(EncodingHelpers.decodeBoolean(attrs.getValue(attr)));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "any"»
								//TODO: How do we handle this type? "any"
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "string"»
								avroReturn.set«attribute.ref.name.strip»(EncodingHelpers.decodeString(attrs.getValue(attr)));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "char"»
								avroReturn.set«attribute.ref.name.strip»(Integer.valueOf(EncodingHelpers.decodeChar(attrs.getValue(attr))));
								continue;
							«ELSEIF attribute.ref.dataType.dataType.strip == "octet"»
								avroReturn.set«attribute.ref.name.strip»(Integer.valueOf(EncodingHelpers.decodeByte(attrs.getValue(attr))));
								continue;
							«ELSE»
								//TODO Handle type «attribute.ref.dataType.dataType»
								continue;
							«ENDIF»
						«ENDIF»
						}
		«ENDFOR»
	'''}
	
	def CharSequence generateAttrDefinitions(AttributeClass attributeClass) { '''
		«IF attributeClass.eContainer instanceof AttributeClass»
			«(attributeClass.eContainer as AttributeClass).generateAttrDefinitions»
		«ENDIF»
		«FOR attribute: attributeClass.attributes»
			private int «attribute.ref.name.strip.toFirstLower»Attr;
		«ENDFOR»
	'''}
	
	def CharSequence generateInitAttributes(AttributeClass attributeClass) {'''
		«IF attributeClass.eContainer instanceof AttributeClass»
			«(attributeClass.eContainer as AttributeClass).generateInitAttributes»
		«ENDIF»
		«FOR attribute: attributeClass.attributes»
			«attribute.ref.name.strip.toFirstLower»Attr = rtiamb.getAttributeHandle("«attribute.ref.name.strip»", classHandle);
			attrHandleSet.add(«attribute.ref.name.strip.toFirstLower»Attr);
		«ENDFOR»
	'''
	}
	
	def CharSequence getClassName(AttributeClass attributeClass) {
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
	
	def dispatch CharSequence getImports(com.cohesionforce.hla.dsl.omt.AttributeClass attributeClass) { '''
		import com.cohesionforce.hla.classes.avro.«attributeClass.name.strip»;
		«FOR attribute: attributeClass.components.filter(Attribute)»
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