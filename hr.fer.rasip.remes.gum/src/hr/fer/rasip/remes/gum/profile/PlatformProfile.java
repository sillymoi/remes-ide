/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.profile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.PlatformProfile#getResources <em>Resources</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.PlatformProfile#getConstantValues <em>Constant Values</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.PlatformProfile#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getPlatformProfile()
 * @model
 * @generated
 */
public interface PlatformProfile extends EObject {

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.profile.Resource}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.profile.Resource#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getPlatformProfile_Resources()
	 * @see hr.fer.rasip.remes.gum.profile.Resource#getPlatform
	 * @model opposite="platform" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Constant Values</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.profile.ConstantValue}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Values</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getPlatformProfile_ConstantValues()
	 * @see hr.fer.rasip.remes.gum.profile.ConstantValue#getPlatform
	 * @model opposite="platform" containment="true"
	 * @generated
	 */
	EList<ConstantValue> getConstantValues();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getPlatformProfile_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.profile.PlatformProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // PlatformProfile
