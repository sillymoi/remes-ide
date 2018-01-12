/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.BinaryExpression#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.BinaryExpression#getParam1 <em>Param1</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.BinaryExpression#getParam2 <em>Param2</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hr.fer.rasip.remes.gum.expressions.BinaryOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.expressions.BinaryOperation
	 * @see #setType(BinaryOperation)
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getBinaryExpression_Type()
	 * @model required="true"
	 * @generated
	 */
	BinaryOperation getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.BinaryExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.expressions.BinaryOperation
	 * @see #getType()
	 * @generated
	 */
	void setType(BinaryOperation value);

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
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getBinaryExpression_Param1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getParam1();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.BinaryExpression#getParam1 <em>Param1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param1</em>' containment reference.
	 * @see #getParam1()
	 * @generated
	 */
	void setParam1(Expression value);

	/**
	 * Returns the value of the '<em><b>Param2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param2</em>' containment reference.
	 * @see #setParam2(Expression)
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getBinaryExpression_Param2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getParam2();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.BinaryExpression#getParam2 <em>Param2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param2</em>' containment reference.
	 * @see #getParam2()
	 * @generated
	 */
	void setParam2(Expression value);

} // BinaryExpression
