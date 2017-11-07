package com.cohesionforce.hla.dsl.naming

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import com.cohesionforce.hla.dsl.omt.Attribute

class QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	def QualifiedName qualifiedName(Attribute attribute) {
		var name = QualifiedName.create(attribute.name.replace("\"",""))
		return name
	}
	
}