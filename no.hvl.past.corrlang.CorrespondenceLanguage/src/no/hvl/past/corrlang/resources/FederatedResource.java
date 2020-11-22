package no.hvl.past.corrlang.resources;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EContentsEList;

public class FederatedResource extends ResourceImpl {
	
	private final EObject commonalityContainer;
	private final Map<String, EObject> commonalities;
	private final List<Resource> otherResources;
	
	
	public FederatedResource(EPackage comprehensiveMetamodel, Resource commonalityResource, List<Resource> otherResouces) {
		this.otherResources = otherResouces;
		this.commonalityContainer = loadAndAugmentWithProxies(commonalityResource, comprehensiveMetamodel , this);
		this.commonalities = new HashMap<String, EObject>();
		TreeIterator<EObject> iterator = this.commonalityContainer.eAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			this.commonalities.put(commonalityResource.getURIFragment(next), next);
		}
	}
	

	private EObject loadAndAugmentWithProxies(
			Resource commonalityResource, 
			EPackage comprehensiveMetamodel,
			FederatedResource federatedResource) {
		EObject root = commonalityResource.getContents().get(0);
		TreeIterator<EObject> iterator = root.eAllContents();
		while (iterator.hasNext()) {
			EObject comm = iterator.next();
			TreeIterator<EObject> classFeatures = comprehensiveMetamodel.getEClassifier(comm.eClass().getName()).eAllContents();
			while (classFeatures.hasNext()) {
				EObject next = classFeatures.next();
				if (next instanceof EStructuralFeature) {
					EStructuralFeature feature = (EStructuralFeature) next;
					if (feature.getName().startsWith("projection_")) {
						String val = (String) comm.eGet(feature); // dangeruous
						comm.eSet(feature, new FederatedResourceProxy(federatedResource, val));
					}
				}
			}
		}
		return root;
	}


	@Override
	public EList<EObject> getContents() {
		return new EContentsEList<EObject>(commonalityContainer);
	}
	
	@Override
	public EObject getEObject(String uriFragment) {
		if (commonalities.containsKey(uriFragment)) {
			return commonalities.get(uriFragment);
		}
		return otherResources
				.stream()
				.filter(res -> res.getEObject(uriFragment) != null)
				.findFirst()
				.map(res -> res.getEObject(uriFragment))
				.orElse(null);
	}

	
	
	



	
	
}
