/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.simulator.traces;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see hr.fer.rasip.remes.simulator.traces.TracesFactory
 * @model kind="package"
 * @generated
 */
public interface TracesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rasip.fer.hr/remes/1.2.0/traces.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traces";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracesPackage eINSTANCE = hr.fer.rasip.remes.simulator.traces.impl.TracesPackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.simulator.traces.impl.SimulatorRunImpl <em>Simulator Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.simulator.traces.impl.SimulatorRunImpl
	 * @see hr.fer.rasip.remes.simulator.traces.impl.TracesPackageImpl#getSimulatorRun()
	 * @generated
	 */
	int SIMULATOR_RUN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_RUN__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_RUN__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Behavior Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_RUN__BEHAVIOR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_RUN__VARIABLES = 3;

	/**
	 * The number of structural features of the '<em>Simulator Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_RUN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.simulator.traces.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.simulator.traces.impl.VariableImpl
	 * @see hr.fer.rasip.remes.simulator.traces.impl.TracesPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Run</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__RUN = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUES = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.simulator.traces.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.simulator.traces.impl.ValueImpl
	 * @see hr.fer.rasip.remes.simulator.traces.impl.TracesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Clock Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CLOCK_MIN = 1;

	/**
	 * The feature id for the '<em><b>Clock Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CLOCK_MAX = 2;

	/**
	 * The feature id for the '<em><b>Value Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE_MIN = 3;

	/**
	 * The feature id for the '<em><b>Value Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE_MAX = 4;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun <em>Simulator Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulator Run</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.SimulatorRun
	 * @generated
	 */
	EClass getSimulatorRun();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.SimulatorRun#getId()
	 * @see #getSimulatorRun()
	 * @generated
	 */
	EAttribute getSimulatorRun_Id();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.SimulatorRun#getTimestamp()
	 * @see #getSimulatorRun()
	 * @generated
	 */
	EAttribute getSimulatorRun_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getBehaviorName <em>Behavior Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Name</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.SimulatorRun#getBehaviorName()
	 * @see #getSimulatorRun()
	 * @generated
	 */
	EAttribute getSimulatorRun_BehaviorName();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.simulator.traces.SimulatorRun#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.SimulatorRun#getVariables()
	 * @see #getSimulatorRun()
	 * @generated
	 */
	EReference getSimulatorRun_Variables();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.simulator.traces.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.simulator.traces.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.simulator.traces.Variable#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Run</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Variable#getRun()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Run();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.simulator.traces.Variable#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Variable#getValues()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Values();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.simulator.traces.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.simulator.traces.Value#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Value#getVariable()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Variable();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.simulator.traces.Value#getClockMin <em>Clock Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Min</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Value#getClockMin()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_ClockMin();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.simulator.traces.Value#getClockMax <em>Clock Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Max</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Value#getClockMax()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_ClockMax();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.simulator.traces.Value#getValueMin <em>Value Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Min</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Value#getValueMin()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_ValueMin();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.simulator.traces.Value#getValueMax <em>Value Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Max</em>'.
	 * @see hr.fer.rasip.remes.simulator.traces.Value#getValueMax()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_ValueMax();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracesFactory getTracesFactory();

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
		 * The meta object literal for the '{@link hr.fer.rasip.remes.simulator.traces.impl.SimulatorRunImpl <em>Simulator Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.simulator.traces.impl.SimulatorRunImpl
		 * @see hr.fer.rasip.remes.simulator.traces.impl.TracesPackageImpl#getSimulatorRun()
		 * @generated
		 */
		EClass SIMULATOR_RUN = eINSTANCE.getSimulatorRun();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATOR_RUN__ID = eINSTANCE.getSimulatorRun_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATOR_RUN__TIMESTAMP = eINSTANCE.getSimulatorRun_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Behavior Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATOR_RUN__BEHAVIOR_NAME = eINSTANCE.getSimulatorRun_BehaviorName();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR_RUN__VARIABLES = eINSTANCE.getSimulatorRun_Variables();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.simulator.traces.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.simulator.traces.impl.VariableImpl
		 * @see hr.fer.rasip.remes.simulator.traces.impl.TracesPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__RUN = eINSTANCE.getVariable_Run();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VALUES = eINSTANCE.getVariable_Values();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.simulator.traces.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.simulator.traces.impl.ValueImpl
		 * @see hr.fer.rasip.remes.simulator.traces.impl.TracesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__VARIABLE = eINSTANCE.getValue_Variable();

		/**
		 * The meta object literal for the '<em><b>Clock Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__CLOCK_MIN = eINSTANCE.getValue_ClockMin();

		/**
		 * The meta object literal for the '<em><b>Clock Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__CLOCK_MAX = eINSTANCE.getValue_ClockMax();

		/**
		 * The meta object literal for the '<em><b>Value Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE_MIN = eINSTANCE.getValue_ValueMin();

		/**
		 * The meta object literal for the '<em><b>Value Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE_MAX = eINSTANCE.getValue_ValueMax();

	}

} //TracesPackage
