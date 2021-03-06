/*
 * generated by Xtext 2.19.0
 */
grammar InternalCorrespondenceLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package no.hvl.past.corrlang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCorrespondence
entryRuleCorrespondence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCorrespondenceRule()); }
	iv_ruleCorrespondence=ruleCorrespondence
	{ $current=$iv_ruleCorrespondence.current; }
	EOF;

// Rule Correspondence
ruleCorrespondence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='correspondence'
		{
			newLeafNode(otherlv_0, grammarAccess.getCorrespondenceAccess().getCorrespondenceKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getCorrespondenceAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_2_0());
				}
				lv_modelSpace_2_0=ruleMetamodel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCorrespondenceRule());
					}
					add(
						$current,
						"modelSpace",
						lv_modelSpace_2_0,
						"no.hvl.past.corrlang.CorrespondenceLanguage.Metamodel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getCorrespondenceAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_3_1_0());
					}
					lv_modelSpace_4_0=ruleMetamodel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCorrespondenceRule());
						}
						add(
							$current,
							"modelSpace",
							lv_modelSpace_4_0,
							"no.hvl.past.corrlang.CorrespondenceLanguage.Metamodel");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getCorrespondenceAccess().getRightParenthesisKeyword_4());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getCorrespondenceAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCorrespondenceAccess().getElementsCorrElementParserRuleCall_6_0());
				}
				lv_elements_7_0=ruleCorrElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCorrespondenceRule());
					}
					add(
						$current,
						"elements",
						lv_elements_7_0,
						"no.hvl.past.corrlang.CorrespondenceLanguage.CorrElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getCorrespondenceAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getCorrespondenceAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleCorrElement
entryRuleCorrElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCorrElementRule()); }
	iv_ruleCorrElement=ruleCorrElement
	{ $current=$iv_ruleCorrElement.current; }
	EOF;

// Rule CorrElement
ruleCorrElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCorrElementAccess().getCommonalityParserRuleCall_0());
		}
		this_Commonality_0=ruleCommonality
		{
			$current = $this_Commonality_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCorrElementAccess().getConstraintParserRuleCall_1());
		}
		this_Constraint_1=ruleConstraint
		{
			$current = $this_Constraint_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMetamodel
entryRuleMetamodel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetamodelRule()); }
	iv_ruleMetamodel=ruleMetamodel
	{ $current=$iv_ruleMetamodel.current; }
	EOF;

// Rule Metamodel
ruleMetamodel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getMetamodelRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleCommonality
entryRuleCommonality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommonalityRule()); }
	iv_ruleCommonality=ruleCommonality
	{ $current=$iv_ruleCommonality.current; }
	EOF;

// Rule Commonality
ruleCommonality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='relate'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommonalityAccess().getRelateKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getCommonalityAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommonalityRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getCommonalityAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCommonalityRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_3_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getCommonalityAccess().getRightParenthesisKeyword_4());
		}
		otherlv_6='as'
		{
			newLeafNode(otherlv_6, grammarAccess.getCommonalityAccess().getAsKeyword_5());
		}
		(
			(
				lv_name_7_0=RULE_ID
				{
					newLeafNode(lv_name_7_0, grammarAccess.getCommonalityAccess().getNameIDTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommonalityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_7_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_8='with'
			{
				newLeafNode(otherlv_8, grammarAccess.getCommonalityAccess().getWithKeyword_7_0());
			}
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getCommonalityAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCommonalityAccess().getSubCommsSubCommonalityParserRuleCall_7_2_0());
					}
					lv_subComms_10_0=ruleSubCommonality
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommonalityRule());
						}
						add(
							$current,
							"subComms",
							lv_subComms_10_0,
							"no.hvl.past.corrlang.CorrespondenceLanguage.SubCommonality");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getCommonalityAccess().getRightCurlyBracketKeyword_7_3());
			}
		)?
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getCommonalityAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleSubCommonality
entryRuleSubCommonality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubCommonalityRule()); }
	iv_ruleSubCommonality=ruleSubCommonality
	{ $current=$iv_ruleSubCommonality.current; }
	EOF;

// Rule SubCommonality
ruleSubCommonality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='relate'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubCommonalityAccess().getRelateKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSubCommonalityAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubCommonalityRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getSubCommonalityAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSubCommonalityRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_3_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getSubCommonalityAccess().getRightParenthesisKeyword_4());
		}
		otherlv_6='as'
		{
			newLeafNode(otherlv_6, grammarAccess.getSubCommonalityAccess().getAsKeyword_5());
		}
		(
			(
				lv_name_7_0=RULE_ID
				{
					newLeafNode(lv_name_7_0, grammarAccess.getSubCommonalityAccess().getNameIDTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubCommonalityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_7_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getSubCommonalityAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	iv_ruleConstraint=ruleConstraint
	{ $current=$iv_ruleConstraint.current; }
	EOF;

// Rule Constraint
ruleConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='constraint'
		{
			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getSemicolonKeyword_4());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
