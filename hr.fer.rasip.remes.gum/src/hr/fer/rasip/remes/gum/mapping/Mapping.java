/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.mapping;

import hr.fer.rasip.remes.gum.behaviour.Referable;

import hr.fer.rasip.remes.gum.structure.Port;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.mapping.Mapping#getVariable <em>Variable</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.mapping.Mapping#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.mapping.MappingPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Referable)
	 * @see hr.fer.rasip.remes.gum.mapping.MappingPackage#getMapping_Variable()
	 * @model required="true"
	 * @generated
	 */
	Referable getVariable();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.mapping.Mapping#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Referable value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see hr.fer.rasip.remes.gum.mapping.MappingPackage#getMapping_Port()
	 * @model required="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.mapping.Mapping#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // Mapping
