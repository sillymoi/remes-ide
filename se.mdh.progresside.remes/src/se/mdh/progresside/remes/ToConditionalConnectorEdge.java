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
 * A representation of the model object '<em><b>To Conditional Connector Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.ToConditionalConnectorEdge#getConnectTo <em>Connect To</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getToConditionalConnectorEdge()
 * @model abstract="true"
 * @generated
 */
public interface ToConditionalConnectorEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.ConditionalConnector#getEntryEdges <em>Entry Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To</em>' reference.
	 * @see #setConnectTo(ConditionalConnector)
	 * @see se.mdh.progresside.remes.RemesPackage#getToConditionalConnectorEdge_ConnectTo()
	 * @see se.mdh.progresside.remes.ConditionalConnector#getEntryEdges
	 * @model opposite="entryEdges" required="true"
	 * @generated
	 */
	ConditionalConnector getConnectTo();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.ToConditionalConnectorEdge#getConnectTo <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To</em>' reference.
	 * @see #getConnectTo()
	 * @generated
	 */
	void setConnectTo(ConditionalConnector value);

} // ToConditionalConnectorEdge
