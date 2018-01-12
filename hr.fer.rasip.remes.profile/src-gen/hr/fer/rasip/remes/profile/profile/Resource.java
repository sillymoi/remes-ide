/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.Resource#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.Resource#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.Resource#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject
{
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
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getResource_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hr.fer.rasip.remes.profile.profile.Resource#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link hr.fer.rasip.remes.profile.profile.ResourceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see hr.fer.rasip.remes.profile.profile.ResourceType
   * @see #setType(ResourceType)
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getResource_Type()
   * @model
   * @generated
   */
  ResourceType getType();

  /**
   * Sets the value of the '{@link hr.fer.rasip.remes.profile.profile.Resource#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see hr.fer.rasip.remes.profile.profile.ResourceType
   * @see #getType()
   * @generated
   */
  void setType(ResourceType value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(int)
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getResource_Weight()
   * @model
   * @generated
   */
  int getWeight();

  /**
   * Sets the value of the '{@link hr.fer.rasip.remes.profile.profile.Resource#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(int value);

} // Resource
