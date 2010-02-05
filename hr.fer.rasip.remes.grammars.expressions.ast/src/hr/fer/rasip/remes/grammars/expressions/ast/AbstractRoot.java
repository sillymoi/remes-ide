/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast;

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

} // AbstractRoot
