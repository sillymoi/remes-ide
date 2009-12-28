/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Sub Mode Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.ToSubModeEdge#getConnectTo <em>Connect To</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getToSubModeEdge()
 * @model abstract="true"
 * @generated
 */
public interface ToSubModeEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.SubMode#getEntryEdges <em>Entry Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To</em>' reference.
	 * @see #setConnectTo(SubMode)
	 * @see se.mdh.progresside.remes.RemesPackage#getToSubModeEdge_ConnectTo()
	 * @see se.mdh.progresside.remes.SubMode#getEntryEdges
	 * @model opposite="entryEdges" required="true"
	 * @generated
	 */
	SubMode getConnectTo();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.ToSubModeEdge#getConnectTo <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To</em>' reference.
	 * @see #getConnectTo()
	 * @generated
	 */
	void setConnectTo(SubMode value);

} // ToSubModeEdge
