/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam1 <em>Param1</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam2 <em>Param2</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam3 <em>Param3</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getTernaryExpression()
 * @model
 * @generated
 */
public interface TernaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation
	 * @see #setType(TernaryOperation)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getTernaryExpression_Type()
	 * @model required="true"
	 * @generated
	 */
	TernaryOperation getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation
	 * @see #getType()
	 * @generated
	 */
	void setType(TernaryOperation value);

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
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getTernaryExpression_Param1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getParam1();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam1 <em>Param1</em>}' containment reference.
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
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getTernaryExpression_Param2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getParam2();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam2 <em>Param2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param2</em>' containment reference.
	 * @see #getParam2()
	 * @generated
	 */
	void setParam2(Expression value);

	/**
	 * Returns the value of the '<em><b>Param3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param3</em>' containment reference.
	 * @see #setParam3(Expression)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getTernaryExpression_Param3()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getParam3();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam3 <em>Param3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param3</em>' containment reference.
	 * @see #getParam3()
	 * @generated
	 */
	void setParam3(Expression value);

} // TernaryExpression
