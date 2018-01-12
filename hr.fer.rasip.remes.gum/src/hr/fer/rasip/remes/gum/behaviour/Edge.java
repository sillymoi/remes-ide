/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import hr.fer.rasip.remes.gum.expressions.ActionRoot;
import hr.fer.rasip.remes.gum.expressions.LogicalRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Edge#getConnectFrom <em>Connect From</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Edge#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Edge#getActionGuard <em>Action Guard</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Edge#getActionBody <em>Action Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect From</em>' container reference.
	 * @see #setConnectFrom(Mode)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getEdge_ConnectFrom()
	 * @see hr.fer.rasip.remes.gum.behaviour.Mode#getOutgoingEdges
	 * @model opposite="outgoingEdges" required="true" transient="false"
	 * @generated
	 */
	Mode getConnectFrom();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getConnectFrom <em>Connect From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect From</em>' container reference.
	 * @see #getConnectFrom()
	 * @generated
	 */
	void setConnectFrom(Mode value);

	/**
	 * Returns the value of the '<em><b>Connect To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To</em>' reference.
	 * @see #setConnectTo(Mode)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getEdge_ConnectTo()
	 * @see hr.fer.rasip.remes.gum.behaviour.Mode#getIncomingEdges
	 * @model opposite="incomingEdges" required="true"
	 * @generated
	 */
	Mode getConnectTo();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getConnectTo <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To</em>' reference.
	 * @see #getConnectTo()
	 * @generated
	 */
	void setConnectTo(Mode value);

	/**
	 * Returns the value of the '<em><b>Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Guard</em>' containment reference.
	 * @see #setActionGuard(LogicalRoot)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getEdge_ActionGuard()
	 * @model containment="true"
	 * @generated
	 */
	LogicalRoot getActionGuard();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getActionGuard <em>Action Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Guard</em>' containment reference.
	 * @see #getActionGuard()
	 * @generated
	 */
	void setActionGuard(LogicalRoot value);

	/**
	 * Returns the value of the '<em><b>Action Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Body</em>' containment reference.
	 * @see #setActionBody(ActionRoot)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getEdge_ActionBody()
	 * @model containment="true"
	 * @generated
	 */
	ActionRoot getActionBody();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getActionBody <em>Action Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Body</em>' containment reference.
	 * @see #getActionBody()
	 * @generated
	 */
	void setActionBody(ActionRoot value);

} // Edge
