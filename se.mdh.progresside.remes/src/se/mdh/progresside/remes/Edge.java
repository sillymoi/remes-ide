/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.Edge#getActionGuard <em>Action Guard</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Edge#getActionBody <em>Action Body</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Edge#getParsedActionGuard <em>Parsed Action Guard</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Edge#getConnectFrom <em>Connect From</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Edge#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.Edge#getParsedActionBody <em>Parsed Action Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Guard</em>' attribute.
	 * @see #setActionGuard(String)
	 * @see se.mdh.progresside.remes.RemesPackage#getEdge_ActionGuard()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantsSyntaxCorrect'"
	 * @generated
	 */
	String getActionGuard();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Edge#getActionGuard <em>Action Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Guard</em>' attribute.
	 * @see #getActionGuard()
	 * @generated
	 */
	void setActionGuard(String value);

	/**
	 * Returns the value of the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Body</em>' attribute.
	 * @see #setActionBody(String)
	 * @see se.mdh.progresside.remes.RemesPackage#getEdge_ActionBody()
	 * @model
	 * @generated
	 */
	String getActionBody();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Edge#getActionBody <em>Action Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Body</em>' attribute.
	 * @see #getActionBody()
	 * @generated
	 */
	void setActionBody(String value);

	/**
	 * Returns the value of the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsed Action Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsed Action Guard</em>' containment reference.
	 * @see #setParsedActionGuard(LogicalRoot)
	 * @see se.mdh.progresside.remes.RemesPackage#getEdge_ParsedActionGuard()
	 * @model containment="true"
	 * @generated
	 */
	LogicalRoot getParsedActionGuard();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Edge#getParsedActionGuard <em>Parsed Action Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed Action Guard</em>' containment reference.
	 * @see #getParsedActionGuard()
	 * @generated
	 */
	void setParsedActionGuard(LogicalRoot value);

	/**
	 * Returns the value of the '<em><b>Connect From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.ExitPoint#getExitEdges <em>Exit Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect From</em>' container reference.
	 * @see #setConnectFrom(ExitPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getEdge_ConnectFrom()
	 * @see se.mdh.progresside.remes.ExitPoint#getExitEdges
	 * @model opposite="exitEdges" required="true"
	 * @generated
	 */
	ExitPoint getConnectFrom();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Edge#getConnectFrom <em>Connect From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect From</em>' container reference.
	 * @see #getConnectFrom()
	 * @generated
	 */
	void setConnectFrom(ExitPoint value);

	/**
	 * Returns the value of the '<em><b>Connect To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.EntryPoint#getEntryEdges <em>Entry Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To</em>' reference.
	 * @see #setConnectTo(EntryPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getEdge_ConnectTo()
	 * @see se.mdh.progresside.remes.EntryPoint#getEntryEdges
	 * @model opposite="entryEdges" required="true"
	 * @generated
	 */
	EntryPoint getConnectTo();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Edge#getConnectTo <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To</em>' reference.
	 * @see #getConnectTo()
	 * @generated
	 */
	void setConnectTo(EntryPoint value);

	/**
	 * Returns the value of the '<em><b>Parsed Action Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsed Action Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsed Action Body</em>' containment reference.
	 * @see #setParsedActionBody(ActionRoot)
	 * @see se.mdh.progresside.remes.RemesPackage#getEdge_ParsedActionBody()
	 * @model containment="true"
	 * @generated
	 */
	ActionRoot getParsedActionBody();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.Edge#getParsedActionBody <em>Parsed Action Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed Action Body</em>' containment reference.
	 * @see #getParsedActionBody()
	 * @generated
	 */
	void setParsedActionBody(ActionRoot value);

} // Edge
