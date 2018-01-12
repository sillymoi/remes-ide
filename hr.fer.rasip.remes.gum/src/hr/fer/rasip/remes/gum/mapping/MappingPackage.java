/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.mapping;

import org.eclipse.emf.ecore.EClass;
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
 * @see hr.fer.rasip.remes.gum.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rasip.fer.hr/gum/0.1.0/mapping.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = hr.fer.rasip.remes.gum.mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.mapping.impl.MappingModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.mapping.impl.MappingModelImpl
	 * @see hr.fer.rasip.remes.gum.mapping.impl.MappingPackageImpl#getMappingModel()
	 * @generated
	 */
	int MAPPING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.mapping.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.mapping.impl.MappingImpl
	 * @see hr.fer.rasip.remes.gum.mapping.impl.MappingPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PORT = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.mapping.MappingModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see hr.fer.rasip.remes.gum.mapping.MappingModel
	 * @generated
	 */
	EClass getMappingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.mapping.MappingModel#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see hr.fer.rasip.remes.gum.mapping.MappingModel#getMappings()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_Mappings();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.mapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see hr.fer.rasip.remes.gum.mapping.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.mapping.Mapping#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hr.fer.rasip.remes.gum.mapping.Mapping#getVariable()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Variable();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.mapping.Mapping#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see hr.fer.rasip.remes.gum.mapping.Mapping#getPort()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Port();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

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
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.mapping.impl.MappingModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.mapping.impl.MappingModelImpl
		 * @see hr.fer.rasip.remes.gum.mapping.impl.MappingPackageImpl#getMappingModel()
		 * @generated
		 */
		EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__MAPPINGS = eINSTANCE.getMappingModel_Mappings();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.mapping.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.mapping.impl.MappingImpl
		 * @see hr.fer.rasip.remes.gum.mapping.impl.MappingPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__VARIABLE = eINSTANCE.getMapping_Variable();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__PORT = eINSTANCE.getMapping_Port();

	}

} //MappingPackage
