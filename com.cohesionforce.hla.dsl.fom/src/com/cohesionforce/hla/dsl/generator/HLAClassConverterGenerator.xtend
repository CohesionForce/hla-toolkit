package com.cohesionforce.hla.dsl.generator

import com.cohesionforce.hla.dsl.omt.Attribute
import com.cohesionforce.hla.dsl.omt.ComplexDataType
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType
import com.cohesionforce.hla.dsl.omt.ObjectModel
import org.eclipse.xtext.generator.IFileSystemAccess2
import com.cohesionforce.hla.dsl.omt.AttributeClass

class HLAClassConverterGenerator {
	
	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateClass(ObjectModel objectModel, IFileSystemAccess2 fsa) {
		
		fsa.generateFile(
			"com/cohesionforce/hla/classes/HLAClassConverter.java", '''		
			package com.cohesionforce.hla.classes;
			
			import com.cohesionforce.hla.classes.avro.*;
			
			public class HLAClassConverter {
				
				«FOR attributeClass: objectModel.omtComponents.filter(ComplexDataType)»
				«attributeClass.generateReader»
				«ENDFOR»
			}
			''')
	}
	
	def CharSequence generateReader(ComplexDataType dataType) { '''
		«IF dataType instanceof EnumeratedDataType»
		public static «(dataType as EnumeratedDataType).name.strip» read«(dataType as EnumeratedDataType).name.strip»(byte[] bytes, int offset) {
		}
		«ELSEIF dataType instanceof ComplexDataType»
		public static «(dataType as ComplexDataType).name.strip» read«(dataType as ComplexDataType).name.strip»(byte[] bytes, int offset) {
		}
		«ENDIF»
	'''
	}
	
	def String strip(String string) {
		return string.replace("\"","")
	}
	
}