/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import org.eclipse.emf.common.util.EList;

import se.mdh.progresside.attributes.Attributable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.ConditionalConnector#getName <em>Name</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.ConditionalConnector#getEntryEdges <em>Entry Edges</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.ConditionalConnector#getExitEdges <em>Exit Edges</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.ConditionalConnector#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getConditionalConnector()
 * @model
 * @generated
 */
public interface ConditionalConnector extends Attributable {
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
	 * @see se.mdh.progresside.remes.RemesPackage#getConditionalConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.ConditionalConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entry Edges</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.ToConditionalConnectorEdge}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.ToConditionalConnectorEdge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Edges</em>' reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getConditionalConnector_EntryEdges()
	 * @see se.mdh.progresside.remes.ToConditionalConnectorEdge#getConnectTo
	 * @model opposite="connectTo" required="true"
	 * @generated
	 */
	EList<ToConditionalConnectorEdge> getEntryEdges();

	/**
	 * Returns the value of the '<em><b>Exit Edges</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.FromConditionalConnectorEdge}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.FromConditionalConnectorEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Edges</em>' containment reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getConditionalConnector_ExitEdges()
	 * @see se.mdh.progresside.remes.FromConditionalConnectorEdge#getConnectFrom
	 * @model opposite="connectFrom" containment="true" required="true"
	 * @generated
	 */
	EList<FromConditionalConnectorEdge> getExitEdges();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.CompositeMode#getConditionalConnectors <em>Conditional Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CompositeMode)
	 * @see se.mdh.progresside.remes.RemesPackage#getConditionalConnector_Parent()
	 * @see se.mdh.progresside.remes.CompositeMode#getConditionalConnectors
	 * @model opposite="conditionalConnectors" transient="false"
	 * @generated
	 */
	CompositeMode getParent();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.ConditionalConnector#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CompositeMode value);

} // ConditionalConnector
