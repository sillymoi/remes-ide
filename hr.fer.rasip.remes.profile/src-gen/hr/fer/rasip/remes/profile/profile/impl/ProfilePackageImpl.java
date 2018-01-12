/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile.impl;

import hr.fer.rasip.remes.profile.profile.Constraint;
import hr.fer.rasip.remes.profile.profile.ConstraintOperation;
import hr.fer.rasip.remes.profile.profile.ConstraintType;
import hr.fer.rasip.remes.profile.profile.PlatformProfile;
import hr.fer.rasip.remes.profile.profile.ProfileFactory;
import hr.fer.rasip.remes.profile.profile.ProfilePackage;
import hr.fer.rasip.remes.profile.profile.Resource;
import hr.fer.rasip.remes.profile.profile.ResourceType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfilePackageImpl extends EPackageImpl implements ProfilePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass platformProfileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum resourceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum constraintTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum constraintOperationEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProfilePackageImpl()
  {
    super(eNS_URI, ProfileFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ProfilePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProfilePackage init()
  {
    if (isInited) return (ProfilePackage)EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI);

    // Obtain or create and register package
    ProfilePackageImpl theProfilePackage = (ProfilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProfilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProfilePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theProfilePackage.createPackageContents();

    // Initialize created meta-data
    theProfilePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProfilePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProfilePackage.eNS_URI, theProfilePackage);
    return theProfilePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlatformProfile()
  {
    return platformProfileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlatformProfile_Name()
  {
    return (EAttribute)platformProfileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlatformProfile_Resources()
  {
    return (EReference)platformProfileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlatformProfile_Constraints()
  {
    return (EReference)platformProfileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Name()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Type()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Weight()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Type()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_References()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_IsDerivation()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Operation()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Bound()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getResourceType()
  {
    return resourceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConstraintType()
  {
    return constraintTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConstraintOperation()
  {
    return constraintOperationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProfileFactory getProfileFactory()
  {
    return (ProfileFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    platformProfileEClass = createEClass(PLATFORM_PROFILE);
    createEAttribute(platformProfileEClass, PLATFORM_PROFILE__NAME);
    createEReference(platformProfileEClass, PLATFORM_PROFILE__RESOURCES);
    createEReference(platformProfileEClass, PLATFORM_PROFILE__CONSTRAINTS);

    resourceEClass = createEClass(RESOURCE);
    createEAttribute(resourceEClass, RESOURCE__NAME);
    createEAttribute(resourceEClass, RESOURCE__TYPE);
    createEAttribute(resourceEClass, RESOURCE__WEIGHT);

    constraintEClass = createEClass(CONSTRAINT);
    createEAttribute(constraintEClass, CONSTRAINT__TYPE);
    createEReference(constraintEClass, CONSTRAINT__REFERENCES);
    createEAttribute(constraintEClass, CONSTRAINT__IS_DERIVATION);
    createEAttribute(constraintEClass, CONSTRAINT__OPERATION);
    createEAttribute(constraintEClass, CONSTRAINT__BOUND);

    // Create enums
    resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
    constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
    constraintOperationEEnum = createEEnum(CONSTRAINT_OPERATION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(platformProfileEClass, PlatformProfile.class, "PlatformProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlatformProfile_Name(), ecorePackage.getEString(), "name", null, 0, 1, PlatformProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlatformProfile_Resources(), this.getResource(), null, "resources", null, 0, -1, PlatformProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlatformProfile_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, PlatformProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Type(), this.getResourceType(), "type", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstraint_Type(), this.getConstraintType(), "type", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_References(), this.getResource(), null, "references", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_IsDerivation(), ecorePackage.getEBoolean(), "isDerivation", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_Operation(), this.getConstraintOperation(), "operation", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_Bound(), ecorePackage.getEInt(), "bound", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
    addEEnumLiteral(resourceTypeEEnum, ResourceType.CPU);
    addEEnumLiteral(resourceTypeEEnum, ResourceType.MEMORY);
    addEEnumLiteral(resourceTypeEEnum, ResourceType.BANDWIDTH);
    addEEnumLiteral(resourceTypeEEnum, ResourceType.POWER);
    addEEnumLiteral(resourceTypeEEnum, ResourceType.PORT);

    initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.MINIMUM);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.MAXIMUM);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.AVERAGE);

    initEEnum(constraintOperationEEnum, ConstraintOperation.class, "ConstraintOperation");
    addEEnumLiteral(constraintOperationEEnum, ConstraintOperation.LESS);
    addEEnumLiteral(constraintOperationEEnum, ConstraintOperation.LESS_OR_EQUAL);
    addEEnumLiteral(constraintOperationEEnum, ConstraintOperation.EQUAL);
    addEEnumLiteral(constraintOperationEEnum, ConstraintOperation.GREATER_OR_EQUAL);
    addEEnumLiteral(constraintOperationEEnum, ConstraintOperation.GREATER);

    // Create resource
    createResource(eNS_URI);
  }

} //ProfilePackageImpl
