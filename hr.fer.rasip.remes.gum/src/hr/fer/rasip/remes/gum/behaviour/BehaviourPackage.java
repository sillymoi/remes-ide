/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour;

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
 * @see hr.fer.rasip.remes.gum.behaviour.BehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rasip.fer.hr/gum/0.1.0/behaviour.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourPackage eINSTANCE = hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.ContextImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONSTANTS = 2;

	/**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__RENAMINGS = 3;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__VARIABLES = CONTEXT__VARIABLES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__RESOURCES = CONTEXT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__CONSTANTS = CONTEXT__CONSTANTS;

	/**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__RENAMINGS = CONTEXT__RENAMINGS;

	/**
	 * The feature id for the '<em><b>Behavers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__BEHAVERS = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__MODES = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Top Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__TOP_MODES = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__NAME = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.ModeImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__VARIABLES = CONTEXT__VARIABLES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__RESOURCES = CONTEXT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__CONSTANTS = CONTEXT__CONSTANTS;

	/**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__RENAMINGS = CONTEXT__RENAMINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__INCOMING_EDGES = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__OUTGOING_EDGES = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enclosing Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ENCLOSING_BEHAVIOUR = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__INVARIANT = CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.CompositeModeImpl <em>Composite Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.CompositeModeImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getCompositeMode()
	 * @generated
	 */
	int COMPOSITE_MODE = 3;

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
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__RENAMINGS = MODE__RENAMINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__NAME = MODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__INCOMING_EDGES = MODE__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__OUTGOING_EDGES = MODE__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Enclosing Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__ENCLOSING_BEHAVIOUR = MODE__ENCLOSING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__INVARIANT = MODE__INVARIANT;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__MODES = MODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE__INIT_EDGE = MODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.AtomicModeImpl <em>Atomic Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.AtomicModeImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getAtomicMode()
	 * @generated
	 */
	int ATOMIC_MODE = 4;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__VARIABLES = MODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__RESOURCES = MODE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__CONSTANTS = MODE__CONSTANTS;

	/**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__RENAMINGS = MODE__RENAMINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__NAME = MODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__INCOMING_EDGES = MODE__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__OUTGOING_EDGES = MODE__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Enclosing Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__ENCLOSING_BEHAVIOUR = MODE__ENCLOSING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__INVARIANT = MODE__INVARIANT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE__PARENT = MODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODE_FEATURE_COUNT = MODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ReferableImpl <em>Referable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.ReferableImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getReferable()
	 * @generated
	 */
	int REFERABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Referable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.VariableImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = REFERABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = REFERABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SCOPE = REFERABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__READABLE = REFERABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__WRITABLE = REFERABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = REFERABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.ResourceImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = REFERABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = REFERABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SCOPE = REFERABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXPRESSION = REFERABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOLVED = REFERABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.ConstantImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = REFERABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = REFERABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__SCOPE = REFERABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = REFERABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__RESOLVED = REFERABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.EdgeImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 9;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONNECT_FROM = 0;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONNECT_TO = 1;

	/**
	 * The feature id for the '<em><b>Action Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ACTION_GUARD = 2;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ACTION_BODY = 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.InitEdgeImpl <em>Init Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.InitEdgeImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getInitEdge()
	 * @generated
	 */
	int INIT_EDGE = 10;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE__CONNECT_FROM = 0;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE__CONNECT_TO = 1;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE__INITIALIZATION = 2;

	/**
	 * The number of structural features of the '<em>Init Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_EDGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.RenamingImpl <em>Renaming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.RenamingImpl
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getRenaming()
	 * @generated
	 */
	int RENAMING = 11;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__TO = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Renaming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes <em>Primitive Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getPrimitiveTypes()
	 * @generated
	 */
	int PRIMITIVE_TYPES = 12;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.behaviour.ResourceTypes <em>Resource Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.behaviour.ResourceTypes
	 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getResourceTypes()
	 * @generated
	 */
	int RESOURCE_TYPES = 13;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the reference list '{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getBehavers <em>Behavers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behavers</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Behaviour#getBehavers()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Behavers();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Behaviour#getModes()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Modes();

	/**
	 * Returns the meta object for the reference list '{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getTopModes <em>Top Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Top Modes</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Behaviour#getTopModes()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_TopModes();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.behaviour.Behaviour#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Behaviour#getName()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_Name();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.behaviour.Context#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Context#getVariables()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.behaviour.Context#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Context#getResources()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.behaviour.Context#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Context#getConstants()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Constants();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.behaviour.Context#getRenamings <em>Renamings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renamings</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Context#getRenamings()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Renamings();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Mode#getName()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Name();

	/**
	 * Returns the meta object for the reference list '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Edges</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Mode#getIncomingEdges()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_IncomingEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Edges</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Mode#getOutgoingEdges()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_OutgoingEdges();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getEnclosingBehaviour <em>Enclosing Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enclosing Behaviour</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Mode#getEnclosingBehaviour()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_EnclosingBehaviour();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.gum.behaviour.Mode#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invariant</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Mode#getInvariant()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Invariant();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.CompositeMode <em>Composite Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Mode</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.CompositeMode
	 * @generated
	 */
	EClass getCompositeMode();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.behaviour.CompositeMode#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.CompositeMode#getModes()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_Modes();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.gum.behaviour.CompositeMode#getInitEdge <em>Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Edge</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.CompositeMode#getInitEdge()
	 * @see #getCompositeMode()
	 * @generated
	 */
	EReference getCompositeMode_InitEdge();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.AtomicMode <em>Atomic Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Mode</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.AtomicMode
	 * @generated
	 */
	EClass getAtomicMode();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.behaviour.AtomicMode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.AtomicMode#getParent()
	 * @see #getAtomicMode()
	 * @generated
	 */
	EReference getAtomicMode_Parent();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.Referable <em>Referable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referable</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Referable
	 * @generated
	 */
	EClass getReferable();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.behaviour.Referable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Referable#getName()
	 * @see #getReferable()
	 * @generated
	 */
	EAttribute getReferable_Name();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.behaviour.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.behaviour.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Variable#getScope()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Scope();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.behaviour.Variable#isReadable <em>Readable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readable</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Variable#isReadable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Readable();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.behaviour.Variable#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Variable#isWritable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Writable();

	/**
	 * Returns the meta object for the reference list '{@link hr.fer.rasip.remes.gum.behaviour.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Value();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Resource#getScope()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Resource#getExpression()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Expression();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Resource#getResolved()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Resolved();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Type();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Constant#getScope()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Value();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.behaviour.Constant#getResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Constant#getResolved()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Resolved();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connect From</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Edge#getConnectFrom()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ConnectFrom();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Edge#getConnectTo()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ConnectTo();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getActionGuard <em>Action Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Guard</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Edge#getActionGuard()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ActionGuard();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.gum.behaviour.Edge#getActionBody <em>Action Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Body</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Edge#getActionBody()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ActionBody();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.InitEdge <em>Init Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Edge</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.InitEdge
	 * @generated
	 */
	EClass getInitEdge();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connect From</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectFrom()
	 * @see #getInitEdge()
	 * @generated
	 */
	EReference getInitEdge_ConnectFrom();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.InitEdge#getConnectTo()
	 * @see #getInitEdge()
	 * @generated
	 */
	EReference getInitEdge_ConnectTo();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.gum.behaviour.InitEdge#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.InitEdge#getInitialization()
	 * @see #getInitEdge()
	 * @generated
	 */
	EReference getInitEdge_Initialization();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.behaviour.Renaming <em>Renaming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renaming</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Renaming
	 * @generated
	 */
	EClass getRenaming();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Renaming#getFrom()
	 * @see #getRenaming()
	 * @generated
	 */
	EReference getRenaming_From();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Renaming#getTo()
	 * @see #getRenaming()
	 * @generated
	 */
	EReference getRenaming_To();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.behaviour.Renaming#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.Renaming#getContext()
	 * @see #getRenaming()
	 * @generated
	 */
	EReference getRenaming_Context();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Types</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes
	 * @generated
	 */
	EEnum getPrimitiveTypes();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.gum.behaviour.ResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Types</em>'.
	 * @see hr.fer.rasip.remes.gum.behaviour.ResourceTypes
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
	BehaviourFactory getBehaviourFactory();

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
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Behavers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__BEHAVERS = eINSTANCE.getBehaviour_Behavers();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__MODES = eINSTANCE.getBehaviour_Modes();

		/**
		 * The meta object literal for the '<em><b>Top Modes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__TOP_MODES = eINSTANCE.getBehaviour_TopModes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__NAME = eINSTANCE.getBehaviour_Name();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.ContextImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__VARIABLES = eINSTANCE.getContext_Variables();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__RESOURCES = eINSTANCE.getContext_Resources();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONSTANTS = eINSTANCE.getContext_Constants();

		/**
		 * The meta object literal for the '<em><b>Renamings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__RENAMINGS = eINSTANCE.getContext_Renamings();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.ModeImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getMode()
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
		 * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__INCOMING_EDGES = eINSTANCE.getMode_IncomingEdges();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__OUTGOING_EDGES = eINSTANCE.getMode_OutgoingEdges();

		/**
		 * The meta object literal for the '<em><b>Enclosing Behaviour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__ENCLOSING_BEHAVIOUR = eINSTANCE.getMode_EnclosingBehaviour();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__INVARIANT = eINSTANCE.getMode_Invariant();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.CompositeModeImpl <em>Composite Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.CompositeModeImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getCompositeMode()
		 * @generated
		 */
		EClass COMPOSITE_MODE = eINSTANCE.getCompositeMode();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__MODES = eINSTANCE.getCompositeMode_Modes();

		/**
		 * The meta object literal for the '<em><b>Init Edge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODE__INIT_EDGE = eINSTANCE.getCompositeMode_InitEdge();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.AtomicModeImpl <em>Atomic Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.AtomicModeImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getAtomicMode()
		 * @generated
		 */
		EClass ATOMIC_MODE = eINSTANCE.getAtomicMode();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODE__PARENT = eINSTANCE.getAtomicMode_Parent();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ReferableImpl <em>Referable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.ReferableImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getReferable()
		 * @generated
		 */
		EClass REFERABLE = eINSTANCE.getReferable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERABLE__NAME = eINSTANCE.getReferable_Name();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.VariableImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

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
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.ResourceImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

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
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__EXPRESSION = eINSTANCE.getResource_Expression();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RESOLVED = eINSTANCE.getResource_Resolved();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.ConstantImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getConstant()
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
		 * The meta object literal for the '<em><b>Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__SCOPE = eINSTANCE.getConstant_Scope();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__RESOLVED = eINSTANCE.getConstant_Resolved();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.EdgeImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

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
		 * The meta object literal for the '<em><b>Action Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__ACTION_GUARD = eINSTANCE.getEdge_ActionGuard();

		/**
		 * The meta object literal for the '<em><b>Action Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__ACTION_BODY = eINSTANCE.getEdge_ActionBody();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.InitEdgeImpl <em>Init Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.InitEdgeImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getInitEdge()
		 * @generated
		 */
		EClass INIT_EDGE = eINSTANCE.getInitEdge();

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
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_EDGE__INITIALIZATION = eINSTANCE.getInitEdge_Initialization();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.impl.RenamingImpl <em>Renaming</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.RenamingImpl
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getRenaming()
		 * @generated
		 */
		EClass RENAMING = eINSTANCE.getRenaming();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAMING__FROM = eINSTANCE.getRenaming_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAMING__TO = eINSTANCE.getRenaming_To();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAMING__CONTEXT = eINSTANCE.getRenaming_Context();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes <em>Primitive Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getPrimitiveTypes()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPES = eINSTANCE.getPrimitiveTypes();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.behaviour.ResourceTypes <em>Resource Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.behaviour.ResourceTypes
		 * @see hr.fer.rasip.remes.gum.behaviour.impl.BehaviourPackageImpl#getResourceTypes()
		 * @generated
		 */
		EEnum RESOURCE_TYPES = eINSTANCE.getResourceTypes();

	}

} //BehaviourPackage
