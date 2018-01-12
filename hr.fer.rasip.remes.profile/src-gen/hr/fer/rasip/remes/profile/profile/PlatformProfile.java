/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile;

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
 *   <li>{@link hr.fer.rasip.remes.profile.profile.PlatformProfile#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.PlatformProfile#getResources <em>Resources</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.PlatformProfile#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getPlatformProfile()
 * @model
 * @generated
 */
public interface PlatformProfile extends EObject
{
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
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getPlatformProfile_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hr.fer.rasip.remes.profile.profile.PlatformProfile#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link hr.fer.rasip.remes.profile.profile.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getPlatformProfile_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResources();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link hr.fer.rasip.remes.profile.profile.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getPlatformProfile_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // PlatformProfile
