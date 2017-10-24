/*
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.scoping

import com.cohesionforce.hla.dsl.omd.OmdPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import com.cohesionforce.hla.dsl.omd.SuperInteraction
import org.eclipse.xtext.EcoreUtil2
import com.cohesionforce.hla.dsl.omd.InteractionId
import com.cohesionforce.hla.dsl.omd.SuperClass
import com.cohesionforce.hla.dsl.omd.ClassId
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class OmdScopeProvider extends AbstractOmdScopeProvider {

	override getScope(EObject context, EReference reference) {
		if(context instanceof SuperInteraction && reference == OmdPackage.Literals.SUPER_INTERACTION__SUPER)
		{
	        val rootElement = EcoreUtil2.getRootContainer(context)
	        val candidates = EcoreUtil2.getAllContentsOfType(rootElement, InteractionId)
	        // Create IEObjectDescriptions and puts them into an IScope instance
	        return Scopes.scopeFor(candidates)
		} else if(context instanceof SuperClass && reference == OmdPackage.Literals.SUPER_CLASS__SUPER)
		{
	        val rootElement = EcoreUtil2.getRootContainer(context)
	        val candidates = EcoreUtil2.getAllContentsOfType(rootElement, ClassId)
	        // Create IEObjectDescriptions and puts them into an IScope instance
	        return Scopes.scopeFor(candidates)
		}
	    return super.getScope(context, reference);
	}

}
