package no.hvl.past.corrlang.resources;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class FederatedResourceProxy implements EObject {

	private final FederatedResource parent;
	private final String refURI;
	private EObject proxied;
	
	public FederatedResourceProxy(FederatedResource parent, String refURI) {
		super();
		this.parent = parent;
		this.refURI = refURI;
	}
	
	
	private void retrieve() {
		this.proxied = parent.getEObject(refURI);
	}


	@Override
	public EList<Adapter> eAdapters() {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eAdapters();
	}


	@Override
	public boolean eDeliver() {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eDeliver();
	}


	@Override
	public void eSetDeliver(boolean deliver) {
		if (proxied == null) {
			retrieve();
		}
		this.proxied.eSetDeliver(deliver);
	}


	@Override
	public void eNotify(Notification notification) {
		if (proxied == null) {
			retrieve();
		}
		this.proxied.eNotify(notification);
	}


	@Override
	public EClass eClass() {
		if (proxied == null) {
			retrieve();
		}
		return this.proxied.eClass();
	}


	@Override
	public Resource eResource() {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eResource();
	}


	@Override
	public EObject eContainer() {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eContainer();
	}


	@Override
	public EStructuralFeature eContainingFeature() {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eContainingFeature();
	}


	@Override
	public EReference eContainmentFeature() {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eContainmentFeature();
	}


	@Override
	public EList<EObject> eContents() {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eContents();
	}


	@Override
	public TreeIterator<EObject> eAllContents() {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eAllContents();
	}


	@Override
	public boolean eIsProxy() {
		return true;
	}


	@Override
	public EList<EObject> eCrossReferences() {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eCrossReferences();
	}


	@Override
	public Object eGet(EStructuralFeature feature) {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eGet(feature);
	}


	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eGet(feature, resolve);
	}


	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		if (proxied == null) {
			retrieve();
		}
		proxied.eSet(feature, newValue);
		
	}


	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eIsSet(feature);
	}


	@Override
	public void eUnset(EStructuralFeature feature) {
		if (proxied == null) {
			retrieve();
		}
		proxied.eUnset(feature);
		
	}


	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		if (proxied == null) {
			retrieve();
		}
		return proxied.eInvoke(operation, arguments);
	}
	
	
	
	
	
	
}
