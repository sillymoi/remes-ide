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
 * A representation of the model object '<em><b>Composite Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getExitEdges <em>Exit Edges</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getInitEdge <em>Init Edge</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getEntryEdge <em>Entry Edge</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getSubModes <em>Sub Modes</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getConditionalConnectors <em>Conditional Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode()
 * @model
 * @generated
 */
public interface CompositeMode extends Mode {
	/**
	 * Returns the value of the '<em><b>Exit Edges</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.ToCompositeModeEdge}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.ToCompositeModeEdge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Edges</em>' reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode_ExitEdges()
	 * @see se.mdh.progresside.remes.ToCompositeModeEdge#getConnectTo
	 * @model opposite="connectTo" required="true"
	 * @generated
	 */
	EList<ToCompositeModeEdge> getExitEdges();

	/**
	 * Returns the value of the '<em><b>Init Edge</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.FromCompositeModeInitEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Edge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Edge</em>' containment reference.
	 * @see #setInitEdge(FromCompositeModeInitEdge)
	 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode_InitEdge()
	 * @see se.mdh.progresside.remes.FromCompositeModeInitEdge#getConnectFrom
	 * @model opposite="connectFrom" containment="true" required="true"
	 * @generated
	 */
	FromCompositeModeInitEdge getInitEdge();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.CompositeMode#getInitEdge <em>Init Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Edge</em>' containment reference.
	 * @see #getInitEdge()
	 * @generated
	 */
	void setInitEdge(FromCompositeModeInitEdge value);

	/**
	 * Returns the value of the '<em><b>Entry Edge</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.FromCompositeModeEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Edge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Edge</em>' containment reference.
	 * @see #setEntryEdge(FromCompositeModeEdge)
	 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode_EntryEdge()
	 * @see se.mdh.progresside.remes.FromCompositeModeEdge#getConnectFrom
	 * @model opposite="connectFrom" containment="true" required="true"
	 * @generated
	 */
	FromCompositeModeEdge getEntryEdge();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.CompositeMode#getEntryEdge <em>Entry Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Edge</em>' containment reference.
	 * @see #getEntryEdge()
	 * @generated
	 */
	void setEntryEdge(FromCompositeModeEdge value);

	/**
	 * Returns the value of the '<em><b>Sub Modes</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.SubMode}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.SubMode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Modes</em>' containment reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode_SubModes()
	 * @see se.mdh.progresside.remes.SubMode#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<SubMode> getSubModes();

	/**
	 * Returns the value of the '<em><b>Conditional Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.progresside.remes.ConditionalConnector}.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.ConditionalConnector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Connectors</em>' containment reference list.
	 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode_ConditionalConnectors()
	 * @see se.mdh.progresside.remes.ConditionalConnector#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ConditionalConnector> getConditionalConnectors();

} // CompositeMode
