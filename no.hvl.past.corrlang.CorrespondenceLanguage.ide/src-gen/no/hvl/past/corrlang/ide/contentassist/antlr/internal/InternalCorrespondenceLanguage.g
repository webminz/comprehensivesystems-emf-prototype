/*
 * generated by Xtext 2.19.0
 */
grammar InternalCorrespondenceLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package no.hvl.past.corrlang.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleCorrespondence
entryRuleCorrespondence
:
{ before(grammarAccess.getCorrespondenceRule()); }
	 ruleCorrespondence
{ after(grammarAccess.getCorrespondenceRule()); } 
	 EOF 
;

// Rule Correspondence
ruleCorrespondence 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCorrespondenceAccess().getGroup()); }
		(rule__Correspondence__Group__0)
		{ after(grammarAccess.getCorrespondenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCorrElement
entryRuleCorrElement
:
{ before(grammarAccess.getCorrElementRule()); }
	 ruleCorrElement
{ after(grammarAccess.getCorrElementRule()); } 
	 EOF 
;

// Rule CorrElement
ruleCorrElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCorrElementAccess().getAlternatives()); }
		(rule__CorrElement__Alternatives)
		{ after(grammarAccess.getCorrElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMetamodel
entryRuleMetamodel
:
{ before(grammarAccess.getMetamodelRule()); }
	 ruleMetamodel
{ after(grammarAccess.getMetamodelRule()); } 
	 EOF 
;

// Rule Metamodel
ruleMetamodel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMetamodelAccess().getImportedNamespaceAssignment()); }
		(rule__Metamodel__ImportedNamespaceAssignment)
		{ after(grammarAccess.getMetamodelAccess().getImportedNamespaceAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommonality
entryRuleCommonality
:
{ before(grammarAccess.getCommonalityRule()); }
	 ruleCommonality
{ after(grammarAccess.getCommonalityRule()); } 
	 EOF 
;

// Rule Commonality
ruleCommonality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommonalityAccess().getGroup()); }
		(rule__Commonality__Group__0)
		{ after(grammarAccess.getCommonalityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubCommonality
entryRuleSubCommonality
:
{ before(grammarAccess.getSubCommonalityRule()); }
	 ruleSubCommonality
{ after(grammarAccess.getSubCommonalityRule()); } 
	 EOF 
;

// Rule SubCommonality
ruleSubCommonality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubCommonalityAccess().getGroup()); }
		(rule__SubCommonality__Group__0)
		{ after(grammarAccess.getSubCommonalityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstraint
entryRuleConstraint
:
{ before(grammarAccess.getConstraintRule()); }
	 ruleConstraint
{ after(grammarAccess.getConstraintRule()); } 
	 EOF 
;

// Rule Constraint
ruleConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstraintAccess().getGroup()); }
		(rule__Constraint__Group__0)
		{ after(grammarAccess.getConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CorrElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCorrElementAccess().getCommonalityParserRuleCall_0()); }
		ruleCommonality
		{ after(grammarAccess.getCorrElementAccess().getCommonalityParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getCorrElementAccess().getConstraintParserRuleCall_1()); }
		ruleConstraint
		{ after(grammarAccess.getCorrElementAccess().getConstraintParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group__0__Impl
	rule__Correspondence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getCorrespondenceKeyword_0()); }
	'correspondence'
	{ after(grammarAccess.getCorrespondenceAccess().getCorrespondenceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group__1__Impl
	rule__Correspondence__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getCorrespondenceAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group__2__Impl
	rule__Correspondence__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getModelSpaceAssignment_2()); }
	(rule__Correspondence__ModelSpaceAssignment_2)
	{ after(grammarAccess.getCorrespondenceAccess().getModelSpaceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group__3__Impl
	rule__Correspondence__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCorrespondenceAccess().getGroup_3()); }
		(rule__Correspondence__Group_3__0)
		{ after(grammarAccess.getCorrespondenceAccess().getGroup_3()); }
	)
	(
		{ before(grammarAccess.getCorrespondenceAccess().getGroup_3()); }
		(rule__Correspondence__Group_3__0)*
		{ after(grammarAccess.getCorrespondenceAccess().getGroup_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group__4__Impl
	rule__Correspondence__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getCorrespondenceAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group__5__Impl
	rule__Correspondence__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getCorrespondenceAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group__6__Impl
	rule__Correspondence__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getElementsAssignment_6()); }
	(rule__Correspondence__ElementsAssignment_6)*
	{ after(grammarAccess.getCorrespondenceAccess().getElementsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group__7__Impl
	rule__Correspondence__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getCorrespondenceAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getCorrespondenceAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Correspondence__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group_3__0__Impl
	rule__Correspondence__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getCorrespondenceAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Correspondence__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCorrespondenceAccess().getModelSpaceAssignment_3_1()); }
	(rule__Correspondence__ModelSpaceAssignment_3_1)
	{ after(grammarAccess.getCorrespondenceAccess().getModelSpaceAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Commonality__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group__0__Impl
	rule__Commonality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getRelateKeyword_0()); }
	'relate'
	{ after(grammarAccess.getCommonalityAccess().getRelateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group__1__Impl
	rule__Commonality__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getCommonalityAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group__2__Impl
	rule__Commonality__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getElementsAssignment_2()); }
	(rule__Commonality__ElementsAssignment_2)
	{ after(grammarAccess.getCommonalityAccess().getElementsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group__3__Impl
	rule__Commonality__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCommonalityAccess().getGroup_3()); }
		(rule__Commonality__Group_3__0)
		{ after(grammarAccess.getCommonalityAccess().getGroup_3()); }
	)
	(
		{ before(grammarAccess.getCommonalityAccess().getGroup_3()); }
		(rule__Commonality__Group_3__0)*
		{ after(grammarAccess.getCommonalityAccess().getGroup_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group__4__Impl
	rule__Commonality__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getCommonalityAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group__5__Impl
	rule__Commonality__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getAsKeyword_5()); }
	'as'
	{ after(grammarAccess.getCommonalityAccess().getAsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group__6__Impl
	rule__Commonality__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getNameAssignment_6()); }
	(rule__Commonality__NameAssignment_6)
	{ after(grammarAccess.getCommonalityAccess().getNameAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group__7__Impl
	rule__Commonality__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getGroup_7()); }
	(rule__Commonality__Group_7__0)?
	{ after(grammarAccess.getCommonalityAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getCommonalityAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Commonality__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group_3__0__Impl
	rule__Commonality__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getCommonalityAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getElementsAssignment_3_1()); }
	(rule__Commonality__ElementsAssignment_3_1)
	{ after(grammarAccess.getCommonalityAccess().getElementsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Commonality__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group_7__0__Impl
	rule__Commonality__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getWithKeyword_7_0()); }
	'with'
	{ after(grammarAccess.getCommonalityAccess().getWithKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group_7__1__Impl
	rule__Commonality__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getLeftCurlyBracketKeyword_7_1()); }
	'{'
	{ after(grammarAccess.getCommonalityAccess().getLeftCurlyBracketKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group_7__2__Impl
	rule__Commonality__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getSubCommsAssignment_7_2()); }
	(rule__Commonality__SubCommsAssignment_7_2)*
	{ after(grammarAccess.getCommonalityAccess().getSubCommsAssignment_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commonality__Group_7__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommonalityAccess().getRightCurlyBracketKeyword_7_3()); }
	'}'
	{ after(grammarAccess.getCommonalityAccess().getRightCurlyBracketKeyword_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubCommonality__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group__0__Impl
	rule__SubCommonality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubCommonalityAccess().getRelateKeyword_0()); }
	'relate'
	{ after(grammarAccess.getSubCommonalityAccess().getRelateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group__1__Impl
	rule__SubCommonality__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubCommonalityAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getSubCommonalityAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group__2__Impl
	rule__SubCommonality__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubCommonalityAccess().getElementsAssignment_2()); }
	(rule__SubCommonality__ElementsAssignment_2)
	{ after(grammarAccess.getSubCommonalityAccess().getElementsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group__3__Impl
	rule__SubCommonality__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSubCommonalityAccess().getGroup_3()); }
		(rule__SubCommonality__Group_3__0)
		{ after(grammarAccess.getSubCommonalityAccess().getGroup_3()); }
	)
	(
		{ before(grammarAccess.getSubCommonalityAccess().getGroup_3()); }
		(rule__SubCommonality__Group_3__0)*
		{ after(grammarAccess.getSubCommonalityAccess().getGroup_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group__4__Impl
	rule__SubCommonality__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubCommonalityAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getSubCommonalityAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group__5__Impl
	rule__SubCommonality__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubCommonalityAccess().getAsKeyword_5()); }
	'as'
	{ after(grammarAccess.getSubCommonalityAccess().getAsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group__6__Impl
	rule__SubCommonality__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubCommonalityAccess().getNameAssignment_6()); }
	(rule__SubCommonality__NameAssignment_6)
	{ after(grammarAccess.getSubCommonalityAccess().getNameAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubCommonalityAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getSubCommonalityAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubCommonality__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group_3__0__Impl
	rule__SubCommonality__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubCommonalityAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getSubCommonalityAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubCommonality__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubCommonalityAccess().getElementsAssignment_3_1()); }
	(rule__SubCommonality__ElementsAssignment_3_1)
	{ after(grammarAccess.getSubCommonalityAccess().getElementsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Constraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraint__Group__0__Impl
	rule__Constraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); }
	'constraint'
	{ after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraint__Group__1__Impl
	rule__Constraint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintAccess().getNameAssignment_1()); }
	(rule__Constraint__NameAssignment_1)
	{ after(grammarAccess.getConstraintAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraint__Group__2__Impl
	rule__Constraint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraint__Group__3__Impl
	rule__Constraint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraint__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getConstraintAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Correspondence__ModelSpaceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_2_0()); }
		ruleMetamodel
		{ after(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__ModelSpaceAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_3_1_0()); }
		ruleMetamodel
		{ after(grammarAccess.getCorrespondenceAccess().getModelSpaceMetamodelParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Correspondence__ElementsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCorrespondenceAccess().getElementsCorrElementParserRuleCall_6_0()); }
		ruleCorrElement
		{ after(grammarAccess.getCorrespondenceAccess().getElementsCorrElementParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metamodel__ImportedNamespaceAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageCrossReference_0()); }
		(
			{ before(grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_2_0()); }
		(
			{ before(grammarAccess.getCommonalityAccess().getElementsEClassifierQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getCommonalityAccess().getElementsEClassifierQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__ElementsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getCommonalityAccess().getElementsEClassifierQualifiedNameParserRuleCall_3_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getCommonalityAccess().getElementsEClassifierQualifiedNameParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getCommonalityAccess().getElementsEClassifierCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__NameAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommonalityAccess().getNameIDTerminalRuleCall_6_0()); }
		RULE_ID
		{ after(grammarAccess.getCommonalityAccess().getNameIDTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commonality__SubCommsAssignment_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommonalityAccess().getSubCommsSubCommonalityParserRuleCall_7_2_0()); }
		ruleSubCommonality
		{ after(grammarAccess.getCommonalityAccess().getSubCommsSubCommonalityParserRuleCall_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_2_0()); }
		(
			{ before(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__ElementsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureQualifiedNameParserRuleCall_3_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureQualifiedNameParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getSubCommonalityAccess().getElementsEStructuralFeatureCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubCommonality__NameAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubCommonalityAccess().getNameIDTerminalRuleCall_6_0()); }
		RULE_ID
		{ after(grammarAccess.getSubCommonalityAccess().getNameIDTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraint__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
