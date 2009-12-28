/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import hr.fer.rasip.remes.grammars.logical.tree.LogicalRoot;
import se.mdh.progresside.attributes.Attributable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.Edge#getActionGuard <em>Action Guard</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Edge#getActionBody <em>Action Body</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Edge#getParsedActionGuard <em>Parsed Action Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends Attributable {
	/**
	 * Returns the value of the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Guard</em>' attribute.
	 * @see #setActionGuard(String)
	 * @see se.mdh.progresside.remes.RemesPackage#getEdge_ActionGuard()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantsSyntaxCorrect'"
	 * @generated
	 */
	String getActionGuard();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Edge#getActionGuard <em>Action Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Guard</em>' attribute.
	 * @see #getActionGuard()
	 * @generated
	 */
	void setActionGuard(String value);

	/**
	 * Returns the value of the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Body</em>' attribute.
	 * @see #setActionBody(String)
	 * @see se.mdh.progresside.remes.RemesPackage#getEdge_ActionBody()
	 * @model
	 * @generated
	 */
	String getActionBody();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Edge#getActionBody <em>Action Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Body</em>' attribute.
	 * @see #getActionBody()
	 * @generated
	 */
	void setActionBody(String value);

	/**
	 * Returns the value of the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsed Action Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsed Action Guard</em>' containment reference.
	 * @see #setParsedActionGuard(LogicalRoot)
	 * @see se.mdh.progresside.remes.RemesPackage#getEdge_ParsedActionGuard()
	 * @model containment="true"
	 * @generated
	 */
	LogicalRoot getParsedActionGuard();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Edge#getParsedActionGuard <em>Parsed Action Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed Action Guard</em>' containment reference.
	 * @see #getParsedActionGuard()
	 * @generated
	 */
	void setParsedActionGuard(LogicalRoot value);

} // Edge
