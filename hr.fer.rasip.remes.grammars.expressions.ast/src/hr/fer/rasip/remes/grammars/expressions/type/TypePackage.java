/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see hr.fer.rasip.remes.grammars.expressions.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rasip.fer.hr/remes/1.1.0/expressions/type.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expression.type";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypePackage eINSTANCE = hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.type.Type <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.type.Type
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.BaseTypeImpl <em>Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.BaseTypeImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getBaseType()
	 * @generated
	 */
	int BASE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.IntegerTypeImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.NaturalTypeImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getNaturalType()
	 * @generated
	 */
	int NATURAL_TYPE = 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.ClockTypeImpl <em>Clock Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.ClockTypeImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getClockType()
	 * @generated
	 */
	int CLOCK_TYPE = 5;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.FloatTypeImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 6;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.BooleanTypeImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Natural Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.ResourceTypeImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.AnyTypeImpl <em>Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.AnyTypeImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getAnyType()
	 * @generated
	 */
	int ANY_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.type.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.type.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.type.BaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.type.BaseType
	 * @generated
	 */
	EClass getBaseType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.type.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.type.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.type.NaturalType <em>Natural Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.type.NaturalType
	 * @generated
	 */
	EClass getNaturalType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.type.ClockType <em>Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.type.ClockType
	 * @generated
	 */
	EClass getClockType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.type.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.type.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.type.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.type.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.type.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.type.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.type.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.type.AnyType
	 * @generated
	 */
	EClass getAnyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeFactory getTypeFactory();

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
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.type.Type <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.type.Type
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.BaseTypeImpl <em>Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.BaseTypeImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getBaseType()
		 * @generated
		 */
		EClass BASE_TYPE = eINSTANCE.getBaseType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.IntegerTypeImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.NaturalTypeImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getNaturalType()
		 * @generated
		 */
		EClass NATURAL_TYPE = eINSTANCE.getNaturalType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.ClockTypeImpl <em>Clock Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.ClockTypeImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getClockType()
		 * @generated
		 */
		EClass CLOCK_TYPE = eINSTANCE.getClockType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.FloatTypeImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.ResourceTypeImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.BooleanTypeImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.type.impl.AnyTypeImpl <em>Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.AnyTypeImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl#getAnyType()
		 * @generated
		 */
		EClass ANY_TYPE = eINSTANCE.getAnyType();

	}

} //TypePackage
