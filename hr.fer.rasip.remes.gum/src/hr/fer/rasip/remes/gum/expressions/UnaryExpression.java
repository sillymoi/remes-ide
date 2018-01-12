/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.UnaryExpression#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.UnaryExpression#getParam1 <em>Param1</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hr.fer.rasip.remes.gum.expressions.UnaryOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.expressions.UnaryOperation
	 * @see #setType(UnaryOperation)
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getUnaryExpression_Type()
	 * @model required="true"
	 * @generated
	 */
	UnaryOperation getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.UnaryExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.expressions.UnaryOperation
	 * @see #getType()
	 * @generated
	 */
	void setType(UnaryOperation value);

	/**
	 * Returns the value of the '<em><b>Param1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param1</em>' containment reference.
	 * @see #setParam1(Expression)
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getUnaryExpression_Param1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getParam1();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.UnaryExpression#getParam1 <em>Param1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param1</em>' containment reference.
	 * @see #getParam1()
	 * @generated
	 */
	void setParam1(Expression value);

} // UnaryExpression
