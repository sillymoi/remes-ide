/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hr.fer.rasip.remes.profile.profile.ProfilePackage
 * @generated
 */
public interface ProfileFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProfileFactory eINSTANCE = hr.fer.rasip.remes.profile.profile.impl.ProfileFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Platform Profile</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Platform Profile</em>'.
   * @generated
   */
  PlatformProfile createPlatformProfile();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProfilePackage getProfilePackage();

} //ProfileFactory
