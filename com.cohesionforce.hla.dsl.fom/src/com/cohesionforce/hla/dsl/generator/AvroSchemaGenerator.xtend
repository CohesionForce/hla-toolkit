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

import com.cohesionforce.hla.dsl.omt.Attribute
import com.cohesionforce.hla.dsl.omt.AttributeClass
import com.cohesionforce.hla.dsl.omt.ClassId
import com.cohesionforce.hla.dsl.omt.ComplexComponent
import com.cohesionforce.hla.dsl.omt.ComplexDataType
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType
import com.cohesionforce.hla.dsl.omt.Interaction
import com.cohesionforce.hla.dsl.omt.InteractionId
import com.cohesionforce.hla.dsl.omt.Parameter
import com.cohesionforce.hla.dsl.omt.SuperClass
import com.cohesionforce.hla.dsl.omt.SuperInteraction
import com.cohesionforce.hla.dsl.omt.TypeReference
import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import com.cohesionforce.hla.dsl.omt.ObjectModel

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AvroSchemaGenerator {

	// List of Classes already visited for a given parent Class.
	var List<ComplexDataType> dataTypes = new ArrayList()
	var List<EnumeratedDataType> enumTypes = new ArrayList()
	var List<Attribute> attributes = new ArrayList()

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

	def generateSchema(ObjectModel objectModel, IFileSystemAccess2 fsa) {
		objectModel.omtComponents.filter(Interaction).forEach[generateSchema(it, fsa)]
		objectModel.omtComponents.filter(AttributeClass).forEach[generateSchema(it, fsa)]
		objectModel.omtComponents.filter(ComplexDataType).forEach[generateSchema(it, fsa)]
		objectModel.omtComponents.filter(EnumeratedDataType).forEach[generateSchema(it, fsa)]
	}
	
	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateSchema(Interaction interaction, IFileSystemAccess2 fsa) {

		dataTypes.clear
		enumTypes.clear
		fsa.generateFile(
			"com/cohesionforce/hla/schema/interactions/" + interaction.name.replace("\"", "") + ".avsc", '''
				{"type":"record","name":«interaction.name»,"namespace":"com.cohesionforce.hla.interactions.avro","fields":[
					«FOR parameter : interaction.components SEPARATOR ","»
						«parameter.generateReference»
					«ENDFOR»
				]}
			''')
	}

	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateSchema(EnumeratedDataType enumeratedType, IFileSystemAccess2 fsa) {
		dataTypes.clear
		enumTypes.clear
		fsa.generateFile(
			"com/cohesionforce/hla/schema/enumerations/" + enumeratedType.name.replace("\"", "") + ".avsc", '''
			{"type":"enum","name":«enumeratedType.name»,"namespace":"com.cohesionforce.hla.enumerations.avro","symbols":[«FOR eLiteral : enumeratedType.literals SEPARATOR ","»«eLiteral.literal.sanitizeLiteral»«ENDFOR»]}
			''')
	}

	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateSchema(ComplexDataType dataType, IFileSystemAccess2 fsa) {

		dataTypes.clear
		enumTypes.clear
		dataTypes.add(dataType)
		
		fsa.generateFile(
			"com/cohesionforce/hla/schema/classes/" + dataType.name.strip + ".avsc", '''
				{"type":"record","name":«dataType.name»,"namespace":"com.cohesionforce.hla.classes.avro","fields":[
					«FOR component : dataType.components SEPARATOR ","»
						«component.generateReference»
					«ENDFOR»
				]}
			''')
	}

	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateSchema(AttributeClass attributeClass, IFileSystemAccess2 fsa) {

		dataTypes.clear
		enumTypes.clear
		attributes.clear
		
		attributeClass.buildAttributeList
		
		fsa.generateFile(
			"com/cohesionforce/hla/schema/classes/" + attributeClass.name.replace("\"", "") + ".avsc", '''
				{"type":"record","name":«attributeClass.name»,"namespace":"com.cohesionforce.hla.classes.avro","fields":[
					«FOR attribute : attributes SEPARATOR ","»
						«attribute.generateReference»
					«ENDFOR»
				]}
			''')
	}
	
	def void buildAttributeList(AttributeClass attributeClass)
	{
		attributeClass.components.filter(SuperClass).forEach[it.super.handleSuper]
		attributeClass.components.filter(Attribute).forEach[attributes.add(it)]
	}
	

	def dispatch CharSequence generateReference(SuperInteraction superInteraction) {
		superInteraction.super.handleSuper
	}

	def CharSequence handleSuper(InteractionId id) { '''
		«IF (id.eContainer as Interaction).components.filter(Parameter).size > 0»
		«FOR attribute:  (id.eContainer as Interaction).components SEPARATOR ","»
			«attribute.generateReference»
		«ENDFOR»,
		«ENDIF»
		'''
	}

	def void handleSuper(ClassId id) {
		(id.eContainer as AttributeClass).components.filter(SuperClass).forEach[it.super.handleSuper]
		(id.eContainer as AttributeClass).components.filter(Attribute).forEach[attributes.add(it)]
	}
	
	/**
	 * Generates a schema property based on an EReference.  Either creates a new
	 * record type, or references an existing record type.
	 */
	def dispatch CharSequence generateReference(Parameter parameter) {
		'''
			«IF parameter.dataType.refType !== null»
				«IF parameter.dataType.refType instanceof ComplexDataType»
					«IF addType(parameter.dataType.refType as ComplexDataType)»
						{"name":«parameter.name»,"type":["null",«parameter.dataType.refType.generateRecord»]}
					«ELSE»
						{"name":«parameter.name»,"type":["null",«parameter.dataType.refType.getName»]}
					«ENDIF»
				«ELSEIF parameter.dataType.refType instanceof EnumeratedDataType»
					«IF addEnum(parameter.dataType.refType as EnumeratedDataType)»
						{"name":«parameter.name»,"type":["null",«parameter.dataType.refType.generateRecord»]}
					«ELSE»
						{"name":«parameter.name»,"type":["null","com.cohesionforce.hla.enumerations.avro.«parameter.dataType.refType.getName.strip»"]}
					«ENDIF»
				«ENDIF»
			«ELSE»
				{"name":«parameter.name»,"type":["null","«parameter.dataType.dataType.printAvroType»"]}
			«ENDIF»
		'''
	}

	/**
	 * Generates a schema property based on an EReference.  Either creates a new
	 * record type, or references an existing record type.
	 */
	def dispatch CharSequence generateReference(Attribute attribute) {
		'''
			«IF attribute.dataType.refType !== null»
				«IF attribute.dataType.refType instanceof ComplexDataType»
					«IF addType(attribute.dataType.refType as ComplexDataType)»
						{"name":«attribute.name»,"type":["null",«attribute.dataType.refType.generateRecord»]}
					«ELSE»
						{"name":«attribute.name»,"type":["null",«attribute.dataType.refType.getName»]}
					«ENDIF»
				«ELSEIF attribute.dataType.refType instanceof EnumeratedDataType»
					«IF addEnum(attribute.dataType.refType as EnumeratedDataType)»
						{"name":«attribute.name»,"type":["null",«attribute.dataType.refType.generateRecord»]}
					«ELSE»
						{"name":«attribute.name»,"type":["null","com.cohesionforce.hla.enumerations.avro.«attribute.dataType.refType.getName.strip»"]}
					«ENDIF»
				«ENDIF»
			«ELSE»
				{"name":«attribute.name»,"type":["null","«attribute.dataType.dataType.printAvroType»"]}
			«ENDIF»
		'''
	}

	/**
	 * Generates a schema property based on an EReference.  Either creates a new
	 * record type, or references an existing record type.
	 */
	def dispatch CharSequence generateReference(ComplexComponent component) {
		'''
			«IF component.dataType.refType !== null»
				«IF component.dataType.refType instanceof ComplexDataType»
					«IF addType(component.dataType.refType as ComplexDataType)»
						{"name":«component.fieldName.name»,"type":["null",«component.dataType.refType.generateRecord»]}
					«ELSE»
						{"name":«component.fieldName.name»,"type":["null",«component.dataType.refType.getName»]}
					«ENDIF»
				«ELSEIF component.dataType.refType instanceof EnumeratedDataType»
					«IF addEnum(component.dataType.refType as EnumeratedDataType)»
						{"name":«component.fieldName.name»,"type":["null",«component.dataType.refType.generateRecord»]}
					«ELSE»
						{"name":«component.fieldName.name»,"type":["null",«component.dataType.refType.getName»]}
					«ENDIF»
				«ENDIF»
			«ELSE»
				{"name":«component.fieldName.name»,"type":["null","«component.dataType.dataType.printAvroType»"]}
			«ENDIF»
		'''
	}

	def getName(TypeReference typeRef) {
		if (typeRef instanceof ComplexDataType) {
			return (typeRef as ComplexDataType).name
		} else if (typeRef instanceof EnumeratedDataType) {
			return (typeRef as EnumeratedDataType).name
		}
	}

	/**
	 * Generates a new record type based on an EClass
	 */
	def generateRecord(TypeReference typeRef) {
		'''
			«IF typeRef instanceof ComplexDataType»
				{"type":"record","name":«typeRef.getName»,"fields":[
					«FOR component : (typeRef as ComplexDataType).components SEPARATOR ","»
						«component.generateReference»
					«ENDFOR»]}
			«ELSEIF typeRef instanceof EnumeratedDataType»
				«(typeRef as EnumeratedDataType).generateEnum»
			«ENDIF»
		'''
	}

	/**
	 * Generates a schema property based on an EEnum.  Either creates a new
	 * enumeration type, or references an existing enumeration type.
	 */
	def generateEnum(EnumeratedDataType eEnum) {
		'''
			{"type":"enum","name":«eEnum.name»,"namespace":"com.cohesionforce.hla.enumerations.avro","symbols":[«FOR eLiteral : eEnum.literals SEPARATOR ","»«eLiteral.literal.sanitizeLiteral»«ENDFOR»]}
		'''
	}

	/**
	 * Returns the avro type for a given type.
	 */
	def printAvroType(String type) {

		switch type.replace("\"", "") {
			case "unsigned short": return "int"
			case "short": return "int"
			case "unsigned long": return "int"
			case "long": return "int"
			case "unsigned long long": return "long"
			case "long long": return "long"
			case "double": return "double"
			case "float": return "float"
			case "boolean": return "boolean"
			
			case "string": return "string"
			case "char": return "int"
			case "octet": return "int"
			
			default: return type
		}
	}

	/**
	 * Returns the avro type for a given type.
	 */
	def sanitizeLiteral(String type) {
		return type.replace("-", "_").replace("<","_LT_").replace(">","_GT_").replace("&","_AND_").replace("/","_")
	}

	def String strip(String string) {
		return string.replace("\"","")
	}

}
