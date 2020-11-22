/*
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.serializer;

import com.google.inject.Inject;
import java.util.Set;
import no.hvl.past.corrlang.correspondenceLanguage.Commonality;
import no.hvl.past.corrlang.correspondenceLanguage.Constraint;
import no.hvl.past.corrlang.correspondenceLanguage.Correspondence;
import no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage;
import no.hvl.past.corrlang.correspondenceLanguage.Metamodel;
import no.hvl.past.corrlang.correspondenceLanguage.SubCommonality;
import no.hvl.past.corrlang.services.CorrespondenceLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CorrespondenceLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CorrespondenceLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CorrespondenceLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CorrespondenceLanguagePackage.COMMONALITY:
				sequence_Commonality(context, (Commonality) semanticObject); 
				return; 
			case CorrespondenceLanguagePackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case CorrespondenceLanguagePackage.CORRESPONDENCE:
				sequence_Correspondence(context, (Correspondence) semanticObject); 
				return; 
			case CorrespondenceLanguagePackage.METAMODEL:
				sequence_Metamodel(context, (Metamodel) semanticObject); 
				return; 
			case CorrespondenceLanguagePackage.SUB_COMMONALITY:
				sequence_SubCommonality(context, (SubCommonality) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CorrElement returns Commonality
	 *     Commonality returns Commonality
	 *
	 * Constraint:
	 *     (elements+=[EClassifier|QualifiedName] elements+=[EClassifier|QualifiedName]+ name=ID subComms+=SubCommonality*)
	 */
	protected void sequence_Commonality(ISerializationContext context, Commonality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CorrElement returns Constraint
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorrespondenceLanguagePackage.Literals.CORR_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorrespondenceLanguagePackage.Literals.CORR_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Correspondence returns Correspondence
	 *
	 * Constraint:
	 *     (modelSpace+=Metamodel modelSpace+=Metamodel+ elements+=CorrElement*)
	 */
	protected void sequence_Correspondence(ISerializationContext context, Correspondence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Metamodel returns Metamodel
	 *
	 * Constraint:
	 *     importedNamespace=[EPackage|ID]
	 */
	protected void sequence_Metamodel(ISerializationContext context, Metamodel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorrespondenceLanguagePackage.Literals.METAMODEL__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorrespondenceLanguagePackage.Literals.METAMODEL__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMetamodelAccess().getImportedNamespaceEPackageIDTerminalRuleCall_0_1(), semanticObject.eGet(CorrespondenceLanguagePackage.Literals.METAMODEL__IMPORTED_NAMESPACE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SubCommonality returns SubCommonality
	 *
	 * Constraint:
	 *     (elements+=[EStructuralFeature|QualifiedName] elements+=[EStructuralFeature|QualifiedName]+ name=ID)
	 */
	protected void sequence_SubCommonality(ISerializationContext context, SubCommonality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
