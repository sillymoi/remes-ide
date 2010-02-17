/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.Expression#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.Expression#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {

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
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getExpression_Type()
	 * @model default="unknown" unsettable="true"
	 * @generated
	 */
	ResolvedType getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.Expression#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.Expression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ResolvedType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.Expression#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ResolvedType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getExpression_Text()
	 * @model unique="false" required="true" derived="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.Expression#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(AstVisitor visitor);
} // Expression
