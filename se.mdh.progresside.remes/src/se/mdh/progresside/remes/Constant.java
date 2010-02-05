/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.Constant#getType <em>Type</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Constant#getValue <em>Value</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Constant#isGlobal <em>Global</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Constant#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Referable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.mdh.progresside.remes.PrimitiveTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.mdh.progresside.remes.PrimitiveTypes
	 * @see #setType(PrimitiveTypes)
	 * @see se.mdh.progresside.remes.RemesPackage#getConstant_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypes getType();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Constant#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.mdh.progresside.remes.PrimitiveTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveTypes value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see se.mdh.progresside.remes.RemesPackage#getConstant_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Constant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' attribute.
	 * @see #setGlobal(boolean)
	 * @see se.mdh.progresside.remes.RemesPackage#getConstant_Global()
	 * @model required="true"
	 * @generated
	 */
	boolean isGlobal();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Constant#isGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #isGlobal()
	 * @generated
	 */
	void setGlobal(boolean value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.Mode#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(Mode)
	 * @see se.mdh.progresside.remes.RemesPackage#getConstant_Scope()
	 * @see se.mdh.progresside.remes.Mode#getConstants
	 * @model opposite="constants" required="true" transient="false"
	 * @generated
	 */
	Mode getScope();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Constant#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Mode value);

} // Constant
