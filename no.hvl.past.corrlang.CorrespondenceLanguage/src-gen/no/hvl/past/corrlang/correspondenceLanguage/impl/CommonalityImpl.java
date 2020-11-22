/**
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.correspondenceLanguage.impl;

import java.util.Collection;

import no.hvl.past.corrlang.correspondenceLanguage.Commonality;
import no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage;
import no.hvl.past.corrlang.correspondenceLanguage.SubCommonality;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commonality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hvl.past.corrlang.correspondenceLanguage.impl.CommonalityImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link no.hvl.past.corrlang.correspondenceLanguage.impl.CommonalityImpl#getSubComms <em>Sub Comms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommonalityImpl extends CorrElementImpl implements Commonality
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<EClassifier> elements;

  /**
   * The cached value of the '{@link #getSubComms() <em>Sub Comms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubComms()
   * @generated
   * @ordered
   */
  protected EList<SubCommonality> subComms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommonalityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CorrespondenceLanguagePackage.Literals.COMMONALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EClassifier> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectResolvingEList<EClassifier>(EClassifier.class, this, CorrespondenceLanguagePackage.COMMONALITY__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SubCommonality> getSubComms()
  {
    if (subComms == null)
    {
      subComms = new EObjectContainmentEList<SubCommonality>(SubCommonality.class, this, CorrespondenceLanguagePackage.COMMONALITY__SUB_COMMS);
    }
    return subComms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CorrespondenceLanguagePackage.COMMONALITY__SUB_COMMS:
        return ((InternalEList<?>)getSubComms()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CorrespondenceLanguagePackage.COMMONALITY__ELEMENTS:
        return getElements();
      case CorrespondenceLanguagePackage.COMMONALITY__SUB_COMMS:
        return getSubComms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CorrespondenceLanguagePackage.COMMONALITY__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends EClassifier>)newValue);
        return;
      case CorrespondenceLanguagePackage.COMMONALITY__SUB_COMMS:
        getSubComms().clear();
        getSubComms().addAll((Collection<? extends SubCommonality>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CorrespondenceLanguagePackage.COMMONALITY__ELEMENTS:
        getElements().clear();
        return;
      case CorrespondenceLanguagePackage.COMMONALITY__SUB_COMMS:
        getSubComms().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CorrespondenceLanguagePackage.COMMONALITY__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case CorrespondenceLanguagePackage.COMMONALITY__SUB_COMMS:
        return subComms != null && !subComms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CommonalityImpl