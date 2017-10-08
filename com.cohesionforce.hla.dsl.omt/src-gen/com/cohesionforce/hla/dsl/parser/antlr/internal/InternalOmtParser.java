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
import com.cohesionforce.hla.dsl.services.OmtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOmtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPEN", "RULE_CLOSE", "RULE_STRING", "RULE_TEXT", "RULE_BASE_DATA_TYPE", "RULE_INT", "RULE_ID", "RULE_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DIF'", "'TYPE'", "'ObjectModel'", "'Name'", "'VersionNumber'", "'Type'", "'Purpose'", "'ApplicationDomain'", "'SponsorOrgName'", "'POCHonorificName'", "'POCFirstName'", "'POCLastName'", "'POCOrgName'", "'POCPhone'", "'POCEmail'", "'ModificationDate'", "'MOMVersion'", "'TimeRepresentation'", "'Units'", "'Minimum'", "'Maximum'", "'InitialValue'", "'DataType'", "'Operators'", "'Lookahead'", "'AdditionOperator'", "'FOM'", "'SOM'", "'OTHER'", "'RoutingSpace'", "'Dimension'", "'DimensionType'", "'RangeSetUnits'", "'NormalizationFunction'", "'DimensionMinimum'", "'DimensionMaximum'", "'IntervalType'", "'Open'", "'Closed'", "'DimensionSet'", "'Member'", "'Class'", "'ID'", "'MOMClass'", "'PSCapabilities'", "'TRUE'", "'FALSE'", "'P'", "'S'", "'PS'", "'N'", "'SuperClass'", "'Attribute'", "'UpdateType'", "'UpdateCondition'", "'TransferAccept'", "'UpdateReflect'", "'Static'", "'Periodic'", "'Conditional'", "'T'", "'A'", "'TA'", "'U'", "'R'", "'UR'", "'EnumeratedDataType'", "'MOMEnumeratedDataType'", "'Enumeration'", "'Enumerator'", "'Representation'", "'ComplexDataType'", "'MOMComplexDataType'", "'ComplexComponent'", "'Accuracy'", "'AccuracyCondition'", "'Resolution'", "'Position'", "'FieldName'", "'Cardinality'", "'Interaction'", "'ISRType'", "'MOMInteraction'", "'I'", "'IS'", "'IR'", "'SuperInteraction'", "'Parameter'", "'Description'", "'Note'", "'NoteNumber'", "'NoteText'", "'['", "','", "']'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_BASE_DATA_TYPE=8;
    public static final int RULE_INT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_OPEN=4;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int RULE_TEXT=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_CLOSE=5;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_COMMENT=11;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalOmtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOmtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOmtParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOmt.g"; }



     	private OmtGrammarAccess grammarAccess;

        public InternalOmtParser(TokenStream input, OmtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "HLAOMT_DIF_v1_3";
       	}

       	@Override
       	protected OmtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHLAOMT_DIF_v1_3"
    // InternalOmt.g:64:1: entryRuleHLAOMT_DIF_v1_3 returns [EObject current=null] : iv_ruleHLAOMT_DIF_v1_3= ruleHLAOMT_DIF_v1_3 EOF ;
    public final EObject entryRuleHLAOMT_DIF_v1_3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHLAOMT_DIF_v1_3 = null;


        try {
            // InternalOmt.g:64:56: (iv_ruleHLAOMT_DIF_v1_3= ruleHLAOMT_DIF_v1_3 EOF )
            // InternalOmt.g:65:2: iv_ruleHLAOMT_DIF_v1_3= ruleHLAOMT_DIF_v1_3 EOF
            {
             newCompositeNode(grammarAccess.getHLAOMT_DIF_v1_3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHLAOMT_DIF_v1_3=ruleHLAOMT_DIF_v1_3();

            state._fsp--;

             current =iv_ruleHLAOMT_DIF_v1_3; 
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
    // $ANTLR end "entryRuleHLAOMT_DIF_v1_3"


    // $ANTLR start "ruleHLAOMT_DIF_v1_3"
    // InternalOmt.g:71:1: ruleHLAOMT_DIF_v1_3 returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'DIF' ( (lv_name_2_0= ruleAnyText ) ) ( (lv_version_3_0= ruleAnyText ) ) this_OPEN_4= RULE_OPEN otherlv_5= 'TYPE' ( (lv_type_6_0= ruleAnyText ) ) this_CLOSE_7= RULE_CLOSE this_CLOSE_8= RULE_CLOSE ( (lv_objectModels_9_0= ruleObjectModel ) )+ ) ;
    public final EObject ruleHLAOMT_DIF_v1_3() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_4=null;
        Token otherlv_5=null;
        Token this_CLOSE_7=null;
        Token this_CLOSE_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_version_3_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;

        EObject lv_objectModels_9_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:77:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'DIF' ( (lv_name_2_0= ruleAnyText ) ) ( (lv_version_3_0= ruleAnyText ) ) this_OPEN_4= RULE_OPEN otherlv_5= 'TYPE' ( (lv_type_6_0= ruleAnyText ) ) this_CLOSE_7= RULE_CLOSE this_CLOSE_8= RULE_CLOSE ( (lv_objectModels_9_0= ruleObjectModel ) )+ ) )
            // InternalOmt.g:78:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'DIF' ( (lv_name_2_0= ruleAnyText ) ) ( (lv_version_3_0= ruleAnyText ) ) this_OPEN_4= RULE_OPEN otherlv_5= 'TYPE' ( (lv_type_6_0= ruleAnyText ) ) this_CLOSE_7= RULE_CLOSE this_CLOSE_8= RULE_CLOSE ( (lv_objectModels_9_0= ruleObjectModel ) )+ )
            {
            // InternalOmt.g:78:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'DIF' ( (lv_name_2_0= ruleAnyText ) ) ( (lv_version_3_0= ruleAnyText ) ) this_OPEN_4= RULE_OPEN otherlv_5= 'TYPE' ( (lv_type_6_0= ruleAnyText ) ) this_CLOSE_7= RULE_CLOSE this_CLOSE_8= RULE_CLOSE ( (lv_objectModels_9_0= ruleObjectModel ) )+ )
            // InternalOmt.g:79:3: this_OPEN_0= RULE_OPEN otherlv_1= 'DIF' ( (lv_name_2_0= ruleAnyText ) ) ( (lv_version_3_0= ruleAnyText ) ) this_OPEN_4= RULE_OPEN otherlv_5= 'TYPE' ( (lv_type_6_0= ruleAnyText ) ) this_CLOSE_7= RULE_CLOSE this_CLOSE_8= RULE_CLOSE ( (lv_objectModels_9_0= ruleObjectModel ) )+
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_3); 

            			newLeafNode(this_OPEN_0, grammarAccess.getHLAOMT_DIF_v1_3Access().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHLAOMT_DIF_v1_3Access().getDIFKeyword_1());
            		
            // InternalOmt.g:87:3: ( (lv_name_2_0= ruleAnyText ) )
            // InternalOmt.g:88:4: (lv_name_2_0= ruleAnyText )
            {
            // InternalOmt.g:88:4: (lv_name_2_0= ruleAnyText )
            // InternalOmt.g:89:5: lv_name_2_0= ruleAnyText
            {

            					newCompositeNode(grammarAccess.getHLAOMT_DIF_v1_3Access().getNameAnyTextParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_2_0=ruleAnyText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHLAOMT_DIF_v1_3Rule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.cohesionforce.hla.dsl.Omt.AnyText");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOmt.g:106:3: ( (lv_version_3_0= ruleAnyText ) )
            // InternalOmt.g:107:4: (lv_version_3_0= ruleAnyText )
            {
            // InternalOmt.g:107:4: (lv_version_3_0= ruleAnyText )
            // InternalOmt.g:108:5: lv_version_3_0= ruleAnyText
            {

            					newCompositeNode(grammarAccess.getHLAOMT_DIF_v1_3Access().getVersionAnyTextParserRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
            lv_version_3_0=ruleAnyText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHLAOMT_DIF_v1_3Rule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_3_0,
            						"com.cohesionforce.hla.dsl.Omt.AnyText");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_OPEN_4=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_6); 

            			newLeafNode(this_OPEN_4, grammarAccess.getHLAOMT_DIF_v1_3Access().getOPENTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getHLAOMT_DIF_v1_3Access().getTYPEKeyword_5());
            		
            // InternalOmt.g:133:3: ( (lv_type_6_0= ruleAnyText ) )
            // InternalOmt.g:134:4: (lv_type_6_0= ruleAnyText )
            {
            // InternalOmt.g:134:4: (lv_type_6_0= ruleAnyText )
            // InternalOmt.g:135:5: lv_type_6_0= ruleAnyText
            {

            					newCompositeNode(grammarAccess.getHLAOMT_DIF_v1_3Access().getTypeAnyTextParserRuleCall_6_0());
            				
            pushFollow(FollowSets000.FOLLOW_7);
            lv_type_6_0=ruleAnyText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHLAOMT_DIF_v1_3Rule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"com.cohesionforce.hla.dsl.Omt.AnyText");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_CLOSE_7=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_7); 

            			newLeafNode(this_CLOSE_7, grammarAccess.getHLAOMT_DIF_v1_3Access().getCLOSETerminalRuleCall_7());
            		
            this_CLOSE_8=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_8, grammarAccess.getHLAOMT_DIF_v1_3Access().getCLOSETerminalRuleCall_8());
            		
            // InternalOmt.g:160:3: ( (lv_objectModels_9_0= ruleObjectModel ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_OPEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOmt.g:161:4: (lv_objectModels_9_0= ruleObjectModel )
            	    {
            	    // InternalOmt.g:161:4: (lv_objectModels_9_0= ruleObjectModel )
            	    // InternalOmt.g:162:5: lv_objectModels_9_0= ruleObjectModel
            	    {

            	    					newCompositeNode(grammarAccess.getHLAOMT_DIF_v1_3Access().getObjectModelsObjectModelParserRuleCall_9_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_objectModels_9_0=ruleObjectModel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHLAOMT_DIF_v1_3Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"objectModels",
            	    						lv_objectModels_9_0,
            	    						"com.cohesionforce.hla.dsl.Omt.ObjectModel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleHLAOMT_DIF_v1_3"


    // $ANTLR start "entryRuleObjectModel"
    // InternalOmt.g:183:1: entryRuleObjectModel returns [EObject current=null] : iv_ruleObjectModel= ruleObjectModel EOF ;
    public final EObject entryRuleObjectModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectModel = null;


        try {
            // InternalOmt.g:183:52: (iv_ruleObjectModel= ruleObjectModel EOF )
            // InternalOmt.g:184:2: iv_ruleObjectModel= ruleObjectModel EOF
            {
             newCompositeNode(grammarAccess.getObjectModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleObjectModel=ruleObjectModel();

            state._fsp--;

             current =iv_ruleObjectModel; 
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
    // $ANTLR end "entryRuleObjectModel"


    // $ANTLR start "ruleObjectModel"
    // InternalOmt.g:190:1: ruleObjectModel returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'ObjectModel' (this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE ) (this_OPEN_6= RULE_OPEN otherlv_7= 'VersionNumber' ( (lv_version_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE ) (this_OPEN_10= RULE_OPEN otherlv_11= 'Type' ( (lv_type_12_0= ruleMOD_Type ) ) this_CLOSE_13= RULE_CLOSE )? (this_OPEN_14= RULE_OPEN otherlv_15= 'Purpose' ( (lv_purpose_16_0= RULE_STRING ) ) this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'ApplicationDomain' ( (lv_domain_20_0= RULE_STRING ) ) this_CLOSE_21= RULE_CLOSE )? (this_OPEN_22= RULE_OPEN otherlv_23= 'SponsorOrgName' ( (lv_sponsor_24_0= RULE_STRING ) ) this_CLOSE_25= RULE_CLOSE )? (this_OPEN_26= RULE_OPEN otherlv_27= 'POCHonorificName' ( (lv_pocHonorific_28_0= RULE_STRING ) ) this_CLOSE_29= RULE_CLOSE )? (this_OPEN_30= RULE_OPEN otherlv_31= 'POCFirstName' ( (lv_pocFirstName_32_0= RULE_STRING ) ) this_CLOSE_33= RULE_CLOSE )? (this_OPEN_34= RULE_OPEN otherlv_35= 'POCLastName' ( (lv_pocLastName_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? (this_OPEN_38= RULE_OPEN otherlv_39= 'POCOrgName' ( (lv_pocOrgName_40_0= RULE_STRING ) ) this_CLOSE_41= RULE_CLOSE )? (this_OPEN_42= RULE_OPEN otherlv_43= 'POCPhone' ( (lv_pocPhone_44_0= RULE_STRING ) ) this_CLOSE_45= RULE_CLOSE )? (this_OPEN_46= RULE_OPEN otherlv_47= 'POCEmail' ( (lv_pocEmail_48_0= RULE_STRING ) ) this_CLOSE_49= RULE_CLOSE )? (this_OPEN_50= RULE_OPEN otherlv_51= 'ModificationDate' ( (lv_modificationDate_52_0= RULE_TEXT ) ) this_CLOSE_53= RULE_CLOSE )? (this_OPEN_54= RULE_OPEN otherlv_55= 'MOMVersion' ( (lv_momVersion_56_0= RULE_STRING ) ) this_CLOSE_57= RULE_CLOSE )? ( (lv_timeRepresentation_58_0= ruleTimeRepresentation ) )? ( (lv_lookAhead_59_0= ruleLookahead ) )? ( (lv_omtComponents_60_0= ruleOMTComponent ) )* this_CLOSE_61= RULE_CLOSE ) ;
    public final EObject ruleObjectModel() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token this_CLOSE_5=null;
        Token this_OPEN_6=null;
        Token otherlv_7=null;
        Token lv_version_8_0=null;
        Token this_CLOSE_9=null;
        Token this_OPEN_10=null;
        Token otherlv_11=null;
        Token this_CLOSE_13=null;
        Token this_OPEN_14=null;
        Token otherlv_15=null;
        Token lv_purpose_16_0=null;
        Token this_CLOSE_17=null;
        Token this_OPEN_18=null;
        Token otherlv_19=null;
        Token lv_domain_20_0=null;
        Token this_CLOSE_21=null;
        Token this_OPEN_22=null;
        Token otherlv_23=null;
        Token lv_sponsor_24_0=null;
        Token this_CLOSE_25=null;
        Token this_OPEN_26=null;
        Token otherlv_27=null;
        Token lv_pocHonorific_28_0=null;
        Token this_CLOSE_29=null;
        Token this_OPEN_30=null;
        Token otherlv_31=null;
        Token lv_pocFirstName_32_0=null;
        Token this_CLOSE_33=null;
        Token this_OPEN_34=null;
        Token otherlv_35=null;
        Token lv_pocLastName_36_0=null;
        Token this_CLOSE_37=null;
        Token this_OPEN_38=null;
        Token otherlv_39=null;
        Token lv_pocOrgName_40_0=null;
        Token this_CLOSE_41=null;
        Token this_OPEN_42=null;
        Token otherlv_43=null;
        Token lv_pocPhone_44_0=null;
        Token this_CLOSE_45=null;
        Token this_OPEN_46=null;
        Token otherlv_47=null;
        Token lv_pocEmail_48_0=null;
        Token this_CLOSE_49=null;
        Token this_OPEN_50=null;
        Token otherlv_51=null;
        Token lv_modificationDate_52_0=null;
        Token this_CLOSE_53=null;
        Token this_OPEN_54=null;
        Token otherlv_55=null;
        Token lv_momVersion_56_0=null;
        Token this_CLOSE_57=null;
        Token this_CLOSE_61=null;
        AntlrDatatypeRuleToken lv_type_12_0 = null;

        EObject lv_timeRepresentation_58_0 = null;

        EObject lv_lookAhead_59_0 = null;

        EObject lv_omtComponents_60_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:196:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'ObjectModel' (this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE ) (this_OPEN_6= RULE_OPEN otherlv_7= 'VersionNumber' ( (lv_version_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE ) (this_OPEN_10= RULE_OPEN otherlv_11= 'Type' ( (lv_type_12_0= ruleMOD_Type ) ) this_CLOSE_13= RULE_CLOSE )? (this_OPEN_14= RULE_OPEN otherlv_15= 'Purpose' ( (lv_purpose_16_0= RULE_STRING ) ) this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'ApplicationDomain' ( (lv_domain_20_0= RULE_STRING ) ) this_CLOSE_21= RULE_CLOSE )? (this_OPEN_22= RULE_OPEN otherlv_23= 'SponsorOrgName' ( (lv_sponsor_24_0= RULE_STRING ) ) this_CLOSE_25= RULE_CLOSE )? (this_OPEN_26= RULE_OPEN otherlv_27= 'POCHonorificName' ( (lv_pocHonorific_28_0= RULE_STRING ) ) this_CLOSE_29= RULE_CLOSE )? (this_OPEN_30= RULE_OPEN otherlv_31= 'POCFirstName' ( (lv_pocFirstName_32_0= RULE_STRING ) ) this_CLOSE_33= RULE_CLOSE )? (this_OPEN_34= RULE_OPEN otherlv_35= 'POCLastName' ( (lv_pocLastName_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? (this_OPEN_38= RULE_OPEN otherlv_39= 'POCOrgName' ( (lv_pocOrgName_40_0= RULE_STRING ) ) this_CLOSE_41= RULE_CLOSE )? (this_OPEN_42= RULE_OPEN otherlv_43= 'POCPhone' ( (lv_pocPhone_44_0= RULE_STRING ) ) this_CLOSE_45= RULE_CLOSE )? (this_OPEN_46= RULE_OPEN otherlv_47= 'POCEmail' ( (lv_pocEmail_48_0= RULE_STRING ) ) this_CLOSE_49= RULE_CLOSE )? (this_OPEN_50= RULE_OPEN otherlv_51= 'ModificationDate' ( (lv_modificationDate_52_0= RULE_TEXT ) ) this_CLOSE_53= RULE_CLOSE )? (this_OPEN_54= RULE_OPEN otherlv_55= 'MOMVersion' ( (lv_momVersion_56_0= RULE_STRING ) ) this_CLOSE_57= RULE_CLOSE )? ( (lv_timeRepresentation_58_0= ruleTimeRepresentation ) )? ( (lv_lookAhead_59_0= ruleLookahead ) )? ( (lv_omtComponents_60_0= ruleOMTComponent ) )* this_CLOSE_61= RULE_CLOSE ) )
            // InternalOmt.g:197:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'ObjectModel' (this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE ) (this_OPEN_6= RULE_OPEN otherlv_7= 'VersionNumber' ( (lv_version_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE ) (this_OPEN_10= RULE_OPEN otherlv_11= 'Type' ( (lv_type_12_0= ruleMOD_Type ) ) this_CLOSE_13= RULE_CLOSE )? (this_OPEN_14= RULE_OPEN otherlv_15= 'Purpose' ( (lv_purpose_16_0= RULE_STRING ) ) this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'ApplicationDomain' ( (lv_domain_20_0= RULE_STRING ) ) this_CLOSE_21= RULE_CLOSE )? (this_OPEN_22= RULE_OPEN otherlv_23= 'SponsorOrgName' ( (lv_sponsor_24_0= RULE_STRING ) ) this_CLOSE_25= RULE_CLOSE )? (this_OPEN_26= RULE_OPEN otherlv_27= 'POCHonorificName' ( (lv_pocHonorific_28_0= RULE_STRING ) ) this_CLOSE_29= RULE_CLOSE )? (this_OPEN_30= RULE_OPEN otherlv_31= 'POCFirstName' ( (lv_pocFirstName_32_0= RULE_STRING ) ) this_CLOSE_33= RULE_CLOSE )? (this_OPEN_34= RULE_OPEN otherlv_35= 'POCLastName' ( (lv_pocLastName_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? (this_OPEN_38= RULE_OPEN otherlv_39= 'POCOrgName' ( (lv_pocOrgName_40_0= RULE_STRING ) ) this_CLOSE_41= RULE_CLOSE )? (this_OPEN_42= RULE_OPEN otherlv_43= 'POCPhone' ( (lv_pocPhone_44_0= RULE_STRING ) ) this_CLOSE_45= RULE_CLOSE )? (this_OPEN_46= RULE_OPEN otherlv_47= 'POCEmail' ( (lv_pocEmail_48_0= RULE_STRING ) ) this_CLOSE_49= RULE_CLOSE )? (this_OPEN_50= RULE_OPEN otherlv_51= 'ModificationDate' ( (lv_modificationDate_52_0= RULE_TEXT ) ) this_CLOSE_53= RULE_CLOSE )? (this_OPEN_54= RULE_OPEN otherlv_55= 'MOMVersion' ( (lv_momVersion_56_0= RULE_STRING ) ) this_CLOSE_57= RULE_CLOSE )? ( (lv_timeRepresentation_58_0= ruleTimeRepresentation ) )? ( (lv_lookAhead_59_0= ruleLookahead ) )? ( (lv_omtComponents_60_0= ruleOMTComponent ) )* this_CLOSE_61= RULE_CLOSE )
            {
            // InternalOmt.g:197:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'ObjectModel' (this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE ) (this_OPEN_6= RULE_OPEN otherlv_7= 'VersionNumber' ( (lv_version_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE ) (this_OPEN_10= RULE_OPEN otherlv_11= 'Type' ( (lv_type_12_0= ruleMOD_Type ) ) this_CLOSE_13= RULE_CLOSE )? (this_OPEN_14= RULE_OPEN otherlv_15= 'Purpose' ( (lv_purpose_16_0= RULE_STRING ) ) this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'ApplicationDomain' ( (lv_domain_20_0= RULE_STRING ) ) this_CLOSE_21= RULE_CLOSE )? (this_OPEN_22= RULE_OPEN otherlv_23= 'SponsorOrgName' ( (lv_sponsor_24_0= RULE_STRING ) ) this_CLOSE_25= RULE_CLOSE )? (this_OPEN_26= RULE_OPEN otherlv_27= 'POCHonorificName' ( (lv_pocHonorific_28_0= RULE_STRING ) ) this_CLOSE_29= RULE_CLOSE )? (this_OPEN_30= RULE_OPEN otherlv_31= 'POCFirstName' ( (lv_pocFirstName_32_0= RULE_STRING ) ) this_CLOSE_33= RULE_CLOSE )? (this_OPEN_34= RULE_OPEN otherlv_35= 'POCLastName' ( (lv_pocLastName_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? (this_OPEN_38= RULE_OPEN otherlv_39= 'POCOrgName' ( (lv_pocOrgName_40_0= RULE_STRING ) ) this_CLOSE_41= RULE_CLOSE )? (this_OPEN_42= RULE_OPEN otherlv_43= 'POCPhone' ( (lv_pocPhone_44_0= RULE_STRING ) ) this_CLOSE_45= RULE_CLOSE )? (this_OPEN_46= RULE_OPEN otherlv_47= 'POCEmail' ( (lv_pocEmail_48_0= RULE_STRING ) ) this_CLOSE_49= RULE_CLOSE )? (this_OPEN_50= RULE_OPEN otherlv_51= 'ModificationDate' ( (lv_modificationDate_52_0= RULE_TEXT ) ) this_CLOSE_53= RULE_CLOSE )? (this_OPEN_54= RULE_OPEN otherlv_55= 'MOMVersion' ( (lv_momVersion_56_0= RULE_STRING ) ) this_CLOSE_57= RULE_CLOSE )? ( (lv_timeRepresentation_58_0= ruleTimeRepresentation ) )? ( (lv_lookAhead_59_0= ruleLookahead ) )? ( (lv_omtComponents_60_0= ruleOMTComponent ) )* this_CLOSE_61= RULE_CLOSE )
            // InternalOmt.g:198:3: this_OPEN_0= RULE_OPEN otherlv_1= 'ObjectModel' (this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE ) (this_OPEN_6= RULE_OPEN otherlv_7= 'VersionNumber' ( (lv_version_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE ) (this_OPEN_10= RULE_OPEN otherlv_11= 'Type' ( (lv_type_12_0= ruleMOD_Type ) ) this_CLOSE_13= RULE_CLOSE )? (this_OPEN_14= RULE_OPEN otherlv_15= 'Purpose' ( (lv_purpose_16_0= RULE_STRING ) ) this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'ApplicationDomain' ( (lv_domain_20_0= RULE_STRING ) ) this_CLOSE_21= RULE_CLOSE )? (this_OPEN_22= RULE_OPEN otherlv_23= 'SponsorOrgName' ( (lv_sponsor_24_0= RULE_STRING ) ) this_CLOSE_25= RULE_CLOSE )? (this_OPEN_26= RULE_OPEN otherlv_27= 'POCHonorificName' ( (lv_pocHonorific_28_0= RULE_STRING ) ) this_CLOSE_29= RULE_CLOSE )? (this_OPEN_30= RULE_OPEN otherlv_31= 'POCFirstName' ( (lv_pocFirstName_32_0= RULE_STRING ) ) this_CLOSE_33= RULE_CLOSE )? (this_OPEN_34= RULE_OPEN otherlv_35= 'POCLastName' ( (lv_pocLastName_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? (this_OPEN_38= RULE_OPEN otherlv_39= 'POCOrgName' ( (lv_pocOrgName_40_0= RULE_STRING ) ) this_CLOSE_41= RULE_CLOSE )? (this_OPEN_42= RULE_OPEN otherlv_43= 'POCPhone' ( (lv_pocPhone_44_0= RULE_STRING ) ) this_CLOSE_45= RULE_CLOSE )? (this_OPEN_46= RULE_OPEN otherlv_47= 'POCEmail' ( (lv_pocEmail_48_0= RULE_STRING ) ) this_CLOSE_49= RULE_CLOSE )? (this_OPEN_50= RULE_OPEN otherlv_51= 'ModificationDate' ( (lv_modificationDate_52_0= RULE_TEXT ) ) this_CLOSE_53= RULE_CLOSE )? (this_OPEN_54= RULE_OPEN otherlv_55= 'MOMVersion' ( (lv_momVersion_56_0= RULE_STRING ) ) this_CLOSE_57= RULE_CLOSE )? ( (lv_timeRepresentation_58_0= ruleTimeRepresentation ) )? ( (lv_lookAhead_59_0= ruleLookahead ) )? ( (lv_omtComponents_60_0= ruleOMTComponent ) )* this_CLOSE_61= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_9); 

            			newLeafNode(this_OPEN_0, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectModelAccess().getObjectModelKeyword_1());
            		
            // InternalOmt.g:206:3: (this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE )
            // InternalOmt.g:207:4: this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE
            {
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_10); 

            				newLeafNode(this_OPEN_2, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_2_0());
            			
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            				newLeafNode(otherlv_3, grammarAccess.getObjectModelAccess().getNameKeyword_2_1());
            			
            // InternalOmt.g:215:4: ( (lv_name_4_0= RULE_STRING ) )
            // InternalOmt.g:216:5: (lv_name_4_0= RULE_STRING )
            {
            // InternalOmt.g:216:5: (lv_name_4_0= RULE_STRING )
            // InternalOmt.g:217:6: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

            						newLeafNode(lv_name_4_0, grammarAccess.getObjectModelAccess().getNameSTRINGTerminalRuleCall_2_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getObjectModelRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_4_0,
            							"com.cohesionforce.hla.dsl.Omt.STRING");
            					

            }


            }

            this_CLOSE_5=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            				newLeafNode(this_CLOSE_5, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_2_3());
            			

            }

            // InternalOmt.g:238:3: (this_OPEN_6= RULE_OPEN otherlv_7= 'VersionNumber' ( (lv_version_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE )
            // InternalOmt.g:239:4: this_OPEN_6= RULE_OPEN otherlv_7= 'VersionNumber' ( (lv_version_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE
            {
            this_OPEN_6=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_12); 

            				newLeafNode(this_OPEN_6, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_3_0());
            			
            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_11); 

            				newLeafNode(otherlv_7, grammarAccess.getObjectModelAccess().getVersionNumberKeyword_3_1());
            			
            // InternalOmt.g:247:4: ( (lv_version_8_0= RULE_STRING ) )
            // InternalOmt.g:248:5: (lv_version_8_0= RULE_STRING )
            {
            // InternalOmt.g:248:5: (lv_version_8_0= RULE_STRING )
            // InternalOmt.g:249:6: lv_version_8_0= RULE_STRING
            {
            lv_version_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

            						newLeafNode(lv_version_8_0, grammarAccess.getObjectModelAccess().getVersionSTRINGTerminalRuleCall_3_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getObjectModelRule());
            						}
            						setWithLastConsumed(
            							current,
            							"version",
            							lv_version_8_0,
            							"com.cohesionforce.hla.dsl.Omt.STRING");
            					

            }


            }

            this_CLOSE_9=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

            				newLeafNode(this_CLOSE_9, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_3_3());
            			

            }

            // InternalOmt.g:270:3: (this_OPEN_10= RULE_OPEN otherlv_11= 'Type' ( (lv_type_12_0= ruleMOD_Type ) ) this_CLOSE_13= RULE_CLOSE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_OPEN) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==21) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalOmt.g:271:4: this_OPEN_10= RULE_OPEN otherlv_11= 'Type' ( (lv_type_12_0= ruleMOD_Type ) ) this_CLOSE_13= RULE_CLOSE
                    {
                    this_OPEN_10=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_14); 

                    				newLeafNode(this_OPEN_10, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_4_0());
                    			
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getObjectModelAccess().getTypeKeyword_4_1());
                    			
                    // InternalOmt.g:279:4: ( (lv_type_12_0= ruleMOD_Type ) )
                    // InternalOmt.g:280:5: (lv_type_12_0= ruleMOD_Type )
                    {
                    // InternalOmt.g:280:5: (lv_type_12_0= ruleMOD_Type )
                    // InternalOmt.g:281:6: lv_type_12_0= ruleMOD_Type
                    {

                    						newCompositeNode(grammarAccess.getObjectModelAccess().getTypeMOD_TypeParserRuleCall_4_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_type_12_0=ruleMOD_Type();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectModelRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_12_0,
                    							"com.cohesionforce.hla.dsl.Omt.MOD_Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_CLOSE_13=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_13, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:303:3: (this_OPEN_14= RULE_OPEN otherlv_15= 'Purpose' ( (lv_purpose_16_0= RULE_STRING ) ) this_CLOSE_17= RULE_CLOSE )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_OPEN) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==22) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalOmt.g:304:4: this_OPEN_14= RULE_OPEN otherlv_15= 'Purpose' ( (lv_purpose_16_0= RULE_STRING ) ) this_CLOSE_17= RULE_CLOSE
                    {
                    this_OPEN_14=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_16); 

                    				newLeafNode(this_OPEN_14, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_5_0());
                    			
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getObjectModelAccess().getPurposeKeyword_5_1());
                    			
                    // InternalOmt.g:312:4: ( (lv_purpose_16_0= RULE_STRING ) )
                    // InternalOmt.g:313:5: (lv_purpose_16_0= RULE_STRING )
                    {
                    // InternalOmt.g:313:5: (lv_purpose_16_0= RULE_STRING )
                    // InternalOmt.g:314:6: lv_purpose_16_0= RULE_STRING
                    {
                    lv_purpose_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_purpose_16_0, grammarAccess.getObjectModelAccess().getPurposeSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"purpose",
                    							lv_purpose_16_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_17=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_17, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:335:3: (this_OPEN_18= RULE_OPEN otherlv_19= 'ApplicationDomain' ( (lv_domain_20_0= RULE_STRING ) ) this_CLOSE_21= RULE_CLOSE )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_OPEN) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==23) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalOmt.g:336:4: this_OPEN_18= RULE_OPEN otherlv_19= 'ApplicationDomain' ( (lv_domain_20_0= RULE_STRING ) ) this_CLOSE_21= RULE_CLOSE
                    {
                    this_OPEN_18=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_17); 

                    				newLeafNode(this_OPEN_18, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_6_0());
                    			
                    otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_19, grammarAccess.getObjectModelAccess().getApplicationDomainKeyword_6_1());
                    			
                    // InternalOmt.g:344:4: ( (lv_domain_20_0= RULE_STRING ) )
                    // InternalOmt.g:345:5: (lv_domain_20_0= RULE_STRING )
                    {
                    // InternalOmt.g:345:5: (lv_domain_20_0= RULE_STRING )
                    // InternalOmt.g:346:6: lv_domain_20_0= RULE_STRING
                    {
                    lv_domain_20_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_domain_20_0, grammarAccess.getObjectModelAccess().getDomainSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"domain",
                    							lv_domain_20_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_21=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_21, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:367:3: (this_OPEN_22= RULE_OPEN otherlv_23= 'SponsorOrgName' ( (lv_sponsor_24_0= RULE_STRING ) ) this_CLOSE_25= RULE_CLOSE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_OPEN) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==24) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalOmt.g:368:4: this_OPEN_22= RULE_OPEN otherlv_23= 'SponsorOrgName' ( (lv_sponsor_24_0= RULE_STRING ) ) this_CLOSE_25= RULE_CLOSE
                    {
                    this_OPEN_22=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_18); 

                    				newLeafNode(this_OPEN_22, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_7_0());
                    			
                    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_23, grammarAccess.getObjectModelAccess().getSponsorOrgNameKeyword_7_1());
                    			
                    // InternalOmt.g:376:4: ( (lv_sponsor_24_0= RULE_STRING ) )
                    // InternalOmt.g:377:5: (lv_sponsor_24_0= RULE_STRING )
                    {
                    // InternalOmt.g:377:5: (lv_sponsor_24_0= RULE_STRING )
                    // InternalOmt.g:378:6: lv_sponsor_24_0= RULE_STRING
                    {
                    lv_sponsor_24_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_sponsor_24_0, grammarAccess.getObjectModelAccess().getSponsorSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sponsor",
                    							lv_sponsor_24_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_25=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_25, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:399:3: (this_OPEN_26= RULE_OPEN otherlv_27= 'POCHonorificName' ( (lv_pocHonorific_28_0= RULE_STRING ) ) this_CLOSE_29= RULE_CLOSE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OPEN) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==25) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalOmt.g:400:4: this_OPEN_26= RULE_OPEN otherlv_27= 'POCHonorificName' ( (lv_pocHonorific_28_0= RULE_STRING ) ) this_CLOSE_29= RULE_CLOSE
                    {
                    this_OPEN_26=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_19); 

                    				newLeafNode(this_OPEN_26, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_8_0());
                    			
                    otherlv_27=(Token)match(input,25,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_27, grammarAccess.getObjectModelAccess().getPOCHonorificNameKeyword_8_1());
                    			
                    // InternalOmt.g:408:4: ( (lv_pocHonorific_28_0= RULE_STRING ) )
                    // InternalOmt.g:409:5: (lv_pocHonorific_28_0= RULE_STRING )
                    {
                    // InternalOmt.g:409:5: (lv_pocHonorific_28_0= RULE_STRING )
                    // InternalOmt.g:410:6: lv_pocHonorific_28_0= RULE_STRING
                    {
                    lv_pocHonorific_28_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_pocHonorific_28_0, grammarAccess.getObjectModelAccess().getPocHonorificSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pocHonorific",
                    							lv_pocHonorific_28_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_29=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_29, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:431:3: (this_OPEN_30= RULE_OPEN otherlv_31= 'POCFirstName' ( (lv_pocFirstName_32_0= RULE_STRING ) ) this_CLOSE_33= RULE_CLOSE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_OPEN) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==26) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalOmt.g:432:4: this_OPEN_30= RULE_OPEN otherlv_31= 'POCFirstName' ( (lv_pocFirstName_32_0= RULE_STRING ) ) this_CLOSE_33= RULE_CLOSE
                    {
                    this_OPEN_30=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_20); 

                    				newLeafNode(this_OPEN_30, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_9_0());
                    			
                    otherlv_31=(Token)match(input,26,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_31, grammarAccess.getObjectModelAccess().getPOCFirstNameKeyword_9_1());
                    			
                    // InternalOmt.g:440:4: ( (lv_pocFirstName_32_0= RULE_STRING ) )
                    // InternalOmt.g:441:5: (lv_pocFirstName_32_0= RULE_STRING )
                    {
                    // InternalOmt.g:441:5: (lv_pocFirstName_32_0= RULE_STRING )
                    // InternalOmt.g:442:6: lv_pocFirstName_32_0= RULE_STRING
                    {
                    lv_pocFirstName_32_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_pocFirstName_32_0, grammarAccess.getObjectModelAccess().getPocFirstNameSTRINGTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pocFirstName",
                    							lv_pocFirstName_32_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_33=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_33, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:463:3: (this_OPEN_34= RULE_OPEN otherlv_35= 'POCLastName' ( (lv_pocLastName_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OPEN) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==27) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalOmt.g:464:4: this_OPEN_34= RULE_OPEN otherlv_35= 'POCLastName' ( (lv_pocLastName_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE
                    {
                    this_OPEN_34=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_21); 

                    				newLeafNode(this_OPEN_34, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_10_0());
                    			
                    otherlv_35=(Token)match(input,27,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_35, grammarAccess.getObjectModelAccess().getPOCLastNameKeyword_10_1());
                    			
                    // InternalOmt.g:472:4: ( (lv_pocLastName_36_0= RULE_STRING ) )
                    // InternalOmt.g:473:5: (lv_pocLastName_36_0= RULE_STRING )
                    {
                    // InternalOmt.g:473:5: (lv_pocLastName_36_0= RULE_STRING )
                    // InternalOmt.g:474:6: lv_pocLastName_36_0= RULE_STRING
                    {
                    lv_pocLastName_36_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_pocLastName_36_0, grammarAccess.getObjectModelAccess().getPocLastNameSTRINGTerminalRuleCall_10_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pocLastName",
                    							lv_pocLastName_36_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_37=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_37, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_10_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:495:3: (this_OPEN_38= RULE_OPEN otherlv_39= 'POCOrgName' ( (lv_pocOrgName_40_0= RULE_STRING ) ) this_CLOSE_41= RULE_CLOSE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_OPEN) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==28) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalOmt.g:496:4: this_OPEN_38= RULE_OPEN otherlv_39= 'POCOrgName' ( (lv_pocOrgName_40_0= RULE_STRING ) ) this_CLOSE_41= RULE_CLOSE
                    {
                    this_OPEN_38=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_22); 

                    				newLeafNode(this_OPEN_38, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_11_0());
                    			
                    otherlv_39=(Token)match(input,28,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_39, grammarAccess.getObjectModelAccess().getPOCOrgNameKeyword_11_1());
                    			
                    // InternalOmt.g:504:4: ( (lv_pocOrgName_40_0= RULE_STRING ) )
                    // InternalOmt.g:505:5: (lv_pocOrgName_40_0= RULE_STRING )
                    {
                    // InternalOmt.g:505:5: (lv_pocOrgName_40_0= RULE_STRING )
                    // InternalOmt.g:506:6: lv_pocOrgName_40_0= RULE_STRING
                    {
                    lv_pocOrgName_40_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_pocOrgName_40_0, grammarAccess.getObjectModelAccess().getPocOrgNameSTRINGTerminalRuleCall_11_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pocOrgName",
                    							lv_pocOrgName_40_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_41=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_41, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_11_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:527:3: (this_OPEN_42= RULE_OPEN otherlv_43= 'POCPhone' ( (lv_pocPhone_44_0= RULE_STRING ) ) this_CLOSE_45= RULE_CLOSE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_OPEN) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==29) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalOmt.g:528:4: this_OPEN_42= RULE_OPEN otherlv_43= 'POCPhone' ( (lv_pocPhone_44_0= RULE_STRING ) ) this_CLOSE_45= RULE_CLOSE
                    {
                    this_OPEN_42=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_23); 

                    				newLeafNode(this_OPEN_42, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_12_0());
                    			
                    otherlv_43=(Token)match(input,29,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_43, grammarAccess.getObjectModelAccess().getPOCPhoneKeyword_12_1());
                    			
                    // InternalOmt.g:536:4: ( (lv_pocPhone_44_0= RULE_STRING ) )
                    // InternalOmt.g:537:5: (lv_pocPhone_44_0= RULE_STRING )
                    {
                    // InternalOmt.g:537:5: (lv_pocPhone_44_0= RULE_STRING )
                    // InternalOmt.g:538:6: lv_pocPhone_44_0= RULE_STRING
                    {
                    lv_pocPhone_44_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_pocPhone_44_0, grammarAccess.getObjectModelAccess().getPocPhoneSTRINGTerminalRuleCall_12_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pocPhone",
                    							lv_pocPhone_44_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_45=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_45, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_12_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:559:3: (this_OPEN_46= RULE_OPEN otherlv_47= 'POCEmail' ( (lv_pocEmail_48_0= RULE_STRING ) ) this_CLOSE_49= RULE_CLOSE )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OPEN) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==30) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalOmt.g:560:4: this_OPEN_46= RULE_OPEN otherlv_47= 'POCEmail' ( (lv_pocEmail_48_0= RULE_STRING ) ) this_CLOSE_49= RULE_CLOSE
                    {
                    this_OPEN_46=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_24); 

                    				newLeafNode(this_OPEN_46, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_13_0());
                    			
                    otherlv_47=(Token)match(input,30,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_47, grammarAccess.getObjectModelAccess().getPOCEmailKeyword_13_1());
                    			
                    // InternalOmt.g:568:4: ( (lv_pocEmail_48_0= RULE_STRING ) )
                    // InternalOmt.g:569:5: (lv_pocEmail_48_0= RULE_STRING )
                    {
                    // InternalOmt.g:569:5: (lv_pocEmail_48_0= RULE_STRING )
                    // InternalOmt.g:570:6: lv_pocEmail_48_0= RULE_STRING
                    {
                    lv_pocEmail_48_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_pocEmail_48_0, grammarAccess.getObjectModelAccess().getPocEmailSTRINGTerminalRuleCall_13_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pocEmail",
                    							lv_pocEmail_48_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_49=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_49, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_13_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:591:3: (this_OPEN_50= RULE_OPEN otherlv_51= 'ModificationDate' ( (lv_modificationDate_52_0= RULE_TEXT ) ) this_CLOSE_53= RULE_CLOSE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_OPEN) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==31) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalOmt.g:592:4: this_OPEN_50= RULE_OPEN otherlv_51= 'ModificationDate' ( (lv_modificationDate_52_0= RULE_TEXT ) ) this_CLOSE_53= RULE_CLOSE
                    {
                    this_OPEN_50=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_25); 

                    				newLeafNode(this_OPEN_50, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_14_0());
                    			
                    otherlv_51=(Token)match(input,31,FollowSets000.FOLLOW_26); 

                    				newLeafNode(otherlv_51, grammarAccess.getObjectModelAccess().getModificationDateKeyword_14_1());
                    			
                    // InternalOmt.g:600:4: ( (lv_modificationDate_52_0= RULE_TEXT ) )
                    // InternalOmt.g:601:5: (lv_modificationDate_52_0= RULE_TEXT )
                    {
                    // InternalOmt.g:601:5: (lv_modificationDate_52_0= RULE_TEXT )
                    // InternalOmt.g:602:6: lv_modificationDate_52_0= RULE_TEXT
                    {
                    lv_modificationDate_52_0=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_modificationDate_52_0, grammarAccess.getObjectModelAccess().getModificationDateTEXTTerminalRuleCall_14_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"modificationDate",
                    							lv_modificationDate_52_0,
                    							"com.cohesionforce.hla.dsl.Omt.TEXT");
                    					

                    }


                    }

                    this_CLOSE_53=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_53, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_14_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:623:3: (this_OPEN_54= RULE_OPEN otherlv_55= 'MOMVersion' ( (lv_momVersion_56_0= RULE_STRING ) ) this_CLOSE_57= RULE_CLOSE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_OPEN) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==32) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalOmt.g:624:4: this_OPEN_54= RULE_OPEN otherlv_55= 'MOMVersion' ( (lv_momVersion_56_0= RULE_STRING ) ) this_CLOSE_57= RULE_CLOSE
                    {
                    this_OPEN_54=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_27); 

                    				newLeafNode(this_OPEN_54, grammarAccess.getObjectModelAccess().getOPENTerminalRuleCall_15_0());
                    			
                    otherlv_55=(Token)match(input,32,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_55, grammarAccess.getObjectModelAccess().getMOMVersionKeyword_15_1());
                    			
                    // InternalOmt.g:632:4: ( (lv_momVersion_56_0= RULE_STRING ) )
                    // InternalOmt.g:633:5: (lv_momVersion_56_0= RULE_STRING )
                    {
                    // InternalOmt.g:633:5: (lv_momVersion_56_0= RULE_STRING )
                    // InternalOmt.g:634:6: lv_momVersion_56_0= RULE_STRING
                    {
                    lv_momVersion_56_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_momVersion_56_0, grammarAccess.getObjectModelAccess().getMomVersionSTRINGTerminalRuleCall_15_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"momVersion",
                    							lv_momVersion_56_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_57=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_57, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_15_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:655:3: ( (lv_timeRepresentation_58_0= ruleTimeRepresentation ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_OPEN) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==33) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalOmt.g:656:4: (lv_timeRepresentation_58_0= ruleTimeRepresentation )
                    {
                    // InternalOmt.g:656:4: (lv_timeRepresentation_58_0= ruleTimeRepresentation )
                    // InternalOmt.g:657:5: lv_timeRepresentation_58_0= ruleTimeRepresentation
                    {

                    					newCompositeNode(grammarAccess.getObjectModelAccess().getTimeRepresentationTimeRepresentationParserRuleCall_16_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_timeRepresentation_58_0=ruleTimeRepresentation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectModelRule());
                    					}
                    					set(
                    						current,
                    						"timeRepresentation",
                    						lv_timeRepresentation_58_0,
                    						"com.cohesionforce.hla.dsl.Omt.TimeRepresentation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:674:3: ( (lv_lookAhead_59_0= ruleLookahead ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_OPEN) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==40) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalOmt.g:675:4: (lv_lookAhead_59_0= ruleLookahead )
                    {
                    // InternalOmt.g:675:4: (lv_lookAhead_59_0= ruleLookahead )
                    // InternalOmt.g:676:5: lv_lookAhead_59_0= ruleLookahead
                    {

                    					newCompositeNode(grammarAccess.getObjectModelAccess().getLookAheadLookaheadParserRuleCall_17_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_lookAhead_59_0=ruleLookahead();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectModelRule());
                    					}
                    					set(
                    						current,
                    						"lookAhead",
                    						lv_lookAhead_59_0,
                    						"com.cohesionforce.hla.dsl.Omt.Lookahead");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:693:3: ( (lv_omtComponents_60_0= ruleOMTComponent ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_OPEN) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOmt.g:694:4: (lv_omtComponents_60_0= ruleOMTComponent )
            	    {
            	    // InternalOmt.g:694:4: (lv_omtComponents_60_0= ruleOMTComponent )
            	    // InternalOmt.g:695:5: lv_omtComponents_60_0= ruleOMTComponent
            	    {

            	    					newCompositeNode(grammarAccess.getObjectModelAccess().getOmtComponentsOMTComponentParserRuleCall_18_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_omtComponents_60_0=ruleOMTComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"omtComponents",
            	    						lv_omtComponents_60_0,
            	    						"com.cohesionforce.hla.dsl.Omt.OMTComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            this_CLOSE_61=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_61, grammarAccess.getObjectModelAccess().getCLOSETerminalRuleCall_19());
            		

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
    // $ANTLR end "ruleObjectModel"


    // $ANTLR start "entryRuleTimeRepresentation"
    // InternalOmt.g:720:1: entryRuleTimeRepresentation returns [EObject current=null] : iv_ruleTimeRepresentation= ruleTimeRepresentation EOF ;
    public final EObject entryRuleTimeRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeRepresentation = null;


        try {
            // InternalOmt.g:720:59: (iv_ruleTimeRepresentation= ruleTimeRepresentation EOF )
            // InternalOmt.g:721:2: iv_ruleTimeRepresentation= ruleTimeRepresentation EOF
            {
             newCompositeNode(grammarAccess.getTimeRepresentationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTimeRepresentation=ruleTimeRepresentation();

            state._fsp--;

             current =iv_ruleTimeRepresentation; 
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
    // $ANTLR end "entryRuleTimeRepresentation"


    // $ANTLR start "ruleTimeRepresentation"
    // InternalOmt.g:727:1: ruleTimeRepresentation returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'TimeRepresentation' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Minimum' ( (lv_min_9_0= RULE_STRING ) ) ( (lv_minNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_OPEN_12= RULE_OPEN otherlv_13= 'Maximum' ( (lv_max_14_0= RULE_STRING ) ) ( (lv_maxNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE this_OPEN_17= RULE_OPEN otherlv_18= 'InitialValue' ( (lv_initial_19_0= RULE_STRING ) ) ( (lv_initialNote_20_0= ruleNoteRef ) )? this_CLOSE_21= RULE_CLOSE this_OPEN_22= RULE_OPEN otherlv_23= 'DataType' ( (lv_dataType_24_0= RULE_STRING ) ) ( (lv_typeNote_25_0= ruleNoteRef ) )? this_CLOSE_26= RULE_CLOSE (this_OPEN_27= RULE_OPEN otherlv_28= 'Operators' ( (lv_operators_29_0= RULE_STRING ) ) ( (lv_operatorsNote_30_0= ruleNoteRef ) )? this_CLOSE_31= RULE_CLOSE )? this_CLOSE_32= RULE_CLOSE ) ;
    public final EObject ruleTimeRepresentation() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_units_4_0=null;
        Token this_CLOSE_6=null;
        Token this_OPEN_7=null;
        Token otherlv_8=null;
        Token lv_min_9_0=null;
        Token this_CLOSE_11=null;
        Token this_OPEN_12=null;
        Token otherlv_13=null;
        Token lv_max_14_0=null;
        Token this_CLOSE_16=null;
        Token this_OPEN_17=null;
        Token otherlv_18=null;
        Token lv_initial_19_0=null;
        Token this_CLOSE_21=null;
        Token this_OPEN_22=null;
        Token otherlv_23=null;
        Token lv_dataType_24_0=null;
        Token this_CLOSE_26=null;
        Token this_OPEN_27=null;
        Token otherlv_28=null;
        Token lv_operators_29_0=null;
        Token this_CLOSE_31=null;
        Token this_CLOSE_32=null;
        EObject lv_unitsNote_5_0 = null;

        EObject lv_minNote_10_0 = null;

        EObject lv_maxNote_15_0 = null;

        EObject lv_initialNote_20_0 = null;

        EObject lv_typeNote_25_0 = null;

        EObject lv_operatorsNote_30_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:733:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'TimeRepresentation' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Minimum' ( (lv_min_9_0= RULE_STRING ) ) ( (lv_minNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_OPEN_12= RULE_OPEN otherlv_13= 'Maximum' ( (lv_max_14_0= RULE_STRING ) ) ( (lv_maxNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE this_OPEN_17= RULE_OPEN otherlv_18= 'InitialValue' ( (lv_initial_19_0= RULE_STRING ) ) ( (lv_initialNote_20_0= ruleNoteRef ) )? this_CLOSE_21= RULE_CLOSE this_OPEN_22= RULE_OPEN otherlv_23= 'DataType' ( (lv_dataType_24_0= RULE_STRING ) ) ( (lv_typeNote_25_0= ruleNoteRef ) )? this_CLOSE_26= RULE_CLOSE (this_OPEN_27= RULE_OPEN otherlv_28= 'Operators' ( (lv_operators_29_0= RULE_STRING ) ) ( (lv_operatorsNote_30_0= ruleNoteRef ) )? this_CLOSE_31= RULE_CLOSE )? this_CLOSE_32= RULE_CLOSE ) )
            // InternalOmt.g:734:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'TimeRepresentation' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Minimum' ( (lv_min_9_0= RULE_STRING ) ) ( (lv_minNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_OPEN_12= RULE_OPEN otherlv_13= 'Maximum' ( (lv_max_14_0= RULE_STRING ) ) ( (lv_maxNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE this_OPEN_17= RULE_OPEN otherlv_18= 'InitialValue' ( (lv_initial_19_0= RULE_STRING ) ) ( (lv_initialNote_20_0= ruleNoteRef ) )? this_CLOSE_21= RULE_CLOSE this_OPEN_22= RULE_OPEN otherlv_23= 'DataType' ( (lv_dataType_24_0= RULE_STRING ) ) ( (lv_typeNote_25_0= ruleNoteRef ) )? this_CLOSE_26= RULE_CLOSE (this_OPEN_27= RULE_OPEN otherlv_28= 'Operators' ( (lv_operators_29_0= RULE_STRING ) ) ( (lv_operatorsNote_30_0= ruleNoteRef ) )? this_CLOSE_31= RULE_CLOSE )? this_CLOSE_32= RULE_CLOSE )
            {
            // InternalOmt.g:734:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'TimeRepresentation' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Minimum' ( (lv_min_9_0= RULE_STRING ) ) ( (lv_minNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_OPEN_12= RULE_OPEN otherlv_13= 'Maximum' ( (lv_max_14_0= RULE_STRING ) ) ( (lv_maxNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE this_OPEN_17= RULE_OPEN otherlv_18= 'InitialValue' ( (lv_initial_19_0= RULE_STRING ) ) ( (lv_initialNote_20_0= ruleNoteRef ) )? this_CLOSE_21= RULE_CLOSE this_OPEN_22= RULE_OPEN otherlv_23= 'DataType' ( (lv_dataType_24_0= RULE_STRING ) ) ( (lv_typeNote_25_0= ruleNoteRef ) )? this_CLOSE_26= RULE_CLOSE (this_OPEN_27= RULE_OPEN otherlv_28= 'Operators' ( (lv_operators_29_0= RULE_STRING ) ) ( (lv_operatorsNote_30_0= ruleNoteRef ) )? this_CLOSE_31= RULE_CLOSE )? this_CLOSE_32= RULE_CLOSE )
            // InternalOmt.g:735:3: this_OPEN_0= RULE_OPEN otherlv_1= 'TimeRepresentation' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Minimum' ( (lv_min_9_0= RULE_STRING ) ) ( (lv_minNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_OPEN_12= RULE_OPEN otherlv_13= 'Maximum' ( (lv_max_14_0= RULE_STRING ) ) ( (lv_maxNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE this_OPEN_17= RULE_OPEN otherlv_18= 'InitialValue' ( (lv_initial_19_0= RULE_STRING ) ) ( (lv_initialNote_20_0= ruleNoteRef ) )? this_CLOSE_21= RULE_CLOSE this_OPEN_22= RULE_OPEN otherlv_23= 'DataType' ( (lv_dataType_24_0= RULE_STRING ) ) ( (lv_typeNote_25_0= ruleNoteRef ) )? this_CLOSE_26= RULE_CLOSE (this_OPEN_27= RULE_OPEN otherlv_28= 'Operators' ( (lv_operators_29_0= RULE_STRING ) ) ( (lv_operatorsNote_30_0= ruleNoteRef ) )? this_CLOSE_31= RULE_CLOSE )? this_CLOSE_32= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_28); 

            			newLeafNode(this_OPEN_0, grammarAccess.getTimeRepresentationAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeRepresentationAccess().getTimeRepresentationKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_29); 

            			newLeafNode(this_OPEN_2, grammarAccess.getTimeRepresentationAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeRepresentationAccess().getUnitsKeyword_3());
            		
            // InternalOmt.g:751:3: ( (lv_units_4_0= RULE_STRING ) )
            // InternalOmt.g:752:4: (lv_units_4_0= RULE_STRING )
            {
            // InternalOmt.g:752:4: (lv_units_4_0= RULE_STRING )
            // InternalOmt.g:753:5: lv_units_4_0= RULE_STRING
            {
            lv_units_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_units_4_0, grammarAccess.getTimeRepresentationAccess().getUnitsSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRepresentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"units",
            						lv_units_4_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:769:3: ( (lv_unitsNote_5_0= ruleNoteRef ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==108) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOmt.g:770:4: (lv_unitsNote_5_0= ruleNoteRef )
                    {
                    // InternalOmt.g:770:4: (lv_unitsNote_5_0= ruleNoteRef )
                    // InternalOmt.g:771:5: lv_unitsNote_5_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getTimeRepresentationAccess().getUnitsNoteNoteRefParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_unitsNote_5_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTimeRepresentationRule());
                    					}
                    					set(
                    						current,
                    						"unitsNote",
                    						lv_unitsNote_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getTimeRepresentationAccess().getCLOSETerminalRuleCall_6());
            		
            this_OPEN_7=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_31); 

            			newLeafNode(this_OPEN_7, grammarAccess.getTimeRepresentationAccess().getOPENTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,35,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getTimeRepresentationAccess().getMinimumKeyword_8());
            		
            // InternalOmt.g:800:3: ( (lv_min_9_0= RULE_STRING ) )
            // InternalOmt.g:801:4: (lv_min_9_0= RULE_STRING )
            {
            // InternalOmt.g:801:4: (lv_min_9_0= RULE_STRING )
            // InternalOmt.g:802:5: lv_min_9_0= RULE_STRING
            {
            lv_min_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_min_9_0, grammarAccess.getTimeRepresentationAccess().getMinSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRepresentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_9_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:818:3: ( (lv_minNote_10_0= ruleNoteRef ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==108) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOmt.g:819:4: (lv_minNote_10_0= ruleNoteRef )
                    {
                    // InternalOmt.g:819:4: (lv_minNote_10_0= ruleNoteRef )
                    // InternalOmt.g:820:5: lv_minNote_10_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getTimeRepresentationAccess().getMinNoteNoteRefParserRuleCall_10_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_minNote_10_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTimeRepresentationRule());
                    					}
                    					set(
                    						current,
                    						"minNote",
                    						lv_minNote_10_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_11=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_11, grammarAccess.getTimeRepresentationAccess().getCLOSETerminalRuleCall_11());
            		
            this_OPEN_12=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_32); 

            			newLeafNode(this_OPEN_12, grammarAccess.getTimeRepresentationAccess().getOPENTerminalRuleCall_12());
            		
            otherlv_13=(Token)match(input,36,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getTimeRepresentationAccess().getMaximumKeyword_13());
            		
            // InternalOmt.g:849:3: ( (lv_max_14_0= RULE_STRING ) )
            // InternalOmt.g:850:4: (lv_max_14_0= RULE_STRING )
            {
            // InternalOmt.g:850:4: (lv_max_14_0= RULE_STRING )
            // InternalOmt.g:851:5: lv_max_14_0= RULE_STRING
            {
            lv_max_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_max_14_0, grammarAccess.getTimeRepresentationAccess().getMaxSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRepresentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_14_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:867:3: ( (lv_maxNote_15_0= ruleNoteRef ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==108) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOmt.g:868:4: (lv_maxNote_15_0= ruleNoteRef )
                    {
                    // InternalOmt.g:868:4: (lv_maxNote_15_0= ruleNoteRef )
                    // InternalOmt.g:869:5: lv_maxNote_15_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getTimeRepresentationAccess().getMaxNoteNoteRefParserRuleCall_15_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_maxNote_15_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTimeRepresentationRule());
                    					}
                    					set(
                    						current,
                    						"maxNote",
                    						lv_maxNote_15_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_16=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_16, grammarAccess.getTimeRepresentationAccess().getCLOSETerminalRuleCall_16());
            		
            this_OPEN_17=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_33); 

            			newLeafNode(this_OPEN_17, grammarAccess.getTimeRepresentationAccess().getOPENTerminalRuleCall_17());
            		
            otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_18, grammarAccess.getTimeRepresentationAccess().getInitialValueKeyword_18());
            		
            // InternalOmt.g:898:3: ( (lv_initial_19_0= RULE_STRING ) )
            // InternalOmt.g:899:4: (lv_initial_19_0= RULE_STRING )
            {
            // InternalOmt.g:899:4: (lv_initial_19_0= RULE_STRING )
            // InternalOmt.g:900:5: lv_initial_19_0= RULE_STRING
            {
            lv_initial_19_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_initial_19_0, grammarAccess.getTimeRepresentationAccess().getInitialSTRINGTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRepresentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initial",
            						lv_initial_19_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:916:3: ( (lv_initialNote_20_0= ruleNoteRef ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==108) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOmt.g:917:4: (lv_initialNote_20_0= ruleNoteRef )
                    {
                    // InternalOmt.g:917:4: (lv_initialNote_20_0= ruleNoteRef )
                    // InternalOmt.g:918:5: lv_initialNote_20_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getTimeRepresentationAccess().getInitialNoteNoteRefParserRuleCall_20_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_initialNote_20_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTimeRepresentationRule());
                    					}
                    					set(
                    						current,
                    						"initialNote",
                    						lv_initialNote_20_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_21=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_21, grammarAccess.getTimeRepresentationAccess().getCLOSETerminalRuleCall_21());
            		
            this_OPEN_22=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_34); 

            			newLeafNode(this_OPEN_22, grammarAccess.getTimeRepresentationAccess().getOPENTerminalRuleCall_22());
            		
            otherlv_23=(Token)match(input,38,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_23, grammarAccess.getTimeRepresentationAccess().getDataTypeKeyword_23());
            		
            // InternalOmt.g:947:3: ( (lv_dataType_24_0= RULE_STRING ) )
            // InternalOmt.g:948:4: (lv_dataType_24_0= RULE_STRING )
            {
            // InternalOmt.g:948:4: (lv_dataType_24_0= RULE_STRING )
            // InternalOmt.g:949:5: lv_dataType_24_0= RULE_STRING
            {
            lv_dataType_24_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_dataType_24_0, grammarAccess.getTimeRepresentationAccess().getDataTypeSTRINGTerminalRuleCall_24_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRepresentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataType",
            						lv_dataType_24_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:965:3: ( (lv_typeNote_25_0= ruleNoteRef ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==108) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOmt.g:966:4: (lv_typeNote_25_0= ruleNoteRef )
                    {
                    // InternalOmt.g:966:4: (lv_typeNote_25_0= ruleNoteRef )
                    // InternalOmt.g:967:5: lv_typeNote_25_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getTimeRepresentationAccess().getTypeNoteNoteRefParserRuleCall_25_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_typeNote_25_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTimeRepresentationRule());
                    					}
                    					set(
                    						current,
                    						"typeNote",
                    						lv_typeNote_25_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_26=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

            			newLeafNode(this_CLOSE_26, grammarAccess.getTimeRepresentationAccess().getCLOSETerminalRuleCall_26());
            		
            // InternalOmt.g:988:3: (this_OPEN_27= RULE_OPEN otherlv_28= 'Operators' ( (lv_operators_29_0= RULE_STRING ) ) ( (lv_operatorsNote_30_0= ruleNoteRef ) )? this_CLOSE_31= RULE_CLOSE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_OPEN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOmt.g:989:4: this_OPEN_27= RULE_OPEN otherlv_28= 'Operators' ( (lv_operators_29_0= RULE_STRING ) ) ( (lv_operatorsNote_30_0= ruleNoteRef ) )? this_CLOSE_31= RULE_CLOSE
                    {
                    this_OPEN_27=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_35); 

                    				newLeafNode(this_OPEN_27, grammarAccess.getTimeRepresentationAccess().getOPENTerminalRuleCall_27_0());
                    			
                    otherlv_28=(Token)match(input,39,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_28, grammarAccess.getTimeRepresentationAccess().getOperatorsKeyword_27_1());
                    			
                    // InternalOmt.g:997:4: ( (lv_operators_29_0= RULE_STRING ) )
                    // InternalOmt.g:998:5: (lv_operators_29_0= RULE_STRING )
                    {
                    // InternalOmt.g:998:5: (lv_operators_29_0= RULE_STRING )
                    // InternalOmt.g:999:6: lv_operators_29_0= RULE_STRING
                    {
                    lv_operators_29_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

                    						newLeafNode(lv_operators_29_0, grammarAccess.getTimeRepresentationAccess().getOperatorsSTRINGTerminalRuleCall_27_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeRepresentationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"operators",
                    							lv_operators_29_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    // InternalOmt.g:1015:4: ( (lv_operatorsNote_30_0= ruleNoteRef ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==108) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalOmt.g:1016:5: (lv_operatorsNote_30_0= ruleNoteRef )
                            {
                            // InternalOmt.g:1016:5: (lv_operatorsNote_30_0= ruleNoteRef )
                            // InternalOmt.g:1017:6: lv_operatorsNote_30_0= ruleNoteRef
                            {

                            						newCompositeNode(grammarAccess.getTimeRepresentationAccess().getOperatorsNoteNoteRefParserRuleCall_27_3_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_operatorsNote_30_0=ruleNoteRef();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTimeRepresentationRule());
                            						}
                            						set(
                            							current,
                            							"operatorsNote",
                            							lv_operatorsNote_30_0,
                            							"com.cohesionforce.hla.dsl.Omt.NoteRef");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    this_CLOSE_31=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_7); 

                    				newLeafNode(this_CLOSE_31, grammarAccess.getTimeRepresentationAccess().getCLOSETerminalRuleCall_27_4());
                    			

                    }
                    break;

            }

            this_CLOSE_32=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_32, grammarAccess.getTimeRepresentationAccess().getCLOSETerminalRuleCall_28());
            		

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
    // $ANTLR end "ruleTimeRepresentation"


    // $ANTLR start "entryRuleLookahead"
    // InternalOmt.g:1047:1: entryRuleLookahead returns [EObject current=null] : iv_ruleLookahead= ruleLookahead EOF ;
    public final EObject entryRuleLookahead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookahead = null;


        try {
            // InternalOmt.g:1047:50: (iv_ruleLookahead= ruleLookahead EOF )
            // InternalOmt.g:1048:2: iv_ruleLookahead= ruleLookahead EOF
            {
             newCompositeNode(grammarAccess.getLookaheadRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLookahead=ruleLookahead();

            state._fsp--;

             current =iv_ruleLookahead; 
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
    // $ANTLR end "entryRuleLookahead"


    // $ANTLR start "ruleLookahead"
    // InternalOmt.g:1054:1: ruleLookahead returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Lookahead' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DataType' ( (lv_dataType_9_0= RULE_STRING ) ) ( (lv_typeNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE (this_OPEN_12= RULE_OPEN otherlv_13= 'AdditionOperator' ( (lv_operator_14_0= RULE_STRING ) ) ( (lv_operatorNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE )? this_CLOSE_17= RULE_CLOSE ) ;
    public final EObject ruleLookahead() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_units_4_0=null;
        Token this_CLOSE_6=null;
        Token this_OPEN_7=null;
        Token otherlv_8=null;
        Token lv_dataType_9_0=null;
        Token this_CLOSE_11=null;
        Token this_OPEN_12=null;
        Token otherlv_13=null;
        Token lv_operator_14_0=null;
        Token this_CLOSE_16=null;
        Token this_CLOSE_17=null;
        EObject lv_unitsNote_5_0 = null;

        EObject lv_typeNote_10_0 = null;

        EObject lv_operatorNote_15_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:1060:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Lookahead' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DataType' ( (lv_dataType_9_0= RULE_STRING ) ) ( (lv_typeNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE (this_OPEN_12= RULE_OPEN otherlv_13= 'AdditionOperator' ( (lv_operator_14_0= RULE_STRING ) ) ( (lv_operatorNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE )? this_CLOSE_17= RULE_CLOSE ) )
            // InternalOmt.g:1061:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Lookahead' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DataType' ( (lv_dataType_9_0= RULE_STRING ) ) ( (lv_typeNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE (this_OPEN_12= RULE_OPEN otherlv_13= 'AdditionOperator' ( (lv_operator_14_0= RULE_STRING ) ) ( (lv_operatorNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE )? this_CLOSE_17= RULE_CLOSE )
            {
            // InternalOmt.g:1061:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Lookahead' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DataType' ( (lv_dataType_9_0= RULE_STRING ) ) ( (lv_typeNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE (this_OPEN_12= RULE_OPEN otherlv_13= 'AdditionOperator' ( (lv_operator_14_0= RULE_STRING ) ) ( (lv_operatorNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE )? this_CLOSE_17= RULE_CLOSE )
            // InternalOmt.g:1062:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Lookahead' this_OPEN_2= RULE_OPEN otherlv_3= 'Units' ( (lv_units_4_0= RULE_STRING ) ) ( (lv_unitsNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DataType' ( (lv_dataType_9_0= RULE_STRING ) ) ( (lv_typeNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE (this_OPEN_12= RULE_OPEN otherlv_13= 'AdditionOperator' ( (lv_operator_14_0= RULE_STRING ) ) ( (lv_operatorNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE )? this_CLOSE_17= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_36); 

            			newLeafNode(this_OPEN_0, grammarAccess.getLookaheadAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLookaheadAccess().getLookaheadKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_29); 

            			newLeafNode(this_OPEN_2, grammarAccess.getLookaheadAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getLookaheadAccess().getUnitsKeyword_3());
            		
            // InternalOmt.g:1078:3: ( (lv_units_4_0= RULE_STRING ) )
            // InternalOmt.g:1079:4: (lv_units_4_0= RULE_STRING )
            {
            // InternalOmt.g:1079:4: (lv_units_4_0= RULE_STRING )
            // InternalOmt.g:1080:5: lv_units_4_0= RULE_STRING
            {
            lv_units_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_units_4_0, grammarAccess.getLookaheadAccess().getUnitsSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookaheadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"units",
            						lv_units_4_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:1096:3: ( (lv_unitsNote_5_0= ruleNoteRef ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==108) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOmt.g:1097:4: (lv_unitsNote_5_0= ruleNoteRef )
                    {
                    // InternalOmt.g:1097:4: (lv_unitsNote_5_0= ruleNoteRef )
                    // InternalOmt.g:1098:5: lv_unitsNote_5_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getLookaheadAccess().getUnitsNoteNoteRefParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_unitsNote_5_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLookaheadRule());
                    					}
                    					set(
                    						current,
                    						"unitsNote",
                    						lv_unitsNote_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getLookaheadAccess().getCLOSETerminalRuleCall_6());
            		
            this_OPEN_7=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_34); 

            			newLeafNode(this_OPEN_7, grammarAccess.getLookaheadAccess().getOPENTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,38,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getLookaheadAccess().getDataTypeKeyword_8());
            		
            // InternalOmt.g:1127:3: ( (lv_dataType_9_0= RULE_STRING ) )
            // InternalOmt.g:1128:4: (lv_dataType_9_0= RULE_STRING )
            {
            // InternalOmt.g:1128:4: (lv_dataType_9_0= RULE_STRING )
            // InternalOmt.g:1129:5: lv_dataType_9_0= RULE_STRING
            {
            lv_dataType_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_dataType_9_0, grammarAccess.getLookaheadAccess().getDataTypeSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookaheadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataType",
            						lv_dataType_9_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:1145:3: ( (lv_typeNote_10_0= ruleNoteRef ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==108) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOmt.g:1146:4: (lv_typeNote_10_0= ruleNoteRef )
                    {
                    // InternalOmt.g:1146:4: (lv_typeNote_10_0= ruleNoteRef )
                    // InternalOmt.g:1147:5: lv_typeNote_10_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getLookaheadAccess().getTypeNoteNoteRefParserRuleCall_10_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_typeNote_10_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLookaheadRule());
                    					}
                    					set(
                    						current,
                    						"typeNote",
                    						lv_typeNote_10_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_11=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

            			newLeafNode(this_CLOSE_11, grammarAccess.getLookaheadAccess().getCLOSETerminalRuleCall_11());
            		
            // InternalOmt.g:1168:3: (this_OPEN_12= RULE_OPEN otherlv_13= 'AdditionOperator' ( (lv_operator_14_0= RULE_STRING ) ) ( (lv_operatorNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_OPEN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOmt.g:1169:4: this_OPEN_12= RULE_OPEN otherlv_13= 'AdditionOperator' ( (lv_operator_14_0= RULE_STRING ) ) ( (lv_operatorNote_15_0= ruleNoteRef ) )? this_CLOSE_16= RULE_CLOSE
                    {
                    this_OPEN_12=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_37); 

                    				newLeafNode(this_OPEN_12, grammarAccess.getLookaheadAccess().getOPENTerminalRuleCall_12_0());
                    			
                    otherlv_13=(Token)match(input,41,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getLookaheadAccess().getAdditionOperatorKeyword_12_1());
                    			
                    // InternalOmt.g:1177:4: ( (lv_operator_14_0= RULE_STRING ) )
                    // InternalOmt.g:1178:5: (lv_operator_14_0= RULE_STRING )
                    {
                    // InternalOmt.g:1178:5: (lv_operator_14_0= RULE_STRING )
                    // InternalOmt.g:1179:6: lv_operator_14_0= RULE_STRING
                    {
                    lv_operator_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

                    						newLeafNode(lv_operator_14_0, grammarAccess.getLookaheadAccess().getOperatorSTRINGTerminalRuleCall_12_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLookaheadRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"operator",
                    							lv_operator_14_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    // InternalOmt.g:1195:4: ( (lv_operatorNote_15_0= ruleNoteRef ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==108) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalOmt.g:1196:5: (lv_operatorNote_15_0= ruleNoteRef )
                            {
                            // InternalOmt.g:1196:5: (lv_operatorNote_15_0= ruleNoteRef )
                            // InternalOmt.g:1197:6: lv_operatorNote_15_0= ruleNoteRef
                            {

                            						newCompositeNode(grammarAccess.getLookaheadAccess().getOperatorNoteNoteRefParserRuleCall_12_3_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_operatorNote_15_0=ruleNoteRef();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLookaheadRule());
                            						}
                            						set(
                            							current,
                            							"operatorNote",
                            							lv_operatorNote_15_0,
                            							"com.cohesionforce.hla.dsl.Omt.NoteRef");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    this_CLOSE_16=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_7); 

                    				newLeafNode(this_CLOSE_16, grammarAccess.getLookaheadAccess().getCLOSETerminalRuleCall_12_4());
                    			

                    }
                    break;

            }

            this_CLOSE_17=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_17, grammarAccess.getLookaheadAccess().getCLOSETerminalRuleCall_13());
            		

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
    // $ANTLR end "ruleLookahead"


    // $ANTLR start "entryRuleMOD_Type"
    // InternalOmt.g:1227:1: entryRuleMOD_Type returns [String current=null] : iv_ruleMOD_Type= ruleMOD_Type EOF ;
    public final String entryRuleMOD_Type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMOD_Type = null;


        try {
            // InternalOmt.g:1227:48: (iv_ruleMOD_Type= ruleMOD_Type EOF )
            // InternalOmt.g:1228:2: iv_ruleMOD_Type= ruleMOD_Type EOF
            {
             newCompositeNode(grammarAccess.getMOD_TypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMOD_Type=ruleMOD_Type();

            state._fsp--;

             current =iv_ruleMOD_Type.getText(); 
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
    // $ANTLR end "entryRuleMOD_Type"


    // $ANTLR start "ruleMOD_Type"
    // InternalOmt.g:1234:1: ruleMOD_Type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'FOM' | kw= 'SOM' | kw= 'OTHER' ) ;
    public final AntlrDatatypeRuleToken ruleMOD_Type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOmt.g:1240:2: ( (kw= 'FOM' | kw= 'SOM' | kw= 'OTHER' ) )
            // InternalOmt.g:1241:2: (kw= 'FOM' | kw= 'SOM' | kw= 'OTHER' )
            {
            // InternalOmt.g:1241:2: (kw= 'FOM' | kw= 'SOM' | kw= 'OTHER' )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt28=1;
                }
                break;
            case 43:
                {
                alt28=2;
                }
                break;
            case 44:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalOmt.g:1242:3: kw= 'FOM'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMOD_TypeAccess().getFOMKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:1248:3: kw= 'SOM'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMOD_TypeAccess().getSOMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOmt.g:1254:3: kw= 'OTHER'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMOD_TypeAccess().getOTHERKeyword_2());
                    		

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
    // $ANTLR end "ruleMOD_Type"


    // $ANTLR start "entryRuleOMTComponent"
    // InternalOmt.g:1263:1: entryRuleOMTComponent returns [EObject current=null] : iv_ruleOMTComponent= ruleOMTComponent EOF ;
    public final EObject entryRuleOMTComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOMTComponent = null;


        try {
            // InternalOmt.g:1263:53: (iv_ruleOMTComponent= ruleOMTComponent EOF )
            // InternalOmt.g:1264:2: iv_ruleOMTComponent= ruleOMTComponent EOF
            {
             newCompositeNode(grammarAccess.getOMTComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOMTComponent=ruleOMTComponent();

            state._fsp--;

             current =iv_ruleOMTComponent; 
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
    // $ANTLR end "entryRuleOMTComponent"


    // $ANTLR start "ruleOMTComponent"
    // InternalOmt.g:1270:1: ruleOMTComponent returns [EObject current=null] : (this_Class_0= ruleClass | this_EnumeratedDataType_1= ruleEnumeratedDataType | this_ComplexDataType_2= ruleComplexDataType | this_RoutingSpace_3= ruleRoutingSpace | this_Interaction_4= ruleInteraction | this_Note_5= ruleNote ) ;
    public final EObject ruleOMTComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_EnumeratedDataType_1 = null;

        EObject this_ComplexDataType_2 = null;

        EObject this_RoutingSpace_3 = null;

        EObject this_Interaction_4 = null;

        EObject this_Note_5 = null;



        	enterRule();

        try {
            // InternalOmt.g:1276:2: ( (this_Class_0= ruleClass | this_EnumeratedDataType_1= ruleEnumeratedDataType | this_ComplexDataType_2= ruleComplexDataType | this_RoutingSpace_3= ruleRoutingSpace | this_Interaction_4= ruleInteraction | this_Note_5= ruleNote ) )
            // InternalOmt.g:1277:2: (this_Class_0= ruleClass | this_EnumeratedDataType_1= ruleEnumeratedDataType | this_ComplexDataType_2= ruleComplexDataType | this_RoutingSpace_3= ruleRoutingSpace | this_Interaction_4= ruleInteraction | this_Note_5= ruleNote )
            {
            // InternalOmt.g:1277:2: (this_Class_0= ruleClass | this_EnumeratedDataType_1= ruleEnumeratedDataType | this_ComplexDataType_2= ruleComplexDataType | this_RoutingSpace_3= ruleRoutingSpace | this_Interaction_4= ruleInteraction | this_Note_5= ruleNote )
            int alt29=6;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_OPEN) ) {
                switch ( input.LA(2) ) {
                case 57:
                    {
                    alt29=1;
                    }
                    break;
                case 87:
                    {
                    alt29=3;
                    }
                    break;
                case 82:
                    {
                    alt29=2;
                    }
                    break;
                case 96:
                    {
                    alt29=5;
                    }
                    break;
                case 45:
                    {
                    alt29=4;
                    }
                    break;
                case 105:
                    {
                    alt29=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalOmt.g:1278:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getOMTComponentAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:1287:3: this_EnumeratedDataType_1= ruleEnumeratedDataType
                    {

                    			newCompositeNode(grammarAccess.getOMTComponentAccess().getEnumeratedDataTypeParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EnumeratedDataType_1=ruleEnumeratedDataType();

                    state._fsp--;


                    			current = this_EnumeratedDataType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOmt.g:1296:3: this_ComplexDataType_2= ruleComplexDataType
                    {

                    			newCompositeNode(grammarAccess.getOMTComponentAccess().getComplexDataTypeParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComplexDataType_2=ruleComplexDataType();

                    state._fsp--;


                    			current = this_ComplexDataType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOmt.g:1305:3: this_RoutingSpace_3= ruleRoutingSpace
                    {

                    			newCompositeNode(grammarAccess.getOMTComponentAccess().getRoutingSpaceParserRuleCall_3());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RoutingSpace_3=ruleRoutingSpace();

                    state._fsp--;


                    			current = this_RoutingSpace_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOmt.g:1314:3: this_Interaction_4= ruleInteraction
                    {

                    			newCompositeNode(grammarAccess.getOMTComponentAccess().getInteractionParserRuleCall_4());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Interaction_4=ruleInteraction();

                    state._fsp--;


                    			current = this_Interaction_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOmt.g:1323:3: this_Note_5= ruleNote
                    {

                    			newCompositeNode(grammarAccess.getOMTComponentAccess().getNoteParserRuleCall_5());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Note_5=ruleNote();

                    state._fsp--;


                    			current = this_Note_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleOMTComponent"


    // $ANTLR start "entryRuleRoutingSpace"
    // InternalOmt.g:1335:1: entryRuleRoutingSpace returns [EObject current=null] : iv_ruleRoutingSpace= ruleRoutingSpace EOF ;
    public final EObject entryRuleRoutingSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoutingSpace = null;


        try {
            // InternalOmt.g:1335:53: (iv_ruleRoutingSpace= ruleRoutingSpace EOF )
            // InternalOmt.g:1336:2: iv_ruleRoutingSpace= ruleRoutingSpace EOF
            {
             newCompositeNode(grammarAccess.getRoutingSpaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoutingSpace=ruleRoutingSpace();

            state._fsp--;

             current =iv_ruleRoutingSpace; 
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
    // $ANTLR end "entryRuleRoutingSpace"


    // $ANTLR start "ruleRoutingSpace"
    // InternalOmt.g:1342:1: ruleRoutingSpace returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'RoutingSpace' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dimensions_7_0= ruleDimension ) )* this_CLOSE_8= RULE_CLOSE ) ;
    public final EObject ruleRoutingSpace() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token this_CLOSE_6=null;
        Token this_CLOSE_8=null;
        EObject lv_note_5_0 = null;

        EObject lv_dimensions_7_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:1348:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'RoutingSpace' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dimensions_7_0= ruleDimension ) )* this_CLOSE_8= RULE_CLOSE ) )
            // InternalOmt.g:1349:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'RoutingSpace' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dimensions_7_0= ruleDimension ) )* this_CLOSE_8= RULE_CLOSE )
            {
            // InternalOmt.g:1349:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'RoutingSpace' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dimensions_7_0= ruleDimension ) )* this_CLOSE_8= RULE_CLOSE )
            // InternalOmt.g:1350:3: this_OPEN_0= RULE_OPEN otherlv_1= 'RoutingSpace' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dimensions_7_0= ruleDimension ) )* this_CLOSE_8= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_38); 

            			newLeafNode(this_OPEN_0, grammarAccess.getRoutingSpaceAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRoutingSpaceAccess().getRoutingSpaceKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_10); 

            			newLeafNode(this_OPEN_2, grammarAccess.getRoutingSpaceAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRoutingSpaceAccess().getNameKeyword_3());
            		
            // InternalOmt.g:1366:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalOmt.g:1367:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalOmt.g:1367:4: (lv_name_4_0= RULE_STRING )
            // InternalOmt.g:1368:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_name_4_0, grammarAccess.getRoutingSpaceAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoutingSpaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:1384:3: ( (lv_note_5_0= ruleNoteRef ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==108) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOmt.g:1385:4: (lv_note_5_0= ruleNoteRef )
                    {
                    // InternalOmt.g:1385:4: (lv_note_5_0= ruleNoteRef )
                    // InternalOmt.g:1386:5: lv_note_5_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getRoutingSpaceAccess().getNoteNoteRefParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_note_5_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRoutingSpaceRule());
                    					}
                    					set(
                    						current,
                    						"note",
                    						lv_note_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getRoutingSpaceAccess().getCLOSETerminalRuleCall_6());
            		
            // InternalOmt.g:1407:3: ( (lv_dimensions_7_0= ruleDimension ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_OPEN) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOmt.g:1408:4: (lv_dimensions_7_0= ruleDimension )
            	    {
            	    // InternalOmt.g:1408:4: (lv_dimensions_7_0= ruleDimension )
            	    // InternalOmt.g:1409:5: lv_dimensions_7_0= ruleDimension
            	    {

            	    					newCompositeNode(grammarAccess.getRoutingSpaceAccess().getDimensionsDimensionParserRuleCall_7_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_dimensions_7_0=ruleDimension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoutingSpaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dimensions",
            	    						lv_dimensions_7_0,
            	    						"com.cohesionforce.hla.dsl.Omt.Dimension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            this_CLOSE_8=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_8, grammarAccess.getRoutingSpaceAccess().getCLOSETerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleRoutingSpace"


    // $ANTLR start "entryRuleDimension"
    // InternalOmt.g:1434:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalOmt.g:1434:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalOmt.g:1435:2: iv_ruleDimension= ruleDimension EOF
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
    // InternalOmt.g:1441:1: ruleDimension returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Dimension' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DimensionType' ( ( (otherlv_9= RULE_STRING ) ) | ( (lv_dataType_10_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_typeNote_11_0= ruleNoteRef ) )? this_CLOSE_12= RULE_CLOSE ( (lv_domain_13_0= ruleDimensionDomain ) ) (this_OPEN_14= RULE_OPEN otherlv_15= 'RangeSetUnits' ( (lv_units_16_0= RULE_STRING ) ) ( (lv_unitsNote_17_0= ruleNoteRef ) )? this_CLOSE_18= RULE_CLOSE )? this_OPEN_19= RULE_OPEN otherlv_20= 'NormalizationFunction' ( (lv_function_21_0= RULE_STRING ) ) ( (lv_functionNote_22_0= ruleNoteRef ) )? this_CLOSE_23= RULE_CLOSE this_CLOSE_24= RULE_CLOSE ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token this_CLOSE_6=null;
        Token this_OPEN_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_dataType_10_0=null;
        Token this_CLOSE_12=null;
        Token this_OPEN_14=null;
        Token otherlv_15=null;
        Token lv_units_16_0=null;
        Token this_CLOSE_18=null;
        Token this_OPEN_19=null;
        Token otherlv_20=null;
        Token lv_function_21_0=null;
        Token this_CLOSE_23=null;
        Token this_CLOSE_24=null;
        EObject lv_nameNote_5_0 = null;

        EObject lv_typeNote_11_0 = null;

        EObject lv_domain_13_0 = null;

        EObject lv_unitsNote_17_0 = null;

        EObject lv_functionNote_22_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:1447:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Dimension' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DimensionType' ( ( (otherlv_9= RULE_STRING ) ) | ( (lv_dataType_10_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_typeNote_11_0= ruleNoteRef ) )? this_CLOSE_12= RULE_CLOSE ( (lv_domain_13_0= ruleDimensionDomain ) ) (this_OPEN_14= RULE_OPEN otherlv_15= 'RangeSetUnits' ( (lv_units_16_0= RULE_STRING ) ) ( (lv_unitsNote_17_0= ruleNoteRef ) )? this_CLOSE_18= RULE_CLOSE )? this_OPEN_19= RULE_OPEN otherlv_20= 'NormalizationFunction' ( (lv_function_21_0= RULE_STRING ) ) ( (lv_functionNote_22_0= ruleNoteRef ) )? this_CLOSE_23= RULE_CLOSE this_CLOSE_24= RULE_CLOSE ) )
            // InternalOmt.g:1448:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Dimension' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DimensionType' ( ( (otherlv_9= RULE_STRING ) ) | ( (lv_dataType_10_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_typeNote_11_0= ruleNoteRef ) )? this_CLOSE_12= RULE_CLOSE ( (lv_domain_13_0= ruleDimensionDomain ) ) (this_OPEN_14= RULE_OPEN otherlv_15= 'RangeSetUnits' ( (lv_units_16_0= RULE_STRING ) ) ( (lv_unitsNote_17_0= ruleNoteRef ) )? this_CLOSE_18= RULE_CLOSE )? this_OPEN_19= RULE_OPEN otherlv_20= 'NormalizationFunction' ( (lv_function_21_0= RULE_STRING ) ) ( (lv_functionNote_22_0= ruleNoteRef ) )? this_CLOSE_23= RULE_CLOSE this_CLOSE_24= RULE_CLOSE )
            {
            // InternalOmt.g:1448:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Dimension' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DimensionType' ( ( (otherlv_9= RULE_STRING ) ) | ( (lv_dataType_10_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_typeNote_11_0= ruleNoteRef ) )? this_CLOSE_12= RULE_CLOSE ( (lv_domain_13_0= ruleDimensionDomain ) ) (this_OPEN_14= RULE_OPEN otherlv_15= 'RangeSetUnits' ( (lv_units_16_0= RULE_STRING ) ) ( (lv_unitsNote_17_0= ruleNoteRef ) )? this_CLOSE_18= RULE_CLOSE )? this_OPEN_19= RULE_OPEN otherlv_20= 'NormalizationFunction' ( (lv_function_21_0= RULE_STRING ) ) ( (lv_functionNote_22_0= ruleNoteRef ) )? this_CLOSE_23= RULE_CLOSE this_CLOSE_24= RULE_CLOSE )
            // InternalOmt.g:1449:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Dimension' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'DimensionType' ( ( (otherlv_9= RULE_STRING ) ) | ( (lv_dataType_10_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_typeNote_11_0= ruleNoteRef ) )? this_CLOSE_12= RULE_CLOSE ( (lv_domain_13_0= ruleDimensionDomain ) ) (this_OPEN_14= RULE_OPEN otherlv_15= 'RangeSetUnits' ( (lv_units_16_0= RULE_STRING ) ) ( (lv_unitsNote_17_0= ruleNoteRef ) )? this_CLOSE_18= RULE_CLOSE )? this_OPEN_19= RULE_OPEN otherlv_20= 'NormalizationFunction' ( (lv_function_21_0= RULE_STRING ) ) ( (lv_functionNote_22_0= ruleNoteRef ) )? this_CLOSE_23= RULE_CLOSE this_CLOSE_24= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_39); 

            			newLeafNode(this_OPEN_0, grammarAccess.getDimensionAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDimensionAccess().getDimensionKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_10); 

            			newLeafNode(this_OPEN_2, grammarAccess.getDimensionAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDimensionAccess().getNameKeyword_3());
            		
            // InternalOmt.g:1465:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalOmt.g:1466:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalOmt.g:1466:4: (lv_name_4_0= RULE_STRING )
            // InternalOmt.g:1467:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDimensionAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:1483:3: ( (lv_nameNote_5_0= ruleNoteRef ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==108) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOmt.g:1484:4: (lv_nameNote_5_0= ruleNoteRef )
                    {
                    // InternalOmt.g:1484:4: (lv_nameNote_5_0= ruleNoteRef )
                    // InternalOmt.g:1485:5: lv_nameNote_5_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getDimensionAccess().getNameNoteNoteRefParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_nameNote_5_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDimensionRule());
                    					}
                    					set(
                    						current,
                    						"nameNote",
                    						lv_nameNote_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getDimensionAccess().getCLOSETerminalRuleCall_6());
            		
            this_OPEN_7=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_40); 

            			newLeafNode(this_OPEN_7, grammarAccess.getDimensionAccess().getOPENTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,47,FollowSets000.FOLLOW_41); 

            			newLeafNode(otherlv_8, grammarAccess.getDimensionAccess().getDimensionTypeKeyword_8());
            		
            // InternalOmt.g:1514:3: ( ( (otherlv_9= RULE_STRING ) ) | ( (lv_dataType_10_0= RULE_BASE_DATA_TYPE ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_BASE_DATA_TYPE) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalOmt.g:1515:4: ( (otherlv_9= RULE_STRING ) )
                    {
                    // InternalOmt.g:1515:4: ( (otherlv_9= RULE_STRING ) )
                    // InternalOmt.g:1516:5: (otherlv_9= RULE_STRING )
                    {
                    // InternalOmt.g:1516:5: (otherlv_9= RULE_STRING )
                    // InternalOmt.g:1517:6: otherlv_9= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDimensionRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getDimensionAccess().getTypeTypeReferenceCrossReference_9_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOmt.g:1529:4: ( (lv_dataType_10_0= RULE_BASE_DATA_TYPE ) )
                    {
                    // InternalOmt.g:1529:4: ( (lv_dataType_10_0= RULE_BASE_DATA_TYPE ) )
                    // InternalOmt.g:1530:5: (lv_dataType_10_0= RULE_BASE_DATA_TYPE )
                    {
                    // InternalOmt.g:1530:5: (lv_dataType_10_0= RULE_BASE_DATA_TYPE )
                    // InternalOmt.g:1531:6: lv_dataType_10_0= RULE_BASE_DATA_TYPE
                    {
                    lv_dataType_10_0=(Token)match(input,RULE_BASE_DATA_TYPE,FollowSets000.FOLLOW_30); 

                    						newLeafNode(lv_dataType_10_0, grammarAccess.getDimensionAccess().getDataTypeBASE_DATA_TYPETerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDimensionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dataType",
                    							lv_dataType_10_0,
                    							"com.cohesionforce.hla.dsl.Omt.BASE_DATA_TYPE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOmt.g:1548:3: ( (lv_typeNote_11_0= ruleNoteRef ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==108) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOmt.g:1549:4: (lv_typeNote_11_0= ruleNoteRef )
                    {
                    // InternalOmt.g:1549:4: (lv_typeNote_11_0= ruleNoteRef )
                    // InternalOmt.g:1550:5: lv_typeNote_11_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getDimensionAccess().getTypeNoteNoteRefParserRuleCall_10_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_typeNote_11_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDimensionRule());
                    					}
                    					set(
                    						current,
                    						"typeNote",
                    						lv_typeNote_11_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_12=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_12, grammarAccess.getDimensionAccess().getCLOSETerminalRuleCall_11());
            		
            // InternalOmt.g:1571:3: ( (lv_domain_13_0= ruleDimensionDomain ) )
            // InternalOmt.g:1572:4: (lv_domain_13_0= ruleDimensionDomain )
            {
            // InternalOmt.g:1572:4: (lv_domain_13_0= ruleDimensionDomain )
            // InternalOmt.g:1573:5: lv_domain_13_0= ruleDimensionDomain
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getDomainDimensionDomainParserRuleCall_12_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
            lv_domain_13_0=ruleDimensionDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensionRule());
            					}
            					set(
            						current,
            						"domain",
            						lv_domain_13_0,
            						"com.cohesionforce.hla.dsl.Omt.DimensionDomain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOmt.g:1590:3: (this_OPEN_14= RULE_OPEN otherlv_15= 'RangeSetUnits' ( (lv_units_16_0= RULE_STRING ) ) ( (lv_unitsNote_17_0= ruleNoteRef ) )? this_CLOSE_18= RULE_CLOSE )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_OPEN) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==48) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalOmt.g:1591:4: this_OPEN_14= RULE_OPEN otherlv_15= 'RangeSetUnits' ( (lv_units_16_0= RULE_STRING ) ) ( (lv_unitsNote_17_0= ruleNoteRef ) )? this_CLOSE_18= RULE_CLOSE
                    {
                    this_OPEN_14=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_42); 

                    				newLeafNode(this_OPEN_14, grammarAccess.getDimensionAccess().getOPENTerminalRuleCall_13_0());
                    			
                    otherlv_15=(Token)match(input,48,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getDimensionAccess().getRangeSetUnitsKeyword_13_1());
                    			
                    // InternalOmt.g:1599:4: ( (lv_units_16_0= RULE_STRING ) )
                    // InternalOmt.g:1600:5: (lv_units_16_0= RULE_STRING )
                    {
                    // InternalOmt.g:1600:5: (lv_units_16_0= RULE_STRING )
                    // InternalOmt.g:1601:6: lv_units_16_0= RULE_STRING
                    {
                    lv_units_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

                    						newLeafNode(lv_units_16_0, grammarAccess.getDimensionAccess().getUnitsSTRINGTerminalRuleCall_13_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDimensionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"units",
                    							lv_units_16_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    // InternalOmt.g:1617:4: ( (lv_unitsNote_17_0= ruleNoteRef ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==108) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalOmt.g:1618:5: (lv_unitsNote_17_0= ruleNoteRef )
                            {
                            // InternalOmt.g:1618:5: (lv_unitsNote_17_0= ruleNoteRef )
                            // InternalOmt.g:1619:6: lv_unitsNote_17_0= ruleNoteRef
                            {

                            						newCompositeNode(grammarAccess.getDimensionAccess().getUnitsNoteNoteRefParserRuleCall_13_3_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_unitsNote_17_0=ruleNoteRef();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDimensionRule());
                            						}
                            						set(
                            							current,
                            							"unitsNote",
                            							lv_unitsNote_17_0,
                            							"com.cohesionforce.hla.dsl.Omt.NoteRef");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    this_CLOSE_18=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

                    				newLeafNode(this_CLOSE_18, grammarAccess.getDimensionAccess().getCLOSETerminalRuleCall_13_4());
                    			

                    }
                    break;

            }

            this_OPEN_19=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_43); 

            			newLeafNode(this_OPEN_19, grammarAccess.getDimensionAccess().getOPENTerminalRuleCall_14());
            		
            otherlv_20=(Token)match(input,49,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_20, grammarAccess.getDimensionAccess().getNormalizationFunctionKeyword_15());
            		
            // InternalOmt.g:1649:3: ( (lv_function_21_0= RULE_STRING ) )
            // InternalOmt.g:1650:4: (lv_function_21_0= RULE_STRING )
            {
            // InternalOmt.g:1650:4: (lv_function_21_0= RULE_STRING )
            // InternalOmt.g:1651:5: lv_function_21_0= RULE_STRING
            {
            lv_function_21_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_function_21_0, grammarAccess.getDimensionAccess().getFunctionSTRINGTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"function",
            						lv_function_21_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:1667:3: ( (lv_functionNote_22_0= ruleNoteRef ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==108) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOmt.g:1668:4: (lv_functionNote_22_0= ruleNoteRef )
                    {
                    // InternalOmt.g:1668:4: (lv_functionNote_22_0= ruleNoteRef )
                    // InternalOmt.g:1669:5: lv_functionNote_22_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getDimensionAccess().getFunctionNoteNoteRefParserRuleCall_17_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_functionNote_22_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDimensionRule());
                    					}
                    					set(
                    						current,
                    						"functionNote",
                    						lv_functionNote_22_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_23=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_7); 

            			newLeafNode(this_CLOSE_23, grammarAccess.getDimensionAccess().getCLOSETerminalRuleCall_18());
            		
            this_CLOSE_24=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_24, grammarAccess.getDimensionAccess().getCLOSETerminalRuleCall_19());
            		

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


    // $ANTLR start "entryRuleDimensionDomain"
    // InternalOmt.g:1698:1: entryRuleDimensionDomain returns [EObject current=null] : iv_ruleDimensionDomain= ruleDimensionDomain EOF ;
    public final EObject entryRuleDimensionDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionDomain = null;


        try {
            // InternalOmt.g:1698:56: (iv_ruleDimensionDomain= ruleDimensionDomain EOF )
            // InternalOmt.g:1699:2: iv_ruleDimensionDomain= ruleDimensionDomain EOF
            {
             newCompositeNode(grammarAccess.getDimensionDomainRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDimensionDomain=ruleDimensionDomain();

            state._fsp--;

             current =iv_ruleDimensionDomain; 
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
    // $ANTLR end "entryRuleDimensionDomain"


    // $ANTLR start "ruleDimensionDomain"
    // InternalOmt.g:1705:1: ruleDimensionDomain returns [EObject current=null] : (this_DimensionRange_0= ruleDimensionRange | this_DimensionSet_1= ruleDimensionSet ) ;
    public final EObject ruleDimensionDomain() throws RecognitionException {
        EObject current = null;

        EObject this_DimensionRange_0 = null;

        EObject this_DimensionSet_1 = null;



        	enterRule();

        try {
            // InternalOmt.g:1711:2: ( (this_DimensionRange_0= ruleDimensionRange | this_DimensionSet_1= ruleDimensionSet ) )
            // InternalOmt.g:1712:2: (this_DimensionRange_0= ruleDimensionRange | this_DimensionSet_1= ruleDimensionSet )
            {
            // InternalOmt.g:1712:2: (this_DimensionRange_0= ruleDimensionRange | this_DimensionSet_1= ruleDimensionSet )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_OPEN) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==50) ) {
                    alt38=1;
                }
                else if ( (LA38_1==55) ) {
                    alt38=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalOmt.g:1713:3: this_DimensionRange_0= ruleDimensionRange
                    {

                    			newCompositeNode(grammarAccess.getDimensionDomainAccess().getDimensionRangeParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DimensionRange_0=ruleDimensionRange();

                    state._fsp--;


                    			current = this_DimensionRange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:1722:3: this_DimensionSet_1= ruleDimensionSet
                    {

                    			newCompositeNode(grammarAccess.getDimensionDomainAccess().getDimensionSetParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DimensionSet_1=ruleDimensionSet();

                    state._fsp--;


                    			current = this_DimensionSet_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDimensionDomain"


    // $ANTLR start "entryRuleDimensionRange"
    // InternalOmt.g:1734:1: entryRuleDimensionRange returns [EObject current=null] : iv_ruleDimensionRange= ruleDimensionRange EOF ;
    public final EObject entryRuleDimensionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionRange = null;


        try {
            // InternalOmt.g:1734:55: (iv_ruleDimensionRange= ruleDimensionRange EOF )
            // InternalOmt.g:1735:2: iv_ruleDimensionRange= ruleDimensionRange EOF
            {
             newCompositeNode(grammarAccess.getDimensionRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDimensionRange=ruleDimensionRange();

            state._fsp--;

             current =iv_ruleDimensionRange; 
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
    // $ANTLR end "entryRuleDimensionRange"


    // $ANTLR start "ruleDimensionRange"
    // InternalOmt.g:1741:1: ruleDimensionRange returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionMinimum' ( (lv_minimum_2_0= RULE_STRING ) ) ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE (this_OPEN_5= RULE_OPEN otherlv_6= 'DimensionMaximum' ( (lv_maximum_7_0= RULE_STRING ) ) this_CLOSE_8= RULE_CLOSE )? this_OPEN_9= RULE_OPEN otherlv_10= 'IntervalType' ruleIntervalType this_CLOSE_12= RULE_CLOSE ) ;
    public final EObject ruleDimensionRange() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_minimum_2_0=null;
        Token this_CLOSE_4=null;
        Token this_OPEN_5=null;
        Token otherlv_6=null;
        Token lv_maximum_7_0=null;
        Token this_CLOSE_8=null;
        Token this_OPEN_9=null;
        Token otherlv_10=null;
        Token this_CLOSE_12=null;
        EObject lv_note_3_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:1747:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionMinimum' ( (lv_minimum_2_0= RULE_STRING ) ) ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE (this_OPEN_5= RULE_OPEN otherlv_6= 'DimensionMaximum' ( (lv_maximum_7_0= RULE_STRING ) ) this_CLOSE_8= RULE_CLOSE )? this_OPEN_9= RULE_OPEN otherlv_10= 'IntervalType' ruleIntervalType this_CLOSE_12= RULE_CLOSE ) )
            // InternalOmt.g:1748:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionMinimum' ( (lv_minimum_2_0= RULE_STRING ) ) ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE (this_OPEN_5= RULE_OPEN otherlv_6= 'DimensionMaximum' ( (lv_maximum_7_0= RULE_STRING ) ) this_CLOSE_8= RULE_CLOSE )? this_OPEN_9= RULE_OPEN otherlv_10= 'IntervalType' ruleIntervalType this_CLOSE_12= RULE_CLOSE )
            {
            // InternalOmt.g:1748:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionMinimum' ( (lv_minimum_2_0= RULE_STRING ) ) ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE (this_OPEN_5= RULE_OPEN otherlv_6= 'DimensionMaximum' ( (lv_maximum_7_0= RULE_STRING ) ) this_CLOSE_8= RULE_CLOSE )? this_OPEN_9= RULE_OPEN otherlv_10= 'IntervalType' ruleIntervalType this_CLOSE_12= RULE_CLOSE )
            // InternalOmt.g:1749:3: this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionMinimum' ( (lv_minimum_2_0= RULE_STRING ) ) ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE (this_OPEN_5= RULE_OPEN otherlv_6= 'DimensionMaximum' ( (lv_maximum_7_0= RULE_STRING ) ) this_CLOSE_8= RULE_CLOSE )? this_OPEN_9= RULE_OPEN otherlv_10= 'IntervalType' ruleIntervalType this_CLOSE_12= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_44); 

            			newLeafNode(this_OPEN_0, grammarAccess.getDimensionRangeAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDimensionRangeAccess().getDimensionMinimumKeyword_1());
            		
            // InternalOmt.g:1757:3: ( (lv_minimum_2_0= RULE_STRING ) )
            // InternalOmt.g:1758:4: (lv_minimum_2_0= RULE_STRING )
            {
            // InternalOmt.g:1758:4: (lv_minimum_2_0= RULE_STRING )
            // InternalOmt.g:1759:5: lv_minimum_2_0= RULE_STRING
            {
            lv_minimum_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_minimum_2_0, grammarAccess.getDimensionRangeAccess().getMinimumSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minimum",
            						lv_minimum_2_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:1775:3: ( (lv_note_3_0= ruleNoteRef ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==108) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOmt.g:1776:4: (lv_note_3_0= ruleNoteRef )
                    {
                    // InternalOmt.g:1776:4: (lv_note_3_0= ruleNoteRef )
                    // InternalOmt.g:1777:5: lv_note_3_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getDimensionRangeAccess().getNoteNoteRefParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_note_3_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDimensionRangeRule());
                    					}
                    					set(
                    						current,
                    						"note",
                    						lv_note_3_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getDimensionRangeAccess().getCLOSETerminalRuleCall_4());
            		
            // InternalOmt.g:1798:3: (this_OPEN_5= RULE_OPEN otherlv_6= 'DimensionMaximum' ( (lv_maximum_7_0= RULE_STRING ) ) this_CLOSE_8= RULE_CLOSE )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_OPEN) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==51) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalOmt.g:1799:4: this_OPEN_5= RULE_OPEN otherlv_6= 'DimensionMaximum' ( (lv_maximum_7_0= RULE_STRING ) ) this_CLOSE_8= RULE_CLOSE
                    {
                    this_OPEN_5=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_45); 

                    				newLeafNode(this_OPEN_5, grammarAccess.getDimensionRangeAccess().getOPENTerminalRuleCall_5_0());
                    			
                    otherlv_6=(Token)match(input,51,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getDimensionRangeAccess().getDimensionMaximumKeyword_5_1());
                    			
                    // InternalOmt.g:1807:4: ( (lv_maximum_7_0= RULE_STRING ) )
                    // InternalOmt.g:1808:5: (lv_maximum_7_0= RULE_STRING )
                    {
                    // InternalOmt.g:1808:5: (lv_maximum_7_0= RULE_STRING )
                    // InternalOmt.g:1809:6: lv_maximum_7_0= RULE_STRING
                    {
                    lv_maximum_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_maximum_7_0, grammarAccess.getDimensionRangeAccess().getMaximumSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDimensionRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maximum",
                    							lv_maximum_7_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_8=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

                    				newLeafNode(this_CLOSE_8, grammarAccess.getDimensionRangeAccess().getCLOSETerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            this_OPEN_9=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_46); 

            			newLeafNode(this_OPEN_9, grammarAccess.getDimensionRangeAccess().getOPENTerminalRuleCall_6());
            		
            otherlv_10=(Token)match(input,52,FollowSets000.FOLLOW_47); 

            			newLeafNode(otherlv_10, grammarAccess.getDimensionRangeAccess().getIntervalTypeKeyword_7());
            		

            			newCompositeNode(grammarAccess.getDimensionRangeAccess().getIntervalTypeParserRuleCall_8());
            		
            pushFollow(FollowSets000.FOLLOW_7);
            ruleIntervalType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            this_CLOSE_12=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_12, grammarAccess.getDimensionRangeAccess().getCLOSETerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleDimensionRange"


    // $ANTLR start "entryRuleIntervalType"
    // InternalOmt.g:1853:1: entryRuleIntervalType returns [String current=null] : iv_ruleIntervalType= ruleIntervalType EOF ;
    public final String entryRuleIntervalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntervalType = null;


        try {
            // InternalOmt.g:1853:52: (iv_ruleIntervalType= ruleIntervalType EOF )
            // InternalOmt.g:1854:2: iv_ruleIntervalType= ruleIntervalType EOF
            {
             newCompositeNode(grammarAccess.getIntervalTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntervalType=ruleIntervalType();

            state._fsp--;

             current =iv_ruleIntervalType.getText(); 
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
    // $ANTLR end "entryRuleIntervalType"


    // $ANTLR start "ruleIntervalType"
    // InternalOmt.g:1860:1: ruleIntervalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Open' | kw= 'Closed' ) ;
    public final AntlrDatatypeRuleToken ruleIntervalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOmt.g:1866:2: ( (kw= 'Open' | kw= 'Closed' ) )
            // InternalOmt.g:1867:2: (kw= 'Open' | kw= 'Closed' )
            {
            // InternalOmt.g:1867:2: (kw= 'Open' | kw= 'Closed' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            else if ( (LA41_0==54) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalOmt.g:1868:3: kw= 'Open'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIntervalTypeAccess().getOpenKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:1874:3: kw= 'Closed'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIntervalTypeAccess().getClosedKeyword_1());
                    		

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
    // $ANTLR end "ruleIntervalType"


    // $ANTLR start "entryRuleDimensionSet"
    // InternalOmt.g:1883:1: entryRuleDimensionSet returns [EObject current=null] : iv_ruleDimensionSet= ruleDimensionSet EOF ;
    public final EObject entryRuleDimensionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionSet = null;


        try {
            // InternalOmt.g:1883:53: (iv_ruleDimensionSet= ruleDimensionSet EOF )
            // InternalOmt.g:1884:2: iv_ruleDimensionSet= ruleDimensionSet EOF
            {
             newCompositeNode(grammarAccess.getDimensionSetRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDimensionSet=ruleDimensionSet();

            state._fsp--;

             current =iv_ruleDimensionSet; 
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
    // $ANTLR end "entryRuleDimensionSet"


    // $ANTLR start "ruleDimensionSet"
    // InternalOmt.g:1890:1: ruleDimensionSet returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionSet' ( (lv_members_2_0= ruleDimensionSetMember ) )+ ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleDimensionSet() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_CLOSE_4=null;
        EObject lv_members_2_0 = null;

        EObject lv_note_3_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:1896:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionSet' ( (lv_members_2_0= ruleDimensionSetMember ) )+ ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) )
            // InternalOmt.g:1897:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionSet' ( (lv_members_2_0= ruleDimensionSetMember ) )+ ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            {
            // InternalOmt.g:1897:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionSet' ( (lv_members_2_0= ruleDimensionSetMember ) )+ ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            // InternalOmt.g:1898:3: this_OPEN_0= RULE_OPEN otherlv_1= 'DimensionSet' ( (lv_members_2_0= ruleDimensionSetMember ) )+ ( (lv_note_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_48); 

            			newLeafNode(this_OPEN_0, grammarAccess.getDimensionSetAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDimensionSetAccess().getDimensionSetKeyword_1());
            		
            // InternalOmt.g:1906:3: ( (lv_members_2_0= ruleDimensionSetMember ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_OPEN) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalOmt.g:1907:4: (lv_members_2_0= ruleDimensionSetMember )
            	    {
            	    // InternalOmt.g:1907:4: (lv_members_2_0= ruleDimensionSetMember )
            	    // InternalOmt.g:1908:5: lv_members_2_0= ruleDimensionSetMember
            	    {

            	    					newCompositeNode(grammarAccess.getDimensionSetAccess().getMembersDimensionSetMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_members_2_0=ruleDimensionSetMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDimensionSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_2_0,
            	    						"com.cohesionforce.hla.dsl.Omt.DimensionSetMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // InternalOmt.g:1925:3: ( (lv_note_3_0= ruleNoteRef ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==108) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOmt.g:1926:4: (lv_note_3_0= ruleNoteRef )
                    {
                    // InternalOmt.g:1926:4: (lv_note_3_0= ruleNoteRef )
                    // InternalOmt.g:1927:5: lv_note_3_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getDimensionSetAccess().getNoteNoteRefParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_note_3_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDimensionSetRule());
                    					}
                    					set(
                    						current,
                    						"note",
                    						lv_note_3_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getDimensionSetAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleDimensionSet"


    // $ANTLR start "entryRuleDimensionSetMember"
    // InternalOmt.g:1952:1: entryRuleDimensionSetMember returns [EObject current=null] : iv_ruleDimensionSetMember= ruleDimensionSetMember EOF ;
    public final EObject entryRuleDimensionSetMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionSetMember = null;


        try {
            // InternalOmt.g:1952:59: (iv_ruleDimensionSetMember= ruleDimensionSetMember EOF )
            // InternalOmt.g:1953:2: iv_ruleDimensionSetMember= ruleDimensionSetMember EOF
            {
             newCompositeNode(grammarAccess.getDimensionSetMemberRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDimensionSetMember=ruleDimensionSetMember();

            state._fsp--;

             current =iv_ruleDimensionSetMember; 
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
    // $ANTLR end "entryRuleDimensionSetMember"


    // $ANTLR start "ruleDimensionSetMember"
    // InternalOmt.g:1959:1: ruleDimensionSetMember returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Member' ( (lv_value_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleDimensionSetMember() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalOmt.g:1965:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Member' ( (lv_value_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE ) )
            // InternalOmt.g:1966:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Member' ( (lv_value_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE )
            {
            // InternalOmt.g:1966:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Member' ( (lv_value_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE )
            // InternalOmt.g:1967:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Member' ( (lv_value_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_50); 

            			newLeafNode(this_OPEN_0, grammarAccess.getDimensionSetMemberAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDimensionSetMemberAccess().getMemberKeyword_1());
            		
            // InternalOmt.g:1975:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalOmt.g:1976:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalOmt.g:1976:4: (lv_value_2_0= RULE_STRING )
            // InternalOmt.g:1977:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDimensionSetMemberAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionSetMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getDimensionSetMemberAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleDimensionSetMember"


    // $ANTLR start "entryRuleClass"
    // InternalOmt.g:2001:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalOmt.g:2001:46: (iv_ruleClass= ruleClass EOF )
            // InternalOmt.g:2002:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalOmt.g:2008:1: ruleClass returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Class' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_note_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE (this_OPEN_11= RULE_OPEN otherlv_12= 'MOMClass' ( (lv_isMOMClass_13_0= ruleIsMOMClass ) ) this_CLOSE_14= RULE_CLOSE )? this_OPEN_15= RULE_OPEN otherlv_16= 'PSCapabilities' rulePSCapabilities this_CLOSE_18= RULE_CLOSE ( (lv_description_19_0= ruleDescription ) )? ( (lv_components_20_0= ruleClassComponent ) )* this_CLOSE_21= RULE_CLOSE ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token this_CLOSE_5=null;
        Token this_OPEN_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token this_CLOSE_10=null;
        Token this_OPEN_11=null;
        Token otherlv_12=null;
        Token this_CLOSE_14=null;
        Token this_OPEN_15=null;
        Token otherlv_16=null;
        Token this_CLOSE_18=null;
        Token this_CLOSE_21=null;
        EObject lv_note_9_0 = null;

        AntlrDatatypeRuleToken lv_isMOMClass_13_0 = null;

        EObject lv_description_19_0 = null;

        EObject lv_components_20_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:2014:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Class' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_note_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE (this_OPEN_11= RULE_OPEN otherlv_12= 'MOMClass' ( (lv_isMOMClass_13_0= ruleIsMOMClass ) ) this_CLOSE_14= RULE_CLOSE )? this_OPEN_15= RULE_OPEN otherlv_16= 'PSCapabilities' rulePSCapabilities this_CLOSE_18= RULE_CLOSE ( (lv_description_19_0= ruleDescription ) )? ( (lv_components_20_0= ruleClassComponent ) )* this_CLOSE_21= RULE_CLOSE ) )
            // InternalOmt.g:2015:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Class' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_note_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE (this_OPEN_11= RULE_OPEN otherlv_12= 'MOMClass' ( (lv_isMOMClass_13_0= ruleIsMOMClass ) ) this_CLOSE_14= RULE_CLOSE )? this_OPEN_15= RULE_OPEN otherlv_16= 'PSCapabilities' rulePSCapabilities this_CLOSE_18= RULE_CLOSE ( (lv_description_19_0= ruleDescription ) )? ( (lv_components_20_0= ruleClassComponent ) )* this_CLOSE_21= RULE_CLOSE )
            {
            // InternalOmt.g:2015:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Class' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_note_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE (this_OPEN_11= RULE_OPEN otherlv_12= 'MOMClass' ( (lv_isMOMClass_13_0= ruleIsMOMClass ) ) this_CLOSE_14= RULE_CLOSE )? this_OPEN_15= RULE_OPEN otherlv_16= 'PSCapabilities' rulePSCapabilities this_CLOSE_18= RULE_CLOSE ( (lv_description_19_0= ruleDescription ) )? ( (lv_components_20_0= ruleClassComponent ) )* this_CLOSE_21= RULE_CLOSE )
            // InternalOmt.g:2016:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Class' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_note_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE (this_OPEN_11= RULE_OPEN otherlv_12= 'MOMClass' ( (lv_isMOMClass_13_0= ruleIsMOMClass ) ) this_CLOSE_14= RULE_CLOSE )? this_OPEN_15= RULE_OPEN otherlv_16= 'PSCapabilities' rulePSCapabilities this_CLOSE_18= RULE_CLOSE ( (lv_description_19_0= ruleDescription ) )? ( (lv_components_20_0= ruleClassComponent ) )* this_CLOSE_21= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_51); 

            			newLeafNode(this_OPEN_0, grammarAccess.getClassAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_52); 

            			newLeafNode(this_OPEN_2, grammarAccess.getClassAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getIDKeyword_3());
            		
            // InternalOmt.g:2032:3: ( (lv_id_4_0= RULE_INT ) )
            // InternalOmt.g:2033:4: (lv_id_4_0= RULE_INT )
            {
            // InternalOmt.g:2033:4: (lv_id_4_0= RULE_INT )
            // InternalOmt.g:2034:5: lv_id_4_0= RULE_INT
            {
            lv_id_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_id_4_0, grammarAccess.getClassAccess().getIdINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"com.cohesionforce.hla.dsl.Omt.INT");
            				

            }


            }

            this_CLOSE_5=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_5, grammarAccess.getClassAccess().getCLOSETerminalRuleCall_5());
            		
            this_OPEN_6=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_10); 

            			newLeafNode(this_OPEN_6, grammarAccess.getClassAccess().getOPENTerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getNameKeyword_7());
            		
            // InternalOmt.g:2062:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalOmt.g:2063:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalOmt.g:2063:4: (lv_name_8_0= RULE_STRING )
            // InternalOmt.g:2064:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_name_8_0, grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_8_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:2080:3: ( (lv_note_9_0= ruleNoteRef ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==108) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOmt.g:2081:4: (lv_note_9_0= ruleNoteRef )
                    {
                    // InternalOmt.g:2081:4: (lv_note_9_0= ruleNoteRef )
                    // InternalOmt.g:2082:5: lv_note_9_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getNoteNoteRefParserRuleCall_9_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_note_9_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"note",
                    						lv_note_9_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_10=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_10, grammarAccess.getClassAccess().getCLOSETerminalRuleCall_10());
            		
            // InternalOmt.g:2103:3: (this_OPEN_11= RULE_OPEN otherlv_12= 'MOMClass' ( (lv_isMOMClass_13_0= ruleIsMOMClass ) ) this_CLOSE_14= RULE_CLOSE )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_OPEN) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==59) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalOmt.g:2104:4: this_OPEN_11= RULE_OPEN otherlv_12= 'MOMClass' ( (lv_isMOMClass_13_0= ruleIsMOMClass ) ) this_CLOSE_14= RULE_CLOSE
                    {
                    this_OPEN_11=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_54); 

                    				newLeafNode(this_OPEN_11, grammarAccess.getClassAccess().getOPENTerminalRuleCall_11_0());
                    			
                    otherlv_12=(Token)match(input,59,FollowSets000.FOLLOW_55); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getMOMClassKeyword_11_1());
                    			
                    // InternalOmt.g:2112:4: ( (lv_isMOMClass_13_0= ruleIsMOMClass ) )
                    // InternalOmt.g:2113:5: (lv_isMOMClass_13_0= ruleIsMOMClass )
                    {
                    // InternalOmt.g:2113:5: (lv_isMOMClass_13_0= ruleIsMOMClass )
                    // InternalOmt.g:2114:6: lv_isMOMClass_13_0= ruleIsMOMClass
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getIsMOMClassIsMOMClassParserRuleCall_11_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_isMOMClass_13_0=ruleIsMOMClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						set(
                    							current,
                    							"isMOMClass",
                    							lv_isMOMClass_13_0,
                    							"com.cohesionforce.hla.dsl.Omt.IsMOMClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_CLOSE_14=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

                    				newLeafNode(this_CLOSE_14, grammarAccess.getClassAccess().getCLOSETerminalRuleCall_11_3());
                    			

                    }
                    break;

            }

            this_OPEN_15=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_56); 

            			newLeafNode(this_OPEN_15, grammarAccess.getClassAccess().getOPENTerminalRuleCall_12());
            		
            otherlv_16=(Token)match(input,60,FollowSets000.FOLLOW_57); 

            			newLeafNode(otherlv_16, grammarAccess.getClassAccess().getPSCapabilitiesKeyword_13());
            		

            			newCompositeNode(grammarAccess.getClassAccess().getPSCapabilitiesParserRuleCall_14());
            		
            pushFollow(FollowSets000.FOLLOW_7);
            rulePSCapabilities();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            this_CLOSE_18=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

            			newLeafNode(this_CLOSE_18, grammarAccess.getClassAccess().getCLOSETerminalRuleCall_15());
            		
            // InternalOmt.g:2155:3: ( (lv_description_19_0= ruleDescription ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_OPEN) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==104) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalOmt.g:2156:4: (lv_description_19_0= ruleDescription )
                    {
                    // InternalOmt.g:2156:4: (lv_description_19_0= ruleDescription )
                    // InternalOmt.g:2157:5: lv_description_19_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getDescriptionDescriptionParserRuleCall_16_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_description_19_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_19_0,
                    						"com.cohesionforce.hla.dsl.Omt.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:2174:3: ( (lv_components_20_0= ruleClassComponent ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_OPEN) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalOmt.g:2175:4: (lv_components_20_0= ruleClassComponent )
            	    {
            	    // InternalOmt.g:2175:4: (lv_components_20_0= ruleClassComponent )
            	    // InternalOmt.g:2176:5: lv_components_20_0= ruleClassComponent
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getComponentsClassComponentParserRuleCall_17_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_components_20_0=ruleClassComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_20_0,
            	    						"com.cohesionforce.hla.dsl.Omt.ClassComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            this_CLOSE_21=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_21, grammarAccess.getClassAccess().getCLOSETerminalRuleCall_18());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleIsMOMClass"
    // InternalOmt.g:2201:1: entryRuleIsMOMClass returns [String current=null] : iv_ruleIsMOMClass= ruleIsMOMClass EOF ;
    public final String entryRuleIsMOMClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsMOMClass = null;


        try {
            // InternalOmt.g:2201:50: (iv_ruleIsMOMClass= ruleIsMOMClass EOF )
            // InternalOmt.g:2202:2: iv_ruleIsMOMClass= ruleIsMOMClass EOF
            {
             newCompositeNode(grammarAccess.getIsMOMClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIsMOMClass=ruleIsMOMClass();

            state._fsp--;

             current =iv_ruleIsMOMClass.getText(); 
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
    // $ANTLR end "entryRuleIsMOMClass"


    // $ANTLR start "ruleIsMOMClass"
    // InternalOmt.g:2208:1: ruleIsMOMClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TRUE' | kw= 'FALSE' ) ;
    public final AntlrDatatypeRuleToken ruleIsMOMClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOmt.g:2214:2: ( (kw= 'TRUE' | kw= 'FALSE' ) )
            // InternalOmt.g:2215:2: (kw= 'TRUE' | kw= 'FALSE' )
            {
            // InternalOmt.g:2215:2: (kw= 'TRUE' | kw= 'FALSE' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==61) ) {
                alt48=1;
            }
            else if ( (LA48_0==62) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalOmt.g:2216:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIsMOMClassAccess().getTRUEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:2222:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIsMOMClassAccess().getFALSEKeyword_1());
                    		

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
    // $ANTLR end "ruleIsMOMClass"


    // $ANTLR start "entryRulePSCapabilities"
    // InternalOmt.g:2231:1: entryRulePSCapabilities returns [String current=null] : iv_rulePSCapabilities= rulePSCapabilities EOF ;
    public final String entryRulePSCapabilities() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePSCapabilities = null;


        try {
            // InternalOmt.g:2231:54: (iv_rulePSCapabilities= rulePSCapabilities EOF )
            // InternalOmt.g:2232:2: iv_rulePSCapabilities= rulePSCapabilities EOF
            {
             newCompositeNode(grammarAccess.getPSCapabilitiesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePSCapabilities=rulePSCapabilities();

            state._fsp--;

             current =iv_rulePSCapabilities.getText(); 
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
    // $ANTLR end "entryRulePSCapabilities"


    // $ANTLR start "rulePSCapabilities"
    // InternalOmt.g:2238:1: rulePSCapabilities returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'P' | kw= 'S' | kw= 'PS' | kw= 'N' ) ;
    public final AntlrDatatypeRuleToken rulePSCapabilities() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOmt.g:2244:2: ( (kw= 'P' | kw= 'S' | kw= 'PS' | kw= 'N' ) )
            // InternalOmt.g:2245:2: (kw= 'P' | kw= 'S' | kw= 'PS' | kw= 'N' )
            {
            // InternalOmt.g:2245:2: (kw= 'P' | kw= 'S' | kw= 'PS' | kw= 'N' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt49=1;
                }
                break;
            case 64:
                {
                alt49=2;
                }
                break;
            case 65:
                {
                alt49=3;
                }
                break;
            case 66:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalOmt.g:2246:3: kw= 'P'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPSCapabilitiesAccess().getPKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:2252:3: kw= 'S'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPSCapabilitiesAccess().getSKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOmt.g:2258:3: kw= 'PS'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPSCapabilitiesAccess().getPSKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOmt.g:2264:3: kw= 'N'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPSCapabilitiesAccess().getNKeyword_3());
                    		

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
    // $ANTLR end "rulePSCapabilities"


    // $ANTLR start "entryRuleClassComponent"
    // InternalOmt.g:2273:1: entryRuleClassComponent returns [EObject current=null] : iv_ruleClassComponent= ruleClassComponent EOF ;
    public final EObject entryRuleClassComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassComponent = null;


        try {
            // InternalOmt.g:2273:55: (iv_ruleClassComponent= ruleClassComponent EOF )
            // InternalOmt.g:2274:2: iv_ruleClassComponent= ruleClassComponent EOF
            {
             newCompositeNode(grammarAccess.getClassComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassComponent=ruleClassComponent();

            state._fsp--;

             current =iv_ruleClassComponent; 
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
    // $ANTLR end "entryRuleClassComponent"


    // $ANTLR start "ruleClassComponent"
    // InternalOmt.g:2280:1: ruleClassComponent returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_SuperClass_1= ruleSuperClass ) ;
    public final EObject ruleClassComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_SuperClass_1 = null;



        	enterRule();

        try {
            // InternalOmt.g:2286:2: ( (this_Attribute_0= ruleAttribute | this_SuperClass_1= ruleSuperClass ) )
            // InternalOmt.g:2287:2: (this_Attribute_0= ruleAttribute | this_SuperClass_1= ruleSuperClass )
            {
            // InternalOmt.g:2287:2: (this_Attribute_0= ruleAttribute | this_SuperClass_1= ruleSuperClass )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_OPEN) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==67) ) {
                    alt50=2;
                }
                else if ( (LA50_1==68) ) {
                    alt50=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalOmt.g:2288:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getClassComponentAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:2297:3: this_SuperClass_1= ruleSuperClass
                    {

                    			newCompositeNode(grammarAccess.getClassComponentAccess().getSuperClassParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SuperClass_1=ruleSuperClass();

                    state._fsp--;


                    			current = this_SuperClass_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleClassComponent"


    // $ANTLR start "entryRuleSuperClass"
    // InternalOmt.g:2309:1: entryRuleSuperClass returns [EObject current=null] : iv_ruleSuperClass= ruleSuperClass EOF ;
    public final EObject entryRuleSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperClass = null;


        try {
            // InternalOmt.g:2309:51: (iv_ruleSuperClass= ruleSuperClass EOF )
            // InternalOmt.g:2310:2: iv_ruleSuperClass= ruleSuperClass EOF
            {
             newCompositeNode(grammarAccess.getSuperClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSuperClass=ruleSuperClass();

            state._fsp--;

             current =iv_ruleSuperClass; 
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
    // $ANTLR end "entryRuleSuperClass"


    // $ANTLR start "ruleSuperClass"
    // InternalOmt.g:2316:1: ruleSuperClass returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'SuperClass' ( (lv_superClass_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleSuperClass() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_superClass_2_0=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalOmt.g:2322:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'SuperClass' ( (lv_superClass_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE ) )
            // InternalOmt.g:2323:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'SuperClass' ( (lv_superClass_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE )
            {
            // InternalOmt.g:2323:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'SuperClass' ( (lv_superClass_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE )
            // InternalOmt.g:2324:3: this_OPEN_0= RULE_OPEN otherlv_1= 'SuperClass' ( (lv_superClass_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_58); 

            			newLeafNode(this_OPEN_0, grammarAccess.getSuperClassAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getSuperClassAccess().getSuperClassKeyword_1());
            		
            // InternalOmt.g:2332:3: ( (lv_superClass_2_0= RULE_INT ) )
            // InternalOmt.g:2333:4: (lv_superClass_2_0= RULE_INT )
            {
            // InternalOmt.g:2333:4: (lv_superClass_2_0= RULE_INT )
            // InternalOmt.g:2334:5: lv_superClass_2_0= RULE_INT
            {
            lv_superClass_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_superClass_2_0, grammarAccess.getSuperClassAccess().getSuperClassINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"superClass",
            						lv_superClass_2_0,
            						"com.cohesionforce.hla.dsl.Omt.INT");
            				

            }


            }

            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getSuperClassAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleSuperClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalOmt.g:2358:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOmt.g:2358:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOmt.g:2359:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOmt.g:2365:1: ruleAttribute returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Attribute' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? (this_OPEN_13= RULE_OPEN otherlv_14= 'UpdateType' ( (lv_updateType_15_0= ruleATT_UpdateType ) ) ( (lv_updateTypeNote_16_0= ruleNoteRef ) )? this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'UpdateCondition' ( (lv_updateCondition_20_0= RULE_STRING ) ) ( (lv_updateConditionNote_21_0= ruleNoteRef ) )? this_CLOSE_22= RULE_CLOSE )? (this_OPEN_23= RULE_OPEN otherlv_24= 'TransferAccept' ( (lv_transferAccept_25_0= ruleATT_TransferAccept ) ) ( (lv_transferAcceptNote_26_0= ruleNoteRef ) )? this_CLOSE_27= RULE_CLOSE )? (this_OPEN_28= RULE_OPEN otherlv_29= 'UpdateReflect' ( (lv_updateReflect_30_0= ruleATT_UpdateReflect ) ) ( (lv_updateReflectNote_31_0= ruleNoteRef ) )? this_CLOSE_32= RULE_CLOSE )? ( (lv_description_33_0= ruleDescription ) )? (this_OPEN_34= RULE_OPEN otherlv_35= 'RoutingSpace' ( (lv_routingSpace_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? this_CLOSE_38= RULE_CLOSE ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token this_CLOSE_6=null;
        Token this_OPEN_13=null;
        Token otherlv_14=null;
        Token this_CLOSE_17=null;
        Token this_OPEN_18=null;
        Token otherlv_19=null;
        Token lv_updateCondition_20_0=null;
        Token this_CLOSE_22=null;
        Token this_OPEN_23=null;
        Token otherlv_24=null;
        Token this_CLOSE_27=null;
        Token this_OPEN_28=null;
        Token otherlv_29=null;
        Token this_CLOSE_32=null;
        Token this_OPEN_34=null;
        Token otherlv_35=null;
        Token lv_routingSpace_36_0=null;
        Token this_CLOSE_37=null;
        Token this_CLOSE_38=null;
        EObject lv_nameNote_5_0 = null;

        EObject lv_dataType_7_0 = null;

        EObject lv_cardinality_8_0 = null;

        EObject lv_units_9_0 = null;

        EObject lv_resolution_10_0 = null;

        EObject lv_accuracy_11_0 = null;

        EObject lv_accuracyCondition_12_0 = null;

        AntlrDatatypeRuleToken lv_updateType_15_0 = null;

        EObject lv_updateTypeNote_16_0 = null;

        EObject lv_updateConditionNote_21_0 = null;

        AntlrDatatypeRuleToken lv_transferAccept_25_0 = null;

        EObject lv_transferAcceptNote_26_0 = null;

        AntlrDatatypeRuleToken lv_updateReflect_30_0 = null;

        EObject lv_updateReflectNote_31_0 = null;

        EObject lv_description_33_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:2371:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Attribute' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? (this_OPEN_13= RULE_OPEN otherlv_14= 'UpdateType' ( (lv_updateType_15_0= ruleATT_UpdateType ) ) ( (lv_updateTypeNote_16_0= ruleNoteRef ) )? this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'UpdateCondition' ( (lv_updateCondition_20_0= RULE_STRING ) ) ( (lv_updateConditionNote_21_0= ruleNoteRef ) )? this_CLOSE_22= RULE_CLOSE )? (this_OPEN_23= RULE_OPEN otherlv_24= 'TransferAccept' ( (lv_transferAccept_25_0= ruleATT_TransferAccept ) ) ( (lv_transferAcceptNote_26_0= ruleNoteRef ) )? this_CLOSE_27= RULE_CLOSE )? (this_OPEN_28= RULE_OPEN otherlv_29= 'UpdateReflect' ( (lv_updateReflect_30_0= ruleATT_UpdateReflect ) ) ( (lv_updateReflectNote_31_0= ruleNoteRef ) )? this_CLOSE_32= RULE_CLOSE )? ( (lv_description_33_0= ruleDescription ) )? (this_OPEN_34= RULE_OPEN otherlv_35= 'RoutingSpace' ( (lv_routingSpace_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? this_CLOSE_38= RULE_CLOSE ) )
            // InternalOmt.g:2372:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Attribute' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? (this_OPEN_13= RULE_OPEN otherlv_14= 'UpdateType' ( (lv_updateType_15_0= ruleATT_UpdateType ) ) ( (lv_updateTypeNote_16_0= ruleNoteRef ) )? this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'UpdateCondition' ( (lv_updateCondition_20_0= RULE_STRING ) ) ( (lv_updateConditionNote_21_0= ruleNoteRef ) )? this_CLOSE_22= RULE_CLOSE )? (this_OPEN_23= RULE_OPEN otherlv_24= 'TransferAccept' ( (lv_transferAccept_25_0= ruleATT_TransferAccept ) ) ( (lv_transferAcceptNote_26_0= ruleNoteRef ) )? this_CLOSE_27= RULE_CLOSE )? (this_OPEN_28= RULE_OPEN otherlv_29= 'UpdateReflect' ( (lv_updateReflect_30_0= ruleATT_UpdateReflect ) ) ( (lv_updateReflectNote_31_0= ruleNoteRef ) )? this_CLOSE_32= RULE_CLOSE )? ( (lv_description_33_0= ruleDescription ) )? (this_OPEN_34= RULE_OPEN otherlv_35= 'RoutingSpace' ( (lv_routingSpace_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? this_CLOSE_38= RULE_CLOSE )
            {
            // InternalOmt.g:2372:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Attribute' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? (this_OPEN_13= RULE_OPEN otherlv_14= 'UpdateType' ( (lv_updateType_15_0= ruleATT_UpdateType ) ) ( (lv_updateTypeNote_16_0= ruleNoteRef ) )? this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'UpdateCondition' ( (lv_updateCondition_20_0= RULE_STRING ) ) ( (lv_updateConditionNote_21_0= ruleNoteRef ) )? this_CLOSE_22= RULE_CLOSE )? (this_OPEN_23= RULE_OPEN otherlv_24= 'TransferAccept' ( (lv_transferAccept_25_0= ruleATT_TransferAccept ) ) ( (lv_transferAcceptNote_26_0= ruleNoteRef ) )? this_CLOSE_27= RULE_CLOSE )? (this_OPEN_28= RULE_OPEN otherlv_29= 'UpdateReflect' ( (lv_updateReflect_30_0= ruleATT_UpdateReflect ) ) ( (lv_updateReflectNote_31_0= ruleNoteRef ) )? this_CLOSE_32= RULE_CLOSE )? ( (lv_description_33_0= ruleDescription ) )? (this_OPEN_34= RULE_OPEN otherlv_35= 'RoutingSpace' ( (lv_routingSpace_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? this_CLOSE_38= RULE_CLOSE )
            // InternalOmt.g:2373:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Attribute' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? (this_OPEN_13= RULE_OPEN otherlv_14= 'UpdateType' ( (lv_updateType_15_0= ruleATT_UpdateType ) ) ( (lv_updateTypeNote_16_0= ruleNoteRef ) )? this_CLOSE_17= RULE_CLOSE )? (this_OPEN_18= RULE_OPEN otherlv_19= 'UpdateCondition' ( (lv_updateCondition_20_0= RULE_STRING ) ) ( (lv_updateConditionNote_21_0= ruleNoteRef ) )? this_CLOSE_22= RULE_CLOSE )? (this_OPEN_23= RULE_OPEN otherlv_24= 'TransferAccept' ( (lv_transferAccept_25_0= ruleATT_TransferAccept ) ) ( (lv_transferAcceptNote_26_0= ruleNoteRef ) )? this_CLOSE_27= RULE_CLOSE )? (this_OPEN_28= RULE_OPEN otherlv_29= 'UpdateReflect' ( (lv_updateReflect_30_0= ruleATT_UpdateReflect ) ) ( (lv_updateReflectNote_31_0= ruleNoteRef ) )? this_CLOSE_32= RULE_CLOSE )? ( (lv_description_33_0= ruleDescription ) )? (this_OPEN_34= RULE_OPEN otherlv_35= 'RoutingSpace' ( (lv_routingSpace_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )? this_CLOSE_38= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_59); 

            			newLeafNode(this_OPEN_0, grammarAccess.getAttributeAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_10); 

            			newLeafNode(this_OPEN_2, grammarAccess.getAttributeAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getNameKeyword_3());
            		
            // InternalOmt.g:2389:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalOmt.g:2390:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalOmt.g:2390:4: (lv_name_4_0= RULE_STRING )
            // InternalOmt.g:2391:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_name_4_0, grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:2407:3: ( (lv_nameNote_5_0= ruleNoteRef ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==108) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOmt.g:2408:4: (lv_nameNote_5_0= ruleNoteRef )
                    {
                    // InternalOmt.g:2408:4: (lv_nameNote_5_0= ruleNoteRef )
                    // InternalOmt.g:2409:5: lv_nameNote_5_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getNameNoteNoteRefParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_nameNote_5_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"nameNote",
                    						lv_nameNote_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getAttributeAccess().getCLOSETerminalRuleCall_6());
            		
            // InternalOmt.g:2430:3: ( (lv_dataType_7_0= ruleDataType ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_OPEN) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==38) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalOmt.g:2431:4: (lv_dataType_7_0= ruleDataType )
                    {
                    // InternalOmt.g:2431:4: (lv_dataType_7_0= ruleDataType )
                    // InternalOmt.g:2432:5: lv_dataType_7_0= ruleDataType
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeDataTypeParserRuleCall_7_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_dataType_7_0=ruleDataType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"dataType",
                    						lv_dataType_7_0,
                    						"com.cohesionforce.hla.dsl.Omt.DataType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:2449:3: ( (lv_cardinality_8_0= ruleCardinality ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_OPEN) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==95) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // InternalOmt.g:2450:4: (lv_cardinality_8_0= ruleCardinality )
                    {
                    // InternalOmt.g:2450:4: (lv_cardinality_8_0= ruleCardinality )
                    // InternalOmt.g:2451:5: lv_cardinality_8_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_8_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_cardinality_8_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_8_0,
                    						"com.cohesionforce.hla.dsl.Omt.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:2468:3: ( (lv_units_9_0= ruleUnits ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_OPEN) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==34) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalOmt.g:2469:4: (lv_units_9_0= ruleUnits )
                    {
                    // InternalOmt.g:2469:4: (lv_units_9_0= ruleUnits )
                    // InternalOmt.g:2470:5: lv_units_9_0= ruleUnits
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getUnitsUnitsParserRuleCall_9_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_units_9_0=ruleUnits();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"units",
                    						lv_units_9_0,
                    						"com.cohesionforce.hla.dsl.Omt.Units");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:2487:3: ( (lv_resolution_10_0= ruleResolution ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_OPEN) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==92) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalOmt.g:2488:4: (lv_resolution_10_0= ruleResolution )
                    {
                    // InternalOmt.g:2488:4: (lv_resolution_10_0= ruleResolution )
                    // InternalOmt.g:2489:5: lv_resolution_10_0= ruleResolution
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getResolutionResolutionParserRuleCall_10_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_resolution_10_0=ruleResolution();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"resolution",
                    						lv_resolution_10_0,
                    						"com.cohesionforce.hla.dsl.Omt.Resolution");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:2506:3: ( (lv_accuracy_11_0= ruleAccuracy ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_OPEN) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==90) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalOmt.g:2507:4: (lv_accuracy_11_0= ruleAccuracy )
                    {
                    // InternalOmt.g:2507:4: (lv_accuracy_11_0= ruleAccuracy )
                    // InternalOmt.g:2508:5: lv_accuracy_11_0= ruleAccuracy
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getAccuracyAccuracyParserRuleCall_11_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_accuracy_11_0=ruleAccuracy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"accuracy",
                    						lv_accuracy_11_0,
                    						"com.cohesionforce.hla.dsl.Omt.Accuracy");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:2525:3: ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_OPEN) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==91) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalOmt.g:2526:4: (lv_accuracyCondition_12_0= ruleAccuracyCondition )
                    {
                    // InternalOmt.g:2526:4: (lv_accuracyCondition_12_0= ruleAccuracyCondition )
                    // InternalOmt.g:2527:5: lv_accuracyCondition_12_0= ruleAccuracyCondition
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getAccuracyConditionAccuracyConditionParserRuleCall_12_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_accuracyCondition_12_0=ruleAccuracyCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"accuracyCondition",
                    						lv_accuracyCondition_12_0,
                    						"com.cohesionforce.hla.dsl.Omt.AccuracyCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:2544:3: (this_OPEN_13= RULE_OPEN otherlv_14= 'UpdateType' ( (lv_updateType_15_0= ruleATT_UpdateType ) ) ( (lv_updateTypeNote_16_0= ruleNoteRef ) )? this_CLOSE_17= RULE_CLOSE )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_OPEN) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==69) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // InternalOmt.g:2545:4: this_OPEN_13= RULE_OPEN otherlv_14= 'UpdateType' ( (lv_updateType_15_0= ruleATT_UpdateType ) ) ( (lv_updateTypeNote_16_0= ruleNoteRef ) )? this_CLOSE_17= RULE_CLOSE
                    {
                    this_OPEN_13=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_60); 

                    				newLeafNode(this_OPEN_13, grammarAccess.getAttributeAccess().getOPENTerminalRuleCall_13_0());
                    			
                    otherlv_14=(Token)match(input,69,FollowSets000.FOLLOW_61); 

                    				newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getUpdateTypeKeyword_13_1());
                    			
                    // InternalOmt.g:2553:4: ( (lv_updateType_15_0= ruleATT_UpdateType ) )
                    // InternalOmt.g:2554:5: (lv_updateType_15_0= ruleATT_UpdateType )
                    {
                    // InternalOmt.g:2554:5: (lv_updateType_15_0= ruleATT_UpdateType )
                    // InternalOmt.g:2555:6: lv_updateType_15_0= ruleATT_UpdateType
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getUpdateTypeATT_UpdateTypeParserRuleCall_13_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_30);
                    lv_updateType_15_0=ruleATT_UpdateType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"updateType",
                    							lv_updateType_15_0,
                    							"com.cohesionforce.hla.dsl.Omt.ATT_UpdateType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOmt.g:2572:4: ( (lv_updateTypeNote_16_0= ruleNoteRef ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==108) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalOmt.g:2573:5: (lv_updateTypeNote_16_0= ruleNoteRef )
                            {
                            // InternalOmt.g:2573:5: (lv_updateTypeNote_16_0= ruleNoteRef )
                            // InternalOmt.g:2574:6: lv_updateTypeNote_16_0= ruleNoteRef
                            {

                            						newCompositeNode(grammarAccess.getAttributeAccess().getUpdateTypeNoteNoteRefParserRuleCall_13_3_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_updateTypeNote_16_0=ruleNoteRef();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAttributeRule());
                            						}
                            						set(
                            							current,
                            							"updateTypeNote",
                            							lv_updateTypeNote_16_0,
                            							"com.cohesionforce.hla.dsl.Omt.NoteRef");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    this_CLOSE_17=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_17, grammarAccess.getAttributeAccess().getCLOSETerminalRuleCall_13_4());
                    			

                    }
                    break;

            }

            // InternalOmt.g:2596:3: (this_OPEN_18= RULE_OPEN otherlv_19= 'UpdateCondition' ( (lv_updateCondition_20_0= RULE_STRING ) ) ( (lv_updateConditionNote_21_0= ruleNoteRef ) )? this_CLOSE_22= RULE_CLOSE )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_OPEN) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==70) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // InternalOmt.g:2597:4: this_OPEN_18= RULE_OPEN otherlv_19= 'UpdateCondition' ( (lv_updateCondition_20_0= RULE_STRING ) ) ( (lv_updateConditionNote_21_0= ruleNoteRef ) )? this_CLOSE_22= RULE_CLOSE
                    {
                    this_OPEN_18=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_62); 

                    				newLeafNode(this_OPEN_18, grammarAccess.getAttributeAccess().getOPENTerminalRuleCall_14_0());
                    			
                    otherlv_19=(Token)match(input,70,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_19, grammarAccess.getAttributeAccess().getUpdateConditionKeyword_14_1());
                    			
                    // InternalOmt.g:2605:4: ( (lv_updateCondition_20_0= RULE_STRING ) )
                    // InternalOmt.g:2606:5: (lv_updateCondition_20_0= RULE_STRING )
                    {
                    // InternalOmt.g:2606:5: (lv_updateCondition_20_0= RULE_STRING )
                    // InternalOmt.g:2607:6: lv_updateCondition_20_0= RULE_STRING
                    {
                    lv_updateCondition_20_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

                    						newLeafNode(lv_updateCondition_20_0, grammarAccess.getAttributeAccess().getUpdateConditionSTRINGTerminalRuleCall_14_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"updateCondition",
                    							lv_updateCondition_20_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    // InternalOmt.g:2623:4: ( (lv_updateConditionNote_21_0= ruleNoteRef ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==108) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalOmt.g:2624:5: (lv_updateConditionNote_21_0= ruleNoteRef )
                            {
                            // InternalOmt.g:2624:5: (lv_updateConditionNote_21_0= ruleNoteRef )
                            // InternalOmt.g:2625:6: lv_updateConditionNote_21_0= ruleNoteRef
                            {

                            						newCompositeNode(grammarAccess.getAttributeAccess().getUpdateConditionNoteNoteRefParserRuleCall_14_3_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_updateConditionNote_21_0=ruleNoteRef();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAttributeRule());
                            						}
                            						set(
                            							current,
                            							"updateConditionNote",
                            							lv_updateConditionNote_21_0,
                            							"com.cohesionforce.hla.dsl.Omt.NoteRef");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    this_CLOSE_22=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_22, grammarAccess.getAttributeAccess().getCLOSETerminalRuleCall_14_4());
                    			

                    }
                    break;

            }

            // InternalOmt.g:2647:3: (this_OPEN_23= RULE_OPEN otherlv_24= 'TransferAccept' ( (lv_transferAccept_25_0= ruleATT_TransferAccept ) ) ( (lv_transferAcceptNote_26_0= ruleNoteRef ) )? this_CLOSE_27= RULE_CLOSE )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_OPEN) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==71) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalOmt.g:2648:4: this_OPEN_23= RULE_OPEN otherlv_24= 'TransferAccept' ( (lv_transferAccept_25_0= ruleATT_TransferAccept ) ) ( (lv_transferAcceptNote_26_0= ruleNoteRef ) )? this_CLOSE_27= RULE_CLOSE
                    {
                    this_OPEN_23=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_63); 

                    				newLeafNode(this_OPEN_23, grammarAccess.getAttributeAccess().getOPENTerminalRuleCall_15_0());
                    			
                    otherlv_24=(Token)match(input,71,FollowSets000.FOLLOW_64); 

                    				newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getTransferAcceptKeyword_15_1());
                    			
                    // InternalOmt.g:2656:4: ( (lv_transferAccept_25_0= ruleATT_TransferAccept ) )
                    // InternalOmt.g:2657:5: (lv_transferAccept_25_0= ruleATT_TransferAccept )
                    {
                    // InternalOmt.g:2657:5: (lv_transferAccept_25_0= ruleATT_TransferAccept )
                    // InternalOmt.g:2658:6: lv_transferAccept_25_0= ruleATT_TransferAccept
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTransferAcceptATT_TransferAcceptParserRuleCall_15_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_30);
                    lv_transferAccept_25_0=ruleATT_TransferAccept();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"transferAccept",
                    							lv_transferAccept_25_0,
                    							"com.cohesionforce.hla.dsl.Omt.ATT_TransferAccept");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOmt.g:2675:4: ( (lv_transferAcceptNote_26_0= ruleNoteRef ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==108) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalOmt.g:2676:5: (lv_transferAcceptNote_26_0= ruleNoteRef )
                            {
                            // InternalOmt.g:2676:5: (lv_transferAcceptNote_26_0= ruleNoteRef )
                            // InternalOmt.g:2677:6: lv_transferAcceptNote_26_0= ruleNoteRef
                            {

                            						newCompositeNode(grammarAccess.getAttributeAccess().getTransferAcceptNoteNoteRefParserRuleCall_15_3_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_transferAcceptNote_26_0=ruleNoteRef();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAttributeRule());
                            						}
                            						set(
                            							current,
                            							"transferAcceptNote",
                            							lv_transferAcceptNote_26_0,
                            							"com.cohesionforce.hla.dsl.Omt.NoteRef");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    this_CLOSE_27=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_27, grammarAccess.getAttributeAccess().getCLOSETerminalRuleCall_15_4());
                    			

                    }
                    break;

            }

            // InternalOmt.g:2699:3: (this_OPEN_28= RULE_OPEN otherlv_29= 'UpdateReflect' ( (lv_updateReflect_30_0= ruleATT_UpdateReflect ) ) ( (lv_updateReflectNote_31_0= ruleNoteRef ) )? this_CLOSE_32= RULE_CLOSE )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_OPEN) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==72) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalOmt.g:2700:4: this_OPEN_28= RULE_OPEN otherlv_29= 'UpdateReflect' ( (lv_updateReflect_30_0= ruleATT_UpdateReflect ) ) ( (lv_updateReflectNote_31_0= ruleNoteRef ) )? this_CLOSE_32= RULE_CLOSE
                    {
                    this_OPEN_28=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_65); 

                    				newLeafNode(this_OPEN_28, grammarAccess.getAttributeAccess().getOPENTerminalRuleCall_16_0());
                    			
                    otherlv_29=(Token)match(input,72,FollowSets000.FOLLOW_66); 

                    				newLeafNode(otherlv_29, grammarAccess.getAttributeAccess().getUpdateReflectKeyword_16_1());
                    			
                    // InternalOmt.g:2708:4: ( (lv_updateReflect_30_0= ruleATT_UpdateReflect ) )
                    // InternalOmt.g:2709:5: (lv_updateReflect_30_0= ruleATT_UpdateReflect )
                    {
                    // InternalOmt.g:2709:5: (lv_updateReflect_30_0= ruleATT_UpdateReflect )
                    // InternalOmt.g:2710:6: lv_updateReflect_30_0= ruleATT_UpdateReflect
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getUpdateReflectATT_UpdateReflectParserRuleCall_16_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_30);
                    lv_updateReflect_30_0=ruleATT_UpdateReflect();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"updateReflect",
                    							lv_updateReflect_30_0,
                    							"com.cohesionforce.hla.dsl.Omt.ATT_UpdateReflect");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOmt.g:2727:4: ( (lv_updateReflectNote_31_0= ruleNoteRef ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==108) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalOmt.g:2728:5: (lv_updateReflectNote_31_0= ruleNoteRef )
                            {
                            // InternalOmt.g:2728:5: (lv_updateReflectNote_31_0= ruleNoteRef )
                            // InternalOmt.g:2729:6: lv_updateReflectNote_31_0= ruleNoteRef
                            {

                            						newCompositeNode(grammarAccess.getAttributeAccess().getUpdateReflectNoteNoteRefParserRuleCall_16_3_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_updateReflectNote_31_0=ruleNoteRef();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAttributeRule());
                            						}
                            						set(
                            							current,
                            							"updateReflectNote",
                            							lv_updateReflectNote_31_0,
                            							"com.cohesionforce.hla.dsl.Omt.NoteRef");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    this_CLOSE_32=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_32, grammarAccess.getAttributeAccess().getCLOSETerminalRuleCall_16_4());
                    			

                    }
                    break;

            }

            // InternalOmt.g:2751:3: ( (lv_description_33_0= ruleDescription ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_OPEN) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==104) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // InternalOmt.g:2752:4: (lv_description_33_0= ruleDescription )
                    {
                    // InternalOmt.g:2752:4: (lv_description_33_0= ruleDescription )
                    // InternalOmt.g:2753:5: lv_description_33_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionDescriptionParserRuleCall_17_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_description_33_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_33_0,
                    						"com.cohesionforce.hla.dsl.Omt.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:2770:3: (this_OPEN_34= RULE_OPEN otherlv_35= 'RoutingSpace' ( (lv_routingSpace_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_OPEN) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOmt.g:2771:4: this_OPEN_34= RULE_OPEN otherlv_35= 'RoutingSpace' ( (lv_routingSpace_36_0= RULE_STRING ) ) this_CLOSE_37= RULE_CLOSE
                    {
                    this_OPEN_34=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_38); 

                    				newLeafNode(this_OPEN_34, grammarAccess.getAttributeAccess().getOPENTerminalRuleCall_18_0());
                    			
                    otherlv_35=(Token)match(input,45,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_35, grammarAccess.getAttributeAccess().getRoutingSpaceKeyword_18_1());
                    			
                    // InternalOmt.g:2779:4: ( (lv_routingSpace_36_0= RULE_STRING ) )
                    // InternalOmt.g:2780:5: (lv_routingSpace_36_0= RULE_STRING )
                    {
                    // InternalOmt.g:2780:5: (lv_routingSpace_36_0= RULE_STRING )
                    // InternalOmt.g:2781:6: lv_routingSpace_36_0= RULE_STRING
                    {
                    lv_routingSpace_36_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_routingSpace_36_0, grammarAccess.getAttributeAccess().getRoutingSpaceSTRINGTerminalRuleCall_18_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"routingSpace",
                    							lv_routingSpace_36_0,
                    							"com.cohesionforce.hla.dsl.Omt.STRING");
                    					

                    }


                    }

                    this_CLOSE_37=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_7); 

                    				newLeafNode(this_CLOSE_37, grammarAccess.getAttributeAccess().getCLOSETerminalRuleCall_18_3());
                    			

                    }
                    break;

            }

            this_CLOSE_38=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_38, grammarAccess.getAttributeAccess().getCLOSETerminalRuleCall_19());
            		

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


    // $ANTLR start "entryRuleATT_UpdateType"
    // InternalOmt.g:2810:1: entryRuleATT_UpdateType returns [String current=null] : iv_ruleATT_UpdateType= ruleATT_UpdateType EOF ;
    public final String entryRuleATT_UpdateType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATT_UpdateType = null;


        try {
            // InternalOmt.g:2810:54: (iv_ruleATT_UpdateType= ruleATT_UpdateType EOF )
            // InternalOmt.g:2811:2: iv_ruleATT_UpdateType= ruleATT_UpdateType EOF
            {
             newCompositeNode(grammarAccess.getATT_UpdateTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleATT_UpdateType=ruleATT_UpdateType();

            state._fsp--;

             current =iv_ruleATT_UpdateType.getText(); 
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
    // $ANTLR end "entryRuleATT_UpdateType"


    // $ANTLR start "ruleATT_UpdateType"
    // InternalOmt.g:2817:1: ruleATT_UpdateType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Static' | kw= 'Periodic' | kw= 'Conditional' ) ;
    public final AntlrDatatypeRuleToken ruleATT_UpdateType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOmt.g:2823:2: ( (kw= 'Static' | kw= 'Periodic' | kw= 'Conditional' ) )
            // InternalOmt.g:2824:2: (kw= 'Static' | kw= 'Periodic' | kw= 'Conditional' )
            {
            // InternalOmt.g:2824:2: (kw= 'Static' | kw= 'Periodic' | kw= 'Conditional' )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt68=1;
                }
                break;
            case 74:
                {
                alt68=2;
                }
                break;
            case 75:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalOmt.g:2825:3: kw= 'Static'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_UpdateTypeAccess().getStaticKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:2831:3: kw= 'Periodic'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_UpdateTypeAccess().getPeriodicKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOmt.g:2837:3: kw= 'Conditional'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_UpdateTypeAccess().getConditionalKeyword_2());
                    		

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
    // $ANTLR end "ruleATT_UpdateType"


    // $ANTLR start "entryRuleATT_TransferAccept"
    // InternalOmt.g:2846:1: entryRuleATT_TransferAccept returns [String current=null] : iv_ruleATT_TransferAccept= ruleATT_TransferAccept EOF ;
    public final String entryRuleATT_TransferAccept() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATT_TransferAccept = null;


        try {
            // InternalOmt.g:2846:58: (iv_ruleATT_TransferAccept= ruleATT_TransferAccept EOF )
            // InternalOmt.g:2847:2: iv_ruleATT_TransferAccept= ruleATT_TransferAccept EOF
            {
             newCompositeNode(grammarAccess.getATT_TransferAcceptRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleATT_TransferAccept=ruleATT_TransferAccept();

            state._fsp--;

             current =iv_ruleATT_TransferAccept.getText(); 
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
    // $ANTLR end "entryRuleATT_TransferAccept"


    // $ANTLR start "ruleATT_TransferAccept"
    // InternalOmt.g:2853:1: ruleATT_TransferAccept returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'T' | kw= 'A' | kw= 'TA' | kw= 'N' ) ;
    public final AntlrDatatypeRuleToken ruleATT_TransferAccept() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOmt.g:2859:2: ( (kw= 'T' | kw= 'A' | kw= 'TA' | kw= 'N' ) )
            // InternalOmt.g:2860:2: (kw= 'T' | kw= 'A' | kw= 'TA' | kw= 'N' )
            {
            // InternalOmt.g:2860:2: (kw= 'T' | kw= 'A' | kw= 'TA' | kw= 'N' )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt69=1;
                }
                break;
            case 77:
                {
                alt69=2;
                }
                break;
            case 78:
                {
                alt69=3;
                }
                break;
            case 66:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalOmt.g:2861:3: kw= 'T'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_TransferAcceptAccess().getTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:2867:3: kw= 'A'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_TransferAcceptAccess().getAKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOmt.g:2873:3: kw= 'TA'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_TransferAcceptAccess().getTAKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOmt.g:2879:3: kw= 'N'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_TransferAcceptAccess().getNKeyword_3());
                    		

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
    // $ANTLR end "ruleATT_TransferAccept"


    // $ANTLR start "entryRuleATT_UpdateReflect"
    // InternalOmt.g:2888:1: entryRuleATT_UpdateReflect returns [String current=null] : iv_ruleATT_UpdateReflect= ruleATT_UpdateReflect EOF ;
    public final String entryRuleATT_UpdateReflect() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATT_UpdateReflect = null;


        try {
            // InternalOmt.g:2888:57: (iv_ruleATT_UpdateReflect= ruleATT_UpdateReflect EOF )
            // InternalOmt.g:2889:2: iv_ruleATT_UpdateReflect= ruleATT_UpdateReflect EOF
            {
             newCompositeNode(grammarAccess.getATT_UpdateReflectRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleATT_UpdateReflect=ruleATT_UpdateReflect();

            state._fsp--;

             current =iv_ruleATT_UpdateReflect.getText(); 
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
    // $ANTLR end "entryRuleATT_UpdateReflect"


    // $ANTLR start "ruleATT_UpdateReflect"
    // InternalOmt.g:2895:1: ruleATT_UpdateReflect returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'U' | kw= 'R' | kw= 'UR' ) ;
    public final AntlrDatatypeRuleToken ruleATT_UpdateReflect() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOmt.g:2901:2: ( (kw= 'U' | kw= 'R' | kw= 'UR' ) )
            // InternalOmt.g:2902:2: (kw= 'U' | kw= 'R' | kw= 'UR' )
            {
            // InternalOmt.g:2902:2: (kw= 'U' | kw= 'R' | kw= 'UR' )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt70=1;
                }
                break;
            case 80:
                {
                alt70=2;
                }
                break;
            case 81:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalOmt.g:2903:3: kw= 'U'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_UpdateReflectAccess().getUKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:2909:3: kw= 'R'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_UpdateReflectAccess().getRKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOmt.g:2915:3: kw= 'UR'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getATT_UpdateReflectAccess().getURKeyword_2());
                    		

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
    // $ANTLR end "ruleATT_UpdateReflect"


    // $ANTLR start "entryRuleEnumeratedDataType"
    // InternalOmt.g:2924:1: entryRuleEnumeratedDataType returns [EObject current=null] : iv_ruleEnumeratedDataType= ruleEnumeratedDataType EOF ;
    public final EObject entryRuleEnumeratedDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeratedDataType = null;


        try {
            // InternalOmt.g:2924:59: (iv_ruleEnumeratedDataType= ruleEnumeratedDataType EOF )
            // InternalOmt.g:2925:2: iv_ruleEnumeratedDataType= ruleEnumeratedDataType EOF
            {
             newCompositeNode(grammarAccess.getEnumeratedDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumeratedDataType=ruleEnumeratedDataType();

            state._fsp--;

             current =iv_ruleEnumeratedDataType; 
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
    // $ANTLR end "entryRuleEnumeratedDataType"


    // $ANTLR start "ruleEnumeratedDataType"
    // InternalOmt.g:2931:1: ruleEnumeratedDataType returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'EnumeratedDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMEnumeratedDataType' ( ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_literals_11_0= ruleEnumeration ) )+ this_CLOSE_12= RULE_CLOSE ) ;
    public final EObject ruleEnumeratedDataType() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token this_CLOSE_6=null;
        Token this_OPEN_7=null;
        Token otherlv_8=null;
        Token lv_isMOMEnumeratedDataType_9_1=null;
        Token lv_isMOMEnumeratedDataType_9_2=null;
        Token this_CLOSE_10=null;
        Token this_CLOSE_12=null;
        EObject lv_note_5_0 = null;

        EObject lv_literals_11_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:2937:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'EnumeratedDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMEnumeratedDataType' ( ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_literals_11_0= ruleEnumeration ) )+ this_CLOSE_12= RULE_CLOSE ) )
            // InternalOmt.g:2938:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'EnumeratedDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMEnumeratedDataType' ( ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_literals_11_0= ruleEnumeration ) )+ this_CLOSE_12= RULE_CLOSE )
            {
            // InternalOmt.g:2938:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'EnumeratedDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMEnumeratedDataType' ( ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_literals_11_0= ruleEnumeration ) )+ this_CLOSE_12= RULE_CLOSE )
            // InternalOmt.g:2939:3: this_OPEN_0= RULE_OPEN otherlv_1= 'EnumeratedDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMEnumeratedDataType' ( ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_literals_11_0= ruleEnumeration ) )+ this_CLOSE_12= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_67); 

            			newLeafNode(this_OPEN_0, grammarAccess.getEnumeratedDataTypeAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,82,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumeratedDataTypeAccess().getEnumeratedDataTypeKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_10); 

            			newLeafNode(this_OPEN_2, grammarAccess.getEnumeratedDataTypeAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumeratedDataTypeAccess().getNameKeyword_3());
            		
            // InternalOmt.g:2955:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalOmt.g:2956:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalOmt.g:2956:4: (lv_name_4_0= RULE_STRING )
            // InternalOmt.g:2957:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_name_4_0, grammarAccess.getEnumeratedDataTypeAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumeratedDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:2973:3: ( (lv_note_5_0= ruleNoteRef ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==108) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalOmt.g:2974:4: (lv_note_5_0= ruleNoteRef )
                    {
                    // InternalOmt.g:2974:4: (lv_note_5_0= ruleNoteRef )
                    // InternalOmt.g:2975:5: lv_note_5_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getEnumeratedDataTypeAccess().getNoteNoteRefParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_note_5_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnumeratedDataTypeRule());
                    					}
                    					set(
                    						current,
                    						"note",
                    						lv_note_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getEnumeratedDataTypeAccess().getCLOSETerminalRuleCall_6());
            		
            // InternalOmt.g:2996:3: (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMEnumeratedDataType' ( ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_OPEN) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==83) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // InternalOmt.g:2997:4: this_OPEN_7= RULE_OPEN otherlv_8= 'MOMEnumeratedDataType' ( ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE
                    {
                    this_OPEN_7=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_68); 

                    				newLeafNode(this_OPEN_7, grammarAccess.getEnumeratedDataTypeAccess().getOPENTerminalRuleCall_7_0());
                    			
                    otherlv_8=(Token)match(input,83,FollowSets000.FOLLOW_55); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnumeratedDataTypeAccess().getMOMEnumeratedDataTypeKeyword_7_1());
                    			
                    // InternalOmt.g:3005:4: ( ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) ) )
                    // InternalOmt.g:3006:5: ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) )
                    {
                    // InternalOmt.g:3006:5: ( (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' ) )
                    // InternalOmt.g:3007:6: (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' )
                    {
                    // InternalOmt.g:3007:6: (lv_isMOMEnumeratedDataType_9_1= 'TRUE' | lv_isMOMEnumeratedDataType_9_2= 'FALSE' )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==61) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==62) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalOmt.g:3008:7: lv_isMOMEnumeratedDataType_9_1= 'TRUE'
                            {
                            lv_isMOMEnumeratedDataType_9_1=(Token)match(input,61,FollowSets000.FOLLOW_7); 

                            							newLeafNode(lv_isMOMEnumeratedDataType_9_1, grammarAccess.getEnumeratedDataTypeAccess().getIsMOMEnumeratedDataTypeTRUEKeyword_7_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEnumeratedDataTypeRule());
                            							}
                            							setWithLastConsumed(current, "isMOMEnumeratedDataType", lv_isMOMEnumeratedDataType_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalOmt.g:3019:7: lv_isMOMEnumeratedDataType_9_2= 'FALSE'
                            {
                            lv_isMOMEnumeratedDataType_9_2=(Token)match(input,62,FollowSets000.FOLLOW_7); 

                            							newLeafNode(lv_isMOMEnumeratedDataType_9_2, grammarAccess.getEnumeratedDataTypeAccess().getIsMOMEnumeratedDataTypeFALSEKeyword_7_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEnumeratedDataTypeRule());
                            							}
                            							setWithLastConsumed(current, "isMOMEnumeratedDataType", lv_isMOMEnumeratedDataType_9_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    this_CLOSE_10=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

                    				newLeafNode(this_CLOSE_10, grammarAccess.getEnumeratedDataTypeAccess().getCLOSETerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:3037:3: ( (lv_literals_11_0= ruleEnumeration ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_OPEN) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalOmt.g:3038:4: (lv_literals_11_0= ruleEnumeration )
            	    {
            	    // InternalOmt.g:3038:4: (lv_literals_11_0= ruleEnumeration )
            	    // InternalOmt.g:3039:5: lv_literals_11_0= ruleEnumeration
            	    {

            	    					newCompositeNode(grammarAccess.getEnumeratedDataTypeAccess().getLiteralsEnumerationParserRuleCall_8_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_literals_11_0=ruleEnumeration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumeratedDataTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"literals",
            	    						lv_literals_11_0,
            	    						"com.cohesionforce.hla.dsl.Omt.Enumeration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);

            this_CLOSE_12=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_12, grammarAccess.getEnumeratedDataTypeAccess().getCLOSETerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleEnumeratedDataType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalOmt.g:3064:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalOmt.g:3064:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalOmt.g:3065:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalOmt.g:3071:1: ruleEnumeration returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Enumeration' this_OPEN_2= RULE_OPEN otherlv_3= 'Enumerator' ( (lv_literal_4_0= RULE_STRING ) ) ( (lv_enumeratorNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Representation' ( (lv_value_9_0= RULE_INT ) ) ( (lv_representationNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_CLOSE_12= RULE_CLOSE ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_literal_4_0=null;
        Token this_CLOSE_6=null;
        Token this_OPEN_7=null;
        Token otherlv_8=null;
        Token lv_value_9_0=null;
        Token this_CLOSE_11=null;
        Token this_CLOSE_12=null;
        EObject lv_enumeratorNote_5_0 = null;

        EObject lv_representationNote_10_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:3077:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Enumeration' this_OPEN_2= RULE_OPEN otherlv_3= 'Enumerator' ( (lv_literal_4_0= RULE_STRING ) ) ( (lv_enumeratorNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Representation' ( (lv_value_9_0= RULE_INT ) ) ( (lv_representationNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_CLOSE_12= RULE_CLOSE ) )
            // InternalOmt.g:3078:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Enumeration' this_OPEN_2= RULE_OPEN otherlv_3= 'Enumerator' ( (lv_literal_4_0= RULE_STRING ) ) ( (lv_enumeratorNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Representation' ( (lv_value_9_0= RULE_INT ) ) ( (lv_representationNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_CLOSE_12= RULE_CLOSE )
            {
            // InternalOmt.g:3078:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Enumeration' this_OPEN_2= RULE_OPEN otherlv_3= 'Enumerator' ( (lv_literal_4_0= RULE_STRING ) ) ( (lv_enumeratorNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Representation' ( (lv_value_9_0= RULE_INT ) ) ( (lv_representationNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_CLOSE_12= RULE_CLOSE )
            // InternalOmt.g:3079:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Enumeration' this_OPEN_2= RULE_OPEN otherlv_3= 'Enumerator' ( (lv_literal_4_0= RULE_STRING ) ) ( (lv_enumeratorNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE this_OPEN_7= RULE_OPEN otherlv_8= 'Representation' ( (lv_value_9_0= RULE_INT ) ) ( (lv_representationNote_10_0= ruleNoteRef ) )? this_CLOSE_11= RULE_CLOSE this_CLOSE_12= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_69); 

            			newLeafNode(this_OPEN_0, grammarAccess.getEnumerationAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,84,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_70); 

            			newLeafNode(this_OPEN_2, grammarAccess.getEnumerationAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,85,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getEnumeratorKeyword_3());
            		
            // InternalOmt.g:3095:3: ( (lv_literal_4_0= RULE_STRING ) )
            // InternalOmt.g:3096:4: (lv_literal_4_0= RULE_STRING )
            {
            // InternalOmt.g:3096:4: (lv_literal_4_0= RULE_STRING )
            // InternalOmt.g:3097:5: lv_literal_4_0= RULE_STRING
            {
            lv_literal_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_literal_4_0, grammarAccess.getEnumerationAccess().getLiteralSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"literal",
            						lv_literal_4_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:3113:3: ( (lv_enumeratorNote_5_0= ruleNoteRef ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==108) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalOmt.g:3114:4: (lv_enumeratorNote_5_0= ruleNoteRef )
                    {
                    // InternalOmt.g:3114:4: (lv_enumeratorNote_5_0= ruleNoteRef )
                    // InternalOmt.g:3115:5: lv_enumeratorNote_5_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getEnumerationAccess().getEnumeratorNoteNoteRefParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_enumeratorNote_5_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    					}
                    					set(
                    						current,
                    						"enumeratorNote",
                    						lv_enumeratorNote_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getEnumerationAccess().getCLOSETerminalRuleCall_6());
            		
            this_OPEN_7=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_71); 

            			newLeafNode(this_OPEN_7, grammarAccess.getEnumerationAccess().getOPENTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,86,FollowSets000.FOLLOW_53); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRepresentationKeyword_8());
            		
            // InternalOmt.g:3144:3: ( (lv_value_9_0= RULE_INT ) )
            // InternalOmt.g:3145:4: (lv_value_9_0= RULE_INT )
            {
            // InternalOmt.g:3145:4: (lv_value_9_0= RULE_INT )
            // InternalOmt.g:3146:5: lv_value_9_0= RULE_INT
            {
            lv_value_9_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_value_9_0, grammarAccess.getEnumerationAccess().getValueINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_9_0,
            						"com.cohesionforce.hla.dsl.Omt.INT");
            				

            }


            }

            // InternalOmt.g:3162:3: ( (lv_representationNote_10_0= ruleNoteRef ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==108) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalOmt.g:3163:4: (lv_representationNote_10_0= ruleNoteRef )
                    {
                    // InternalOmt.g:3163:4: (lv_representationNote_10_0= ruleNoteRef )
                    // InternalOmt.g:3164:5: lv_representationNote_10_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getEnumerationAccess().getRepresentationNoteNoteRefParserRuleCall_10_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_representationNote_10_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    					}
                    					set(
                    						current,
                    						"representationNote",
                    						lv_representationNote_10_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_11=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_7); 

            			newLeafNode(this_CLOSE_11, grammarAccess.getEnumerationAccess().getCLOSETerminalRuleCall_11());
            		
            this_CLOSE_12=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_12, grammarAccess.getEnumerationAccess().getCLOSETerminalRuleCall_12());
            		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleComplexDataType"
    // InternalOmt.g:3193:1: entryRuleComplexDataType returns [EObject current=null] : iv_ruleComplexDataType= ruleComplexDataType EOF ;
    public final EObject entryRuleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataType = null;


        try {
            // InternalOmt.g:3193:56: (iv_ruleComplexDataType= ruleComplexDataType EOF )
            // InternalOmt.g:3194:2: iv_ruleComplexDataType= ruleComplexDataType EOF
            {
             newCompositeNode(grammarAccess.getComplexDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComplexDataType=ruleComplexDataType();

            state._fsp--;

             current =iv_ruleComplexDataType; 
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
    // $ANTLR end "entryRuleComplexDataType"


    // $ANTLR start "ruleComplexDataType"
    // InternalOmt.g:3200:1: ruleComplexDataType returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMComplexDataType' ( ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_components_11_0= ruleComplexComponent ) )+ this_CLOSE_12= RULE_CLOSE ) ;
    public final EObject ruleComplexDataType() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token this_CLOSE_6=null;
        Token this_OPEN_7=null;
        Token otherlv_8=null;
        Token lv_isMOMComplexDataType_9_1=null;
        Token lv_isMOMComplexDataType_9_2=null;
        Token this_CLOSE_10=null;
        Token this_CLOSE_12=null;
        EObject lv_note_5_0 = null;

        EObject lv_components_11_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:3206:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMComplexDataType' ( ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_components_11_0= ruleComplexComponent ) )+ this_CLOSE_12= RULE_CLOSE ) )
            // InternalOmt.g:3207:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMComplexDataType' ( ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_components_11_0= ruleComplexComponent ) )+ this_CLOSE_12= RULE_CLOSE )
            {
            // InternalOmt.g:3207:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMComplexDataType' ( ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_components_11_0= ruleComplexComponent ) )+ this_CLOSE_12= RULE_CLOSE )
            // InternalOmt.g:3208:3: this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexDataType' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_note_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMComplexDataType' ( ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_components_11_0= ruleComplexComponent ) )+ this_CLOSE_12= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_72); 

            			newLeafNode(this_OPEN_0, grammarAccess.getComplexDataTypeAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,87,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexDataTypeAccess().getComplexDataTypeKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_10); 

            			newLeafNode(this_OPEN_2, grammarAccess.getComplexDataTypeAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexDataTypeAccess().getNameKeyword_3());
            		
            // InternalOmt.g:3224:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalOmt.g:3225:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalOmt.g:3225:4: (lv_name_4_0= RULE_STRING )
            // InternalOmt.g:3226:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_name_4_0, grammarAccess.getComplexDataTypeAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:3242:3: ( (lv_note_5_0= ruleNoteRef ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==108) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalOmt.g:3243:4: (lv_note_5_0= ruleNoteRef )
                    {
                    // InternalOmt.g:3243:4: (lv_note_5_0= ruleNoteRef )
                    // InternalOmt.g:3244:5: lv_note_5_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getComplexDataTypeAccess().getNoteNoteRefParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_note_5_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
                    					}
                    					set(
                    						current,
                    						"note",
                    						lv_note_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getComplexDataTypeAccess().getCLOSETerminalRuleCall_6());
            		
            // InternalOmt.g:3265:3: (this_OPEN_7= RULE_OPEN otherlv_8= 'MOMComplexDataType' ( ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_OPEN) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==88) ) {
                    alt79=1;
                }
            }
            switch (alt79) {
                case 1 :
                    // InternalOmt.g:3266:4: this_OPEN_7= RULE_OPEN otherlv_8= 'MOMComplexDataType' ( ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) ) ) this_CLOSE_10= RULE_CLOSE
                    {
                    this_OPEN_7=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_73); 

                    				newLeafNode(this_OPEN_7, grammarAccess.getComplexDataTypeAccess().getOPENTerminalRuleCall_7_0());
                    			
                    otherlv_8=(Token)match(input,88,FollowSets000.FOLLOW_55); 

                    				newLeafNode(otherlv_8, grammarAccess.getComplexDataTypeAccess().getMOMComplexDataTypeKeyword_7_1());
                    			
                    // InternalOmt.g:3274:4: ( ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) ) )
                    // InternalOmt.g:3275:5: ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) )
                    {
                    // InternalOmt.g:3275:5: ( (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' ) )
                    // InternalOmt.g:3276:6: (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' )
                    {
                    // InternalOmt.g:3276:6: (lv_isMOMComplexDataType_9_1= 'TRUE' | lv_isMOMComplexDataType_9_2= 'FALSE' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==61) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==62) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalOmt.g:3277:7: lv_isMOMComplexDataType_9_1= 'TRUE'
                            {
                            lv_isMOMComplexDataType_9_1=(Token)match(input,61,FollowSets000.FOLLOW_7); 

                            							newLeafNode(lv_isMOMComplexDataType_9_1, grammarAccess.getComplexDataTypeAccess().getIsMOMComplexDataTypeTRUEKeyword_7_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComplexDataTypeRule());
                            							}
                            							setWithLastConsumed(current, "isMOMComplexDataType", lv_isMOMComplexDataType_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalOmt.g:3288:7: lv_isMOMComplexDataType_9_2= 'FALSE'
                            {
                            lv_isMOMComplexDataType_9_2=(Token)match(input,62,FollowSets000.FOLLOW_7); 

                            							newLeafNode(lv_isMOMComplexDataType_9_2, grammarAccess.getComplexDataTypeAccess().getIsMOMComplexDataTypeFALSEKeyword_7_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComplexDataTypeRule());
                            							}
                            							setWithLastConsumed(current, "isMOMComplexDataType", lv_isMOMComplexDataType_9_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    this_CLOSE_10=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

                    				newLeafNode(this_CLOSE_10, grammarAccess.getComplexDataTypeAccess().getCLOSETerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:3306:3: ( (lv_components_11_0= ruleComplexComponent ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_OPEN) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalOmt.g:3307:4: (lv_components_11_0= ruleComplexComponent )
            	    {
            	    // InternalOmt.g:3307:4: (lv_components_11_0= ruleComplexComponent )
            	    // InternalOmt.g:3308:5: lv_components_11_0= ruleComplexComponent
            	    {

            	    					newCompositeNode(grammarAccess.getComplexDataTypeAccess().getComponentsComplexComponentParserRuleCall_8_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_components_11_0=ruleComplexComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_11_0,
            	    						"com.cohesionforce.hla.dsl.Omt.ComplexComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);

            this_CLOSE_12=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_12, grammarAccess.getComplexDataTypeAccess().getCLOSETerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleComplexDataType"


    // $ANTLR start "entryRuleComplexComponent"
    // InternalOmt.g:3333:1: entryRuleComplexComponent returns [EObject current=null] : iv_ruleComplexComponent= ruleComplexComponent EOF ;
    public final EObject entryRuleComplexComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexComponent = null;


        try {
            // InternalOmt.g:3333:57: (iv_ruleComplexComponent= ruleComplexComponent EOF )
            // InternalOmt.g:3334:2: iv_ruleComplexComponent= ruleComplexComponent EOF
            {
             newCompositeNode(grammarAccess.getComplexComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComplexComponent=ruleComplexComponent();

            state._fsp--;

             current =iv_ruleComplexComponent; 
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
    // $ANTLR end "entryRuleComplexComponent"


    // $ANTLR start "ruleComplexComponent"
    // InternalOmt.g:3340:1: ruleComplexComponent returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexComponent' ( (lv_position_2_0= rulePosition ) )? ( (lv_fieldName_3_0= ruleFieldName ) ) ( (lv_dataType_4_0= ruleDataType ) )? ( (lv_cardinality_5_0= ruleCardinality ) )? ( (lv_units_6_0= ruleUnits ) )? ( (lv_resolution_7_0= ruleResolution ) )? ( (lv_accuracy_8_0= ruleAccuracy ) )? ( (lv_accuracyCondition_9_0= ruleAccuracyCondition ) )? this_CLOSE_10= RULE_CLOSE ) ;
    public final EObject ruleComplexComponent() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_CLOSE_10=null;
        EObject lv_position_2_0 = null;

        EObject lv_fieldName_3_0 = null;

        EObject lv_dataType_4_0 = null;

        EObject lv_cardinality_5_0 = null;

        EObject lv_units_6_0 = null;

        EObject lv_resolution_7_0 = null;

        EObject lv_accuracy_8_0 = null;

        EObject lv_accuracyCondition_9_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:3346:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexComponent' ( (lv_position_2_0= rulePosition ) )? ( (lv_fieldName_3_0= ruleFieldName ) ) ( (lv_dataType_4_0= ruleDataType ) )? ( (lv_cardinality_5_0= ruleCardinality ) )? ( (lv_units_6_0= ruleUnits ) )? ( (lv_resolution_7_0= ruleResolution ) )? ( (lv_accuracy_8_0= ruleAccuracy ) )? ( (lv_accuracyCondition_9_0= ruleAccuracyCondition ) )? this_CLOSE_10= RULE_CLOSE ) )
            // InternalOmt.g:3347:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexComponent' ( (lv_position_2_0= rulePosition ) )? ( (lv_fieldName_3_0= ruleFieldName ) ) ( (lv_dataType_4_0= ruleDataType ) )? ( (lv_cardinality_5_0= ruleCardinality ) )? ( (lv_units_6_0= ruleUnits ) )? ( (lv_resolution_7_0= ruleResolution ) )? ( (lv_accuracy_8_0= ruleAccuracy ) )? ( (lv_accuracyCondition_9_0= ruleAccuracyCondition ) )? this_CLOSE_10= RULE_CLOSE )
            {
            // InternalOmt.g:3347:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexComponent' ( (lv_position_2_0= rulePosition ) )? ( (lv_fieldName_3_0= ruleFieldName ) ) ( (lv_dataType_4_0= ruleDataType ) )? ( (lv_cardinality_5_0= ruleCardinality ) )? ( (lv_units_6_0= ruleUnits ) )? ( (lv_resolution_7_0= ruleResolution ) )? ( (lv_accuracy_8_0= ruleAccuracy ) )? ( (lv_accuracyCondition_9_0= ruleAccuracyCondition ) )? this_CLOSE_10= RULE_CLOSE )
            // InternalOmt.g:3348:3: this_OPEN_0= RULE_OPEN otherlv_1= 'ComplexComponent' ( (lv_position_2_0= rulePosition ) )? ( (lv_fieldName_3_0= ruleFieldName ) ) ( (lv_dataType_4_0= ruleDataType ) )? ( (lv_cardinality_5_0= ruleCardinality ) )? ( (lv_units_6_0= ruleUnits ) )? ( (lv_resolution_7_0= ruleResolution ) )? ( (lv_accuracy_8_0= ruleAccuracy ) )? ( (lv_accuracyCondition_9_0= ruleAccuracyCondition ) )? this_CLOSE_10= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_74); 

            			newLeafNode(this_OPEN_0, grammarAccess.getComplexComponentAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexComponentAccess().getComplexComponentKeyword_1());
            		
            // InternalOmt.g:3356:3: ( (lv_position_2_0= rulePosition ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_OPEN) ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==93) ) {
                    alt81=1;
                }
            }
            switch (alt81) {
                case 1 :
                    // InternalOmt.g:3357:4: (lv_position_2_0= rulePosition )
                    {
                    // InternalOmt.g:3357:4: (lv_position_2_0= rulePosition )
                    // InternalOmt.g:3358:5: lv_position_2_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getComplexComponentAccess().getPositionPositionParserRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_position_2_0=rulePosition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexComponentRule());
                    					}
                    					set(
                    						current,
                    						"position",
                    						lv_position_2_0,
                    						"com.cohesionforce.hla.dsl.Omt.Position");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:3375:3: ( (lv_fieldName_3_0= ruleFieldName ) )
            // InternalOmt.g:3376:4: (lv_fieldName_3_0= ruleFieldName )
            {
            // InternalOmt.g:3376:4: (lv_fieldName_3_0= ruleFieldName )
            // InternalOmt.g:3377:5: lv_fieldName_3_0= ruleFieldName
            {

            					newCompositeNode(grammarAccess.getComplexComponentAccess().getFieldNameFieldNameParserRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_13);
            lv_fieldName_3_0=ruleFieldName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexComponentRule());
            					}
            					set(
            						current,
            						"fieldName",
            						lv_fieldName_3_0,
            						"com.cohesionforce.hla.dsl.Omt.FieldName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOmt.g:3394:3: ( (lv_dataType_4_0= ruleDataType ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_OPEN) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==38) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // InternalOmt.g:3395:4: (lv_dataType_4_0= ruleDataType )
                    {
                    // InternalOmt.g:3395:4: (lv_dataType_4_0= ruleDataType )
                    // InternalOmt.g:3396:5: lv_dataType_4_0= ruleDataType
                    {

                    					newCompositeNode(grammarAccess.getComplexComponentAccess().getDataTypeDataTypeParserRuleCall_4_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_dataType_4_0=ruleDataType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexComponentRule());
                    					}
                    					set(
                    						current,
                    						"dataType",
                    						lv_dataType_4_0,
                    						"com.cohesionforce.hla.dsl.Omt.DataType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:3413:3: ( (lv_cardinality_5_0= ruleCardinality ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_OPEN) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==95) ) {
                    alt83=1;
                }
            }
            switch (alt83) {
                case 1 :
                    // InternalOmt.g:3414:4: (lv_cardinality_5_0= ruleCardinality )
                    {
                    // InternalOmt.g:3414:4: (lv_cardinality_5_0= ruleCardinality )
                    // InternalOmt.g:3415:5: lv_cardinality_5_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getComplexComponentAccess().getCardinalityCardinalityParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_cardinality_5_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexComponentRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:3432:3: ( (lv_units_6_0= ruleUnits ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_OPEN) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==34) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // InternalOmt.g:3433:4: (lv_units_6_0= ruleUnits )
                    {
                    // InternalOmt.g:3433:4: (lv_units_6_0= ruleUnits )
                    // InternalOmt.g:3434:5: lv_units_6_0= ruleUnits
                    {

                    					newCompositeNode(grammarAccess.getComplexComponentAccess().getUnitsUnitsParserRuleCall_6_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_units_6_0=ruleUnits();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexComponentRule());
                    					}
                    					set(
                    						current,
                    						"units",
                    						lv_units_6_0,
                    						"com.cohesionforce.hla.dsl.Omt.Units");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:3451:3: ( (lv_resolution_7_0= ruleResolution ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_OPEN) ) {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==92) ) {
                    alt85=1;
                }
            }
            switch (alt85) {
                case 1 :
                    // InternalOmt.g:3452:4: (lv_resolution_7_0= ruleResolution )
                    {
                    // InternalOmt.g:3452:4: (lv_resolution_7_0= ruleResolution )
                    // InternalOmt.g:3453:5: lv_resolution_7_0= ruleResolution
                    {

                    					newCompositeNode(grammarAccess.getComplexComponentAccess().getResolutionResolutionParserRuleCall_7_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_resolution_7_0=ruleResolution();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexComponentRule());
                    					}
                    					set(
                    						current,
                    						"resolution",
                    						lv_resolution_7_0,
                    						"com.cohesionforce.hla.dsl.Omt.Resolution");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:3470:3: ( (lv_accuracy_8_0= ruleAccuracy ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_OPEN) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==90) ) {
                    alt86=1;
                }
            }
            switch (alt86) {
                case 1 :
                    // InternalOmt.g:3471:4: (lv_accuracy_8_0= ruleAccuracy )
                    {
                    // InternalOmt.g:3471:4: (lv_accuracy_8_0= ruleAccuracy )
                    // InternalOmt.g:3472:5: lv_accuracy_8_0= ruleAccuracy
                    {

                    					newCompositeNode(grammarAccess.getComplexComponentAccess().getAccuracyAccuracyParserRuleCall_8_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_accuracy_8_0=ruleAccuracy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexComponentRule());
                    					}
                    					set(
                    						current,
                    						"accuracy",
                    						lv_accuracy_8_0,
                    						"com.cohesionforce.hla.dsl.Omt.Accuracy");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:3489:3: ( (lv_accuracyCondition_9_0= ruleAccuracyCondition ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_OPEN) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalOmt.g:3490:4: (lv_accuracyCondition_9_0= ruleAccuracyCondition )
                    {
                    // InternalOmt.g:3490:4: (lv_accuracyCondition_9_0= ruleAccuracyCondition )
                    // InternalOmt.g:3491:5: lv_accuracyCondition_9_0= ruleAccuracyCondition
                    {

                    					newCompositeNode(grammarAccess.getComplexComponentAccess().getAccuracyConditionAccuracyConditionParserRuleCall_9_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_accuracyCondition_9_0=ruleAccuracyCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexComponentRule());
                    					}
                    					set(
                    						current,
                    						"accuracyCondition",
                    						lv_accuracyCondition_9_0,
                    						"com.cohesionforce.hla.dsl.Omt.AccuracyCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_10=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_10, grammarAccess.getComplexComponentAccess().getCLOSETerminalRuleCall_10());
            		

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
    // $ANTLR end "ruleComplexComponent"


    // $ANTLR start "entryRuleAccuracy"
    // InternalOmt.g:3516:1: entryRuleAccuracy returns [EObject current=null] : iv_ruleAccuracy= ruleAccuracy EOF ;
    public final EObject entryRuleAccuracy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccuracy = null;


        try {
            // InternalOmt.g:3516:49: (iv_ruleAccuracy= ruleAccuracy EOF )
            // InternalOmt.g:3517:2: iv_ruleAccuracy= ruleAccuracy EOF
            {
             newCompositeNode(grammarAccess.getAccuracyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAccuracy=ruleAccuracy();

            state._fsp--;

             current =iv_ruleAccuracy; 
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
    // $ANTLR end "entryRuleAccuracy"


    // $ANTLR start "ruleAccuracy"
    // InternalOmt.g:3523:1: ruleAccuracy returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Accuracy' ( (lv_accuracy_2_0= RULE_STRING ) ) ( (lv_accuracyNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleAccuracy() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_accuracy_2_0=null;
        Token this_CLOSE_4=null;
        EObject lv_accuracyNote_3_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:3529:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Accuracy' ( (lv_accuracy_2_0= RULE_STRING ) ) ( (lv_accuracyNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) )
            // InternalOmt.g:3530:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Accuracy' ( (lv_accuracy_2_0= RULE_STRING ) ) ( (lv_accuracyNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            {
            // InternalOmt.g:3530:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Accuracy' ( (lv_accuracy_2_0= RULE_STRING ) ) ( (lv_accuracyNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            // InternalOmt.g:3531:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Accuracy' ( (lv_accuracy_2_0= RULE_STRING ) ) ( (lv_accuracyNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_75); 

            			newLeafNode(this_OPEN_0, grammarAccess.getAccuracyAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAccuracyAccess().getAccuracyKeyword_1());
            		
            // InternalOmt.g:3539:3: ( (lv_accuracy_2_0= RULE_STRING ) )
            // InternalOmt.g:3540:4: (lv_accuracy_2_0= RULE_STRING )
            {
            // InternalOmt.g:3540:4: (lv_accuracy_2_0= RULE_STRING )
            // InternalOmt.g:3541:5: lv_accuracy_2_0= RULE_STRING
            {
            lv_accuracy_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_accuracy_2_0, grammarAccess.getAccuracyAccess().getAccuracySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccuracyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"accuracy",
            						lv_accuracy_2_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:3557:3: ( (lv_accuracyNote_3_0= ruleNoteRef ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==108) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalOmt.g:3558:4: (lv_accuracyNote_3_0= ruleNoteRef )
                    {
                    // InternalOmt.g:3558:4: (lv_accuracyNote_3_0= ruleNoteRef )
                    // InternalOmt.g:3559:5: lv_accuracyNote_3_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getAccuracyAccess().getAccuracyNoteNoteRefParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_accuracyNote_3_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAccuracyRule());
                    					}
                    					set(
                    						current,
                    						"accuracyNote",
                    						lv_accuracyNote_3_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getAccuracyAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleAccuracy"


    // $ANTLR start "entryRuleAccuracyCondition"
    // InternalOmt.g:3584:1: entryRuleAccuracyCondition returns [EObject current=null] : iv_ruleAccuracyCondition= ruleAccuracyCondition EOF ;
    public final EObject entryRuleAccuracyCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccuracyCondition = null;


        try {
            // InternalOmt.g:3584:58: (iv_ruleAccuracyCondition= ruleAccuracyCondition EOF )
            // InternalOmt.g:3585:2: iv_ruleAccuracyCondition= ruleAccuracyCondition EOF
            {
             newCompositeNode(grammarAccess.getAccuracyConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAccuracyCondition=ruleAccuracyCondition();

            state._fsp--;

             current =iv_ruleAccuracyCondition; 
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
    // $ANTLR end "entryRuleAccuracyCondition"


    // $ANTLR start "ruleAccuracyCondition"
    // InternalOmt.g:3591:1: ruleAccuracyCondition returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'AccuracyCondition' ( (lv_accuracyCondition_2_0= RULE_STRING ) ) ( (lv_accuracyConditionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleAccuracyCondition() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_accuracyCondition_2_0=null;
        Token this_CLOSE_4=null;
        EObject lv_accuracyConditionNote_3_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:3597:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'AccuracyCondition' ( (lv_accuracyCondition_2_0= RULE_STRING ) ) ( (lv_accuracyConditionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) )
            // InternalOmt.g:3598:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'AccuracyCondition' ( (lv_accuracyCondition_2_0= RULE_STRING ) ) ( (lv_accuracyConditionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            {
            // InternalOmt.g:3598:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'AccuracyCondition' ( (lv_accuracyCondition_2_0= RULE_STRING ) ) ( (lv_accuracyConditionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            // InternalOmt.g:3599:3: this_OPEN_0= RULE_OPEN otherlv_1= 'AccuracyCondition' ( (lv_accuracyCondition_2_0= RULE_STRING ) ) ( (lv_accuracyConditionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_76); 

            			newLeafNode(this_OPEN_0, grammarAccess.getAccuracyConditionAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,91,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAccuracyConditionAccess().getAccuracyConditionKeyword_1());
            		
            // InternalOmt.g:3607:3: ( (lv_accuracyCondition_2_0= RULE_STRING ) )
            // InternalOmt.g:3608:4: (lv_accuracyCondition_2_0= RULE_STRING )
            {
            // InternalOmt.g:3608:4: (lv_accuracyCondition_2_0= RULE_STRING )
            // InternalOmt.g:3609:5: lv_accuracyCondition_2_0= RULE_STRING
            {
            lv_accuracyCondition_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_accuracyCondition_2_0, grammarAccess.getAccuracyConditionAccess().getAccuracyConditionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccuracyConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"accuracyCondition",
            						lv_accuracyCondition_2_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:3625:3: ( (lv_accuracyConditionNote_3_0= ruleNoteRef ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==108) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalOmt.g:3626:4: (lv_accuracyConditionNote_3_0= ruleNoteRef )
                    {
                    // InternalOmt.g:3626:4: (lv_accuracyConditionNote_3_0= ruleNoteRef )
                    // InternalOmt.g:3627:5: lv_accuracyConditionNote_3_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getAccuracyConditionAccess().getAccuracyConditionNoteNoteRefParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_accuracyConditionNote_3_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAccuracyConditionRule());
                    					}
                    					set(
                    						current,
                    						"accuracyConditionNote",
                    						lv_accuracyConditionNote_3_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getAccuracyConditionAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleAccuracyCondition"


    // $ANTLR start "entryRuleResolution"
    // InternalOmt.g:3652:1: entryRuleResolution returns [EObject current=null] : iv_ruleResolution= ruleResolution EOF ;
    public final EObject entryRuleResolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolution = null;


        try {
            // InternalOmt.g:3652:51: (iv_ruleResolution= ruleResolution EOF )
            // InternalOmt.g:3653:2: iv_ruleResolution= ruleResolution EOF
            {
             newCompositeNode(grammarAccess.getResolutionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleResolution=ruleResolution();

            state._fsp--;

             current =iv_ruleResolution; 
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
    // $ANTLR end "entryRuleResolution"


    // $ANTLR start "ruleResolution"
    // InternalOmt.g:3659:1: ruleResolution returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Resolution' ( (lv_resolution_2_0= RULE_STRING ) ) ( (lv_resolutionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleResolution() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_resolution_2_0=null;
        Token this_CLOSE_4=null;
        EObject lv_resolutionNote_3_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:3665:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Resolution' ( (lv_resolution_2_0= RULE_STRING ) ) ( (lv_resolutionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) )
            // InternalOmt.g:3666:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Resolution' ( (lv_resolution_2_0= RULE_STRING ) ) ( (lv_resolutionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            {
            // InternalOmt.g:3666:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Resolution' ( (lv_resolution_2_0= RULE_STRING ) ) ( (lv_resolutionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            // InternalOmt.g:3667:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Resolution' ( (lv_resolution_2_0= RULE_STRING ) ) ( (lv_resolutionNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_77); 

            			newLeafNode(this_OPEN_0, grammarAccess.getResolutionAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,92,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getResolutionAccess().getResolutionKeyword_1());
            		
            // InternalOmt.g:3675:3: ( (lv_resolution_2_0= RULE_STRING ) )
            // InternalOmt.g:3676:4: (lv_resolution_2_0= RULE_STRING )
            {
            // InternalOmt.g:3676:4: (lv_resolution_2_0= RULE_STRING )
            // InternalOmt.g:3677:5: lv_resolution_2_0= RULE_STRING
            {
            lv_resolution_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_resolution_2_0, grammarAccess.getResolutionAccess().getResolutionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResolutionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"resolution",
            						lv_resolution_2_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:3693:3: ( (lv_resolutionNote_3_0= ruleNoteRef ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==108) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalOmt.g:3694:4: (lv_resolutionNote_3_0= ruleNoteRef )
                    {
                    // InternalOmt.g:3694:4: (lv_resolutionNote_3_0= ruleNoteRef )
                    // InternalOmt.g:3695:5: lv_resolutionNote_3_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getResolutionAccess().getResolutionNoteNoteRefParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_resolutionNote_3_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getResolutionRule());
                    					}
                    					set(
                    						current,
                    						"resolutionNote",
                    						lv_resolutionNote_3_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getResolutionAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleResolution"


    // $ANTLR start "entryRulePosition"
    // InternalOmt.g:3720:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalOmt.g:3720:49: (iv_rulePosition= rulePosition EOF )
            // InternalOmt.g:3721:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalOmt.g:3727:1: rulePosition returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Position' ( (lv_position_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_position_2_0=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalOmt.g:3733:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Position' ( (lv_position_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE ) )
            // InternalOmt.g:3734:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Position' ( (lv_position_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE )
            {
            // InternalOmt.g:3734:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Position' ( (lv_position_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE )
            // InternalOmt.g:3735:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Position' ( (lv_position_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_78); 

            			newLeafNode(this_OPEN_0, grammarAccess.getPositionAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,93,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getPositionKeyword_1());
            		
            // InternalOmt.g:3743:3: ( (lv_position_2_0= RULE_STRING ) )
            // InternalOmt.g:3744:4: (lv_position_2_0= RULE_STRING )
            {
            // InternalOmt.g:3744:4: (lv_position_2_0= RULE_STRING )
            // InternalOmt.g:3745:5: lv_position_2_0= RULE_STRING
            {
            lv_position_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_position_2_0, grammarAccess.getPositionAccess().getPositionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"position",
            						lv_position_2_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getPositionAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleDataType"
    // InternalOmt.g:3769:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalOmt.g:3769:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalOmt.g:3770:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalOmt.g:3776:1: ruleDataType returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'DataType' ( ( (otherlv_2= RULE_STRING ) ) | ( (lv_dataType_3_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_dataTypeNode_4_0= ruleNoteRef ) )? this_CLOSE_5= RULE_CLOSE ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_dataType_3_0=null;
        Token this_CLOSE_5=null;
        EObject lv_dataTypeNode_4_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:3782:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'DataType' ( ( (otherlv_2= RULE_STRING ) ) | ( (lv_dataType_3_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_dataTypeNode_4_0= ruleNoteRef ) )? this_CLOSE_5= RULE_CLOSE ) )
            // InternalOmt.g:3783:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'DataType' ( ( (otherlv_2= RULE_STRING ) ) | ( (lv_dataType_3_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_dataTypeNode_4_0= ruleNoteRef ) )? this_CLOSE_5= RULE_CLOSE )
            {
            // InternalOmt.g:3783:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'DataType' ( ( (otherlv_2= RULE_STRING ) ) | ( (lv_dataType_3_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_dataTypeNode_4_0= ruleNoteRef ) )? this_CLOSE_5= RULE_CLOSE )
            // InternalOmt.g:3784:3: this_OPEN_0= RULE_OPEN otherlv_1= 'DataType' ( ( (otherlv_2= RULE_STRING ) ) | ( (lv_dataType_3_0= RULE_BASE_DATA_TYPE ) ) ) ( (lv_dataTypeNode_4_0= ruleNoteRef ) )? this_CLOSE_5= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_34); 

            			newLeafNode(this_OPEN_0, grammarAccess.getDataTypeAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getDataTypeKeyword_1());
            		
            // InternalOmt.g:3792:3: ( ( (otherlv_2= RULE_STRING ) ) | ( (lv_dataType_3_0= RULE_BASE_DATA_TYPE ) ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_STRING) ) {
                alt91=1;
            }
            else if ( (LA91_0==RULE_BASE_DATA_TYPE) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalOmt.g:3793:4: ( (otherlv_2= RULE_STRING ) )
                    {
                    // InternalOmt.g:3793:4: ( (otherlv_2= RULE_STRING ) )
                    // InternalOmt.g:3794:5: (otherlv_2= RULE_STRING )
                    {
                    // InternalOmt.g:3794:5: (otherlv_2= RULE_STRING )
                    // InternalOmt.g:3795:6: otherlv_2= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

                    						newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getRefTypeTypeReferenceCrossReference_2_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOmt.g:3807:4: ( (lv_dataType_3_0= RULE_BASE_DATA_TYPE ) )
                    {
                    // InternalOmt.g:3807:4: ( (lv_dataType_3_0= RULE_BASE_DATA_TYPE ) )
                    // InternalOmt.g:3808:5: (lv_dataType_3_0= RULE_BASE_DATA_TYPE )
                    {
                    // InternalOmt.g:3808:5: (lv_dataType_3_0= RULE_BASE_DATA_TYPE )
                    // InternalOmt.g:3809:6: lv_dataType_3_0= RULE_BASE_DATA_TYPE
                    {
                    lv_dataType_3_0=(Token)match(input,RULE_BASE_DATA_TYPE,FollowSets000.FOLLOW_30); 

                    						newLeafNode(lv_dataType_3_0, grammarAccess.getDataTypeAccess().getDataTypeBASE_DATA_TYPETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dataType",
                    							lv_dataType_3_0,
                    							"com.cohesionforce.hla.dsl.Omt.BASE_DATA_TYPE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOmt.g:3826:3: ( (lv_dataTypeNode_4_0= ruleNoteRef ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==108) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalOmt.g:3827:4: (lv_dataTypeNode_4_0= ruleNoteRef )
                    {
                    // InternalOmt.g:3827:4: (lv_dataTypeNode_4_0= ruleNoteRef )
                    // InternalOmt.g:3828:5: lv_dataTypeNode_4_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getDataTypeAccess().getDataTypeNodeNoteRefParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_dataTypeNode_4_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    					}
                    					set(
                    						current,
                    						"dataTypeNode",
                    						lv_dataTypeNode_4_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_5=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_5, grammarAccess.getDataTypeAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleFieldName"
    // InternalOmt.g:3853:1: entryRuleFieldName returns [EObject current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final EObject entryRuleFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldName = null;


        try {
            // InternalOmt.g:3853:50: (iv_ruleFieldName= ruleFieldName EOF )
            // InternalOmt.g:3854:2: iv_ruleFieldName= ruleFieldName EOF
            {
             newCompositeNode(grammarAccess.getFieldNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFieldName=ruleFieldName();

            state._fsp--;

             current =iv_ruleFieldName; 
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
    // $ANTLR end "entryRuleFieldName"


    // $ANTLR start "ruleFieldName"
    // InternalOmt.g:3860:1: ruleFieldName returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'FieldName' ( (lv_name_2_0= ruleAnyString ) ) ( (lv_fieldNameNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleFieldName() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_fieldNameNote_3_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:3866:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'FieldName' ( (lv_name_2_0= ruleAnyString ) ) ( (lv_fieldNameNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) )
            // InternalOmt.g:3867:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'FieldName' ( (lv_name_2_0= ruleAnyString ) ) ( (lv_fieldNameNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            {
            // InternalOmt.g:3867:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'FieldName' ( (lv_name_2_0= ruleAnyString ) ) ( (lv_fieldNameNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            // InternalOmt.g:3868:3: this_OPEN_0= RULE_OPEN otherlv_1= 'FieldName' ( (lv_name_2_0= ruleAnyString ) ) ( (lv_fieldNameNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_79); 

            			newLeafNode(this_OPEN_0, grammarAccess.getFieldNameAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,94,FollowSets000.FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldNameAccess().getFieldNameKeyword_1());
            		
            // InternalOmt.g:3876:3: ( (lv_name_2_0= ruleAnyString ) )
            // InternalOmt.g:3877:4: (lv_name_2_0= ruleAnyString )
            {
            // InternalOmt.g:3877:4: (lv_name_2_0= ruleAnyString )
            // InternalOmt.g:3878:5: lv_name_2_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getFieldNameAccess().getNameAnyStringParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_30);
            lv_name_2_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.cohesionforce.hla.dsl.Omt.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOmt.g:3895:3: ( (lv_fieldNameNote_3_0= ruleNoteRef ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==108) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalOmt.g:3896:4: (lv_fieldNameNote_3_0= ruleNoteRef )
                    {
                    // InternalOmt.g:3896:4: (lv_fieldNameNote_3_0= ruleNoteRef )
                    // InternalOmt.g:3897:5: lv_fieldNameNote_3_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getFieldNameAccess().getFieldNameNoteNoteRefParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_fieldNameNote_3_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldNameRule());
                    					}
                    					set(
                    						current,
                    						"fieldNameNote",
                    						lv_fieldNameNote_3_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getFieldNameAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleFieldName"


    // $ANTLR start "entryRuleUnits"
    // InternalOmt.g:3922:1: entryRuleUnits returns [EObject current=null] : iv_ruleUnits= ruleUnits EOF ;
    public final EObject entryRuleUnits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnits = null;


        try {
            // InternalOmt.g:3922:46: (iv_ruleUnits= ruleUnits EOF )
            // InternalOmt.g:3923:2: iv_ruleUnits= ruleUnits EOF
            {
             newCompositeNode(grammarAccess.getUnitsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnits=ruleUnits();

            state._fsp--;

             current =iv_ruleUnits; 
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
    // $ANTLR end "entryRuleUnits"


    // $ANTLR start "ruleUnits"
    // InternalOmt.g:3929:1: ruleUnits returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Units' ( (lv_units_2_0= ruleAnyString ) ) ( (lv_unitsNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleUnits() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_units_2_0 = null;

        EObject lv_unitsNote_3_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:3935:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Units' ( (lv_units_2_0= ruleAnyString ) ) ( (lv_unitsNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) )
            // InternalOmt.g:3936:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Units' ( (lv_units_2_0= ruleAnyString ) ) ( (lv_unitsNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            {
            // InternalOmt.g:3936:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Units' ( (lv_units_2_0= ruleAnyString ) ) ( (lv_unitsNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            // InternalOmt.g:3937:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Units' ( (lv_units_2_0= ruleAnyString ) ) ( (lv_unitsNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_29); 

            			newLeafNode(this_OPEN_0, grammarAccess.getUnitsAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitsAccess().getUnitsKeyword_1());
            		
            // InternalOmt.g:3945:3: ( (lv_units_2_0= ruleAnyString ) )
            // InternalOmt.g:3946:4: (lv_units_2_0= ruleAnyString )
            {
            // InternalOmt.g:3946:4: (lv_units_2_0= ruleAnyString )
            // InternalOmt.g:3947:5: lv_units_2_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getUnitsAccess().getUnitsAnyStringParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_30);
            lv_units_2_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnitsRule());
            					}
            					set(
            						current,
            						"units",
            						lv_units_2_0,
            						"com.cohesionforce.hla.dsl.Omt.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOmt.g:3964:3: ( (lv_unitsNote_3_0= ruleNoteRef ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==108) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalOmt.g:3965:4: (lv_unitsNote_3_0= ruleNoteRef )
                    {
                    // InternalOmt.g:3965:4: (lv_unitsNote_3_0= ruleNoteRef )
                    // InternalOmt.g:3966:5: lv_unitsNote_3_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getUnitsAccess().getUnitsNoteNoteRefParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_unitsNote_3_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnitsRule());
                    					}
                    					set(
                    						current,
                    						"unitsNote",
                    						lv_unitsNote_3_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getUnitsAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleUnits"


    // $ANTLR start "entryRuleCardinality"
    // InternalOmt.g:3991:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalOmt.g:3991:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalOmt.g:3992:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalOmt.g:3998:1: ruleCardinality returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Cardinality' ( (lv_cardinality_2_0= RULE_STRING ) ) ( (lv_cardinalityNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        Token this_CLOSE_4=null;
        EObject lv_cardinalityNote_3_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:4004:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Cardinality' ( (lv_cardinality_2_0= RULE_STRING ) ) ( (lv_cardinalityNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE ) )
            // InternalOmt.g:4005:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Cardinality' ( (lv_cardinality_2_0= RULE_STRING ) ) ( (lv_cardinalityNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            {
            // InternalOmt.g:4005:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Cardinality' ( (lv_cardinality_2_0= RULE_STRING ) ) ( (lv_cardinalityNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE )
            // InternalOmt.g:4006:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Cardinality' ( (lv_cardinality_2_0= RULE_STRING ) ) ( (lv_cardinalityNote_3_0= ruleNoteRef ) )? this_CLOSE_4= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_80); 

            			newLeafNode(this_OPEN_0, grammarAccess.getCardinalityAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,95,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getCardinalityKeyword_1());
            		
            // InternalOmt.g:4014:3: ( (lv_cardinality_2_0= RULE_STRING ) )
            // InternalOmt.g:4015:4: (lv_cardinality_2_0= RULE_STRING )
            {
            // InternalOmt.g:4015:4: (lv_cardinality_2_0= RULE_STRING )
            // InternalOmt.g:4016:5: lv_cardinality_2_0= RULE_STRING
            {
            lv_cardinality_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_cardinality_2_0, grammarAccess.getCardinalityAccess().getCardinalitySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_2_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:4032:3: ( (lv_cardinalityNote_3_0= ruleNoteRef ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==108) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalOmt.g:4033:4: (lv_cardinalityNote_3_0= ruleNoteRef )
                    {
                    // InternalOmt.g:4033:4: (lv_cardinalityNote_3_0= ruleNoteRef )
                    // InternalOmt.g:4034:5: lv_cardinalityNote_3_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getCardinalityAccess().getCardinalityNoteNoteRefParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_cardinalityNote_3_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCardinalityRule());
                    					}
                    					set(
                    						current,
                    						"cardinalityNote",
                    						lv_cardinalityNote_3_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_4=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_4, grammarAccess.getCardinalityAccess().getCLOSETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleInteraction"
    // InternalOmt.g:4059:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalOmt.g:4059:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalOmt.g:4060:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalOmt.g:4066:1: ruleInteraction returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Interaction' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_nameNote_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE this_OPEN_11= RULE_OPEN otherlv_12= 'ISRType' ( (lv_type_13_0= ruleISRType ) ) ( (lv_typeNote_14_0= ruleNoteRef ) )? this_CLOSE_15= RULE_CLOSE (this_OPEN_16= RULE_OPEN otherlv_17= 'MOMInteraction' ( ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) ) ) this_CLOSE_19= RULE_CLOSE )? ( (lv_description_20_0= ruleDescription ) ) (this_OPEN_21= RULE_OPEN otherlv_22= 'RoutingSpace' ( (otherlv_23= RULE_STRING ) ) this_CLOSE_24= RULE_CLOSE )? ( (lv_components_25_0= ruleInteractionComponent ) )* this_CLOSE_26= RULE_CLOSE ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token this_CLOSE_5=null;
        Token this_OPEN_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token this_CLOSE_10=null;
        Token this_OPEN_11=null;
        Token otherlv_12=null;
        Token this_CLOSE_15=null;
        Token this_OPEN_16=null;
        Token otherlv_17=null;
        Token lv_isMOMInteraction_18_1=null;
        Token lv_isMOMInteraction_18_2=null;
        Token this_CLOSE_19=null;
        Token this_OPEN_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token this_CLOSE_24=null;
        Token this_CLOSE_26=null;
        EObject lv_nameNote_9_0 = null;

        AntlrDatatypeRuleToken lv_type_13_0 = null;

        EObject lv_typeNote_14_0 = null;

        EObject lv_description_20_0 = null;

        EObject lv_components_25_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:4072:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Interaction' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_nameNote_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE this_OPEN_11= RULE_OPEN otherlv_12= 'ISRType' ( (lv_type_13_0= ruleISRType ) ) ( (lv_typeNote_14_0= ruleNoteRef ) )? this_CLOSE_15= RULE_CLOSE (this_OPEN_16= RULE_OPEN otherlv_17= 'MOMInteraction' ( ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) ) ) this_CLOSE_19= RULE_CLOSE )? ( (lv_description_20_0= ruleDescription ) ) (this_OPEN_21= RULE_OPEN otherlv_22= 'RoutingSpace' ( (otherlv_23= RULE_STRING ) ) this_CLOSE_24= RULE_CLOSE )? ( (lv_components_25_0= ruleInteractionComponent ) )* this_CLOSE_26= RULE_CLOSE ) )
            // InternalOmt.g:4073:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Interaction' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_nameNote_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE this_OPEN_11= RULE_OPEN otherlv_12= 'ISRType' ( (lv_type_13_0= ruleISRType ) ) ( (lv_typeNote_14_0= ruleNoteRef ) )? this_CLOSE_15= RULE_CLOSE (this_OPEN_16= RULE_OPEN otherlv_17= 'MOMInteraction' ( ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) ) ) this_CLOSE_19= RULE_CLOSE )? ( (lv_description_20_0= ruleDescription ) ) (this_OPEN_21= RULE_OPEN otherlv_22= 'RoutingSpace' ( (otherlv_23= RULE_STRING ) ) this_CLOSE_24= RULE_CLOSE )? ( (lv_components_25_0= ruleInteractionComponent ) )* this_CLOSE_26= RULE_CLOSE )
            {
            // InternalOmt.g:4073:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Interaction' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_nameNote_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE this_OPEN_11= RULE_OPEN otherlv_12= 'ISRType' ( (lv_type_13_0= ruleISRType ) ) ( (lv_typeNote_14_0= ruleNoteRef ) )? this_CLOSE_15= RULE_CLOSE (this_OPEN_16= RULE_OPEN otherlv_17= 'MOMInteraction' ( ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) ) ) this_CLOSE_19= RULE_CLOSE )? ( (lv_description_20_0= ruleDescription ) ) (this_OPEN_21= RULE_OPEN otherlv_22= 'RoutingSpace' ( (otherlv_23= RULE_STRING ) ) this_CLOSE_24= RULE_CLOSE )? ( (lv_components_25_0= ruleInteractionComponent ) )* this_CLOSE_26= RULE_CLOSE )
            // InternalOmt.g:4074:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Interaction' this_OPEN_2= RULE_OPEN otherlv_3= 'ID' ( (lv_id_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'Name' ( (lv_name_8_0= RULE_STRING ) ) ( (lv_nameNote_9_0= ruleNoteRef ) )? this_CLOSE_10= RULE_CLOSE this_OPEN_11= RULE_OPEN otherlv_12= 'ISRType' ( (lv_type_13_0= ruleISRType ) ) ( (lv_typeNote_14_0= ruleNoteRef ) )? this_CLOSE_15= RULE_CLOSE (this_OPEN_16= RULE_OPEN otherlv_17= 'MOMInteraction' ( ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) ) ) this_CLOSE_19= RULE_CLOSE )? ( (lv_description_20_0= ruleDescription ) ) (this_OPEN_21= RULE_OPEN otherlv_22= 'RoutingSpace' ( (otherlv_23= RULE_STRING ) ) this_CLOSE_24= RULE_CLOSE )? ( (lv_components_25_0= ruleInteractionComponent ) )* this_CLOSE_26= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_81); 

            			newLeafNode(this_OPEN_0, grammarAccess.getInteractionAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,96,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getInteractionKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_52); 

            			newLeafNode(this_OPEN_2, grammarAccess.getInteractionAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getIDKeyword_3());
            		
            // InternalOmt.g:4090:3: ( (lv_id_4_0= RULE_INT ) )
            // InternalOmt.g:4091:4: (lv_id_4_0= RULE_INT )
            {
            // InternalOmt.g:4091:4: (lv_id_4_0= RULE_INT )
            // InternalOmt.g:4092:5: lv_id_4_0= RULE_INT
            {
            lv_id_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_id_4_0, grammarAccess.getInteractionAccess().getIdINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"com.cohesionforce.hla.dsl.Omt.INT");
            				

            }


            }

            this_CLOSE_5=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_5, grammarAccess.getInteractionAccess().getCLOSETerminalRuleCall_5());
            		
            this_OPEN_6=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_10); 

            			newLeafNode(this_OPEN_6, grammarAccess.getInteractionAccess().getOPENTerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getInteractionAccess().getNameKeyword_7());
            		
            // InternalOmt.g:4120:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalOmt.g:4121:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalOmt.g:4121:4: (lv_name_8_0= RULE_STRING )
            // InternalOmt.g:4122:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_name_8_0, grammarAccess.getInteractionAccess().getNameSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_8_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:4138:3: ( (lv_nameNote_9_0= ruleNoteRef ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==108) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalOmt.g:4139:4: (lv_nameNote_9_0= ruleNoteRef )
                    {
                    // InternalOmt.g:4139:4: (lv_nameNote_9_0= ruleNoteRef )
                    // InternalOmt.g:4140:5: lv_nameNote_9_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getInteractionAccess().getNameNoteNoteRefParserRuleCall_9_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_nameNote_9_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInteractionRule());
                    					}
                    					set(
                    						current,
                    						"nameNote",
                    						lv_nameNote_9_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_10=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_10, grammarAccess.getInteractionAccess().getCLOSETerminalRuleCall_10());
            		
            this_OPEN_11=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_82); 

            			newLeafNode(this_OPEN_11, grammarAccess.getInteractionAccess().getOPENTerminalRuleCall_11());
            		
            otherlv_12=(Token)match(input,97,FollowSets000.FOLLOW_83); 

            			newLeafNode(otherlv_12, grammarAccess.getInteractionAccess().getISRTypeKeyword_12());
            		
            // InternalOmt.g:4169:3: ( (lv_type_13_0= ruleISRType ) )
            // InternalOmt.g:4170:4: (lv_type_13_0= ruleISRType )
            {
            // InternalOmt.g:4170:4: (lv_type_13_0= ruleISRType )
            // InternalOmt.g:4171:5: lv_type_13_0= ruleISRType
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getTypeISRTypeParserRuleCall_13_0());
            				
            pushFollow(FollowSets000.FOLLOW_30);
            lv_type_13_0=ruleISRType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_13_0,
            						"com.cohesionforce.hla.dsl.Omt.ISRType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOmt.g:4188:3: ( (lv_typeNote_14_0= ruleNoteRef ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==108) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalOmt.g:4189:4: (lv_typeNote_14_0= ruleNoteRef )
                    {
                    // InternalOmt.g:4189:4: (lv_typeNote_14_0= ruleNoteRef )
                    // InternalOmt.g:4190:5: lv_typeNote_14_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getInteractionAccess().getTypeNoteNoteRefParserRuleCall_14_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_typeNote_14_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInteractionRule());
                    					}
                    					set(
                    						current,
                    						"typeNote",
                    						lv_typeNote_14_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_15=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_15, grammarAccess.getInteractionAccess().getCLOSETerminalRuleCall_15());
            		
            // InternalOmt.g:4211:3: (this_OPEN_16= RULE_OPEN otherlv_17= 'MOMInteraction' ( ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) ) ) this_CLOSE_19= RULE_CLOSE )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_OPEN) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==98) ) {
                    alt99=1;
                }
            }
            switch (alt99) {
                case 1 :
                    // InternalOmt.g:4212:4: this_OPEN_16= RULE_OPEN otherlv_17= 'MOMInteraction' ( ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) ) ) this_CLOSE_19= RULE_CLOSE
                    {
                    this_OPEN_16=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_84); 

                    				newLeafNode(this_OPEN_16, grammarAccess.getInteractionAccess().getOPENTerminalRuleCall_16_0());
                    			
                    otherlv_17=(Token)match(input,98,FollowSets000.FOLLOW_55); 

                    				newLeafNode(otherlv_17, grammarAccess.getInteractionAccess().getMOMInteractionKeyword_16_1());
                    			
                    // InternalOmt.g:4220:4: ( ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) ) )
                    // InternalOmt.g:4221:5: ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) )
                    {
                    // InternalOmt.g:4221:5: ( (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' ) )
                    // InternalOmt.g:4222:6: (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' )
                    {
                    // InternalOmt.g:4222:6: (lv_isMOMInteraction_18_1= 'TRUE' | lv_isMOMInteraction_18_2= 'FALSE' )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==61) ) {
                        alt98=1;
                    }
                    else if ( (LA98_0==62) ) {
                        alt98=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalOmt.g:4223:7: lv_isMOMInteraction_18_1= 'TRUE'
                            {
                            lv_isMOMInteraction_18_1=(Token)match(input,61,FollowSets000.FOLLOW_7); 

                            							newLeafNode(lv_isMOMInteraction_18_1, grammarAccess.getInteractionAccess().getIsMOMInteractionTRUEKeyword_16_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getInteractionRule());
                            							}
                            							setWithLastConsumed(current, "isMOMInteraction", lv_isMOMInteraction_18_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalOmt.g:4234:7: lv_isMOMInteraction_18_2= 'FALSE'
                            {
                            lv_isMOMInteraction_18_2=(Token)match(input,62,FollowSets000.FOLLOW_7); 

                            							newLeafNode(lv_isMOMInteraction_18_2, grammarAccess.getInteractionAccess().getIsMOMInteractionFALSEKeyword_16_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getInteractionRule());
                            							}
                            							setWithLastConsumed(current, "isMOMInteraction", lv_isMOMInteraction_18_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    this_CLOSE_19=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

                    				newLeafNode(this_CLOSE_19, grammarAccess.getInteractionAccess().getCLOSETerminalRuleCall_16_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:4252:3: ( (lv_description_20_0= ruleDescription ) )
            // InternalOmt.g:4253:4: (lv_description_20_0= ruleDescription )
            {
            // InternalOmt.g:4253:4: (lv_description_20_0= ruleDescription )
            // InternalOmt.g:4254:5: lv_description_20_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getDescriptionDescriptionParserRuleCall_17_0());
            				
            pushFollow(FollowSets000.FOLLOW_13);
            lv_description_20_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					add(
            						current,
            						"description",
            						lv_description_20_0,
            						"com.cohesionforce.hla.dsl.Omt.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOmt.g:4271:3: (this_OPEN_21= RULE_OPEN otherlv_22= 'RoutingSpace' ( (otherlv_23= RULE_STRING ) ) this_CLOSE_24= RULE_CLOSE )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_OPEN) ) {
                int LA100_1 = input.LA(2);

                if ( (LA100_1==45) ) {
                    alt100=1;
                }
            }
            switch (alt100) {
                case 1 :
                    // InternalOmt.g:4272:4: this_OPEN_21= RULE_OPEN otherlv_22= 'RoutingSpace' ( (otherlv_23= RULE_STRING ) ) this_CLOSE_24= RULE_CLOSE
                    {
                    this_OPEN_21=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_38); 

                    				newLeafNode(this_OPEN_21, grammarAccess.getInteractionAccess().getOPENTerminalRuleCall_18_0());
                    			
                    otherlv_22=(Token)match(input,45,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_22, grammarAccess.getInteractionAccess().getRoutingSpaceKeyword_18_1());
                    			
                    // InternalOmt.g:4280:4: ( (otherlv_23= RULE_STRING ) )
                    // InternalOmt.g:4281:5: (otherlv_23= RULE_STRING )
                    {
                    // InternalOmt.g:4281:5: (otherlv_23= RULE_STRING )
                    // InternalOmt.g:4282:6: otherlv_23= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInteractionRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(otherlv_23, grammarAccess.getInteractionAccess().getRoutingSpaceRoutingSpaceCrossReference_18_2_0());
                    					

                    }


                    }

                    this_CLOSE_24=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

                    				newLeafNode(this_CLOSE_24, grammarAccess.getInteractionAccess().getCLOSETerminalRuleCall_18_3());
                    			

                    }
                    break;

            }

            // InternalOmt.g:4298:3: ( (lv_components_25_0= ruleInteractionComponent ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==RULE_OPEN) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalOmt.g:4299:4: (lv_components_25_0= ruleInteractionComponent )
            	    {
            	    // InternalOmt.g:4299:4: (lv_components_25_0= ruleInteractionComponent )
            	    // InternalOmt.g:4300:5: lv_components_25_0= ruleInteractionComponent
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getComponentsInteractionComponentParserRuleCall_19_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_components_25_0=ruleInteractionComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_25_0,
            	    						"com.cohesionforce.hla.dsl.Omt.InteractionComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            this_CLOSE_26=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_26, grammarAccess.getInteractionAccess().getCLOSETerminalRuleCall_20());
            		

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleISRType"
    // InternalOmt.g:4325:1: entryRuleISRType returns [String current=null] : iv_ruleISRType= ruleISRType EOF ;
    public final String entryRuleISRType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleISRType = null;


        try {
            // InternalOmt.g:4325:47: (iv_ruleISRType= ruleISRType EOF )
            // InternalOmt.g:4326:2: iv_ruleISRType= ruleISRType EOF
            {
             newCompositeNode(grammarAccess.getISRTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleISRType=ruleISRType();

            state._fsp--;

             current =iv_ruleISRType.getText(); 
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
    // $ANTLR end "entryRuleISRType"


    // $ANTLR start "ruleISRType"
    // InternalOmt.g:4332:1: ruleISRType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'I' | kw= 'S' | kw= 'R' | kw= 'IS' | kw= 'IR' | kw= 'N' ) ;
    public final AntlrDatatypeRuleToken ruleISRType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOmt.g:4338:2: ( (kw= 'I' | kw= 'S' | kw= 'R' | kw= 'IS' | kw= 'IR' | kw= 'N' ) )
            // InternalOmt.g:4339:2: (kw= 'I' | kw= 'S' | kw= 'R' | kw= 'IS' | kw= 'IR' | kw= 'N' )
            {
            // InternalOmt.g:4339:2: (kw= 'I' | kw= 'S' | kw= 'R' | kw= 'IS' | kw= 'IR' | kw= 'N' )
            int alt102=6;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt102=1;
                }
                break;
            case 64:
                {
                alt102=2;
                }
                break;
            case 80:
                {
                alt102=3;
                }
                break;
            case 100:
                {
                alt102=4;
                }
                break;
            case 101:
                {
                alt102=5;
                }
                break;
            case 66:
                {
                alt102=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalOmt.g:4340:3: kw= 'I'
                    {
                    kw=(Token)match(input,99,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getISRTypeAccess().getIKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:4346:3: kw= 'S'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getISRTypeAccess().getSKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOmt.g:4352:3: kw= 'R'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getISRTypeAccess().getRKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOmt.g:4358:3: kw= 'IS'
                    {
                    kw=(Token)match(input,100,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getISRTypeAccess().getISKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOmt.g:4364:3: kw= 'IR'
                    {
                    kw=(Token)match(input,101,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getISRTypeAccess().getIRKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOmt.g:4370:3: kw= 'N'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getISRTypeAccess().getNKeyword_5());
                    		

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
    // $ANTLR end "ruleISRType"


    // $ANTLR start "entryRuleInteractionComponent"
    // InternalOmt.g:4379:1: entryRuleInteractionComponent returns [EObject current=null] : iv_ruleInteractionComponent= ruleInteractionComponent EOF ;
    public final EObject entryRuleInteractionComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionComponent = null;


        try {
            // InternalOmt.g:4379:61: (iv_ruleInteractionComponent= ruleInteractionComponent EOF )
            // InternalOmt.g:4380:2: iv_ruleInteractionComponent= ruleInteractionComponent EOF
            {
             newCompositeNode(grammarAccess.getInteractionComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteractionComponent=ruleInteractionComponent();

            state._fsp--;

             current =iv_ruleInteractionComponent; 
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
    // $ANTLR end "entryRuleInteractionComponent"


    // $ANTLR start "ruleInteractionComponent"
    // InternalOmt.g:4386:1: ruleInteractionComponent returns [EObject current=null] : (this_Parameter_0= ruleParameter | this_SuperInteraction_1= ruleSuperInteraction ) ;
    public final EObject ruleInteractionComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_0 = null;

        EObject this_SuperInteraction_1 = null;



        	enterRule();

        try {
            // InternalOmt.g:4392:2: ( (this_Parameter_0= ruleParameter | this_SuperInteraction_1= ruleSuperInteraction ) )
            // InternalOmt.g:4393:2: (this_Parameter_0= ruleParameter | this_SuperInteraction_1= ruleSuperInteraction )
            {
            // InternalOmt.g:4393:2: (this_Parameter_0= ruleParameter | this_SuperInteraction_1= ruleSuperInteraction )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_OPEN) ) {
                int LA103_1 = input.LA(2);

                if ( (LA103_1==102) ) {
                    alt103=2;
                }
                else if ( (LA103_1==103) ) {
                    alt103=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalOmt.g:4394:3: this_Parameter_0= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getInteractionComponentAccess().getParameterParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Parameter_0=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:4403:3: this_SuperInteraction_1= ruleSuperInteraction
                    {

                    			newCompositeNode(grammarAccess.getInteractionComponentAccess().getSuperInteractionParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SuperInteraction_1=ruleSuperInteraction();

                    state._fsp--;


                    			current = this_SuperInteraction_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleInteractionComponent"


    // $ANTLR start "entryRuleSuperInteraction"
    // InternalOmt.g:4415:1: entryRuleSuperInteraction returns [EObject current=null] : iv_ruleSuperInteraction= ruleSuperInteraction EOF ;
    public final EObject entryRuleSuperInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperInteraction = null;


        try {
            // InternalOmt.g:4415:57: (iv_ruleSuperInteraction= ruleSuperInteraction EOF )
            // InternalOmt.g:4416:2: iv_ruleSuperInteraction= ruleSuperInteraction EOF
            {
             newCompositeNode(grammarAccess.getSuperInteractionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSuperInteraction=ruleSuperInteraction();

            state._fsp--;

             current =iv_ruleSuperInteraction; 
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
    // $ANTLR end "entryRuleSuperInteraction"


    // $ANTLR start "ruleSuperInteraction"
    // InternalOmt.g:4422:1: ruleSuperInteraction returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'SuperInteraction' ( (lv_ID_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleSuperInteraction() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_ID_2_0=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalOmt.g:4428:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'SuperInteraction' ( (lv_ID_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE ) )
            // InternalOmt.g:4429:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'SuperInteraction' ( (lv_ID_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE )
            {
            // InternalOmt.g:4429:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'SuperInteraction' ( (lv_ID_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE )
            // InternalOmt.g:4430:3: this_OPEN_0= RULE_OPEN otherlv_1= 'SuperInteraction' ( (lv_ID_2_0= RULE_INT ) ) this_CLOSE_3= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_85); 

            			newLeafNode(this_OPEN_0, grammarAccess.getSuperInteractionAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,102,FollowSets000.FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getSuperInteractionAccess().getSuperInteractionKeyword_1());
            		
            // InternalOmt.g:4438:3: ( (lv_ID_2_0= RULE_INT ) )
            // InternalOmt.g:4439:4: (lv_ID_2_0= RULE_INT )
            {
            // InternalOmt.g:4439:4: (lv_ID_2_0= RULE_INT )
            // InternalOmt.g:4440:5: lv_ID_2_0= RULE_INT
            {
            lv_ID_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_ID_2_0, grammarAccess.getSuperInteractionAccess().getIDINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ID",
            						lv_ID_2_0,
            						"com.cohesionforce.hla.dsl.Omt.INT");
            				

            }


            }

            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getSuperInteractionAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleSuperInteraction"


    // $ANTLR start "entryRuleParameter"
    // InternalOmt.g:4464:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalOmt.g:4464:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalOmt.g:4465:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalOmt.g:4471:1: ruleParameter returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Parameter' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? ( (lv_description_13_0= ruleDescription ) )? this_CLOSE_14= RULE_CLOSE ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token this_CLOSE_6=null;
        Token this_CLOSE_14=null;
        EObject lv_nameNote_5_0 = null;

        EObject lv_dataType_7_0 = null;

        EObject lv_cardinality_8_0 = null;

        EObject lv_units_9_0 = null;

        EObject lv_resolution_10_0 = null;

        EObject lv_accuracy_11_0 = null;

        EObject lv_accuracyCondition_12_0 = null;

        EObject lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalOmt.g:4477:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Parameter' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? ( (lv_description_13_0= ruleDescription ) )? this_CLOSE_14= RULE_CLOSE ) )
            // InternalOmt.g:4478:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Parameter' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? ( (lv_description_13_0= ruleDescription ) )? this_CLOSE_14= RULE_CLOSE )
            {
            // InternalOmt.g:4478:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Parameter' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? ( (lv_description_13_0= ruleDescription ) )? this_CLOSE_14= RULE_CLOSE )
            // InternalOmt.g:4479:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Parameter' this_OPEN_2= RULE_OPEN otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) ( (lv_nameNote_5_0= ruleNoteRef ) )? this_CLOSE_6= RULE_CLOSE ( (lv_dataType_7_0= ruleDataType ) )? ( (lv_cardinality_8_0= ruleCardinality ) )? ( (lv_units_9_0= ruleUnits ) )? ( (lv_resolution_10_0= ruleResolution ) )? ( (lv_accuracy_11_0= ruleAccuracy ) )? ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )? ( (lv_description_13_0= ruleDescription ) )? this_CLOSE_14= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_86); 

            			newLeafNode(this_OPEN_0, grammarAccess.getParameterAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,103,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_10); 

            			newLeafNode(this_OPEN_2, grammarAccess.getParameterAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getNameKeyword_3());
            		
            // InternalOmt.g:4495:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalOmt.g:4496:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalOmt.g:4496:4: (lv_name_4_0= RULE_STRING )
            // InternalOmt.g:4497:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); 

            					newLeafNode(lv_name_4_0, grammarAccess.getParameterAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            // InternalOmt.g:4513:3: ( (lv_nameNote_5_0= ruleNoteRef ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==108) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalOmt.g:4514:4: (lv_nameNote_5_0= ruleNoteRef )
                    {
                    // InternalOmt.g:4514:4: (lv_nameNote_5_0= ruleNoteRef )
                    // InternalOmt.g:4515:5: lv_nameNote_5_0= ruleNoteRef
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getNameNoteNoteRefParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_nameNote_5_0=ruleNoteRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"nameNote",
                    						lv_nameNote_5_0,
                    						"com.cohesionforce.hla.dsl.Omt.NoteRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_6=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_13); 

            			newLeafNode(this_CLOSE_6, grammarAccess.getParameterAccess().getCLOSETerminalRuleCall_6());
            		
            // InternalOmt.g:4536:3: ( (lv_dataType_7_0= ruleDataType ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_OPEN) ) {
                int LA105_1 = input.LA(2);

                if ( (LA105_1==38) ) {
                    alt105=1;
                }
            }
            switch (alt105) {
                case 1 :
                    // InternalOmt.g:4537:4: (lv_dataType_7_0= ruleDataType )
                    {
                    // InternalOmt.g:4537:4: (lv_dataType_7_0= ruleDataType )
                    // InternalOmt.g:4538:5: lv_dataType_7_0= ruleDataType
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getDataTypeDataTypeParserRuleCall_7_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_dataType_7_0=ruleDataType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"dataType",
                    						lv_dataType_7_0,
                    						"com.cohesionforce.hla.dsl.Omt.DataType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:4555:3: ( (lv_cardinality_8_0= ruleCardinality ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_OPEN) ) {
                int LA106_1 = input.LA(2);

                if ( (LA106_1==95) ) {
                    alt106=1;
                }
            }
            switch (alt106) {
                case 1 :
                    // InternalOmt.g:4556:4: (lv_cardinality_8_0= ruleCardinality )
                    {
                    // InternalOmt.g:4556:4: (lv_cardinality_8_0= ruleCardinality )
                    // InternalOmt.g:4557:5: lv_cardinality_8_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getCardinalityCardinalityParserRuleCall_8_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_cardinality_8_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_8_0,
                    						"com.cohesionforce.hla.dsl.Omt.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:4574:3: ( (lv_units_9_0= ruleUnits ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_OPEN) ) {
                int LA107_1 = input.LA(2);

                if ( (LA107_1==34) ) {
                    alt107=1;
                }
            }
            switch (alt107) {
                case 1 :
                    // InternalOmt.g:4575:4: (lv_units_9_0= ruleUnits )
                    {
                    // InternalOmt.g:4575:4: (lv_units_9_0= ruleUnits )
                    // InternalOmt.g:4576:5: lv_units_9_0= ruleUnits
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getUnitsUnitsParserRuleCall_9_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_units_9_0=ruleUnits();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"units",
                    						lv_units_9_0,
                    						"com.cohesionforce.hla.dsl.Omt.Units");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:4593:3: ( (lv_resolution_10_0= ruleResolution ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_OPEN) ) {
                int LA108_1 = input.LA(2);

                if ( (LA108_1==92) ) {
                    alt108=1;
                }
            }
            switch (alt108) {
                case 1 :
                    // InternalOmt.g:4594:4: (lv_resolution_10_0= ruleResolution )
                    {
                    // InternalOmt.g:4594:4: (lv_resolution_10_0= ruleResolution )
                    // InternalOmt.g:4595:5: lv_resolution_10_0= ruleResolution
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getResolutionResolutionParserRuleCall_10_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_resolution_10_0=ruleResolution();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"resolution",
                    						lv_resolution_10_0,
                    						"com.cohesionforce.hla.dsl.Omt.Resolution");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:4612:3: ( (lv_accuracy_11_0= ruleAccuracy ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_OPEN) ) {
                int LA109_1 = input.LA(2);

                if ( (LA109_1==90) ) {
                    alt109=1;
                }
            }
            switch (alt109) {
                case 1 :
                    // InternalOmt.g:4613:4: (lv_accuracy_11_0= ruleAccuracy )
                    {
                    // InternalOmt.g:4613:4: (lv_accuracy_11_0= ruleAccuracy )
                    // InternalOmt.g:4614:5: lv_accuracy_11_0= ruleAccuracy
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getAccuracyAccuracyParserRuleCall_11_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_accuracy_11_0=ruleAccuracy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"accuracy",
                    						lv_accuracy_11_0,
                    						"com.cohesionforce.hla.dsl.Omt.Accuracy");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:4631:3: ( (lv_accuracyCondition_12_0= ruleAccuracyCondition ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_OPEN) ) {
                int LA110_1 = input.LA(2);

                if ( (LA110_1==91) ) {
                    alt110=1;
                }
            }
            switch (alt110) {
                case 1 :
                    // InternalOmt.g:4632:4: (lv_accuracyCondition_12_0= ruleAccuracyCondition )
                    {
                    // InternalOmt.g:4632:4: (lv_accuracyCondition_12_0= ruleAccuracyCondition )
                    // InternalOmt.g:4633:5: lv_accuracyCondition_12_0= ruleAccuracyCondition
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getAccuracyConditionAccuracyConditionParserRuleCall_12_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_accuracyCondition_12_0=ruleAccuracyCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"accuracyCondition",
                    						lv_accuracyCondition_12_0,
                    						"com.cohesionforce.hla.dsl.Omt.AccuracyCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOmt.g:4650:3: ( (lv_description_13_0= ruleDescription ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_OPEN) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalOmt.g:4651:4: (lv_description_13_0= ruleDescription )
                    {
                    // InternalOmt.g:4651:4: (lv_description_13_0= ruleDescription )
                    // InternalOmt.g:4652:5: lv_description_13_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getDescriptionDescriptionParserRuleCall_13_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_description_13_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_13_0,
                    						"com.cohesionforce.hla.dsl.Omt.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_CLOSE_14=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_14, grammarAccess.getParameterAccess().getCLOSETerminalRuleCall_14());
            		

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


    // $ANTLR start "entryRuleDescription"
    // InternalOmt.g:4677:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalOmt.g:4677:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalOmt.g:4678:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalOmt.g:4684:1: ruleDescription returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Description' ( (lv_description_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token this_CLOSE_3=null;


        	enterRule();

        try {
            // InternalOmt.g:4690:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Description' ( (lv_description_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE ) )
            // InternalOmt.g:4691:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Description' ( (lv_description_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE )
            {
            // InternalOmt.g:4691:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Description' ( (lv_description_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE )
            // InternalOmt.g:4692:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Description' ( (lv_description_2_0= RULE_STRING ) ) this_CLOSE_3= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_87); 

            			newLeafNode(this_OPEN_0, grammarAccess.getDescriptionAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,104,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getDescriptionKeyword_1());
            		
            // InternalOmt.g:4700:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalOmt.g:4701:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalOmt.g:4701:4: (lv_description_2_0= RULE_STRING )
            // InternalOmt.g:4702:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_description_2_0, grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            this_CLOSE_3=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_3, grammarAccess.getDescriptionAccess().getCLOSETerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleNote"
    // InternalOmt.g:4726:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalOmt.g:4726:45: (iv_ruleNote= ruleNote EOF )
            // InternalOmt.g:4727:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
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
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalOmt.g:4733:1: ruleNote returns [EObject current=null] : (this_OPEN_0= RULE_OPEN otherlv_1= 'Note' this_OPEN_2= RULE_OPEN otherlv_3= 'NoteNumber' ( (lv_ID_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'NoteText' ( (lv_text_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE this_CLOSE_10= RULE_CLOSE ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token otherlv_1=null;
        Token this_OPEN_2=null;
        Token otherlv_3=null;
        Token lv_ID_4_0=null;
        Token this_CLOSE_5=null;
        Token this_OPEN_6=null;
        Token otherlv_7=null;
        Token lv_text_8_0=null;
        Token this_CLOSE_9=null;
        Token this_CLOSE_10=null;


        	enterRule();

        try {
            // InternalOmt.g:4739:2: ( (this_OPEN_0= RULE_OPEN otherlv_1= 'Note' this_OPEN_2= RULE_OPEN otherlv_3= 'NoteNumber' ( (lv_ID_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'NoteText' ( (lv_text_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE this_CLOSE_10= RULE_CLOSE ) )
            // InternalOmt.g:4740:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Note' this_OPEN_2= RULE_OPEN otherlv_3= 'NoteNumber' ( (lv_ID_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'NoteText' ( (lv_text_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE this_CLOSE_10= RULE_CLOSE )
            {
            // InternalOmt.g:4740:2: (this_OPEN_0= RULE_OPEN otherlv_1= 'Note' this_OPEN_2= RULE_OPEN otherlv_3= 'NoteNumber' ( (lv_ID_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'NoteText' ( (lv_text_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE this_CLOSE_10= RULE_CLOSE )
            // InternalOmt.g:4741:3: this_OPEN_0= RULE_OPEN otherlv_1= 'Note' this_OPEN_2= RULE_OPEN otherlv_3= 'NoteNumber' ( (lv_ID_4_0= RULE_INT ) ) this_CLOSE_5= RULE_CLOSE this_OPEN_6= RULE_OPEN otherlv_7= 'NoteText' ( (lv_text_8_0= RULE_STRING ) ) this_CLOSE_9= RULE_CLOSE this_CLOSE_10= RULE_CLOSE
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_88); 

            			newLeafNode(this_OPEN_0, grammarAccess.getNoteAccess().getOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,105,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNoteAccess().getNoteKeyword_1());
            		
            this_OPEN_2=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_89); 

            			newLeafNode(this_OPEN_2, grammarAccess.getNoteAccess().getOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,106,FollowSets000.FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getNoteAccess().getNoteNumberKeyword_3());
            		
            // InternalOmt.g:4757:3: ( (lv_ID_4_0= RULE_INT ) )
            // InternalOmt.g:4758:4: (lv_ID_4_0= RULE_INT )
            {
            // InternalOmt.g:4758:4: (lv_ID_4_0= RULE_INT )
            // InternalOmt.g:4759:5: lv_ID_4_0= RULE_INT
            {
            lv_ID_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_ID_4_0, grammarAccess.getNoteAccess().getIDINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ID",
            						lv_ID_4_0,
            						"com.cohesionforce.hla.dsl.Omt.INT");
            				

            }


            }

            this_CLOSE_5=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_5); 

            			newLeafNode(this_CLOSE_5, grammarAccess.getNoteAccess().getCLOSETerminalRuleCall_5());
            		
            this_OPEN_6=(Token)match(input,RULE_OPEN,FollowSets000.FOLLOW_90); 

            			newLeafNode(this_OPEN_6, grammarAccess.getNoteAccess().getOPENTerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,107,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getNoteAccess().getNoteTextKeyword_7());
            		
            // InternalOmt.g:4787:3: ( (lv_text_8_0= RULE_STRING ) )
            // InternalOmt.g:4788:4: (lv_text_8_0= RULE_STRING )
            {
            // InternalOmt.g:4788:4: (lv_text_8_0= RULE_STRING )
            // InternalOmt.g:4789:5: lv_text_8_0= RULE_STRING
            {
            lv_text_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_text_8_0, grammarAccess.getNoteAccess().getTextSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_8_0,
            						"com.cohesionforce.hla.dsl.Omt.STRING");
            				

            }


            }

            this_CLOSE_9=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_7); 

            			newLeafNode(this_CLOSE_9, grammarAccess.getNoteAccess().getCLOSETerminalRuleCall_9());
            		
            this_CLOSE_10=(Token)match(input,RULE_CLOSE,FollowSets000.FOLLOW_2); 

            			newLeafNode(this_CLOSE_10, grammarAccess.getNoteAccess().getCLOSETerminalRuleCall_10());
            		

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
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleNoteRef"
    // InternalOmt.g:4817:1: entryRuleNoteRef returns [EObject current=null] : iv_ruleNoteRef= ruleNoteRef EOF ;
    public final EObject entryRuleNoteRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoteRef = null;


        try {
            // InternalOmt.g:4817:48: (iv_ruleNoteRef= ruleNoteRef EOF )
            // InternalOmt.g:4818:2: iv_ruleNoteRef= ruleNoteRef EOF
            {
             newCompositeNode(grammarAccess.getNoteRefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNoteRef=ruleNoteRef();

            state._fsp--;

             current =iv_ruleNoteRef; 
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
    // $ANTLR end "entryRuleNoteRef"


    // $ANTLR start "ruleNoteRef"
    // InternalOmt.g:4824:1: ruleNoteRef returns [EObject current=null] : (otherlv_0= '[' ( (lv_refs_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_refs_3_0= RULE_INT ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleNoteRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_refs_1_0=null;
        Token otherlv_2=null;
        Token lv_refs_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalOmt.g:4830:2: ( (otherlv_0= '[' ( (lv_refs_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_refs_3_0= RULE_INT ) ) )* otherlv_4= ']' ) )
            // InternalOmt.g:4831:2: (otherlv_0= '[' ( (lv_refs_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_refs_3_0= RULE_INT ) ) )* otherlv_4= ']' )
            {
            // InternalOmt.g:4831:2: (otherlv_0= '[' ( (lv_refs_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_refs_3_0= RULE_INT ) ) )* otherlv_4= ']' )
            // InternalOmt.g:4832:3: otherlv_0= '[' ( (lv_refs_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_refs_3_0= RULE_INT ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,108,FollowSets000.FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getNoteRefAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOmt.g:4836:3: ( (lv_refs_1_0= RULE_INT ) )
            // InternalOmt.g:4837:4: (lv_refs_1_0= RULE_INT )
            {
            // InternalOmt.g:4837:4: (lv_refs_1_0= RULE_INT )
            // InternalOmt.g:4838:5: lv_refs_1_0= RULE_INT
            {
            lv_refs_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_91); 

            					newLeafNode(lv_refs_1_0, grammarAccess.getNoteRefAccess().getRefsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoteRefRule());
            					}
            					addWithLastConsumed(
            						current,
            						"refs",
            						lv_refs_1_0,
            						"com.cohesionforce.hla.dsl.Omt.INT");
            				

            }


            }

            // InternalOmt.g:4854:3: (otherlv_2= ',' ( (lv_refs_3_0= RULE_INT ) ) )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==109) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalOmt.g:4855:4: otherlv_2= ',' ( (lv_refs_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,109,FollowSets000.FOLLOW_53); 

            	    				newLeafNode(otherlv_2, grammarAccess.getNoteRefAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOmt.g:4859:4: ( (lv_refs_3_0= RULE_INT ) )
            	    // InternalOmt.g:4860:5: (lv_refs_3_0= RULE_INT )
            	    {
            	    // InternalOmt.g:4860:5: (lv_refs_3_0= RULE_INT )
            	    // InternalOmt.g:4861:6: lv_refs_3_0= RULE_INT
            	    {
            	    lv_refs_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_91); 

            	    						newLeafNode(lv_refs_3_0, grammarAccess.getNoteRefAccess().getRefsINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNoteRefRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"refs",
            	    							lv_refs_3_0,
            	    							"com.cohesionforce.hla.dsl.Omt.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);

            otherlv_4=(Token)match(input,110,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNoteRefAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleNoteRef"


    // $ANTLR start "entryRuleAnyText"
    // InternalOmt.g:4886:1: entryRuleAnyText returns [String current=null] : iv_ruleAnyText= ruleAnyText EOF ;
    public final String entryRuleAnyText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyText = null;


        try {
            // InternalOmt.g:4886:47: (iv_ruleAnyText= ruleAnyText EOF )
            // InternalOmt.g:4887:2: iv_ruleAnyText= ruleAnyText EOF
            {
             newCompositeNode(grammarAccess.getAnyTextRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnyText=ruleAnyText();

            state._fsp--;

             current =iv_ruleAnyText.getText(); 
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
    // $ANTLR end "entryRuleAnyText"


    // $ANTLR start "ruleAnyText"
    // InternalOmt.g:4893:1: ruleAnyText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_TEXT_1= RULE_TEXT ) ;
    public final AntlrDatatypeRuleToken ruleAnyText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_TEXT_1=null;


        	enterRule();

        try {
            // InternalOmt.g:4899:2: ( (this_ID_0= RULE_ID | this_TEXT_1= RULE_TEXT ) )
            // InternalOmt.g:4900:2: (this_ID_0= RULE_ID | this_TEXT_1= RULE_TEXT )
            {
            // InternalOmt.g:4900:2: (this_ID_0= RULE_ID | this_TEXT_1= RULE_TEXT )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_ID) ) {
                alt113=1;
            }
            else if ( (LA113_0==RULE_TEXT) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalOmt.g:4901:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getAnyTextAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:4909:3: this_TEXT_1= RULE_TEXT
                    {
                    this_TEXT_1=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_2); 

                    			current.merge(this_TEXT_1);
                    		

                    			newLeafNode(this_TEXT_1, grammarAccess.getAnyTextAccess().getTEXTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleAnyText"


    // $ANTLR start "entryRuleAnyString"
    // InternalOmt.g:4920:1: entryRuleAnyString returns [String current=null] : iv_ruleAnyString= ruleAnyString EOF ;
    public final String entryRuleAnyString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyString = null;


        try {
            // InternalOmt.g:4920:49: (iv_ruleAnyString= ruleAnyString EOF )
            // InternalOmt.g:4921:2: iv_ruleAnyString= ruleAnyString EOF
            {
             newCompositeNode(grammarAccess.getAnyStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnyString=ruleAnyString();

            state._fsp--;

             current =iv_ruleAnyString.getText(); 
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
    // $ANTLR end "entryRuleAnyString"


    // $ANTLR start "ruleAnyString"
    // InternalOmt.g:4927:1: ruleAnyString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_BASE_DATA_TYPE_1= RULE_BASE_DATA_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleAnyString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BASE_DATA_TYPE_1=null;


        	enterRule();

        try {
            // InternalOmt.g:4933:2: ( (this_STRING_0= RULE_STRING | this_BASE_DATA_TYPE_1= RULE_BASE_DATA_TYPE ) )
            // InternalOmt.g:4934:2: (this_STRING_0= RULE_STRING | this_BASE_DATA_TYPE_1= RULE_BASE_DATA_TYPE )
            {
            // InternalOmt.g:4934:2: (this_STRING_0= RULE_STRING | this_BASE_DATA_TYPE_1= RULE_BASE_DATA_TYPE )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_STRING) ) {
                alt114=1;
            }
            else if ( (LA114_0==RULE_BASE_DATA_TYPE) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalOmt.g:4935:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getAnyStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOmt.g:4943:3: this_BASE_DATA_TYPE_1= RULE_BASE_DATA_TYPE
                    {
                    this_BASE_DATA_TYPE_1=(Token)match(input,RULE_BASE_DATA_TYPE,FollowSets000.FOLLOW_2); 

                    			current.merge(this_BASE_DATA_TYPE_1);
                    		

                    			newLeafNode(this_BASE_DATA_TYPE_1, grammarAccess.getAnyStringAccess().getBASE_DATA_TYPETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleAnyString"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000480L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00001C0000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L,0x0000100000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000140L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0060000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000030L,0x0000100000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x6000000000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007004L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000003800010005L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    }


}