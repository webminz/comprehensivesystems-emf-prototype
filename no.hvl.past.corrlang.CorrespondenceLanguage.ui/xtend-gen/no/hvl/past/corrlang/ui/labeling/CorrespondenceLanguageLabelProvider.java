/**
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.ui.labeling;

import com.google.inject.Inject;
import no.hvl.past.corrlang.correspondenceLanguage.Commonality;
import no.hvl.past.corrlang.correspondenceLanguage.Correspondence;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class CorrespondenceLanguageLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public CorrespondenceLanguageLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Commonality comm) {
    String _name = comm.getName();
    return ("Commonality " + _name);
  }
  
  public String text(final Correspondence corr) {
    return "Correspondence";
  }
}
