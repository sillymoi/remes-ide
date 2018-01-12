/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.simulator.traces;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulator Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getId <em>Id</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getBehaviorName <em>Behavior Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getSimulatorRun()
 * @model
 * @generated
 */
public interface SimulatorRun extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getSimulatorRun_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getSimulatorRun_Timestamp()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Behavior Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Name</em>' attribute.
	 * @see #setBehaviorName(String)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getSimulatorRun_BehaviorName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBehaviorName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getBehaviorName <em>Behavior Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Name</em>' attribute.
	 * @see #getBehaviorName()
	 * @generated
	 */
	void setBehaviorName(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.simulator.traces.Variable}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.simulator.traces.Variable#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getSimulatorRun_Variables()
	 * @see hr.fer.rasip.remes.simulator.traces.Variable#getRun
	 * @model opposite="run" containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // SimulatorRun
