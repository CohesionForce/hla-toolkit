package com.cohesionforce.hla.dsl.generator

import com.cohesionforce.hla.dsl.omt.ComplexDataType
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType
import com.cohesionforce.hla.dsl.omt.ObjectModel
import org.eclipse.xtext.generator.IFileSystemAccess2

class HLAClassConverterGenerator {
	
	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateClass(ObjectModel objectModel, IFileSystemAccess2 fsa) {
		
		fsa.generateFile(
			"com/cohesionforce/hla/classes/HLAClassConverter.java", '''		
			package com.cohesionforce.hla.classes;
			
			import com.cohesionforce.hla.classes.avro.*;
			import com.cohesionforce.hla.enumerations.avro.*;
			import hla.rti.jlc.EncodingHelpers;
			
			public class HLAClassConverter {
				
				«FOR attributeClass: objectModel.omtComponents.filter(ComplexDataType)»
				«attributeClass.generateFiller»
				«ENDFOR»
				«FOR attributeClass: objectModel.omtComponents.filter(EnumeratedDataType)»
				«attributeClass.generateFiller»
				«ENDFOR»
			}
			''')
	}
	

	def dispatch CharSequence generateFiller(EnumeratedDataType dataType) { '''
		public static int fill«dataType.name.strip»(byte[] bytes, «dataType.name.strip» avro, int offset) {
			int value = 0;
			value = EncodingHelpers.decodeInt(bytes, offset);
			switch(value) {
				«FOR literal: dataType.literals»
				case «literal.value»: 
					avro = «dataType.name.strip».«literal.literal.literalValue»;
					break;
				«ENDFOR»
			}
			return 4;
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
						String «component.fieldName.name.strip»String = EncodingHelpers.decodeString(bytes, offset + bytesRead); 
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
		if(string.length == 1) {
			return string.toUpperCase
		}
		return string.replace("\"","").replace("_","").toFirstUpper
	}

	def String literalValue(String string) {
		return string.replace("\"","").replace("-","_").replace("\\","_").replace("/","_").
			replace(">","_GT_").replace("<","_LT_").replace("&","_AND_");
	}

}