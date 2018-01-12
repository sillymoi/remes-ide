/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import hr.fer.rasip.remes.gum.core.Data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Variable#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Variable#getScope <em>Scope</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Variable#isReadable <em>Readable</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Variable#isWritable <em>Writable</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Variable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Referable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes
	 * @see #setType(PrimitiveTypes)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypes getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveTypes value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Context#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(Context)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getVariable_Scope()
	 * @see hr.fer.rasip.remes.gum.behaviour.Context#getVariables
	 * @model opposite="variables" required="true" transient="false"
	 * @generated
	 */
	Context getScope();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Variable#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Context value);

	/**
	 * Returns the value of the '<em><b>Readable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readable</em>' attribute.
	 * @see #setReadable(boolean)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getVariable_Readable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isReadable();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Variable#isReadable <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readable</em>' attribute.
	 * @see #isReadable()
	 * @generated
	 */
	void setReadable(boolean value);

	/**
	 * Returns the value of the '<em><b>Writable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writable</em>' attribute.
	 * @see #setWritable(boolean)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getVariable_Writable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isWritable();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Variable#isWritable <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writable</em>' attribute.
	 * @see #isWritable()
	 * @generated
	 */
	void setWritable(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.core.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getVariable_Value()
	 * @model
	 * @generated
	 */
	EList<Data> getValue();

} // Variable
