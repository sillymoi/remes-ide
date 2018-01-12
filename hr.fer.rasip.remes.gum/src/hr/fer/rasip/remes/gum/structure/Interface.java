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
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Interface#getInputPortGroups <em>Input Port Groups</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Interface#getOutputPortGroups <em>Output Port Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getInterface()
 * @model abstract="true"
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Port Groups</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.structure.PortGroup}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.structure.PortGroup#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port Groups</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getInterface_InputPortGroups()
	 * @see hr.fer.rasip.remes.gum.structure.PortGroup#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<PortGroup> getInputPortGroups();

	/**
	 * Returns the value of the '<em><b>Output Port Groups</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.structure.PortGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Port Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port Groups</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getInterface_OutputPortGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortGroup> getOutputPortGroups();

} // Interface
