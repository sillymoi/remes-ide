/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.simulator;

import hr.fer.rasip.remes.gum.behaviour.Referable;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.Sensor#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.Sensor#getSource <em>Source</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.Sensor#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject {

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' container reference.
	 * @see #setConfiguration(SimulatorConfiguration)
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#getSensor_Configuration()
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getSensors
	 * @model opposite="sensors" required="true" transient="false"
	 * @generated
	 */
	SimulatorConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.simulator.Sensor#getConfiguration <em>Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' container reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(SimulatorConfiguration value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Referable)
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#getSensor_Source()
	 * @model required="true"
	 * @generated
	 */
	Referable getSource();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.simulator.Sensor#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Referable value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link hr.fer.rasip.remes.gum.simulator.SensorTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.simulator.SensorTrigger
	 * @see #setTrigger(SensorTrigger)
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#getSensor_Trigger()
	 * @model required="true"
	 * @generated
	 */
	SensorTrigger getTrigger();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.simulator.Sensor#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.simulator.SensorTrigger
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(SensorTrigger value);
} // Sensor
