/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure;

import hr.fer.rasip.remes.gum.behaviour.Behaviour;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Behaver#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Behaver#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getBehaver()
 * @model abstract="true"
 * @generated
 */
public interface Behaver extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getBehavers <em>Behavers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour</em>' reference.
	 * @see #setBehaviour(Behaviour)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getBehaver_Behaviour()
	 * @see hr.fer.rasip.remes.gum.behaviour.Behaviour#getBehavers
	 * @model opposite="behavers"
	 * @generated
	 */
	Behaviour getBehaviour();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.Behaver#getBehaviour <em>Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour</em>' reference.
	 * @see #getBehaviour()
	 * @generated
	 */
	void setBehaviour(Behaviour value);

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
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getBehaver_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.Behaver#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Behaver
