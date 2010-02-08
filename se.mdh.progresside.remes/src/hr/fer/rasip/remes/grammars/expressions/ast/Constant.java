/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.Constant#getText <em>Text</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.Constant#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Expression {
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
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getConstant_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.Constant#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.Constant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // Constant
