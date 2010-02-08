/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import hr.fer.rasip.remes.grammars.expressions.ast.ResourceRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.Resource#getExpression <em>Expression</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Resource#getType <em>Type</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Resource#getScope <em>Scope</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Resource#getParsedExpression <em>Parsed Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Referable {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see se.mdh.progresside.remes.RemesPackage#getResource_Expression()
	 * @model required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Resource#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.mdh.progresside.remes.ResourceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.mdh.progresside.remes.ResourceTypes
	 * @see #setType(ResourceTypes)
	 * @see se.mdh.progresside.remes.RemesPackage#getResource_Type()
	 * @model required="true"
	 * @generated
	 */
	ResourceTypes getType();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Resource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.mdh.progresside.remes.ResourceTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceTypes value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.Mode#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(Mode)
	 * @see se.mdh.progresside.remes.RemesPackage#getResource_Scope()
	 * @see se.mdh.progresside.remes.Mode#getResources
	 * @model opposite="resources" required="true" transient="false"
	 * @generated
	 */
	Mode getScope();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Resource#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Mode value);

	/**
	 * Returns the value of the '<em><b>Parsed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsed Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsed Expression</em>' containment reference.
	 * @see #setParsedExpression(ResourceRoot)
	 * @see se.mdh.progresside.remes.RemesPackage#getResource_ParsedExpression()
	 * @model containment="true"
	 * @generated
	 */
	ResourceRoot getParsedExpression();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Resource#getParsedExpression <em>Parsed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed Expression</em>' containment reference.
	 * @see #getParsedExpression()
	 * @generated
	 */
	void setParsedExpression(ResourceRoot value);

} // Resource
