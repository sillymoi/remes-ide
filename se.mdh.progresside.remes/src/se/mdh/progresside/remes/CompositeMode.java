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
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getSubModes <em>Sub Modes</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getConditionalConnectors <em>Conditional Connectors</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getInitPoint <em>Init Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getCompositeEntryPoint <em>Composite Entry Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.CompositeMode#getCompositeExitPoint <em>Composite Exit Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode()
 * @model
 * @generated
 */
public interface CompositeMode extends Mode {
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

	/**
	 * Returns the value of the '<em><b>Init Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Point</em>' containment reference.
	 * @see #setInitPoint(InitPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode_InitPoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InitPoint getInitPoint();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.CompositeMode#getInitPoint <em>Init Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Point</em>' containment reference.
	 * @see #getInitPoint()
	 * @generated
	 */
	void setInitPoint(InitPoint value);

	/**
	 * Returns the value of the '<em><b>Composite Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Entry Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Entry Point</em>' containment reference.
	 * @see #setCompositeEntryPoint(CompositeEntryPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode_CompositeEntryPoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompositeEntryPoint getCompositeEntryPoint();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.CompositeMode#getCompositeEntryPoint <em>Composite Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Entry Point</em>' containment reference.
	 * @see #getCompositeEntryPoint()
	 * @generated
	 */
	void setCompositeEntryPoint(CompositeEntryPoint value);

	/**
	 * Returns the value of the '<em><b>Composite Exit Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Exit Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Exit Point</em>' containment reference.
	 * @see #setCompositeExitPoint(CompositeExitPoint)
	 * @see se.mdh.progresside.remes.RemesPackage#getCompositeMode_CompositeExitPoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompositeExitPoint getCompositeExitPoint();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.CompositeMode#getCompositeExitPoint <em>Composite Exit Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Exit Point</em>' containment reference.
	 * @see #getCompositeExitPoint()
	 * @generated
	 */
	void setCompositeExitPoint(CompositeExitPoint value);

} // CompositeMode
