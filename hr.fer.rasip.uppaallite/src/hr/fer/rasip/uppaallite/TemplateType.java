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
 * A representation of the model object '<em><b>Template Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaallite.TemplateType#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.TemplateType#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.TemplateType#getLocation <em>Location</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.TemplateType#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTemplateType()
 * @model
 * @generated
 */
public interface TemplateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTemplateType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.TemplateType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTemplateType_Declaration()
	 * @model
	 * @generated
	 */
	String getDeclaration();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.TemplateType#getDeclaration <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' attribute.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.uppaallite.LocationType}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.uppaallite.LocationType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTemplateType_Location()
	 * @see hr.fer.rasip.uppaallite.LocationType#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<LocationType> getLocation();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.uppaallite.TransitionType}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.uppaallite.TransitionType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTemplateType_Transition()
	 * @see hr.fer.rasip.uppaallite.TransitionType#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<TransitionType> getTransition();

} // TemplateType
