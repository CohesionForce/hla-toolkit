package com.cohesionforce.hla.dsl.generator

import com.cohesionforce.hla.dsl.fom.Fed;
import org.eclipse.xtext.generator.IFileSystemAccess2
import com.cohesionforce.hla.dsl.fom.AttributeClass

class KafkaScriptGenerator {
	
	/**
	 * Generates an Avro Schema file for an InteractionClass.
	 */
	def generateTopicScript(Fed fed, IFileSystemAccess2 fsa) {
		
		fsa.generateFile(
			"scripts/create-topics.sh", '''
			#!/bin/bash
			«FOR attributeClass: fed.classes.filter(AttributeClass)»
			${KAFKA_HOME}/bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic «attributeClass.ref.name.strip»
			«FOR subClass: attributeClass.classes.filter(AttributeClass)»
				«subClass.generateTopicLines»
			«ENDFOR»
			«ENDFOR»
			''')
	}
	
	def CharSequence generateTopicLines(AttributeClass attributeClass) { '''
			${KAFKA_HOME}/bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic «attributeClass.ref.name.strip»
			«FOR subClass: attributeClass.classes.filter(AttributeClass)»
				«subClass.generateTopicLines»
			«ENDFOR»
	'''}
	
	def String strip(String string) {
		return string.replace("\"","")
	}
	
	
}