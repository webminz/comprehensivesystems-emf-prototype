/**
 * generated by Xtext 2.19.0
 */
package no.hvl.past.corrlang.correspondenceLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commonality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hvl.past.corrlang.correspondenceLanguage.Commonality#getElements <em>Elements</em>}</li>
 *   <li>{@link no.hvl.past.corrlang.correspondenceLanguage.Commonality#getSubComms <em>Sub Comms</em>}</li>
 * </ul>
 *
 * @see no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage#getCommonality()
 * @model
 * @generated
 */
public interface Commonality extends CorrElement
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EClassifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage#getCommonality_Elements()
   * @model
   * @generated
   */
  EList<EClassifier> getElements();

  /**
   * Returns the value of the '<em><b>Sub Comms</b></em>' containment reference list.
   * The list contents are of type {@link no.hvl.past.corrlang.correspondenceLanguage.SubCommonality}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Comms</em>' containment reference list.
   * @see no.hvl.past.corrlang.correspondenceLanguage.CorrespondenceLanguagePackage#getCommonality_SubComms()
   * @model containment="true"
   * @generated
   */
  EList<SubCommonality> getSubComms();

} // Commonality
