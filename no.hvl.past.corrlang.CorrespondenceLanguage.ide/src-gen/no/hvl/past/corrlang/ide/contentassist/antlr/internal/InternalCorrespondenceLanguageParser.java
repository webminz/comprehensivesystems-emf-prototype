package no.hvl.past.corrlang.ide.contentassist.antlr.internal;

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
import no.hvl.past.corrlang.services.CorrespondenceLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCorrespondenceLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'correspondence'", "'('", "')'", "'{'", "'}'", "';'", "','", "'.'", "'relate'", "'as'", "'with'", "'constraint'"
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

    	public void setGrammarAccess(CorrespondenceLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCorrespondence"
    // InternalCorrespondenceLanguage.g:53:1: entryRuleCorrespondence : ruleCorrespondence EOF ;
    public final void entryRuleCorrespondence() throws RecognitionException {
        try {
            // InternalCorrespondenceLanguage.g:54:1: ( ruleCorrespondence EOF )
            // InternalCorrespondenceLanguage.g:55:1: ruleCorrespondence EOF
            {
             before(grammarAccess.getCorrespondenceRule()); 
            pushFollow(FOLLOW_1);
            ruleCorrespondence();

            state._fsp--;

             after(grammarAccess.getCorrespondenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCorrespondence"


    // $ANTLR start "ruleCorrespondence"
    // InternalCorrespondenceLanguage.g:62:1: ruleCorrespondence : ( ( rule__Correspondence__Group__0 ) ) ;
    public final void ruleCorrespondence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:66:2: ( ( ( rule__Correspondence__Group__0 ) ) )
            // InternalCorrespondenceLanguage.g:67:2: ( ( rule__Correspondence__Group__0 ) )
            {
            // InternalCorrespondenceLanguage.g:67:2: ( ( rule__Correspondence__Group__0 ) )
            // InternalCorrespondenceLanguage.g:68:3: ( rule__Correspondence__Group__0 )
            {
             before(grammarAccess.getCorrespondenceAccess().getGroup()); 
            // InternalCorrespondenceLanguage.g:69:3: ( rule__Correspondence__Group__0 )
            // InternalCorrespondenceLanguage.g:69:4: rule__Correspondence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCorrespondenceAccess().getGroup()); 

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
    // $ANTLR end "ruleCorrespondence"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCorrespondenceLanguage.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCorrespondenceLanguage.g:79:1: ( ruleQualifiedName EOF )
            // InternalCorrespondenceLanguage.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCorrespondenceLanguage.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCorrespondenceLanguage.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCorrespondenceLanguage.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCorrespondenceLanguage.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalCorrespondenceLanguage.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalCorrespondenceLanguage.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleCorrElement"
    // InternalCorrespondenceLanguage.g:103:1: entryRuleCorrElement : ruleCorrElement EOF ;
    public final void entryRuleCorrElement() throws RecognitionException {
        try {
            // InternalCorrespondenceLanguage.g:104:1: ( ruleCorrElement EOF )
            // InternalCorrespondenceLanguage.g:105:1: ruleCorrElement EOF
            {
             before(grammarAccess.getCorrElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCorrElement();

            state._fsp--;

             after(grammarAccess.getCorrElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCorrElement"


    // $ANTLR start "ruleCorrElement"
    // InternalCorrespondenceLanguage.g:112:1: ruleCorrElement : ( ( rule__CorrElement__Alternatives ) ) ;
    public final void ruleCorrElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:116:2: ( ( ( rule__CorrElement__Alternatives ) ) )
            // InternalCorrespondenceLanguage.g:117:2: ( ( rule__CorrElement__Alternatives ) )
            {
            // InternalCorrespondenceLanguage.g:117:2: ( ( rule__CorrElement__Alternatives ) )
            // InternalCorrespondenceLanguage.g:118:3: ( rule__CorrElement__Alternatives )
            {
             before(grammarAccess.getCorrElementAccess().getAlternatives()); 
            // InternalCorrespondenceLanguage.g:119:3: ( rule__CorrElement__Alternatives )
            // InternalCorrespondenceLanguage.g:119:4: rule__CorrElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CorrElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCorrElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCorrElement"


    // $ANTLR start "entryRuleMetamodel"
    // InternalCorrespondenceLanguage.g:128:1: entryRuleMetamodel : ruleMetamodel EOF ;
    public final void entryRuleMetamodel() throws RecognitionException {
        try {
            // InternalCorrespondenceLanguage.g:129:1: ( ruleMetamodel EOF )
            // InternalCorrespondenceLanguage.g:130:1: ruleMetamodel EOF
            {
             before(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getMetamodelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // InternalCorrespondenceLanguage.g:137:1: ruleMetamodel : ( ( rule__Metamodel__ImportedNamespaceAssignment ) ) ;
    public final void ruleMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:141:2: ( ( ( rule__Metamodel__ImportedNamespaceAssignment ) ) )
            // InternalCorrespondenceLanguage.g:142:2: ( ( rule__Metamodel__ImportedNamespaceAssignment ) )
            {
            // InternalCorrespondenceLanguage.g:142:2: ( ( rule__Metamodel__ImportedNamespaceAssignment ) )
            // InternalCorrespondenceLanguage.g:143:3: ( rule__Metamodel__ImportedNamespaceAssignment )
            {
             before(grammarAccess.getMetamodelAccess().getImportedNamespaceAssignment()); 
            // InternalCorrespondenceLanguage.g:144:3: ( rule__Metamodel__ImportedNamespaceAssignment )
            // InternalCorrespondenceLanguage.g:144:4: rule__Metamodel__ImportedNamespaceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Metamodel__ImportedNamespaceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getImportedNamespaceAssignment()); 

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
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleCommonality"
    // InternalCorrespondenceLanguage.g:153:1: entryRuleCommonality : ruleCommonality EOF ;
    public final void entryRuleCommonality() throws RecognitionException {
        try {
            // InternalCorrespondenceLanguage.g:154:1: ( ruleCommonality EOF )
            // InternalCorrespondenceLanguage.g:155:1: ruleCommonality EOF
            {
             before(grammarAccess.getCommonalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCommonality();

            state._fsp--;

             after(grammarAccess.getCommonalityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommonality"


    // $ANTLR start "ruleCommonality"
    // InternalCorrespondenceLanguage.g:162:1: ruleCommonality : ( ( rule__Commonality__Group__0 ) ) ;
    public final void ruleCommonality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:166:2: ( ( ( rule__Commonality__Group__0 ) ) )
            // InternalCorrespondenceLanguage.g:167:2: ( ( rule__Commonality__Group__0 ) )
            {
            // InternalCorrespondenceLanguage.g:167:2: ( ( rule__Commonality__Group__0 ) )
            // InternalCorrespondenceLanguage.g:168:3: ( rule__Commonality__Group__0 )
            {
             before(grammarAccess.getCommonalityAccess().getGroup()); 
            // InternalCorrespondenceLanguage.g:169:3: ( rule__Commonality__Group__0 )
            // InternalCorrespondenceLanguage.g:169:4: rule__Commonality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Commonality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommonalityAccess().getGroup()); 

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
    // $ANTLR end "ruleCommonality"


    // $ANTLR start "entryRuleSubCommonality"
    // InternalCorrespondenceLanguage.g:178:1: entryRuleSubCommonality : ruleSubCommonality EOF ;
    public final void entryRuleSubCommonality() throws RecognitionException {
        try {
            // InternalCorrespondenceLanguage.g:179:1: ( ruleSubCommonality EOF )
            // InternalCorrespondenceLanguage.g:180:1: ruleSubCommonality EOF
            {
             before(grammarAccess.getSubCommonalityRule()); 
            pushFollow(FOLLOW_1);
            ruleSubCommonality();

            state._fsp--;

             after(grammarAccess.getSubCommonalityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubCommonality"


    // $ANTLR start "ruleSubCommonality"
    // InternalCorrespondenceLanguage.g:187:1: ruleSubCommonality : ( ( rule__SubCommonality__Group__0 ) ) ;
    public final void ruleSubCommonality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:191:2: ( ( ( rule__SubCommonality__Group__0 ) ) )
            // InternalCorrespondenceLanguage.g:192:2: ( ( rule__SubCommonality__Group__0 ) )
            {
            // InternalCorrespondenceLanguage.g:192:2: ( ( rule__SubCommonality__Group__0 ) )
            // InternalCorrespondenceLanguage.g:193:3: ( rule__SubCommonality__Group__0 )
            {
             before(grammarAccess.getSubCommonalityAccess().getGroup()); 
            // InternalCorrespondenceLanguage.g:194:3: ( rule__SubCommonality__Group__0 )
            // InternalCorrespondenceLanguage.g:194:4: rule__SubCommonality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubCommonalityAccess().getGroup()); 

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
    // $ANTLR end "ruleSubCommonality"


    // $ANTLR start "entryRuleConstraint"
    // InternalCorrespondenceLanguage.g:203:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalCorrespondenceLanguage.g:204:1: ( ruleConstraint EOF )
            // InternalCorrespondenceLanguage.g:205:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCorrespondenceLanguage.g:212:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:216:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalCorrespondenceLanguage.g:217:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalCorrespondenceLanguage.g:217:2: ( ( rule__Constraint__Group__0 ) )
            // InternalCorrespondenceLanguage.g:218:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalCorrespondenceLanguage.g:219:3: ( rule__Constraint__Group__0 )
            // InternalCorrespondenceLanguage.g:219:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "rule__CorrElement__Alternatives"
    // InternalCorrespondenceLanguage.g:227:1: rule__CorrElement__Alternatives : ( ( ruleCommonality ) | ( ruleConstraint ) );
    public final void rule__CorrElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:231:1: ( ( ruleCommonality ) | ( ruleConstraint ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCorrespondenceLanguage.g:232:2: ( ruleCommonality )
                    {
                    // InternalCorrespondenceLanguage.g:232:2: ( ruleCommonality )
                    // InternalCorrespondenceLanguage.g:233:3: ruleCommonality
                    {
                     before(grammarAccess.getCorrElementAccess().getCommonalityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommonality();

                    state._fsp--;

                     after(grammarAccess.getCorrElementAccess().getCommonalityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCorrespondenceLanguage.g:238:2: ( ruleConstraint )
                    {
                    // InternalCorrespondenceLanguage.g:238:2: ( ruleConstraint )
                    // InternalCorrespondenceLanguage.g:239:3: ruleConstraint
                    {
                     before(grammarAccess.getCorrElementAccess().getConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getCorrElementAccess().getConstraintParserRuleCall_1()); 

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
    // $ANTLR end "rule__CorrElement__Alternatives"


    // $ANTLR start "rule__Correspondence__Group__0"
    // InternalCorrespondenceLanguage.g:248:1: rule__Correspondence__Group__0 : rule__Correspondence__Group__0__Impl rule__Correspondence__Group__1 ;
    public final void rule__Correspondence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:252:1: ( rule__Correspondence__Group__0__Impl rule__Correspondence__Group__1 )
            // InternalCorrespondenceLanguage.g:253:2: rule__Correspondence__Group__0__Impl rule__Correspondence__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Correspondence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__1();

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
    // $ANTLR end "rule__Correspondence__Group__0"


    // $ANTLR start "rule__Correspondence__Group__0__Impl"
    // InternalCorrespondenceLanguage.g:260:1: rule__Correspondence__Group__0__Impl : ( 'correspondence' ) ;
    public final void rule__Correspondence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:264:1: ( ( 'correspondence' ) )
            // InternalCorrespondenceLanguage.g:265:1: ( 'correspondence' )
            {
            // InternalCorrespondenceLanguage.g:265:1: ( 'correspondence' )
            // InternalCorrespondenceLanguage.g:266:2: 'correspondence'
            {
             before(grammarAccess.getCorrespondenceAccess().getCorrespondenceKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCorrespondenceAccess().getCorrespondenceKeyword_0()); 

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
    // $ANTLR end "rule__Correspondence__Group__0__Impl"


    // $ANTLR start "rule__Correspondence__Group__1"
    // InternalCorrespondenceLanguage.g:275:1: rule__Correspondence__Group__1 : rule__Correspondence__Group__1__Impl rule__Correspondence__Group__2 ;
    public final void rule__Correspondence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:279:1: ( rule__Correspondence__Group__1__Impl rule__Correspondence__Group__2 )
            // InternalCorrespondenceLanguage.g:280:2: rule__Correspondence__Group__1__Impl rule__Correspondence__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Correspondence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__2();

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
    // $ANTLR end "rule__Correspondence__Group__1"


    // $ANTLR start "rule__Correspondence__Group__1__Impl"
    // InternalCorrespondenceLanguage.g:287:1: rule__Correspondence__Group__1__Impl : ( '(' ) ;
    public final void rule__Correspondence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:291:1: ( ( '(' ) )
            // InternalCorrespondenceLanguage.g:292:1: ( '(' )
            {
            // InternalCorrespondenceLanguage.g:292:1: ( '(' )
            // InternalCorrespondenceLanguage.g:293:2: '('
            {
             before(grammarAccess.getCorrespondenceAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCorrespondenceAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Correspondence__Group__1__Impl"


    // $ANTLR start "rule__Correspondence__Group__2"
    // InternalCorrespondenceLanguage.g:302:1: rule__Correspondence__Group__2 : rule__Correspondence__Group__2__Impl rule__Correspondence__Group__3 ;
    public final void rule__Correspondence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:306:1: ( rule__Correspondence__Group__2__Impl rule__Correspondence__Group__3 )
            // InternalCorrespondenceLanguage.g:307:2: rule__Correspondence__Group__2__Impl rule__Correspondence__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Correspondence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__3();

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
    // $ANTLR end "rule__Correspondence__Group__2"


    // $ANTLR start "rule__Correspondence__Group__2__Impl"
    // InternalCorrespondenceLanguage.g:314:1: rule__Correspondence__Group__2__Impl : ( ( rule__Correspondence__ModelSpaceAssignment_2 ) ) ;
    public final void rule__Correspondence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:318:1: ( ( ( rule__Correspondence__ModelSpaceAssignment_2 ) ) )
            // InternalCorrespondenceLanguage.g:319:1: ( ( rule__Correspondence__ModelSpaceAssignment_2 ) )
            {
            // InternalCorrespondenceLanguage.g:319:1: ( ( rule__Correspondence__ModelSpaceAssignment_2 ) )
            // InternalCorrespondenceLanguage.g:320:2: ( rule__Correspondence__ModelSpaceAssignment_2 )
            {
             before(grammarAccess.getCorrespondenceAccess().getModelSpaceAssignment_2()); 
            // InternalCorrespondenceLanguage.g:321:2: ( rule__Correspondence__ModelSpaceAssignment_2 )
            // InternalCorrespondenceLanguage.g:321:3: rule__Correspondence__ModelSpaceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Correspondence__ModelSpaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCorrespondenceAccess().getModelSpaceAssignment_2()); 

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
    // $ANTLR end "rule__Correspondence__Group__2__Impl"


    // $ANTLR start "rule__Correspondence__Group__3"
    // InternalCorrespondenceLanguage.g:329:1: rule__Correspondence__Group__3 : rule__Correspondence__Group__3__Impl rule__Correspondence__Group__4 ;
    public final void rule__Correspondence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:333:1: ( rule__Correspondence__Group__3__Impl rule__Correspondence__Group__4 )
            // InternalCorrespondenceLanguage.g:334:2: rule__Correspondence__Group__3__Impl rule__Correspondence__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Correspondence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__4();

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
    // $ANTLR end "rule__Correspondence__Group__3"


    // $ANTLR start "rule__Correspondence__Group__3__Impl"
    // InternalCorrespondenceLanguage.g:341:1: rule__Correspondence__Group__3__Impl : ( ( ( rule__Correspondence__Group_3__0 ) ) ( ( rule__Correspondence__Group_3__0 )* ) ) ;
    public final void rule__Correspondence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:345:1: ( ( ( ( rule__Correspondence__Group_3__0 ) ) ( ( rule__Correspondence__Group_3__0 )* ) ) )
            // InternalCorrespondenceLanguage.g:346:1: ( ( ( rule__Correspondence__Group_3__0 ) ) ( ( rule__Correspondence__Group_3__0 )* ) )
            {
            // InternalCorrespondenceLanguage.g:346:1: ( ( ( rule__Correspondence__Group_3__0 ) ) ( ( rule__Correspondence__Group_3__0 )* ) )
            // InternalCorrespondenceLanguage.g:347:2: ( ( rule__Correspondence__Group_3__0 ) ) ( ( rule__Correspondence__Group_3__0 )* )
            {
            // InternalCorrespondenceLanguage.g:347:2: ( ( rule__Correspondence__Group_3__0 ) )
            // InternalCorrespondenceLanguage.g:348:3: ( rule__Correspondence__Group_3__0 )
            {
             before(grammarAccess.getCorrespondenceAccess().getGroup_3()); 
            // InternalCorrespondenceLanguage.g:349:3: ( rule__Correspondence__Group_3__0 )
            // InternalCorrespondenceLanguage.g:349:4: rule__Correspondence__Group_3__0
            {
            pushFollow(FOLLOW_7);
            rule__Correspondence__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCorrespondenceAccess().getGroup_3()); 

            }

            // InternalCorrespondenceLanguage.g:352:2: ( ( rule__Correspondence__Group_3__0 )* )
            // InternalCorrespondenceLanguage.g:353:3: ( rule__Correspondence__Group_3__0 )*
            {
             before(grammarAccess.getCorrespondenceAccess().getGroup_3()); 
            // InternalCorrespondenceLanguage.g:354:3: ( rule__Correspondence__Group_3__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:354:4: rule__Correspondence__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Correspondence__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCorrespondenceAccess().getGroup_3()); 

            }


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
    // $ANTLR end "rule__Correspondence__Group__3__Impl"


    // $ANTLR start "rule__Correspondence__Group__4"
    // InternalCorrespondenceLanguage.g:363:1: rule__Correspondence__Group__4 : rule__Correspondence__Group__4__Impl rule__Correspondence__Group__5 ;
    public final void rule__Correspondence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:367:1: ( rule__Correspondence__Group__4__Impl rule__Correspondence__Group__5 )
            // InternalCorrespondenceLanguage.g:368:2: rule__Correspondence__Group__4__Impl rule__Correspondence__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Correspondence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__5();

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
    // $ANTLR end "rule__Correspondence__Group__4"


    // $ANTLR start "rule__Correspondence__Group__4__Impl"
    // InternalCorrespondenceLanguage.g:375:1: rule__Correspondence__Group__4__Impl : ( ')' ) ;
    public final void rule__Correspondence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:379:1: ( ( ')' ) )
            // InternalCorrespondenceLanguage.g:380:1: ( ')' )
            {
            // InternalCorrespondenceLanguage.g:380:1: ( ')' )
            // InternalCorrespondenceLanguage.g:381:2: ')'
            {
             before(grammarAccess.getCorrespondenceAccess().getRightParenthesisKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCorrespondenceAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Correspondence__Group__4__Impl"


    // $ANTLR start "rule__Correspondence__Group__5"
    // InternalCorrespondenceLanguage.g:390:1: rule__Correspondence__Group__5 : rule__Correspondence__Group__5__Impl rule__Correspondence__Group__6 ;
    public final void rule__Correspondence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:394:1: ( rule__Correspondence__Group__5__Impl rule__Correspondence__Group__6 )
            // InternalCorrespondenceLanguage.g:395:2: rule__Correspondence__Group__5__Impl rule__Correspondence__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Correspondence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__6();

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
    // $ANTLR end "rule__Correspondence__Group__5"


    // $ANTLR start "rule__Correspondence__Group__5__Impl"
    // InternalCorrespondenceLanguage.g:402:1: rule__Correspondence__Group__5__Impl : ( '{' ) ;
    public final void rule__Correspondence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:406:1: ( ( '{' ) )
            // InternalCorrespondenceLanguage.g:407:1: ( '{' )
            {
            // InternalCorrespondenceLanguage.g:407:1: ( '{' )
            // InternalCorrespondenceLanguage.g:408:2: '{'
            {
             before(grammarAccess.getCorrespondenceAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCorrespondenceAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Correspondence__Group__5__Impl"


    // $ANTLR start "rule__Correspondence__Group__6"
    // InternalCorrespondenceLanguage.g:417:1: rule__Correspondence__Group__6 : rule__Correspondence__Group__6__Impl rule__Correspondence__Group__7 ;
    public final void rule__Correspondence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:421:1: ( rule__Correspondence__Group__6__Impl rule__Correspondence__Group__7 )
            // InternalCorrespondenceLanguage.g:422:2: rule__Correspondence__Group__6__Impl rule__Correspondence__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Correspondence__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__7();

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
    // $ANTLR end "rule__Correspondence__Group__6"


    // $ANTLR start "rule__Correspondence__Group__6__Impl"
    // InternalCorrespondenceLanguage.g:429:1: rule__Correspondence__Group__6__Impl : ( ( rule__Correspondence__ElementsAssignment_6 )* ) ;
    public final void rule__Correspondence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:433:1: ( ( ( rule__Correspondence__ElementsAssignment_6 )* ) )
            // InternalCorrespondenceLanguage.g:434:1: ( ( rule__Correspondence__ElementsAssignment_6 )* )
            {
            // InternalCorrespondenceLanguage.g:434:1: ( ( rule__Correspondence__ElementsAssignment_6 )* )
            // InternalCorrespondenceLanguage.g:435:2: ( rule__Correspondence__ElementsAssignment_6 )*
            {
             before(grammarAccess.getCorrespondenceAccess().getElementsAssignment_6()); 
            // InternalCorrespondenceLanguage.g:436:2: ( rule__Correspondence__ElementsAssignment_6 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:436:3: rule__Correspondence__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Correspondence__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCorrespondenceAccess().getElementsAssignment_6()); 

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
    // $ANTLR end "rule__Correspondence__Group__6__Impl"


    // $ANTLR start "rule__Correspondence__Group__7"
    // InternalCorrespondenceLanguage.g:444:1: rule__Correspondence__Group__7 : rule__Correspondence__Group__7__Impl rule__Correspondence__Group__8 ;
    public final void rule__Correspondence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:448:1: ( rule__Correspondence__Group__7__Impl rule__Correspondence__Group__8 )
            // InternalCorrespondenceLanguage.g:449:2: rule__Correspondence__Group__7__Impl rule__Correspondence__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Correspondence__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__8();

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
    // $ANTLR end "rule__Correspondence__Group__7"


    // $ANTLR start "rule__Correspondence__Group__7__Impl"
    // InternalCorrespondenceLanguage.g:456:1: rule__Correspondence__Group__7__Impl : ( '}' ) ;
    public final void rule__Correspondence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:460:1: ( ( '}' ) )
            // InternalCorrespondenceLanguage.g:461:1: ( '}' )
            {
            // InternalCorrespondenceLanguage.g:461:1: ( '}' )
            // InternalCorrespondenceLanguage.g:462:2: '}'
            {
             before(grammarAccess.getCorrespondenceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCorrespondenceAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Correspondence__Group__7__Impl"


    // $ANTLR start "rule__Correspondence__Group__8"
    // InternalCorrespondenceLanguage.g:471:1: rule__Correspondence__Group__8 : rule__Correspondence__Group__8__Impl ;
    public final void rule__Correspondence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:475:1: ( rule__Correspondence__Group__8__Impl )
            // InternalCorrespondenceLanguage.g:476:2: rule__Correspondence__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Correspondence__Group__8__Impl();

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
    // $ANTLR end "rule__Correspondence__Group__8"


    // $ANTLR start "rule__Correspondence__Group__8__Impl"
    // InternalCorrespondenceLanguage.g:482:1: rule__Correspondence__Group__8__Impl : ( ';' ) ;
    public final void rule__Correspondence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:486:1: ( ( ';' ) )
            // InternalCorrespondenceLanguage.g:487:1: ( ';' )
            {
            // InternalCorrespondenceLanguage.g:487:1: ( ';' )
            // InternalCorrespondenceLanguage.g:488:2: ';'
            {
             before(grammarAccess.getCorrespondenceAccess().getSemicolonKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCorrespondenceAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__Correspondence__Group__8__Impl"


    // $ANTLR start "rule__Correspondence__Group_3__0"
    // InternalCorrespondenceLanguage.g:498:1: rule__Correspondence__Group_3__0 : rule__Correspondence__Group_3__0__Impl rule__Correspondence__Group_3__1 ;
    public final void rule__Correspondence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:502:1: ( rule__Correspondence__Group_3__0__Impl rule__Correspondence__Group_3__1 )
            // InternalCorrespondenceLanguage.g:503:2: rule__Correspondence__Group_3__0__Impl rule__Correspondence__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Correspondence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Correspondence__Group_3__1();

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
    // $ANTLR end "rule__Correspondence__Group_3__0"


    // $ANTLR start "rule__Correspondence__Group_3__0__Impl"
    // InternalCorrespondenceLanguage.g:510:1: rule__Correspondence__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Correspondence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:514:1: ( ( ',' ) )
            // InternalCorrespondenceLanguage.g:515:1: ( ',' )
            {
            // InternalCorrespondenceLanguage.g:515:1: ( ',' )
            // InternalCorrespondenceLanguage.g:516:2: ','
            {
             before(grammarAccess.getCorrespondenceAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCorrespondenceAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Correspondence__Group_3__0__Impl"


    // $ANTLR start "rule__Correspondence__Group_3__1"
    // InternalCorrespondenceLanguage.g:525:1: rule__Correspondence__Group_3__1 : rule__Correspondence__Group_3__1__Impl ;
    public final void rule__Correspondence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:529:1: ( rule__Correspondence__Group_3__1__Impl )
            // InternalCorrespondenceLanguage.g:530:2: rule__Correspondence__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Correspondence__Group_3__1__Impl();

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
    // $ANTLR end "rule__Correspondence__Group_3__1"


    // $ANTLR start "rule__Correspondence__Group_3__1__Impl"
    // InternalCorrespondenceLanguage.g:536:1: rule__Correspondence__Group_3__1__Impl : ( ( rule__Correspondence__ModelSpaceAssignment_3_1 ) ) ;
    public final void rule__Correspondence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:540:1: ( ( ( rule__Correspondence__ModelSpaceAssignment_3_1 ) ) )
            // InternalCorrespondenceLanguage.g:541:1: ( ( rule__Correspondence__ModelSpaceAssignment_3_1 ) )
            {
            // InternalCorrespondenceLanguage.g:541:1: ( ( rule__Correspondence__ModelSpaceAssignment_3_1 ) )
            // InternalCorrespondenceLanguage.g:542:2: ( rule__Correspondence__ModelSpaceAssignment_3_1 )
            {
             before(grammarAccess.getCorrespondenceAccess().getModelSpaceAssignment_3_1()); 
            // InternalCorrespondenceLanguage.g:543:2: ( rule__Correspondence__ModelSpaceAssignment_3_1 )
            // InternalCorrespondenceLanguage.g:543:3: rule__Correspondence__ModelSpaceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Correspondence__ModelSpaceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCorrespondenceAccess().getModelSpaceAssignment_3_1()); 

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
    // $ANTLR end "rule__Correspondence__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCorrespondenceLanguage.g:552:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:556:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCorrespondenceLanguage.g:557:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalCorrespondenceLanguage.g:564:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:568:1: ( ( RULE_ID ) )
            // InternalCorrespondenceLanguage.g:569:1: ( RULE_ID )
            {
            // InternalCorrespondenceLanguage.g:569:1: ( RULE_ID )
            // InternalCorrespondenceLanguage.g:570:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalCorrespondenceLanguage.g:579:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:583:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCorrespondenceLanguage.g:584:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalCorrespondenceLanguage.g:590:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:594:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCorrespondenceLanguage.g:595:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCorrespondenceLanguage.g:595:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCorrespondenceLanguage.g:596:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalCorrespondenceLanguage.g:597:2: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:597:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalCorrespondenceLanguage.g:606:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:610:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCorrespondenceLanguage.g:611:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalCorrespondenceLanguage.g:618:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:622:1: ( ( '.' ) )
            // InternalCorrespondenceLanguage.g:623:1: ( '.' )
            {
            // InternalCorrespondenceLanguage.g:623:1: ( '.' )
            // InternalCorrespondenceLanguage.g:624:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalCorrespondenceLanguage.g:633:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:637:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCorrespondenceLanguage.g:638:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalCorrespondenceLanguage.g:644:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:648:1: ( ( RULE_ID ) )
            // InternalCorrespondenceLanguage.g:649:1: ( RULE_ID )
            {
            // InternalCorrespondenceLanguage.g:649:1: ( RULE_ID )
            // InternalCorrespondenceLanguage.g:650:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Commonality__Group__0"
    // InternalCorrespondenceLanguage.g:660:1: rule__Commonality__Group__0 : rule__Commonality__Group__0__Impl rule__Commonality__Group__1 ;
    public final void rule__Commonality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:664:1: ( rule__Commonality__Group__0__Impl rule__Commonality__Group__1 )
            // InternalCorrespondenceLanguage.g:665:2: rule__Commonality__Group__0__Impl rule__Commonality__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Commonality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group__1();

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
    // $ANTLR end "rule__Commonality__Group__0"


    // $ANTLR start "rule__Commonality__Group__0__Impl"
    // InternalCorrespondenceLanguage.g:672:1: rule__Commonality__Group__0__Impl : ( 'relate' ) ;
    public final void rule__Commonality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:676:1: ( ( 'relate' ) )
            // InternalCorrespondenceLanguage.g:677:1: ( 'relate' )
            {
            // InternalCorrespondenceLanguage.g:677:1: ( 'relate' )
            // InternalCorrespondenceLanguage.g:678:2: 'relate'
            {
             before(grammarAccess.getCommonalityAccess().getRelateKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getRelateKeyword_0()); 

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
    // $ANTLR end "rule__Commonality__Group__0__Impl"


    // $ANTLR start "rule__Commonality__Group__1"
    // InternalCorrespondenceLanguage.g:687:1: rule__Commonality__Group__1 : rule__Commonality__Group__1__Impl rule__Commonality__Group__2 ;
    public final void rule__Commonality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:691:1: ( rule__Commonality__Group__1__Impl rule__Commonality__Group__2 )
            // InternalCorrespondenceLanguage.g:692:2: rule__Commonality__Group__1__Impl rule__Commonality__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Commonality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group__2();

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
    // $ANTLR end "rule__Commonality__Group__1"


    // $ANTLR start "rule__Commonality__Group__1__Impl"
    // InternalCorrespondenceLanguage.g:699:1: rule__Commonality__Group__1__Impl : ( '(' ) ;
    public final void rule__Commonality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:703:1: ( ( '(' ) )
            // InternalCorrespondenceLanguage.g:704:1: ( '(' )
            {
            // InternalCorrespondenceLanguage.g:704:1: ( '(' )
            // InternalCorrespondenceLanguage.g:705:2: '('
            {
             before(grammarAccess.getCommonalityAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Commonality__Group__1__Impl"


    // $ANTLR start "rule__Commonality__Group__2"
    // InternalCorrespondenceLanguage.g:714:1: rule__Commonality__Group__2 : rule__Commonality__Group__2__Impl rule__Commonality__Group__3 ;
    public final void rule__Commonality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:718:1: ( rule__Commonality__Group__2__Impl rule__Commonality__Group__3 )
            // InternalCorrespondenceLanguage.g:719:2: rule__Commonality__Group__2__Impl rule__Commonality__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Commonality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group__3();

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
    // $ANTLR end "rule__Commonality__Group__2"


    // $ANTLR start "rule__Commonality__Group__2__Impl"
    // InternalCorrespondenceLanguage.g:726:1: rule__Commonality__Group__2__Impl : ( ( rule__Commonality__ElementsAssignment_2 ) ) ;
    public final void rule__Commonality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:730:1: ( ( ( rule__Commonality__ElementsAssignment_2 ) ) )
            // InternalCorrespondenceLanguage.g:731:1: ( ( rule__Commonality__ElementsAssignment_2 ) )
            {
            // InternalCorrespondenceLanguage.g:731:1: ( ( rule__Commonality__ElementsAssignment_2 ) )
            // InternalCorrespondenceLanguage.g:732:2: ( rule__Commonality__ElementsAssignment_2 )
            {
             before(grammarAccess.getCommonalityAccess().getElementsAssignment_2()); 
            // InternalCorrespondenceLanguage.g:733:2: ( rule__Commonality__ElementsAssignment_2 )
            // InternalCorrespondenceLanguage.g:733:3: rule__Commonality__ElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Commonality__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommonalityAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Commonality__Group__2__Impl"


    // $ANTLR start "rule__Commonality__Group__3"
    // InternalCorrespondenceLanguage.g:741:1: rule__Commonality__Group__3 : rule__Commonality__Group__3__Impl rule__Commonality__Group__4 ;
    public final void rule__Commonality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:745:1: ( rule__Commonality__Group__3__Impl rule__Commonality__Group__4 )
            // InternalCorrespondenceLanguage.g:746:2: rule__Commonality__Group__3__Impl rule__Commonality__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Commonality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group__4();

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
    // $ANTLR end "rule__Commonality__Group__3"


    // $ANTLR start "rule__Commonality__Group__3__Impl"
    // InternalCorrespondenceLanguage.g:753:1: rule__Commonality__Group__3__Impl : ( ( ( rule__Commonality__Group_3__0 ) ) ( ( rule__Commonality__Group_3__0 )* ) ) ;
    public final void rule__Commonality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:757:1: ( ( ( ( rule__Commonality__Group_3__0 ) ) ( ( rule__Commonality__Group_3__0 )* ) ) )
            // InternalCorrespondenceLanguage.g:758:1: ( ( ( rule__Commonality__Group_3__0 ) ) ( ( rule__Commonality__Group_3__0 )* ) )
            {
            // InternalCorrespondenceLanguage.g:758:1: ( ( ( rule__Commonality__Group_3__0 ) ) ( ( rule__Commonality__Group_3__0 )* ) )
            // InternalCorrespondenceLanguage.g:759:2: ( ( rule__Commonality__Group_3__0 ) ) ( ( rule__Commonality__Group_3__0 )* )
            {
            // InternalCorrespondenceLanguage.g:759:2: ( ( rule__Commonality__Group_3__0 ) )
            // InternalCorrespondenceLanguage.g:760:3: ( rule__Commonality__Group_3__0 )
            {
             before(grammarAccess.getCommonalityAccess().getGroup_3()); 
            // InternalCorrespondenceLanguage.g:761:3: ( rule__Commonality__Group_3__0 )
            // InternalCorrespondenceLanguage.g:761:4: rule__Commonality__Group_3__0
            {
            pushFollow(FOLLOW_7);
            rule__Commonality__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCommonalityAccess().getGroup_3()); 

            }

            // InternalCorrespondenceLanguage.g:764:2: ( ( rule__Commonality__Group_3__0 )* )
            // InternalCorrespondenceLanguage.g:765:3: ( rule__Commonality__Group_3__0 )*
            {
             before(grammarAccess.getCommonalityAccess().getGroup_3()); 
            // InternalCorrespondenceLanguage.g:766:3: ( rule__Commonality__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:766:4: rule__Commonality__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Commonality__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCommonalityAccess().getGroup_3()); 

            }


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
    // $ANTLR end "rule__Commonality__Group__3__Impl"


    // $ANTLR start "rule__Commonality__Group__4"
    // InternalCorrespondenceLanguage.g:775:1: rule__Commonality__Group__4 : rule__Commonality__Group__4__Impl rule__Commonality__Group__5 ;
    public final void rule__Commonality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:779:1: ( rule__Commonality__Group__4__Impl rule__Commonality__Group__5 )
            // InternalCorrespondenceLanguage.g:780:2: rule__Commonality__Group__4__Impl rule__Commonality__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Commonality__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group__5();

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
    // $ANTLR end "rule__Commonality__Group__4"


    // $ANTLR start "rule__Commonality__Group__4__Impl"
    // InternalCorrespondenceLanguage.g:787:1: rule__Commonality__Group__4__Impl : ( ')' ) ;
    public final void rule__Commonality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:791:1: ( ( ')' ) )
            // InternalCorrespondenceLanguage.g:792:1: ( ')' )
            {
            // InternalCorrespondenceLanguage.g:792:1: ( ')' )
            // InternalCorrespondenceLanguage.g:793:2: ')'
            {
             before(grammarAccess.getCommonalityAccess().getRightParenthesisKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Commonality__Group__4__Impl"


    // $ANTLR start "rule__Commonality__Group__5"
    // InternalCorrespondenceLanguage.g:802:1: rule__Commonality__Group__5 : rule__Commonality__Group__5__Impl rule__Commonality__Group__6 ;
    public final void rule__Commonality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:806:1: ( rule__Commonality__Group__5__Impl rule__Commonality__Group__6 )
            // InternalCorrespondenceLanguage.g:807:2: rule__Commonality__Group__5__Impl rule__Commonality__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Commonality__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group__6();

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
    // $ANTLR end "rule__Commonality__Group__5"


    // $ANTLR start "rule__Commonality__Group__5__Impl"
    // InternalCorrespondenceLanguage.g:814:1: rule__Commonality__Group__5__Impl : ( 'as' ) ;
    public final void rule__Commonality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:818:1: ( ( 'as' ) )
            // InternalCorrespondenceLanguage.g:819:1: ( 'as' )
            {
            // InternalCorrespondenceLanguage.g:819:1: ( 'as' )
            // InternalCorrespondenceLanguage.g:820:2: 'as'
            {
             before(grammarAccess.getCommonalityAccess().getAsKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getAsKeyword_5()); 

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
    // $ANTLR end "rule__Commonality__Group__5__Impl"


    // $ANTLR start "rule__Commonality__Group__6"
    // InternalCorrespondenceLanguage.g:829:1: rule__Commonality__Group__6 : rule__Commonality__Group__6__Impl rule__Commonality__Group__7 ;
    public final void rule__Commonality__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:833:1: ( rule__Commonality__Group__6__Impl rule__Commonality__Group__7 )
            // InternalCorrespondenceLanguage.g:834:2: rule__Commonality__Group__6__Impl rule__Commonality__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Commonality__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group__7();

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
    // $ANTLR end "rule__Commonality__Group__6"


    // $ANTLR start "rule__Commonality__Group__6__Impl"
    // InternalCorrespondenceLanguage.g:841:1: rule__Commonality__Group__6__Impl : ( ( rule__Commonality__NameAssignment_6 ) ) ;
    public final void rule__Commonality__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:845:1: ( ( ( rule__Commonality__NameAssignment_6 ) ) )
            // InternalCorrespondenceLanguage.g:846:1: ( ( rule__Commonality__NameAssignment_6 ) )
            {
            // InternalCorrespondenceLanguage.g:846:1: ( ( rule__Commonality__NameAssignment_6 ) )
            // InternalCorrespondenceLanguage.g:847:2: ( rule__Commonality__NameAssignment_6 )
            {
             before(grammarAccess.getCommonalityAccess().getNameAssignment_6()); 
            // InternalCorrespondenceLanguage.g:848:2: ( rule__Commonality__NameAssignment_6 )
            // InternalCorrespondenceLanguage.g:848:3: rule__Commonality__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Commonality__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCommonalityAccess().getNameAssignment_6()); 

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
    // $ANTLR end "rule__Commonality__Group__6__Impl"


    // $ANTLR start "rule__Commonality__Group__7"
    // InternalCorrespondenceLanguage.g:856:1: rule__Commonality__Group__7 : rule__Commonality__Group__7__Impl rule__Commonality__Group__8 ;
    public final void rule__Commonality__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:860:1: ( rule__Commonality__Group__7__Impl rule__Commonality__Group__8 )
            // InternalCorrespondenceLanguage.g:861:2: rule__Commonality__Group__7__Impl rule__Commonality__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Commonality__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group__8();

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
    // $ANTLR end "rule__Commonality__Group__7"


    // $ANTLR start "rule__Commonality__Group__7__Impl"
    // InternalCorrespondenceLanguage.g:868:1: rule__Commonality__Group__7__Impl : ( ( rule__Commonality__Group_7__0 )? ) ;
    public final void rule__Commonality__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:872:1: ( ( ( rule__Commonality__Group_7__0 )? ) )
            // InternalCorrespondenceLanguage.g:873:1: ( ( rule__Commonality__Group_7__0 )? )
            {
            // InternalCorrespondenceLanguage.g:873:1: ( ( rule__Commonality__Group_7__0 )? )
            // InternalCorrespondenceLanguage.g:874:2: ( rule__Commonality__Group_7__0 )?
            {
             before(grammarAccess.getCommonalityAccess().getGroup_7()); 
            // InternalCorrespondenceLanguage.g:875:2: ( rule__Commonality__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCorrespondenceLanguage.g:875:3: rule__Commonality__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Commonality__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommonalityAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Commonality__Group__7__Impl"


    // $ANTLR start "rule__Commonality__Group__8"
    // InternalCorrespondenceLanguage.g:883:1: rule__Commonality__Group__8 : rule__Commonality__Group__8__Impl ;
    public final void rule__Commonality__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:887:1: ( rule__Commonality__Group__8__Impl )
            // InternalCorrespondenceLanguage.g:888:2: rule__Commonality__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commonality__Group__8__Impl();

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
    // $ANTLR end "rule__Commonality__Group__8"


    // $ANTLR start "rule__Commonality__Group__8__Impl"
    // InternalCorrespondenceLanguage.g:894:1: rule__Commonality__Group__8__Impl : ( ';' ) ;
    public final void rule__Commonality__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:898:1: ( ( ';' ) )
            // InternalCorrespondenceLanguage.g:899:1: ( ';' )
            {
            // InternalCorrespondenceLanguage.g:899:1: ( ';' )
            // InternalCorrespondenceLanguage.g:900:2: ';'
            {
             before(grammarAccess.getCommonalityAccess().getSemicolonKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__Commonality__Group__8__Impl"


    // $ANTLR start "rule__Commonality__Group_3__0"
    // InternalCorrespondenceLanguage.g:910:1: rule__Commonality__Group_3__0 : rule__Commonality__Group_3__0__Impl rule__Commonality__Group_3__1 ;
    public final void rule__Commonality__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:914:1: ( rule__Commonality__Group_3__0__Impl rule__Commonality__Group_3__1 )
            // InternalCorrespondenceLanguage.g:915:2: rule__Commonality__Group_3__0__Impl rule__Commonality__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Commonality__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group_3__1();

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
    // $ANTLR end "rule__Commonality__Group_3__0"


    // $ANTLR start "rule__Commonality__Group_3__0__Impl"
    // InternalCorrespondenceLanguage.g:922:1: rule__Commonality__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Commonality__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:926:1: ( ( ',' ) )
            // InternalCorrespondenceLanguage.g:927:1: ( ',' )
            {
            // InternalCorrespondenceLanguage.g:927:1: ( ',' )
            // InternalCorrespondenceLanguage.g:928:2: ','
            {
             before(grammarAccess.getCommonalityAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Commonality__Group_3__0__Impl"


    // $ANTLR start "rule__Commonality__Group_3__1"
    // InternalCorrespondenceLanguage.g:937:1: rule__Commonality__Group_3__1 : rule__Commonality__Group_3__1__Impl ;
    public final void rule__Commonality__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:941:1: ( rule__Commonality__Group_3__1__Impl )
            // InternalCorrespondenceLanguage.g:942:2: rule__Commonality__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commonality__Group_3__1__Impl();

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
    // $ANTLR end "rule__Commonality__Group_3__1"


    // $ANTLR start "rule__Commonality__Group_3__1__Impl"
    // InternalCorrespondenceLanguage.g:948:1: rule__Commonality__Group_3__1__Impl : ( ( rule__Commonality__ElementsAssignment_3_1 ) ) ;
    public final void rule__Commonality__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:952:1: ( ( ( rule__Commonality__ElementsAssignment_3_1 ) ) )
            // InternalCorrespondenceLanguage.g:953:1: ( ( rule__Commonality__ElementsAssignment_3_1 ) )
            {
            // InternalCorrespondenceLanguage.g:953:1: ( ( rule__Commonality__ElementsAssignment_3_1 ) )
            // InternalCorrespondenceLanguage.g:954:2: ( rule__Commonality__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getCommonalityAccess().getElementsAssignment_3_1()); 
            // InternalCorrespondenceLanguage.g:955:2: ( rule__Commonality__ElementsAssignment_3_1 )
            // InternalCorrespondenceLanguage.g:955:3: rule__Commonality__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Commonality__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCommonalityAccess().getElementsAssignment_3_1()); 

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
    // $ANTLR end "rule__Commonality__Group_3__1__Impl"


    // $ANTLR start "rule__Commonality__Group_7__0"
    // InternalCorrespondenceLanguage.g:964:1: rule__Commonality__Group_7__0 : rule__Commonality__Group_7__0__Impl rule__Commonality__Group_7__1 ;
    public final void rule__Commonality__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:968:1: ( rule__Commonality__Group_7__0__Impl rule__Commonality__Group_7__1 )
            // InternalCorrespondenceLanguage.g:969:2: rule__Commonality__Group_7__0__Impl rule__Commonality__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Commonality__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group_7__1();

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
    // $ANTLR end "rule__Commonality__Group_7__0"


    // $ANTLR start "rule__Commonality__Group_7__0__Impl"
    // InternalCorrespondenceLanguage.g:976:1: rule__Commonality__Group_7__0__Impl : ( 'with' ) ;
    public final void rule__Commonality__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:980:1: ( ( 'with' ) )
            // InternalCorrespondenceLanguage.g:981:1: ( 'with' )
            {
            // InternalCorrespondenceLanguage.g:981:1: ( 'with' )
            // InternalCorrespondenceLanguage.g:982:2: 'with'
            {
             before(grammarAccess.getCommonalityAccess().getWithKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getWithKeyword_7_0()); 

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
    // $ANTLR end "rule__Commonality__Group_7__0__Impl"


    // $ANTLR start "rule__Commonality__Group_7__1"
    // InternalCorrespondenceLanguage.g:991:1: rule__Commonality__Group_7__1 : rule__Commonality__Group_7__1__Impl rule__Commonality__Group_7__2 ;
    public final void rule__Commonality__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:995:1: ( rule__Commonality__Group_7__1__Impl rule__Commonality__Group_7__2 )
            // InternalCorrespondenceLanguage.g:996:2: rule__Commonality__Group_7__1__Impl rule__Commonality__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__Commonality__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group_7__2();

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
    // $ANTLR end "rule__Commonality__Group_7__1"


    // $ANTLR start "rule__Commonality__Group_7__1__Impl"
    // InternalCorrespondenceLanguage.g:1003:1: rule__Commonality__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Commonality__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1007:1: ( ( '{' ) )
            // InternalCorrespondenceLanguage.g:1008:1: ( '{' )
            {
            // InternalCorrespondenceLanguage.g:1008:1: ( '{' )
            // InternalCorrespondenceLanguage.g:1009:2: '{'
            {
             before(grammarAccess.getCommonalityAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Commonality__Group_7__1__Impl"


    // $ANTLR start "rule__Commonality__Group_7__2"
    // InternalCorrespondenceLanguage.g:1018:1: rule__Commonality__Group_7__2 : rule__Commonality__Group_7__2__Impl rule__Commonality__Group_7__3 ;
    public final void rule__Commonality__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1022:1: ( rule__Commonality__Group_7__2__Impl rule__Commonality__Group_7__3 )
            // InternalCorrespondenceLanguage.g:1023:2: rule__Commonality__Group_7__2__Impl rule__Commonality__Group_7__3
            {
            pushFollow(FOLLOW_16);
            rule__Commonality__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commonality__Group_7__3();

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
    // $ANTLR end "rule__Commonality__Group_7__2"


    // $ANTLR start "rule__Commonality__Group_7__2__Impl"
    // InternalCorrespondenceLanguage.g:1030:1: rule__Commonality__Group_7__2__Impl : ( ( rule__Commonality__SubCommsAssignment_7_2 )* ) ;
    public final void rule__Commonality__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1034:1: ( ( ( rule__Commonality__SubCommsAssignment_7_2 )* ) )
            // InternalCorrespondenceLanguage.g:1035:1: ( ( rule__Commonality__SubCommsAssignment_7_2 )* )
            {
            // InternalCorrespondenceLanguage.g:1035:1: ( ( rule__Commonality__SubCommsAssignment_7_2 )* )
            // InternalCorrespondenceLanguage.g:1036:2: ( rule__Commonality__SubCommsAssignment_7_2 )*
            {
             before(grammarAccess.getCommonalityAccess().getSubCommsAssignment_7_2()); 
            // InternalCorrespondenceLanguage.g:1037:2: ( rule__Commonality__SubCommsAssignment_7_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:1037:3: rule__Commonality__SubCommsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Commonality__SubCommsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCommonalityAccess().getSubCommsAssignment_7_2()); 

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
    // $ANTLR end "rule__Commonality__Group_7__2__Impl"


    // $ANTLR start "rule__Commonality__Group_7__3"
    // InternalCorrespondenceLanguage.g:1045:1: rule__Commonality__Group_7__3 : rule__Commonality__Group_7__3__Impl ;
    public final void rule__Commonality__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1049:1: ( rule__Commonality__Group_7__3__Impl )
            // InternalCorrespondenceLanguage.g:1050:2: rule__Commonality__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commonality__Group_7__3__Impl();

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
    // $ANTLR end "rule__Commonality__Group_7__3"


    // $ANTLR start "rule__Commonality__Group_7__3__Impl"
    // InternalCorrespondenceLanguage.g:1056:1: rule__Commonality__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Commonality__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1060:1: ( ( '}' ) )
            // InternalCorrespondenceLanguage.g:1061:1: ( '}' )
            {
            // InternalCorrespondenceLanguage.g:1061:1: ( '}' )
            // InternalCorrespondenceLanguage.g:1062:2: '}'
            {
             before(grammarAccess.getCommonalityAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__Commonality__Group_7__3__Impl"


    // $ANTLR start "rule__SubCommonality__Group__0"
    // InternalCorrespondenceLanguage.g:1072:1: rule__SubCommonality__Group__0 : rule__SubCommonality__Group__0__Impl rule__SubCommonality__Group__1 ;
    public final void rule__SubCommonality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1076:1: ( rule__SubCommonality__Group__0__Impl rule__SubCommonality__Group__1 )
            // InternalCorrespondenceLanguage.g:1077:2: rule__SubCommonality__Group__0__Impl rule__SubCommonality__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SubCommonality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group__1();

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
    // $ANTLR end "rule__SubCommonality__Group__0"


    // $ANTLR start "rule__SubCommonality__Group__0__Impl"
    // InternalCorrespondenceLanguage.g:1084:1: rule__SubCommonality__Group__0__Impl : ( 'relate' ) ;
    public final void rule__SubCommonality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1088:1: ( ( 'relate' ) )
            // InternalCorrespondenceLanguage.g:1089:1: ( 'relate' )
            {
            // InternalCorrespondenceLanguage.g:1089:1: ( 'relate' )
            // InternalCorrespondenceLanguage.g:1090:2: 'relate'
            {
             before(grammarAccess.getSubCommonalityAccess().getRelateKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSubCommonalityAccess().getRelateKeyword_0()); 

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
    // $ANTLR end "rule__SubCommonality__Group__0__Impl"


    // $ANTLR start "rule__SubCommonality__Group__1"
    // InternalCorrespondenceLanguage.g:1099:1: rule__SubCommonality__Group__1 : rule__SubCommonality__Group__1__Impl rule__SubCommonality__Group__2 ;
    public final void rule__SubCommonality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1103:1: ( rule__SubCommonality__Group__1__Impl rule__SubCommonality__Group__2 )
            // InternalCorrespondenceLanguage.g:1104:2: rule__SubCommonality__Group__1__Impl rule__SubCommonality__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SubCommonality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group__2();

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
    // $ANTLR end "rule__SubCommonality__Group__1"


    // $ANTLR start "rule__SubCommonality__Group__1__Impl"
    // InternalCorrespondenceLanguage.g:1111:1: rule__SubCommonality__Group__1__Impl : ( '(' ) ;
    public final void rule__SubCommonality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1115:1: ( ( '(' ) )
            // InternalCorrespondenceLanguage.g:1116:1: ( '(' )
            {
            // InternalCorrespondenceLanguage.g:1116:1: ( '(' )
            // InternalCorrespondenceLanguage.g:1117:2: '('
            {
             before(grammarAccess.getSubCommonalityAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSubCommonalityAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SubCommonality__Group__1__Impl"


    // $ANTLR start "rule__SubCommonality__Group__2"
    // InternalCorrespondenceLanguage.g:1126:1: rule__SubCommonality__Group__2 : rule__SubCommonality__Group__2__Impl rule__SubCommonality__Group__3 ;
    public final void rule__SubCommonality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1130:1: ( rule__SubCommonality__Group__2__Impl rule__SubCommonality__Group__3 )
            // InternalCorrespondenceLanguage.g:1131:2: rule__SubCommonality__Group__2__Impl rule__SubCommonality__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SubCommonality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group__3();

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
    // $ANTLR end "rule__SubCommonality__Group__2"


    // $ANTLR start "rule__SubCommonality__Group__2__Impl"
    // InternalCorrespondenceLanguage.g:1138:1: rule__SubCommonality__Group__2__Impl : ( ( rule__SubCommonality__ElementsAssignment_2 ) ) ;
    public final void rule__SubCommonality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1142:1: ( ( ( rule__SubCommonality__ElementsAssignment_2 ) ) )
            // InternalCorrespondenceLanguage.g:1143:1: ( ( rule__SubCommonality__ElementsAssignment_2 ) )
            {
            // InternalCorrespondenceLanguage.g:1143:1: ( ( rule__SubCommonality__ElementsAssignment_2 ) )
            // InternalCorrespondenceLanguage.g:1144:2: ( rule__SubCommonality__ElementsAssignment_2 )
            {
             before(grammarAccess.getSubCommonalityAccess().getElementsAssignment_2()); 
            // InternalCorrespondenceLanguage.g:1145:2: ( rule__SubCommonality__ElementsAssignment_2 )
            // InternalCorrespondenceLanguage.g:1145:3: rule__SubCommonality__ElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubCommonality__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubCommonalityAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__SubCommonality__Group__2__Impl"


    // $ANTLR start "rule__SubCommonality__Group__3"
    // InternalCorrespondenceLanguage.g:1153:1: rule__SubCommonality__Group__3 : rule__SubCommonality__Group__3__Impl rule__SubCommonality__Group__4 ;
    public final void rule__SubCommonality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1157:1: ( rule__SubCommonality__Group__3__Impl rule__SubCommonality__Group__4 )
            // InternalCorrespondenceLanguage.g:1158:2: rule__SubCommonality__Group__3__Impl rule__SubCommonality__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SubCommonality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group__4();

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
    // $ANTLR end "rule__SubCommonality__Group__3"


    // $ANTLR start "rule__SubCommonality__Group__3__Impl"
    // InternalCorrespondenceLanguage.g:1165:1: rule__SubCommonality__Group__3__Impl : ( ( ( rule__SubCommonality__Group_3__0 ) ) ( ( rule__SubCommonality__Group_3__0 )* ) ) ;
    public final void rule__SubCommonality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1169:1: ( ( ( ( rule__SubCommonality__Group_3__0 ) ) ( ( rule__SubCommonality__Group_3__0 )* ) ) )
            // InternalCorrespondenceLanguage.g:1170:1: ( ( ( rule__SubCommonality__Group_3__0 ) ) ( ( rule__SubCommonality__Group_3__0 )* ) )
            {
            // InternalCorrespondenceLanguage.g:1170:1: ( ( ( rule__SubCommonality__Group_3__0 ) ) ( ( rule__SubCommonality__Group_3__0 )* ) )
            // InternalCorrespondenceLanguage.g:1171:2: ( ( rule__SubCommonality__Group_3__0 ) ) ( ( rule__SubCommonality__Group_3__0 )* )
            {
            // InternalCorrespondenceLanguage.g:1171:2: ( ( rule__SubCommonality__Group_3__0 ) )
            // InternalCorrespondenceLanguage.g:1172:3: ( rule__SubCommonality__Group_3__0 )
            {
             before(grammarAccess.getSubCommonalityAccess().getGroup_3()); 
            // InternalCorrespondenceLanguage.g:1173:3: ( rule__SubCommonality__Group_3__0 )
            // InternalCorrespondenceLanguage.g:1173:4: rule__SubCommonality__Group_3__0
            {
            pushFollow(FOLLOW_7);
            rule__SubCommonality__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getSubCommonalityAccess().getGroup_3()); 

            }

            // InternalCorrespondenceLanguage.g:1176:2: ( ( rule__SubCommonality__Group_3__0 )* )
            // InternalCorrespondenceLanguage.g:1177:3: ( rule__SubCommonality__Group_3__0 )*
            {
             before(grammarAccess.getSubCommonalityAccess().getGroup_3()); 
            // InternalCorrespondenceLanguage.g:1178:3: ( rule__SubCommonality__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCorrespondenceLanguage.g:1178:4: rule__SubCommonality__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SubCommonality__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSubCommonalityAccess().getGroup_3()); 

            }


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
    // $ANTLR end "rule__SubCommonality__Group__3__Impl"


    // $ANTLR start "rule__SubCommonality__Group__4"
    // InternalCorrespondenceLanguage.g:1187:1: rule__SubCommonality__Group__4 : rule__SubCommonality__Group__4__Impl rule__SubCommonality__Group__5 ;
    public final void rule__SubCommonality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1191:1: ( rule__SubCommonality__Group__4__Impl rule__SubCommonality__Group__5 )
            // InternalCorrespondenceLanguage.g:1192:2: rule__SubCommonality__Group__4__Impl rule__SubCommonality__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__SubCommonality__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group__5();

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
    // $ANTLR end "rule__SubCommonality__Group__4"


    // $ANTLR start "rule__SubCommonality__Group__4__Impl"
    // InternalCorrespondenceLanguage.g:1199:1: rule__SubCommonality__Group__4__Impl : ( ')' ) ;
    public final void rule__SubCommonality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1203:1: ( ( ')' ) )
            // InternalCorrespondenceLanguage.g:1204:1: ( ')' )
            {
            // InternalCorrespondenceLanguage.g:1204:1: ( ')' )
            // InternalCorrespondenceLanguage.g:1205:2: ')'
            {
             before(grammarAccess.getSubCommonalityAccess().getRightParenthesisKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSubCommonalityAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__SubCommonality__Group__4__Impl"


    // $ANTLR start "rule__SubCommonality__Group__5"
    // InternalCorrespondenceLanguage.g:1214:1: rule__SubCommonality__Group__5 : rule__SubCommonality__Group__5__Impl rule__SubCommonality__Group__6 ;
    public final void rule__SubCommonality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1218:1: ( rule__SubCommonality__Group__5__Impl rule__SubCommonality__Group__6 )
            // InternalCorrespondenceLanguage.g:1219:2: rule__SubCommonality__Group__5__Impl rule__SubCommonality__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__SubCommonality__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group__6();

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
    // $ANTLR end "rule__SubCommonality__Group__5"


    // $ANTLR start "rule__SubCommonality__Group__5__Impl"
    // InternalCorrespondenceLanguage.g:1226:1: rule__SubCommonality__Group__5__Impl : ( 'as' ) ;
    public final void rule__SubCommonality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1230:1: ( ( 'as' ) )
            // InternalCorrespondenceLanguage.g:1231:1: ( 'as' )
            {
            // InternalCorrespondenceLanguage.g:1231:1: ( 'as' )
            // InternalCorrespondenceLanguage.g:1232:2: 'as'
            {
             before(grammarAccess.getSubCommonalityAccess().getAsKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubCommonalityAccess().getAsKeyword_5()); 

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
    // $ANTLR end "rule__SubCommonality__Group__5__Impl"


    // $ANTLR start "rule__SubCommonality__Group__6"
    // InternalCorrespondenceLanguage.g:1241:1: rule__SubCommonality__Group__6 : rule__SubCommonality__Group__6__Impl rule__SubCommonality__Group__7 ;
    public final void rule__SubCommonality__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1245:1: ( rule__SubCommonality__Group__6__Impl rule__SubCommonality__Group__7 )
            // InternalCorrespondenceLanguage.g:1246:2: rule__SubCommonality__Group__6__Impl rule__SubCommonality__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__SubCommonality__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group__7();

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
    // $ANTLR end "rule__SubCommonality__Group__6"


    // $ANTLR start "rule__SubCommonality__Group__6__Impl"
    // InternalCorrespondenceLanguage.g:1253:1: rule__SubCommonality__Group__6__Impl : ( ( rule__SubCommonality__NameAssignment_6 ) ) ;
    public final void rule__SubCommonality__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1257:1: ( ( ( rule__SubCommonality__NameAssignment_6 ) ) )
            // InternalCorrespondenceLanguage.g:1258:1: ( ( rule__SubCommonality__NameAssignment_6 ) )
            {
            // InternalCorrespondenceLanguage.g:1258:1: ( ( rule__SubCommonality__NameAssignment_6 ) )
            // InternalCorrespondenceLanguage.g:1259:2: ( rule__SubCommonality__NameAssignment_6 )
            {
             before(grammarAccess.getSubCommonalityAccess().getNameAssignment_6()); 
            // InternalCorrespondenceLanguage.g:1260:2: ( rule__SubCommonality__NameAssignment_6 )
            // InternalCorrespondenceLanguage.g:1260:3: rule__SubCommonality__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SubCommonality__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSubCommonalityAccess().getNameAssignment_6()); 

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
    // $ANTLR end "rule__SubCommonality__Group__6__Impl"


    // $ANTLR start "rule__SubCommonality__Group__7"
    // InternalCorrespondenceLanguage.g:1268:1: rule__SubCommonality__Group__7 : rule__SubCommonality__Group__7__Impl ;
    public final void rule__SubCommonality__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1272:1: ( rule__SubCommonality__Group__7__Impl )
            // InternalCorrespondenceLanguage.g:1273:2: rule__SubCommonality__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group__7__Impl();

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
    // $ANTLR end "rule__SubCommonality__Group__7"


    // $ANTLR start "rule__SubCommonality__Group__7__Impl"
    // InternalCorrespondenceLanguage.g:1279:1: rule__SubCommonality__Group__7__Impl : ( ';' ) ;
    public final void rule__SubCommonality__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1283:1: ( ( ';' ) )
            // InternalCorrespondenceLanguage.g:1284:1: ( ';' )
            {
            // InternalCorrespondenceLanguage.g:1284:1: ( ';' )
            // InternalCorrespondenceLanguage.g:1285:2: ';'
            {
             before(grammarAccess.getSubCommonalityAccess().getSemicolonKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubCommonalityAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__SubCommonality__Group__7__Impl"


    // $ANTLR start "rule__SubCommonality__Group_3__0"
    // InternalCorrespondenceLanguage.g:1295:1: rule__SubCommonality__Group_3__0 : rule__SubCommonality__Group_3__0__Impl rule__SubCommonality__Group_3__1 ;
    public final void rule__SubCommonality__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1299:1: ( rule__SubCommonality__Group_3__0__Impl rule__SubCommonality__Group_3__1 )
            // InternalCorrespondenceLanguage.g:1300:2: rule__SubCommonality__Group_3__0__Impl rule__SubCommonality__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SubCommonality__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group_3__1();

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
    // $ANTLR end "rule__SubCommonality__Group_3__0"


    // $ANTLR start "rule__SubCommonality__Group_3__0__Impl"
    // InternalCorrespondenceLanguage.g:1307:1: rule__SubCommonality__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SubCommonality__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1311:1: ( ( ',' ) )
            // InternalCorrespondenceLanguage.g:1312:1: ( ',' )
            {
            // InternalCorrespondenceLanguage.g:1312:1: ( ',' )
            // InternalCorrespondenceLanguage.g:1313:2: ','
            {
             before(grammarAccess.getSubCommonalityAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubCommonalityAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__SubCommonality__Group_3__0__Impl"


    // $ANTLR start "rule__SubCommonality__Group_3__1"
    // InternalCorrespondenceLanguage.g:1322:1: rule__SubCommonality__Group_3__1 : rule__SubCommonality__Group_3__1__Impl ;
    public final void rule__SubCommonality__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1326:1: ( rule__SubCommonality__Group_3__1__Impl )
            // InternalCorrespondenceLanguage.g:1327:2: rule__SubCommonality__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubCommonality__Group_3__1__Impl();

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
    // $ANTLR end "rule__SubCommonality__Group_3__1"


    // $ANTLR start "rule__SubCommonality__Group_3__1__Impl"
    // InternalCorrespondenceLanguage.g:1333:1: rule__SubCommonality__Group_3__1__Impl : ( ( rule__SubCommonality__ElementsAssignment_3_1 ) ) ;
    public final void rule__SubCommonality__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1337:1: ( ( ( rule__SubCommonality__ElementsAssignment_3_1 ) ) )
            // InternalCorrespondenceLanguage.g:1338:1: ( ( rule__SubCommonality__ElementsAssignment_3_1 ) )
            {
            // InternalCorrespondenceLanguage.g:1338:1: ( ( rule__SubCommonality__ElementsAssignment_3_1 ) )
            // InternalCorrespondenceLanguage.g:1339:2: ( rule__SubCommonality__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getSubCommonalityAccess().getElementsAssignment_3_1()); 
            // InternalCorrespondenceLanguage.g:1340:2: ( rule__SubCommonality__ElementsAssignment_3_1 )
            // InternalCorrespondenceLanguage.g:1340:3: rule__SubCommonality__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SubCommonality__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubCommonalityAccess().getElementsAssignment_3_1()); 

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
    // $ANTLR end "rule__SubCommonality__Group_3__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalCorrespondenceLanguage.g:1349:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1353:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalCorrespondenceLanguage.g:1354:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalCorrespondenceLanguage.g:1361:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1365:1: ( ( 'constraint' ) )
            // InternalCorrespondenceLanguage.g:1366:1: ( 'constraint' )
            {
            // InternalCorrespondenceLanguage.g:1366:1: ( 'constraint' )
            // InternalCorrespondenceLanguage.g:1367:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalCorrespondenceLanguage.g:1376:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1380:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalCorrespondenceLanguage.g:1381:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalCorrespondenceLanguage.g:1388:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1392:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalCorrespondenceLanguage.g:1393:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalCorrespondenceLanguage.g:1393:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalCorrespondenceLanguage.g:1394:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalCorrespondenceLanguage.g:1395:2: ( rule__Constraint__NameAssignment_1 )
            // InternalCorrespondenceLanguage.g:1395:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalCorrespondenceLanguage.g:1403:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1407:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalCorrespondenceLanguage.g:1408:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalCorrespondenceLanguage.g:1415:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1419:1: ( ( '{' ) )
            // InternalCorrespondenceLanguage.g:1420:1: ( '{' )
            {
            // InternalCorrespondenceLanguage.g:1420:1: ( '{' )
            // InternalCorrespondenceLanguage.g:1421:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalCorrespondenceLanguage.g:1430:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1434:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalCorrespondenceLanguage.g:1435:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

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
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalCorrespondenceLanguage.g:1442:1: rule__Constraint__Group__3__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1446:1: ( ( '}' ) )
            // InternalCorrespondenceLanguage.g:1447:1: ( '}' )
            {
            // InternalCorrespondenceLanguage.g:1447:1: ( '}' )
            // InternalCorrespondenceLanguage.g:1448:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalCorrespondenceLanguage.g:1457:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1461:1: ( rule__Constraint__Group__4__Impl )
            // InternalCorrespondenceLanguage.g:1462:2: rule__Constraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4__Impl();

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
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalCorrespondenceLanguage.g:1468:1: rule__Constraint__Group__4__Impl : ( ';' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1472:1: ( ( ';' ) )
            // InternalCorrespondenceLanguage.g:1473:1: ( ';' )
            {
            // InternalCorrespondenceLanguage.g:1473:1: ( ';' )
            // InternalCorrespondenceLanguage.g:1474:2: ';'
            {
             before(grammarAccess.getConstraintAccess().getSemicolonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Correspondence__ModelSpaceAssignment_2"
    // InternalCorrespondenceLanguage.g:1484:1: rule__Correspondence__ModelSpaceAssignment_2 : ( ruleMetamodel ) ;
    public final void rule__Correspondence__ModelSpaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1488:1: ( ( ruleMetamodel ) )
            // InternalCorrespondenceLanguage.g:1489:2: ( ruleMetamodel )
            {
            // InternalCorrespondenceLanguage.g:1489:2: ( ruleMetamodel )
            // InternalCorrespondenceLanguage.g:1490:3: ruleMetamodel
            {
             before(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Correspondence__ModelSpaceAssignment_2"


    // $ANTLR start "rule__Correspondence__ModelSpaceAssignment_3_1"
    // InternalCorrespondenceLanguage.g:1499:1: rule__Correspondence__ModelSpaceAssignment_3_1 : ( ruleMetamodel ) ;
    public final void rule__Correspondence__ModelSpaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1503:1: ( ( ruleMetamodel ) )
            // InternalCorrespondenceLanguage.g:1504:2: ( ruleMetamodel )
            {
            // InternalCorrespondenceLanguage.g:1504:2: ( ruleMetamodel )
            // InternalCorrespondenceLanguage.g:1505:3: ruleMetamodel
            {
             before(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Correspondence__ModelSpaceAssignment_3_1"


    // $ANTLR start "rule__Correspondence__ElementsAssignment_6"
    // InternalCorrespondenceLanguage.g:1514:1: rule__Correspondence__ElementsAssignment_6 : ( ruleCorrElement ) ;
    public final void rule__Correspondence__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1518:1: ( ( ruleCorrElement ) )
            // InternalCorrespondenceLanguage.g:1519:2: ( ruleCorrElement )
            {
            // InternalCorrespondenceLanguage.g:1519:2: ( ruleCorrElement )
            // InternalCorrespondenceLanguage.g:1520:3: ruleCorrElement
            {
             before(grammarAccess.getCorrespondenceAccess().getElementsCorrElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCorrElement();

            state._fsp--;

             after(grammarAccess.getCorrespondenceAccess().getElementsCorrElementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Correspondence__ElementsAssignment_6"


    // $ANTLR start "rule__Metamodel__ImportedNamespaceAssignment"
    // InternalCorrespondenceLanguage.g:1529:1: rule__Metamodel__ImportedNamespaceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Metamodel__ImportedNamespaceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1533:1: ( ( ( RULE_ID ) ) )
            // InternalCorrespondenceLanguage.g:1534:2: ( ( RULE_ID ) )
            {
            // InternalCorrespondenceLanguage.g:1534:2: ( ( RULE_ID ) )
            // InternalCorrespondenceLanguage.g:1535:3: ( RULE_ID )
            {
             before(grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageCrossReference_0()); 
            // InternalCorrespondenceLanguage.g:1536:3: ( RULE_ID )
            // InternalCorrespondenceLanguage.g:1537:4: RULE_ID
            {
             before(grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageCrossReference_0()); 

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
    // $ANTLR end "rule__Metamodel__ImportedNamespaceAssignment"


    // $ANTLR start "rule__Commonality__ElementsAssignment_2"
    // InternalCorrespondenceLanguage.g:1548:1: rule__Commonality__ElementsAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Commonality__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1552:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCorrespondenceLanguage.g:1553:2: ( ( ruleQualifiedName ) )
            {
            // InternalCorrespondenceLanguage.g:1553:2: ( ( ruleQualifiedName ) )
            // InternalCorrespondenceLanguage.g:1554:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_2_0()); 
            // InternalCorrespondenceLanguage.g:1555:3: ( ruleQualifiedName )
            // InternalCorrespondenceLanguage.g:1556:4: ruleQualifiedName
            {
             before(grammarAccess.getCommonalityAccess().getElementsEClassifierQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCommonalityAccess().getElementsEClassifierQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_2_0()); 

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
    // $ANTLR end "rule__Commonality__ElementsAssignment_2"


    // $ANTLR start "rule__Commonality__ElementsAssignment_3_1"
    // InternalCorrespondenceLanguage.g:1567:1: rule__Commonality__ElementsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Commonality__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1571:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCorrespondenceLanguage.g:1572:2: ( ( ruleQualifiedName ) )
            {
            // InternalCorrespondenceLanguage.g:1572:2: ( ( ruleQualifiedName ) )
            // InternalCorrespondenceLanguage.g:1573:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_3_1_0()); 
            // InternalCorrespondenceLanguage.g:1574:3: ( ruleQualifiedName )
            // InternalCorrespondenceLanguage.g:1575:4: ruleQualifiedName
            {
             before(grammarAccess.getCommonalityAccess().getElementsEClassifierQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCommonalityAccess().getElementsEClassifierQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Commonality__ElementsAssignment_3_1"


    // $ANTLR start "rule__Commonality__NameAssignment_6"
    // InternalCorrespondenceLanguage.g:1586:1: rule__Commonality__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Commonality__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1590:1: ( ( RULE_ID ) )
            // InternalCorrespondenceLanguage.g:1591:2: ( RULE_ID )
            {
            // InternalCorrespondenceLanguage.g:1591:2: ( RULE_ID )
            // InternalCorrespondenceLanguage.g:1592:3: RULE_ID
            {
             before(grammarAccess.getCommonalityAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommonalityAccess().getNameIDTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Commonality__NameAssignment_6"


    // $ANTLR start "rule__Commonality__SubCommsAssignment_7_2"
    // InternalCorrespondenceLanguage.g:1601:1: rule__Commonality__SubCommsAssignment_7_2 : ( ruleSubCommonality ) ;
    public final void rule__Commonality__SubCommsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1605:1: ( ( ruleSubCommonality ) )
            // InternalCorrespondenceLanguage.g:1606:2: ( ruleSubCommonality )
            {
            // InternalCorrespondenceLanguage.g:1606:2: ( ruleSubCommonality )
            // InternalCorrespondenceLanguage.g:1607:3: ruleSubCommonality
            {
             before(grammarAccess.getCommonalityAccess().getSubCommsSubCommonalityParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubCommonality();

            state._fsp--;

             after(grammarAccess.getCommonalityAccess().getSubCommsSubCommonalityParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Commonality__SubCommsAssignment_7_2"


    // $ANTLR start "rule__SubCommonality__ElementsAssignment_2"
    // InternalCorrespondenceLanguage.g:1616:1: rule__SubCommonality__ElementsAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SubCommonality__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1620:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCorrespondenceLanguage.g:1621:2: ( ( ruleQualifiedName ) )
            {
            // InternalCorrespondenceLanguage.g:1621:2: ( ( ruleQualifiedName ) )
            // InternalCorrespondenceLanguage.g:1622:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_2_0()); 
            // InternalCorrespondenceLanguage.g:1623:3: ( ruleQualifiedName )
            // InternalCorrespondenceLanguage.g:1624:4: ruleQualifiedName
            {
             before(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_2_0()); 

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
    // $ANTLR end "rule__SubCommonality__ElementsAssignment_2"


    // $ANTLR start "rule__SubCommonality__ElementsAssignment_3_1"
    // InternalCorrespondenceLanguage.g:1635:1: rule__SubCommonality__ElementsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SubCommonality__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1639:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCorrespondenceLanguage.g:1640:2: ( ( ruleQualifiedName ) )
            {
            // InternalCorrespondenceLanguage.g:1640:2: ( ( ruleQualifiedName ) )
            // InternalCorrespondenceLanguage.g:1641:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_3_1_0()); 
            // InternalCorrespondenceLanguage.g:1642:3: ( ruleQualifiedName )
            // InternalCorrespondenceLanguage.g:1643:4: ruleQualifiedName
            {
             before(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__SubCommonality__ElementsAssignment_3_1"


    // $ANTLR start "rule__SubCommonality__NameAssignment_6"
    // InternalCorrespondenceLanguage.g:1654:1: rule__SubCommonality__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__SubCommonality__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1658:1: ( ( RULE_ID ) )
            // InternalCorrespondenceLanguage.g:1659:2: ( RULE_ID )
            {
            // InternalCorrespondenceLanguage.g:1659:2: ( RULE_ID )
            // InternalCorrespondenceLanguage.g:1660:3: RULE_ID
            {
             before(grammarAccess.getSubCommonalityAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubCommonalityAccess().getNameIDTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__SubCommonality__NameAssignment_6"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalCorrespondenceLanguage.g:1669:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCorrespondenceLanguage.g:1673:1: ( ( RULE_ID ) )
            // InternalCorrespondenceLanguage.g:1674:2: ( RULE_ID )
            {
            // InternalCorrespondenceLanguage.g:1674:2: ( RULE_ID )
            // InternalCorrespondenceLanguage.g:1675:3: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constraint__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000488000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});

}