/*
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.ui.tests;

import com.google.inject.Injector;
import no.hvl.past.corrlang.CorrespondenceLanguage.ui.internal.CorrespondenceLanguageActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class CorrespondenceLanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CorrespondenceLanguageActivator.getInstance().getInjector("no.hvl.past.corrlang.CorrespondenceLanguage");
	}

}
