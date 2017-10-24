package com.cohesionforce.hla.dsl.naming

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import com.cohesionforce.hla.dsl.omt.AttributeClass
import org.eclipse.xtext.naming.QualifiedName
import com.cohesionforce.hla.dsl.omt.Interaction

class QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	def QualifiedName qualifiedName(AttributeClass clazz) {
		var name = QualifiedName.create(clazz.name)
		return name
	}
	
	def QualifiedName qualifiedName(Interaction interaction) {
		var name = QualifiedName.create(interaction.name)
		return name
	}
}