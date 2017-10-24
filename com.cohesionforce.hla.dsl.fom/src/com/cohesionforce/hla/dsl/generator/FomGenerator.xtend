/*******************************************************************************
 * Copyright (c) 2015 CohesionForce, Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     CohesionForce, Inc - initial API and implementation
 *******************************************************************************/
package com.cohesionforce.hla.dsl.generator

import com.cohesionforce.hla.dsl.fom.InteractionClass
import com.cohesionforce.hla.dsl.omt.ComplexDataType
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType
import com.cohesionforce.hla.dsl.omt.Parameter
import com.cohesionforce.hla.dsl.omt.TypeReference
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.cohesionforce.hla.dsl.omt.ComplexComponent

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FomGenerator extends AbstractGenerator {

	// List of Classes already visited for a given parent Class.
	var List<ComplexDataType> dataTypes = new ArrayList()
	var List<EnumeratedDataType> enumTypes = new ArrayList()
	
	/**
	 * Adds a class to the list of visited classes and returns
	 * true if the class did NOT exist in the list.
	 */
	def boolean addType(ComplexDataType type) {
		if (dataTypes.contains(type)) {
			return false
		}
		dataTypes.add(type)
		return true
	}

	/**
	 * Adds a class to the list of visited classes and returns
	 * true if the class did NOT exist in the list.
	 */
	def boolean addEnum(EnumeratedDataType type) {
		if (enumTypes.contains(type)) {
			return false
		}
		enumTypes.add(type)
		return true
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents
				.filter(InteractionClass).forEach[generateSchema(it, fsa)]
	}
	
		/**
	 * Generates an Avro Schema file for an EClass.
	 */
	def generateSchema(InteractionClass interaction, IFileSystemAccess2 fsa) {

		dataTypes.clear
		enumTypes.clear
		fsa.generateFile("com/cohesionforce/hla/schema/"+interaction.ref.name+".avsc", '''
		{"type":"record","name":"«interaction.ref.name»","namespace":"com.cohesionforce.hla.avro","fields":[
			«FOR parameter : interaction.ref.components.filter(Parameter) SEPARATOR ","»
				«parameter.generateReference»
			«ENDFOR»
		]}
		''')
	}
	
	/**
	 * Generates a schema property based on an EReference.  Either creates a new
	 * record type, or references an existing record type.
	 */
	def CharSequence generateReference(Parameter parameter) {'''
		«IF parameter.dataType.refType !== null»
			«IF parameter.dataType.refType instanceof ComplexDataType»
				«IF addType(parameter.dataType.refType as ComplexDataType)»
					{"name":"«parameter.name»","type":["null",«parameter.dataType.refType.generateRecord»]}
				«ELSE»
					{"name":"«parameter.name»","type":["null","«parameter.dataType.refType.getName»"]}
				«ENDIF»
			«ELSEIF parameter.dataType.refType instanceof EnumeratedDataType»
				«IF addEnum(parameter.dataType.refType as EnumeratedDataType)»
					{"name":"«parameter.name»","type":["null",«parameter.dataType.refType.generateRecord»]}
				«ELSE»
					{"name":"«parameter.name»","type":["null","«parameter.dataType.refType.getName»"]}
				«ENDIF»
			«ENDIF»
		«ELSE»
					{"name":"«parameter.name»","type":["null","«parameter.dataType.dataType»"]}
		«ENDIF»
	'''}
	
	/**
	 * Generates a schema property based on an EReference.  Either creates a new
	 * record type, or references an existing record type.
	 */
	def CharSequence generateReference(ComplexComponent component) {'''
		«IF component.dataType.refType !== null»
			«IF component.dataType.refType instanceof ComplexDataType»
				«IF addType(component.dataType.refType as ComplexDataType)»
					{"name":«component.fieldName.name»,"type":["null",«component.dataType.refType.generateRecord»]}
				«ELSE»
					{"name":«component.fieldName.name»,"type":["null","«component.dataType.refType.getName»"]}
				«ENDIF»
			«ELSEIF component.dataType.refType instanceof EnumeratedDataType»
				«IF addEnum(component.dataType.refType as EnumeratedDataType)»
					{"name":"«component.fieldName.name»","type":["null",«component.dataType.refType.generateRecord»]}
				«ELSE»
					{"name":"«component.fieldName.name»","type":["null","«component.dataType.refType.getName»"]}
				«ENDIF»
			«ENDIF»
		«ELSE»
					{"name":«component.fieldName.name»,"type":["null","«component.dataType.dataType»"]}
		«ENDIF»
	'''}

	def getName(TypeReference typeRef) {
		if(typeRef instanceof ComplexDataType) {
			return (typeRef as ComplexDataType).name
		} else if(typeRef instanceof EnumeratedDataType)
		{
			return (typeRef as EnumeratedDataType).name
		}
	}
	
		/**
	 * Generates a new record type based on an EClass
	 */
	def generateRecord(TypeReference typeRef) {'''
		«IF typeRef instanceof ComplexDataType»
		{"type":"record","name":"«typeRef.getName»","fields":[
			«FOR component : (typeRef as ComplexDataType).components SEPARATOR ","»
				«component.generateReference»
			«ENDFOR»]}
		«ELSEIF typeRef instanceof EnumeratedDataType»
			«(typeRef as EnumeratedDataType).generateEnum»
		«ENDIF»
	'''}
	
		/**
	 * Generates a schema property based on an EEnum.  Either creates a new
	 * enumeration type, or references an existing enumeration type.
	 */
	def generateEnum(EnumeratedDataType eEnum) {'''
		{"type":"enum","name":"«eEnum.name»","symbols":[«FOR eLiteral: eEnum.literals SEPARATOR ","»"«eLiteral.literal»"«ENDFOR»]}
	'''}
	
}
