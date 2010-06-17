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
 * A representation of the model object '<em><b>Write Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.WriteEdge#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.WriteEdge#getConnectFrom <em>Connect From</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getWriteEdge()
 * @model
 * @generated
 */
public interface WriteEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.WritePoint#getWriteEdges <em>Write Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To</em>' container reference.
	 * @see #setConnectTo(WritePoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getWriteEdge_ConnectTo()
	 * @see se.mdh.progresside.remes.WritePoint#getWriteEdges
	 * @model opposite="writeEdges" required="true" transient="false"
	 * @generated
	 */
	WritePoint getConnectTo();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.WriteEdge#getConnectTo <em>Connect To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To</em>' container reference.
	 * @see #getConnectTo()
	 * @generated
	 */
	void setConnectTo(WritePoint value);

	/**
	 * Returns the value of the '<em><b>Connect From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect From</em>' reference.
	 * @see #setConnectFrom(ExitPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getWriteEdge_ConnectFrom()
	 * @model required="true"
	 * @generated
	 */
	ExitPoint getConnectFrom();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.WriteEdge#getConnectFrom <em>Connect From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect From</em>' reference.
	 * @see #getConnectFrom()
	 * @generated
	 */
	void setConnectFrom(ExitPoint value);

} // WriteEdge
