package no.hvl.past.corrlang.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import no.hvl.past.corrlang.correspondenceLanguage.Commonality;
import no.hvl.past.corrlang.correspondenceLanguage.CorrElement;
import no.hvl.past.corrlang.correspondenceLanguage.Correspondence;
import no.hvl.past.corrlang.correspondenceLanguage.Metamodel;
import no.hvl.past.corrlang.correspondenceLanguage.SubCommonality;

public abstract class AbstractCorrespondenceTranslator {
	
	private final EcoreFactory factory;
	private final EcorePackage ecorePkg;
	private EPackage resultPackage;
	private final Map<String, EClass> genMap;
	private final Map<EClassifier, String> relateMap;
	
	
	public AbstractCorrespondenceTranslator() {
		this.factory = EcoreFactory.eINSTANCE;
		this.ecorePkg = EcorePackage.eINSTANCE;
		this.genMap  = new HashMap<String, EClass>();
		this.relateMap = new HashMap<EClassifier, String>();
	}
	
	public void translate(Correspondence correspondence) {
		createPackage(correspondence);
		
		EClass commContainer = createClass("Commonalities", false);
		EClass commSuperClass = createClass("Commonality", true);
		EReference containerRef = createReference("commons", commSuperClass);
		containerRef.setContainment(true);
		commContainer.getEStructuralFeatures().add(containerRef);
		
		resultPackage.getEClassifiers().add(commContainer);
		resultPackage.getEClassifiers().add(commSuperClass);

		
		// Iterating over provided packages
		for (Metamodel mm : correspondence.getModelSpace()) {
			handlePackage(mm.getImportedNamespace());
		}
		
		// initial iteration over all class level commonalities to create respective classes and establishing the relationMap
		for (CorrElement comm : correspondence.getElements()) {
			if (comm instanceof Commonality) {
				Commonality commonality = (Commonality) comm;
				EClass translated = createClass(commonality.getName(), false);
				translated.getESuperTypes().add(commSuperClass);
				this.genMap.put(commonality.getName(), translated);
				for (EClassifier clfier : commonality.getElements()) {
					handleRelate(commonality, translated, clfier);
					relateMap.put(clfier, commonality.getName());
				}
			}
		}
		
		// iterating over all feature level commonalities
		for (CorrElement c : correspondence.getElements()) {
			if (c instanceof Commonality) {
				Commonality comm = (Commonality) c;
				for (SubCommonality subComm : comm.getSubComms()) {
					EList<EStructuralFeature> elements = subComm.getElements();
					if (!elements.isEmpty()) {
						EStructuralFeature first = elements.get(0);
						if (first instanceof EAttribute) {
							treatAsAttribute(comm, genMap.get(comm.getName()), subComm, ((EAttribute) first), elements);
						} else if (first instanceof EReference) {
							treatAsReference(comm, genMap.get(comm.getName()), subComm, (EReference) first, elements);
						}
						
					} else {
						System.err.print("No elements related");
					}
				}
			}
		}
		
		// Finishing off
		for (EClass eclass : genMap.values()) {
			resultPackage.getEClassifiers().add(eclass);
		}
	}
	
	public EPackage getResult() {
		return this.resultPackage;
	}
	
	
	protected abstract void handlePackage(EPackage importedNamespace);

	protected abstract void handleRelate(Commonality commonality, EClass translated, EClassifier related);
	
	protected EcorePackage getEcorePackage() {
		return ecorePkg;
	}
	
	
	private void treatAsReference(
			Commonality comm,
			EClass eClass, 
			SubCommonality subComm, 
			EReference first,
			EList<EStructuralFeature> elements) {
		Iterator<EStructuralFeature> iterator = elements.iterator();
		while (iterator.hasNext()) {
			EStructuralFeature next = iterator.next();
			if (!(next instanceof EReference)) {
				System.err.print("Inheterogenous relate");
				return;
			}
			EReference nextASAttribute = (EReference) next;
			if (!retrieveRelated(nextASAttribute.getEType()).equals(retrieveRelated(first.getEType()))) {
				System.err.print("Inheterogenous relate");
				return;
			}
		}
		handleReference(comm, eClass, subComm, first);
			
	}



	protected abstract void handleReference(Commonality comm, EClass eClass, SubCommonality subComm, EReference first);

	private void treatAsAttribute(
			Commonality comm,
			EClass eClass, 
			SubCommonality subComm,
			EAttribute first,
			EList<EStructuralFeature> elements) {
		Iterator<EStructuralFeature> iterator = elements.iterator();
		while (iterator.hasNext()) {
			EStructuralFeature next = iterator.next();
			if (!(next instanceof EAttribute)) {
				System.err.print("Inheterogenous relate");
				return;
			}
			EAttribute nextASAttribute = (EAttribute) next;
			if (!nextASAttribute.getEType().equals(first.getEType())) {
				System.err.print("Inheterogenous relate");
				return;
			}
		}
		handleAttribute(comm, eClass, subComm, first);	
	}

	
	protected abstract void handleAttribute(Commonality comm, EClass eClass, SubCommonality subComm, EAttribute first);

	public EClassifier retrieveRelated(EClassifier clfier) {
		if (relateMap.containsKey(clfier)) {
			return genMap.get(relateMap.get(clfier));
		}
		return clfier;
	}

	public void writeOut(ResourceSet resourceSet, URI destination) throws IOException {
		if (resultPackage != null) {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			Resource resource = resourceSet.createResource(destination);
			resource.getContents().add(resultPackage);
			resource.save(null);
		}
	}
	
	
	protected EAttribute createAttribute(String attributeName, EClassifier type) {
		EAttribute result = factory.createEAttribute();
		result.setName(attributeName);
		result.setEType(type);
		return result;
	}
	
	protected EReference createReference(String refName, EClassifier target) {
		EReference result = factory.createEReference();
		result.setName(refName);
		result.setEType(target);
		return result;
	}
	
	
	protected EClass createClass(String className, boolean isAbstract) {
		EClass result = factory.createEClass();
		result.setName(className);
		result.setAbstract(isAbstract);
		return result;
	}
	
	
	protected void createPackage(Correspondence corr) {
		this.resultPackage = factory.createEPackage();
		resultPackage.setName(providePackageName(corr));
		resultPackage.setNsPrefix(provideNSPrefix(corr));
		resultPackage.setNsURI(provideURI(corr));
	}
	
	protected abstract String provideURI(Correspondence corr);
	
	protected abstract String provideNSPrefix(Correspondence corr);
	
	protected abstract String providePackageName(Correspondence corr);

}
