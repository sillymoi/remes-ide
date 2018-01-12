/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Composite#getChildren <em>Children</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Composite#getConnections <em>Connections</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.Composite#isReentrant <em>Reentrant</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends Behaver, StructureElement {
	/**
	 * Returns the value of the '<em><b>Reentrant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reentrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reentrant</em>' attribute.
	 * @see #setReentrant(boolean)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getComposite_Reentrant()
	 * @model default="false"
	 * @generated
	 */
	boolean isReentrant();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.Composite#isReentrant <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reentrant</em>' attribute.
	 * @see #isReentrant()
	 * @generated
	 */
	void setReentrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.structure.StructureElement}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.structure.StructureElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getComposite_Children()
	 * @see hr.fer.rasip.remes.gum.structure.StructureElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<StructureElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.structure.Connection}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.structure.Connection#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getComposite_Connections()
	 * @see hr.fer.rasip.remes.gum.structure.Connection#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // Composite
