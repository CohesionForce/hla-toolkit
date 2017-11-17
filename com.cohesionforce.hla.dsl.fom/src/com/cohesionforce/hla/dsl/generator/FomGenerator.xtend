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

import com.cohesionforce.hla.dsl.fom.AttributeClass
import com.cohesionforce.hla.dsl.omt.ObjectModel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.cohesionforce.hla.dsl.fom.Fed

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FomGenerator extends AbstractGenerator {

	HLAClassGenerator classGenerator = new HLAClassGenerator
	HLAClassMapGenerator mapGenerator = new HLAClassMapGenerator
	HLAClassConverterGenerator converterGenerator = new HLAClassConverterGenerator
	AvroSchemaGenerator schemaGenerator = new AvroSchemaGenerator
	KafkaScriptGenerator scriptGenerator = new KafkaScriptGenerator

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.filter(Fed).forEach [scriptGenerator.generateTopicScript(it, fsa)]
		resource.allContents.filter(AttributeClass).forEach [
			{
				classGenerator.generateClass(it, fsa)
			}
		]
		mapGenerator.generateMap(resource, fsa)
		resource.resourceSet.allContents.filter(ObjectModel).forEach[ {
			schemaGenerator.generateSchema(it, fsa)
			converterGenerator.generateClass(it, fsa)
		}]
	}
}
