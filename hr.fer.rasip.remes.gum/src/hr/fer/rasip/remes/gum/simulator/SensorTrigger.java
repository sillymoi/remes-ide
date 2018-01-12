/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.simulator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Trigger</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#getSensorTrigger()
 * @model
 * @generated
 */
public enum SensorTrigger implements Enumerator {
	/**
	 * The '<em><b>Value Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_CHANGE(0, "ValueChange", "ValueChange"),

	/**
	 * The '<em><b>Behaviour Exit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOUR_EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	BEHAVIOUR_EXIT(1, "BehaviourExit", "BehaviourExit");

	/**
	 * The '<em><b>Value Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Value Change</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE_CHANGE
	 * @model name="ValueChange"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_CHANGE_VALUE = 0;

	/**
	 * The '<em><b>Behaviour Exit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Behaviour Exit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOUR_EXIT
	 * @model name="BehaviourExit"
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOUR_EXIT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Sensor Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorTrigger[] VALUES_ARRAY =
		new SensorTrigger[] {
			VALUE_CHANGE,
			BEHAVIOUR_EXIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Sensor Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorTrigger> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Trigger</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorTrigger get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorTrigger result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Trigger</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorTrigger getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorTrigger result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Trigger</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorTrigger get(int value) {
		switch (value) {
			case VALUE_CHANGE_VALUE: return VALUE_CHANGE;
			case BEHAVIOUR_EXIT_VALUE: return BEHAVIOUR_EXIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SensorTrigger(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SensorTrigger
