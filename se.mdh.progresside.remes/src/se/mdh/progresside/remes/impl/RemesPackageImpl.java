/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import hr.fer.rasip.remes.grammars.logical.tree.TreePackage;
import hr.fer.rasip.remes.grammars.logical.tree.impl.TreePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.mdh.progresside.attributes.AttributesPackage;

import se.mdh.progresside.attributes.impl.AttributesPackageImpl;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.EntryConditionalSubEdge;
import se.mdh.progresside.remes.EntryConditionalTopEdge;
import se.mdh.progresside.remes.EntryConditionalTopInitEdge;
import se.mdh.progresside.remes.EntryEdge;
import se.mdh.progresside.remes.EntryInitEdge;
import se.mdh.progresside.remes.ExitConditionalSubEdge;
import se.mdh.progresside.remes.ExitConditionalTopEdge;
import se.mdh.progresside.remes.ExitEdge;
import se.mdh.progresside.remes.FromCompositeModeEdge;
import se.mdh.progresside.remes.FromCompositeModeInitEdge;
import se.mdh.progresside.remes.FromConditionalConnectorEdge;
import se.mdh.progresside.remes.FromSubModeEdge;
import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.InternalEdge;
import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.PrimitiveTypes;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.RemesFactory;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.Resource;
import se.mdh.progresside.remes.ResourceTypes;
import se.mdh.progresside.remes.SubMode;
import se.mdh.progresside.remes.ToCompositeModeEdge;
import se.mdh.progresside.remes.ToConditionalConnectorEdge;
import se.mdh.progresside.remes.ToSubModeEdge;
import se.mdh.progresside.remes.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemesPackageImpl extends EPackageImpl implements RemesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryConditionalSubEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryConditionalTopEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryConditionalTopInitEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryInitEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitConditionalSubEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitConditionalTopEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromCompositeModeEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromCompositeModeInitEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromConditionalConnectorEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromSubModeEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remesDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toCompositeModeEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toConditionalConnectorEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toSubModeEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

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
	private EEnum primitiveTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypesEEnum = null;

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
	 * @see se.mdh.progresside.remes.RemesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RemesPackageImpl() {
		super(eNS_URI, RemesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RemesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RemesPackage init() {
		if (isInited) return (RemesPackage)EPackage.Registry.INSTANCE.getEPackage(RemesPackage.eNS_URI);

		// Obtain or create and register package
		RemesPackageImpl theRemesPackage = (RemesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RemesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RemesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AttributesPackageImpl theAttributesPackage = (AttributesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AttributesPackage.eNS_URI) instanceof AttributesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AttributesPackage.eNS_URI) : AttributesPackage.eINSTANCE);
		TreePackageImpl theTreePackage = (TreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) instanceof TreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) : TreePackage.eINSTANCE);

		// Create package meta-data objects
		theRemesPackage.createPackageContents();
		theAttributesPackage.createPackageContents();
		theTreePackage.createPackageContents();

		// Initialize created meta-data
		theRemesPackage.initializePackageContents();
		theAttributesPackage.initializePackageContents();
		theTreePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRemesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RemesPackage.eNS_URI, theRemesPackage);
		return theRemesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeMode() {
		return compositeModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_ExitEdges() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_InitEdge() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_EntryEdge() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_SubModes() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_ConditionalConnectors() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalConnector() {
		return conditionalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalConnector_Name() {
		return (EAttribute)conditionalConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalConnector_EntryEdges() {
		return (EReference)conditionalConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalConnector_ExitEdges() {
		return (EReference)conditionalConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalConnector_Parent() {
		return (EReference)conditionalConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_ActionGuard() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_ActionBody() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_ParsedActionGuard() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryConditionalSubEdge() {
		return entryConditionalSubEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryConditionalTopEdge() {
		return entryConditionalTopEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryConditionalTopInitEdge() {
		return entryConditionalTopInitEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryEdge() {
		return entryEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryInitEdge() {
		return entryInitEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitConditionalSubEdge() {
		return exitConditionalSubEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitConditionalTopEdge() {
		return exitConditionalTopEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitEdge() {
		return exitEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromCompositeModeEdge() {
		return fromCompositeModeEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromCompositeModeEdge_ConnectFrom() {
		return (EReference)fromCompositeModeEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromCompositeModeInitEdge() {
		return fromCompositeModeInitEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromCompositeModeInitEdge_ConnectFrom() {
		return (EReference)fromCompositeModeInitEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromConditionalConnectorEdge() {
		return fromConditionalConnectorEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromConditionalConnectorEdge_ConnectFrom() {
		return (EReference)fromConditionalConnectorEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromSubModeEdge() {
		return fromSubModeEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromSubModeEdge_ConnectFrom() {
		return (EReference)fromSubModeEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitEdge() {
		return initEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitEdge_Initialization() {
		return (EAttribute)initEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalEdge() {
		return internalEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMode_Name() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMode_Initialization() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode_Variables() {
		return (EReference)modeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemesDiagram() {
		return remesDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemesDiagram_Modes() {
		return (EReference)remesDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubMode() {
		return subModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubMode_EntryEdges() {
		return (EReference)subModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubMode_ExitEdges() {
		return (EReference)subModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubMode_Invariant() {
		return (EAttribute)subModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubMode_IsUrgent() {
		return (EAttribute)subModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubMode_Parent() {
		return (EReference)subModeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubMode_Resources() {
		return (EReference)subModeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubMode_ParsedInvariant() {
		return (EReference)subModeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToCompositeModeEdge() {
		return toCompositeModeEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToCompositeModeEdge_ConnectTo() {
		return (EReference)toCompositeModeEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToConditionalConnectorEdge() {
		return toConditionalConnectorEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToConditionalConnectorEdge_ConnectTo() {
		return (EReference)toConditionalConnectorEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToSubModeEdge() {
		return toSubModeEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToSubModeEdge_ConnectTo() {
		return (EReference)toSubModeEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_VectorSize() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Global() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Scope() {
		return (EReference)variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Readable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Writable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Expression() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Type() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Scope() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveTypes() {
		return primitiveTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceTypes() {
		return resourceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemesFactory getRemesFactory() {
		return (RemesFactory)getEFactoryInstance();
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
		compositeModeEClass = createEClass(COMPOSITE_MODE);
		createEReference(compositeModeEClass, COMPOSITE_MODE__EXIT_EDGES);
		createEReference(compositeModeEClass, COMPOSITE_MODE__INIT_EDGE);
		createEReference(compositeModeEClass, COMPOSITE_MODE__ENTRY_EDGE);
		createEReference(compositeModeEClass, COMPOSITE_MODE__SUB_MODES);
		createEReference(compositeModeEClass, COMPOSITE_MODE__CONDITIONAL_CONNECTORS);

		conditionalConnectorEClass = createEClass(CONDITIONAL_CONNECTOR);
		createEAttribute(conditionalConnectorEClass, CONDITIONAL_CONNECTOR__NAME);
		createEReference(conditionalConnectorEClass, CONDITIONAL_CONNECTOR__ENTRY_EDGES);
		createEReference(conditionalConnectorEClass, CONDITIONAL_CONNECTOR__EXIT_EDGES);
		createEReference(conditionalConnectorEClass, CONDITIONAL_CONNECTOR__PARENT);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__ACTION_GUARD);
		createEAttribute(edgeEClass, EDGE__ACTION_BODY);
		createEReference(edgeEClass, EDGE__PARSED_ACTION_GUARD);

		entryConditionalSubEdgeEClass = createEClass(ENTRY_CONDITIONAL_SUB_EDGE);

		entryConditionalTopEdgeEClass = createEClass(ENTRY_CONDITIONAL_TOP_EDGE);

		entryConditionalTopInitEdgeEClass = createEClass(ENTRY_CONDITIONAL_TOP_INIT_EDGE);

		entryEdgeEClass = createEClass(ENTRY_EDGE);

		entryInitEdgeEClass = createEClass(ENTRY_INIT_EDGE);

		exitConditionalSubEdgeEClass = createEClass(EXIT_CONDITIONAL_SUB_EDGE);

		exitConditionalTopEdgeEClass = createEClass(EXIT_CONDITIONAL_TOP_EDGE);

		exitEdgeEClass = createEClass(EXIT_EDGE);

		fromCompositeModeEdgeEClass = createEClass(FROM_COMPOSITE_MODE_EDGE);
		createEReference(fromCompositeModeEdgeEClass, FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM);

		fromCompositeModeInitEdgeEClass = createEClass(FROM_COMPOSITE_MODE_INIT_EDGE);
		createEReference(fromCompositeModeInitEdgeEClass, FROM_COMPOSITE_MODE_INIT_EDGE__CONNECT_FROM);

		fromConditionalConnectorEdgeEClass = createEClass(FROM_CONDITIONAL_CONNECTOR_EDGE);
		createEReference(fromConditionalConnectorEdgeEClass, FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM);

		fromSubModeEdgeEClass = createEClass(FROM_SUB_MODE_EDGE);
		createEReference(fromSubModeEdgeEClass, FROM_SUB_MODE_EDGE__CONNECT_FROM);

		initEdgeEClass = createEClass(INIT_EDGE);
		createEAttribute(initEdgeEClass, INIT_EDGE__INITIALIZATION);

		internalEdgeEClass = createEClass(INTERNAL_EDGE);

		modeEClass = createEClass(MODE);
		createEAttribute(modeEClass, MODE__NAME);
		createEAttribute(modeEClass, MODE__INITIALIZATION);
		createEReference(modeEClass, MODE__VARIABLES);

		remesDiagramEClass = createEClass(REMES_DIAGRAM);
		createEReference(remesDiagramEClass, REMES_DIAGRAM__MODES);

		subModeEClass = createEClass(SUB_MODE);
		createEReference(subModeEClass, SUB_MODE__ENTRY_EDGES);
		createEReference(subModeEClass, SUB_MODE__EXIT_EDGES);
		createEAttribute(subModeEClass, SUB_MODE__INVARIANT);
		createEAttribute(subModeEClass, SUB_MODE__IS_URGENT);
		createEReference(subModeEClass, SUB_MODE__PARENT);
		createEReference(subModeEClass, SUB_MODE__RESOURCES);
		createEReference(subModeEClass, SUB_MODE__PARSED_INVARIANT);

		toCompositeModeEdgeEClass = createEClass(TO_COMPOSITE_MODE_EDGE);
		createEReference(toCompositeModeEdgeEClass, TO_COMPOSITE_MODE_EDGE__CONNECT_TO);

		toConditionalConnectorEdgeEClass = createEClass(TO_CONDITIONAL_CONNECTOR_EDGE);
		createEReference(toConditionalConnectorEdgeEClass, TO_CONDITIONAL_CONNECTOR_EDGE__CONNECT_TO);

		toSubModeEdgeEClass = createEClass(TO_SUB_MODE_EDGE);
		createEReference(toSubModeEdgeEClass, TO_SUB_MODE_EDGE__CONNECT_TO);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALUE);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__VECTOR_SIZE);
		createEAttribute(variableEClass, VARIABLE__GLOBAL);
		createEReference(variableEClass, VARIABLE__SCOPE);
		createEAttribute(variableEClass, VARIABLE__READABLE);
		createEAttribute(variableEClass, VARIABLE__WRITABLE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__EXPRESSION);
		createEAttribute(resourceEClass, RESOURCE__TYPE);
		createEReference(resourceEClass, RESOURCE__SCOPE);

		// Create enums
		primitiveTypesEEnum = createEEnum(PRIMITIVE_TYPES);
		resourceTypesEEnum = createEEnum(RESOURCE_TYPES);
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
		AttributesPackage theAttributesPackage = (AttributesPackage)EPackage.Registry.INSTANCE.getEPackage(AttributesPackage.eNS_URI);
		TreePackage theTreePackage = (TreePackage)EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeModeEClass.getESuperTypes().add(this.getMode());
		conditionalConnectorEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		edgeEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		entryConditionalSubEdgeEClass.getESuperTypes().add(this.getFromConditionalConnectorEdge());
		entryConditionalSubEdgeEClass.getESuperTypes().add(this.getToSubModeEdge());
		entryConditionalSubEdgeEClass.getESuperTypes().add(this.getEdge());
		entryConditionalTopEdgeEClass.getESuperTypes().add(this.getFromCompositeModeEdge());
		entryConditionalTopEdgeEClass.getESuperTypes().add(this.getToConditionalConnectorEdge());
		entryConditionalTopEdgeEClass.getESuperTypes().add(this.getEdge());
		entryConditionalTopInitEdgeEClass.getESuperTypes().add(this.getFromCompositeModeInitEdge());
		entryConditionalTopInitEdgeEClass.getESuperTypes().add(this.getToConditionalConnectorEdge());
		entryConditionalTopInitEdgeEClass.getESuperTypes().add(this.getInitEdge());
		entryEdgeEClass.getESuperTypes().add(this.getFromCompositeModeEdge());
		entryEdgeEClass.getESuperTypes().add(this.getToSubModeEdge());
		entryEdgeEClass.getESuperTypes().add(this.getEdge());
		entryInitEdgeEClass.getESuperTypes().add(this.getFromCompositeModeInitEdge());
		entryInitEdgeEClass.getESuperTypes().add(this.getToSubModeEdge());
		entryInitEdgeEClass.getESuperTypes().add(this.getInitEdge());
		exitConditionalSubEdgeEClass.getESuperTypes().add(this.getFromSubModeEdge());
		exitConditionalSubEdgeEClass.getESuperTypes().add(this.getToConditionalConnectorEdge());
		exitConditionalSubEdgeEClass.getESuperTypes().add(this.getEdge());
		exitConditionalTopEdgeEClass.getESuperTypes().add(this.getFromConditionalConnectorEdge());
		exitConditionalTopEdgeEClass.getESuperTypes().add(this.getToCompositeModeEdge());
		exitConditionalTopEdgeEClass.getESuperTypes().add(this.getEdge());
		exitEdgeEClass.getESuperTypes().add(this.getFromSubModeEdge());
		exitEdgeEClass.getESuperTypes().add(this.getToCompositeModeEdge());
		exitEdgeEClass.getESuperTypes().add(this.getEdge());
		internalEdgeEClass.getESuperTypes().add(this.getFromSubModeEdge());
		internalEdgeEClass.getESuperTypes().add(this.getToSubModeEdge());
		internalEdgeEClass.getESuperTypes().add(this.getEdge());
		modeEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		remesDiagramEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		subModeEClass.getESuperTypes().add(this.getMode());
		variableEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		resourceEClass.getESuperTypes().add(theAttributesPackage.getAttributable());

		// Initialize classes and features; add operations and parameters
		initEClass(compositeModeEClass, CompositeMode.class, "CompositeMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeMode_ExitEdges(), this.getToCompositeModeEdge(), this.getToCompositeModeEdge_ConnectTo(), "exitEdges", null, 1, -1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeMode_InitEdge(), this.getFromCompositeModeInitEdge(), this.getFromCompositeModeInitEdge_ConnectFrom(), "initEdge", null, 1, 1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeMode_EntryEdge(), this.getFromCompositeModeEdge(), this.getFromCompositeModeEdge_ConnectFrom(), "entryEdge", null, 1, 1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeMode_SubModes(), this.getSubMode(), this.getSubMode_Parent(), "subModes", null, 1, -1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeMode_ConditionalConnectors(), this.getConditionalConnector(), this.getConditionalConnector_Parent(), "conditionalConnectors", null, 0, -1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalConnectorEClass, ConditionalConnector.class, "ConditionalConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConditionalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalConnector_EntryEdges(), this.getToConditionalConnectorEdge(), this.getToConditionalConnectorEdge_ConnectTo(), "entryEdges", null, 1, -1, ConditionalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalConnector_ExitEdges(), this.getFromConditionalConnectorEdge(), this.getFromConditionalConnectorEdge_ConnectFrom(), "exitEdges", null, 1, -1, ConditionalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalConnector_Parent(), this.getCompositeMode(), this.getCompositeMode_ConditionalConnectors(), "parent", null, 0, 1, ConditionalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_ActionGuard(), ecorePackage.getEString(), "actionGuard", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_ActionBody(), ecorePackage.getEString(), "actionBody", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_ParsedActionGuard(), theTreePackage.getLogicalRoot(), null, "parsedActionGuard", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryConditionalSubEdgeEClass, EntryConditionalSubEdge.class, "EntryConditionalSubEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryConditionalTopEdgeEClass, EntryConditionalTopEdge.class, "EntryConditionalTopEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryConditionalTopInitEdgeEClass, EntryConditionalTopInitEdge.class, "EntryConditionalTopInitEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryEdgeEClass, EntryEdge.class, "EntryEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryInitEdgeEClass, EntryInitEdge.class, "EntryInitEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitConditionalSubEdgeEClass, ExitConditionalSubEdge.class, "ExitConditionalSubEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitConditionalTopEdgeEClass, ExitConditionalTopEdge.class, "ExitConditionalTopEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitEdgeEClass, ExitEdge.class, "ExitEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fromCompositeModeEdgeEClass, FromCompositeModeEdge.class, "FromCompositeModeEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromCompositeModeEdge_ConnectFrom(), this.getCompositeMode(), this.getCompositeMode_EntryEdge(), "connectFrom", null, 0, 1, FromCompositeModeEdge.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromCompositeModeInitEdgeEClass, FromCompositeModeInitEdge.class, "FromCompositeModeInitEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromCompositeModeInitEdge_ConnectFrom(), this.getCompositeMode(), this.getCompositeMode_InitEdge(), "connectFrom", null, 0, 1, FromCompositeModeInitEdge.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromConditionalConnectorEdgeEClass, FromConditionalConnectorEdge.class, "FromConditionalConnectorEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromConditionalConnectorEdge_ConnectFrom(), this.getConditionalConnector(), this.getConditionalConnector_ExitEdges(), "connectFrom", null, 0, 1, FromConditionalConnectorEdge.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromSubModeEdgeEClass, FromSubModeEdge.class, "FromSubModeEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromSubModeEdge_ConnectFrom(), this.getSubMode(), this.getSubMode_ExitEdges(), "connectFrom", null, 0, 1, FromSubModeEdge.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initEdgeEClass, InitEdge.class, "InitEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitEdge_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, InitEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalEdgeEClass, InternalEdge.class, "InternalEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modeEClass, Mode.class, "Mode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMode_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode_Variables(), this.getVariable(), this.getVariable_Scope(), "variables", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remesDiagramEClass, RemesDiagram.class, "RemesDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemesDiagram_Modes(), this.getMode(), null, "modes", null, 0, -1, RemesDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subModeEClass, SubMode.class, "SubMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubMode_EntryEdges(), this.getToSubModeEdge(), this.getToSubModeEdge_ConnectTo(), "entryEdges", null, 1, -1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubMode_ExitEdges(), this.getFromSubModeEdge(), this.getFromSubModeEdge_ConnectFrom(), "exitEdges", null, 1, -1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubMode_Invariant(), ecorePackage.getEString(), "invariant", null, 0, 1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubMode_IsUrgent(), ecorePackage.getEBoolean(), "isUrgent", "false", 0, 1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubMode_Parent(), this.getCompositeMode(), this.getCompositeMode_SubModes(), "parent", null, 0, 1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubMode_Resources(), this.getResource(), this.getResource_Scope(), "resources", null, 0, -1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubMode_ParsedInvariant(), theTreePackage.getLogicalRoot(), null, "parsedInvariant", null, 0, 1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toCompositeModeEdgeEClass, ToCompositeModeEdge.class, "ToCompositeModeEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToCompositeModeEdge_ConnectTo(), this.getCompositeMode(), this.getCompositeMode_ExitEdges(), "connectTo", null, 1, 1, ToCompositeModeEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toConditionalConnectorEdgeEClass, ToConditionalConnectorEdge.class, "ToConditionalConnectorEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToConditionalConnectorEdge_ConnectTo(), this.getConditionalConnector(), this.getConditionalConnector_EntryEdges(), "connectTo", null, 1, 1, ToConditionalConnectorEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toSubModeEdgeEClass, ToSubModeEdge.class, "ToSubModeEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToSubModeEdge_ConnectTo(), this.getSubMode(), this.getSubMode_EntryEdges(), "connectTo", null, 1, 1, ToSubModeEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getPrimitiveTypes(), "type", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_VectorSize(), ecorePackage.getEInt(), "vectorSize", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Global(), ecorePackage.getEBoolean(), "global", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Scope(), this.getMode(), this.getMode_Variables(), "scope", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Readable(), ecorePackage.getEBoolean(), "readable", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Writable(), ecorePackage.getEBoolean(), "writable", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Type(), this.getResourceTypes(), "type", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Scope(), this.getSubMode(), this.getSubMode_Resources(), "scope", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitiveTypesEEnum, PrimitiveTypes.class, "PrimitiveTypes");
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.BOOLEAN);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.INTEGER);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.NATURAL);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.CLOCK);

		initEEnum(resourceTypesEEnum, ResourceTypes.class, "ResourceTypes");
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.CPU);
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.MEMORY);
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.BANDWIDTH);
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.POWER);
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.PORT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (getEdge_ActionGuard(), 
		   source, 
		   new String[] {
			 "constraints", "InvariantsSyntaxCorrect"
		   });		
		addAnnotation
		  (getSubMode_Invariant(), 
		   source, 
		   new String[] {
			 "constraints", "InvariantsSyntaxCorrect"
		   });
	}

} //RemesPackageImpl
