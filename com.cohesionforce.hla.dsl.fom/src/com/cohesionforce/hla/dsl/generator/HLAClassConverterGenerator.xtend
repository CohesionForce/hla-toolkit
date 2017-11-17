package com.cohesionforce.hla.dsl.generator

import com.cohesionforce.hla.dsl.omt.ComplexDataType
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType
import com.cohesionforce.hla.dsl.omt.ObjectModel
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.apache.commons.lang.WordUtils

class HLAClassConverterGenerator {
	
	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateClass(ObjectModel objectModel, IFileSystemAccess2 fsa) {
		
		generateTemplateClass(fsa)
		
		fsa.generateFile(
			"com/cohesionforce/hla/HLAClassConverter.java", '''		
			package com.cohesionforce.hla;
			
			import com.cohesionforce.hla.classes.avro.*;
			import com.cohesionforce.hla.enumerations.avro.*;
			import hla.rti.jlc.EncodingHelpers;
			
			import java.util.Arrays;
			
			public class HLAClassConverter {
				
				public static String readString(byte[] bytes, int offset) {
					int strlen = -1;
					for(int i = offset; i < bytes.length; i++) {
						if(bytes[i] == '\0') {
							strlen = offset + i;
							break;
						}
					}
					if(strlen >=0) {
						return new String(Arrays.copyOfRange(bytes, offset, offset+strlen));
					}
					return new String(Arrays.copyOfRange(bytes, offset, bytes.length - offset));
				}
				
				«FOR attributeClass: objectModel.omtComponents.filter(ComplexDataType)»
				«attributeClass.generateFiller»
				«ENDFOR»
				«FOR attributeClass: objectModel.omtComponents.filter(EnumeratedDataType)»
				«attributeClass.generateFiller»
				«ENDFOR»
			}
			''')
	}
	
	def generateTemplateClass(IFileSystemAccess2 fsa) {
		fsa.generateFile(
			"com/cohesionforce/hla/AvroWrapper.java", '''
				package com.cohesionforce.hla;
				
				import hla.rti.AttributeNotKnown;
				import hla.rti.FederateInternalError;
				import hla.rti.LogicalTime;
				import hla.rti.RTIambassador;
				import hla.rti.RTIexception;
				import hla.rti.ReflectedAttributes;
				import hla.rti.jlc.RtiFactory;
				
				public abstract class AvroWrapper<T> {
					public abstract int init(RtiFactory factory, RTIambassador rtiamb) throws RTIexception;
					public abstract T reflect(final ReflectedAttributes attrs, final LogicalTime time)
							throws AttributeNotKnown, FederateInternalError;
					protected int classHandle;
					protected hla.rti.AttributeHandleSet attrHandleSet;
					protected String className;
					
					public int getClassHandle() {
						return classHandle;
					}
					
					public String getClassName() {
						return className;
					}
				}
			''')
	}
	

	def dispatch CharSequence generateFiller(EnumeratedDataType dataType) { '''
		public static int fill«dataType.name.strip»(byte[] bytes, «dataType.name.strip» avro, int offset) {
			«IF dataType.name.strip.endsWith("8")»
			int value = EncodingHelpers.decodeByte(bytes, offset);
			int count = 1;
			«ELSEIF dataType.name.strip.endsWith("16")»
			int value = EncodingHelpers.decodeShort(bytes, offset);
			int count = 2;
			«ELSE»
			int value = EncodingHelpers.decodeInt(bytes, offset);
			int count = 4;
			«ENDIF»
			switch(value) {
				«FOR literal: dataType.literals»
				case «literal.value»: 
					avro = «dataType.name.strip».«literal.literal.literalValue»;
					break;
				«ENDFOR»
			}
			return count;
		}
	'''
	}

