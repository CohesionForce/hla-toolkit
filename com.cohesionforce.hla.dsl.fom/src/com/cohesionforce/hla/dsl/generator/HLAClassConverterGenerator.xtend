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
«««				«attributeClass.generateReader»
				«attributeClass.generateFiller»
				«ENDFOR»
				«FOR attributeClass: objectModel.omtComponents.filter(EnumeratedDataType)»
				«attributeClass.generateReader»
				«ENDFOR»
			}
			''')
	}
	

	def dispatch CharSequence generateReader(EnumeratedDataType dataType) { '''
		public static «dataType.name.strip» read«dataType.name.strip»(byte[] bytes, int offset) {
			«dataType.name.strip» avroReturn = «dataType.name.strip».values()[0];
			return avroReturn;
		}
	'''
	}

	def dispatch CharSequence generateReader(ComplexDataType dataType) { '''
		public static «dataType.name.strip» read«dataType.name.strip»(byte[] bytes, int offset) {
			«dataType.name.strip» avroReturn = new «dataType.name.strip»();
			return avroReturn;
		}
	'''
	}
	
	def CharSequence generateFiller(ComplexDataType dataType) { '''
		public static int fill«dataType.name.strip»(byte[] bytes, «dataType.name.strip» avro, int offset) {
			int bytesRead = 0;
			«FOR component: dataType.components»
				«IF component.dataType.refType !== null»
					«IF component.dataType.refType instanceof EnumeratedDataType»
						//TODO: How do we handle enumerations?
						bytesRead += 1;
					«ELSE»
						«(component.dataType.refType as ComplexDataType).name.strip» «component.fieldName.name.strip»Avro = new «(component.dataType.refType as ComplexDataType).name.strip»();
						bytesRead += HLAClassConverter.fill«(component.dataType.refType as ComplexDataType).name.strip»(bytes, «component.fieldName.name.strip»Avro, offset + bytesRead);
						avro.set«component.fieldName.name.strip.toFirstUpper»(«component.fieldName.name.strip»Avro);
					«ENDIF»
				«ELSE»
					«IF component.dataType.dataType.strip == "unsigned short"»
						//TODO: How do we handle this type? "unsigned short"
						bytesRead += 4;
					«ELSEIF component.dataType.dataType.strip == "short"»
						avro.set«component.fieldName.name.strip.toFirstUpper»(EncodingHelpers.decodeShort(bytes, offset + bytesRead));
						bytesRead += 2;
					«ELSEIF component.dataType.dataType.strip == "unsigned long"»
						//TODO: How do we handle this type? "unsigned long"
						bytesRead += 8;
					«ELSEIF component.dataType.dataType.strip == "long"»
						avro.set«component.fieldName.name.strip.toFirstUpper»(EncodingHelpers.decodeLong(bytes, offset + bytesRead));
						bytesRead += 8;
					«ELSEIF component.dataType.dataType.strip == "unsigned long long"»
						//TODO: How do we handle this type? "unsigned long long"
						bytesRead += 16;
					«ELSEIF component.dataType.dataType.strip == "long long"»
						//TODO: How do we handle this type? "long long"
						bytesRead += 16;
					«ELSEIF component.dataType.dataType.strip == "double"»
						avro.set«component.fieldName.name.strip.toFirstUpper»(EncodingHelpers.decodeDouble(bytes, offset + bytesRead));
						bytesRead += 8;
					«ELSEIF component.dataType.dataType.strip == "float"»
						avro.set«component.fieldName.name.strip.toFirstUpper»(EncodingHelpers.decodeFloat(bytes, offset + bytesRead));
						bytesRead += 4;
					«ELSEIF component.dataType.dataType.strip == "boolean"»
						avro.set«component.fieldName.name.strip.toFirstUpper»(EncodingHelpers.decodeBoolean(bytes, offset + bytesRead));
						bytesRead += 1;
					«ELSEIF component.dataType.dataType.strip == "any"»
						//TODO: How do we handle this type? "any"
					«ELSEIF component.dataType.dataType.strip == "string"»
						String «component.fieldName.name.strip»String = EncodingHelpers.decodeString(bytes, offset + bytesRead); 
						avro.set«component.fieldName.name.strip.toFirstUpper»(«component.fieldName.name.strip»String);
						bytesRead += «component.fieldName.name.strip»String.length();
					«ELSEIF component.dataType.dataType.strip == "char"»
						avro.set«component.fieldName.name.strip.toFirstUpper»(EncodingHelpers.decodeChar(bytes, offset + bytesRead));
						bytesRead += 1;
					«ELSEIF component.dataType.dataType.strip == "octet"»
						avro.set«component.fieldName.name.strip.toFirstUpper»(Integer.valueOf(EncodingHelpers.decodeByte(bytes, offset + bytesRead)));
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
	
}