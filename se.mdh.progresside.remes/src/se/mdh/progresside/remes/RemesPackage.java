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

import se.mdh.progresside.attributes.AttributesPackage;

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
	String eNS_URI = "http://www.mdh.se/progresside/remes/1.1.0/remes.ecore";

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
	int MODE = 17;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ATTRIBUTES = AttributesPackage.ATTRIBUTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__INITIALIZATION = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__VARIABLES = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__ATTRIBUTES = MODE__ATTRIBUTES;

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
	 * The feature id for the '<em><b>Exit Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__EXIT_EDGES = MODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__INIT_EDGE = MODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__ENTRY_EDGE = MODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__SUB_MODES = MODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conditional Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__CONDITIONAL_CONNECTORS = MODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Composite Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR__ATTRIBUTES = AttributesPackage.ATTRIBUTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR__NAME = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR__ENTRY_EDGES = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR__EXIT_EDGES = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR__PARENT = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Conditional Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONNECTOR_FEATURE_COUNT = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ATTRIBUTES = AttributesPackage.ATTRIBUTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ACTION_GUARD = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ACTION_BODY = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PARSED_ACTION_GUARD = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.FromConditionalConnectorEdgeImpl <em>From Conditional Connector Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.FromConditionalConnectorEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getFromConditionalConnectorEdge()
	 * @generated
	 */
	int FROM_CONDITIONAL_CONNECTOR_EDGE = 13;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM = 0;

	/**
	 * The number of structural features of the '<em>From Conditional Connector Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.EntryConditionalSubEdgeImpl <em>Entry Conditional Sub Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.EntryConditionalSubEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryConditionalSubEdge()
	 * @generated
	 */
	int ENTRY_CONDITIONAL_SUB_EDGE = 3;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_SUB_EDGE__CONNECT_FROM = FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_SUB_EDGE__CONNECT_TO = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_SUB_EDGE__ATTRIBUTES = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_SUB_EDGE__ACTION_GUARD = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_SUB_EDGE__ACTION_BODY = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_SUB_EDGE__PARSED_ACTION_GUARD = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entry Conditional Sub Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_SUB_EDGE_FEATURE_COUNT = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.FromCompositeModeEdgeImpl <em>From Composite Mode Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.FromCompositeModeEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getFromCompositeModeEdge()
	 * @generated
	 */
	int FROM_COMPOSITE_MODE_EDGE = 11;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM = 0;

	/**
	 * The number of structural features of the '<em>From Composite Mode Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.EntryConditionalTopEdgeImpl <em>Entry Conditional Top Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.EntryConditionalTopEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryConditionalTopEdge()
	 * @generated
	 */
	int ENTRY_CONDITIONAL_TOP_EDGE = 4;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_EDGE__CONNECT_FROM = FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_EDGE__CONNECT_TO = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_EDGE__ATTRIBUTES = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_EDGE__ACTION_GUARD = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_EDGE__ACTION_BODY = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_EDGE__PARSED_ACTION_GUARD = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entry Conditional Top Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_EDGE_FEATURE_COUNT = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.FromCompositeModeInitEdgeImpl <em>From Composite Mode Init Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.FromCompositeModeInitEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getFromCompositeModeInitEdge()
	 * @generated
	 */
	int FROM_COMPOSITE_MODE_INIT_EDGE = 12;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_COMPOSITE_MODE_INIT_EDGE__CONNECT_FROM = 0;

	/**
	 * The number of structural features of the '<em>From Composite Mode Init Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_COMPOSITE_MODE_INIT_EDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.EntryConditionalTopInitEdgeImpl <em>Entry Conditional Top Init Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.EntryConditionalTopInitEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryConditionalTopInitEdge()
	 * @generated
	 */
	int ENTRY_CONDITIONAL_TOP_INIT_EDGE = 5;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_FROM = FROM_COMPOSITE_MODE_INIT_EDGE__CONNECT_FROM;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO = FROM_COMPOSITE_MODE_INIT_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_INIT_EDGE__INITIALIZATION = FROM_COMPOSITE_MODE_INIT_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry Conditional Top Init Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_CONDITIONAL_TOP_INIT_EDGE_FEATURE_COUNT = FROM_COMPOSITE_MODE_INIT_EDGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.EntryEdgeImpl <em>Entry Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.EntryEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryEdge()
	 * @generated
	 */
	int ENTRY_EDGE = 6;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EDGE__CONNECT_FROM = FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EDGE__CONNECT_TO = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EDGE__ATTRIBUTES = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EDGE__ACTION_GUARD = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EDGE__ACTION_BODY = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EDGE__PARSED_ACTION_GUARD = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entry Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EDGE_FEATURE_COUNT = FROM_COMPOSITE_MODE_EDGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.EntryInitEdgeImpl <em>Entry Init Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.EntryInitEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryInitEdge()
	 * @generated
	 */
	int ENTRY_INIT_EDGE = 7;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_INIT_EDGE__CONNECT_FROM = FROM_COMPOSITE_MODE_INIT_EDGE__CONNECT_FROM;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_INIT_EDGE__CONNECT_TO = FROM_COMPOSITE_MODE_INIT_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_INIT_EDGE__INITIALIZATION = FROM_COMPOSITE_MODE_INIT_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry Init Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_INIT_EDGE_FEATURE_COUNT = FROM_COMPOSITE_MODE_INIT_EDGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.FromSubModeEdgeImpl <em>From Sub Mode Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.FromSubModeEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getFromSubModeEdge()
	 * @generated
	 */
	int FROM_SUB_MODE_EDGE = 14;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_SUB_MODE_EDGE__CONNECT_FROM = 0;

	/**
	 * The number of structural features of the '<em>From Sub Mode Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_SUB_MODE_EDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ExitConditionalSubEdgeImpl <em>Exit Conditional Sub Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ExitConditionalSubEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getExitConditionalSubEdge()
	 * @generated
	 */
	int EXIT_CONDITIONAL_SUB_EDGE = 8;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_SUB_EDGE__CONNECT_FROM = FROM_SUB_MODE_EDGE__CONNECT_FROM;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_SUB_EDGE__CONNECT_TO = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_SUB_EDGE__ATTRIBUTES = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_SUB_EDGE__ACTION_GUARD = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_SUB_EDGE__ACTION_BODY = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_SUB_EDGE__PARSED_ACTION_GUARD = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Exit Conditional Sub Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_SUB_EDGE_FEATURE_COUNT = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ExitConditionalTopEdgeImpl <em>Exit Conditional Top Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ExitConditionalTopEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getExitConditionalTopEdge()
	 * @generated
	 */
	int EXIT_CONDITIONAL_TOP_EDGE = 9;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_TOP_EDGE__CONNECT_FROM = FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_TOP_EDGE__CONNECT_TO = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_TOP_EDGE__ATTRIBUTES = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_TOP_EDGE__ACTION_GUARD = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_TOP_EDGE__ACTION_BODY = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_TOP_EDGE__PARSED_ACTION_GUARD = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Exit Conditional Top Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CONDITIONAL_TOP_EDGE_FEATURE_COUNT = FROM_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ExitEdgeImpl <em>Exit Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ExitEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getExitEdge()
	 * @generated
	 */
	int EXIT_EDGE = 10;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EDGE__CONNECT_FROM = FROM_SUB_MODE_EDGE__CONNECT_FROM;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EDGE__CONNECT_TO = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EDGE__ATTRIBUTES = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EDGE__ACTION_GUARD = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EDGE__ACTION_BODY = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EDGE__PARSED_ACTION_GUARD = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Exit Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EDGE_FEATURE_COUNT = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.InitEdgeImpl <em>Init Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.InitEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getInitEdge()
	 * @generated
	 */
	int INIT_EDGE = 15;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE__INITIALIZATION = 0;

	/**
	 * The number of structural features of the '<em>Init Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.InternalEdgeImpl <em>Internal Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.InternalEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getInternalEdge()
	 * @generated
	 */
	int INTERNAL_EDGE = 16;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__CONNECT_FROM = FROM_SUB_MODE_EDGE__CONNECT_FROM;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__CONNECT_TO = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__ATTRIBUTES = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__ACTION_GUARD = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__ACTION_BODY = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parsed Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE__PARSED_ACTION_GUARD = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Internal Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_EDGE_FEATURE_COUNT = FROM_SUB_MODE_EDGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.RemesDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.RemesDiagramImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getRemesDiagram()
	 * @generated
	 */
	int REMES_DIAGRAM = 18;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMES_DIAGRAM__ATTRIBUTES = AttributesPackage.ATTRIBUTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMES_DIAGRAM__MODES = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMES_DIAGRAM_FEATURE_COUNT = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.SubModeImpl <em>Sub Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.SubModeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getSubMode()
	 * @generated
	 */
	int SUB_MODE = 19;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__ATTRIBUTES = MODE__ATTRIBUTES;

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
	 * The feature id for the '<em><b>Entry Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__ENTRY_EDGES = MODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exit Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__EXIT_EDGES = MODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__INVARIANT = MODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__IS_URGENT = MODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__PARENT = MODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__RESOURCES = MODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parsed Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE__PARSED_INVARIANT = MODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sub Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ToCompositeModeEdgeImpl <em>To Composite Mode Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ToCompositeModeEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getToCompositeModeEdge()
	 * @generated
	 */
	int TO_COMPOSITE_MODE_EDGE = 20;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_COMPOSITE_MODE_EDGE__CONNECT_TO = 0;

	/**
	 * The number of structural features of the '<em>To Composite Mode Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_COMPOSITE_MODE_EDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ToConditionalConnectorEdgeImpl <em>To Conditional Connector Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ToConditionalConnectorEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getToConditionalConnectorEdge()
	 * @generated
	 */
	int TO_CONDITIONAL_CONNECTOR_EDGE = 21;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_CONDITIONAL_CONNECTOR_EDGE__CONNECT_TO = 0;

	/**
	 * The number of structural features of the '<em>To Conditional Connector Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_CONDITIONAL_CONNECTOR_EDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ToSubModeEdgeImpl <em>To Sub Mode Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ToSubModeEdgeImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getToSubModeEdge()
	 * @generated
	 */
	int TO_SUB_MODE_EDGE = 22;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_SUB_MODE_EDGE__CONNECT_TO = 0;

	/**
	 * The number of structural features of the '<em>To Sub Mode Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_SUB_MODE_EDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.VariableImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 23;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ATTRIBUTES = AttributesPackage.ATTRIBUTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VECTOR_SIZE = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__GLOBAL = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SCOPE = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__READABLE = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__WRITABLE = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.impl.ResourceImpl
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 24;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ATTRIBUTES = AttributesPackage.ATTRIBUTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXPRESSION = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SCOPE = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = AttributesPackage.ATTRIBUTABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.PrimitiveTypes <em>Primitive Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.PrimitiveTypes
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getPrimitiveTypes()
	 * @generated
	 */
	int PRIMITIVE_TYPES = 25;

	/**
	 * The meta object id for the '{@link se.mdh.progresside.remes.ResourceTypes <em>Resource Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.progresside.remes.ResourceTypes
	 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getResourceTypes()
	 * @generated
	 */
	int RESOURCE_TYPES = 26;


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
	 * Returns the meta object for the reference list '{@link se.mdh.progresside.remes.CompositeMode#getExitEdges <em>Exit Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exit Edges</em>'.
	 * @see se.mdh.progresside.remes.CompositeMode#getExitEdges()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_ExitEdges();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.CompositeMode#getInitEdge <em>Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Edge</em>'.
	 * @see se.mdh.progresside.remes.CompositeMode#getInitEdge()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_InitEdge();

	/**
	 * Returns the meta object for the containment reference '{@link se.mdh.progresside.remes.CompositeMode#getEntryEdge <em>Entry Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Edge</em>'.
	 * @see se.mdh.progresside.remes.CompositeMode#getEntryEdge()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_EntryEdge();

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
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ConditionalConnector <em>Conditional Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Connector</em>'.
	 * @see se.mdh.progresside.remes.ConditionalConnector
	 * @generated
	 */
	EClass getConditionalConnector();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.ConditionalConnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.mdh.progresside.remes.ConditionalConnector#getName()
	 * @see #getConditionalConnector()
	 * @generated
	 */
	EAttribute getConditionalConnector_Name();

	/**
	 * Returns the meta object for the reference list '{@link se.mdh.progresside.remes.ConditionalConnector#getEntryEdges <em>Entry Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry Edges</em>'.
	 * @see se.mdh.progresside.remes.ConditionalConnector#getEntryEdges()
	 * @see #getConditionalConnector()
	 * @generated
	 */
	EReference getConditionalConnector_EntryEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.ConditionalConnector#getExitEdges <em>Exit Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Edges</em>'.
	 * @see se.mdh.progresside.remes.ConditionalConnector#getExitEdges()
	 * @see #getConditionalConnector()
	 * @generated
	 */
	EReference getConditionalConnector_ExitEdges();

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
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.EntryConditionalSubEdge <em>Entry Conditional Sub Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Conditional Sub Edge</em>'.
	 * @see se.mdh.progresside.remes.EntryConditionalSubEdge
	 * @generated
	 */
	EClass getEntryConditionalSubEdge();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.EntryConditionalTopEdge <em>Entry Conditional Top Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Conditional Top Edge</em>'.
	 * @see se.mdh.progresside.remes.EntryConditionalTopEdge
	 * @generated
	 */
	EClass getEntryConditionalTopEdge();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.EntryConditionalTopInitEdge <em>Entry Conditional Top Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Conditional Top Init Edge</em>'.
	 * @see se.mdh.progresside.remes.EntryConditionalTopInitEdge
	 * @generated
	 */
	EClass getEntryConditionalTopInitEdge();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.EntryEdge <em>Entry Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Edge</em>'.
	 * @see se.mdh.progresside.remes.EntryEdge
	 * @generated
	 */
	EClass getEntryEdge();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.EntryInitEdge <em>Entry Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Init Edge</em>'.
	 * @see se.mdh.progresside.remes.EntryInitEdge
	 * @generated
	 */
	EClass getEntryInitEdge();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ExitConditionalSubEdge <em>Exit Conditional Sub Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Conditional Sub Edge</em>'.
	 * @see se.mdh.progresside.remes.ExitConditionalSubEdge
	 * @generated
	 */
	EClass getExitConditionalSubEdge();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ExitConditionalTopEdge <em>Exit Conditional Top Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Conditional Top Edge</em>'.
	 * @see se.mdh.progresside.remes.ExitConditionalTopEdge
	 * @generated
	 */
	EClass getExitConditionalTopEdge();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ExitEdge <em>Exit Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Edge</em>'.
	 * @see se.mdh.progresside.remes.ExitEdge
	 * @generated
	 */
	EClass getExitEdge();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.FromCompositeModeEdge <em>From Composite Mode Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Composite Mode Edge</em>'.
	 * @see se.mdh.progresside.remes.FromCompositeModeEdge
	 * @generated
	 */
	EClass getFromCompositeModeEdge();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.FromCompositeModeEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connect From</em>'.
	 * @see se.mdh.progresside.remes.FromCompositeModeEdge#getConnectFrom()
	 * @see #getFromCompositeModeEdge()
	 * @generated
	 */
	EReference getFromCompositeModeEdge_ConnectFrom();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.FromCompositeModeInitEdge <em>From Composite Mode Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Composite Mode Init Edge</em>'.
	 * @see se.mdh.progresside.remes.FromCompositeModeInitEdge
	 * @generated
	 */
	EClass getFromCompositeModeInitEdge();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.FromCompositeModeInitEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connect From</em>'.
	 * @see se.mdh.progresside.remes.FromCompositeModeInitEdge#getConnectFrom()
	 * @see #getFromCompositeModeInitEdge()
	 * @generated
	 */
	EReference getFromCompositeModeInitEdge_ConnectFrom();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.FromConditionalConnectorEdge <em>From Conditional Connector Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Conditional Connector Edge</em>'.
	 * @see se.mdh.progresside.remes.FromConditionalConnectorEdge
	 * @generated
	 */
	EClass getFromConditionalConnectorEdge();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.FromConditionalConnectorEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connect From</em>'.
	 * @see se.mdh.progresside.remes.FromConditionalConnectorEdge#getConnectFrom()
	 * @see #getFromConditionalConnectorEdge()
	 * @generated
	 */
	EReference getFromConditionalConnectorEdge_ConnectFrom();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.FromSubModeEdge <em>From Sub Mode Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Sub Mode Edge</em>'.
	 * @see se.mdh.progresside.remes.FromSubModeEdge
	 * @generated
	 */
	EClass getFromSubModeEdge();

	/**
	 * Returns the meta object for the container reference '{@link se.mdh.progresside.remes.FromSubModeEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connect From</em>'.
	 * @see se.mdh.progresside.remes.FromSubModeEdge#getConnectFrom()
	 * @see #getFromSubModeEdge()
	 * @generated
	 */
	EReference getFromSubModeEdge_ConnectFrom();

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
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.InternalEdge <em>Internal Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Edge</em>'.
	 * @see se.mdh.progresside.remes.InternalEdge
	 * @generated
	 */
	EClass getInternalEdge();

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
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Mode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.mdh.progresside.remes.Mode#getName()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Name();

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
	 * Returns the meta object for the reference list '{@link se.mdh.progresside.remes.SubMode#getEntryEdges <em>Entry Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry Edges</em>'.
	 * @see se.mdh.progresside.remes.SubMode#getEntryEdges()
	 * @see #getSubMode()
	 * @generated
	 */
	EReference getSubMode_EntryEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.SubMode#getExitEdges <em>Exit Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Edges</em>'.
	 * @see se.mdh.progresside.remes.SubMode#getExitEdges()
	 * @see #getSubMode()
	 * @generated
	 */
	EReference getSubMode_ExitEdges();

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
	 * Returns the meta object for the containment reference list '{@link se.mdh.progresside.remes.SubMode#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see se.mdh.progresside.remes.SubMode#getResources()
	 * @see #getSubMode()
	 * @generated
	 */
	EReference getSubMode_Resources();

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
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ToCompositeModeEdge <em>To Composite Mode Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Composite Mode Edge</em>'.
	 * @see se.mdh.progresside.remes.ToCompositeModeEdge
	 * @generated
	 */
	EClass getToCompositeModeEdge();

	/**
	 * Returns the meta object for the reference '{@link se.mdh.progresside.remes.ToCompositeModeEdge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To</em>'.
	 * @see se.mdh.progresside.remes.ToCompositeModeEdge#getConnectTo()
	 * @see #getToCompositeModeEdge()
	 * @generated
	 */
	EReference getToCompositeModeEdge_ConnectTo();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ToConditionalConnectorEdge <em>To Conditional Connector Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Conditional Connector Edge</em>'.
	 * @see se.mdh.progresside.remes.ToConditionalConnectorEdge
	 * @generated
	 */
	EClass getToConditionalConnectorEdge();

	/**
	 * Returns the meta object for the reference '{@link se.mdh.progresside.remes.ToConditionalConnectorEdge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To</em>'.
	 * @see se.mdh.progresside.remes.ToConditionalConnectorEdge#getConnectTo()
	 * @see #getToConditionalConnectorEdge()
	 * @generated
	 */
	EReference getToConditionalConnectorEdge_ConnectTo();

	/**
	 * Returns the meta object for class '{@link se.mdh.progresside.remes.ToSubModeEdge <em>To Sub Mode Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Sub Mode Edge</em>'.
	 * @see se.mdh.progresside.remes.ToSubModeEdge
	 * @generated
	 */
	EClass getToSubModeEdge();

	/**
	 * Returns the meta object for the reference '{@link se.mdh.progresside.remes.ToSubModeEdge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To</em>'.
	 * @see se.mdh.progresside.remes.ToSubModeEdge#getConnectTo()
	 * @see #getToSubModeEdge()
	 * @generated
	 */
	EReference getToSubModeEdge_ConnectTo();

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
	 * Returns the meta object for the attribute '{@link se.mdh.progresside.remes.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.mdh.progresside.remes.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

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
		 * The meta object literal for the '<em><b>Exit Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__EXIT_EDGES = eINSTANCE.getCompositeMode_ExitEdges();

		/**
		 * The meta object literal for the '<em><b>Init Edge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__INIT_EDGE = eINSTANCE.getCompositeMode_InitEdge();

		/**
		 * The meta object literal for the '<em><b>Entry Edge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__ENTRY_EDGE = eINSTANCE.getCompositeMode_EntryEdge();

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
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl <em>Conditional Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ConditionalConnectorImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getConditionalConnector()
		 * @generated
		 */
		EClass CONDITIONAL_CONNECTOR = eINSTANCE.getConditionalConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_CONNECTOR__NAME = eINSTANCE.getConditionalConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Entry Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_CONNECTOR__ENTRY_EDGES = eINSTANCE.getConditionalConnector_EntryEdges();

		/**
		 * The meta object literal for the '<em><b>Exit Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_CONNECTOR__EXIT_EDGES = eINSTANCE.getConditionalConnector_ExitEdges();

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
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.EntryConditionalSubEdgeImpl <em>Entry Conditional Sub Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.EntryConditionalSubEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryConditionalSubEdge()
		 * @generated
		 */
		EClass ENTRY_CONDITIONAL_SUB_EDGE = eINSTANCE.getEntryConditionalSubEdge();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.EntryConditionalTopEdgeImpl <em>Entry Conditional Top Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.EntryConditionalTopEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryConditionalTopEdge()
		 * @generated
		 */
		EClass ENTRY_CONDITIONAL_TOP_EDGE = eINSTANCE.getEntryConditionalTopEdge();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.EntryConditionalTopInitEdgeImpl <em>Entry Conditional Top Init Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.EntryConditionalTopInitEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryConditionalTopInitEdge()
		 * @generated
		 */
		EClass ENTRY_CONDITIONAL_TOP_INIT_EDGE = eINSTANCE.getEntryConditionalTopInitEdge();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.EntryEdgeImpl <em>Entry Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.EntryEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryEdge()
		 * @generated
		 */
		EClass ENTRY_EDGE = eINSTANCE.getEntryEdge();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.EntryInitEdgeImpl <em>Entry Init Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.EntryInitEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getEntryInitEdge()
		 * @generated
		 */
		EClass ENTRY_INIT_EDGE = eINSTANCE.getEntryInitEdge();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ExitConditionalSubEdgeImpl <em>Exit Conditional Sub Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ExitConditionalSubEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getExitConditionalSubEdge()
		 * @generated
		 */
		EClass EXIT_CONDITIONAL_SUB_EDGE = eINSTANCE.getExitConditionalSubEdge();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ExitConditionalTopEdgeImpl <em>Exit Conditional Top Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ExitConditionalTopEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getExitConditionalTopEdge()
		 * @generated
		 */
		EClass EXIT_CONDITIONAL_TOP_EDGE = eINSTANCE.getExitConditionalTopEdge();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ExitEdgeImpl <em>Exit Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ExitEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getExitEdge()
		 * @generated
		 */
		EClass EXIT_EDGE = eINSTANCE.getExitEdge();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.FromCompositeModeEdgeImpl <em>From Composite Mode Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.FromCompositeModeEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getFromCompositeModeEdge()
		 * @generated
		 */
		EClass FROM_COMPOSITE_MODE_EDGE = eINSTANCE.getFromCompositeModeEdge();

		/**
		 * The meta object literal for the '<em><b>Connect From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM = eINSTANCE.getFromCompositeModeEdge_ConnectFrom();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.FromCompositeModeInitEdgeImpl <em>From Composite Mode Init Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.FromCompositeModeInitEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getFromCompositeModeInitEdge()
		 * @generated
		 */
		EClass FROM_COMPOSITE_MODE_INIT_EDGE = eINSTANCE.getFromCompositeModeInitEdge();

		/**
		 * The meta object literal for the '<em><b>Connect From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_COMPOSITE_MODE_INIT_EDGE__CONNECT_FROM = eINSTANCE.getFromCompositeModeInitEdge_ConnectFrom();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.FromConditionalConnectorEdgeImpl <em>From Conditional Connector Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.FromConditionalConnectorEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getFromConditionalConnectorEdge()
		 * @generated
		 */
		EClass FROM_CONDITIONAL_CONNECTOR_EDGE = eINSTANCE.getFromConditionalConnectorEdge();

		/**
		 * The meta object literal for the '<em><b>Connect From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM = eINSTANCE.getFromConditionalConnectorEdge_ConnectFrom();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.FromSubModeEdgeImpl <em>From Sub Mode Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.FromSubModeEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getFromSubModeEdge()
		 * @generated
		 */
		EClass FROM_SUB_MODE_EDGE = eINSTANCE.getFromSubModeEdge();

		/**
		 * The meta object literal for the '<em><b>Connect From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_SUB_MODE_EDGE__CONNECT_FROM = eINSTANCE.getFromSubModeEdge_ConnectFrom();

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
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.InternalEdgeImpl <em>Internal Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.InternalEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getInternalEdge()
		 * @generated
		 */
		EClass INTERNAL_EDGE = eINSTANCE.getInternalEdge();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__NAME = eINSTANCE.getMode_Name();

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
		 * The meta object literal for the '<em><b>Entry Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODE__ENTRY_EDGES = eINSTANCE.getSubMode_EntryEdges();

		/**
		 * The meta object literal for the '<em><b>Exit Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODE__EXIT_EDGES = eINSTANCE.getSubMode_ExitEdges();

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
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODE__RESOURCES = eINSTANCE.getSubMode_Resources();

		/**
		 * The meta object literal for the '<em><b>Parsed Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODE__PARSED_INVARIANT = eINSTANCE.getSubMode_ParsedInvariant();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ToCompositeModeEdgeImpl <em>To Composite Mode Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ToCompositeModeEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getToCompositeModeEdge()
		 * @generated
		 */
		EClass TO_COMPOSITE_MODE_EDGE = eINSTANCE.getToCompositeModeEdge();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_COMPOSITE_MODE_EDGE__CONNECT_TO = eINSTANCE.getToCompositeModeEdge_ConnectTo();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ToConditionalConnectorEdgeImpl <em>To Conditional Connector Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ToConditionalConnectorEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getToConditionalConnectorEdge()
		 * @generated
		 */
		EClass TO_CONDITIONAL_CONNECTOR_EDGE = eINSTANCE.getToConditionalConnectorEdge();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_CONDITIONAL_CONNECTOR_EDGE__CONNECT_TO = eINSTANCE.getToConditionalConnectorEdge_ConnectTo();

		/**
		 * The meta object literal for the '{@link se.mdh.progresside.remes.impl.ToSubModeEdgeImpl <em>To Sub Mode Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.progresside.remes.impl.ToSubModeEdgeImpl
		 * @see se.mdh.progresside.remes.impl.RemesPackageImpl#getToSubModeEdge()
		 * @generated
		 */
		EClass TO_SUB_MODE_EDGE = eINSTANCE.getToSubModeEdge();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_SUB_MODE_EDGE__CONNECT_TO = eINSTANCE.getToSubModeEdge_ConnectTo();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

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
