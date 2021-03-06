/**
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.correspondenceLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hvl.past.corrlang.correspondenceLanguage.Correspondence#getModelSpace <em>Model Space</em>}</li>
 *   <li>{@link no.hvl.past.corrlang.correspondenceLanguage.Correspondence#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage#getCorrespondence()
 * @model
 * @generated
 */
public interface Correspondence extends EObject
{
  /**
   * Returns the value of the '<em><b>Model Space</b></em>' containment reference list.
   * The list contents are of type {@link no.hvl.past.corrlang.correspondenceLanguage.Metamodel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Space</em>' containment reference list.
   * @see no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage#getCorrespondence_ModelSpace()
   * @model containment="true"
   * @generated
   */
  EList<Metamodel> getModelSpace();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link no.hvl.past.corrlang.correspondenceLanguage.CorrElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage#getCorrespondence_Elements()
   * @model containment="true"
   * @generated
   */
  EList<CorrElement> getElements();

} // Correspondence
