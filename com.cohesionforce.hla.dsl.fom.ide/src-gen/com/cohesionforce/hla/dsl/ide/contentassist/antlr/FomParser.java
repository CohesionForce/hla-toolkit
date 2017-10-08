/*
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.ide.contentassist.antlr;

import com.cohesionforce.hla.dsl.ide.contentassist.antlr.internal.InternalFomParser;
import com.cohesionforce.hla.dsl.services.FomGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class FomParser extends AbstractContentAssistParser {

	@Inject
	private FomGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFomParser createParser() {
		InternalFomParser result = new InternalFomParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFederationAccess().getNameAlternatives_2_0(), "rule__Federation__NameAlternatives_2_0");
					put(grammarAccess.getAttributeAccess().getTransportAlternatives_3_0(), "rule__Attribute__TransportAlternatives_3_0");
					put(grammarAccess.getAttributeAccess().getOrderAlternatives_4_0(), "rule__Attribute__OrderAlternatives_4_0");
					put(grammarAccess.getInteractionClassAccess().getTransportAlternatives_3_0(), "rule__InteractionClass__TransportAlternatives_3_0");
					put(grammarAccess.getInteractionClassAccess().getOrderAlternatives_4_0(), "rule__InteractionClass__OrderAlternatives_4_0");
					put(grammarAccess.getValidIDAccess().getAlternatives(), "rule__ValidID__Alternatives");
					put(grammarAccess.getFedAccess().getGroup(), "rule__Fed__Group__0");
					put(grammarAccess.getFederationAccess().getGroup(), "rule__Federation__Group__0");
					put(grammarAccess.getFEDversionAccess().getGroup(), "rule__FEDversion__Group__0");
					put(grammarAccess.getSpaceAccess().getGroup(), "rule__Space__Group__0");
					put(grammarAccess.getDimensionAccess().getGroup(), "rule__Dimension__Group__0");
					put(grammarAccess.getAttributeClassAccess().getGroup(), "rule__AttributeClass__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getInteractionClassAccess().getGroup(), "rule__InteractionClass__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getFedAccess().getFederationAssignment_2(), "rule__Fed__FederationAssignment_2");
					put(grammarAccess.getFedAccess().getVersionAssignment_3(), "rule__Fed__VersionAssignment_3");
					put(grammarAccess.getFedAccess().getSpacesAssignment_6(), "rule__Fed__SpacesAssignment_6");
					put(grammarAccess.getFedAccess().getClassesAssignment_10(), "rule__Fed__ClassesAssignment_10");
					put(grammarAccess.getFedAccess().getClassesAssignment_14(), "rule__Fed__ClassesAssignment_14");
					put(grammarAccess.getFederationAccess().getNameAssignment_2(), "rule__Federation__NameAssignment_2");
					put(grammarAccess.getFEDversionAccess().getVersionAssignment_2(), "rule__FEDversion__VersionAssignment_2");
					put(grammarAccess.getSpaceAccess().getNameAssignment_2(), "rule__Space__NameAssignment_2");
					put(grammarAccess.getSpaceAccess().getDimensionsAssignment_3(), "rule__Space__DimensionsAssignment_3");
					put(grammarAccess.getDimensionAccess().getNameAssignment_2(), "rule__Dimension__NameAssignment_2");
					put(grammarAccess.getAttributeClassAccess().getNameAssignment_2(), "rule__AttributeClass__NameAssignment_2");
					put(grammarAccess.getAttributeClassAccess().getAttributesAssignment_3(), "rule__AttributeClass__AttributesAssignment_3");
					put(grammarAccess.getAttributeClassAccess().getClassesAssignment_4(), "rule__AttributeClass__ClassesAssignment_4");
					put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
					put(grammarAccess.getAttributeAccess().getTransportAssignment_3(), "rule__Attribute__TransportAssignment_3");
					put(grammarAccess.getAttributeAccess().getOrderAssignment_4(), "rule__Attribute__OrderAssignment_4");
					put(grammarAccess.getAttributeAccess().getSpaceAssignment_5(), "rule__Attribute__SpaceAssignment_5");
					put(grammarAccess.getInteractionClassAccess().getNameAssignment_2(), "rule__InteractionClass__NameAssignment_2");
					put(grammarAccess.getInteractionClassAccess().getTransportAssignment_3(), "rule__InteractionClass__TransportAssignment_3");
					put(grammarAccess.getInteractionClassAccess().getOrderAssignment_4(), "rule__InteractionClass__OrderAssignment_4");
					put(grammarAccess.getInteractionClassAccess().getSpaceAssignment_5(), "rule__InteractionClass__SpaceAssignment_5");
					put(grammarAccess.getInteractionClassAccess().getParametersAssignment_6(), "rule__InteractionClass__ParametersAssignment_6");
					put(grammarAccess.getInteractionClassAccess().getClassesAssignment_7(), "rule__InteractionClass__ClassesAssignment_7");
					put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_COMMENT" };
	}

	public FomGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FomGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
