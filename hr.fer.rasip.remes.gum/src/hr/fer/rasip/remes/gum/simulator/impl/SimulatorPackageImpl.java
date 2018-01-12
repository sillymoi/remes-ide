/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.simulator.impl;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;

import hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl;

import hr.fer.rasip.remes.gum.core.CorePackage;

import hr.fer.rasip.remes.gum.core.impl.CorePackageImpl;

import hr.fer.rasip.remes.gum.expressions.ExpressionsPackage;

import hr.fer.rasip.remes.gum.expressions.impl.ExpressionsPackageImpl;

import hr.fer.rasip.remes.gum.mapping.MappingPackage;

import hr.fer.rasip.remes.gum.mapping.impl.MappingPackageImpl;

import hr.fer.rasip.remes.gum.profile.ProfilePackage;

import hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl;

import hr.fer.rasip.remes.gum.simulator.Sensor;
import hr.fer.rasip.remes.gum.simulator.SensorTrigger;
import hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration;
import hr.fer.rasip.remes.gum.simulator.SimulatorFactory;
import hr.fer.rasip.remes.gum.simulator.SimulatorPackage;

import hr.fer.rasip.remes.gum.structure.StructurePackage;

import hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl;

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
public class SimulatorPackageImpl extends EPackageImpl implements SimulatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorTriggerEEnum = null;

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
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimulatorPackageImpl() {
		super(eNS_URI, SimulatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimulatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimulatorPackage init() {
		if (isInited) return (SimulatorPackage)EPackage.Registry.INSTANCE.getEPackage(SimulatorPackage.eNS_URI);

		// Obtain or create and register package
		SimulatorPackageImpl theSimulatorPackage = (SimulatorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimulatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimulatorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		BehaviourPackageImpl theBehaviourPackage = (BehaviourPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) instanceof BehaviourPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) : BehaviourPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);
		ProfilePackageImpl theProfilePackage = (ProfilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI) instanceof ProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI) : ProfilePackage.eINSTANCE);

		// Create package meta-data objects
		theSimulatorPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviourPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theMappingPackage.createPackageContents();
		theProfilePackage.createPackageContents();

		// Initialize created meta-data
		theSimulatorPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviourPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();
		theProfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimulatorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimulatorPackage.eNS_URI, theSimulatorPackage);
		return theSimulatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulatorConfiguration() {
		return simulatorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulatorConfiguration_Sensors() {
		return (EReference)simulatorConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulatorConfiguration_System() {
		return (EReference)simulatorConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulatorConfiguration_Profile() {
		return (EReference)simulatorConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Configuration() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Source() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Trigger() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorTrigger() {
		return sensorTriggerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatorFactory getSimulatorFactory() {
		return (SimulatorFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simulatorConfigurationEClass = createEClass(SIMULATOR_CONFIGURATION);
		createEReference(simulatorConfigurationEClass, SIMULATOR_CONFIGURATION__SENSORS);
		createEReference(simulatorConfigurationEClass, SIMULATOR_CONFIGURATION__SYSTEM);
		createEReference(simulatorConfigurationEClass, SIMULATOR_CONFIGURATION__PROFILE);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__CONFIGURATION);
		createEReference(sensorEClass, SENSOR__SOURCE);
		createEAttribute(sensorEClass, SENSOR__TRIGGER);

		// Create enums
		sensorTriggerEEnum = createEEnum(SENSOR_TRIGGER);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		ProfilePackage theProfilePackage = (ProfilePackage)EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI);
		BehaviourPackage theBehaviourPackage = (BehaviourPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(simulatorConfigurationEClass, SimulatorConfiguration.class, "SimulatorConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulatorConfiguration_Sensors(), this.getSensor(), this.getSensor_Configuration(), "sensors", null, 0, -1, SimulatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulatorConfiguration_System(), theStructurePackage.getStructureElement(), null, "system", null, 0, 1, SimulatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulatorConfiguration_Profile(), theProfilePackage.getPlatformProfile(), null, "profile", null, 0, 1, SimulatorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_Configuration(), this.getSimulatorConfiguration(), this.getSimulatorConfiguration_Sensors(), "configuration", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Source(), theBehaviourPackage.getReferable(), null, "source", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Trigger(), this.getSensorTrigger(), "trigger", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sensorTriggerEEnum, SensorTrigger.class, "SensorTrigger");
		addEEnumLiteral(sensorTriggerEEnum, SensorTrigger.VALUE_CHANGE);
		addEEnumLiteral(sensorTriggerEEnum, SensorTrigger.BEHAVIOUR_EXIT);

		// Create resource
		createResource(eNS_URI);
	}

} //SimulatorPackageImpl
