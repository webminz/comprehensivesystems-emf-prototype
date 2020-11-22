package no.hvl.past.corrlang.ide;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

import no.hvl.past.corrlang.correspondenceLanguage.Commonality;
import no.hvl.past.corrlang.services.CorrespondenceLanguageGrammarAccess;

public class CorrSemanticHighlightCalculator extends DefaultSemanticHighlightingCalculator {
	
	public static class CorrDSLHiglightingStyles implements HighlightingStyles {
		public static final String ECORE_REF_STYLE_ID = KEYWORD_ID + "ECORE_REF";
	}
	
	@Inject
	CorrespondenceLanguageGrammarAccess ga;
	
	
	
	@Override
	protected boolean highlightElement(
			EObject object, 
			IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (object instanceof Commonality) {
			Assignment assignment1 = ga.getCommonalityAccess().getElementsAssignment_2();
			Assignment assignment2 = ga.getCommonalityAccess().getElementsAssignment_2();
			for (ILeafNode n : NodeModelUtils.findActualNodeFor(object).getLeafNodes()) {
				if (n.getGrammarElement().equals(assignment1) || n.getGrammarElement().equals(assignment2)) {
					acceptor.addPosition(n.getOffset(), n.getLength(), CorrDSLHiglightingStyles.ECORE_REF_STYLE_ID);
				}
			}
		}
		return super.highlightElement(object, acceptor, cancelIndicator);
	}

}
