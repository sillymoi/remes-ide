/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import se.mdh.progresside.attributes.Attributable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.Variable#getName <em>Name</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Variable#getValue <em>Value</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Variable#getType <em>Type</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Variable#getVectorSize <em>Vector Size</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Variable#isGlobal <em>Global</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Variable#getScope <em>Scope</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Variable#isReadable <em>Readable</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Variable#isWritable <em>Writable</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Attributable {
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
	 * @see se.mdh.progresside.remes.RemesPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see se.mdh.progresside.remes.RemesPackage#getVariable_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see se.mdh.progresside.remes.RemesPackage#getVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypes getType();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.mdh.progresside.remes.PrimitiveTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveTypes value);

	/**
	 * Returns the value of the '<em><b>Vector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Size</em>' attribute.
	 * @see #setVectorSize(int)
	 * @see se.mdh.progresside.remes.RemesPackage#getVariable_VectorSize()
	 * @model required="true"
	 * @generated
	 */
	int getVectorSize();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Variable#getVectorSize <em>Vector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Size</em>' attribute.
	 * @see #getVectorSize()
	 * @generated
	 */
	void setVectorSize(int value);

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
	 * @see se.mdh.progresside.remes.RemesPackage#getVariable_Global()
	 * @model required="true"
	 * @generated
	 */
	boolean isGlobal();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Variable#isGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #isGlobal()
	 * @generated
	 */
	void setGlobal(boolean value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.Mode#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(Mode)
	 * @see se.mdh.progresside.remes.RemesPackage#getVariable_Scope()
	 * @see se.mdh.progresside.remes.Mode#getVariables
	 * @model opposite="variables" required="true" transient="false"
	 * @generated
	 */
	Mode getScope();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Variable#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Mode value);

	/**
	 * Returns the value of the '<em><b>Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readable</em>' attribute.
	 * @see #setReadable(boolean)
	 * @see se.mdh.progresside.remes.RemesPackage#getVariable_Readable()
	 * @model required="true"
	 * @generated
	 */
	boolean isReadable();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Variable#isReadable <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readable</em>' attribute.
	 * @see #isReadable()
	 * @generated
	 */
	void setReadable(boolean value);

	/**
	 * Returns the value of the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writable</em>' attribute.
	 * @see #setWritable(boolean)
	 * @see se.mdh.progresside.remes.RemesPackage#getVariable_Writable()
	 * @model required="true"
	 * @generated
	 */
	boolean isWritable();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Variable#isWritable <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writable</em>' attribute.
	 * @see #isWritable()
	 * @generated
	 */
	void setWritable(boolean value);

} // Variable
