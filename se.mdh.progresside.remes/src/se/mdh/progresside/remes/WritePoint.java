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
 * A representation of the model object '<em><b>Write Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.WritePoint#getContainer <em>Container</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.WritePoint#getWriteEdges <em>Write Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getWritePoint()
 * @model
 * @generated
 */
public interface WritePoint extends Point {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.CompositeMode#getWritePoint <em>Write Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(CompositeMode)
	 * @see se.mdh.progresside.remes.RemesPackage#getWritePoint_Container()
	 * @see se.mdh.progresside.remes.CompositeMode#getWritePoint
	 * @model opposite="writePoint" required="true" transient="false"
	 * @generated
	 */
	CompositeMode getContainer();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.WritePoint#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(CompositeMode value);

	/**
	 * Returns the value of the '<em><b>Write Edges</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.WriteEdge}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.WriteEdge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Edges</em>' containment reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getWritePoint_WriteEdges()
	 * @see se.mdh.progresside.remes.WriteEdge#getConnectTo
	 * @model opposite="connectTo" containment="true"
	 * @generated
	 */
	EList<WriteEdge> getWriteEdges();

} // WritePoint
