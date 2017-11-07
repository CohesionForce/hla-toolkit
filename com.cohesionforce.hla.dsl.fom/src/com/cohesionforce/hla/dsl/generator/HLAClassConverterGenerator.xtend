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
			
			public class HLAClassConverter {
				
				«FOR attributeClass: objectModel.omtComponents.filter(ComplexDataType)»
				«attributeClass.generateReader»
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
	
	def String strip(String string) {
		return string.replace("\"","")
	}
	
}