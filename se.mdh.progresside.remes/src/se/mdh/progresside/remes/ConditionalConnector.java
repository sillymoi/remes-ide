/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.ConditionalConnector#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getConditionalConnector()
 * @model
 * @generated
 */
public interface ConditionalConnector extends ControlPath {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.progresside.remes.CompositeMode#getConditionalConnectors <em>Conditional Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CompositeMode)
	 * @see se.mdh.progresside.remes.RemesPackage#getConditionalConnector_Parent()
	 * @see se.mdh.progresside.remes.CompositeMode#getConditionalConnectors
	 * @model opposite="conditionalConnectors" transient="false"
	 * @generated
	 */
	CompositeMode getParent();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.ConditionalConnector#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CompositeMode value);

} // ConditionalConnector
