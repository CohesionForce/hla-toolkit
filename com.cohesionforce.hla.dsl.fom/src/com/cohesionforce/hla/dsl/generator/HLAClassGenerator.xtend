package com.cohesionforce.hla.dsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import com.cohesionforce.hla.dsl.fom.AttributeClass
import com.cohesionforce.hla.dsl.fom.Attribute
import com.cohesionforce.hla.dsl.omt.TypeReference
import com.cohesionforce.hla.dsl.omt.ComplexDataType
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType

class HLAClassGenerator {
	
	var attributeSet = "";
	
	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateClass(AttributeClass attributeClass, IFileSystemAccess2 fsa) {
		
		attributeSet = attributeClass.ref.name.replace("\"", "").toFirstLower + "Attributes"
		
		fsa.generateFile(
			"com/cohesionforce/hla/classes/" + attributeClass.ref.name.replace("\"", "") + "Class.java", '''		
			package com.cohesionforce.hla.classes;
			
			«attributeClass.ref.getImports»
			
			import hla.rti.ArrayIndexOutOfBounds;
			import hla.rti.AttributeNotKnown;
			import hla.rti.FederateInternalError;
			import hla.rti.LogicalTime;
			import hla.rti.RTIambassador;
			import hla.rti.RTIexception;
			import hla.rti.ReflectedAttributes;
			import hla.rti.jlc.EncodingHelpers;
			import hla.rti.jlc.RtiFactory;
			
			public class «attributeClass.ref.name.replace("\"", "")»Class {
				private final static String className = "«attributeClass.getClassName»"
				private static hla.rti.AttributeHandleSet «attributeSet»;
				private static int classHandle;

				// Attribute Handles
				«attributeClass.generateAttrDefinitions»
				
				public static int init(RtiFactory factory, RTIambassador rtiamb) throws RTIexception {
					classHandle = rtiamb.getObjectClassHandle(className);
					«attributeSet» = factory.createAttributeHandleSet();
					
					«attributeClass.generateInitAttributes»
					
					return classHandle;
				}
			
				public static «attributeClass.ref.name.replace("\"", "")» reflect(final ReflectedAttributes attrs, final LogicalTime time)
						throws AttributeNotKnown, FederateInternalError {
							
					«attributeClass.ref.name.replace("\"", "")» avroReturn = new «attributeClass.ref.name.replace("\"", "")»();
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
					return «attributeClass.ref.name.replace("\"", "").toFirstLower»;
				}
			}			
			''')
	}
	
	def CharSequence generateReflectAttributes(AttributeClass attributeClass) { '''
		«IF attributeClass.eContainer instanceof AttributeClass»
			«(attributeClass.eContainer as AttributeClass).generateReflectAttributes»
		«ENDIF»
		«FOR attribute: attributeClass.attributes»
«««						if (handle == «attribute.getRef().name.toFirstLower»Attr) {
							PositionVectorCDT temp = PositionVectorCDTClass.readPosition(attrs.getValue(attr), 0);
							avroReturn.set«attribute.name»(temp);
							continue;
						}
		«ENDFOR»
	'''}
	
	def CharSequence generateAttrDefinitions(AttributeClass attributeClass) { '''
		«IF attributeClass.eContainer instanceof AttributeClass»
			«(attributeClass.eContainer as AttributeClass).generateAttrDefinitions»
		«ENDIF»
		«FOR attribute: attributeClass.attributes»
			private static int «attribute.ref.name.toFirstLower»Attr;
		«ENDFOR»
	'''}
	
	def CharSequence generateInitAttributes(AttributeClass attributeClass) {'''
		«IF attributeClass.eContainer instanceof AttributeClass»
			«(attributeClass.eContainer as AttributeClass).generateInitAttributes»
		«ENDIF»
		«FOR attribute: attributeClass.attributes»
«««			«attribute.name.toFirstLower»Attr = rtiamb.getAttributeHandle("«attribute.name»", classHandle);
«««			«attributeSet».add(«attribute.name.toFirstLower»Attr);
		«ENDFOR»
	'''
	}
	
	def CharSequence getClassName(AttributeClass attributeClass) {
		var name = attributeClass.ref.name.replace("\"","")
		var classRef = attributeClass.eContainer
		while(classRef instanceof AttributeClass) {
			name = classRef.ref.name.replace("\"","")+"."+name
			classRef = (classRef as AttributeClass).eContainer
		}
		
		return name
	}
	
	def dispatch CharSequence getImports(com.cohesionforce.hla.dsl.omt.AttributeClass attributeClass) { '''
		import com.cohesionforce.hla.classes.avro.«attributeClass.name.replace("\"","")»;
		«FOR attribute: attributeClass.components.filter(com.cohesionforce.hla.dsl.omt.Attribute)»
		«IF attribute.dataType.refType !== null»
			«attribute.dataType.refType.getImports»
		«ENDIF»
	«ENDFOR»
	'''
	}
	
	def dispatch CharSequence getImports(TypeReference typeRef) { '''
		«IF typeRef instanceof ComplexDataType»
			import com.cohesionforce.hla.classes.avro.«(typeRef as ComplexDataType).name.replace("\"","")»;
		«ELSE»
			import com.cohesionforce.hla.classes.avro.«(typeRef as EnumeratedDataType).name.replace("\"","")»;
		«ENDIF»
	'''}
	
}