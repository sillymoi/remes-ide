/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.ExitPoint#getExitEdges <em>Exit Edges</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.ExitPoint#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getExitPoint()
 * @model
 * @generated
 */
public interface ExitPoint extends Point {
	/**
	 * Returns the value of the '<em><b>Exit Edges</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.Edge}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.Edge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Edges</em>' containment reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getExitPoint_ExitEdges()
	 * @see se.mdh.progresside.remes.Edge#getConnectFrom
	 * @model opposite="connectFrom" containment="true" required="true"
	 * @generated
	 */
	EList<Edge> getExitEdges();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.ControlPath#getExitPoint <em>Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(ControlPath)
	 * @see se.mdh.progresside.remes.RemesPackage#getExitPoint_Container()
	 * @see se.mdh.progresside.remes.ControlPath#getExitPoint
	 * @model opposite="exitPoint" required="true" transient="false"
	 * @generated
	 */
	ControlPath getContainer();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.ExitPoint#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ControlPath value);

} // ExitPoint
