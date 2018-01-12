/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure;

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
 * @see hr.fer.rasip.remes.gum.structure.StructureFactory
 * @model kind="package"
 * @generated
 */
public interface StructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rasip.fer.hr/gum/0.1.0/structure.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructurePackage eINSTANCE = hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.BehaverImpl <em>Behaver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.BehaverImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getBehaver()
	 * @generated
	 */
	int BEHAVER = 0;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVER__BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Behaver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.PrimitiveImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 1;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__BEHAVIOUR = BEHAVER__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = BEHAVER__NAME;

	/**
	 * The feature id for the '<em><b>Input Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__INPUT_PORT_GROUPS = BEHAVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__OUTPUT_PORT_GROUPS = BEHAVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__PARENT = BEHAVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = BEHAVER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.CompositeImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 2;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__BEHAVIOUR = BEHAVER__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = BEHAVER__NAME;

	/**
	 * The feature id for the '<em><b>Input Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__INPUT_PORT_GROUPS = BEHAVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__OUTPUT_PORT_GROUPS = BEHAVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PARENT = BEHAVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CHILDREN = BEHAVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CONNECTIONS = BEHAVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__REENTRANT = BEHAVER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = BEHAVER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.PortImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__GROUP = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.DataPortImpl <em>Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.DataPortImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__GROUP = PORT__GROUP;

	/**
	 * The number of structural features of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.MessagePortImpl <em>Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.MessagePortImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getMessagePort()
	 * @generated
	 */
	int MESSAGE_PORT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT__GROUP = PORT__GROUP;

	/**
	 * The number of structural features of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.TriggerPortImpl <em>Trigger Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.TriggerPortImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getTriggerPort()
	 * @generated
	 */
	int TRIGGER_PORT = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__GROUP = PORT__GROUP;

	/**
	 * The number of structural features of the '<em>Trigger Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.ConnectionImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECT_FROM = 0;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECT_TO = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.ConnectorImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 8;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.PortGroupImpl <em>Port Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.PortGroupImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getPortGroup()
	 * @generated
	 */
	int PORT_GROUP = 9;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.InterfaceImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Input Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INPUT_PORT_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Output Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OUTPUT_PORT_GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.impl.StructureElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructureElementImpl
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getStructureElement()
	 * @generated
	 */
	int STRUCTURE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Input Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__INPUT_PORT_GROUPS = INTERFACE__INPUT_PORT_GROUPS;

	/**
	 * The feature id for the '<em><b>Output Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__OUTPUT_PORT_GROUPS = INTERFACE__OUTPUT_PORT_GROUPS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__PARENT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INPUT_PORT_GROUPS = STRUCTURE_ELEMENT__INPUT_PORT_GROUPS;

	/**
	 * The feature id for the '<em><b>Output Port Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUTPUT_PORT_GROUPS = STRUCTURE_ELEMENT__OUTPUT_PORT_GROUPS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARENT = STRUCTURE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__PORTS = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Port Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.PortType
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 12;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.gum.structure.ConnectorType <em>Connector Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.gum.structure.ConnectorType
	 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.Behaver <em>Behaver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaver</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Behaver
	 * @generated
	 */
	EClass getBehaver();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.structure.Behaver#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behaviour</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Behaver#getBehaviour()
	 * @see #getBehaver()
	 * @generated
	 */
	EReference getBehaver_Behaviour();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.structure.Behaver#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Behaver#getName()
	 * @see #getBehaver()
	 * @generated
	 */
	EAttribute getBehaver_Name();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.structure.Composite#isReentrant <em>Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reentrant</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Composite#isReentrant()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Reentrant();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.structure.Composite#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Composite#getChildren()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.structure.Composite#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Composite#getConnections()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Connections();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.structure.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.structure.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.structure.Port#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Port#getGroup()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Group();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.MessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.MessagePort
	 * @generated
	 */
	EClass getMessagePort();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.TriggerPort <em>Trigger Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Port</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.TriggerPort
	 * @generated
	 */
	EClass getTriggerPort();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.structure.Connection#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect From</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Connection#getConnectFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectFrom();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.gum.structure.Connection#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Connection#getConnectTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectTo();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.structure.Connection#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Connection#getParent()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Parent();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.gum.structure.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Type();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.PortGroup <em>Port Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Group</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.PortGroup
	 * @generated
	 */
	EClass getPortGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.structure.PortGroup#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.PortGroup#getPorts()
	 * @see #getPortGroup()
	 * @generated
	 */
	EReference getPortGroup_Ports();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.structure.PortGroup#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.PortGroup#getInterface()
	 * @see #getPortGroup()
	 * @generated
	 */
	EReference getPortGroup_Interface();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.structure.Interface#getInputPortGroups <em>Input Port Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Port Groups</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Interface#getInputPortGroups()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_InputPortGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.gum.structure.Interface#getOutputPortGroups <em>Output Port Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Port Groups</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.Interface#getOutputPortGroups()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_OutputPortGroups();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.gum.structure.StructureElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.StructureElement
	 * @generated
	 */
	EClass getStructureElement();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.remes.gum.structure.StructureElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.StructureElement#getParent()
	 * @see #getStructureElement()
	 * @generated
	 */
	EReference getStructureElement_Parent();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.gum.structure.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.gum.structure.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connector Type</em>'.
	 * @see hr.fer.rasip.remes.gum.structure.ConnectorType
	 * @generated
	 */
	EEnum getConnectorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureFactory getStructureFactory();

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
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.BehaverImpl <em>Behaver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.BehaverImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getBehaver()
		 * @generated
		 */
		EClass BEHAVER = eINSTANCE.getBehaver();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVER__BEHAVIOUR = eINSTANCE.getBehaver_Behaviour();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVER__NAME = eINSTANCE.getBehaver_Name();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.PrimitiveImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.CompositeImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Reentrant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__REENTRANT = eINSTANCE.getComposite_Reentrant();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__CHILDREN = eINSTANCE.getComposite_Children();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__CONNECTIONS = eINSTANCE.getComposite_Connections();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.PortImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__GROUP = eINSTANCE.getPort_Group();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.DataPortImpl <em>Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.DataPortImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getDataPort()
		 * @generated
		 */
		EClass DATA_PORT = eINSTANCE.getDataPort();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.MessagePortImpl <em>Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.MessagePortImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getMessagePort()
		 * @generated
		 */
		EClass MESSAGE_PORT = eINSTANCE.getMessagePort();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.TriggerPortImpl <em>Trigger Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.TriggerPortImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getTriggerPort()
		 * @generated
		 */
		EClass TRIGGER_PORT = eINSTANCE.getTriggerPort();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.ConnectionImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Connect From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECT_FROM = eINSTANCE.getConnection_ConnectFrom();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECT_TO = eINSTANCE.getConnection_ConnectTo();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PARENT = eINSTANCE.getConnection_Parent();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.ConnectorImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.PortGroupImpl <em>Port Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.PortGroupImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getPortGroup()
		 * @generated
		 */
		EClass PORT_GROUP = eINSTANCE.getPortGroup();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_GROUP__PORTS = eINSTANCE.getPortGroup_Ports();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_GROUP__INTERFACE = eINSTANCE.getPortGroup_Interface();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.InterfaceImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Input Port Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__INPUT_PORT_GROUPS = eINSTANCE.getInterface_InputPortGroups();

		/**
		 * The meta object literal for the '<em><b>Output Port Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OUTPUT_PORT_GROUPS = eINSTANCE.getInterface_OutputPortGroups();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.impl.StructureElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructureElementImpl
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getStructureElement()
		 * @generated
		 */
		EClass STRUCTURE_ELEMENT = eINSTANCE.getStructureElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_ELEMENT__PARENT = eINSTANCE.getStructureElement_Parent();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.PortType
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.gum.structure.ConnectorType <em>Connector Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.gum.structure.ConnectorType
		 * @see hr.fer.rasip.remes.gum.structure.impl.StructurePackageImpl#getConnectorType()
		 * @generated
		 */
		EEnum CONNECTOR_TYPE = eINSTANCE.getConnectorType();

	}

} //StructurePackage
