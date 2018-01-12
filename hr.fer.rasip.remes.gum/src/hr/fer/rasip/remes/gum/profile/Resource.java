/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.profile;

import hr.fer.rasip.remes.gum.behaviour.Referable;
import hr.fer.rasip.remes.gum.behaviour.ResourceTypes;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.Resource#getReferences <em>References</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.Resource#getPlatform <em>Platform</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.Resource#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Referable {
	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link hr.fer.rasip.remes.gum.behaviour.Resource}.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.behaviour.Resource#getResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getResource_References()
	 * @see hr.fer.rasip.remes.gum.behaviour.Resource#getResolved
	 * @model opposite="resolved"
	 * @generated
	 */
	EList<hr.fer.rasip.remes.gum.behaviour.Resource> getReferences();

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.remes.gum.profile.PlatformProfile#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' container reference.
	 * @see #setPlatform(PlatformProfile)
	 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getResource_Platform()
	 * @see hr.fer.rasip.remes.gum.profile.PlatformProfile#getResources
	 * @model opposite="resources" required="true" transient="false"
	 * @generated
	 */
	PlatformProfile getPlatform();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.profile.Resource#getPlatform <em>Platform</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' container reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(PlatformProfile value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hr.fer.rasip.remes.gum.behaviour.ResourceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.behaviour.ResourceTypes
	 * @see #setType(ResourceTypes)
	 * @see hr.fer.rasip.remes.gum.profile.ProfilePackage#getResource_Type()
	 * @model required="true"
	 * @generated
	 */
	ResourceTypes getType();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.profile.Resource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hr.fer.rasip.remes.gum.behaviour.ResourceTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceTypes value);

} // Resource
