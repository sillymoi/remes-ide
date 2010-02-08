/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getActionRoot()
 * @model
 * @generated
 */
public interface ActionRoot extends AbstractRoot {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.grammars.expressions.ast.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getActionRoot_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // ActionRoot
