/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.PortGroup#getPorts <em>Ports</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.PortGroup#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getPortGroup()
 * @model
 * @generated
 */
public interface PortGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.structure.Port}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.structure.Port#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getPortGroup_Ports()
	 * @see hr.fer.rasip.remes.gum.structure.Port#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.structure.Interface#getInputPortGroups <em>Input Port Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getPortGroup_Interface()
	 * @see hr.fer.rasip.remes.gum.structure.Interface#getInputPortGroups
	 * @model opposite="inputPortGroups" required="true" transient="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.PortGroup#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // PortGroup
