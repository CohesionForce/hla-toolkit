package com.cohesionforce.hla.dsl.conversion

import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException

class OMTConverter extends DefaultTerminalConverters {
	
	@ValueConverter(rule = "Description")
    public IValueConverter<String> Description() => IValueConverter<String> converter 
		override toValue(String string, String lexerRule, INode node) throws ValueConverterException {
			string.replace("\\","")
		}
	
}