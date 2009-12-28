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
 * A representation of the model object '<em><b>Init Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.InitEdge#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.mdh.progresside.remes.RemesPackage#getInitEdge()
 * @model abstract="true"
 * @generated
 */
public interface InitEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' attribute.
	 * @see #setInitialization(String)
	 * @see se.mdh.progresside.remes.RemesPackage#getInitEdge_Initialization()
	 * @model
	 * @generated
	 */
	String getInitialization();

	/**
	 * Sets the value of the '{@link se.mdh.progresside.remes.InitEdge#getInitialization <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' attribute.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(String value);

} // InitEdge
