/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaal.TemplateType#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.TemplateType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.TemplateType#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.TemplateType#getLocation <em>Location</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.TemplateType#getInit <em>Init</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.TemplateType#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.uppaal.UppaalPackage#getTemplateType()
 * @model extendedMetaData="name='template_._type' kind='elementOnly'"
 * @generated
 */
public interface TemplateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getTemplateType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.TemplateType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(ParameterType)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getTemplateType_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterType getParameter();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.TemplateType#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' attribute.
	 * @see #setDeclaration(String)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getTemplateType_Declaration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='declaration' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeclaration();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.TemplateType#getDeclaration <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' attribute.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.uppaal.LocationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getTemplateType_Location()
	 * @model type="hr.fer.rasip.uppaal.LocationType" containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getLocation();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(InitType)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getTemplateType_Init()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='init' namespace='##targetNamespace'"
	 * @generated
	 */
	InitType getInit();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.TemplateType#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(InitType value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.uppaal.TransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getTemplateType_Transition()
	 * @model type="hr.fer.rasip.uppaal.TransitionType" containment="true"
	 *        extendedMetaData="kind='element' name='transition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTransition();

} // TemplateType
