/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import hr.fer.rasip.remes.grammars.logical.tree.LogicalRoot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.SubMode#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.SubMode#isIsUrgent <em>Is Urgent</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.SubMode#getParent <em>Parent</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.SubMode#getParsedInvariant <em>Parsed Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getSubMode()
 * @model
 * @generated
 */
public interface SubMode extends Mode {
	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' attribute.
	 * @see #setInvariant(String)
	 * @see se.mdh.progresside.remes.RemesPackage#getSubMode_Invariant()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantsSyntaxCorrect'"
	 * @generated
	 */
	String getInvariant();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.SubMode#getInvariant <em>Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' attribute.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(String value);

	/**
	 * Returns the value of the '<em><b>Is Urgent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Urgent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Urgent</em>' attribute.
	 * @see #setIsUrgent(boolean)
	 * @see se.mdh.progresside.remes.RemesPackage#getSubMode_IsUrgent()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsUrgent();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.SubMode#isIsUrgent <em>Is Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Urgent</em>' attribute.
	 * @see #isIsUrgent()
	 * @generated
	 */
	void setIsUrgent(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.CompositeMode#getSubModes <em>Sub Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CompositeMode)
	 * @see se.mdh.progresside.remes.RemesPackage#getSubMode_Parent()
	 * @see se.mdh.progresside.remes.CompositeMode#getSubModes
	 * @model opposite="subModes" transient="false"
	 * @generated
	 */
	CompositeMode getParent();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.SubMode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CompositeMode value);

	/**
	 * Returns the value of the '<em><b>Parsed Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsed Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsed Invariant</em>' containment reference.
	 * @see #setParsedInvariant(LogicalRoot)
	 * @see se.mdh.progresside.remes.RemesPackage#getSubMode_ParsedInvariant()
	 * @model containment="true"
	 * @generated
	 */
	LogicalRoot getParsedInvariant();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.SubMode#getParsedInvariant <em>Parsed Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed Invariant</em>' containment reference.
	 * @see #getParsedInvariant()
	 * @generated
	 */
	void setParsedInvariant(LogicalRoot value);

} // SubMode
