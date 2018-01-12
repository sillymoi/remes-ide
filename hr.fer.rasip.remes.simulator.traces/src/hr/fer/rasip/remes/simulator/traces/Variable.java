/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.simulator.traces;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.Variable#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.Variable#getRun <em>Run</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.Variable#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getVariable_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Run</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' container reference.
	 * @see #setRun(SimulatorRun)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getVariable_Run()
	 * @see hr.fer.rasip.remes.simulator.traces.SimulatorRun#getVariables
	 * @model opposite="variables" required="true" transient="false"
	 * @generated
	 */
	SimulatorRun getRun();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.Variable#getRun <em>Run</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run</em>' container reference.
	 * @see #getRun()
	 * @generated
	 */
	void setRun(SimulatorRun value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.simulator.traces.Value}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.simulator.traces.Value#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getVariable_Values()
	 * @see hr.fer.rasip.remes.simulator.traces.Value#getVariable
	 * @model opposite="variable" containment="true"
	 * @generated
	 */
	EList<Value> getValues();

} // Variable
