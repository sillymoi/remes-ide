/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import se.mdh.progresside.attributes.Attributable;

import se.mdh.progresside.remes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see se.mdh.progresside.remes.RemesPackage
 * @generated
 */
public class RemesSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RemesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemesSwitch() {
		if (modelPackage == null) {
			modelPackage = RemesPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RemesPackage.COMPOSITE_MODE: {
				CompositeMode compositeMode = (CompositeMode)theEObject;
				T result = caseCompositeMode(compositeMode);
				if (result == null) result = caseMode(compositeMode);
				if (result == null) result = caseAttributable(compositeMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.CONDITIONAL_CONNECTOR: {
				ConditionalConnector conditionalConnector = (ConditionalConnector)theEObject;
				T result = caseConditionalConnector(conditionalConnector);
				if (result == null) result = caseAttributable(conditionalConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseAttributable(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.ENTRY_CONDITIONAL_SUB_EDGE: {
				EntryConditionalSubEdge entryConditionalSubEdge = (EntryConditionalSubEdge)theEObject;
				T result = caseEntryConditionalSubEdge(entryConditionalSubEdge);
				if (result == null) result = caseFromConditionalConnectorEdge(entryConditionalSubEdge);
				if (result == null) result = caseToSubModeEdge(entryConditionalSubEdge);
				if (result == null) result = caseEdge(entryConditionalSubEdge);
				if (result == null) result = caseAttributable(entryConditionalSubEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.ENTRY_CONDITIONAL_TOP_EDGE: {
				EntryConditionalTopEdge entryConditionalTopEdge = (EntryConditionalTopEdge)theEObject;
				T result = caseEntryConditionalTopEdge(entryConditionalTopEdge);
				if (result == null) result = caseFromCompositeModeEdge(entryConditionalTopEdge);
				if (result == null) result = caseToConditionalConnectorEdge(entryConditionalTopEdge);
				if (result == null) result = caseEdge(entryConditionalTopEdge);
				if (result == null) result = caseAttributable(entryConditionalTopEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE: {
				EntryConditionalTopInitEdge entryConditionalTopInitEdge = (EntryConditionalTopInitEdge)theEObject;
				T result = caseEntryConditionalTopInitEdge(entryConditionalTopInitEdge);
				if (result == null) result = caseFromCompositeModeInitEdge(entryConditionalTopInitEdge);
				if (result == null) result = caseToConditionalConnectorEdge(entryConditionalTopInitEdge);
				if (result == null) result = caseInitEdge(entryConditionalTopInitEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.ENTRY_EDGE: {
				EntryEdge entryEdge = (EntryEdge)theEObject;
				T result = caseEntryEdge(entryEdge);
				if (result == null) result = caseFromCompositeModeEdge(entryEdge);
				if (result == null) result = caseToSubModeEdge(entryEdge);
				if (result == null) result = caseEdge(entryEdge);
				if (result == null) result = caseAttributable(entryEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.ENTRY_INIT_EDGE: {
				EntryInitEdge entryInitEdge = (EntryInitEdge)theEObject;
				T result = caseEntryInitEdge(entryInitEdge);
				if (result == null) result = caseFromCompositeModeInitEdge(entryInitEdge);
				if (result == null) result = caseToSubModeEdge(entryInitEdge);
				if (result == null) result = caseInitEdge(entryInitEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.EXIT_CONDITIONAL_SUB_EDGE: {
				ExitConditionalSubEdge exitConditionalSubEdge = (ExitConditionalSubEdge)theEObject;
				T result = caseExitConditionalSubEdge(exitConditionalSubEdge);
				if (result == null) result = caseFromSubModeEdge(exitConditionalSubEdge);
				if (result == null) result = caseToConditionalConnectorEdge(exitConditionalSubEdge);
				if (result == null) result = caseEdge(exitConditionalSubEdge);
				if (result == null) result = caseAttributable(exitConditionalSubEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.EXIT_CONDITIONAL_TOP_EDGE: {
				ExitConditionalTopEdge exitConditionalTopEdge = (ExitConditionalTopEdge)theEObject;
				T result = caseExitConditionalTopEdge(exitConditionalTopEdge);
				if (result == null) result = caseFromConditionalConnectorEdge(exitConditionalTopEdge);
				if (result == null) result = caseToCompositeModeEdge(exitConditionalTopEdge);
				if (result == null) result = caseEdge(exitConditionalTopEdge);
				if (result == null) result = caseAttributable(exitConditionalTopEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.EXIT_EDGE: {
				ExitEdge exitEdge = (ExitEdge)theEObject;
				T result = caseExitEdge(exitEdge);
				if (result == null) result = caseFromSubModeEdge(exitEdge);
				if (result == null) result = caseToCompositeModeEdge(exitEdge);
				if (result == null) result = caseEdge(exitEdge);
				if (result == null) result = caseAttributable(exitEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.FROM_COMPOSITE_MODE_EDGE: {
				FromCompositeModeEdge fromCompositeModeEdge = (FromCompositeModeEdge)theEObject;
				T result = caseFromCompositeModeEdge(fromCompositeModeEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.FROM_COMPOSITE_MODE_INIT_EDGE: {
				FromCompositeModeInitEdge fromCompositeModeInitEdge = (FromCompositeModeInitEdge)theEObject;
				T result = caseFromCompositeModeInitEdge(fromCompositeModeInitEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE: {
				FromConditionalConnectorEdge fromConditionalConnectorEdge = (FromConditionalConnectorEdge)theEObject;
				T result = caseFromConditionalConnectorEdge(fromConditionalConnectorEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.FROM_SUB_MODE_EDGE: {
				FromSubModeEdge fromSubModeEdge = (FromSubModeEdge)theEObject;
				T result = caseFromSubModeEdge(fromSubModeEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.INIT_EDGE: {
				InitEdge initEdge = (InitEdge)theEObject;
				T result = caseInitEdge(initEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.INTERNAL_EDGE: {
				InternalEdge internalEdge = (InternalEdge)theEObject;
				T result = caseInternalEdge(internalEdge);
				if (result == null) result = caseFromSubModeEdge(internalEdge);
				if (result == null) result = caseToSubModeEdge(internalEdge);
				if (result == null) result = caseEdge(internalEdge);
				if (result == null) result = caseAttributable(internalEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.MODE: {
				Mode mode = (Mode)theEObject;
				T result = caseMode(mode);
				if (result == null) result = caseAttributable(mode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.REMES_DIAGRAM: {
				RemesDiagram remesDiagram = (RemesDiagram)theEObject;
				T result = caseRemesDiagram(remesDiagram);
				if (result == null) result = caseAttributable(remesDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.SUB_MODE: {
				SubMode subMode = (SubMode)theEObject;
				T result = caseSubMode(subMode);
				if (result == null) result = caseMode(subMode);
				if (result == null) result = caseAttributable(subMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.TO_COMPOSITE_MODE_EDGE: {
				ToCompositeModeEdge toCompositeModeEdge = (ToCompositeModeEdge)theEObject;
				T result = caseToCompositeModeEdge(toCompositeModeEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.TO_CONDITIONAL_CONNECTOR_EDGE: {
				ToConditionalConnectorEdge toConditionalConnectorEdge = (ToConditionalConnectorEdge)theEObject;
				T result = caseToConditionalConnectorEdge(toConditionalConnectorEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.TO_SUB_MODE_EDGE: {
				ToSubModeEdge toSubModeEdge = (ToSubModeEdge)theEObject;
				T result = caseToSubModeEdge(toSubModeEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseAttributable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RemesPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseAttributable(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMode(CompositeMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalConnector(ConditionalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Conditional Sub Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Conditional Sub Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryConditionalSubEdge(EntryConditionalSubEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Conditional Top Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Conditional Top Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryConditionalTopEdge(EntryConditionalTopEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Conditional Top Init Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Conditional Top Init Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryConditionalTopInitEdge(EntryConditionalTopInitEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryEdge(EntryEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Init Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Init Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryInitEdge(EntryInitEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Conditional Sub Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Conditional Sub Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitConditionalSubEdge(ExitConditionalSubEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Conditional Top Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Conditional Top Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitConditionalTopEdge(ExitConditionalTopEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitEdge(ExitEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Composite Mode Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Composite Mode Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromCompositeModeEdge(FromCompositeModeEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Composite Mode Init Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Composite Mode Init Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromCompositeModeInitEdge(FromCompositeModeInitEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Conditional Connector Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Conditional Connector Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromConditionalConnectorEdge(FromConditionalConnectorEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Sub Mode Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Sub Mode Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromSubModeEdge(FromSubModeEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitEdge(InitEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEdge(InternalEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemesDiagram(RemesDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubMode(SubMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Composite Mode Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Composite Mode Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToCompositeModeEdge(ToCompositeModeEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Conditional Connector Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Conditional Connector Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToConditionalConnectorEdge(ToConditionalConnectorEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Sub Mode Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Sub Mode Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToSubModeEdge(ToSubModeEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributable(Attributable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //RemesSwitch
