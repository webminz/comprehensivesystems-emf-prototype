/**
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.correspondenceLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Commonality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hvl.past.corrlang.correspondenceLanguage.SubCommonality#getElements <em>Elements</em>}</li>
 *   <li>{@link no.hvl.past.corrlang.correspondenceLanguage.SubCommonality#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage#getSubCommonality()
 * @model
 * @generated
 */
public interface SubCommonality extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EStructuralFeature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage#getSubCommonality_Elements()
   * @model
   * @generated
   */
  EList<EStructuralFeature> getElements();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage#getSubCommonality_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link no.hvl.past.corrlang.correspondenceLanguage.SubCommonality#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // SubCommonality
