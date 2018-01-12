/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.core;

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
 * @see hr.fer.rasip.remes.gum.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rasip.fer.hr/gum/0.1.0/core.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = hr.fer.rasip.remes.gum.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.core.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.core.impl.DataImpl
	 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getData()
	 * @generated
	 */
	int DATA = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.core.impl.ClockTypeImpl <em>Clock Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.core.impl.ClockTypeImpl
	 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getClockType()
	 * @generated
	 */
	int CLOCK_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Clock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.core.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.core.impl.IntegerTypeImpl
	 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getIntegerType()
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
	int INTEGER_TYPE_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.core.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.core.impl.BooleanTypeImpl
	 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getBooleanType()
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
	int BOOLEAN_TYPE_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.core.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.core.impl.NaturalTypeImpl
	 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getNaturalType()
	 * @generated
	 */
	int NATURAL_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Natural Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.core.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.core.impl.FloatTypeImpl
	 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.core.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see hr.fer.rasip.remes.gum.core.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.core.ClockType <em>Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Type</em>'.
	 * @see hr.fer.rasip.remes.gum.core.ClockType
	 * @generated
	 */
	EClass getClockType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.core.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see hr.fer.rasip.remes.gum.core.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.core.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see hr.fer.rasip.remes.gum.core.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.core.NaturalType <em>Natural Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Type</em>'.
	 * @see hr.fer.rasip.remes.gum.core.NaturalType
	 * @generated
	 */
	EClass getNaturalType();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.core.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see hr.fer.rasip.remes.gum.core.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.core.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.core.impl.DataImpl
		 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.core.impl.ClockTypeImpl <em>Clock Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.core.impl.ClockTypeImpl
		 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getClockType()
		 * @generated
		 */
		EClass CLOCK_TYPE = eINSTANCE.getClockType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.core.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.core.impl.IntegerTypeImpl
		 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.core.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.core.impl.BooleanTypeImpl
		 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.core.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.core.impl.NaturalTypeImpl
		 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getNaturalType()
		 * @generated
		 */
		EClass NATURAL_TYPE = eINSTANCE.getNaturalType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.core.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.core.impl.FloatTypeImpl
		 * @see hr.fer.rasip.remes.gum.core.impl.CorePackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

	}

} //CorePackage
