/*
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.ui.labeling

import com.cohesionforce.hla.dsl.fom.AttributeClass
import com.cohesionforce.hla.dsl.fom.InteractionClass
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import com.cohesionforce.hla.dsl.fom.Attribute
import com.cohesionforce.hla.dsl.fom.Parameter

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class FomLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	def text(AttributeClass attributeClass) {
		'[Class] ' +
			if(attributeClass.ref !== null )
				attributeClass.ref.representation
			else 'Undefined'
	}
	
	def text(Attribute attribute) {
		'[Attribute] ' +
			if(attribute.ref !== null) 
				attribute.ref.representation
			else 'Undefined'
	}
	
	// Labels and icons can be computed like this:
	def text(InteractionClass interactionClass) {
		'[Interaction] ' +
			if(interactionClass.ref !== null )
				interactionClass.ref.name
			else 'Undefined'
	}
	
	def text(Parameter param) {
		'[Parameter] ' +
			if(param.ref !== null) 
				param.ref.name
			else 'Undefined'
	}
	
	def representation(com.cohesionforce.hla.dsl.omt.Attribute attribute) {
		if(attribute.name !== null)
			attribute.name.strip
		else 'Unresolved'
	}
	
	def representation(com.cohesionforce.hla.dsl.omt.AttributeClass attributeClass) {
		if(attributeClass.name !== null)
			attributeClass.name.strip
		else 'Unresolved'
	}
	
	override protected handleTextError(Object[] params, Throwable e) {
		println(e.message)
		super.handleTextError(params, e)
	}
	
	def strip(String string) {
		string.replace("\"", "")
	}
}
