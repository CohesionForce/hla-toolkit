/*
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.parser.antlr;

import com.cohesionforce.hla.dsl.parser.antlr.internal.InternalFomParser;
import com.cohesionforce.hla.dsl.services.FomGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class FomParser extends AbstractAntlrParser {

	@Inject
	private FomGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_COMMENT");
	}
	

	@Override
	protected InternalFomParser createParser(XtextTokenStream stream) {
		return new InternalFomParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Fed";
	}

	public FomGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FomGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
