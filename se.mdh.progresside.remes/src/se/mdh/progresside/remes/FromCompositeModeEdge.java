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
 * A representation of the model object '<em><b>From Composite Mode Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.FromCompositeModeEdge#getConnectFrom <em>Connect From</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getFromCompositeModeEdge()
 * @model abstract="true"
 * @generated
 */
public interface FromCompositeModeEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.CompositeMode#getEntryEdge <em>Entry Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect From</em>' container reference.
	 * @see #setConnectFrom(CompositeMode)
	 * @see se.mdh.progresside.remes.RemesPackage#getFromCompositeModeEdge_ConnectFrom()
	 * @see se.mdh.progresside.remes.CompositeMode#getEntryEdge
	 * @model opposite="entryEdge"
	 * @generated
	 */
	CompositeMode getConnectFrom();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.FromCompositeModeEdge#getConnectFrom <em>Connect From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect From</em>' container reference.
	 * @see #getConnectFrom()
	 * @generated
	 */
	void setConnectFrom(CompositeMode value);

} // FromCompositeModeEdge
