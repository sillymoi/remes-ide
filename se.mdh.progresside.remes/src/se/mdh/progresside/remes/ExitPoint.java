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

} // ExitPoint
