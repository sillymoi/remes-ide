/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hr.fer.rasip.remes.profile.profile.ProfileFactory
 * @model kind="package"
 * @generated
 */
public interface ProfilePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "profile";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.rasip.fer.hr/remes/1.2.0/profile/profile.ecore";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "profile";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProfilePackage eINSTANCE = hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl.init();

  /**
   * The meta object id for the '{@link hr.fer.rasip.remes.profile.profile.impl.PlatformProfileImpl <em>Platform Profile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hr.fer.rasip.remes.profile.profile.impl.PlatformProfileImpl
   * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getPlatformProfile()
   * @generated
   */
  int PLATFORM_PROFILE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_PROFILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_PROFILE__RESOURCES = 1;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_PROFILE__CONSTRAINTS = 2;

  /**
   * The number of structural features of the '<em>Platform Profile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_PROFILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hr.fer.rasip.remes.profile.profile.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hr.fer.rasip.remes.profile.profile.impl.ResourceImpl
   * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__WEIGHT = 2;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hr.fer.rasip.remes.profile.profile.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hr.fer.rasip.remes.profile.profile.impl.ConstraintImpl
   * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__TYPE = 0;

  /**
   * The feature id for the '<em><b>References</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__REFERENCES = 1;

  /**
   * The feature id for the '<em><b>Is Derivation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__IS_DERIVATION = 2;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__OPERATION = 3;

  /**
   * The feature id for the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__BOUND = 4;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link hr.fer.rasip.remes.profile.profile.ResourceType <em>Resource Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hr.fer.rasip.remes.profile.profile.ResourceType
   * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getResourceType()
   * @generated
   */
  int RESOURCE_TYPE = 3;

  /**
   * The meta object id for the '{@link hr.fer.rasip.remes.profile.profile.ConstraintType <em>Constraint Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hr.fer.rasip.remes.profile.profile.ConstraintType
   * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getConstraintType()
   * @generated
   */
  int CONSTRAINT_TYPE = 4;

  /**
   * The meta object id for the '{@link hr.fer.rasip.remes.profile.profile.ConstraintOperation <em>Constraint Operation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hr.fer.rasip.remes.profile.profile.ConstraintOperation
   * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getConstraintOperation()
   * @generated
   */
  int CONSTRAINT_OPERATION = 5;


  /**
   * Returns the meta object for class '{@link hr.fer.rasip.remes.profile.profile.PlatformProfile <em>Platform Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Platform Profile</em>'.
   * @see hr.fer.rasip.remes.profile.profile.PlatformProfile
   * @generated
   */
  EClass getPlatformProfile();

  /**
   * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.profile.profile.PlatformProfile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hr.fer.rasip.remes.profile.profile.PlatformProfile#getName()
   * @see #getPlatformProfile()
   * @generated
   */
  EAttribute getPlatformProfile_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.profile.profile.PlatformProfile#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see hr.fer.rasip.remes.profile.profile.PlatformProfile#getResources()
   * @see #getPlatformProfile()
   * @generated
   */
  EReference getPlatformProfile_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.profile.profile.PlatformProfile#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see hr.fer.rasip.remes.profile.profile.PlatformProfile#getConstraints()
   * @see #getPlatformProfile()
   * @generated
   */
  EReference getPlatformProfile_Constraints();

  /**
   * Returns the meta object for class '{@link hr.fer.rasip.remes.profile.profile.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.profile.profile.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.profile.profile.Resource#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Resource#getType()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Type();

  /**
   * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.profile.profile.Resource#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Resource#getWeight()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Weight();

  /**
   * Returns the meta object for class '{@link hr.fer.rasip.remes.profile.profile.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.profile.profile.Constraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Constraint#getType()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Type();

  /**
   * Returns the meta object for the reference '{@link hr.fer.rasip.remes.profile.profile.Constraint#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>References</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Constraint#getReferences()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_References();

  /**
   * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.profile.profile.Constraint#isIsDerivation <em>Is Derivation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Derivation</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Constraint#isIsDerivation()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_IsDerivation();

  /**
   * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.profile.profile.Constraint#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Constraint#getOperation()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Operation();

  /**
   * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.profile.profile.Constraint#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bound</em>'.
   * @see hr.fer.rasip.remes.profile.profile.Constraint#getBound()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Bound();

  /**
   * Returns the meta object for enum '{@link hr.fer.rasip.remes.profile.profile.ResourceType <em>Resource Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Resource Type</em>'.
   * @see hr.fer.rasip.remes.profile.profile.ResourceType
   * @generated
   */
  EEnum getResourceType();

  /**
   * Returns the meta object for enum '{@link hr.fer.rasip.remes.profile.profile.ConstraintType <em>Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Constraint Type</em>'.
   * @see hr.fer.rasip.remes.profile.profile.ConstraintType
   * @generated
   */
  EEnum getConstraintType();

  /**
   * Returns the meta object for enum '{@link hr.fer.rasip.remes.profile.profile.ConstraintOperation <em>Constraint Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Constraint Operation</em>'.
   * @see hr.fer.rasip.remes.profile.profile.ConstraintOperation
   * @generated
   */
  EEnum getConstraintOperation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProfileFactory getProfileFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hr.fer.rasip.remes.profile.profile.impl.PlatformProfileImpl <em>Platform Profile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hr.fer.rasip.remes.profile.profile.impl.PlatformProfileImpl
     * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getPlatformProfile()
     * @generated
     */
    EClass PLATFORM_PROFILE = eINSTANCE.getPlatformProfile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLATFORM_PROFILE__NAME = eINSTANCE.getPlatformProfile_Name();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLATFORM_PROFILE__RESOURCES = eINSTANCE.getPlatformProfile_Resources();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLATFORM_PROFILE__CONSTRAINTS = eINSTANCE.getPlatformProfile_Constraints();

    /**
     * The meta object literal for the '{@link hr.fer.rasip.remes.profile.profile.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hr.fer.rasip.remes.profile.profile.impl.ResourceImpl
     * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__TYPE = eINSTANCE.getResource_Type();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__WEIGHT = eINSTANCE.getResource_Weight();

    /**
     * The meta object literal for the '{@link hr.fer.rasip.remes.profile.profile.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hr.fer.rasip.remes.profile.profile.impl.ConstraintImpl
     * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

    /**
     * The meta object literal for the '<em><b>References</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__REFERENCES = eINSTANCE.getConstraint_References();

    /**
     * The meta object literal for the '<em><b>Is Derivation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__IS_DERIVATION = eINSTANCE.getConstraint_IsDerivation();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__OPERATION = eINSTANCE.getConstraint_Operation();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__BOUND = eINSTANCE.getConstraint_Bound();

    /**
     * The meta object literal for the '{@link hr.fer.rasip.remes.profile.profile.ResourceType <em>Resource Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hr.fer.rasip.remes.profile.profile.ResourceType
     * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getResourceType()
     * @generated
     */
    EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

    /**
     * The meta object literal for the '{@link hr.fer.rasip.remes.profile.profile.ConstraintType <em>Constraint Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hr.fer.rasip.remes.profile.profile.ConstraintType
     * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getConstraintType()
     * @generated
     */
    EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

    /**
     * The meta object literal for the '{@link hr.fer.rasip.remes.profile.profile.ConstraintOperation <em>Constraint Operation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hr.fer.rasip.remes.profile.profile.ConstraintOperation
     * @see hr.fer.rasip.remes.profile.profile.impl.ProfilePackageImpl#getConstraintOperation()
     * @generated
     */
    EEnum CONSTRAINT_OPERATION = eINSTANCE.getConstraintOperation();

  }

} //ProfilePackage
