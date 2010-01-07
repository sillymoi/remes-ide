/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import se.mdh.progresside.attributes.Attributable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.InitEdge#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.InitEdge#getConnectFrom <em>Connect From</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.InitEdge#getConnectTo <em>Connect To</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getInitEdge()
 * @model
 * @generated
 */
public interface InitEdge extends Attributable {
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
	 * @see se.mdh.progresside.remes.RemesPackage#getInitEdge_Initialization()
	 * @model
	 * @generated
	 */
	String getInitialization();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.InitEdge#getInitialization <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' attribute.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(String value);

	/**
	 * Returns the value of the '<em><b>Connect From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.InitPoint#getInitEdge <em>Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect From</em>' container reference.
	 * @see #setConnectFrom(InitPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getInitEdge_ConnectFrom()
	 * @see se.mdh.progresside.remes.InitPoint#getInitEdge
	 * @model opposite="initEdge" required="true" transient="false"
	 * @generated
	 */
	InitPoint getConnectFrom();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.InitEdge#getConnectFrom <em>Connect From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect From</em>' container reference.
	 * @see #getConnectFrom()
	 * @generated
	 */
	void setConnectFrom(InitPoint value);

	/**
	 * Returns the value of the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To</em>' reference.
	 * @see #setConnectTo(EntryPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getInitEdge_ConnectTo()
	 * @model required="true"
	 * @generated
	 */
	EntryPoint getConnectTo();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.InitEdge#getConnectTo <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To</em>' reference.
	 * @see #getConnectTo()
	 * @generated
	 */
	void setConnectTo(EntryPoint value);

} // InitEdge
