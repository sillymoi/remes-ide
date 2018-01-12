/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import hr.fer.rasip.remes.gum.expressions.LogicalRoot;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Mode#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Mode#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Mode#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Mode#getEnclosingBehaviour <em>Enclosing Behaviour</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Mode#getInvariant <em>Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getMode()
 * @model abstract="true"
 * @generated
 */
public interface Mode extends Context {
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
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getMode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.Edge}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getMode_IncomingEdges()
	 * @see hr.fer.rasip.remes.gum.behaviour.Edge#getConnectTo
	 * @model opposite="connectTo"
	 * @generated
	 */
	EList<Edge> getIncomingEdges();

	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.Edge}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getMode_OutgoingEdges()
	 * @see hr.fer.rasip.remes.gum.behaviour.Edge#getConnectFrom
	 * @model opposite="connectFrom" containment="true"
	 * @generated
	 */
	EList<Edge> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Enclosing Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Behaviour</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Behaviour</em>' reference.
	 * @see #setEnclosingBehaviour(Behaviour)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getMode_EnclosingBehaviour()
	 * @model required="true"
	 * @generated
	 */
	Behaviour getEnclosingBehaviour();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getEnclosingBehaviour <em>Enclosing Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Behaviour</em>' reference.
	 * @see #getEnclosingBehaviour()
	 * @generated
	 */
	void setEnclosingBehaviour(Behaviour value);

	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' containment reference.
	 * @see #setInvariant(LogicalRoot)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getMode_Invariant()
	 * @model containment="true"
	 * @generated
	 */
	LogicalRoot getInvariant();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getInvariant <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' containment reference.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(LogicalRoot value);

} // Mode
