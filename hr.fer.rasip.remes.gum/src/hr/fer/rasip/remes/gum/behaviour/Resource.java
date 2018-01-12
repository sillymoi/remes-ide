/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

import hr.fer.rasip.remes.gum.expressions.ResourceRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Resource#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Resource#getScope <em>Scope</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Resource#getExpression <em>Expression</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.Resource#getResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Referable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hr.fer.rasip.remes.gum.behaviour.ResourceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.behaviour.ResourceTypes
	 * @see #setType(ResourceTypes)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getResource_Type()
	 * @model required="true"
	 * @generated
	 */
	ResourceTypes getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.behaviour.ResourceTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceTypes value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Context#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(Context)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getResource_Scope()
	 * @see hr.fer.rasip.remes.gum.behaviour.Context#getResources
	 * @model opposite="resources" required="true" transient="false"
	 * @generated
	 */
	Context getScope();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Context value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ResourceRoot)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getResource_Expression()
	 * @model containment="true"
	 * @generated
	 */
	ResourceRoot getExpression();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ResourceRoot value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.profile.Resource#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' reference.
	 * @see #setResolved(hr.fer.rasip.remes.gum.profile.Resource)
	 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourPackage#getResource_Resolved()
	 * @see hr.fer.rasip.remes.gum.profile.Resource#getReferences
	 * @model opposite="references"
	 * @generated
	 */
	hr.fer.rasip.remes.gum.profile.Resource getResolved();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getResolved <em>Resolved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' reference.
	 * @see #getResolved()
	 * @generated
	 */
	void setResolved(hr.fer.rasip.remes.gum.profile.Resource value);

} // Resource
