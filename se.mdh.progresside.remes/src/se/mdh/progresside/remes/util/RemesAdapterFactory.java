/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import se.mdh.progresside.remes.*;
import se.mdh.progresside.remes.CompositeEntryPoint;
import se.mdh.progresside.remes.CompositeExitPoint;
import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.ControlPath;
import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.Point;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.Resource;
import se.mdh.progresside.remes.SubMode;
import se.mdh.progresside.remes.Variable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.mdh.progresside.remes.RemesPackage
 * @generated
 */
public class RemesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RemesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RemesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemesSwitch<Adapter> modelSwitch =
		new RemesSwitch<Adapter>() {
			@Override
			public Adapter caseRemesDiagram(RemesDiagram object) {
				return createRemesDiagramAdapter();
			}
			@Override
			public Adapter caseControlPath(ControlPath object) {
				return createControlPathAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseCompositeMode(CompositeMode object) {
				return createCompositeModeAdapter();
			}
			@Override
			public Adapter caseSubMode(SubMode object) {
				return createSubModeAdapter();
			}
			@Override
			public Adapter caseConditionalConnector(ConditionalConnector object) {
				return createConditionalConnectorAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter caseInitPoint(InitPoint object) {
				return createInitPointAdapter();
			}
			@Override
			public Adapter caseEntryPoint(EntryPoint object) {
				return createEntryPointAdapter();
			}
			@Override
			public Adapter caseExitPoint(ExitPoint object) {
				return createExitPointAdapter();
			}
			@Override
			public Adapter caseCompositeEntryPoint(CompositeEntryPoint object) {
				return createCompositeEntryPointAdapter();
			}
			@Override
			public Adapter caseCompositeExitPoint(CompositeExitPoint object) {
				return createCompositeExitPointAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseInitEdge(InitEdge object) {
				return createInitEdgeAdapter();
			}
			@Override
			public Adapter caseReferable(Referable object) {
				return createReferableAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.CompositeMode <em>Composite Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.CompositeMode
	 * @generated
	 */
	public Adapter createCompositeModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.ConditionalConnector <em>Conditional Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.ConditionalConnector
	 * @generated
	 */
	public Adapter createConditionalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.InitEdge <em>Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.InitEdge
	 * @generated
	 */
	public Adapter createInitEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.Referable <em>Referable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.Referable
	 * @generated
	 */
	public Adapter createReferableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.RemesDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.RemesDiagram
	 * @generated
	 */
	public Adapter createRemesDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.SubMode <em>Sub Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.SubMode
	 * @generated
	 */
	public Adapter createSubModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.InitPoint <em>Init Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.InitPoint
	 * @generated
	 */
	public Adapter createInitPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.EntryPoint
	 * @generated
	 */
	public Adapter createEntryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.ExitPoint <em>Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.ExitPoint
	 * @generated
	 */
	public Adapter createExitPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.ControlPath <em>Control Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.ControlPath
	 * @generated
	 */
	public Adapter createControlPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.CompositeEntryPoint <em>Composite Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.CompositeEntryPoint
	 * @generated
	 */
	public Adapter createCompositeEntryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.CompositeExitPoint <em>Composite Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.CompositeExitPoint
	 * @generated
	 */
	public Adapter createCompositeExitPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RemesAdapterFactory
