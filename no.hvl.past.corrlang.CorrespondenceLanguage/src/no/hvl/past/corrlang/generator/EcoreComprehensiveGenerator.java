package no.hvl.past.corrlang.generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import no.hvl.past.corrlang.correspondenceLanguage.Commonality;
import no.hvl.past.corrlang.correspondenceLanguage.Correspondence;
import no.hvl.past.corrlang.correspondenceLanguage.SubCommonality;

public class EcoreComprehensiveGenerator extends AbstractCorrespondenceTranslator {
	


	protected String provideURI(Correspondence correspondence) {
		// TODO Auto-generated method stub
		return "https://www.example.com/comprehensive";
	}
	
	protected String provideNSPrefix(Correspondence correspondence) {
		// TODO Auto-generated method stub
		return "comprehensive";
	}
	
	protected String providePackageName(Correspondence correspondence) {
		// TODO Auto-generated method stub
		return "Comprehensive";
	}

	@Override
	protected void handlePackage(EPackage importedNamespace) {
		
	}

	@Override
	protected void handleRelate(Commonality commonality, EClass translated, EClassifier related) {
		EReference ref = createReference("projection_" + related.getName(), related);
		translated.getEStructuralFeatures().add(ref);
	}

	@Override
	protected void handleReference(Commonality comm, EClass eClass, SubCommonality subComm, EReference first) {
		EReference result = createReference(subComm.getName(), retrieveRelated(first.getEType()));
		eClass.getEStructuralFeatures().add(result);	
	}

	@Override
	protected void handleAttribute(Commonality comm, EClass eClass, SubCommonality subComm, EAttribute first) {
		EAttribute result = createAttribute(subComm.getName(), first.getEType());
		eClass.getEStructuralFeatures().add(result);		
	}


}
