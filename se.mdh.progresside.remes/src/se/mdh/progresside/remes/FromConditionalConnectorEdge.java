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
 * A representation of the model object '<em><b>From Conditional Connector Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.FromConditionalConnectorEdge#getConnectFrom <em>Connect From</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getFromConditionalConnectorEdge()
 * @model abstract="true"
 * @generated
 */
public interface FromConditionalConnectorEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.ConditionalConnector#getExitEdges <em>Exit Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect From</em>' container reference.
	 * @see #setConnectFrom(ConditionalConnector)
	 * @see se.mdh.progresside.remes.RemesPackage#getFromConditionalConnectorEdge_ConnectFrom()
	 * @see se.mdh.progresside.remes.ConditionalConnector#getExitEdges
	 * @model opposite="exitEdges"
	 * @generated
	 */
	ConditionalConnector getConnectFrom();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.FromConditionalConnectorEdge#getConnectFrom <em>Connect From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect From</em>' container reference.
	 * @see #getConnectFrom()
	 * @generated
	 */
	void setConnectFrom(ConditionalConnector value);

} // FromConditionalConnectorEdge
