/*
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl

import com.cohesionforce.hla.dsl.naming.QualifiedNameProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class FomRuntimeModule extends AbstractFomRuntimeModule {
	
		override bindIQualifiedNameProvider() {
			return QualifiedNameProvider
		}
}
