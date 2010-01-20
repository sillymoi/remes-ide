/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.Mode#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Mode#getVariables <em>Variables</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Mode#getResources <em>Resources</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Mode#getConstants <em>Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getMode()
 * @model abstract="true"
 * @generated
 */
public interface Mode extends ControlPath {
	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' attribute.
	 * @see #setInitialization(String)
	 * @see se.mdh.progresside.remes.RemesPackage#getMode_Initialization()
	 * @model
	 * @generated
	 */
	String getInitialization();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Mode#getInitialization <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' attribute.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.Variable}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getMode_Variables()
	 * @see se.mdh.progresside.remes.Variable#getScope
	 * @model opposite="scope" containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.Resource}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.Resource#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getMode_Resources()
	 * @see se.mdh.progresside.remes.Resource#getScope
	 * @model opposite="scope" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.Constant}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.Constant#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getMode_Constants()
	 * @see se.mdh.progresside.remes.Constant#getScope
	 * @model opposite="scope" containment="true"
	 * @generated
	 */
	EList<Constant> getConstants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Variable findVariableByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Resource findResourceByName(String name);

} // Mode