	def dispatch CharSequence generateFiller(ComplexDataType dataType) { '''
		public static int fill«dataType.name.strip»(byte[] bytes, «dataType.name.strip» avro, int offset) {
			int bytesRead = 0;
			«FOR component: dataType.components»
				«IF component.dataType.refType !== null»
					«IF component.dataType.refType instanceof EnumeratedDataType»
						«(component.dataType.refType as EnumeratedDataType).name.strip» «component.fieldName.name.strip»Avro = «(component.dataType.refType as EnumeratedDataType).name.strip».values()[0];
						bytesRead += HLAClassConverter.fill«(component.dataType.refType as EnumeratedDataType).name.strip»(bytes, «component.fieldName.name.strip»Avro, offset + bytesRead);
						avro.set«component.fieldName.name.methodName»(«component.fieldName.name.strip»Avro);
					«ELSE»
						«(component.dataType.refType as ComplexDataType).name.strip» «component.fieldName.name.strip»Avro = new «(component.dataType.refType as ComplexDataType).name.strip»();
						bytesRead += HLAClassConverter.fill«(component.dataType.refType as ComplexDataType).name.strip»(bytes, «component.fieldName.name.strip»Avro, offset + bytesRead);
						avro.set«component.fieldName.name.methodName»(«component.fieldName.name.strip»Avro);
					«ENDIF»
				«ELSE»
					«IF component.dataType.dataType.strip == "unsigned short"»
						avro.set«component.fieldName.name.methodName»(Integer.valueOf(EncodingHelpers.decodeShort(bytes, offset + bytesRead)));
						bytesRead += 2;
					«ELSEIF component.dataType.dataType.strip == "short"»
						avro.set«component.fieldName.name.methodName»(Integer.valueOf(EncodingHelpers.decodeShort(bytes, offset + bytesRead)));
						bytesRead += 2;
					«ELSEIF component.dataType.dataType.strip == "unsigned long"»
						avro.set«component.fieldName.name.methodName»(EncodingHelpers.decodeInt(bytes, offset + bytesRead));
						bytesRead += 4;
					«ELSEIF component.dataType.dataType.strip == "long"»
						avro.set«component.fieldName.name.methodName»(EncodingHelpers.decodeInt(bytes, offset + bytesRead));
						bytesRead += 4;
					«ELSEIF component.dataType.dataType.strip == "unsigned long long"»
						avro.set«component.fieldName.name.methodName»(EncodingHelpers.decodeLong(bytes, offset + bytesRead));
						bytesRead += 8;
					«ELSEIF component.dataType.dataType.strip == "long long"»
						avro.set«component.fieldName.name.methodName»(EncodingHelpers.decodeLong(bytes, offset + bytesRead));
						bytesRead += 8;
					«ELSEIF component.dataType.dataType.strip == "double"»
						avro.set«component.fieldName.name.methodName»(EncodingHelpers.decodeDouble(bytes, offset + bytesRead));
						bytesRead += 8;
					«ELSEIF component.dataType.dataType.strip == "float"»
						avro.set«component.fieldName.name.methodName»(EncodingHelpers.decodeFloat(bytes, offset + bytesRead));
						bytesRead += 4;
					«ELSEIF component.dataType.dataType.strip == "boolean"»
						avro.set«component.fieldName.name.methodName»(EncodingHelpers.decodeBoolean(bytes, offset + bytesRead));
						bytesRead += 1;
					«ELSEIF component.dataType.dataType.strip == "any"»
						//TODO: How do we handle this type? "any"
					«ELSEIF component.dataType.dataType.strip == "string"»
						String «component.fieldName.name.strip»String = readString(bytes, offset + bytesRead); 
						avro.set«component.fieldName.name.methodName»(«component.fieldName.name.strip»String);
						bytesRead += «component.fieldName.name.strip»String.length();
					«ELSEIF component.dataType.dataType.strip == "char"»
						avro.set«component.fieldName.name.methodName»(Integer.valueOf(EncodingHelpers.decodeChar(bytes, offset + bytesRead)));
						bytesRead += 1;
					«ELSEIF component.dataType.dataType.strip == "octet"»
						avro.set«component.fieldName.name.methodName»(Integer.valueOf(EncodingHelpers.decodeByte(bytes, offset + bytesRead)));
						bytesRead += 1;
					«ELSE»
						//TODO Handle type «component.dataType.dataType»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			return bytesRead;
		}
	'''
	}
	
	def String strip(String string) {
		return string.replace("\"","")
	}
	
	def String methodName(String string) {
		// Convert from _ to camel case
		var test = string.strip
		if(test.contains("_")) {
			test = WordUtils.capitalizeFully(test, "_".toCharArray)
		}
		test = test.replace("_","")
		test = test.toFirstUpper
   		return test
	}

	def String literalValue(String string) {
		return string.replace("\"","").replace("-","_").replace("\\","_").replace("/","_").
			replace(">","_GT_").replace("<","_LT_").replace("&","_AND_");
	}

}