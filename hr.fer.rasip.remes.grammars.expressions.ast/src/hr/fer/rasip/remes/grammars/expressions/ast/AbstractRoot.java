/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast;

import hr.fer.rasip.remes.grammars.expressions.type.Type;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot#getReferencedVariables <em>Referenced Variables</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getAbstractRoot()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Variables</b></em>' reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.grammars.expressions.ast.VariableReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Variables</em>' reference list.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getAbstractRoot_ReferencedVariables()
	 * @model
	 * @generated
	 */
	EList<VariableReference> getReferencedVariables();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ResolvedType)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getAbstractRoot_Type()
	 * @model default="unknown" unsettable="true"
	 * @generated
	 */
	ResolvedType getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ResolvedType value);

	/**
	 * Unsets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ResolvedType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ResolvedType)
	 * @generated
	 */
	boolean isSetType();

} // AbstractRoot
