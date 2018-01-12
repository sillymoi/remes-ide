/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.simulator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hr.fer.rasip.remes.gum.simulator.SimulatorFactory
 * @model kind="package"
 * @generated
 */
public interface SimulatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rasip.fer.hr/gum/0.1.0/simulator.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulatorPackage eINSTANCE = hr.fer.rasip.remes.gum.simulator.impl.SimulatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.simulator.impl.SimulatorConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.simulator.impl.SimulatorConfigurationImpl
	 * @see hr.fer.rasip.remes.gum.simulator.impl.SimulatorPackageImpl#getSimulatorConfiguration()
	 * @generated
	 */
	int SIMULATOR_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_CONFIGURATION__SENSORS = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_CONFIGURATION__SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_CONFIGURATION__PROFILE = 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.simulator.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.simulator.impl.SensorImpl
	 * @see hr.fer.rasip.remes.gum.simulator.impl.SimulatorPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TRIGGER = 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.simulator.SensorTrigger <em>Sensor Trigger</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.simulator.SensorTrigger
	 * @see hr.fer.rasip.remes.gum.simulator.impl.SimulatorPackageImpl#getSensorTrigger()
	 * @generated
	 */
	int SENSOR_TRIGGER = 2;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration
	 * @generated
	 */
	EClass getSimulatorConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getSensors()
	 * @see #getSimulatorConfiguration()
	 * @generated
	 */
	EReference getSimulatorConfiguration_Sensors();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getSystem()
	 * @see #getSimulatorConfiguration()
	 * @generated
	 */
	EReference getSimulatorConfiguration_System();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profile</em>'.
	 * @see hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration#getProfile()
	 * @see #getSimulatorConfiguration()
	 * @generated
	 */
	EReference getSimulatorConfiguration_Profile();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.simulator.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see hr.fer.rasip.remes.gum.simulator.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.simulator.Sensor#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configuration</em>'.
	 * @see hr.fer.rasip.remes.gum.simulator.Sensor#getConfiguration()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Configuration();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.simulator.Sensor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hr.fer.rasip.remes.gum.simulator.Sensor#getSource()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Source();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.simulator.Sensor#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see hr.fer.rasip.remes.gum.simulator.Sensor#getTrigger()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Trigger();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.gum.simulator.SensorTrigger <em>Sensor Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Trigger</em>'.
	 * @see hr.fer.rasip.remes.gum.simulator.SensorTrigger
	 * @generated
	 */
	EEnum getSensorTrigger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimulatorFactory getSimulatorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.simulator.impl.SimulatorConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.simulator.impl.SimulatorConfigurationImpl
		 * @see hr.fer.rasip.remes.gum.simulator.impl.SimulatorPackageImpl#getSimulatorConfiguration()
		 * @generated
		 */
		EClass SIMULATOR_CONFIGURATION = eINSTANCE.getSimulatorConfiguration();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR_CONFIGURATION__SENSORS = eINSTANCE.getSimulatorConfiguration_Sensors();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR_CONFIGURATION__SYSTEM = eINSTANCE.getSimulatorConfiguration_System();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR_CONFIGURATION__PROFILE = eINSTANCE.getSimulatorConfiguration_Profile();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.simulator.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.simulator.impl.SensorImpl
		 * @see hr.fer.rasip.remes.gum.simulator.impl.SimulatorPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__CONFIGURATION = eINSTANCE.getSensor_Configuration();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SOURCE = eINSTANCE.getSensor_Source();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TRIGGER = eINSTANCE.getSensor_Trigger();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.simulator.SensorTrigger <em>Sensor Trigger</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.simulator.SensorTrigger
		 * @see hr.fer.rasip.remes.gum.simulator.impl.SimulatorPackageImpl#getSensorTrigger()
		 * @generated
		 */
		EEnum SENSOR_TRIGGER = eINSTANCE.getSensorTrigger();

	}

} //SimulatorPackage
