/*
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FomAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/cohesionforce/hla/dsl/parser/antlr/internal/InternalFom.tokens");
	}
}
