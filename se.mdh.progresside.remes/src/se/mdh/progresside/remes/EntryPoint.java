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
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.EntryPoint#getEntryEdges <em>Entry Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getEntryPoint()
 * @model
 * @generated
 */
public interface EntryPoint extends Point {
	/**
	 * Returns the value of the '<em><b>Entry Edges</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.Edge}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.Edge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Edges</em>' reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getEntryPoint_EntryEdges()
	 * @see se.mdh.progresside.remes.Edge#getConnectTo
	 * @model opposite="connectTo" required="true"
	 * @generated
	 */
	EList<Edge> getEntryEdges();

} // EntryPoint
