/**
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.generator;

import com.google.common.collect.Iterators;
import no.hvl.past.corrlang.correspondenceLanguage.Correspondence;
import no.hvl.past.corrlang.generator.EcoreCommTranslator;
import no.hvl.past.corrlang.generator.EcoreComprehensiveGenerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CorrespondenceLanguageGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      final URI commFile = fsa.getURI("commonalities.ecore");
      final URI compr = fsa.getURI("comprehensive.ecore");
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      final EcoreCommTranslator translator = new EcoreCommTranslator();
      final EcoreComprehensiveGenerator translator2 = new EcoreComprehensiveGenerator();
      final Correspondence corr = Iterators.<Correspondence>filter(resource.getAllContents(), Correspondence.class).next();
      translator.translate(corr);
      translator2.translate(corr);
      translator.writeOut(resourceSet, commFile);
      translator2.writeOut(resourceSet, compr);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
