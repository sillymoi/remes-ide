/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.expressions;

import hr.fer.rasip.remes.gum.behaviour.Referable;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.VariableReference#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.VariableReference#getArrayIndex <em>Array Index</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.VariableReference#getResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getVariableReference_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.VariableReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Array Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Index</em>' containment reference.
	 * @see #setArrayIndex(Expression)
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getVariableReference_ArrayIndex()
	 * @model containment="true"
	 * @generated
	 */
	Expression getArrayIndex();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.VariableReference#getArrayIndex <em>Array Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Index</em>' containment reference.
	 * @see #getArrayIndex()
	 * @generated
	 */
	void setArrayIndex(Expression value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' reference.
	 * @see #setResolved(Referable)
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getVariableReference_Resolved()
	 * @model required="true"
	 * @generated
	 */
	Referable getResolved();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.VariableReference#getResolved <em>Resolved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' reference.
	 * @see #getResolved()
	 * @generated
	 */
	void setResolved(Referable value);

} // VariableReference
