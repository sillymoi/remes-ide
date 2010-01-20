/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes;

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
 * @see se.mdh.progresside.remes.RemesFactory
 * @model kind="package"
 * @generated
 */
public interface RemesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "remes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdh.se/progresside/remes/1.2.0/remes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "remes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RemesPackage eINSTANCE = se.mdh.progresside.remes.impl.RemesPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ModeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 4;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.CompositeModeImpl <em>Composite Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.CompositeModeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getCompositeMode()
	 * @generated
	 */
	int COMPOSITE_MODE = 0;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl <em>Conditional Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ConditionalConnectorImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getConditionalConnector()
	 * @generated
	 */
	int CONDITIONAL_CONNECTOR = 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.EdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.InitEdgeImpl <em>Init Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.InitEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getInitEdge()
	 * @generated
	 */
	int INIT_EDGE = 3;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.RemesDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.RemesDiagramImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getRemesDiagram()
	 * @generated
	 */
	int REMES_DIAGRAM = 5;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.SubModeImpl <em>Sub Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.SubModeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getSubMode()
	 * @generated
	 */
	int SUB_MODE = 6;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.VariableImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ResourceImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 8;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.PointImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 9;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.InitPointImpl <em>Init Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.InitPointImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getInitPoint()
	 * @generated
	 */
	int INIT_POINT = 10;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.EntryPointImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 11;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ExitPointImpl <em>Exit Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ExitPointImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getExitPoint()
	 * @generated
	 */
	int EXIT_POINT = 12;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ControlPathImpl <em>Control Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ControlPathImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getControlPath()
	 * @generated
	 */
	int CONTROL_PATH = 13;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH__ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Exit Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH__EXIT_POINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH__NAME = 2;

	/**
	 * The number of structural features of the '<em>Control Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PATH_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ENTRY_POINT = CONTROL_PATH__ENTRY_POINT;

	/**
	 * The feature id for the '<em><b>Exit Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__EXIT_POINT = CONTROL_PATH__EXIT_POINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = CONTROL_PATH__NAME;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__INITIALIZATION = CONTROL_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__VARIABLES = CONTROL_PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__RESOURCES = CONTROL_PATH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__CONSTANTS = CONTROL_PATH_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = CONTROL_PATH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__ENTRY_POINT = MODE__ENTRY_POINT;

	/**
	 * The feature id for the '<em><b>Exit Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__EXIT_POINT = MODE__EXIT_POINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__NAME = MODE__NAME;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__INITIALIZATION = MODE__INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__VARIABLES = MODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__RESOURCES = MODE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__CONSTANTS = MODE__CONSTANTS;

	/**
	 * The feature id for the '<em><b>Sub Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__SUB_MODES = MODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditional Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__CONDITIONAL_CONNECTORS = MODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__INIT_POINT = MODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Composite Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__COMPOSITE_ENTRY_POINT = MODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Composite Exit Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__COMPOSITE_EXIT_POINT = MODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Composite Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR__ENTRY_POINT = CONTROL_PATH__ENTRY_POINT;

	/**
	 * The feature id for the '<em><b>Exit Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR__EXIT_POINT = CONTROL_PATH__EXIT_POINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR__NAME = CONTROL_PATH__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR__PARENT = CONTROL_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR_FEATURE_COUNT = CONTROL_PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ACTION_GUARD = 0;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ACTION_BODY = 1;

	/**
	 * The feature id for the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PARSED_ACTION_GUARD = 2;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONNECT_FROM = 3;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONNECT_TO = 4;

	/**
	 * The feature id for the '<em><b>Parsed Action Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PARSED_ACTION_BODY = 5;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE__INITIALIZATION = 0;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE__CONNECT_FROM = 1;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE__CONNECT_TO = 2;

	/**
	 * The feature id for the '<em><b>Parsed Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE__PARSED_INITIALIZATION = 3;

	/**
	 * The number of structural features of the '<em>Init Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMES_DIAGRAM__MODES = 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMES_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__ENTRY_POINT = MODE__ENTRY_POINT;

	/**
	 * The feature id for the '<em><b>Exit Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__EXIT_POINT = MODE__EXIT_POINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__NAME = MODE__NAME;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__INITIALIZATION = MODE__INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__VARIABLES = MODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__RESOURCES = MODE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__CONSTANTS = MODE__CONSTANTS;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__INVARIANT = MODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__IS_URGENT = MODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__PARENT = MODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parsed Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__PARSED_INVARIANT = MODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sub Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ReferrableImpl <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ReferrableImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getReferrable()
	 * @generated
	 */
	int REFERRABLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VECTOR_SIZE = REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__GLOBAL = REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SCOPE = REFERRABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__READABLE = REFERRABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__WRITABLE = REFERRABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXPRESSION = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SCOPE = REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Init Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_POINT__INIT_EDGE = POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_POINT__CONTAINER = POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Init Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_POINT_FEATURE_COUNT = POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ENTRY_EDGES = POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__CONTAINER = POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exit Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__EXIT_EDGES = POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__CONTAINER = POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exit Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT_FEATURE_COUNT = POINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.CompositeEntryPointImpl <em>Composite Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.CompositeEntryPointImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getCompositeEntryPoint()
	 * @generated
	 */
	int COMPOSITE_ENTRY_POINT = 14;

	/**
	 * The feature id for the '<em><b>Exit Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTRY_POINT__EXIT_EDGES = EXIT_POINT__EXIT_EDGES;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTRY_POINT__CONTAINER = EXIT_POINT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTRY_POINT__COMPOSITE = EXIT_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTRY_POINT_FEATURE_COUNT = EXIT_POINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.CompositeExitPointImpl <em>Composite Exit Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.CompositeExitPointImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getCompositeExitPoint()
	 * @generated
	 */
	int COMPOSITE_EXIT_POINT = 15;

	/**
	 * The feature id for the '<em><b>Entry Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXIT_POINT__ENTRY_EDGES = ENTRY_POINT__ENTRY_EDGES;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXIT_POINT__CONTAINER = ENTRY_POINT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXIT_POINT__COMPOSITE = ENTRY_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Exit Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXIT_POINT_FEATURE_COUNT = ENTRY_POINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ConstantImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__GLOBAL = REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__SCOPE = REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.PrimitiveTypes <em>Primitive Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.PrimitiveTypes
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getPrimitiveTypes()
	 * @generated
	 */
	int PRIMITIVE_TYPES = 18;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.ResourceTypes <em>Resource Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.ResourceTypes
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getResourceTypes()
	 * @generated
	 */
	int RESOURCE_TYPES = 19;


	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.CompositeMode <em>Composite Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Mode</em>'.
	 * @see se.mdh.progresside.remes.CompositeMode
	 * @generated
	 */
	EClass getCompositeMode();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.CompositeMode#getSubModes <em>Sub Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Modes</em>'.
	 * @see se.mdh.progresside.remes.CompositeMode#getSubModes()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_SubModes();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.CompositeMode#getConditionalConnectors <em>Conditional Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Connectors</em>'.
	 * @see se.mdh.progresside.remes.CompositeMode#getConditionalConnectors()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_ConditionalConnectors();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.CompositeMode#getInitPoint <em>Init Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Point</em>'.
	 * @see se.mdh.progresside.remes.CompositeMode#getInitPoint()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_InitPoint();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.CompositeMode#getCompositeEntryPoint <em>Composite Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Entry Point</em>'.
	 * @see se.mdh.progresside.remes.CompositeMode#getCompositeEntryPoint()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_CompositeEntryPoint();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.CompositeMode#getCompositeExitPoint <em>Composite Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Exit Point</em>'.
	 * @see se.mdh.progresside.remes.CompositeMode#getCompositeExitPoint()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_CompositeExitPoint();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ConditionalConnector <em>Conditional Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Connector</em>'.
	 * @see se.mdh.progresside.remes.ConditionalConnector
	 * @generated
	 */
	EClass getConditionalConnector();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.ConditionalConnector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see se.mdh.progresside.remes.ConditionalConnector#getParent()
	 * @see #getConditionalConnector()
	 * @generated
	 */
	EReference getConditionalConnector_Parent();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see se.mdh.progresside.remes.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Edge#getActionGuard <em>Action Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Guard</em>'.
	 * @see se.mdh.progresside.remes.Edge#getActionGuard()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_ActionGuard();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Edge#getActionBody <em>Action Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Body</em>'.
	 * @see se.mdh.progresside.remes.Edge#getActionBody()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_ActionBody();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.Edge#getParsedActionGuard <em>Parsed Action Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parsed Action Guard</em>'.
	 * @see se.mdh.progresside.remes.Edge#getParsedActionGuard()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ParsedActionGuard();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.Edge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connect From</em>'.
	 * @see se.mdh.progresside.remes.Edge#getConnectFrom()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ConnectFrom();

	/**
	 * Returns the meta object for the reference '{@link se.mdh.progresside.remes.Edge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To</em>'.
	 * @see se.mdh.progresside.remes.Edge#getConnectTo()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ConnectTo();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.Edge#getParsedActionBody <em>Parsed Action Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parsed Action Body</em>'.
	 * @see se.mdh.progresside.remes.Edge#getParsedActionBody()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ParsedActionBody();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.InitEdge <em>Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Edge</em>'.
	 * @see se.mdh.progresside.remes.InitEdge
	 * @generated
	 */
	EClass getInitEdge();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.InitEdge#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialization</em>'.
	 * @see se.mdh.progresside.remes.InitEdge#getInitialization()
	 * @see #getInitEdge()
	 * @generated
	 */
	EAttribute getInitEdge_Initialization();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.InitEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connect From</em>'.
	 * @see se.mdh.progresside.remes.InitEdge#getConnectFrom()
	 * @see #getInitEdge()
	 * @generated
	 */
	EReference getInitEdge_ConnectFrom();

	/**
	 * Returns the meta object for the reference '{@link se.mdh.progresside.remes.InitEdge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To</em>'.
	 * @see se.mdh.progresside.remes.InitEdge#getConnectTo()
	 * @see #getInitEdge()
	 * @generated
	 */
	EReference getInitEdge_ConnectTo();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.InitEdge#getParsedInitialization <em>Parsed Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parsed Initialization</em>'.
	 * @see se.mdh.progresside.remes.InitEdge#getParsedInitialization()
	 * @see #getInitEdge()
	 * @generated
	 */
	EReference getInitEdge_ParsedInitialization();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see se.mdh.progresside.remes.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Mode#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialization</em>'.
	 * @see se.mdh.progresside.remes.Mode#getInitialization()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Initialization();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.Mode#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see se.mdh.progresside.remes.Mode#getVariables()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.Mode#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see se.mdh.progresside.remes.Mode#getResources()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.Mode#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see se.mdh.progresside.remes.Mode#getConstants()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Constants();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.RemesDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see se.mdh.progresside.remes.RemesDiagram
	 * @generated
	 */
	EClass getRemesDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.RemesDiagram#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see se.mdh.progresside.remes.RemesDiagram#getModes()
	 * @see #getRemesDiagram()
	 * @generated
	 */
	EReference getRemesDiagram_Modes();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.SubMode <em>Sub Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Mode</em>'.
	 * @see se.mdh.progresside.remes.SubMode
	 * @generated
	 */
	EClass getSubMode();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.SubMode#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invariant</em>'.
	 * @see se.mdh.progresside.remes.SubMode#getInvariant()
	 * @see #getSubMode()
	 * @generated
	 */
	EAttribute getSubMode_Invariant();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.SubMode#isIsUrgent <em>Is Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Urgent</em>'.
	 * @see se.mdh.progresside.remes.SubMode#isIsUrgent()
	 * @see #getSubMode()
	 * @generated
	 */
	EAttribute getSubMode_IsUrgent();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.SubMode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see se.mdh.progresside.remes.SubMode#getParent()
	 * @see #getSubMode()
	 * @generated
	 */
	EReference getSubMode_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.SubMode#getParsedInvariant <em>Parsed Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parsed Invariant</em>'.
	 * @see se.mdh.progresside.remes.SubMode#getParsedInvariant()
	 * @see #getSubMode()
	 * @generated
	 */
	EReference getSubMode_ParsedInvariant();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see se.mdh.progresside.remes.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see se.mdh.progresside.remes.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.mdh.progresside.remes.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Variable#getVectorSize <em>Vector Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Size</em>'.
	 * @see se.mdh.progresside.remes.Variable#getVectorSize()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_VectorSize();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Variable#isGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see se.mdh.progresside.remes.Variable#isGlobal()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Global();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see se.mdh.progresside.remes.Variable#getScope()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Scope();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Variable#isReadable <em>Readable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readable</em>'.
	 * @see se.mdh.progresside.remes.Variable#isReadable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Readable();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Variable#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see se.mdh.progresside.remes.Variable#isWritable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Writable();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see se.mdh.progresside.remes.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Resource#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see se.mdh.progresside.remes.Resource#getExpression()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Expression();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.mdh.progresside.remes.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.Resource#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see se.mdh.progresside.remes.Resource#getScope()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Scope();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see se.mdh.progresside.remes.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.InitPoint <em>Init Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Point</em>'.
	 * @see se.mdh.progresside.remes.InitPoint
	 * @generated
	 */
	EClass getInitPoint();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.InitPoint#getInitEdge <em>Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Edge</em>'.
	 * @see se.mdh.progresside.remes.InitPoint#getInitEdge()
	 * @see #getInitPoint()
	 * @generated
	 */
	EReference getInitPoint_InitEdge();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.InitPoint#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see se.mdh.progresside.remes.InitPoint#getContainer()
	 * @see #getInitPoint()
	 * @generated
	 */
	EReference getInitPoint_Container();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see se.mdh.progresside.remes.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for the reference list '{@link se.mdh.progresside.remes.EntryPoint#getEntryEdges <em>Entry Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry Edges</em>'.
	 * @see se.mdh.progresside.remes.EntryPoint#getEntryEdges()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_EntryEdges();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.EntryPoint#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see se.mdh.progresside.remes.EntryPoint#getContainer()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_Container();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ExitPoint <em>Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Point</em>'.
	 * @see se.mdh.progresside.remes.ExitPoint
	 * @generated
	 */
	EClass getExitPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.ExitPoint#getExitEdges <em>Exit Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Edges</em>'.
	 * @see se.mdh.progresside.remes.ExitPoint#getExitEdges()
	 * @see #getExitPoint()
	 * @generated
	 */
	EReference getExitPoint_ExitEdges();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.ExitPoint#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see se.mdh.progresside.remes.ExitPoint#getContainer()
	 * @see #getExitPoint()
	 * @generated
	 */
	EReference getExitPoint_Container();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ControlPath <em>Control Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Path</em>'.
	 * @see se.mdh.progresside.remes.ControlPath
	 * @generated
	 */
	EClass getControlPath();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.ControlPath#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Point</em>'.
	 * @see se.mdh.progresside.remes.ControlPath#getEntryPoint()
	 * @see #getControlPath()
	 * @generated
	 */
	EReference getControlPath_EntryPoint();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.ControlPath#getExitPoint <em>Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Point</em>'.
	 * @see se.mdh.progresside.remes.ControlPath#getExitPoint()
	 * @see #getControlPath()
	 * @generated
	 */
	EReference getControlPath_ExitPoint();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.ControlPath#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.mdh.progresside.remes.ControlPath#getName()
	 * @see #getControlPath()
	 * @generated
	 */
	EAttribute getControlPath_Name();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.CompositeEntryPoint <em>Composite Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Entry Point</em>'.
	 * @see se.mdh.progresside.remes.CompositeEntryPoint
	 * @generated
	 */
	EClass getCompositeEntryPoint();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.CompositeEntryPoint#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Composite</em>'.
	 * @see se.mdh.progresside.remes.CompositeEntryPoint#getComposite()
	 * @see #getCompositeEntryPoint()
	 * @generated
	 */
	EReference getCompositeEntryPoint_Composite();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.CompositeExitPoint <em>Composite Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Exit Point</em>'.
	 * @see se.mdh.progresside.remes.CompositeExitPoint
	 * @generated
	 */
	EClass getCompositeExitPoint();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.CompositeExitPoint#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Composite</em>'.
	 * @see se.mdh.progresside.remes.CompositeExitPoint#getComposite()
	 * @see #getCompositeExitPoint()
	 * @generated
	 */
	EReference getCompositeExitPoint_Composite();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see se.mdh.progresside.remes.Referrable
	 * @generated
	 */
	EClass getReferrable();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Referrable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.mdh.progresside.remes.Referrable#getName()
	 * @see #getReferrable()
	 * @generated
	 */
	EAttribute getReferrable_Name();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see se.mdh.progresside.remes.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.mdh.progresside.remes.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Type();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see se.mdh.progresside.remes.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Constant#isGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see se.mdh.progresside.remes.Constant#isGlobal()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Global();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.Constant#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see se.mdh.progresside.remes.Constant#getScope()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Scope();

	/**
	 * Returns the meta object for enum '{@link se.mdh.progresside.remes.PrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Types</em>'.
	 * @see se.mdh.progresside.remes.PrimitiveTypes
	 * @generated
	 */
	EEnum getPrimitiveTypes();

	/**
	 * Returns the meta object for enum '{@link se.mdh.progresside.remes.ResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Types</em>'.
	 * @see se.mdh.progresside.remes.ResourceTypes
	 * @generated
	 */
	EEnum getResourceTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RemesFactory getRemesFactory();

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
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.CompositeModeImpl <em>Composite Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.CompositeModeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getCompositeMode()
		 * @generated
		 */
		EClass COMPOSITE_MODE = eINSTANCE.getCompositeMode();

		/**
		 * The meta object literal for the '<em><b>Sub Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__SUB_MODES = eINSTANCE.getCompositeMode_SubModes();

		/**
		 * The meta object literal for the '<em><b>Conditional Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__CONDITIONAL_CONNECTORS = eINSTANCE.getCompositeMode_ConditionalConnectors();

		/**
		 * The meta object literal for the '<em><b>Init Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__INIT_POINT = eINSTANCE.getCompositeMode_InitPoint();

		/**
		 * The meta object literal for the '<em><b>Composite Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__COMPOSITE_ENTRY_POINT = eINSTANCE.getCompositeMode_CompositeEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Composite Exit Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__COMPOSITE_EXIT_POINT = eINSTANCE.getCompositeMode_CompositeExitPoint();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl <em>Conditional Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ConditionalConnectorImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getConditionalConnector()
		 * @generated
		 */
		EClass CONDITIONAL_CONNECTOR = eINSTANCE.getConditionalConnector();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_CONNECTOR__PARENT = eINSTANCE.getConditionalConnector_Parent();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.EdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Action Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ACTION_GUARD = eINSTANCE.getEdge_ActionGuard();

		/**
		 * The meta object literal for the '<em><b>Action Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ACTION_BODY = eINSTANCE.getEdge_ActionBody();

		/**
		 * The meta object literal for the '<em><b>Parsed Action Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__PARSED_ACTION_GUARD = eINSTANCE.getEdge_ParsedActionGuard();

		/**
		 * The meta object literal for the '<em><b>Connect From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__CONNECT_FROM = eINSTANCE.getEdge_ConnectFrom();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__CONNECT_TO = eINSTANCE.getEdge_ConnectTo();

		/**
		 * The meta object literal for the '<em><b>Parsed Action Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__PARSED_ACTION_BODY = eINSTANCE.getEdge_ParsedActionBody();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.InitEdgeImpl <em>Init Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.InitEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getInitEdge()
		 * @generated
		 */
		EClass INIT_EDGE = eINSTANCE.getInitEdge();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_EDGE__INITIALIZATION = eINSTANCE.getInitEdge_Initialization();

		/**
		 * The meta object literal for the '<em><b>Connect From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_EDGE__CONNECT_FROM = eINSTANCE.getInitEdge_ConnectFrom();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_EDGE__CONNECT_TO = eINSTANCE.getInitEdge_ConnectTo();

		/**
		 * The meta object literal for the '<em><b>Parsed Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_EDGE__PARSED_INITIALIZATION = eINSTANCE.getInitEdge_ParsedInitialization();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ModeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__INITIALIZATION = eINSTANCE.getMode_Initialization();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__VARIABLES = eINSTANCE.getMode_Variables();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__RESOURCES = eINSTANCE.getMode_Resources();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__CONSTANTS = eINSTANCE.getMode_Constants();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.RemesDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.RemesDiagramImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getRemesDiagram()
		 * @generated
		 */
		EClass REMES_DIAGRAM = eINSTANCE.getRemesDiagram();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMES_DIAGRAM__MODES = eINSTANCE.getRemesDiagram_Modes();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.SubModeImpl <em>Sub Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.SubModeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getSubMode()
		 * @generated
		 */
		EClass SUB_MODE = eINSTANCE.getSubMode();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODE__INVARIANT = eINSTANCE.getSubMode_Invariant();

		/**
		 * The meta object literal for the '<em><b>Is Urgent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODE__IS_URGENT = eINSTANCE.getSubMode_IsUrgent();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODE__PARENT = eINSTANCE.getSubMode_Parent();

		/**
		 * The meta object literal for the '<em><b>Parsed Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODE__PARSED_INVARIANT = eINSTANCE.getSubMode_ParsedInvariant();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.VariableImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Vector Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VECTOR_SIZE = eINSTANCE.getVariable_VectorSize();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__GLOBAL = eINSTANCE.getVariable_Global();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__SCOPE = eINSTANCE.getVariable_Scope();

		/**
		 * The meta object literal for the '<em><b>Readable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__READABLE = eINSTANCE.getVariable_Readable();

		/**
		 * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__WRITABLE = eINSTANCE.getVariable_Writable();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ResourceImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__EXPRESSION = eINSTANCE.getResource_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TYPE = eINSTANCE.getResource_Type();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SCOPE = eINSTANCE.getResource_Scope();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.PointImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.InitPointImpl <em>Init Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.InitPointImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getInitPoint()
		 * @generated
		 */
		EClass INIT_POINT = eINSTANCE.getInitPoint();

		/**
		 * The meta object literal for the '<em><b>Init Edge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_POINT__INIT_EDGE = eINSTANCE.getInitPoint_InitEdge();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_POINT__CONTAINER = eINSTANCE.getInitPoint_Container();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.EntryPointImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Entry Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__ENTRY_EDGES = eINSTANCE.getEntryPoint_EntryEdges();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__CONTAINER = eINSTANCE.getEntryPoint_Container();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ExitPointImpl <em>Exit Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ExitPointImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getExitPoint()
		 * @generated
		 */
		EClass EXIT_POINT = eINSTANCE.getExitPoint();

		/**
		 * The meta object literal for the '<em><b>Exit Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_POINT__EXIT_EDGES = eINSTANCE.getExitPoint_ExitEdges();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_POINT__CONTAINER = eINSTANCE.getExitPoint_Container();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ControlPathImpl <em>Control Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ControlPathImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getControlPath()
		 * @generated
		 */
		EClass CONTROL_PATH = eINSTANCE.getControlPath();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PATH__ENTRY_POINT = eINSTANCE.getControlPath_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Exit Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PATH__EXIT_POINT = eINSTANCE.getControlPath_ExitPoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PATH__NAME = eINSTANCE.getControlPath_Name();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.CompositeEntryPointImpl <em>Composite Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.CompositeEntryPointImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getCompositeEntryPoint()
		 * @generated
		 */
		EClass COMPOSITE_ENTRY_POINT = eINSTANCE.getCompositeEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ENTRY_POINT__COMPOSITE = eINSTANCE.getCompositeEntryPoint_Composite();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.CompositeExitPointImpl <em>Composite Exit Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.CompositeExitPointImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getCompositeExitPoint()
		 * @generated
		 */
		EClass COMPOSITE_EXIT_POINT = eINSTANCE.getCompositeExitPoint();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_EXIT_POINT__COMPOSITE = eINSTANCE.getCompositeExitPoint_Composite();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ReferrableImpl <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ReferrableImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getReferrable()
		 * @generated
		 */
		EClass REFERRABLE = eINSTANCE.getReferrable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERRABLE__NAME = eINSTANCE.getReferrable_Name();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ConstantImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__GLOBAL = eINSTANCE.getConstant_Global();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__SCOPE = eINSTANCE.getConstant_Scope();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.PrimitiveTypes <em>Primitive Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.PrimitiveTypes
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getPrimitiveTypes()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPES = eINSTANCE.getPrimitiveTypes();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.ResourceTypes <em>Resource Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.ResourceTypes
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getResourceTypes()
		 * @generated
		 */
		EEnum RESOURCE_TYPES = eINSTANCE.getResourceTypes();

	}

} //RemesPackage
