package com.cohesionforce.hla.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.cohesionforce.hla.dsl.services.FomGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFomParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXT", "RULE_ID", "RULE_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'FED'", "'spaces'", "')'", "'objects'", "'interactions'", "'Federation'", "'FEDversion'", "'space'", "'dimension'", "'class'", "'attribute'", "'reliable'", "'best_effort'", "'timestamp'", "'receive'", "'parameter'"
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

        public InternalFomParser(TokenStream input, FomGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Fed";
       	}

       	@Override
       	protected FomGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFed"
    // InternalFom.g:64:1: entryRuleFed returns [EObject current=null] : iv_ruleFed= ruleFed EOF ;
    public final EObject entryRuleFed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFed = null;


        try {
            // InternalFom.g:64:44: (iv_ruleFed= ruleFed EOF )
            // InternalFom.g:65:2: iv_ruleFed= ruleFed EOF
            {
             newCompositeNode(grammarAccess.getFedRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFed=ruleFed();

            state._fsp--;

             current =iv_ruleFed; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFed"


    // $ANTLR start "ruleFed"
    // InternalFom.g:71:1: ruleFed returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'FED' ( (lv_federation_2_0= ruleFederation ) ) ( (lv_version_3_0= ruleFEDversion ) ) otherlv_4= '(' otherlv_5= 'spaces' ( (lv_spaces_6_0= ruleSpace ) )* otherlv_7= ')' otherlv_8= '(' otherlv_9= 'objects' ( (lv_classes_10_0= ruleAttributeClass ) )* otherlv_11= ')' otherlv_12= '(' otherlv_13= 'interactions' ( (lv_classes_14_0= ruleInteractionClass ) )* otherlv_15= ')' otherlv_16= ')' ) ;
    public final EObject ruleFed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_federation_2_0 = null;

        EObject lv_version_3_0 = null;

        EObject lv_spaces_6_0 = null;

        EObject lv_classes_10_0 = null;

        EObject lv_classes_14_0 = null;



        	enterRule();

        try {
            // InternalFom.g:77:2: ( (otherlv_0= '(' otherlv_1= 'FED' ( (lv_federation_2_0= ruleFederation ) ) ( (lv_version_3_0= ruleFEDversion ) ) otherlv_4= '(' otherlv_5= 'spaces' ( (lv_spaces_6_0= ruleSpace ) )* otherlv_7= ')' otherlv_8= '(' otherlv_9= 'objects' ( (lv_classes_10_0= ruleAttributeClass ) )* otherlv_11= ')' otherlv_12= '(' otherlv_13= 'interactions' ( (lv_classes_14_0= ruleInteractionClass ) )* otherlv_15= ')' otherlv_16= ')' ) )
            // InternalFom.g:78:2: (otherlv_0= '(' otherlv_1= 'FED' ( (lv_federation_2_0= ruleFederation ) ) ( (lv_version_3_0= ruleFEDversion ) ) otherlv_4= '(' otherlv_5= 'spaces' ( (lv_spaces_6_0= ruleSpace ) )* otherlv_7= ')' otherlv_8= '(' otherlv_9= 'objects' ( (lv_classes_10_0= ruleAttributeClass ) )* otherlv_11= ')' otherlv_12= '(' otherlv_13= 'interactions' ( (lv_classes_14_0= ruleInteractionClass ) )* otherlv_15= ')' otherlv_16= ')' )
            {
            // InternalFom.g:78:2: (otherlv_0= '(' otherlv_1= 'FED' ( (lv_federation_2_0= ruleFederation ) ) ( (lv_version_3_0= ruleFEDversion ) ) otherlv_4= '(' otherlv_5= 'spaces' ( (lv_spaces_6_0= ruleSpace ) )* otherlv_7= ')' otherlv_8= '(' otherlv_9= 'objects' ( (lv_classes_10_0= ruleAttributeClass ) )* otherlv_11= ')' otherlv_12= '(' otherlv_13= 'interactions' ( (lv_classes_14_0= ruleInteractionClass ) )* otherlv_15= ')' otherlv_16= ')' )
            // InternalFom.g:79:3: otherlv_0= '(' otherlv_1= 'FED' ( (lv_federation_2_0= ruleFederation ) ) ( (lv_version_3_0= ruleFEDversion ) ) otherlv_4= '(' otherlv_5= 'spaces' ( (lv_spaces_6_0= ruleSpace ) )* otherlv_7= ')' otherlv_8= '(' otherlv_9= 'objects' ( (lv_classes_10_0= ruleAttributeClass ) )* otherlv_11= ')' otherlv_12= '(' otherlv_13= 'interactions' ( (lv_classes_14_0= ruleInteractionClass ) )* otherlv_15= ')' otherlv_16= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFedAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFedAccess().getFEDKeyword_1());
            		
            // InternalFom.g:87:3: ( (lv_federation_2_0= ruleFederation ) )
            // InternalFom.g:88:4: (lv_federation_2_0= ruleFederation )
            {
            // InternalFom.g:88:4: (lv_federation_2_0= ruleFederation )
            // InternalFom.g:89:5: lv_federation_2_0= ruleFederation
            {

            					newCompositeNode(grammarAccess.getFedAccess().getFederationFederationParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_federation_2_0=ruleFederation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFedRule());
            					}
            					set(
            						current,
            						"federation",
            						lv_federation_2_0,
            						"com.cohesionforce.hla.dsl.Fom.Federation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFom.g:106:3: ( (lv_version_3_0= ruleFEDversion ) )
            // InternalFom.g:107:4: (lv_version_3_0= ruleFEDversion )
            {
            // InternalFom.g:107:4: (lv_version_3_0= ruleFEDversion )
            // InternalFom.g:108:5: lv_version_3_0= ruleFEDversion
            {

            					newCompositeNode(grammarAccess.getFedAccess().getVersionFEDversionParserRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_version_3_0=ruleFEDversion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFedRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_3_0,
            						"com.cohesionforce.hla.dsl.Fom.FEDversion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getFedAccess().getLeftParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFedAccess().getSpacesKeyword_5());
            		
            // InternalFom.g:133:3: ( (lv_spaces_6_0= ruleSpace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFom.g:134:4: (lv_spaces_6_0= ruleSpace )
            	    {
            	    // InternalFom.g:134:4: (lv_spaces_6_0= ruleSpace )
            	    // InternalFom.g:135:5: lv_spaces_6_0= ruleSpace
            	    {

            	    					newCompositeNode(grammarAccess.getFedAccess().getSpacesSpaceParserRuleCall_6_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_spaces_6_0=ruleSpace();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"spaces",
            	    						lv_spaces_6_0,
            	    						"com.cohesionforce.hla.dsl.Fom.Space");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getFedAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getFedAccess().getLeftParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getFedAccess().getObjectsKeyword_9());
            		
            // InternalFom.g:164:3: ( (lv_classes_10_0= ruleAttributeClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFom.g:165:4: (lv_classes_10_0= ruleAttributeClass )
            	    {
            	    // InternalFom.g:165:4: (lv_classes_10_0= ruleAttributeClass )
            	    // InternalFom.g:166:5: lv_classes_10_0= ruleAttributeClass
            	    {

            	    					newCompositeNode(grammarAccess.getFedAccess().getClassesAttributeClassParserRuleCall_10_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_classes_10_0=ruleAttributeClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_10_0,
            	    						"com.cohesionforce.hla.dsl.Fom.AttributeClass");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getFedAccess().getRightParenthesisKeyword_11());
            		
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getFedAccess().getLeftParenthesisKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getFedAccess().getInteractionsKeyword_13());
            		
            // InternalFom.g:195:3: ( (lv_classes_14_0= ruleInteractionClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFom.g:196:4: (lv_classes_14_0= ruleInteractionClass )
            	    {
            	    // InternalFom.g:196:4: (lv_classes_14_0= ruleInteractionClass )
            	    // InternalFom.g:197:5: lv_classes_14_0= ruleInteractionClass
            	    {

            	    					newCompositeNode(grammarAccess.getFedAccess().getClassesInteractionClassParserRuleCall_14_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_classes_14_0=ruleInteractionClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_14_0,
            	    						"com.cohesionforce.hla.dsl.Fom.InteractionClass");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getFedAccess().getRightParenthesisKeyword_15());
            		
            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFedAccess().getRightParenthesisKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFed"


    // $ANTLR start "entryRuleFederation"
    // InternalFom.g:226:1: entryRuleFederation returns [EObject current=null] : iv_ruleFederation= ruleFederation EOF ;
    public final EObject entryRuleFederation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFederation = null;


        try {
            // InternalFom.g:226:51: (iv_ruleFederation= ruleFederation EOF )
            // InternalFom.g:227:2: iv_ruleFederation= ruleFederation EOF
            {
             newCompositeNode(grammarAccess.getFederationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFederation=ruleFederation();

            state._fsp--;

             current =iv_ruleFederation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFederation"


    // $ANTLR start "ruleFederation"
    // InternalFom.g:233:1: ruleFederation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'Federation' ( ( (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT ) ) ) otherlv_3= ')' ) ;
    public final EObject ruleFederation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_1 = null;



        	enterRule();

        try {
            // InternalFom.g:239:2: ( (otherlv_0= '(' otherlv_1= 'Federation' ( ( (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT ) ) ) otherlv_3= ')' ) )
            // InternalFom.g:240:2: (otherlv_0= '(' otherlv_1= 'Federation' ( ( (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT ) ) ) otherlv_3= ')' )
            {
            // InternalFom.g:240:2: (otherlv_0= '(' otherlv_1= 'Federation' ( ( (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT ) ) ) otherlv_3= ')' )
            // InternalFom.g:241:3: otherlv_0= '(' otherlv_1= 'Federation' ( ( (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT ) ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFederationAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFederationAccess().getFederationKeyword_1());
            		
            // InternalFom.g:249:3: ( ( (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT ) ) )
            // InternalFom.g:250:4: ( (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT ) )
            {
            // InternalFom.g:250:4: ( (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT ) )
            // InternalFom.g:251:5: (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT )
            {
            // InternalFom.g:251:5: (lv_name_2_1= ruleValidID | lv_name_2_2= RULE_TEXT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==19||(LA4_0>=21 && LA4_0<=24)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_TEXT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFom.g:252:6: lv_name_2_1= ruleValidID
                    {

                    						newCompositeNode(grammarAccess.getFederationAccess().getNameValidIDParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_name_2_1=ruleValidID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFederationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"com.cohesionforce.hla.dsl.Fom.ValidID");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalFom.g:268:6: lv_name_2_2= RULE_TEXT
                    {
                    lv_name_2_2=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_9); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getFederationAccess().getNameTEXTTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFederationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"com.cohesionforce.hla.dsl.Fom.TEXT");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFederationAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFederation"


    // $ANTLR start "entryRuleFEDversion"
    // InternalFom.g:293:1: entryRuleFEDversion returns [EObject current=null] : iv_ruleFEDversion= ruleFEDversion EOF ;
    public final EObject entryRuleFEDversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFEDversion = null;


        try {
            // InternalFom.g:293:51: (iv_ruleFEDversion= ruleFEDversion EOF )
            // InternalFom.g:294:2: iv_ruleFEDversion= ruleFEDversion EOF
            {
             newCompositeNode(grammarAccess.getFEDversionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFEDversion=ruleFEDversion();

            state._fsp--;

             current =iv_ruleFEDversion; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFEDversion"


    // $ANTLR start "ruleFEDversion"
    // InternalFom.g:300:1: ruleFEDversion returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'FEDversion' ( (lv_version_2_0= RULE_TEXT ) ) otherlv_3= ')' ) ;
    public final EObject ruleFEDversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFom.g:306:2: ( (otherlv_0= '(' otherlv_1= 'FEDversion' ( (lv_version_2_0= RULE_TEXT ) ) otherlv_3= ')' ) )
            // InternalFom.g:307:2: (otherlv_0= '(' otherlv_1= 'FEDversion' ( (lv_version_2_0= RULE_TEXT ) ) otherlv_3= ')' )
            {
            // InternalFom.g:307:2: (otherlv_0= '(' otherlv_1= 'FEDversion' ( (lv_version_2_0= RULE_TEXT ) ) otherlv_3= ')' )
            // InternalFom.g:308:3: otherlv_0= '(' otherlv_1= 'FEDversion' ( (lv_version_2_0= RULE_TEXT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFEDversionAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFEDversionAccess().getFEDversionKeyword_1());
            		
            // InternalFom.g:316:3: ( (lv_version_2_0= RULE_TEXT ) )
            // InternalFom.g:317:4: (lv_version_2_0= RULE_TEXT )
            {
            // InternalFom.g:317:4: (lv_version_2_0= RULE_TEXT )
            // InternalFom.g:318:5: lv_version_2_0= RULE_TEXT
            {
            lv_version_2_0=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_9); 

            					newLeafNode(lv_version_2_0, grammarAccess.getFEDversionAccess().getVersionTEXTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFEDversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_2_0,
            						"com.cohesionforce.hla.dsl.Fom.TEXT");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFEDversionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFEDversion"


    // $ANTLR start "entryRuleSpace"
    // InternalFom.g:342:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalFom.g:342:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalFom.g:343:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalFom.g:349:1: ruleSpace returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'space' ( (lv_name_2_0= ruleValidID ) ) ( (lv_dimensions_3_0= ruleDimension ) )* otherlv_4= ')' ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_dimensions_3_0 = null;



        	enterRule();

        try {
            // InternalFom.g:355:2: ( (otherlv_0= '(' otherlv_1= 'space' ( (lv_name_2_0= ruleValidID ) ) ( (lv_dimensions_3_0= ruleDimension ) )* otherlv_4= ')' ) )
            // InternalFom.g:356:2: (otherlv_0= '(' otherlv_1= 'space' ( (lv_name_2_0= ruleValidID ) ) ( (lv_dimensions_3_0= ruleDimension ) )* otherlv_4= ')' )
            {
            // InternalFom.g:356:2: (otherlv_0= '(' otherlv_1= 'space' ( (lv_name_2_0= ruleValidID ) ) ( (lv_dimensions_3_0= ruleDimension ) )* otherlv_4= ')' )
            // InternalFom.g:357:3: otherlv_0= '(' otherlv_1= 'space' ( (lv_name_2_0= ruleValidID ) ) ( (lv_dimensions_3_0= ruleDimension ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSpaceAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSpaceAccess().getSpaceKeyword_1());
            		
            // InternalFom.g:365:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalFom.g:366:4: (lv_name_2_0= ruleValidID )
            {
            // InternalFom.g:366:4: (lv_name_2_0= ruleValidID )
            // InternalFom.g:367:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getSpaceAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.cohesionforce.hla.dsl.Fom.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFom.g:384:3: ( (lv_dimensions_3_0= ruleDimension ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFom.g:385:4: (lv_dimensions_3_0= ruleDimension )
            	    {
            	    // InternalFom.g:385:4: (lv_dimensions_3_0= ruleDimension )
            	    // InternalFom.g:386:5: lv_dimensions_3_0= ruleDimension
            	    {

            	    					newCompositeNode(grammarAccess.getSpaceAccess().getDimensionsDimensionParserRuleCall_3_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_dimensions_3_0=ruleDimension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dimensions",
            	    						lv_dimensions_3_0,
            	    						"com.cohesionforce.hla.dsl.Fom.Dimension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSpaceAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleDimension"
    // InternalFom.g:411:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalFom.g:411:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalFom.g:412:2: iv_ruleDimension= ruleDimension EOF
            {
             newCompositeNode(grammarAccess.getDimensionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDimension=ruleDimension();

            state._fsp--;

             current =iv_ruleDimension; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalFom.g:418:1: ruleDimension returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'dimension' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')' ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFom.g:424:2: ( (otherlv_0= '(' otherlv_1= 'dimension' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')' ) )
            // InternalFom.g:425:2: (otherlv_0= '(' otherlv_1= 'dimension' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')' )
            {
            // InternalFom.g:425:2: (otherlv_0= '(' otherlv_1= 'dimension' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')' )
            // InternalFom.g:426:3: otherlv_0= '(' otherlv_1= 'dimension' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDimensionAccess().getDimensionKeyword_1());
            		
            // InternalFom.g:434:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalFom.g:435:4: (lv_name_2_0= ruleValidID )
            {
            // InternalFom.g:435:4: (lv_name_2_0= ruleValidID )
            // InternalFom.g:436:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.cohesionforce.hla.dsl.Fom.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDimensionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleAttributeClass"
    // InternalFom.g:461:1: entryRuleAttributeClass returns [EObject current=null] : iv_ruleAttributeClass= ruleAttributeClass EOF ;
    public final EObject entryRuleAttributeClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClass = null;


        try {
            // InternalFom.g:461:55: (iv_ruleAttributeClass= ruleAttributeClass EOF )
            // InternalFom.g:462:2: iv_ruleAttributeClass= ruleAttributeClass EOF
            {
             newCompositeNode(grammarAccess.getAttributeClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeClass=ruleAttributeClass();

            state._fsp--;

             current =iv_ruleAttributeClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeClass"


    // $ANTLR start "ruleAttributeClass"
    // InternalFom.g:468:1: ruleAttributeClass returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_classes_4_0= ruleAttributeClass ) )* otherlv_5= ')' ) ;
    public final EObject ruleAttributeClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_classes_4_0 = null;



        	enterRule();

        try {
            // InternalFom.g:474:2: ( (otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_classes_4_0= ruleAttributeClass ) )* otherlv_5= ')' ) )
            // InternalFom.g:475:2: (otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_classes_4_0= ruleAttributeClass ) )* otherlv_5= ')' )
            {
            // InternalFom.g:475:2: (otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_classes_4_0= ruleAttributeClass ) )* otherlv_5= ')' )
            // InternalFom.g:476:3: otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_classes_4_0= ruleAttributeClass ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeClassAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeClassAccess().getClassKeyword_1());
            		
            // InternalFom.g:484:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalFom.g:485:4: (lv_name_2_0= ruleValidID )
            {
            // InternalFom.g:485:4: (lv_name_2_0= ruleValidID )
            // InternalFom.g:486:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getAttributeClassAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.cohesionforce.hla.dsl.Fom.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFom.g:503:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==24) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalFom.g:504:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalFom.g:504:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalFom.g:505:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeClassAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"com.cohesionforce.hla.dsl.Fom.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalFom.g:522:3: ( (lv_classes_4_0= ruleAttributeClass ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFom.g:523:4: (lv_classes_4_0= ruleAttributeClass )
            	    {
            	    // InternalFom.g:523:4: (lv_classes_4_0= ruleAttributeClass )
            	    // InternalFom.g:524:5: lv_classes_4_0= ruleAttributeClass
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeClassAccess().getClassesAttributeClassParserRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_classes_4_0=ruleAttributeClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_4_0,
            	    						"com.cohesionforce.hla.dsl.Fom.AttributeClass");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeClassAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalFom.g:549:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalFom.g:549:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalFom.g:550:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalFom.g:556:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'attribute' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_transport_3_1=null;
        Token lv_transport_3_2=null;
        Token lv_order_4_1=null;
        Token lv_order_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFom.g:562:2: ( (otherlv_0= '(' otherlv_1= 'attribute' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' ) )
            // InternalFom.g:563:2: (otherlv_0= '(' otherlv_1= 'attribute' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' )
            {
            // InternalFom.g:563:2: (otherlv_0= '(' otherlv_1= 'attribute' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' )
            // InternalFom.g:564:3: otherlv_0= '(' otherlv_1= 'attribute' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            // InternalFom.g:572:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalFom.g:573:4: (lv_name_2_0= ruleValidID )
            {
            // InternalFom.g:573:4: (lv_name_2_0= ruleValidID )
            // InternalFom.g:574:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_19);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.cohesionforce.hla.dsl.Fom.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFom.g:591:3: ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) )
            // InternalFom.g:592:4: ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) )
            {
            // InternalFom.g:592:4: ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) )
            // InternalFom.g:593:5: (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' )
            {
            // InternalFom.g:593:5: (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFom.g:594:6: lv_transport_3_1= 'reliable'
                    {
                    lv_transport_3_1=(Token)match(input,25,FollowSets000.FOLLOW_20); 

                    						newLeafNode(lv_transport_3_1, grammarAccess.getAttributeAccess().getTransportReliableKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(current, "transport", lv_transport_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalFom.g:605:6: lv_transport_3_2= 'best_effort'
                    {
                    lv_transport_3_2=(Token)match(input,26,FollowSets000.FOLLOW_20); 

                    						newLeafNode(lv_transport_3_2, grammarAccess.getAttributeAccess().getTransportBest_effortKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(current, "transport", lv_transport_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalFom.g:618:3: ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) )
            // InternalFom.g:619:4: ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) )
            {
            // InternalFom.g:619:4: ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) )
            // InternalFom.g:620:5: (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' )
            {
            // InternalFom.g:620:5: (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFom.g:621:6: lv_order_4_1= 'timestamp'
                    {
                    lv_order_4_1=(Token)match(input,27,FollowSets000.FOLLOW_21); 

                    						newLeafNode(lv_order_4_1, grammarAccess.getAttributeAccess().getOrderTimestampKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(current, "order", lv_order_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalFom.g:632:6: lv_order_4_2= 'receive'
                    {
                    lv_order_4_2=(Token)match(input,28,FollowSets000.FOLLOW_21); 

                    						newLeafNode(lv_order_4_2, grammarAccess.getAttributeAccess().getOrderReceiveKeyword_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(current, "order", lv_order_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalFom.g:645:3: ( (otherlv_5= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFom.g:646:4: (otherlv_5= RULE_ID )
                    {
                    // InternalFom.g:646:4: (otherlv_5= RULE_ID )
                    // InternalFom.g:647:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

                    					newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getSpaceSpaceCrossReference_5_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleInteractionClass"
    // InternalFom.g:666:1: entryRuleInteractionClass returns [EObject current=null] : iv_ruleInteractionClass= ruleInteractionClass EOF ;
    public final EObject entryRuleInteractionClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionClass = null;


        try {
            // InternalFom.g:666:57: (iv_ruleInteractionClass= ruleInteractionClass EOF )
            // InternalFom.g:667:2: iv_ruleInteractionClass= ruleInteractionClass EOF
            {
             newCompositeNode(grammarAccess.getInteractionClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteractionClass=ruleInteractionClass();

            state._fsp--;

             current =iv_ruleInteractionClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractionClass"


    // $ANTLR start "ruleInteractionClass"
    // InternalFom.g:673:1: ruleInteractionClass returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_classes_7_0= ruleInteractionClass ) )* otherlv_8= ')' ) ;
    public final EObject ruleInteractionClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_transport_3_1=null;
        Token lv_transport_3_2=null;
        Token lv_order_4_1=null;
        Token lv_order_4_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_classes_7_0 = null;



        	enterRule();

        try {
            // InternalFom.g:679:2: ( (otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_classes_7_0= ruleInteractionClass ) )* otherlv_8= ')' ) )
            // InternalFom.g:680:2: (otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_classes_7_0= ruleInteractionClass ) )* otherlv_8= ')' )
            {
            // InternalFom.g:680:2: (otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_classes_7_0= ruleInteractionClass ) )* otherlv_8= ')' )
            // InternalFom.g:681:3: otherlv_0= '(' otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) ) ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) ) ( (otherlv_5= RULE_ID ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_classes_7_0= ruleInteractionClass ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionClassAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionClassAccess().getClassKeyword_1());
            		
            // InternalFom.g:689:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalFom.g:690:4: (lv_name_2_0= ruleValidID )
            {
            // InternalFom.g:690:4: (lv_name_2_0= ruleValidID )
            // InternalFom.g:691:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getInteractionClassAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_19);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.cohesionforce.hla.dsl.Fom.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFom.g:708:3: ( ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) ) )
            // InternalFom.g:709:4: ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) )
            {
            // InternalFom.g:709:4: ( (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' ) )
            // InternalFom.g:710:5: (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' )
            {
            // InternalFom.g:710:5: (lv_transport_3_1= 'reliable' | lv_transport_3_2= 'best_effort' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFom.g:711:6: lv_transport_3_1= 'reliable'
                    {
                    lv_transport_3_1=(Token)match(input,25,FollowSets000.FOLLOW_20); 

                    						newLeafNode(lv_transport_3_1, grammarAccess.getInteractionClassAccess().getTransportReliableKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInteractionClassRule());
                    						}
                    						setWithLastConsumed(current, "transport", lv_transport_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalFom.g:722:6: lv_transport_3_2= 'best_effort'
                    {
                    lv_transport_3_2=(Token)match(input,26,FollowSets000.FOLLOW_20); 

                    						newLeafNode(lv_transport_3_2, grammarAccess.getInteractionClassAccess().getTransportBest_effortKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInteractionClassRule());
                    						}
                    						setWithLastConsumed(current, "transport", lv_transport_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalFom.g:735:3: ( ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) ) )
            // InternalFom.g:736:4: ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) )
            {
            // InternalFom.g:736:4: ( (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' ) )
            // InternalFom.g:737:5: (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' )
            {
            // InternalFom.g:737:5: (lv_order_4_1= 'timestamp' | lv_order_4_2= 'receive' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFom.g:738:6: lv_order_4_1= 'timestamp'
                    {
                    lv_order_4_1=(Token)match(input,27,FollowSets000.FOLLOW_22); 

                    						newLeafNode(lv_order_4_1, grammarAccess.getInteractionClassAccess().getOrderTimestampKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInteractionClassRule());
                    						}
                    						setWithLastConsumed(current, "order", lv_order_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalFom.g:749:6: lv_order_4_2= 'receive'
                    {
                    lv_order_4_2=(Token)match(input,28,FollowSets000.FOLLOW_22); 

                    						newLeafNode(lv_order_4_2, grammarAccess.getInteractionClassAccess().getOrderReceiveKeyword_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInteractionClassRule());
                    						}
                    						setWithLastConsumed(current, "order", lv_order_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalFom.g:762:3: ( (otherlv_5= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFom.g:763:4: (otherlv_5= RULE_ID )
                    {
                    // InternalFom.g:763:4: (otherlv_5= RULE_ID )
                    // InternalFom.g:764:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInteractionClassRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getInteractionClassAccess().getSpaceSpaceCrossReference_5_0());
                    				

                    }


                    }
                    break;

            }

            // InternalFom.g:775:3: ( (lv_parameters_6_0= ruleParameter ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==29) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalFom.g:776:4: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalFom.g:776:4: (lv_parameters_6_0= ruleParameter )
            	    // InternalFom.g:777:5: lv_parameters_6_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionClassAccess().getParametersParameterParserRuleCall_6_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_6_0,
            	    						"com.cohesionforce.hla.dsl.Fom.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalFom.g:794:3: ( (lv_classes_7_0= ruleInteractionClass ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFom.g:795:4: (lv_classes_7_0= ruleInteractionClass )
            	    {
            	    // InternalFom.g:795:4: (lv_classes_7_0= ruleInteractionClass )
            	    // InternalFom.g:796:5: lv_classes_7_0= ruleInteractionClass
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionClassAccess().getClassesInteractionClassParserRuleCall_7_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_classes_7_0=ruleInteractionClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_7_0,
            	    						"com.cohesionforce.hla.dsl.Fom.InteractionClass");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInteractionClassAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteractionClass"


    // $ANTLR start "entryRuleParameter"
    // InternalFom.g:821:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalFom.g:821:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalFom.g:822:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalFom.g:828:1: ruleParameter returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'parameter' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFom.g:834:2: ( (otherlv_0= '(' otherlv_1= 'parameter' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')' ) )
            // InternalFom.g:835:2: (otherlv_0= '(' otherlv_1= 'parameter' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')' )
            {
            // InternalFom.g:835:2: (otherlv_0= '(' otherlv_1= 'parameter' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')' )
            // InternalFom.g:836:3: otherlv_0= '(' otherlv_1= 'parameter' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalFom.g:844:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalFom.g:845:4: (lv_name_2_0= ruleValidID )
            {
            // InternalFom.g:845:4: (lv_name_2_0= ruleValidID )
            // InternalFom.g:846:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.cohesionforce.hla.dsl.Fom.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleValidID"
    // InternalFom.g:871:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalFom.g:871:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalFom.g:872:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalFom.g:878:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'Federation' | kw= 'class' | kw= 'attribute' | kw= 'dimension' | kw= 'space' ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalFom.g:884:2: ( (this_ID_0= RULE_ID | kw= 'Federation' | kw= 'class' | kw= 'attribute' | kw= 'dimension' | kw= 'space' ) )
            // InternalFom.g:885:2: (this_ID_0= RULE_ID | kw= 'Federation' | kw= 'class' | kw= 'attribute' | kw= 'dimension' | kw= 'space' )
            {
            // InternalFom.g:885:2: (this_ID_0= RULE_ID | kw= 'Federation' | kw= 'class' | kw= 'attribute' | kw= 'dimension' | kw= 'space' )
            int alt16=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case 19:
                {
                alt16=2;
                }
                break;
            case 23:
                {
                alt16=3;
                }
                break;
            case 24:
                {
                alt16=4;
                }
                break;
            case 22:
                {
                alt16=5;
                }
                break;
            case 21:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalFom.g:886:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFom.g:894:3: kw= 'Federation'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getFederationKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalFom.g:900:3: kw= 'class'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getClassKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalFom.g:906:3: kw= 'attribute'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getAttributeKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalFom.g:912:3: kw= 'dimension'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getDimensionKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalFom.g:918:3: kw= 'space'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getSpaceKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001E80030L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001E80020L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000012020L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    }


}