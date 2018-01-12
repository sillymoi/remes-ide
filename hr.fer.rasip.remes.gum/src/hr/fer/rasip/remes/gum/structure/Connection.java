/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Connection#getConnectFrom <em>Connect From</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Connection#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Connection#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect From</em>' reference.
	 * @see #setConnectFrom(Port)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getConnection_ConnectFrom()
	 * @model required="true"
	 * @generated
	 */
	Port getConnectFrom();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.Connection#getConnectFrom <em>Connect From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect From</em>' reference.
	 * @see #getConnectFrom()
	 * @generated
	 */
	void setConnectFrom(Port value);

	/**
	 * Returns the value of the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To</em>' reference.
	 * @see #setConnectTo(Port)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getConnection_ConnectTo()
	 * @model required="true"
	 * @generated
	 */
	Port getConnectTo();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.Connection#getConnectTo <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To</em>' reference.
	 * @see #getConnectTo()
	 * @generated
	 */
	void setConnectTo(Port value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.structure.Composite#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Composite)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getConnection_Parent()
	 * @see hr.fer.rasip.remes.gum.structure.Composite#getConnections
	 * @model opposite="connections" required="true" transient="false"
	 * @generated
	 */
	Composite getParent();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.Connection#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Composite value);

} // Connection
