/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaallite;

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
 * @see hr.fer.rasip.uppaallite.UppaalliteFactory
 * @model kind="package"
 * @generated
 */
public interface UppaallitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uppaallite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uppaallite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UppaallitePackage eINSTANCE = hr.fer.rasip.uppaallite.impl.UppaallitePackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.uppaallite.impl.UppaalDiagramImpl <em>Uppaal Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.uppaallite.impl.UppaalDiagramImpl
	 * @see hr.fer.rasip.uppaallite.impl.UppaallitePackageImpl#getUppaalDiagram()
	 * @generated
	 */
	int UPPAAL_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPAAL_DIAGRAM__TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPAAL_DIAGRAM__DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Resource Weight Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPAAL_DIAGRAM__RESOURCE_WEIGHT_DECLARATION = 2;

	/**
	 * The number of structural features of the '<em>Uppaal Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPAAL_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.uppaallite.impl.TemplateTypeImpl <em>Template Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.uppaallite.impl.TemplateTypeImpl
	 * @see hr.fer.rasip.uppaallite.impl.UppaallitePackageImpl#getTemplateType()
	 * @generated
	 */
	int TEMPLATE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__TRANSITION = 3;

	/**
	 * The number of structural features of the '<em>Template Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.uppaallite.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.uppaallite.impl.LocationTypeImpl
	 * @see hr.fer.rasip.uppaallite.impl.UppaallitePackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__URGENT = 1;

	/**
	 * The feature id for the '<em><b>Committed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__COMMITTED = 2;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__INITIAL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__INVARIANT = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__COST = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__X = 8;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__Y = 9;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.uppaallite.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.uppaallite.impl.TransitionTypeImpl
	 * @see hr.fer.rasip.uppaallite.impl.UppaallitePackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__SYNC = 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__GUARD = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__COST = 6;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.uppaallite.UppaalDiagram <em>Uppaal Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uppaal Diagram</em>'.
	 * @see hr.fer.rasip.uppaallite.UppaalDiagram
	 * @generated
	 */
	EClass getUppaalDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.uppaallite.UppaalDiagram#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template</em>'.
	 * @see hr.fer.rasip.uppaallite.UppaalDiagram#getTemplate()
	 * @see #getUppaalDiagram()
	 * @generated
	 */
	EReference getUppaalDiagram_Template();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.UppaalDiagram#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration</em>'.
	 * @see hr.fer.rasip.uppaallite.UppaalDiagram#getDeclaration()
	 * @see #getUppaalDiagram()
	 * @generated
	 */
	EAttribute getUppaalDiagram_Declaration();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.UppaalDiagram#getResourceWeightDeclaration <em>Resource Weight Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Weight Declaration</em>'.
	 * @see hr.fer.rasip.uppaallite.UppaalDiagram#getResourceWeightDeclaration()
	 * @see #getUppaalDiagram()
	 * @generated
	 */
	EAttribute getUppaalDiagram_ResourceWeightDeclaration();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.uppaallite.TemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type</em>'.
	 * @see hr.fer.rasip.uppaallite.TemplateType
	 * @generated
	 */
	EClass getTemplateType();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.TemplateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.uppaallite.TemplateType#getName()
	 * @see #getTemplateType()
	 * @generated
	 */
	EAttribute getTemplateType_Name();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.TemplateType#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration</em>'.
	 * @see hr.fer.rasip.uppaallite.TemplateType#getDeclaration()
	 * @see #getTemplateType()
	 * @generated
	 */
	EAttribute getTemplateType_Declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.uppaallite.TemplateType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see hr.fer.rasip.uppaallite.TemplateType#getLocation()
	 * @see #getTemplateType()
	 * @generated
	 */
	EReference getTemplateType_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.uppaallite.TemplateType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see hr.fer.rasip.uppaallite.TemplateType#getTransition()
	 * @see #getTemplateType()
	 * @generated
	 */
	EReference getTemplateType_Transition();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.uppaallite.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.LocationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#getName()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.LocationType#isUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#isUrgent()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Urgent();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.LocationType#isCommitted <em>Committed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committed</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#isCommitted()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Committed();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.LocationType#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#isInitial()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Initial();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.LocationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#getId()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.LocationType#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invariant</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#getInvariant()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Invariant();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.uppaallite.LocationType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#getContainer()
	 * @see #getLocationType()
	 * @generated
	 */
	EReference getLocationType_Container();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.LocationType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#getCost()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Cost();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.LocationType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#getX()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_X();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.LocationType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see hr.fer.rasip.uppaallite.LocationType#getY()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Y();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.uppaallite.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see hr.fer.rasip.uppaallite.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.TransitionType#getSync <em>Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync</em>'.
	 * @see hr.fer.rasip.uppaallite.TransitionType#getSync()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Sync();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.TransitionType#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment</em>'.
	 * @see hr.fer.rasip.uppaallite.TransitionType#getAssignment()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Assignment();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.TransitionType#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see hr.fer.rasip.uppaallite.TransitionType#getGuard()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Guard();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.uppaallite.TransitionType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hr.fer.rasip.uppaallite.TransitionType#getSource()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Source();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.uppaallite.TransitionType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hr.fer.rasip.uppaallite.TransitionType#getTarget()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Target();

	/**
	 * Returns the meta object for the container reference '{@link hr.fer.rasip.uppaallite.TransitionType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see hr.fer.rasip.uppaallite.TransitionType#getContainer()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Container();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.uppaallite.TransitionType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see hr.fer.rasip.uppaallite.TransitionType#getCost()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Cost();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UppaalliteFactory getUppaalliteFactory();

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
		 * The meta object literal for the '{@link hr.fer.rasip.uppaallite.impl.UppaalDiagramImpl <em>Uppaal Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.uppaallite.impl.UppaalDiagramImpl
		 * @see hr.fer.rasip.uppaallite.impl.UppaallitePackageImpl#getUppaalDiagram()
		 * @generated
		 */
		EClass UPPAAL_DIAGRAM = eINSTANCE.getUppaalDiagram();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPPAAL_DIAGRAM__TEMPLATE = eINSTANCE.getUppaalDiagram_Template();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPPAAL_DIAGRAM__DECLARATION = eINSTANCE.getUppaalDiagram_Declaration();

		/**
		 * The meta object literal for the '<em><b>Resource Weight Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPPAAL_DIAGRAM__RESOURCE_WEIGHT_DECLARATION = eINSTANCE.getUppaalDiagram_ResourceWeightDeclaration();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.uppaallite.impl.TemplateTypeImpl <em>Template Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.uppaallite.impl.TemplateTypeImpl
		 * @see hr.fer.rasip.uppaallite.impl.UppaallitePackageImpl#getTemplateType()
		 * @generated
		 */
		EClass TEMPLATE_TYPE = eINSTANCE.getTemplateType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_TYPE__NAME = eINSTANCE.getTemplateType_Name();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_TYPE__DECLARATION = eINSTANCE.getTemplateType_Declaration();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_TYPE__LOCATION = eINSTANCE.getTemplateType_Location();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_TYPE__TRANSITION = eINSTANCE.getTemplateType_Transition();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.uppaallite.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.uppaallite.impl.LocationTypeImpl
		 * @see hr.fer.rasip.uppaallite.impl.UppaallitePackageImpl#getLocationType()
		 * @generated
		 */
		EClass LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__NAME = eINSTANCE.getLocationType_Name();

		/**
		 * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__URGENT = eINSTANCE.getLocationType_Urgent();

		/**
		 * The meta object literal for the '<em><b>Committed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__COMMITTED = eINSTANCE.getLocationType_Committed();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__INITIAL = eINSTANCE.getLocationType_Initial();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__ID = eINSTANCE.getLocationType_Id();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__INVARIANT = eINSTANCE.getLocationType_Invariant();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TYPE__CONTAINER = eINSTANCE.getLocationType_Container();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__COST = eINSTANCE.getLocationType_Cost();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__X = eINSTANCE.getLocationType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__Y = eINSTANCE.getLocationType_Y();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.uppaallite.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.uppaallite.impl.TransitionTypeImpl
		 * @see hr.fer.rasip.uppaallite.impl.UppaallitePackageImpl#getTransitionType()
		 * @generated
		 */
		EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '<em><b>Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__SYNC = eINSTANCE.getTransitionType_Sync();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__ASSIGNMENT = eINSTANCE.getTransitionType_Assignment();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__GUARD = eINSTANCE.getTransitionType_Guard();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__SOURCE = eINSTANCE.getTransitionType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__TARGET = eINSTANCE.getTransitionType_Target();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__CONTAINER = eINSTANCE.getTransitionType_Container();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__COST = eINSTANCE.getTransitionType_Cost();

	}

} //UppaallitePackage
