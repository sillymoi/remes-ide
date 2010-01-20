/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.ControlPath#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.ControlPath#getExitPoint <em>Exit Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.ControlPath#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getControlPath()
 * @model abstract="true"
 * @generated
 */
public interface ControlPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.EntryPoint#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' containment reference.
	 * @see #setEntryPoint(EntryPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getControlPath_EntryPoint()
	 * @see se.mdh.progresside.remes.EntryPoint#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	EntryPoint getEntryPoint();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.ControlPath#getEntryPoint <em>Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' containment reference.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(EntryPoint value);

	/**
	 * Returns the value of the '<em><b>Exit Point</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.ExitPoint#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Point</em>' containment reference.
	 * @see #setExitPoint(ExitPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getControlPath_ExitPoint()
	 * @see se.mdh.progresside.remes.ExitPoint#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	ExitPoint getExitPoint();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.ControlPath#getExitPoint <em>Exit Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Point</em>' containment reference.
	 * @see #getExitPoint()
	 * @generated
	 */
	void setExitPoint(ExitPoint value);

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
	 * @see se.mdh.progresside.remes.RemesPackage#getControlPath_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.ControlPath#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ControlPath
