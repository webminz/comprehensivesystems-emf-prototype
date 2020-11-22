/*
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import no.hvl.past.corrlang.correspondenceLanguage.Correspondence

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CorrespondenceLanguageGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val commFile = fsa.getURI("commonalities.ecore");
		val compr = fsa.getURI("comprehensive.ecore");
		
		val resourceSet = new ResourceSetImpl;
		val translator = new EcoreCommTranslator;
		val translator2 = new EcoreComprehensiveGenerator;
		val corr = resource.allContents.filter(Correspondence).next
		translator.translate(corr)
		translator2.translate(corr)
		translator.writeOut(resourceSet, commFile)
		translator2.writeOut(resourceSet, compr)
		
		// TODO generate comprehensive metamodel as well!
		
		
	}
}
