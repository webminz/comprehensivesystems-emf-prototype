/*
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.ide

import com.google.inject.Guice
import no.hvl.past.corrlang.CorrespondenceLanguageRuntimeModule
import no.hvl.past.corrlang.CorrespondenceLanguageStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class CorrespondenceLanguageIdeSetup extends CorrespondenceLanguageStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new CorrespondenceLanguageRuntimeModule, new CorrespondenceLanguageIdeModule))
	}
	
}
