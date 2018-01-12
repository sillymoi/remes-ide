/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.CompositeMode#getModes <em>Modes</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.CompositeMode#getInitEdge <em>Init Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getCompositeMode()
 * @model
 * @generated
 */
public interface CompositeMode extends Mode {
	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.AtomicMode}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.AtomicMode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getCompositeMode_Modes()
	 * @see hr.fer.rasip.remes.gum.behaviour.AtomicMode#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<AtomicMode> getModes();

	/**
	 * Returns the value of the '<em><b>Init Edge</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Edge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Edge</em>' containment reference.
	 * @see #setInitEdge(InitEdge)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getCompositeMode_InitEdge()
	 * @see hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectFrom
	 * @model opposite="connectFrom" containment="true"
	 * @generated
	 */
	InitEdge getInitEdge();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.CompositeMode#getInitEdge <em>Init Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Edge</em>' containment reference.
	 * @see #getInitEdge()
	 * @generated
	 */
	void setInitEdge(InitEdge value);

} // CompositeMode
