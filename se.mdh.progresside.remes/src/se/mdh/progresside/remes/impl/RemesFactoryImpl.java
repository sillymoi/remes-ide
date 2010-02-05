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
			RemesFactory theRemesFactory = (RemesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mdh.se/progresside/remes/1.2.0/remes.ecore"); 
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
			case RemesPackage.REMES_DIAGRAM: return createRemesDiagram();
			case RemesPackage.COMPOSITE_MODE: return createCompositeMode();
			case RemesPackage.SUB_MODE: return createSubMode();
			case RemesPackage.CONDITIONAL_CONNECTOR: return createConditionalConnector();
			case RemesPackage.INIT_POINT: return createInitPoint();
			case RemesPackage.ENTRY_POINT: return createEntryPoint();
			case RemesPackage.EXIT_POINT: return createExitPoint();
			case RemesPackage.COMPOSITE_ENTRY_POINT: return createCompositeEntryPoint();
			case RemesPackage.COMPOSITE_EXIT_POINT: return createCompositeExitPoint();
			case RemesPackage.EDGE: return createEdge();
			case RemesPackage.INIT_EDGE: return createInitEdge();
			case RemesPackage.VARIABLE: return createVariable();
			case RemesPackage.RESOURCE: return createResource();
			case RemesPackage.CONSTANT: return createConstant();
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
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitEdge createInitEdge() {
		InitEdgeImpl initEdge = new InitEdgeImpl();
		return initEdge;
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
	public InitPoint createInitPoint() {
		InitPointImpl initPoint = new InitPointImpl();
		return initPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint createEntryPoint() {
		EntryPointImpl entryPoint = new EntryPointImpl();
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint createExitPoint() {
		ExitPointImpl exitPoint = new ExitPointImpl();
		return exitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeEntryPoint createCompositeEntryPoint() {
		CompositeEntryPointImpl compositeEntryPoint = new CompositeEntryPointImpl();
		return compositeEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeExitPoint createCompositeExitPoint() {
		CompositeExitPointImpl compositeExitPoint = new CompositeExitPointImpl();
		return compositeExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
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
