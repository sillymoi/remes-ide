/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.ActionRoot#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getActionRoot()
 * @model
 * @generated
 */
public interface ActionRoot extends AbstractRoot {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getActionRoot_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // ActionRoot
