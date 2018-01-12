/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import hr.fer.rasip.remes.gum.expressions.ActionRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectFrom <em>Connect From</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getInitEdge()
 * @model
 * @generated
 */
public interface InitEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.CompositeMode#getInitEdge <em>Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect From</em>' container reference.
	 * @see #setConnectFrom(CompositeMode)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getInitEdge_ConnectFrom()
	 * @see hr.fer.rasip.remes.gum.behaviour.CompositeMode#getInitEdge
	 * @model opposite="initEdge" required="true" transient="false"
	 * @generated
	 */
	CompositeMode getConnectFrom();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectFrom <em>Connect From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect From</em>' container reference.
	 * @see #getConnectFrom()
	 * @generated
	 */
	void setConnectFrom(CompositeMode value);

	/**
	 * Returns the value of the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To</em>' reference.
	 * @see #setConnectTo(Mode)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getInitEdge_ConnectTo()
	 * @model required="true"
	 * @generated
	 */
	Mode getConnectTo();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectTo <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To</em>' reference.
	 * @see #getConnectTo()
	 * @generated
	 */
	void setConnectTo(Mode value);

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(ActionRoot)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getInitEdge_Initialization()
	 * @model containment="true"
	 * @generated
	 */
	ActionRoot getInitialization();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getInitialization <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' containment reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(ActionRoot value);

} // InitEdge
