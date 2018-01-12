/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import hr.fer.rasip.remes.gum.structure.Behaver;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getBehavers <em>Behavers</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getModes <em>Modes</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getTopModes <em>Top Modes</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends Context {
	/**
	 * Returns the value of the '<em><b>Behavers</b></em>' reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.structure.Behaver}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.structure.Behaver#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavers</em>' reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getBehaviour_Behavers()
	 * @see hr.fer.rasip.remes.gum.structure.Behaver#getBehaviour
	 * @model opposite="behaviour"
	 * @generated
	 */
	EList<Behaver> getBehavers();

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getBehaviour_Modes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mode> getModes();

	/**
	 * Returns the value of the '<em><b>Top Modes</b></em>' reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Modes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Modes</em>' reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getBehaviour_TopModes()
	 * @model
	 * @generated
	 */
	EList<Mode> getTopModes();

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
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getBehaviour_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Behaviour
