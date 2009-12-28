/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.mdh.progresside.remes.RemesPackage
 * @generated
 */
public interface RemesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RemesFactory eINSTANCE = se.mdh.progresside.remes.impl.RemesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Mode</em>'.
	 * @generated
	 */
	CompositeMode createCompositeMode();

	/**
	 * Returns a new object of class '<em>Conditional Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Connector</em>'.
	 * @generated
	 */
	ConditionalConnector createConditionalConnector();

	/**
	 * Returns a new object of class '<em>Entry Conditional Sub Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Conditional Sub Edge</em>'.
	 * @generated
	 */
	EntryConditionalSubEdge createEntryConditionalSubEdge();

	/**
	 * Returns a new object of class '<em>Entry Conditional Top Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Conditional Top Edge</em>'.
	 * @generated
	 */
	EntryConditionalTopEdge createEntryConditionalTopEdge();

	/**
	 * Returns a new object of class '<em>Entry Conditional Top Init Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Conditional Top Init Edge</em>'.
	 * @generated
	 */
	EntryConditionalTopInitEdge createEntryConditionalTopInitEdge();

	/**
	 * Returns a new object of class '<em>Entry Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Edge</em>'.
	 * @generated
	 */
	EntryEdge createEntryEdge();

	/**
	 * Returns a new object of class '<em>Entry Init Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Init Edge</em>'.
	 * @generated
	 */
	EntryInitEdge createEntryInitEdge();

	/**
	 * Returns a new object of class '<em>Exit Conditional Sub Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Conditional Sub Edge</em>'.
	 * @generated
	 */
	ExitConditionalSubEdge createExitConditionalSubEdge();

	/**
	 * Returns a new object of class '<em>Exit Conditional Top Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Conditional Top Edge</em>'.
	 * @generated
	 */
	ExitConditionalTopEdge createExitConditionalTopEdge();

	/**
	 * Returns a new object of class '<em>Exit Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Edge</em>'.
	 * @generated
	 */
	ExitEdge createExitEdge();

	/**
	 * Returns a new object of class '<em>Internal Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Edge</em>'.
	 * @generated
	 */
	InternalEdge createInternalEdge();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	RemesDiagram createRemesDiagram();

	/**
	 * Returns a new object of class '<em>Sub Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Mode</em>'.
	 * @generated
	 */
	SubMode createSubMode();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RemesPackage getRemesPackage();

} //RemesFactory
