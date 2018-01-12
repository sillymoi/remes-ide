/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.AtomicMode#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getAtomicMode()
 * @model
 * @generated
 */
public interface AtomicMode extends Mode {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.CompositeMode#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CompositeMode)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getAtomicMode_Parent()
	 * @see hr.fer.rasip.remes.gum.behaviour.CompositeMode#getModes
	 * @model opposite="modes" required="true" transient="false"
	 * @generated
	 */
	CompositeMode getParent();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.AtomicMode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CompositeMode value);

} // AtomicMode
