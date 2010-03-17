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
 * A representation of the model object '<em><b>Nta Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaal.NtaType#getImports <em>Imports</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.NtaType#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.NtaType#getTemplate <em>Template</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.NtaType#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.NtaType#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.uppaal.UppaalPackage#getNtaType()
 * @model extendedMetaData="name='nta_._type' kind='elementOnly'"
 * @generated
 */
public interface NtaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute.
	 * @see #setImports(String)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getNtaType_Imports()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='imports' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImports();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.NtaType#getImports <em>Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports</em>' attribute.
	 * @see #getImports()
	 * @generated
	 */
	void setImports(String value);

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
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getNtaType_Declaration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='declaration' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeclaration();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.NtaType#getDeclaration <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' attribute.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.uppaal.TemplateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getNtaType_Template()
	 * @model type="hr.fer.rasip.uppaal.TemplateType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTemplate();

	/**
	 * Returns the value of the '<em><b>Instantiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation</em>' attribute.
	 * @see #setInstantiation(String)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getNtaType_Instantiation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='instantiation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstantiation();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.NtaType#getInstantiation <em>Instantiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiation</em>' attribute.
	 * @see #getInstantiation()
	 * @generated
	 */
	void setInstantiation(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getNtaType_System()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.NtaType#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

} // NtaType
