/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Context#getVariables <em>Variables</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Context#getResources <em>Resources</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Context#getConstants <em>Constants</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Context#getRenamings <em>Renamings</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.Variable}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getContext_Variables()
	 * @see hr.fer.rasip.remes.gum.behaviour.Variable#getScope
	 * @model opposite="scope" containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.Resource}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getContext_Resources()
	 * @see hr.fer.rasip.remes.gum.behaviour.Resource#getScope
	 * @model opposite="scope" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.Constant}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getContext_Constants()
	 * @see hr.fer.rasip.remes.gum.behaviour.Constant#getScope
	 * @model opposite="scope" containment="true"
	 * @generated
	 */
	EList<Constant> getConstants();

	/**
	 * Returns the value of the '<em><b>Renamings</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.Renaming}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renamings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renamings</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getContext_Renamings()
	 * @see hr.fer.rasip.remes.gum.behaviour.Renaming#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<Renaming> getRenamings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Variable> getReadableVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Variable> getWritableVariables();

} // Context
