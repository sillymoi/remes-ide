/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.profile;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
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
 * @see hr.fer.rasip.remes.gum.profile.ProfileFactory
 * @model kind="package"
 * @generated
 */
public interface ProfilePackage extends EPackage {
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
	String eNS_URI = "http://www.rasip.fer.hr/gum/0.1.0/profile.ecore";

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
	ProfilePackage eINSTANCE = hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.profile.impl.PlatformProfileImpl <em>Platform Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.profile.impl.PlatformProfileImpl
	 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getPlatformProfile()
	 * @generated
	 */
	int PLATFORM_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PROFILE__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Constant Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PROFILE__CONSTANT_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PROFILE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Platform Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PROFILE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.profile.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.profile.impl.ResourceImpl
	 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getResource()
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
	int RESOURCE__NAME = BehaviourPackage.REFERABLE__NAME;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__REFERENCES = BehaviourPackage.REFERABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PLATFORM = BehaviourPackage.REFERABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = BehaviourPackage.REFERABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = BehaviourPackage.REFERABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.profile.impl.ConstantValueImpl <em>Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.profile.impl.ConstantValueImpl
	 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getConstantValue()
	 * @generated
	 */
	int CONSTANT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE__DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.profile.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.profile.impl.ConstraintImpl
	 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 3;

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
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__RESOURCE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 6;


	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.profile.ConstraintType <em>Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.profile.ConstraintType
	 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getConstraintType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.profile.ConstraintOperation <em>Constraint Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.profile.ConstraintOperation
	 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getConstraintOperation()
	 * @generated
	 */
	int CONSTRAINT_OPERATION = 5;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.profile.PlatformProfile <em>Platform Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Profile</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.PlatformProfile
	 * @generated
	 */
	EClass getPlatformProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.profile.PlatformProfile#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.PlatformProfile#getResources()
	 * @see #getPlatformProfile()
	 * @generated
	 */
	EReference getPlatformProfile_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.profile.PlatformProfile#getConstantValues <em>Constant Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constant Values</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.PlatformProfile#getConstantValues()
	 * @see #getPlatformProfile()
	 * @generated
	 */
	EReference getPlatformProfile_ConstantValues();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.profile.PlatformProfile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.PlatformProfile#getName()
	 * @see #getPlatformProfile()
	 * @generated
	 */
	EAttribute getPlatformProfile_Name();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.profile.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link hr.fer.rasip.remes.gum.profile.Resource#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Resource#getReferences()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_References();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.profile.Resource#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Platform</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Resource#getPlatform()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Platform();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.profile.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.profile.ConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Value</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.ConstantValue
	 * @generated
	 */
	EClass getConstantValue();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Platform</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.ConstantValue#getPlatform()
	 * @see #getConstantValue()
	 * @generated
	 */
	EReference getConstantValue_Platform();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.ConstantValue#getDefinition()
	 * @see #getConstantValue()
	 * @generated
	 */
	EReference getConstantValue_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.gum.profile.ConstantValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.ConstantValue#getValue()
	 * @see #getConstantValue()
	 * @generated
	 */
	EReference getConstantValue_Value();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.profile.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.profile.Constraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Constraint#getType()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Type();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.profile.Constraint#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>References</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Constraint#getReferences()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_References();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.profile.Constraint#isIsDerivation <em>Is Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derivation</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Constraint#isIsDerivation()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_IsDerivation();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.profile.Constraint#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Constraint#getOperation()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Operation();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.profile.Constraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Constraint#getBound()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Bound();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.profile.Constraint#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.Constraint#getResourceName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ResourceName();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.gum.profile.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Type</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.ConstraintType
	 * @generated
	 */
	EEnum getConstraintType();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.gum.profile.ConstraintOperation <em>Constraint Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Operation</em>'.
	 * @see hr.fer.rasip.remes.gum.profile.ConstraintOperation
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
	interface Literals {
		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.profile.impl.PlatformProfileImpl <em>Platform Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.profile.impl.PlatformProfileImpl
		 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getPlatformProfile()
		 * @generated
		 */
		EClass PLATFORM_PROFILE = eINSTANCE.getPlatformProfile();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_PROFILE__RESOURCES = eINSTANCE.getPlatformProfile_Resources();

		/**
		 * The meta object literal for the '<em><b>Constant Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_PROFILE__CONSTANT_VALUES = eINSTANCE.getPlatformProfile_ConstantValues();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_PROFILE__NAME = eINSTANCE.getPlatformProfile_Name();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.profile.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.profile.impl.ResourceImpl
		 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__REFERENCES = eINSTANCE.getResource_References();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PLATFORM = eINSTANCE.getResource_Platform();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TYPE = eINSTANCE.getResource_Type();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.profile.impl.ConstantValueImpl <em>Constant Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.profile.impl.ConstantValueImpl
		 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getConstantValue()
		 * @generated
		 */
		EClass CONSTANT_VALUE = eINSTANCE.getConstantValue();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_VALUE__PLATFORM = eINSTANCE.getConstantValue_Platform();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_VALUE__DEFINITION = eINSTANCE.getConstantValue_Definition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_VALUE__VALUE = eINSTANCE.getConstantValue_Value();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.profile.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.profile.impl.ConstraintImpl
		 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getConstraint()
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
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__RESOURCE_NAME = eINSTANCE.getConstraint_ResourceName();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.profile.ConstraintType <em>Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.profile.ConstraintType
		 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getConstraintType()
		 * @generated
		 */
		EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.profile.ConstraintOperation <em>Constraint Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.profile.ConstraintOperation
		 * @see hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl#getConstraintOperation()
		 * @generated
		 */
		EEnum CONSTRAINT_OPERATION = eINSTANCE.getConstraintOperation();

	}

} //ProfilePackage
