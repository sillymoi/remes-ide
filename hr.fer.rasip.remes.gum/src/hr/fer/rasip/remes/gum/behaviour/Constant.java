/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import hr.fer.rasip.remes.gum.core.Data;
import hr.fer.rasip.remes.gum.profile.ConstantValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Constant#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Constant#getScope <em>Scope</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Constant#getValue <em>Value</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Constant#getResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Referable {
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
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getConstant_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypes getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getType <em>Type</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Context#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(Context)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getConstant_Scope()
	 * @see hr.fer.rasip.remes.gum.behaviour.Context#getConstants
	 * @model opposite="constants" required="true" transient="false"
	 * @generated
	 */
	Context getScope();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Context value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Data)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getConstant_Value()
	 * @model containment="true"
	 * @generated
	 */
	Data getValue();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Data value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' reference.
	 * @see #setResolved(ConstantValue)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getConstant_Resolved()
	 * @see hr.fer.rasip.remes.gum.profile.ConstantValue#getDefinition
	 * @model opposite="definition"
	 * @generated
	 */
	ConstantValue getResolved();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getResolved <em>Resolved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' reference.
	 * @see #getResolved()
	 * @generated
	 */
	void setResolved(ConstantValue value);

} // Constant
