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
 *   <li>{@link se.mdh.progresside.remes.EntryPoint#getContainer <em>Container</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.ControlPath#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(ControlPath)
	 * @see se.mdh.progresside.remes.RemesPackage#getEntryPoint_Container()
	 * @see se.mdh.progresside.remes.ControlPath#getEntryPoint
	 * @model opposite="entryPoint" required="true" transient="false"
	 * @generated
	 */
	ControlPath getContainer();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.EntryPoint#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ControlPath value);

} // EntryPoint
