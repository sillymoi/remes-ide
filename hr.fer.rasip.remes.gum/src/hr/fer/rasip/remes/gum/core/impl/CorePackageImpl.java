/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.core.impl;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;

import hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl;

import hr.fer.rasip.remes.gum.core.BooleanType;
import hr.fer.rasip.remes.gum.core.ClockType;
import hr.fer.rasip.remes.gum.core.CoreFactory;
import hr.fer.rasip.remes.gum.core.CorePackage;
import hr.fer.rasip.remes.gum.core.Data;
import hr.fer.rasip.remes.gum.core.FloatType;
import hr.fer.rasip.remes.gum.core.IntegerType;

import hr.fer.rasip.remes.gum.core.NaturalType;
import hr.fer.rasip.remes.gum.expressions.ExpressionsPackage;

import hr.fer.rasip.remes.gum.expressions.impl.ExpressionsPackageImpl;

import hr.fer.rasip.remes.gum.mapping.MappingPackage;

import hr.fer.rasip.remes.gum.mapping.impl.MappingPackageImpl;

import hr.fer.rasip.remes.gum.profile.ProfilePackage;
import hr.fer.rasip.remes.gum.profile.impl.ProfilePackageImpl;
import hr.fer.rasip.remes.gum.simulator.SimulatorPackage;
import hr.fer.rasip.remes.gum.simulator.impl.SimulatorPackageImpl;
import hr.fer.rasip.remes.gum.structure.StructurePackage;

import hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatTypeEClass = null;

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
	 * @see hr.fer.rasip.remes.gum.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		BehaviourPackageImpl theBehaviourPackage = (BehaviourPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) instanceof BehaviourPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) : BehaviourPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);
		SimulatorPackageImpl theSimulatorPackage = (SimulatorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimulatorPackage.eNS_URI) instanceof SimulatorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimulatorPackage.eNS_URI) : SimulatorPackage.eINSTANCE);
		ProfilePackageImpl theProfilePackage = (ProfilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI) instanceof ProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI) : ProfilePackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviourPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theMappingPackage.createPackageContents();
		theSimulatorPackage.createPackageContents();
		theProfilePackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviourPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();
		theSimulatorPackage.initializePackageContents();
		theProfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockType() {
		return clockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalType() {
		return naturalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatType() {
		return floatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		dataEClass = createEClass(DATA);

		clockTypeEClass = createEClass(CLOCK_TYPE);

		integerTypeEClass = createEClass(INTEGER_TYPE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);

		naturalTypeEClass = createEClass(NATURAL_TYPE);

		floatTypeEClass = createEClass(FLOAT_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clockTypeEClass.getESuperTypes().add(this.getData());
		integerTypeEClass.getESuperTypes().add(this.getData());
		booleanTypeEClass.getESuperTypes().add(this.getData());
		naturalTypeEClass.getESuperTypes().add(this.getData());
		floatTypeEClass.getESuperTypes().add(this.getData());

		// Initialize classes and features; add operations and parameters
		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockTypeEClass, ClockType.class, "ClockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(naturalTypeEClass, NaturalType.class, "NaturalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CorePackageImpl
