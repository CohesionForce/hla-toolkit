package com.cohesionforce.hla.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.cohesionforce.hla.dsl.services.FomGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFomParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXT", "RULE_ID", "RULE_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'reliable'", "'best_effort'", "'timestamp'", "'receive'", "'Federation'", "'class'", "'attribute'", "'dimension'", "'space'", "'('", "'FED'", "'spaces'", "')'", "'objects'", "'interactions'", "'FEDversion'", "'parameter'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_COMMENT=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_TEXT=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFomParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFomParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFomParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFom.g"; }


    	private FomGrammarAccess grammarAccess;

    	public void setGrammarAccess(FomGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleFed"
    // InternalFom.g:53:1: entryRuleFed : ruleFed EOF ;
    public final void entryRuleFed() throws RecognitionException {
        try {
            // InternalFom.g:54:1: ( ruleFed EOF )
            // InternalFom.g:55:1: ruleFed EOF
            {
             before(grammarAccess.getFedRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFed();

            state._fsp--;

             after(grammarAccess.getFedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFed"


    // $ANTLR start "ruleFed"
    // InternalFom.g:62:1: ruleFed : ( ( rule__Fed__Group__0 ) ) ;
    public final void ruleFed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:66:2: ( ( ( rule__Fed__Group__0 ) ) )
            // InternalFom.g:67:2: ( ( rule__Fed__Group__0 ) )
            {
            // InternalFom.g:67:2: ( ( rule__Fed__Group__0 ) )
            // InternalFom.g:68:3: ( rule__Fed__Group__0 )
            {
             before(grammarAccess.getFedAccess().getGroup()); 
            // InternalFom.g:69:3: ( rule__Fed__Group__0 )
            // InternalFom.g:69:4: rule__Fed__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFed"


    // $ANTLR start "entryRuleFederation"
    // InternalFom.g:78:1: entryRuleFederation : ruleFederation EOF ;
    public final void entryRuleFederation() throws RecognitionException {
        try {
            // InternalFom.g:79:1: ( ruleFederation EOF )
            // InternalFom.g:80:1: ruleFederation EOF
            {
             before(grammarAccess.getFederationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFederation();

            state._fsp--;

             after(grammarAccess.getFederationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFederation"


    // $ANTLR start "ruleFederation"
    // InternalFom.g:87:1: ruleFederation : ( ( rule__Federation__Group__0 ) ) ;
    public final void ruleFederation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:91:2: ( ( ( rule__Federation__Group__0 ) ) )
            // InternalFom.g:92:2: ( ( rule__Federation__Group__0 ) )
            {
            // InternalFom.g:92:2: ( ( rule__Federation__Group__0 ) )
            // InternalFom.g:93:3: ( rule__Federation__Group__0 )
            {
             before(grammarAccess.getFederationAccess().getGroup()); 
            // InternalFom.g:94:3: ( rule__Federation__Group__0 )
            // InternalFom.g:94:4: rule__Federation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Federation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFederationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFederation"


    // $ANTLR start "entryRuleFEDversion"
    // InternalFom.g:103:1: entryRuleFEDversion : ruleFEDversion EOF ;
    public final void entryRuleFEDversion() throws RecognitionException {
        try {
            // InternalFom.g:104:1: ( ruleFEDversion EOF )
            // InternalFom.g:105:1: ruleFEDversion EOF
            {
             before(grammarAccess.getFEDversionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFEDversion();

            state._fsp--;

             after(grammarAccess.getFEDversionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFEDversion"


    // $ANTLR start "ruleFEDversion"
    // InternalFom.g:112:1: ruleFEDversion : ( ( rule__FEDversion__Group__0 ) ) ;
    public final void ruleFEDversion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:116:2: ( ( ( rule__FEDversion__Group__0 ) ) )
            // InternalFom.g:117:2: ( ( rule__FEDversion__Group__0 ) )
            {
            // InternalFom.g:117:2: ( ( rule__FEDversion__Group__0 ) )
            // InternalFom.g:118:3: ( rule__FEDversion__Group__0 )
            {
             before(grammarAccess.getFEDversionAccess().getGroup()); 
            // InternalFom.g:119:3: ( rule__FEDversion__Group__0 )
            // InternalFom.g:119:4: rule__FEDversion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FEDversion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFEDversionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFEDversion"


    // $ANTLR start "entryRuleSpace"
    // InternalFom.g:128:1: entryRuleSpace : ruleSpace EOF ;
    public final void entryRuleSpace() throws RecognitionException {
        try {
            // InternalFom.g:129:1: ( ruleSpace EOF )
            // InternalFom.g:130:1: ruleSpace EOF
            {
             before(grammarAccess.getSpaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getSpaceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalFom.g:137:1: ruleSpace : ( ( rule__Space__Group__0 ) ) ;
    public final void ruleSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:141:2: ( ( ( rule__Space__Group__0 ) ) )
            // InternalFom.g:142:2: ( ( rule__Space__Group__0 ) )
            {
            // InternalFom.g:142:2: ( ( rule__Space__Group__0 ) )
            // InternalFom.g:143:3: ( rule__Space__Group__0 )
            {
             before(grammarAccess.getSpaceAccess().getGroup()); 
            // InternalFom.g:144:3: ( rule__Space__Group__0 )
            // InternalFom.g:144:4: rule__Space__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Space__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleDimension"
    // InternalFom.g:153:1: entryRuleDimension : ruleDimension EOF ;
    public final void entryRuleDimension() throws RecognitionException {
        try {
            // InternalFom.g:154:1: ( ruleDimension EOF )
            // InternalFom.g:155:1: ruleDimension EOF
            {
             before(grammarAccess.getDimensionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDimensionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalFom.g:162:1: ruleDimension : ( ( rule__Dimension__Group__0 ) ) ;
    public final void ruleDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:166:2: ( ( ( rule__Dimension__Group__0 ) ) )
            // InternalFom.g:167:2: ( ( rule__Dimension__Group__0 ) )
            {
            // InternalFom.g:167:2: ( ( rule__Dimension__Group__0 ) )
            // InternalFom.g:168:3: ( rule__Dimension__Group__0 )
            {
             before(grammarAccess.getDimensionAccess().getGroup()); 
            // InternalFom.g:169:3: ( rule__Dimension__Group__0 )
            // InternalFom.g:169:4: rule__Dimension__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Dimension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleAttributeClass"
    // InternalFom.g:178:1: entryRuleAttributeClass : ruleAttributeClass EOF ;
    public final void entryRuleAttributeClass() throws RecognitionException {
        try {
            // InternalFom.g:179:1: ( ruleAttributeClass EOF )
            // InternalFom.g:180:1: ruleAttributeClass EOF
            {
             before(grammarAccess.getAttributeClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeClass();

            state._fsp--;

             after(grammarAccess.getAttributeClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeClass"


    // $ANTLR start "ruleAttributeClass"
    // InternalFom.g:187:1: ruleAttributeClass : ( ( rule__AttributeClass__Group__0 ) ) ;
    public final void ruleAttributeClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:191:2: ( ( ( rule__AttributeClass__Group__0 ) ) )
            // InternalFom.g:192:2: ( ( rule__AttributeClass__Group__0 ) )
            {
            // InternalFom.g:192:2: ( ( rule__AttributeClass__Group__0 ) )
            // InternalFom.g:193:3: ( rule__AttributeClass__Group__0 )
            {
             before(grammarAccess.getAttributeClassAccess().getGroup()); 
            // InternalFom.g:194:3: ( rule__AttributeClass__Group__0 )
            // InternalFom.g:194:4: rule__AttributeClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalFom.g:203:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalFom.g:204:1: ( ruleAttribute EOF )
            // InternalFom.g:205:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalFom.g:212:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:216:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalFom.g:217:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalFom.g:217:2: ( ( rule__Attribute__Group__0 ) )
            // InternalFom.g:218:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalFom.g:219:3: ( rule__Attribute__Group__0 )
            // InternalFom.g:219:4: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleInteractionClass"
    // InternalFom.g:228:1: entryRuleInteractionClass : ruleInteractionClass EOF ;
    public final void entryRuleInteractionClass() throws RecognitionException {
        try {
            // InternalFom.g:229:1: ( ruleInteractionClass EOF )
            // InternalFom.g:230:1: ruleInteractionClass EOF
            {
             before(grammarAccess.getInteractionClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInteractionClass();

            state._fsp--;

             after(grammarAccess.getInteractionClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteractionClass"


    // $ANTLR start "ruleInteractionClass"
    // InternalFom.g:237:1: ruleInteractionClass : ( ( rule__InteractionClass__Group__0 ) ) ;
    public final void ruleInteractionClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:241:2: ( ( ( rule__InteractionClass__Group__0 ) ) )
            // InternalFom.g:242:2: ( ( rule__InteractionClass__Group__0 ) )
            {
            // InternalFom.g:242:2: ( ( rule__InteractionClass__Group__0 ) )
            // InternalFom.g:243:3: ( rule__InteractionClass__Group__0 )
            {
             before(grammarAccess.getInteractionClassAccess().getGroup()); 
            // InternalFom.g:244:3: ( rule__InteractionClass__Group__0 )
            // InternalFom.g:244:4: rule__InteractionClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteractionClass"


    // $ANTLR start "entryRuleParameter"
    // InternalFom.g:253:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalFom.g:254:1: ( ruleParameter EOF )
            // InternalFom.g:255:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalFom.g:262:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:266:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalFom.g:267:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalFom.g:267:2: ( ( rule__Parameter__Group__0 ) )
            // InternalFom.g:268:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalFom.g:269:3: ( rule__Parameter__Group__0 )
            // InternalFom.g:269:4: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleValidID"
    // InternalFom.g:278:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalFom.g:279:1: ( ruleValidID EOF )
            // InternalFom.g:280:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalFom.g:287:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:291:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalFom.g:292:2: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalFom.g:292:2: ( ( rule__ValidID__Alternatives ) )
            // InternalFom.g:293:3: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // InternalFom.g:294:3: ( rule__ValidID__Alternatives )
            // InternalFom.g:294:4: rule__ValidID__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValidID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "rule__Federation__NameAlternatives_2_0"
    // InternalFom.g:302:1: rule__Federation__NameAlternatives_2_0 : ( ( ruleValidID ) | ( RULE_TEXT ) );
    public final void rule__Federation__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:306:1: ( ( ruleValidID ) | ( RULE_TEXT ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||(LA1_0>=17 && LA1_0<=21)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_TEXT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFom.g:307:2: ( ruleValidID )
                    {
                    // InternalFom.g:307:2: ( ruleValidID )
                    // InternalFom.g:308:3: ruleValidID
                    {
                     before(grammarAccess.getFederationAccess().getNameValidIDParserRuleCall_2_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValidID();

                    state._fsp--;

                     after(grammarAccess.getFederationAccess().getNameValidIDParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFom.g:313:2: ( RULE_TEXT )
                    {
                    // InternalFom.g:313:2: ( RULE_TEXT )
                    // InternalFom.g:314:3: RULE_TEXT
                    {
                     before(grammarAccess.getFederationAccess().getNameTEXTTerminalRuleCall_2_0_1()); 
                    match(input,RULE_TEXT,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getFederationAccess().getNameTEXTTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__NameAlternatives_2_0"


    // $ANTLR start "rule__Attribute__TransportAlternatives_3_0"
    // InternalFom.g:323:1: rule__Attribute__TransportAlternatives_3_0 : ( ( 'reliable' ) | ( 'best_effort' ) );
    public final void rule__Attribute__TransportAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:327:1: ( ( 'reliable' ) | ( 'best_effort' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFom.g:328:2: ( 'reliable' )
                    {
                    // InternalFom.g:328:2: ( 'reliable' )
                    // InternalFom.g:329:3: 'reliable'
                    {
                     before(grammarAccess.getAttributeAccess().getTransportReliableKeyword_3_0_0()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getTransportReliableKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFom.g:334:2: ( 'best_effort' )
                    {
                    // InternalFom.g:334:2: ( 'best_effort' )
                    // InternalFom.g:335:3: 'best_effort'
                    {
                     before(grammarAccess.getAttributeAccess().getTransportBest_effortKeyword_3_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getTransportBest_effortKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TransportAlternatives_3_0"


    // $ANTLR start "rule__Attribute__OrderAlternatives_4_0"
    // InternalFom.g:344:1: rule__Attribute__OrderAlternatives_4_0 : ( ( 'timestamp' ) | ( 'receive' ) );
    public final void rule__Attribute__OrderAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:348:1: ( ( 'timestamp' ) | ( 'receive' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFom.g:349:2: ( 'timestamp' )
                    {
                    // InternalFom.g:349:2: ( 'timestamp' )
                    // InternalFom.g:350:3: 'timestamp'
                    {
                     before(grammarAccess.getAttributeAccess().getOrderTimestampKeyword_4_0_0()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getOrderTimestampKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFom.g:355:2: ( 'receive' )
                    {
                    // InternalFom.g:355:2: ( 'receive' )
                    // InternalFom.g:356:3: 'receive'
                    {
                     before(grammarAccess.getAttributeAccess().getOrderReceiveKeyword_4_0_1()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getOrderReceiveKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__OrderAlternatives_4_0"


    // $ANTLR start "rule__InteractionClass__TransportAlternatives_3_0"
    // InternalFom.g:365:1: rule__InteractionClass__TransportAlternatives_3_0 : ( ( 'reliable' ) | ( 'best_effort' ) );
    public final void rule__InteractionClass__TransportAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:369:1: ( ( 'reliable' ) | ( 'best_effort' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFom.g:370:2: ( 'reliable' )
                    {
                    // InternalFom.g:370:2: ( 'reliable' )
                    // InternalFom.g:371:3: 'reliable'
                    {
                     before(grammarAccess.getInteractionClassAccess().getTransportReliableKeyword_3_0_0()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getInteractionClassAccess().getTransportReliableKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFom.g:376:2: ( 'best_effort' )
                    {
                    // InternalFom.g:376:2: ( 'best_effort' )
                    // InternalFom.g:377:3: 'best_effort'
                    {
                     before(grammarAccess.getInteractionClassAccess().getTransportBest_effortKeyword_3_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getInteractionClassAccess().getTransportBest_effortKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__TransportAlternatives_3_0"


    // $ANTLR start "rule__InteractionClass__OrderAlternatives_4_0"
    // InternalFom.g:386:1: rule__InteractionClass__OrderAlternatives_4_0 : ( ( 'timestamp' ) | ( 'receive' ) );
    public final void rule__InteractionClass__OrderAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:390:1: ( ( 'timestamp' ) | ( 'receive' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFom.g:391:2: ( 'timestamp' )
                    {
                    // InternalFom.g:391:2: ( 'timestamp' )
                    // InternalFom.g:392:3: 'timestamp'
                    {
                     before(grammarAccess.getInteractionClassAccess().getOrderTimestampKeyword_4_0_0()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getInteractionClassAccess().getOrderTimestampKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFom.g:397:2: ( 'receive' )
                    {
                    // InternalFom.g:397:2: ( 'receive' )
                    // InternalFom.g:398:3: 'receive'
                    {
                     before(grammarAccess.getInteractionClassAccess().getOrderReceiveKeyword_4_0_1()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getInteractionClassAccess().getOrderReceiveKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__OrderAlternatives_4_0"


    // $ANTLR start "rule__ValidID__Alternatives"
    // InternalFom.g:407:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( 'Federation' ) | ( 'class' ) | ( 'attribute' ) | ( 'dimension' ) | ( 'space' ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:411:1: ( ( RULE_ID ) | ( 'Federation' ) | ( 'class' ) | ( 'attribute' ) | ( 'dimension' ) | ( 'space' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFom.g:412:2: ( RULE_ID )
                    {
                    // InternalFom.g:412:2: ( RULE_ID )
                    // InternalFom.g:413:3: RULE_ID
                    {
                     before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFom.g:418:2: ( 'Federation' )
                    {
                    // InternalFom.g:418:2: ( 'Federation' )
                    // InternalFom.g:419:3: 'Federation'
                    {
                     before(grammarAccess.getValidIDAccess().getFederationKeyword_1()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getFederationKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFom.g:424:2: ( 'class' )
                    {
                    // InternalFom.g:424:2: ( 'class' )
                    // InternalFom.g:425:3: 'class'
                    {
                     before(grammarAccess.getValidIDAccess().getClassKeyword_2()); 
                    match(input,18,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getClassKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFom.g:430:2: ( 'attribute' )
                    {
                    // InternalFom.g:430:2: ( 'attribute' )
                    // InternalFom.g:431:3: 'attribute'
                    {
                     before(grammarAccess.getValidIDAccess().getAttributeKeyword_3()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getAttributeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFom.g:436:2: ( 'dimension' )
                    {
                    // InternalFom.g:436:2: ( 'dimension' )
                    // InternalFom.g:437:3: 'dimension'
                    {
                     before(grammarAccess.getValidIDAccess().getDimensionKeyword_4()); 
                    match(input,20,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getDimensionKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFom.g:442:2: ( 'space' )
                    {
                    // InternalFom.g:442:2: ( 'space' )
                    // InternalFom.g:443:3: 'space'
                    {
                     before(grammarAccess.getValidIDAccess().getSpaceKeyword_5()); 
                    match(input,21,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getSpaceKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__Fed__Group__0"
    // InternalFom.g:452:1: rule__Fed__Group__0 : rule__Fed__Group__0__Impl rule__Fed__Group__1 ;
    public final void rule__Fed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:456:1: ( rule__Fed__Group__0__Impl rule__Fed__Group__1 )
            // InternalFom.g:457:2: rule__Fed__Group__0__Impl rule__Fed__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Fed__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__0"


    // $ANTLR start "rule__Fed__Group__0__Impl"
    // InternalFom.g:464:1: rule__Fed__Group__0__Impl : ( '(' ) ;
    public final void rule__Fed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:468:1: ( ( '(' ) )
            // InternalFom.g:469:1: ( '(' )
            {
            // InternalFom.g:469:1: ( '(' )
            // InternalFom.g:470:2: '('
            {
             before(grammarAccess.getFedAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__0__Impl"


    // $ANTLR start "rule__Fed__Group__1"
    // InternalFom.g:479:1: rule__Fed__Group__1 : rule__Fed__Group__1__Impl rule__Fed__Group__2 ;
    public final void rule__Fed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:483:1: ( rule__Fed__Group__1__Impl rule__Fed__Group__2 )
            // InternalFom.g:484:2: rule__Fed__Group__1__Impl rule__Fed__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Fed__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__1"


    // $ANTLR start "rule__Fed__Group__1__Impl"
    // InternalFom.g:491:1: rule__Fed__Group__1__Impl : ( 'FED' ) ;
    public final void rule__Fed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:495:1: ( ( 'FED' ) )
            // InternalFom.g:496:1: ( 'FED' )
            {
            // InternalFom.g:496:1: ( 'FED' )
            // InternalFom.g:497:2: 'FED'
            {
             before(grammarAccess.getFedAccess().getFEDKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getFEDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__1__Impl"


    // $ANTLR start "rule__Fed__Group__2"
    // InternalFom.g:506:1: rule__Fed__Group__2 : rule__Fed__Group__2__Impl rule__Fed__Group__3 ;
    public final void rule__Fed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:510:1: ( rule__Fed__Group__2__Impl rule__Fed__Group__3 )
            // InternalFom.g:511:2: rule__Fed__Group__2__Impl rule__Fed__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Fed__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__2"


    // $ANTLR start "rule__Fed__Group__2__Impl"
    // InternalFom.g:518:1: rule__Fed__Group__2__Impl : ( ( rule__Fed__FederationAssignment_2 ) ) ;
    public final void rule__Fed__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:522:1: ( ( ( rule__Fed__FederationAssignment_2 ) ) )
            // InternalFom.g:523:1: ( ( rule__Fed__FederationAssignment_2 ) )
            {
            // InternalFom.g:523:1: ( ( rule__Fed__FederationAssignment_2 ) )
            // InternalFom.g:524:2: ( rule__Fed__FederationAssignment_2 )
            {
             before(grammarAccess.getFedAccess().getFederationAssignment_2()); 
            // InternalFom.g:525:2: ( rule__Fed__FederationAssignment_2 )
            // InternalFom.g:525:3: rule__Fed__FederationAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__FederationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFedAccess().getFederationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__2__Impl"


    // $ANTLR start "rule__Fed__Group__3"
    // InternalFom.g:533:1: rule__Fed__Group__3 : rule__Fed__Group__3__Impl rule__Fed__Group__4 ;
    public final void rule__Fed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:537:1: ( rule__Fed__Group__3__Impl rule__Fed__Group__4 )
            // InternalFom.g:538:2: rule__Fed__Group__3__Impl rule__Fed__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Fed__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__3"


    // $ANTLR start "rule__Fed__Group__3__Impl"
    // InternalFom.g:545:1: rule__Fed__Group__3__Impl : ( ( rule__Fed__VersionAssignment_3 ) ) ;
    public final void rule__Fed__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:549:1: ( ( ( rule__Fed__VersionAssignment_3 ) ) )
            // InternalFom.g:550:1: ( ( rule__Fed__VersionAssignment_3 ) )
            {
            // InternalFom.g:550:1: ( ( rule__Fed__VersionAssignment_3 ) )
            // InternalFom.g:551:2: ( rule__Fed__VersionAssignment_3 )
            {
             before(grammarAccess.getFedAccess().getVersionAssignment_3()); 
            // InternalFom.g:552:2: ( rule__Fed__VersionAssignment_3 )
            // InternalFom.g:552:3: rule__Fed__VersionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__VersionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFedAccess().getVersionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__3__Impl"


    // $ANTLR start "rule__Fed__Group__4"
    // InternalFom.g:560:1: rule__Fed__Group__4 : rule__Fed__Group__4__Impl rule__Fed__Group__5 ;
    public final void rule__Fed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:564:1: ( rule__Fed__Group__4__Impl rule__Fed__Group__5 )
            // InternalFom.g:565:2: rule__Fed__Group__4__Impl rule__Fed__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Fed__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__4"


    // $ANTLR start "rule__Fed__Group__4__Impl"
    // InternalFom.g:572:1: rule__Fed__Group__4__Impl : ( '(' ) ;
    public final void rule__Fed__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:576:1: ( ( '(' ) )
            // InternalFom.g:577:1: ( '(' )
            {
            // InternalFom.g:577:1: ( '(' )
            // InternalFom.g:578:2: '('
            {
             before(grammarAccess.getFedAccess().getLeftParenthesisKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__4__Impl"


    // $ANTLR start "rule__Fed__Group__5"
    // InternalFom.g:587:1: rule__Fed__Group__5 : rule__Fed__Group__5__Impl rule__Fed__Group__6 ;
    public final void rule__Fed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:591:1: ( rule__Fed__Group__5__Impl rule__Fed__Group__6 )
            // InternalFom.g:592:2: rule__Fed__Group__5__Impl rule__Fed__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Fed__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__5"


    // $ANTLR start "rule__Fed__Group__5__Impl"
    // InternalFom.g:599:1: rule__Fed__Group__5__Impl : ( 'spaces' ) ;
    public final void rule__Fed__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:603:1: ( ( 'spaces' ) )
            // InternalFom.g:604:1: ( 'spaces' )
            {
            // InternalFom.g:604:1: ( 'spaces' )
            // InternalFom.g:605:2: 'spaces'
            {
             before(grammarAccess.getFedAccess().getSpacesKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getSpacesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__5__Impl"


    // $ANTLR start "rule__Fed__Group__6"
    // InternalFom.g:614:1: rule__Fed__Group__6 : rule__Fed__Group__6__Impl rule__Fed__Group__7 ;
    public final void rule__Fed__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:618:1: ( rule__Fed__Group__6__Impl rule__Fed__Group__7 )
            // InternalFom.g:619:2: rule__Fed__Group__6__Impl rule__Fed__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Fed__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__6"


    // $ANTLR start "rule__Fed__Group__6__Impl"
    // InternalFom.g:626:1: rule__Fed__Group__6__Impl : ( ( rule__Fed__SpacesAssignment_6 )* ) ;
    public final void rule__Fed__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:630:1: ( ( ( rule__Fed__SpacesAssignment_6 )* ) )
            // InternalFom.g:631:1: ( ( rule__Fed__SpacesAssignment_6 )* )
            {
            // InternalFom.g:631:1: ( ( rule__Fed__SpacesAssignment_6 )* )
            // InternalFom.g:632:2: ( rule__Fed__SpacesAssignment_6 )*
            {
             before(grammarAccess.getFedAccess().getSpacesAssignment_6()); 
            // InternalFom.g:633:2: ( rule__Fed__SpacesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFom.g:633:3: rule__Fed__SpacesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Fed__SpacesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFedAccess().getSpacesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__6__Impl"


    // $ANTLR start "rule__Fed__Group__7"
    // InternalFom.g:641:1: rule__Fed__Group__7 : rule__Fed__Group__7__Impl rule__Fed__Group__8 ;
    public final void rule__Fed__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:645:1: ( rule__Fed__Group__7__Impl rule__Fed__Group__8 )
            // InternalFom.g:646:2: rule__Fed__Group__7__Impl rule__Fed__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Fed__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__7"


    // $ANTLR start "rule__Fed__Group__7__Impl"
    // InternalFom.g:653:1: rule__Fed__Group__7__Impl : ( ')' ) ;
    public final void rule__Fed__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:657:1: ( ( ')' ) )
            // InternalFom.g:658:1: ( ')' )
            {
            // InternalFom.g:658:1: ( ')' )
            // InternalFom.g:659:2: ')'
            {
             before(grammarAccess.getFedAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__7__Impl"


    // $ANTLR start "rule__Fed__Group__8"
    // InternalFom.g:668:1: rule__Fed__Group__8 : rule__Fed__Group__8__Impl rule__Fed__Group__9 ;
    public final void rule__Fed__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:672:1: ( rule__Fed__Group__8__Impl rule__Fed__Group__9 )
            // InternalFom.g:673:2: rule__Fed__Group__8__Impl rule__Fed__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Fed__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__8"


    // $ANTLR start "rule__Fed__Group__8__Impl"
    // InternalFom.g:680:1: rule__Fed__Group__8__Impl : ( '(' ) ;
    public final void rule__Fed__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:684:1: ( ( '(' ) )
            // InternalFom.g:685:1: ( '(' )
            {
            // InternalFom.g:685:1: ( '(' )
            // InternalFom.g:686:2: '('
            {
             before(grammarAccess.getFedAccess().getLeftParenthesisKeyword_8()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__8__Impl"


    // $ANTLR start "rule__Fed__Group__9"
    // InternalFom.g:695:1: rule__Fed__Group__9 : rule__Fed__Group__9__Impl rule__Fed__Group__10 ;
    public final void rule__Fed__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:699:1: ( rule__Fed__Group__9__Impl rule__Fed__Group__10 )
            // InternalFom.g:700:2: rule__Fed__Group__9__Impl rule__Fed__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Fed__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__9"


    // $ANTLR start "rule__Fed__Group__9__Impl"
    // InternalFom.g:707:1: rule__Fed__Group__9__Impl : ( 'objects' ) ;
    public final void rule__Fed__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:711:1: ( ( 'objects' ) )
            // InternalFom.g:712:1: ( 'objects' )
            {
            // InternalFom.g:712:1: ( 'objects' )
            // InternalFom.g:713:2: 'objects'
            {
             before(grammarAccess.getFedAccess().getObjectsKeyword_9()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getObjectsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__9__Impl"


    // $ANTLR start "rule__Fed__Group__10"
    // InternalFom.g:722:1: rule__Fed__Group__10 : rule__Fed__Group__10__Impl rule__Fed__Group__11 ;
    public final void rule__Fed__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:726:1: ( rule__Fed__Group__10__Impl rule__Fed__Group__11 )
            // InternalFom.g:727:2: rule__Fed__Group__10__Impl rule__Fed__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Fed__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__10"


    // $ANTLR start "rule__Fed__Group__10__Impl"
    // InternalFom.g:734:1: rule__Fed__Group__10__Impl : ( ( rule__Fed__ClassesAssignment_10 )* ) ;
    public final void rule__Fed__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:738:1: ( ( ( rule__Fed__ClassesAssignment_10 )* ) )
            // InternalFom.g:739:1: ( ( rule__Fed__ClassesAssignment_10 )* )
            {
            // InternalFom.g:739:1: ( ( rule__Fed__ClassesAssignment_10 )* )
            // InternalFom.g:740:2: ( rule__Fed__ClassesAssignment_10 )*
            {
             before(grammarAccess.getFedAccess().getClassesAssignment_10()); 
            // InternalFom.g:741:2: ( rule__Fed__ClassesAssignment_10 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFom.g:741:3: rule__Fed__ClassesAssignment_10
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Fed__ClassesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFedAccess().getClassesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__10__Impl"


    // $ANTLR start "rule__Fed__Group__11"
    // InternalFom.g:749:1: rule__Fed__Group__11 : rule__Fed__Group__11__Impl rule__Fed__Group__12 ;
    public final void rule__Fed__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:753:1: ( rule__Fed__Group__11__Impl rule__Fed__Group__12 )
            // InternalFom.g:754:2: rule__Fed__Group__11__Impl rule__Fed__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Fed__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__11"


    // $ANTLR start "rule__Fed__Group__11__Impl"
    // InternalFom.g:761:1: rule__Fed__Group__11__Impl : ( ')' ) ;
    public final void rule__Fed__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:765:1: ( ( ')' ) )
            // InternalFom.g:766:1: ( ')' )
            {
            // InternalFom.g:766:1: ( ')' )
            // InternalFom.g:767:2: ')'
            {
             before(grammarAccess.getFedAccess().getRightParenthesisKeyword_11()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__11__Impl"


    // $ANTLR start "rule__Fed__Group__12"
    // InternalFom.g:776:1: rule__Fed__Group__12 : rule__Fed__Group__12__Impl rule__Fed__Group__13 ;
    public final void rule__Fed__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:780:1: ( rule__Fed__Group__12__Impl rule__Fed__Group__13 )
            // InternalFom.g:781:2: rule__Fed__Group__12__Impl rule__Fed__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Fed__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__12"


    // $ANTLR start "rule__Fed__Group__12__Impl"
    // InternalFom.g:788:1: rule__Fed__Group__12__Impl : ( '(' ) ;
    public final void rule__Fed__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:792:1: ( ( '(' ) )
            // InternalFom.g:793:1: ( '(' )
            {
            // InternalFom.g:793:1: ( '(' )
            // InternalFom.g:794:2: '('
            {
             before(grammarAccess.getFedAccess().getLeftParenthesisKeyword_12()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getLeftParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__12__Impl"


    // $ANTLR start "rule__Fed__Group__13"
    // InternalFom.g:803:1: rule__Fed__Group__13 : rule__Fed__Group__13__Impl rule__Fed__Group__14 ;
    public final void rule__Fed__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:807:1: ( rule__Fed__Group__13__Impl rule__Fed__Group__14 )
            // InternalFom.g:808:2: rule__Fed__Group__13__Impl rule__Fed__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Fed__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__13"


    // $ANTLR start "rule__Fed__Group__13__Impl"
    // InternalFom.g:815:1: rule__Fed__Group__13__Impl : ( 'interactions' ) ;
    public final void rule__Fed__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:819:1: ( ( 'interactions' ) )
            // InternalFom.g:820:1: ( 'interactions' )
            {
            // InternalFom.g:820:1: ( 'interactions' )
            // InternalFom.g:821:2: 'interactions'
            {
             before(grammarAccess.getFedAccess().getInteractionsKeyword_13()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getInteractionsKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__13__Impl"


    // $ANTLR start "rule__Fed__Group__14"
    // InternalFom.g:830:1: rule__Fed__Group__14 : rule__Fed__Group__14__Impl rule__Fed__Group__15 ;
    public final void rule__Fed__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:834:1: ( rule__Fed__Group__14__Impl rule__Fed__Group__15 )
            // InternalFom.g:835:2: rule__Fed__Group__14__Impl rule__Fed__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Fed__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__14"


    // $ANTLR start "rule__Fed__Group__14__Impl"
    // InternalFom.g:842:1: rule__Fed__Group__14__Impl : ( ( rule__Fed__ClassesAssignment_14 )* ) ;
    public final void rule__Fed__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:846:1: ( ( ( rule__Fed__ClassesAssignment_14 )* ) )
            // InternalFom.g:847:1: ( ( rule__Fed__ClassesAssignment_14 )* )
            {
            // InternalFom.g:847:1: ( ( rule__Fed__ClassesAssignment_14 )* )
            // InternalFom.g:848:2: ( rule__Fed__ClassesAssignment_14 )*
            {
             before(grammarAccess.getFedAccess().getClassesAssignment_14()); 
            // InternalFom.g:849:2: ( rule__Fed__ClassesAssignment_14 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFom.g:849:3: rule__Fed__ClassesAssignment_14
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Fed__ClassesAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFedAccess().getClassesAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__14__Impl"


    // $ANTLR start "rule__Fed__Group__15"
    // InternalFom.g:857:1: rule__Fed__Group__15 : rule__Fed__Group__15__Impl rule__Fed__Group__16 ;
    public final void rule__Fed__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:861:1: ( rule__Fed__Group__15__Impl rule__Fed__Group__16 )
            // InternalFom.g:862:2: rule__Fed__Group__15__Impl rule__Fed__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Fed__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__15"


    // $ANTLR start "rule__Fed__Group__15__Impl"
    // InternalFom.g:869:1: rule__Fed__Group__15__Impl : ( ')' ) ;
    public final void rule__Fed__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:873:1: ( ( ')' ) )
            // InternalFom.g:874:1: ( ')' )
            {
            // InternalFom.g:874:1: ( ')' )
            // InternalFom.g:875:2: ')'
            {
             before(grammarAccess.getFedAccess().getRightParenthesisKeyword_15()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getRightParenthesisKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__15__Impl"


    // $ANTLR start "rule__Fed__Group__16"
    // InternalFom.g:884:1: rule__Fed__Group__16 : rule__Fed__Group__16__Impl ;
    public final void rule__Fed__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:888:1: ( rule__Fed__Group__16__Impl )
            // InternalFom.g:889:2: rule__Fed__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Fed__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__16"


    // $ANTLR start "rule__Fed__Group__16__Impl"
    // InternalFom.g:895:1: rule__Fed__Group__16__Impl : ( ')' ) ;
    public final void rule__Fed__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:899:1: ( ( ')' ) )
            // InternalFom.g:900:1: ( ')' )
            {
            // InternalFom.g:900:1: ( ')' )
            // InternalFom.g:901:2: ')'
            {
             before(grammarAccess.getFedAccess().getRightParenthesisKeyword_16()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFedAccess().getRightParenthesisKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__Group__16__Impl"


    // $ANTLR start "rule__Federation__Group__0"
    // InternalFom.g:911:1: rule__Federation__Group__0 : rule__Federation__Group__0__Impl rule__Federation__Group__1 ;
    public final void rule__Federation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:915:1: ( rule__Federation__Group__0__Impl rule__Federation__Group__1 )
            // InternalFom.g:916:2: rule__Federation__Group__0__Impl rule__Federation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Federation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Federation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__Group__0"


    // $ANTLR start "rule__Federation__Group__0__Impl"
    // InternalFom.g:923:1: rule__Federation__Group__0__Impl : ( '(' ) ;
    public final void rule__Federation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:927:1: ( ( '(' ) )
            // InternalFom.g:928:1: ( '(' )
            {
            // InternalFom.g:928:1: ( '(' )
            // InternalFom.g:929:2: '('
            {
             before(grammarAccess.getFederationAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFederationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__Group__0__Impl"


    // $ANTLR start "rule__Federation__Group__1"
    // InternalFom.g:938:1: rule__Federation__Group__1 : rule__Federation__Group__1__Impl rule__Federation__Group__2 ;
    public final void rule__Federation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:942:1: ( rule__Federation__Group__1__Impl rule__Federation__Group__2 )
            // InternalFom.g:943:2: rule__Federation__Group__1__Impl rule__Federation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Federation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Federation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__Group__1"


    // $ANTLR start "rule__Federation__Group__1__Impl"
    // InternalFom.g:950:1: rule__Federation__Group__1__Impl : ( 'Federation' ) ;
    public final void rule__Federation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:954:1: ( ( 'Federation' ) )
            // InternalFom.g:955:1: ( 'Federation' )
            {
            // InternalFom.g:955:1: ( 'Federation' )
            // InternalFom.g:956:2: 'Federation'
            {
             before(grammarAccess.getFederationAccess().getFederationKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFederationAccess().getFederationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__Group__1__Impl"


    // $ANTLR start "rule__Federation__Group__2"
    // InternalFom.g:965:1: rule__Federation__Group__2 : rule__Federation__Group__2__Impl rule__Federation__Group__3 ;
    public final void rule__Federation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:969:1: ( rule__Federation__Group__2__Impl rule__Federation__Group__3 )
            // InternalFom.g:970:2: rule__Federation__Group__2__Impl rule__Federation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Federation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Federation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__Group__2"


    // $ANTLR start "rule__Federation__Group__2__Impl"
    // InternalFom.g:977:1: rule__Federation__Group__2__Impl : ( ( rule__Federation__NameAssignment_2 ) ) ;
    public final void rule__Federation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:981:1: ( ( ( rule__Federation__NameAssignment_2 ) ) )
            // InternalFom.g:982:1: ( ( rule__Federation__NameAssignment_2 ) )
            {
            // InternalFom.g:982:1: ( ( rule__Federation__NameAssignment_2 ) )
            // InternalFom.g:983:2: ( rule__Federation__NameAssignment_2 )
            {
             before(grammarAccess.getFederationAccess().getNameAssignment_2()); 
            // InternalFom.g:984:2: ( rule__Federation__NameAssignment_2 )
            // InternalFom.g:984:3: rule__Federation__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Federation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFederationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__Group__2__Impl"


    // $ANTLR start "rule__Federation__Group__3"
    // InternalFom.g:992:1: rule__Federation__Group__3 : rule__Federation__Group__3__Impl ;
    public final void rule__Federation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:996:1: ( rule__Federation__Group__3__Impl )
            // InternalFom.g:997:2: rule__Federation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Federation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__Group__3"


    // $ANTLR start "rule__Federation__Group__3__Impl"
    // InternalFom.g:1003:1: rule__Federation__Group__3__Impl : ( ')' ) ;
    public final void rule__Federation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1007:1: ( ( ')' ) )
            // InternalFom.g:1008:1: ( ')' )
            {
            // InternalFom.g:1008:1: ( ')' )
            // InternalFom.g:1009:2: ')'
            {
             before(grammarAccess.getFederationAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFederationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__Group__3__Impl"


    // $ANTLR start "rule__FEDversion__Group__0"
    // InternalFom.g:1019:1: rule__FEDversion__Group__0 : rule__FEDversion__Group__0__Impl rule__FEDversion__Group__1 ;
    public final void rule__FEDversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1023:1: ( rule__FEDversion__Group__0__Impl rule__FEDversion__Group__1 )
            // InternalFom.g:1024:2: rule__FEDversion__Group__0__Impl rule__FEDversion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__FEDversion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FEDversion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FEDversion__Group__0"


    // $ANTLR start "rule__FEDversion__Group__0__Impl"
    // InternalFom.g:1031:1: rule__FEDversion__Group__0__Impl : ( '(' ) ;
    public final void rule__FEDversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1035:1: ( ( '(' ) )
            // InternalFom.g:1036:1: ( '(' )
            {
            // InternalFom.g:1036:1: ( '(' )
            // InternalFom.g:1037:2: '('
            {
             before(grammarAccess.getFEDversionAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFEDversionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FEDversion__Group__0__Impl"


    // $ANTLR start "rule__FEDversion__Group__1"
    // InternalFom.g:1046:1: rule__FEDversion__Group__1 : rule__FEDversion__Group__1__Impl rule__FEDversion__Group__2 ;
    public final void rule__FEDversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1050:1: ( rule__FEDversion__Group__1__Impl rule__FEDversion__Group__2 )
            // InternalFom.g:1051:2: rule__FEDversion__Group__1__Impl rule__FEDversion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__FEDversion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FEDversion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FEDversion__Group__1"


    // $ANTLR start "rule__FEDversion__Group__1__Impl"
    // InternalFom.g:1058:1: rule__FEDversion__Group__1__Impl : ( 'FEDversion' ) ;
    public final void rule__FEDversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1062:1: ( ( 'FEDversion' ) )
            // InternalFom.g:1063:1: ( 'FEDversion' )
            {
            // InternalFom.g:1063:1: ( 'FEDversion' )
            // InternalFom.g:1064:2: 'FEDversion'
            {
             before(grammarAccess.getFEDversionAccess().getFEDversionKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFEDversionAccess().getFEDversionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FEDversion__Group__1__Impl"


    // $ANTLR start "rule__FEDversion__Group__2"
    // InternalFom.g:1073:1: rule__FEDversion__Group__2 : rule__FEDversion__Group__2__Impl rule__FEDversion__Group__3 ;
    public final void rule__FEDversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1077:1: ( rule__FEDversion__Group__2__Impl rule__FEDversion__Group__3 )
            // InternalFom.g:1078:2: rule__FEDversion__Group__2__Impl rule__FEDversion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__FEDversion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FEDversion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FEDversion__Group__2"


    // $ANTLR start "rule__FEDversion__Group__2__Impl"
    // InternalFom.g:1085:1: rule__FEDversion__Group__2__Impl : ( ( rule__FEDversion__VersionAssignment_2 ) ) ;
    public final void rule__FEDversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1089:1: ( ( ( rule__FEDversion__VersionAssignment_2 ) ) )
            // InternalFom.g:1090:1: ( ( rule__FEDversion__VersionAssignment_2 ) )
            {
            // InternalFom.g:1090:1: ( ( rule__FEDversion__VersionAssignment_2 ) )
            // InternalFom.g:1091:2: ( rule__FEDversion__VersionAssignment_2 )
            {
             before(grammarAccess.getFEDversionAccess().getVersionAssignment_2()); 
            // InternalFom.g:1092:2: ( rule__FEDversion__VersionAssignment_2 )
            // InternalFom.g:1092:3: rule__FEDversion__VersionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FEDversion__VersionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFEDversionAccess().getVersionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FEDversion__Group__2__Impl"


    // $ANTLR start "rule__FEDversion__Group__3"
    // InternalFom.g:1100:1: rule__FEDversion__Group__3 : rule__FEDversion__Group__3__Impl ;
    public final void rule__FEDversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1104:1: ( rule__FEDversion__Group__3__Impl )
            // InternalFom.g:1105:2: rule__FEDversion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FEDversion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FEDversion__Group__3"


    // $ANTLR start "rule__FEDversion__Group__3__Impl"
    // InternalFom.g:1111:1: rule__FEDversion__Group__3__Impl : ( ')' ) ;
    public final void rule__FEDversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1115:1: ( ( ')' ) )
            // InternalFom.g:1116:1: ( ')' )
            {
            // InternalFom.g:1116:1: ( ')' )
            // InternalFom.g:1117:2: ')'
            {
             before(grammarAccess.getFEDversionAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFEDversionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FEDversion__Group__3__Impl"


    // $ANTLR start "rule__Space__Group__0"
    // InternalFom.g:1127:1: rule__Space__Group__0 : rule__Space__Group__0__Impl rule__Space__Group__1 ;
    public final void rule__Space__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1131:1: ( rule__Space__Group__0__Impl rule__Space__Group__1 )
            // InternalFom.g:1132:2: rule__Space__Group__0__Impl rule__Space__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Space__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Space__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__0"


    // $ANTLR start "rule__Space__Group__0__Impl"
    // InternalFom.g:1139:1: rule__Space__Group__0__Impl : ( '(' ) ;
    public final void rule__Space__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1143:1: ( ( '(' ) )
            // InternalFom.g:1144:1: ( '(' )
            {
            // InternalFom.g:1144:1: ( '(' )
            // InternalFom.g:1145:2: '('
            {
             before(grammarAccess.getSpaceAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSpaceAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__0__Impl"


    // $ANTLR start "rule__Space__Group__1"
    // InternalFom.g:1154:1: rule__Space__Group__1 : rule__Space__Group__1__Impl rule__Space__Group__2 ;
    public final void rule__Space__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1158:1: ( rule__Space__Group__1__Impl rule__Space__Group__2 )
            // InternalFom.g:1159:2: rule__Space__Group__1__Impl rule__Space__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Space__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Space__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__1"


    // $ANTLR start "rule__Space__Group__1__Impl"
    // InternalFom.g:1166:1: rule__Space__Group__1__Impl : ( 'space' ) ;
    public final void rule__Space__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1170:1: ( ( 'space' ) )
            // InternalFom.g:1171:1: ( 'space' )
            {
            // InternalFom.g:1171:1: ( 'space' )
            // InternalFom.g:1172:2: 'space'
            {
             before(grammarAccess.getSpaceAccess().getSpaceKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSpaceAccess().getSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__1__Impl"


    // $ANTLR start "rule__Space__Group__2"
    // InternalFom.g:1181:1: rule__Space__Group__2 : rule__Space__Group__2__Impl rule__Space__Group__3 ;
    public final void rule__Space__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1185:1: ( rule__Space__Group__2__Impl rule__Space__Group__3 )
            // InternalFom.g:1186:2: rule__Space__Group__2__Impl rule__Space__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Space__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Space__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__2"


    // $ANTLR start "rule__Space__Group__2__Impl"
    // InternalFom.g:1193:1: rule__Space__Group__2__Impl : ( ( rule__Space__NameAssignment_2 ) ) ;
    public final void rule__Space__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1197:1: ( ( ( rule__Space__NameAssignment_2 ) ) )
            // InternalFom.g:1198:1: ( ( rule__Space__NameAssignment_2 ) )
            {
            // InternalFom.g:1198:1: ( ( rule__Space__NameAssignment_2 ) )
            // InternalFom.g:1199:2: ( rule__Space__NameAssignment_2 )
            {
             before(grammarAccess.getSpaceAccess().getNameAssignment_2()); 
            // InternalFom.g:1200:2: ( rule__Space__NameAssignment_2 )
            // InternalFom.g:1200:3: rule__Space__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Space__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpaceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__2__Impl"


    // $ANTLR start "rule__Space__Group__3"
    // InternalFom.g:1208:1: rule__Space__Group__3 : rule__Space__Group__3__Impl rule__Space__Group__4 ;
    public final void rule__Space__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1212:1: ( rule__Space__Group__3__Impl rule__Space__Group__4 )
            // InternalFom.g:1213:2: rule__Space__Group__3__Impl rule__Space__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Space__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Space__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__3"


    // $ANTLR start "rule__Space__Group__3__Impl"
    // InternalFom.g:1220:1: rule__Space__Group__3__Impl : ( ( rule__Space__DimensionsAssignment_3 )* ) ;
    public final void rule__Space__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1224:1: ( ( ( rule__Space__DimensionsAssignment_3 )* ) )
            // InternalFom.g:1225:1: ( ( rule__Space__DimensionsAssignment_3 )* )
            {
            // InternalFom.g:1225:1: ( ( rule__Space__DimensionsAssignment_3 )* )
            // InternalFom.g:1226:2: ( rule__Space__DimensionsAssignment_3 )*
            {
             before(grammarAccess.getSpaceAccess().getDimensionsAssignment_3()); 
            // InternalFom.g:1227:2: ( rule__Space__DimensionsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFom.g:1227:3: rule__Space__DimensionsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Space__DimensionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSpaceAccess().getDimensionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__3__Impl"


    // $ANTLR start "rule__Space__Group__4"
    // InternalFom.g:1235:1: rule__Space__Group__4 : rule__Space__Group__4__Impl ;
    public final void rule__Space__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1239:1: ( rule__Space__Group__4__Impl )
            // InternalFom.g:1240:2: rule__Space__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Space__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__4"


    // $ANTLR start "rule__Space__Group__4__Impl"
    // InternalFom.g:1246:1: rule__Space__Group__4__Impl : ( ')' ) ;
    public final void rule__Space__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1250:1: ( ( ')' ) )
            // InternalFom.g:1251:1: ( ')' )
            {
            // InternalFom.g:1251:1: ( ')' )
            // InternalFom.g:1252:2: ')'
            {
             before(grammarAccess.getSpaceAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSpaceAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Group__4__Impl"


    // $ANTLR start "rule__Dimension__Group__0"
    // InternalFom.g:1262:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1266:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // InternalFom.g:1267:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Dimension__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Dimension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__0"


    // $ANTLR start "rule__Dimension__Group__0__Impl"
    // InternalFom.g:1274:1: rule__Dimension__Group__0__Impl : ( '(' ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1278:1: ( ( '(' ) )
            // InternalFom.g:1279:1: ( '(' )
            {
            // InternalFom.g:1279:1: ( '(' )
            // InternalFom.g:1280:2: '('
            {
             before(grammarAccess.getDimensionAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__0__Impl"


    // $ANTLR start "rule__Dimension__Group__1"
    // InternalFom.g:1289:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1293:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // InternalFom.g:1294:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Dimension__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Dimension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__1"


    // $ANTLR start "rule__Dimension__Group__1__Impl"
    // InternalFom.g:1301:1: rule__Dimension__Group__1__Impl : ( 'dimension' ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1305:1: ( ( 'dimension' ) )
            // InternalFom.g:1306:1: ( 'dimension' )
            {
            // InternalFom.g:1306:1: ( 'dimension' )
            // InternalFom.g:1307:2: 'dimension'
            {
             before(grammarAccess.getDimensionAccess().getDimensionKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getDimensionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__1__Impl"


    // $ANTLR start "rule__Dimension__Group__2"
    // InternalFom.g:1316:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl rule__Dimension__Group__3 ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1320:1: ( rule__Dimension__Group__2__Impl rule__Dimension__Group__3 )
            // InternalFom.g:1321:2: rule__Dimension__Group__2__Impl rule__Dimension__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Dimension__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Dimension__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__2"


    // $ANTLR start "rule__Dimension__Group__2__Impl"
    // InternalFom.g:1328:1: rule__Dimension__Group__2__Impl : ( ( rule__Dimension__NameAssignment_2 ) ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1332:1: ( ( ( rule__Dimension__NameAssignment_2 ) ) )
            // InternalFom.g:1333:1: ( ( rule__Dimension__NameAssignment_2 ) )
            {
            // InternalFom.g:1333:1: ( ( rule__Dimension__NameAssignment_2 ) )
            // InternalFom.g:1334:2: ( rule__Dimension__NameAssignment_2 )
            {
             before(grammarAccess.getDimensionAccess().getNameAssignment_2()); 
            // InternalFom.g:1335:2: ( rule__Dimension__NameAssignment_2 )
            // InternalFom.g:1335:3: rule__Dimension__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Dimension__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__2__Impl"


    // $ANTLR start "rule__Dimension__Group__3"
    // InternalFom.g:1343:1: rule__Dimension__Group__3 : rule__Dimension__Group__3__Impl ;
    public final void rule__Dimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1347:1: ( rule__Dimension__Group__3__Impl )
            // InternalFom.g:1348:2: rule__Dimension__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Dimension__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__3"


    // $ANTLR start "rule__Dimension__Group__3__Impl"
    // InternalFom.g:1354:1: rule__Dimension__Group__3__Impl : ( ')' ) ;
    public final void rule__Dimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1358:1: ( ( ')' ) )
            // InternalFom.g:1359:1: ( ')' )
            {
            // InternalFom.g:1359:1: ( ')' )
            // InternalFom.g:1360:2: ')'
            {
             before(grammarAccess.getDimensionAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__3__Impl"


    // $ANTLR start "rule__AttributeClass__Group__0"
    // InternalFom.g:1370:1: rule__AttributeClass__Group__0 : rule__AttributeClass__Group__0__Impl rule__AttributeClass__Group__1 ;
    public final void rule__AttributeClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1374:1: ( rule__AttributeClass__Group__0__Impl rule__AttributeClass__Group__1 )
            // InternalFom.g:1375:2: rule__AttributeClass__Group__0__Impl rule__AttributeClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__AttributeClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__0"


    // $ANTLR start "rule__AttributeClass__Group__0__Impl"
    // InternalFom.g:1382:1: rule__AttributeClass__Group__0__Impl : ( '(' ) ;
    public final void rule__AttributeClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1386:1: ( ( '(' ) )
            // InternalFom.g:1387:1: ( '(' )
            {
            // InternalFom.g:1387:1: ( '(' )
            // InternalFom.g:1388:2: '('
            {
             before(grammarAccess.getAttributeClassAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeClassAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__0__Impl"


    // $ANTLR start "rule__AttributeClass__Group__1"
    // InternalFom.g:1397:1: rule__AttributeClass__Group__1 : rule__AttributeClass__Group__1__Impl rule__AttributeClass__Group__2 ;
    public final void rule__AttributeClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1401:1: ( rule__AttributeClass__Group__1__Impl rule__AttributeClass__Group__2 )
            // InternalFom.g:1402:2: rule__AttributeClass__Group__1__Impl rule__AttributeClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AttributeClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__1"


    // $ANTLR start "rule__AttributeClass__Group__1__Impl"
    // InternalFom.g:1409:1: rule__AttributeClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__AttributeClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1413:1: ( ( 'class' ) )
            // InternalFom.g:1414:1: ( 'class' )
            {
            // InternalFom.g:1414:1: ( 'class' )
            // InternalFom.g:1415:2: 'class'
            {
             before(grammarAccess.getAttributeClassAccess().getClassKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__1__Impl"


    // $ANTLR start "rule__AttributeClass__Group__2"
    // InternalFom.g:1424:1: rule__AttributeClass__Group__2 : rule__AttributeClass__Group__2__Impl rule__AttributeClass__Group__3 ;
    public final void rule__AttributeClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1428:1: ( rule__AttributeClass__Group__2__Impl rule__AttributeClass__Group__3 )
            // InternalFom.g:1429:2: rule__AttributeClass__Group__2__Impl rule__AttributeClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AttributeClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__2"


    // $ANTLR start "rule__AttributeClass__Group__2__Impl"
    // InternalFom.g:1436:1: rule__AttributeClass__Group__2__Impl : ( ( rule__AttributeClass__NameAssignment_2 ) ) ;
    public final void rule__AttributeClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1440:1: ( ( ( rule__AttributeClass__NameAssignment_2 ) ) )
            // InternalFom.g:1441:1: ( ( rule__AttributeClass__NameAssignment_2 ) )
            {
            // InternalFom.g:1441:1: ( ( rule__AttributeClass__NameAssignment_2 ) )
            // InternalFom.g:1442:2: ( rule__AttributeClass__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeClassAccess().getNameAssignment_2()); 
            // InternalFom.g:1443:2: ( rule__AttributeClass__NameAssignment_2 )
            // InternalFom.g:1443:3: rule__AttributeClass__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__2__Impl"


    // $ANTLR start "rule__AttributeClass__Group__3"
    // InternalFom.g:1451:1: rule__AttributeClass__Group__3 : rule__AttributeClass__Group__3__Impl rule__AttributeClass__Group__4 ;
    public final void rule__AttributeClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1455:1: ( rule__AttributeClass__Group__3__Impl rule__AttributeClass__Group__4 )
            // InternalFom.g:1456:2: rule__AttributeClass__Group__3__Impl rule__AttributeClass__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AttributeClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__3"


    // $ANTLR start "rule__AttributeClass__Group__3__Impl"
    // InternalFom.g:1463:1: rule__AttributeClass__Group__3__Impl : ( ( rule__AttributeClass__AttributesAssignment_3 )* ) ;
    public final void rule__AttributeClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1467:1: ( ( ( rule__AttributeClass__AttributesAssignment_3 )* ) )
            // InternalFom.g:1468:1: ( ( rule__AttributeClass__AttributesAssignment_3 )* )
            {
            // InternalFom.g:1468:1: ( ( rule__AttributeClass__AttributesAssignment_3 )* )
            // InternalFom.g:1469:2: ( rule__AttributeClass__AttributesAssignment_3 )*
            {
             before(grammarAccess.getAttributeClassAccess().getAttributesAssignment_3()); 
            // InternalFom.g:1470:2: ( rule__AttributeClass__AttributesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==19) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalFom.g:1470:3: rule__AttributeClass__AttributesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__AttributeClass__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAttributeClassAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__3__Impl"


    // $ANTLR start "rule__AttributeClass__Group__4"
    // InternalFom.g:1478:1: rule__AttributeClass__Group__4 : rule__AttributeClass__Group__4__Impl rule__AttributeClass__Group__5 ;
    public final void rule__AttributeClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1482:1: ( rule__AttributeClass__Group__4__Impl rule__AttributeClass__Group__5 )
            // InternalFom.g:1483:2: rule__AttributeClass__Group__4__Impl rule__AttributeClass__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AttributeClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__4"


    // $ANTLR start "rule__AttributeClass__Group__4__Impl"
    // InternalFom.g:1490:1: rule__AttributeClass__Group__4__Impl : ( ( rule__AttributeClass__ClassesAssignment_4 )* ) ;
    public final void rule__AttributeClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1494:1: ( ( ( rule__AttributeClass__ClassesAssignment_4 )* ) )
            // InternalFom.g:1495:1: ( ( rule__AttributeClass__ClassesAssignment_4 )* )
            {
            // InternalFom.g:1495:1: ( ( rule__AttributeClass__ClassesAssignment_4 )* )
            // InternalFom.g:1496:2: ( rule__AttributeClass__ClassesAssignment_4 )*
            {
             before(grammarAccess.getAttributeClassAccess().getClassesAssignment_4()); 
            // InternalFom.g:1497:2: ( rule__AttributeClass__ClassesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFom.g:1497:3: rule__AttributeClass__ClassesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__AttributeClass__ClassesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAttributeClassAccess().getClassesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__4__Impl"


    // $ANTLR start "rule__AttributeClass__Group__5"
    // InternalFom.g:1505:1: rule__AttributeClass__Group__5 : rule__AttributeClass__Group__5__Impl ;
    public final void rule__AttributeClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1509:1: ( rule__AttributeClass__Group__5__Impl )
            // InternalFom.g:1510:2: rule__AttributeClass__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeClass__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__5"


    // $ANTLR start "rule__AttributeClass__Group__5__Impl"
    // InternalFom.g:1516:1: rule__AttributeClass__Group__5__Impl : ( ')' ) ;
    public final void rule__AttributeClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1520:1: ( ( ')' ) )
            // InternalFom.g:1521:1: ( ')' )
            {
            // InternalFom.g:1521:1: ( ')' )
            // InternalFom.g:1522:2: ')'
            {
             before(grammarAccess.getAttributeClassAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeClassAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalFom.g:1532:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1536:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFom.g:1537:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalFom.g:1544:1: rule__Attribute__Group__0__Impl : ( '(' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1548:1: ( ( '(' ) )
            // InternalFom.g:1549:1: ( '(' )
            {
            // InternalFom.g:1549:1: ( '(' )
            // InternalFom.g:1550:2: '('
            {
             before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalFom.g:1559:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1563:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalFom.g:1564:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalFom.g:1571:1: rule__Attribute__Group__1__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1575:1: ( ( 'attribute' ) )
            // InternalFom.g:1576:1: ( 'attribute' )
            {
            // InternalFom.g:1576:1: ( 'attribute' )
            // InternalFom.g:1577:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalFom.g:1586:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1590:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalFom.g:1591:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalFom.g:1598:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1602:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalFom.g:1603:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalFom.g:1603:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalFom.g:1604:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalFom.g:1605:2: ( rule__Attribute__NameAssignment_2 )
            // InternalFom.g:1605:3: rule__Attribute__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalFom.g:1613:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1617:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalFom.g:1618:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalFom.g:1625:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TransportAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1629:1: ( ( ( rule__Attribute__TransportAssignment_3 ) ) )
            // InternalFom.g:1630:1: ( ( rule__Attribute__TransportAssignment_3 ) )
            {
            // InternalFom.g:1630:1: ( ( rule__Attribute__TransportAssignment_3 ) )
            // InternalFom.g:1631:2: ( rule__Attribute__TransportAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTransportAssignment_3()); 
            // InternalFom.g:1632:2: ( rule__Attribute__TransportAssignment_3 )
            // InternalFom.g:1632:3: rule__Attribute__TransportAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__TransportAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTransportAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalFom.g:1640:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1644:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalFom.g:1645:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalFom.g:1652:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__OrderAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1656:1: ( ( ( rule__Attribute__OrderAssignment_4 ) ) )
            // InternalFom.g:1657:1: ( ( rule__Attribute__OrderAssignment_4 ) )
            {
            // InternalFom.g:1657:1: ( ( rule__Attribute__OrderAssignment_4 ) )
            // InternalFom.g:1658:2: ( rule__Attribute__OrderAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getOrderAssignment_4()); 
            // InternalFom.g:1659:2: ( rule__Attribute__OrderAssignment_4 )
            // InternalFom.g:1659:3: rule__Attribute__OrderAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__OrderAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getOrderAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalFom.g:1667:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1671:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalFom.g:1672:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalFom.g:1679:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__SpaceAssignment_5 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1683:1: ( ( ( rule__Attribute__SpaceAssignment_5 )? ) )
            // InternalFom.g:1684:1: ( ( rule__Attribute__SpaceAssignment_5 )? )
            {
            // InternalFom.g:1684:1: ( ( rule__Attribute__SpaceAssignment_5 )? )
            // InternalFom.g:1685:2: ( rule__Attribute__SpaceAssignment_5 )?
            {
             before(grammarAccess.getAttributeAccess().getSpaceAssignment_5()); 
            // InternalFom.g:1686:2: ( rule__Attribute__SpaceAssignment_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFom.g:1686:3: rule__Attribute__SpaceAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute__SpaceAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getSpaceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalFom.g:1694:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1698:1: ( rule__Attribute__Group__6__Impl )
            // InternalFom.g:1699:2: rule__Attribute__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalFom.g:1705:1: rule__Attribute__Group__6__Impl : ( ')' ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1709:1: ( ( ')' ) )
            // InternalFom.g:1710:1: ( ')' )
            {
            // InternalFom.g:1710:1: ( ')' )
            // InternalFom.g:1711:2: ')'
            {
             before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__InteractionClass__Group__0"
    // InternalFom.g:1721:1: rule__InteractionClass__Group__0 : rule__InteractionClass__Group__0__Impl rule__InteractionClass__Group__1 ;
    public final void rule__InteractionClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1725:1: ( rule__InteractionClass__Group__0__Impl rule__InteractionClass__Group__1 )
            // InternalFom.g:1726:2: rule__InteractionClass__Group__0__Impl rule__InteractionClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__InteractionClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__0"


    // $ANTLR start "rule__InteractionClass__Group__0__Impl"
    // InternalFom.g:1733:1: rule__InteractionClass__Group__0__Impl : ( '(' ) ;
    public final void rule__InteractionClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1737:1: ( ( '(' ) )
            // InternalFom.g:1738:1: ( '(' )
            {
            // InternalFom.g:1738:1: ( '(' )
            // InternalFom.g:1739:2: '('
            {
             before(grammarAccess.getInteractionClassAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInteractionClassAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__0__Impl"


    // $ANTLR start "rule__InteractionClass__Group__1"
    // InternalFom.g:1748:1: rule__InteractionClass__Group__1 : rule__InteractionClass__Group__1__Impl rule__InteractionClass__Group__2 ;
    public final void rule__InteractionClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1752:1: ( rule__InteractionClass__Group__1__Impl rule__InteractionClass__Group__2 )
            // InternalFom.g:1753:2: rule__InteractionClass__Group__1__Impl rule__InteractionClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__InteractionClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__1"


    // $ANTLR start "rule__InteractionClass__Group__1__Impl"
    // InternalFom.g:1760:1: rule__InteractionClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__InteractionClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1764:1: ( ( 'class' ) )
            // InternalFom.g:1765:1: ( 'class' )
            {
            // InternalFom.g:1765:1: ( 'class' )
            // InternalFom.g:1766:2: 'class'
            {
             before(grammarAccess.getInteractionClassAccess().getClassKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInteractionClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__1__Impl"


    // $ANTLR start "rule__InteractionClass__Group__2"
    // InternalFom.g:1775:1: rule__InteractionClass__Group__2 : rule__InteractionClass__Group__2__Impl rule__InteractionClass__Group__3 ;
    public final void rule__InteractionClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1779:1: ( rule__InteractionClass__Group__2__Impl rule__InteractionClass__Group__3 )
            // InternalFom.g:1780:2: rule__InteractionClass__Group__2__Impl rule__InteractionClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__InteractionClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__2"


    // $ANTLR start "rule__InteractionClass__Group__2__Impl"
    // InternalFom.g:1787:1: rule__InteractionClass__Group__2__Impl : ( ( rule__InteractionClass__NameAssignment_2 ) ) ;
    public final void rule__InteractionClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1791:1: ( ( ( rule__InteractionClass__NameAssignment_2 ) ) )
            // InternalFom.g:1792:1: ( ( rule__InteractionClass__NameAssignment_2 ) )
            {
            // InternalFom.g:1792:1: ( ( rule__InteractionClass__NameAssignment_2 ) )
            // InternalFom.g:1793:2: ( rule__InteractionClass__NameAssignment_2 )
            {
             before(grammarAccess.getInteractionClassAccess().getNameAssignment_2()); 
            // InternalFom.g:1794:2: ( rule__InteractionClass__NameAssignment_2 )
            // InternalFom.g:1794:3: rule__InteractionClass__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInteractionClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__2__Impl"


    // $ANTLR start "rule__InteractionClass__Group__3"
    // InternalFom.g:1802:1: rule__InteractionClass__Group__3 : rule__InteractionClass__Group__3__Impl rule__InteractionClass__Group__4 ;
    public final void rule__InteractionClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1806:1: ( rule__InteractionClass__Group__3__Impl rule__InteractionClass__Group__4 )
            // InternalFom.g:1807:2: rule__InteractionClass__Group__3__Impl rule__InteractionClass__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__InteractionClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__3"


    // $ANTLR start "rule__InteractionClass__Group__3__Impl"
    // InternalFom.g:1814:1: rule__InteractionClass__Group__3__Impl : ( ( rule__InteractionClass__TransportAssignment_3 ) ) ;
    public final void rule__InteractionClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1818:1: ( ( ( rule__InteractionClass__TransportAssignment_3 ) ) )
            // InternalFom.g:1819:1: ( ( rule__InteractionClass__TransportAssignment_3 ) )
            {
            // InternalFom.g:1819:1: ( ( rule__InteractionClass__TransportAssignment_3 ) )
            // InternalFom.g:1820:2: ( rule__InteractionClass__TransportAssignment_3 )
            {
             before(grammarAccess.getInteractionClassAccess().getTransportAssignment_3()); 
            // InternalFom.g:1821:2: ( rule__InteractionClass__TransportAssignment_3 )
            // InternalFom.g:1821:3: rule__InteractionClass__TransportAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__TransportAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInteractionClassAccess().getTransportAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__3__Impl"


    // $ANTLR start "rule__InteractionClass__Group__4"
    // InternalFom.g:1829:1: rule__InteractionClass__Group__4 : rule__InteractionClass__Group__4__Impl rule__InteractionClass__Group__5 ;
    public final void rule__InteractionClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1833:1: ( rule__InteractionClass__Group__4__Impl rule__InteractionClass__Group__5 )
            // InternalFom.g:1834:2: rule__InteractionClass__Group__4__Impl rule__InteractionClass__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__InteractionClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__4"


    // $ANTLR start "rule__InteractionClass__Group__4__Impl"
    // InternalFom.g:1841:1: rule__InteractionClass__Group__4__Impl : ( ( rule__InteractionClass__OrderAssignment_4 ) ) ;
    public final void rule__InteractionClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1845:1: ( ( ( rule__InteractionClass__OrderAssignment_4 ) ) )
            // InternalFom.g:1846:1: ( ( rule__InteractionClass__OrderAssignment_4 ) )
            {
            // InternalFom.g:1846:1: ( ( rule__InteractionClass__OrderAssignment_4 ) )
            // InternalFom.g:1847:2: ( rule__InteractionClass__OrderAssignment_4 )
            {
             before(grammarAccess.getInteractionClassAccess().getOrderAssignment_4()); 
            // InternalFom.g:1848:2: ( rule__InteractionClass__OrderAssignment_4 )
            // InternalFom.g:1848:3: rule__InteractionClass__OrderAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__OrderAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInteractionClassAccess().getOrderAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__4__Impl"


    // $ANTLR start "rule__InteractionClass__Group__5"
    // InternalFom.g:1856:1: rule__InteractionClass__Group__5 : rule__InteractionClass__Group__5__Impl rule__InteractionClass__Group__6 ;
    public final void rule__InteractionClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1860:1: ( rule__InteractionClass__Group__5__Impl rule__InteractionClass__Group__6 )
            // InternalFom.g:1861:2: rule__InteractionClass__Group__5__Impl rule__InteractionClass__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__InteractionClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__5"


    // $ANTLR start "rule__InteractionClass__Group__5__Impl"
    // InternalFom.g:1868:1: rule__InteractionClass__Group__5__Impl : ( ( rule__InteractionClass__SpaceAssignment_5 )? ) ;
    public final void rule__InteractionClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1872:1: ( ( ( rule__InteractionClass__SpaceAssignment_5 )? ) )
            // InternalFom.g:1873:1: ( ( rule__InteractionClass__SpaceAssignment_5 )? )
            {
            // InternalFom.g:1873:1: ( ( rule__InteractionClass__SpaceAssignment_5 )? )
            // InternalFom.g:1874:2: ( rule__InteractionClass__SpaceAssignment_5 )?
            {
             before(grammarAccess.getInteractionClassAccess().getSpaceAssignment_5()); 
            // InternalFom.g:1875:2: ( rule__InteractionClass__SpaceAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFom.g:1875:3: rule__InteractionClass__SpaceAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__InteractionClass__SpaceAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractionClassAccess().getSpaceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__5__Impl"


    // $ANTLR start "rule__InteractionClass__Group__6"
    // InternalFom.g:1883:1: rule__InteractionClass__Group__6 : rule__InteractionClass__Group__6__Impl rule__InteractionClass__Group__7 ;
    public final void rule__InteractionClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1887:1: ( rule__InteractionClass__Group__6__Impl rule__InteractionClass__Group__7 )
            // InternalFom.g:1888:2: rule__InteractionClass__Group__6__Impl rule__InteractionClass__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__InteractionClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__6"


    // $ANTLR start "rule__InteractionClass__Group__6__Impl"
    // InternalFom.g:1895:1: rule__InteractionClass__Group__6__Impl : ( ( rule__InteractionClass__ParametersAssignment_6 )* ) ;
    public final void rule__InteractionClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1899:1: ( ( ( rule__InteractionClass__ParametersAssignment_6 )* ) )
            // InternalFom.g:1900:1: ( ( rule__InteractionClass__ParametersAssignment_6 )* )
            {
            // InternalFom.g:1900:1: ( ( rule__InteractionClass__ParametersAssignment_6 )* )
            // InternalFom.g:1901:2: ( rule__InteractionClass__ParametersAssignment_6 )*
            {
             before(grammarAccess.getInteractionClassAccess().getParametersAssignment_6()); 
            // InternalFom.g:1902:2: ( rule__InteractionClass__ParametersAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==29) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalFom.g:1902:3: rule__InteractionClass__ParametersAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__InteractionClass__ParametersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInteractionClassAccess().getParametersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__6__Impl"


    // $ANTLR start "rule__InteractionClass__Group__7"
    // InternalFom.g:1910:1: rule__InteractionClass__Group__7 : rule__InteractionClass__Group__7__Impl rule__InteractionClass__Group__8 ;
    public final void rule__InteractionClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1914:1: ( rule__InteractionClass__Group__7__Impl rule__InteractionClass__Group__8 )
            // InternalFom.g:1915:2: rule__InteractionClass__Group__7__Impl rule__InteractionClass__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__InteractionClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__7"


    // $ANTLR start "rule__InteractionClass__Group__7__Impl"
    // InternalFom.g:1922:1: rule__InteractionClass__Group__7__Impl : ( ( rule__InteractionClass__ClassesAssignment_7 )* ) ;
    public final void rule__InteractionClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1926:1: ( ( ( rule__InteractionClass__ClassesAssignment_7 )* ) )
            // InternalFom.g:1927:1: ( ( rule__InteractionClass__ClassesAssignment_7 )* )
            {
            // InternalFom.g:1927:1: ( ( rule__InteractionClass__ClassesAssignment_7 )* )
            // InternalFom.g:1928:2: ( rule__InteractionClass__ClassesAssignment_7 )*
            {
             before(grammarAccess.getInteractionClassAccess().getClassesAssignment_7()); 
            // InternalFom.g:1929:2: ( rule__InteractionClass__ClassesAssignment_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFom.g:1929:3: rule__InteractionClass__ClassesAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__InteractionClass__ClassesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInteractionClassAccess().getClassesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__7__Impl"


    // $ANTLR start "rule__InteractionClass__Group__8"
    // InternalFom.g:1937:1: rule__InteractionClass__Group__8 : rule__InteractionClass__Group__8__Impl ;
    public final void rule__InteractionClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1941:1: ( rule__InteractionClass__Group__8__Impl )
            // InternalFom.g:1942:2: rule__InteractionClass__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__8"


    // $ANTLR start "rule__InteractionClass__Group__8__Impl"
    // InternalFom.g:1948:1: rule__InteractionClass__Group__8__Impl : ( ')' ) ;
    public final void rule__InteractionClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1952:1: ( ( ')' ) )
            // InternalFom.g:1953:1: ( ')' )
            {
            // InternalFom.g:1953:1: ( ')' )
            // InternalFom.g:1954:2: ')'
            {
             before(grammarAccess.getInteractionClassAccess().getRightParenthesisKeyword_8()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInteractionClassAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__Group__8__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalFom.g:1964:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1968:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalFom.g:1969:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalFom.g:1976:1: rule__Parameter__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1980:1: ( ( '(' ) )
            // InternalFom.g:1981:1: ( '(' )
            {
            // InternalFom.g:1981:1: ( '(' )
            // InternalFom.g:1982:2: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalFom.g:1991:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:1995:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalFom.g:1996:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalFom.g:2003:1: rule__Parameter__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2007:1: ( ( 'parameter' ) )
            // InternalFom.g:2008:1: ( 'parameter' )
            {
            // InternalFom.g:2008:1: ( 'parameter' )
            // InternalFom.g:2009:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalFom.g:2018:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2022:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalFom.g:2023:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalFom.g:2030:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2034:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalFom.g:2035:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalFom.g:2035:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalFom.g:2036:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalFom.g:2037:2: ( rule__Parameter__NameAssignment_2 )
            // InternalFom.g:2037:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalFom.g:2045:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2049:1: ( rule__Parameter__Group__3__Impl )
            // InternalFom.g:2050:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalFom.g:2056:1: rule__Parameter__Group__3__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2060:1: ( ( ')' ) )
            // InternalFom.g:2061:1: ( ')' )
            {
            // InternalFom.g:2061:1: ( ')' )
            // InternalFom.g:2062:2: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Fed__FederationAssignment_2"
    // InternalFom.g:2072:1: rule__Fed__FederationAssignment_2 : ( ruleFederation ) ;
    public final void rule__Fed__FederationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2076:1: ( ( ruleFederation ) )
            // InternalFom.g:2077:2: ( ruleFederation )
            {
            // InternalFom.g:2077:2: ( ruleFederation )
            // InternalFom.g:2078:3: ruleFederation
            {
             before(grammarAccess.getFedAccess().getFederationFederationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFederation();

            state._fsp--;

             after(grammarAccess.getFedAccess().getFederationFederationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__FederationAssignment_2"


    // $ANTLR start "rule__Fed__VersionAssignment_3"
    // InternalFom.g:2087:1: rule__Fed__VersionAssignment_3 : ( ruleFEDversion ) ;
    public final void rule__Fed__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2091:1: ( ( ruleFEDversion ) )
            // InternalFom.g:2092:2: ( ruleFEDversion )
            {
            // InternalFom.g:2092:2: ( ruleFEDversion )
            // InternalFom.g:2093:3: ruleFEDversion
            {
             before(grammarAccess.getFedAccess().getVersionFEDversionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFEDversion();

            state._fsp--;

             after(grammarAccess.getFedAccess().getVersionFEDversionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__VersionAssignment_3"


    // $ANTLR start "rule__Fed__SpacesAssignment_6"
    // InternalFom.g:2102:1: rule__Fed__SpacesAssignment_6 : ( ruleSpace ) ;
    public final void rule__Fed__SpacesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2106:1: ( ( ruleSpace ) )
            // InternalFom.g:2107:2: ( ruleSpace )
            {
            // InternalFom.g:2107:2: ( ruleSpace )
            // InternalFom.g:2108:3: ruleSpace
            {
             before(grammarAccess.getFedAccess().getSpacesSpaceParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getFedAccess().getSpacesSpaceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__SpacesAssignment_6"


    // $ANTLR start "rule__Fed__ClassesAssignment_10"
    // InternalFom.g:2117:1: rule__Fed__ClassesAssignment_10 : ( ruleAttributeClass ) ;
    public final void rule__Fed__ClassesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2121:1: ( ( ruleAttributeClass ) )
            // InternalFom.g:2122:2: ( ruleAttributeClass )
            {
            // InternalFom.g:2122:2: ( ruleAttributeClass )
            // InternalFom.g:2123:3: ruleAttributeClass
            {
             before(grammarAccess.getFedAccess().getClassesAttributeClassParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeClass();

            state._fsp--;

             after(grammarAccess.getFedAccess().getClassesAttributeClassParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__ClassesAssignment_10"


    // $ANTLR start "rule__Fed__ClassesAssignment_14"
    // InternalFom.g:2132:1: rule__Fed__ClassesAssignment_14 : ( ruleInteractionClass ) ;
    public final void rule__Fed__ClassesAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2136:1: ( ( ruleInteractionClass ) )
            // InternalFom.g:2137:2: ( ruleInteractionClass )
            {
            // InternalFom.g:2137:2: ( ruleInteractionClass )
            // InternalFom.g:2138:3: ruleInteractionClass
            {
             before(grammarAccess.getFedAccess().getClassesInteractionClassParserRuleCall_14_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteractionClass();

            state._fsp--;

             after(grammarAccess.getFedAccess().getClassesInteractionClassParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fed__ClassesAssignment_14"


    // $ANTLR start "rule__Federation__NameAssignment_2"
    // InternalFom.g:2147:1: rule__Federation__NameAssignment_2 : ( ( rule__Federation__NameAlternatives_2_0 ) ) ;
    public final void rule__Federation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2151:1: ( ( ( rule__Federation__NameAlternatives_2_0 ) ) )
            // InternalFom.g:2152:2: ( ( rule__Federation__NameAlternatives_2_0 ) )
            {
            // InternalFom.g:2152:2: ( ( rule__Federation__NameAlternatives_2_0 ) )
            // InternalFom.g:2153:3: ( rule__Federation__NameAlternatives_2_0 )
            {
             before(grammarAccess.getFederationAccess().getNameAlternatives_2_0()); 
            // InternalFom.g:2154:3: ( rule__Federation__NameAlternatives_2_0 )
            // InternalFom.g:2154:4: rule__Federation__NameAlternatives_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Federation__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFederationAccess().getNameAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Federation__NameAssignment_2"


    // $ANTLR start "rule__FEDversion__VersionAssignment_2"
    // InternalFom.g:2162:1: rule__FEDversion__VersionAssignment_2 : ( RULE_TEXT ) ;
    public final void rule__FEDversion__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2166:1: ( ( RULE_TEXT ) )
            // InternalFom.g:2167:2: ( RULE_TEXT )
            {
            // InternalFom.g:2167:2: ( RULE_TEXT )
            // InternalFom.g:2168:3: RULE_TEXT
            {
             before(grammarAccess.getFEDversionAccess().getVersionTEXTTerminalRuleCall_2_0()); 
            match(input,RULE_TEXT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFEDversionAccess().getVersionTEXTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FEDversion__VersionAssignment_2"


    // $ANTLR start "rule__Space__NameAssignment_2"
    // InternalFom.g:2177:1: rule__Space__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Space__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2181:1: ( ( ruleValidID ) )
            // InternalFom.g:2182:2: ( ruleValidID )
            {
            // InternalFom.g:2182:2: ( ruleValidID )
            // InternalFom.g:2183:3: ruleValidID
            {
             before(grammarAccess.getSpaceAccess().getNameValidIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getSpaceAccess().getNameValidIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__NameAssignment_2"


    // $ANTLR start "rule__Space__DimensionsAssignment_3"
    // InternalFom.g:2192:1: rule__Space__DimensionsAssignment_3 : ( ruleDimension ) ;
    public final void rule__Space__DimensionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2196:1: ( ( ruleDimension ) )
            // InternalFom.g:2197:2: ( ruleDimension )
            {
            // InternalFom.g:2197:2: ( ruleDimension )
            // InternalFom.g:2198:3: ruleDimension
            {
             before(grammarAccess.getSpaceAccess().getDimensionsDimensionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getSpaceAccess().getDimensionsDimensionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__DimensionsAssignment_3"


    // $ANTLR start "rule__Dimension__NameAssignment_2"
    // InternalFom.g:2207:1: rule__Dimension__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Dimension__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2211:1: ( ( ruleValidID ) )
            // InternalFom.g:2212:2: ( ruleValidID )
            {
            // InternalFom.g:2212:2: ( ruleValidID )
            // InternalFom.g:2213:3: ruleValidID
            {
             before(grammarAccess.getDimensionAccess().getNameValidIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getNameValidIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__NameAssignment_2"


    // $ANTLR start "rule__AttributeClass__NameAssignment_2"
    // InternalFom.g:2222:1: rule__AttributeClass__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__AttributeClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2226:1: ( ( ruleValidID ) )
            // InternalFom.g:2227:2: ( ruleValidID )
            {
            // InternalFom.g:2227:2: ( ruleValidID )
            // InternalFom.g:2228:3: ruleValidID
            {
             before(grammarAccess.getAttributeClassAccess().getNameValidIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getAttributeClassAccess().getNameValidIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__NameAssignment_2"


    // $ANTLR start "rule__AttributeClass__AttributesAssignment_3"
    // InternalFom.g:2237:1: rule__AttributeClass__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__AttributeClass__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2241:1: ( ( ruleAttribute ) )
            // InternalFom.g:2242:2: ( ruleAttribute )
            {
            // InternalFom.g:2242:2: ( ruleAttribute )
            // InternalFom.g:2243:3: ruleAttribute
            {
             before(grammarAccess.getAttributeClassAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeClassAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__AttributesAssignment_3"


    // $ANTLR start "rule__AttributeClass__ClassesAssignment_4"
    // InternalFom.g:2252:1: rule__AttributeClass__ClassesAssignment_4 : ( ruleAttributeClass ) ;
    public final void rule__AttributeClass__ClassesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2256:1: ( ( ruleAttributeClass ) )
            // InternalFom.g:2257:2: ( ruleAttributeClass )
            {
            // InternalFom.g:2257:2: ( ruleAttributeClass )
            // InternalFom.g:2258:3: ruleAttributeClass
            {
             before(grammarAccess.getAttributeClassAccess().getClassesAttributeClassParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeClass();

            state._fsp--;

             after(grammarAccess.getAttributeClassAccess().getClassesAttributeClassParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeClass__ClassesAssignment_4"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalFom.g:2267:1: rule__Attribute__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2271:1: ( ( ruleValidID ) )
            // InternalFom.g:2272:2: ( ruleValidID )
            {
            // InternalFom.g:2272:2: ( ruleValidID )
            // InternalFom.g:2273:3: ruleValidID
            {
             before(grammarAccess.getAttributeAccess().getNameValidIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameValidIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__TransportAssignment_3"
    // InternalFom.g:2282:1: rule__Attribute__TransportAssignment_3 : ( ( rule__Attribute__TransportAlternatives_3_0 ) ) ;
    public final void rule__Attribute__TransportAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2286:1: ( ( ( rule__Attribute__TransportAlternatives_3_0 ) ) )
            // InternalFom.g:2287:2: ( ( rule__Attribute__TransportAlternatives_3_0 ) )
            {
            // InternalFom.g:2287:2: ( ( rule__Attribute__TransportAlternatives_3_0 ) )
            // InternalFom.g:2288:3: ( rule__Attribute__TransportAlternatives_3_0 )
            {
             before(grammarAccess.getAttributeAccess().getTransportAlternatives_3_0()); 
            // InternalFom.g:2289:3: ( rule__Attribute__TransportAlternatives_3_0 )
            // InternalFom.g:2289:4: rule__Attribute__TransportAlternatives_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__TransportAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTransportAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TransportAssignment_3"


    // $ANTLR start "rule__Attribute__OrderAssignment_4"
    // InternalFom.g:2297:1: rule__Attribute__OrderAssignment_4 : ( ( rule__Attribute__OrderAlternatives_4_0 ) ) ;
    public final void rule__Attribute__OrderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2301:1: ( ( ( rule__Attribute__OrderAlternatives_4_0 ) ) )
            // InternalFom.g:2302:2: ( ( rule__Attribute__OrderAlternatives_4_0 ) )
            {
            // InternalFom.g:2302:2: ( ( rule__Attribute__OrderAlternatives_4_0 ) )
            // InternalFom.g:2303:3: ( rule__Attribute__OrderAlternatives_4_0 )
            {
             before(grammarAccess.getAttributeAccess().getOrderAlternatives_4_0()); 
            // InternalFom.g:2304:3: ( rule__Attribute__OrderAlternatives_4_0 )
            // InternalFom.g:2304:4: rule__Attribute__OrderAlternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__OrderAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getOrderAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__OrderAssignment_4"


    // $ANTLR start "rule__Attribute__SpaceAssignment_5"
    // InternalFom.g:2312:1: rule__Attribute__SpaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__SpaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2316:1: ( ( ( RULE_ID ) ) )
            // InternalFom.g:2317:2: ( ( RULE_ID ) )
            {
            // InternalFom.g:2317:2: ( ( RULE_ID ) )
            // InternalFom.g:2318:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getSpaceSpaceCrossReference_5_0()); 
            // InternalFom.g:2319:3: ( RULE_ID )
            // InternalFom.g:2320:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getSpaceSpaceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSpaceSpaceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getSpaceSpaceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__SpaceAssignment_5"


    // $ANTLR start "rule__InteractionClass__NameAssignment_2"
    // InternalFom.g:2331:1: rule__InteractionClass__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__InteractionClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2335:1: ( ( ruleValidID ) )
            // InternalFom.g:2336:2: ( ruleValidID )
            {
            // InternalFom.g:2336:2: ( ruleValidID )
            // InternalFom.g:2337:3: ruleValidID
            {
             before(grammarAccess.getInteractionClassAccess().getNameValidIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getInteractionClassAccess().getNameValidIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__NameAssignment_2"


    // $ANTLR start "rule__InteractionClass__TransportAssignment_3"
    // InternalFom.g:2346:1: rule__InteractionClass__TransportAssignment_3 : ( ( rule__InteractionClass__TransportAlternatives_3_0 ) ) ;
    public final void rule__InteractionClass__TransportAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2350:1: ( ( ( rule__InteractionClass__TransportAlternatives_3_0 ) ) )
            // InternalFom.g:2351:2: ( ( rule__InteractionClass__TransportAlternatives_3_0 ) )
            {
            // InternalFom.g:2351:2: ( ( rule__InteractionClass__TransportAlternatives_3_0 ) )
            // InternalFom.g:2352:3: ( rule__InteractionClass__TransportAlternatives_3_0 )
            {
             before(grammarAccess.getInteractionClassAccess().getTransportAlternatives_3_0()); 
            // InternalFom.g:2353:3: ( rule__InteractionClass__TransportAlternatives_3_0 )
            // InternalFom.g:2353:4: rule__InteractionClass__TransportAlternatives_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__TransportAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionClassAccess().getTransportAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__TransportAssignment_3"


    // $ANTLR start "rule__InteractionClass__OrderAssignment_4"
    // InternalFom.g:2361:1: rule__InteractionClass__OrderAssignment_4 : ( ( rule__InteractionClass__OrderAlternatives_4_0 ) ) ;
    public final void rule__InteractionClass__OrderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2365:1: ( ( ( rule__InteractionClass__OrderAlternatives_4_0 ) ) )
            // InternalFom.g:2366:2: ( ( rule__InteractionClass__OrderAlternatives_4_0 ) )
            {
            // InternalFom.g:2366:2: ( ( rule__InteractionClass__OrderAlternatives_4_0 ) )
            // InternalFom.g:2367:3: ( rule__InteractionClass__OrderAlternatives_4_0 )
            {
             before(grammarAccess.getInteractionClassAccess().getOrderAlternatives_4_0()); 
            // InternalFom.g:2368:3: ( rule__InteractionClass__OrderAlternatives_4_0 )
            // InternalFom.g:2368:4: rule__InteractionClass__OrderAlternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InteractionClass__OrderAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionClassAccess().getOrderAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__OrderAssignment_4"


    // $ANTLR start "rule__InteractionClass__SpaceAssignment_5"
    // InternalFom.g:2376:1: rule__InteractionClass__SpaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InteractionClass__SpaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2380:1: ( ( ( RULE_ID ) ) )
            // InternalFom.g:2381:2: ( ( RULE_ID ) )
            {
            // InternalFom.g:2381:2: ( ( RULE_ID ) )
            // InternalFom.g:2382:3: ( RULE_ID )
            {
             before(grammarAccess.getInteractionClassAccess().getSpaceSpaceCrossReference_5_0()); 
            // InternalFom.g:2383:3: ( RULE_ID )
            // InternalFom.g:2384:4: RULE_ID
            {
             before(grammarAccess.getInteractionClassAccess().getSpaceSpaceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInteractionClassAccess().getSpaceSpaceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInteractionClassAccess().getSpaceSpaceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__SpaceAssignment_5"


    // $ANTLR start "rule__InteractionClass__ParametersAssignment_6"
    // InternalFom.g:2395:1: rule__InteractionClass__ParametersAssignment_6 : ( ruleParameter ) ;
    public final void rule__InteractionClass__ParametersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2399:1: ( ( ruleParameter ) )
            // InternalFom.g:2400:2: ( ruleParameter )
            {
            // InternalFom.g:2400:2: ( ruleParameter )
            // InternalFom.g:2401:3: ruleParameter
            {
             before(grammarAccess.getInteractionClassAccess().getParametersParameterParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getInteractionClassAccess().getParametersParameterParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__ParametersAssignment_6"


    // $ANTLR start "rule__InteractionClass__ClassesAssignment_7"
    // InternalFom.g:2410:1: rule__InteractionClass__ClassesAssignment_7 : ( ruleInteractionClass ) ;
    public final void rule__InteractionClass__ClassesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2414:1: ( ( ruleInteractionClass ) )
            // InternalFom.g:2415:2: ( ruleInteractionClass )
            {
            // InternalFom.g:2415:2: ( ruleInteractionClass )
            // InternalFom.g:2416:3: ruleInteractionClass
            {
             before(grammarAccess.getInteractionClassAccess().getClassesInteractionClassParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteractionClass();

            state._fsp--;

             after(grammarAccess.getInteractionClassAccess().getClassesInteractionClassParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionClass__ClassesAssignment_7"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalFom.g:2425:1: rule__Parameter__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFom.g:2429:1: ( ( ruleValidID ) )
            // InternalFom.g:2430:2: ( ruleValidID )
            {
            // InternalFom.g:2430:2: ( ruleValidID )
            // InternalFom.g:2431:3: ruleValidID
            {
             before(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003E0030L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000003E0020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000020L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002400020L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    }


}