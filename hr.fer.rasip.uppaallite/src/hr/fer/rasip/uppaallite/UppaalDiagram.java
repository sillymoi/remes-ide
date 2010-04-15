/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaallite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uppaal Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaallite.UppaalDiagram#getTemplate <em>Template</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.UppaalDiagram#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getUppaalDiagram()
 * @model
 * @generated
 */
public interface UppaalDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.uppaallite.TemplateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getUppaalDiagram_Template()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateType> getTemplate();

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' attribute.
	 * @see #setDeclaration(String)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getUppaalDiagram_Declaration()
	 * @model
	 * @generated
	 */
	String getDeclaration();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.UppaalDiagram#getDeclaration <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' attribute.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(String value);

} // UppaalDiagram
