/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.simulator;

import hr.fer.rasip.remes.gum.profile.PlatformProfile;
import hr.fer.rasip.remes.gum.structure.StructureElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getSensors <em>Sensors</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getSystem <em>System</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#getSimulatorConfiguration()
 * @model
 * @generated
 */
public interface SimulatorConfiguration extends EObject {

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.simulator.Sensor}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.simulator.Sensor#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#getSimulatorConfiguration_Sensors()
	 * @see hr.fer.rasip.remes.gum.simulator.Sensor#getConfiguration
	 * @model opposite="configuration" containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(StructureElement)
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#getSimulatorConfiguration_System()
	 * @model
	 * @generated
	 */
	StructureElement getSystem();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(StructureElement value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see #setProfile(PlatformProfile)
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorPackage#getSimulatorConfiguration_Profile()
	 * @model
	 * @generated
	 */
	PlatformProfile getProfile();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(PlatformProfile value);
} // SimulatorConfiguration
