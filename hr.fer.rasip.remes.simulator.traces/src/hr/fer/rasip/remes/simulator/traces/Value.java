/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.simulator.traces;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.Value#getVariable <em>Variable</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.Value#getClockMin <em>Clock Min</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.Value#getClockMax <em>Clock Max</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.Value#getValueMin <em>Value Min</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.Value#getValueMax <em>Value Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.simulator.traces.Variable#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' container reference.
	 * @see #setVariable(Variable)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getValue_Variable()
	 * @see hr.fer.rasip.remes.simulator.traces.Variable#getValues
	 * @model opposite="values" required="true" transient="false"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.Value#getVariable <em>Variable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' container reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Clock Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Min</em>' attribute.
	 * @see #setClockMin(float)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getValue_ClockMin()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getClockMin();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.Value#getClockMin <em>Clock Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Min</em>' attribute.
	 * @see #getClockMin()
	 * @generated
	 */
	void setClockMin(float value);

	/**
	 * Returns the value of the '<em><b>Clock Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Max</em>' attribute.
	 * @see #setClockMax(float)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getValue_ClockMax()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getClockMax();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.Value#getClockMax <em>Clock Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Max</em>' attribute.
	 * @see #getClockMax()
	 * @generated
	 */
	void setClockMax(float value);

	/**
	 * Returns the value of the '<em><b>Value Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Min</em>' attribute.
	 * @see #setValueMin(float)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getValue_ValueMin()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getValueMin();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.Value#getValueMin <em>Value Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Min</em>' attribute.
	 * @see #getValueMin()
	 * @generated
	 */
	void setValueMin(float value);

	/**
	 * Returns the value of the '<em><b>Value Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Max</em>' attribute.
	 * @see #setValueMax(float)
	 * @see hr.fer.rasip.remes.simulator.traces.TracesPackage#getValue_ValueMax()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getValueMax();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.simulator.traces.Value#getValueMax <em>Value Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Max</em>' attribute.
	 * @see #getValueMax()
	 * @generated
	 */
	void setValueMax(float value);

} // Value
