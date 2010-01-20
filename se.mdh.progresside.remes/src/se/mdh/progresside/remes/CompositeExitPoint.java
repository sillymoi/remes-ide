/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Exit Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.CompositeExitPoint#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getCompositeExitPoint()
 * @model
 * @generated
 */
public interface CompositeExitPoint extends EntryPoint {

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.CompositeMode#getCompositeExitPoint <em>Composite Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' container reference.
	 * @see #setComposite(CompositeMode)
	 * @see se.mdh.progresside.remes.RemesPackage#getCompositeExitPoint_Composite()
	 * @see se.mdh.progresside.remes.CompositeMode#getCompositeExitPoint
	 * @model opposite="compositeExitPoint" transient="false"
	 * @generated
	 */
	CompositeMode getComposite();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.CompositeExitPoint#getComposite <em>Composite</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite</em>' container reference.
	 * @see #getComposite()
	 * @generated
	 */
	void setComposite(CompositeMode value);
} // CompositeExitPoint
