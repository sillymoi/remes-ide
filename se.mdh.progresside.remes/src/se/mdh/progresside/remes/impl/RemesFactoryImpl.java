/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.mdh.progresside.remes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemesFactoryImpl extends EFactoryImpl implements RemesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RemesFactory init() {
		try {
			RemesFactory theRemesFactory = (RemesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mdh.se/progresside/remes/1.1.0/remes.ecore"); 
			if (theRemesFactory != null) {
				return theRemesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RemesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RemesPackage.COMPOSITE_MODE: return createCompositeMode();
			case RemesPackage.CONDITIONAL_CONNECTOR: return createConditionalConnector();
			case RemesPackage.ENTRY_CONDITIONAL_SUB_EDGE: return createEntryConditionalSubEdge();
			case RemesPackage.ENTRY_CONDITIONAL_TOP_EDGE: return createEntryConditionalTopEdge();
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE: return createEntryConditionalTopInitEdge();
			case RemesPackage.ENTRY_EDGE: return createEntryEdge();
			case RemesPackage.ENTRY_INIT_EDGE: return createEntryInitEdge();
			case RemesPackage.EXIT_CONDITIONAL_SUB_EDGE: return createExitConditionalSubEdge();
			case RemesPackage.EXIT_CONDITIONAL_TOP_EDGE: return createExitConditionalTopEdge();
			case RemesPackage.EXIT_EDGE: return createExitEdge();
			case RemesPackage.INTERNAL_EDGE: return createInternalEdge();
			case RemesPackage.REMES_DIAGRAM: return createRemesDiagram();
			case RemesPackage.SUB_MODE: return createSubMode();
			case RemesPackage.VARIABLE: return createVariable();
			case RemesPackage.RESOURCE: return createResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RemesPackage.PRIMITIVE_TYPES:
				return createPrimitiveTypesFromString(eDataType, initialValue);
			case RemesPackage.RESOURCE_TYPES:
				return createResourceTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RemesPackage.PRIMITIVE_TYPES:
				return convertPrimitiveTypesToString(eDataType, instanceValue);
			case RemesPackage.RESOURCE_TYPES:
				return convertResourceTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMode createCompositeMode() {
		CompositeModeImpl compositeMode = new CompositeModeImpl();
		return compositeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalConnector createConditionalConnector() {
		ConditionalConnectorImpl conditionalConnector = new ConditionalConnectorImpl();
		return conditionalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryConditionalSubEdge createEntryConditionalSubEdge() {
		EntryConditionalSubEdgeImpl entryConditionalSubEdge = new EntryConditionalSubEdgeImpl();
		return entryConditionalSubEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryConditionalTopEdge createEntryConditionalTopEdge() {
		EntryConditionalTopEdgeImpl entryConditionalTopEdge = new EntryConditionalTopEdgeImpl();
		return entryConditionalTopEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryConditionalTopInitEdge createEntryConditionalTopInitEdge() {
		EntryConditionalTopInitEdgeImpl entryConditionalTopInitEdge = new EntryConditionalTopInitEdgeImpl();
		return entryConditionalTopInitEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryEdge createEntryEdge() {
		EntryEdgeImpl entryEdge = new EntryEdgeImpl();
		return entryEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryInitEdge createEntryInitEdge() {
		EntryInitEdgeImpl entryInitEdge = new EntryInitEdgeImpl();
		return entryInitEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitConditionalSubEdge createExitConditionalSubEdge() {
		ExitConditionalSubEdgeImpl exitConditionalSubEdge = new ExitConditionalSubEdgeImpl();
		return exitConditionalSubEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitConditionalTopEdge createExitConditionalTopEdge() {
		ExitConditionalTopEdgeImpl exitConditionalTopEdge = new ExitConditionalTopEdgeImpl();
		return exitConditionalTopEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitEdge createExitEdge() {
		ExitEdgeImpl exitEdge = new ExitEdgeImpl();
		return exitEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEdge createInternalEdge() {
		InternalEdgeImpl internalEdge = new InternalEdgeImpl();
		return internalEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemesDiagram createRemesDiagram() {
		RemesDiagramImpl remesDiagram = new RemesDiagramImpl();
		return remesDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubMode createSubMode() {
		SubModeImpl subMode = new SubModeImpl();
		return subMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypes createPrimitiveTypesFromString(EDataType eDataType, String initialValue) {
		PrimitiveTypes result = PrimitiveTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypes createResourceTypesFromString(EDataType eDataType, String initialValue) {
		ResourceTypes result = ResourceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemesPackage getRemesPackage() {
		return (RemesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RemesPackage getPackage() {
		return RemesPackage.eINSTANCE;
	}

} //RemesFactoryImpl
