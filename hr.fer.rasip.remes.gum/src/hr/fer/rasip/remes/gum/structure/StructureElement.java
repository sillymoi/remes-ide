/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.StructureElement#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getStructureElement()
 * @model abstract="true"
 * @generated
 */
public interface StructureElement extends Interface {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.structure.Composite#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Composite)
	 * @see hr.fer.rasip.remes.gum.structure.StructurePackage#getStructureElement_Parent()
	 * @see hr.fer.rasip.remes.gum.structure.Composite#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Composite getParent();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.structure.StructureElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Composite value);

} // StructureElement
