/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Port#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Port#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Port#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hr.fer.rasip.remes.gum.structure.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.structure.PortType
	 * @see #setType(PortType)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getPort_Type()
	 * @model required="true"
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.structure.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.structure.PortGroup#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(PortGroup)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getPort_Group()
	 * @see hr.fer.rasip.remes.gum.structure.PortGroup#getPorts
	 * @model opposite="ports" required="true" transient="false"
	 * @generated
	 */
	PortGroup getGroup();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.Port#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(PortGroup value);

} // Port
