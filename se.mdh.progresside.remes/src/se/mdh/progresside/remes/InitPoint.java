/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.InitPoint#getInitEdge <em>Init Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getInitPoint()
 * @model
 * @generated
 */
public interface InitPoint extends Point {
	/**
	 * Returns the value of the '<em><b>Init Edge</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.InitEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Edge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Edge</em>' containment reference.
	 * @see #setInitEdge(InitEdge)
	 * @see se.mdh.progresside.remes.RemesPackage#getInitPoint_InitEdge()
	 * @see se.mdh.progresside.remes.InitEdge#getConnectFrom
	 * @model opposite="connectFrom" containment="true" required="true"
	 * @generated
	 */
	InitEdge getInitEdge();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.InitPoint#getInitEdge <em>Init Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Edge</em>' containment reference.
	 * @see #getInitEdge()
	 * @generated
	 */
	void setInitEdge(InitEdge value);

} // InitPoint
