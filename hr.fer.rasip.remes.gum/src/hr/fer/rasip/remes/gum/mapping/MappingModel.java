/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.mapping.MappingModel#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.mapping.MappingPackage#getMappingModel()
 * @model
 * @generated
 */
public interface MappingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.mapping.Mapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see hr.fer.rasip.remes.gum.mapping.MappingPackage#getMappingModel_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

} // MappingModel
