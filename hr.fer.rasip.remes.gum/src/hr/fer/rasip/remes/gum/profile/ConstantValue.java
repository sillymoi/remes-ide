/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.profile;

import hr.fer.rasip.remes.gum.behaviour.Constant;
import hr.fer.rasip.remes.gum.core.Data;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getPlatform <em>Platform</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getDefinition <em>Definition</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getConstantValue()
 * @model
 * @generated
 */
public interface ConstantValue extends EObject {

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.profile.PlatformProfile#getConstantValues <em>Constant Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' container reference.
	 * @see #setPlatform(PlatformProfile)
	 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getConstantValue_Platform()
	 * @see hr.fer.rasip.remes.gum.profile.PlatformProfile#getConstantValues
	 * @model opposite="constantValues" required="true" transient="false"
	 * @generated
	 */
	PlatformProfile getPlatform();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getPlatform <em>Platform</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' container reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(PlatformProfile value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(Constant)
	 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getConstantValue_Definition()
	 * @see hr.fer.rasip.remes.gum.behaviour.Constant#getResolved
	 * @model opposite="resolved"
	 * @generated
	 */
	Constant getDefinition();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Constant value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Data)
	 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getConstantValue_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Data getValue();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Data value);
} // ConstantValue
