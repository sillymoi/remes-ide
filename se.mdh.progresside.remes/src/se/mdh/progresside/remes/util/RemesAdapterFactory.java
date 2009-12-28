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

import se.mdh.progresside.attributes.Attributable;

import se.mdh.progresside.remes.*;

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
			public Adapter caseCompositeMode(CompositeMode object) {
				return createCompositeModeAdapter();
			}
			@Override
			public Adapter caseConditionalConnector(ConditionalConnector object) {
				return createConditionalConnectorAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseEntryConditionalSubEdge(EntryConditionalSubEdge object) {
				return createEntryConditionalSubEdgeAdapter();
			}
			@Override
			public Adapter caseEntryConditionalTopEdge(EntryConditionalTopEdge object) {
				return createEntryConditionalTopEdgeAdapter();
			}
			@Override
			public Adapter caseEntryConditionalTopInitEdge(EntryConditionalTopInitEdge object) {
				return createEntryConditionalTopInitEdgeAdapter();
			}
			@Override
			public Adapter caseEntryEdge(EntryEdge object) {
				return createEntryEdgeAdapter();
			}
			@Override
			public Adapter caseEntryInitEdge(EntryInitEdge object) {
				return createEntryInitEdgeAdapter();
			}
			@Override
			public Adapter caseExitConditionalSubEdge(ExitConditionalSubEdge object) {
				return createExitConditionalSubEdgeAdapter();
			}
			@Override
			public Adapter caseExitConditionalTopEdge(ExitConditionalTopEdge object) {
				return createExitConditionalTopEdgeAdapter();
			}
			@Override
			public Adapter caseExitEdge(ExitEdge object) {
				return createExitEdgeAdapter();
			}
			@Override
			public Adapter caseFromCompositeModeEdge(FromCompositeModeEdge object) {
				return createFromCompositeModeEdgeAdapter();
			}
			@Override
			public Adapter caseFromCompositeModeInitEdge(FromCompositeModeInitEdge object) {
				return createFromCompositeModeInitEdgeAdapter();
			}
			@Override
			public Adapter caseFromConditionalConnectorEdge(FromConditionalConnectorEdge object) {
				return createFromConditionalConnectorEdgeAdapter();
			}
			@Override
			public Adapter caseFromSubModeEdge(FromSubModeEdge object) {
				return createFromSubModeEdgeAdapter();
			}
			@Override
			public Adapter caseInitEdge(InitEdge object) {
				return createInitEdgeAdapter();
			}
			@Override
			public Adapter caseInternalEdge(InternalEdge object) {
				return createInternalEdgeAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseRemesDiagram(RemesDiagram object) {
				return createRemesDiagramAdapter();
			}
			@Override
			public Adapter caseSubMode(SubMode object) {
				return createSubModeAdapter();
			}
			@Override
			public Adapter caseToCompositeModeEdge(ToCompositeModeEdge object) {
				return createToCompositeModeEdgeAdapter();
			}
			@Override
			public Adapter caseToConditionalConnectorEdge(ToConditionalConnectorEdge object) {
				return createToConditionalConnectorEdgeAdapter();
			}
			@Override
			public Adapter caseToSubModeEdge(ToSubModeEdge object) {
				return createToSubModeEdgeAdapter();
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
			public Adapter caseAttributable(Attributable object) {
				return createAttributableAdapter();
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
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.EntryConditionalSubEdge <em>Entry Conditional Sub Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.EntryConditionalSubEdge
	 * @generated
	 */
	public Adapter createEntryConditionalSubEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.EntryConditionalTopEdge <em>Entry Conditional Top Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.EntryConditionalTopEdge
	 * @generated
	 */
	public Adapter createEntryConditionalTopEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.EntryConditionalTopInitEdge <em>Entry Conditional Top Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.EntryConditionalTopInitEdge
	 * @generated
	 */
	public Adapter createEntryConditionalTopInitEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.EntryEdge <em>Entry Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.EntryEdge
	 * @generated
	 */
	public Adapter createEntryEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.EntryInitEdge <em>Entry Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.EntryInitEdge
	 * @generated
	 */
	public Adapter createEntryInitEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.ExitConditionalSubEdge <em>Exit Conditional Sub Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.ExitConditionalSubEdge
	 * @generated
	 */
	public Adapter createExitConditionalSubEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.ExitConditionalTopEdge <em>Exit Conditional Top Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.ExitConditionalTopEdge
	 * @generated
	 */
	public Adapter createExitConditionalTopEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.ExitEdge <em>Exit Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.ExitEdge
	 * @generated
	 */
	public Adapter createExitEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.FromCompositeModeEdge <em>From Composite Mode Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.FromCompositeModeEdge
	 * @generated
	 */
	public Adapter createFromCompositeModeEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.FromCompositeModeInitEdge <em>From Composite Mode Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.FromCompositeModeInitEdge
	 * @generated
	 */
	public Adapter createFromCompositeModeInitEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.FromConditionalConnectorEdge <em>From Conditional Connector Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.FromConditionalConnectorEdge
	 * @generated
	 */
	public Adapter createFromConditionalConnectorEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.FromSubModeEdge <em>From Sub Mode Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.FromSubModeEdge
	 * @generated
	 */
	public Adapter createFromSubModeEdgeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.InternalEdge <em>Internal Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.InternalEdge
	 * @generated
	 */
	public Adapter createInternalEdgeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.ToCompositeModeEdge <em>To Composite Mode Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.ToCompositeModeEdge
	 * @generated
	 */
	public Adapter createToCompositeModeEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.ToConditionalConnectorEdge <em>To Conditional Connector Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.ToConditionalConnectorEdge
	 * @generated
	 */
	public Adapter createToConditionalConnectorEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.remes.ToSubModeEdge <em>To Sub Mode Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.remes.ToSubModeEdge
	 * @generated
	 */
	public Adapter createToSubModeEdgeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link se.mdh.progresside.attributes.Attributable <em>Attributable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.progresside.attributes.Attributable
	 * @generated
	 */
	public Adapter createAttributableAdapter() {
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
