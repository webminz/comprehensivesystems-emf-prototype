package no.hvl.past.corrlang.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

import no.hvl.past.corrlang.ide.CorrSemanticHighlightCalculator.CorrDSLHiglightingStyles;

public class CorrLangHighlightConif extends DefaultHighlightingConfiguration {
	
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(CorrDSLHiglightingStyles.ECORE_REF_STYLE_ID, "EcoreRef", ecoreRefStyle());
		super.configure(acceptor);
	}

	private TextStyle ecoreRefStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(200, 200, 200));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

}
