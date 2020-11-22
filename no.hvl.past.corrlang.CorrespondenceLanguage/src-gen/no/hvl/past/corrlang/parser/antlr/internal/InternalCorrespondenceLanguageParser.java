package no.hvl.past.corrlang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.hvl.past.corrlang.services.CorrespondenceLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCorrespondenceLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'correspondence'", "'('", "','", "')'", "'{'", "'}'", "';'", "'.'", "'relate'", "'as'", "'with'", "'constraint'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCorrespondenceLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCorrespondenceLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCorrespondenceLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCorrespondenceLanguage.g"; }



     	private CorrespondenceLanguageGrammarAccess grammarAccess;

        public InternalCorrespondenceLanguageParser(TokenStream input, CorrespondenceLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Correspondence";
       	}

       	@Override
       	protected CorrespondenceLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCorrespondence"
    // InternalCorrespondenceLanguage.g:64:1: entryRuleCorrespondence returns [EObject current=null] : iv_ruleCorrespondence= ruleCorrespondence EOF ;
    public final EObject entryRuleCorrespondence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorrespondence = null;


        try {
            // InternalCorrespondenceLanguage.g:64:55: (iv_ruleCorrespondence= ruleCorrespondence EOF )
            // InternalCorrespondenceLanguage.g:65:2: iv_ruleCorrespondence= ruleCorrespondence EOF
            {
             newCompositeNode(grammarAccess.getCorrespondenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCorrespondence=ruleCorrespondence();

            state._fsp--;

             current =iv_ruleCorrespondence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCorrespondence"


    // $ANTLR start "ruleCorrespondence"
    // InternalCorrespondenceLanguage.g:71:1: ruleCorrespondence returns [EObject current=null] : (otherlv_0= 'correspondence' otherlv_1= '(' ( (lv_modelSpace_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_modelSpace_4_0= ruleMetamodel ) ) )+ otherlv_5= ')' otherlv_6= '{' ( (lv_elements_7_0= ruleCorrElement ) )* otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject ruleCorrespondence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_modelSpace_2_0 = null;

        EObject lv_modelSpace_4_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalCorrespondenceLanguage.g:77:2: ( (otherlv_0= 'correspondence' otherlv_1= '(' ( (lv_modelSpace_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_modelSpace_4_0= ruleMetamodel ) ) )+ otherlv_5= ')' otherlv_6= '{' ( (lv_elements_7_0= ruleCorrElement ) )* otherlv_8= '}' otherlv_9= ';' ) )
            // InternalCorrespondenceLanguage.g:78:2: (otherlv_0= 'correspondence' otherlv_1= '(' ( (lv_modelSpace_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_modelSpace_4_0= ruleMetamodel ) ) )+ otherlv_5= ')' otherlv_6= '{' ( (lv_elements_7_0= ruleCorrElement ) )* otherlv_8= '}' otherlv_9= ';' )
            {
            // InternalCorrespondenceLanguage.g:78:2: (otherlv_0= 'correspondence' otherlv_1= '(' ( (lv_modelSpace_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_modelSpace_4_0= ruleMetamodel ) ) )+ otherlv_5= ')' otherlv_6= '{' ( (lv_elements_7_0= ruleCorrElement ) )* otherlv_8= '}' otherlv_9= ';' )
            // InternalCorrespondenceLanguage.g:79:3: otherlv_0= 'correspondence' otherlv_1= '(' ( (lv_modelSpace_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_modelSpace_4_0= ruleMetamodel ) ) )+ otherlv_5= ')' otherlv_6= '{' ( (lv_elements_7_0= ruleCorrElement ) )* otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCorrespondenceAccess().getCorrespondenceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCorrespondenceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCorrespondenceLanguage.g:87:3: ( (lv_modelSpace_2_0= ruleMetamodel ) )
            // InternalCorrespondenceLanguage.g:88:4: (lv_modelSpace_2_0= ruleMetamodel )
            {
            // InternalCorrespondenceLanguage.g:88:4: (lv_modelSpace_2_0= ruleMetamodel )
            // InternalCorrespondenceLanguage.g:89:5: lv_modelSpace_2_0= ruleMetamodel
            {

            					newCompositeNode(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_modelSpace_2_0=ruleMetamodel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCorrespondenceRule());
            					}
            					add(
            						current,
            						"modelSpace",
            						lv_modelSpace_2_0,
            						"no.hvl.past.corrlang.CorrespondenceLanguage.Metamodel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCorrespondenceLanguage.g:106:3: (otherlv_3= ',' ( (lv_modelSpace_4_0= ruleMetamodel ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:107:4: otherlv_3= ',' ( (lv_modelSpace_4_0= ruleMetamodel ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCorrespondenceAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCorrespondenceLanguage.g:111:4: ( (lv_modelSpace_4_0= ruleMetamodel ) )
            	    // InternalCorrespondenceLanguage.g:112:5: (lv_modelSpace_4_0= ruleMetamodel )
            	    {
            	    // InternalCorrespondenceLanguage.g:112:5: (lv_modelSpace_4_0= ruleMetamodel )
            	    // InternalCorrespondenceLanguage.g:113:6: lv_modelSpace_4_0= ruleMetamodel
            	    {

            	    						newCompositeNode(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_modelSpace_4_0=ruleMetamodel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCorrespondenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modelSpace",
            	    							lv_modelSpace_4_0,
            	    							"no.hvl.past.corrlang.CorrespondenceLanguage.Metamodel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCorrespondenceAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getCorrespondenceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalCorrespondenceLanguage.g:139:3: ( (lv_elements_7_0= ruleCorrElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19||LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:140:4: (lv_elements_7_0= ruleCorrElement )
            	    {
            	    // InternalCorrespondenceLanguage.g:140:4: (lv_elements_7_0= ruleCorrElement )
            	    // InternalCorrespondenceLanguage.g:141:5: lv_elements_7_0= ruleCorrElement
            	    {

            	    					newCompositeNode(grammarAccess.getCorrespondenceAccess().getElementsCorrElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_elements_7_0=ruleCorrElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCorrespondenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_7_0,
            	    						"no.hvl.past.corrlang.CorrespondenceLanguage.CorrElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getCorrespondenceAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCorrespondenceAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleCorrespondence"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCorrespondenceLanguage.g:170:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCorrespondenceLanguage.g:170:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCorrespondenceLanguage.g:171:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCorrespondenceLanguage.g:177:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCorrespondenceLanguage.g:183:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCorrespondenceLanguage.g:184:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCorrespondenceLanguage.g:184:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCorrespondenceLanguage.g:185:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalCorrespondenceLanguage.g:192:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:193:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleCorrElement"
    // InternalCorrespondenceLanguage.g:210:1: entryRuleCorrElement returns [EObject current=null] : iv_ruleCorrElement= ruleCorrElement EOF ;
    public final EObject entryRuleCorrElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorrElement = null;


        try {
            // InternalCorrespondenceLanguage.g:210:52: (iv_ruleCorrElement= ruleCorrElement EOF )
            // InternalCorrespondenceLanguage.g:211:2: iv_ruleCorrElement= ruleCorrElement EOF
            {
             newCompositeNode(grammarAccess.getCorrElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCorrElement=ruleCorrElement();

            state._fsp--;

             current =iv_ruleCorrElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCorrElement"


    // $ANTLR start "ruleCorrElement"
    // InternalCorrespondenceLanguage.g:217:1: ruleCorrElement returns [EObject current=null] : (this_Commonality_0= ruleCommonality | this_Constraint_1= ruleConstraint ) ;
    public final EObject ruleCorrElement() throws RecognitionException {
        EObject current = null;

        EObject this_Commonality_0 = null;

        EObject this_Constraint_1 = null;



        	enterRule();

        try {
            // InternalCorrespondenceLanguage.g:223:2: ( (this_Commonality_0= ruleCommonality | this_Constraint_1= ruleConstraint ) )
            // InternalCorrespondenceLanguage.g:224:2: (this_Commonality_0= ruleCommonality | this_Constraint_1= ruleConstraint )
            {
            // InternalCorrespondenceLanguage.g:224:2: (this_Commonality_0= ruleCommonality | this_Constraint_1= ruleConstraint )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCorrespondenceLanguage.g:225:3: this_Commonality_0= ruleCommonality
                    {

                    			newCompositeNode(grammarAccess.getCorrElementAccess().getCommonalityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Commonality_0=ruleCommonality();

                    state._fsp--;


                    			current = this_Commonality_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCorrespondenceLanguage.g:234:3: this_Constraint_1= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getCorrElementAccess().getConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_1;
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
    // $ANTLR end "ruleCorrElement"


    // $ANTLR start "entryRuleMetamodel"
    // InternalCorrespondenceLanguage.g:246:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // InternalCorrespondenceLanguage.g:246:50: (iv_ruleMetamodel= ruleMetamodel EOF )
            // InternalCorrespondenceLanguage.g:247:2: iv_ruleMetamodel= ruleMetamodel EOF
            {
             newCompositeNode(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetamodel=ruleMetamodel();

            state._fsp--;

             current =iv_ruleMetamodel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // InternalCorrespondenceLanguage.g:253:1: ruleMetamodel returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCorrespondenceLanguage.g:259:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCorrespondenceLanguage.g:260:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCorrespondenceLanguage.g:260:2: ( (otherlv_0= RULE_ID ) )
            // InternalCorrespondenceLanguage.g:261:3: (otherlv_0= RULE_ID )
            {
            // InternalCorrespondenceLanguage.g:261:3: (otherlv_0= RULE_ID )
            // InternalCorrespondenceLanguage.g:262:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMetamodelRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageCrossReference_0());
            			

            }


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
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleCommonality"
    // InternalCorrespondenceLanguage.g:276:1: entryRuleCommonality returns [EObject current=null] : iv_ruleCommonality= ruleCommonality EOF ;
    public final EObject entryRuleCommonality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonality = null;


        try {
            // InternalCorrespondenceLanguage.g:276:52: (iv_ruleCommonality= ruleCommonality EOF )
            // InternalCorrespondenceLanguage.g:277:2: iv_ruleCommonality= ruleCommonality EOF
            {
             newCompositeNode(grammarAccess.getCommonalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonality=ruleCommonality();

            state._fsp--;

             current =iv_ruleCommonality; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommonality"


    // $ANTLR start "ruleCommonality"
    // InternalCorrespondenceLanguage.g:283:1: ruleCommonality returns [EObject current=null] : (otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= '{' ( (lv_subComms_10_0= ruleSubCommonality ) )* otherlv_11= '}' )? otherlv_12= ';' ) ;
    public final EObject ruleCommonality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_subComms_10_0 = null;



        	enterRule();

        try {
            // InternalCorrespondenceLanguage.g:289:2: ( (otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= '{' ( (lv_subComms_10_0= ruleSubCommonality ) )* otherlv_11= '}' )? otherlv_12= ';' ) )
            // InternalCorrespondenceLanguage.g:290:2: (otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= '{' ( (lv_subComms_10_0= ruleSubCommonality ) )* otherlv_11= '}' )? otherlv_12= ';' )
            {
            // InternalCorrespondenceLanguage.g:290:2: (otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= '{' ( (lv_subComms_10_0= ruleSubCommonality ) )* otherlv_11= '}' )? otherlv_12= ';' )
            // InternalCorrespondenceLanguage.g:291:3: otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= '{' ( (lv_subComms_10_0= ruleSubCommonality ) )* otherlv_11= '}' )? otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommonalityAccess().getRelateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCorrespondenceLanguage.g:299:3: ( ( ruleQualifiedName ) )
            // InternalCorrespondenceLanguage.g:300:4: ( ruleQualifiedName )
            {
            // InternalCorrespondenceLanguage.g:300:4: ( ruleQualifiedName )
            // InternalCorrespondenceLanguage.g:301:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommonalityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCorrespondenceLanguage.g:315:3: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:316:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCommonalityAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCorrespondenceLanguage.g:320:4: ( ( ruleQualifiedName ) )
            	    // InternalCorrespondenceLanguage.g:321:5: ( ruleQualifiedName )
            	    {
            	    // InternalCorrespondenceLanguage.g:321:5: ( ruleQualifiedName )
            	    // InternalCorrespondenceLanguage.g:322:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCommonalityRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getCommonalityAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCommonalityAccess().getAsKeyword_5());
            		
            // InternalCorrespondenceLanguage.g:345:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalCorrespondenceLanguage.g:346:4: (lv_name_7_0= RULE_ID )
            {
            // InternalCorrespondenceLanguage.g:346:4: (lv_name_7_0= RULE_ID )
            // InternalCorrespondenceLanguage.g:347:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_7_0, grammarAccess.getCommonalityAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommonalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCorrespondenceLanguage.g:363:3: (otherlv_8= 'with' otherlv_9= '{' ( (lv_subComms_10_0= ruleSubCommonality ) )* otherlv_11= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCorrespondenceLanguage.g:364:4: otherlv_8= 'with' otherlv_9= '{' ( (lv_subComms_10_0= ruleSubCommonality ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getCommonalityAccess().getWithKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommonalityAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCorrespondenceLanguage.g:372:4: ( (lv_subComms_10_0= ruleSubCommonality ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCorrespondenceLanguage.g:373:5: (lv_subComms_10_0= ruleSubCommonality )
                    	    {
                    	    // InternalCorrespondenceLanguage.g:373:5: (lv_subComms_10_0= ruleSubCommonality )
                    	    // InternalCorrespondenceLanguage.g:374:6: lv_subComms_10_0= ruleSubCommonality
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommonalityAccess().getSubCommsSubCommonalityParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_subComms_10_0=ruleSubCommonality();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommonalityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subComms",
                    	    							lv_subComms_10_0,
                    	    							"no.hvl.past.corrlang.CorrespondenceLanguage.SubCommonality");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getCommonalityAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCommonalityAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleCommonality"


    // $ANTLR start "entryRuleSubCommonality"
    // InternalCorrespondenceLanguage.g:404:1: entryRuleSubCommonality returns [EObject current=null] : iv_ruleSubCommonality= ruleSubCommonality EOF ;
    public final EObject entryRuleSubCommonality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCommonality = null;


        try {
            // InternalCorrespondenceLanguage.g:404:55: (iv_ruleSubCommonality= ruleSubCommonality EOF )
            // InternalCorrespondenceLanguage.g:405:2: iv_ruleSubCommonality= ruleSubCommonality EOF
            {
             newCompositeNode(grammarAccess.getSubCommonalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubCommonality=ruleSubCommonality();

            state._fsp--;

             current =iv_ruleSubCommonality; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubCommonality"


    // $ANTLR start "ruleSubCommonality"
    // InternalCorrespondenceLanguage.g:411:1: ruleSubCommonality returns [EObject current=null] : (otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) ;
    public final EObject ruleSubCommonality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalCorrespondenceLanguage.g:417:2: ( (otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) )
            // InternalCorrespondenceLanguage.g:418:2: (otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' )
            {
            // InternalCorrespondenceLanguage.g:418:2: (otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' )
            // InternalCorrespondenceLanguage.g:419:3: otherlv_0= 'relate' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ otherlv_5= ')' otherlv_6= 'as' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubCommonalityAccess().getRelateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSubCommonalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCorrespondenceLanguage.g:427:3: ( ( ruleQualifiedName ) )
            // InternalCorrespondenceLanguage.g:428:4: ( ruleQualifiedName )
            {
            // InternalCorrespondenceLanguage.g:428:4: ( ruleQualifiedName )
            // InternalCorrespondenceLanguage.g:429:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubCommonalityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_2_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCorrespondenceLanguage.g:443:3: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:444:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSubCommonalityAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCorrespondenceLanguage.g:448:4: ( ( ruleQualifiedName ) )
            	    // InternalCorrespondenceLanguage.g:449:5: ( ruleQualifiedName )
            	    {
            	    // InternalCorrespondenceLanguage.g:449:5: ( ruleQualifiedName )
            	    // InternalCorrespondenceLanguage.g:450:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSubCommonalityRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getSubCommonalityAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getSubCommonalityAccess().getAsKeyword_5());
            		
            // InternalCorrespondenceLanguage.g:473:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalCorrespondenceLanguage.g:474:4: (lv_name_7_0= RULE_ID )
            {
            // InternalCorrespondenceLanguage.g:474:4: (lv_name_7_0= RULE_ID )
            // InternalCorrespondenceLanguage.g:475:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_7_0, grammarAccess.getSubCommonalityAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubCommonalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSubCommonalityAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleSubCommonality"


    // $ANTLR start "entryRuleConstraint"
    // InternalCorrespondenceLanguage.g:499:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalCorrespondenceLanguage.g:499:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCorrespondenceLanguage.g:500:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCorrespondenceLanguage.g:506:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCorrespondenceLanguage.g:512:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) )
            // InternalCorrespondenceLanguage.g:513:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalCorrespondenceLanguage.g:513:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            // InternalCorrespondenceLanguage.g:514:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalCorrespondenceLanguage.g:518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCorrespondenceLanguage.g:519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCorrespondenceLanguage.g:519:4: (lv_name_1_0= RULE_ID )
            // InternalCorrespondenceLanguage.g:520:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleConstraint"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000490000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});

}