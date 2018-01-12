/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getFrom <em>From</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getTo <em>To</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getRenaming()
 * @model
 * @generated
 */
public interface Renaming extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Referable)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getRenaming_From()
	 * @model required="true"
	 * @generated
	 */
	Referable getFrom();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Referable value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Referable)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getRenaming_To()
	 * @model required="true"
	 * @generated
	 */
	Referable getTo();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Referable value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Context#getRenamings <em>Renamings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(Context)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getRenaming_Context()
	 * @see hr.fer.rasip.remes.gum.behaviour.Context#getRenamings
	 * @model opposite="renamings" required="true" transient="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // Renaming
