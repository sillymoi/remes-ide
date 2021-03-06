/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.Constraint#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.Constraint#getReferences <em>References</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.Constraint#isIsDerivation <em>Is Derivation</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.Constraint#getOperation <em>Operation</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.Constraint#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link hr.fer.rasip.remes.profile.profile.ConstraintType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see hr.fer.rasip.remes.profile.profile.ConstraintType
   * @see #setType(ConstraintType)
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getConstraint_Type()
   * @model
   * @generated
   */
  ConstraintType getType();

  /**
   * Sets the value of the '{@link hr.fer.rasip.remes.profile.profile.Constraint#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see hr.fer.rasip.remes.profile.profile.ConstraintType
   * @see #getType()
   * @generated
   */
  void setType(ConstraintType value);

  /**
   * Returns the value of the '<em><b>References</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' reference.
   * @see #setReferences(Resource)
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getConstraint_References()
   * @model
   * @generated
   */
  Resource getReferences();

  /**
   * Sets the value of the '{@link hr.fer.rasip.remes.profile.profile.Constraint#getReferences <em>References</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>References</em>' reference.
   * @see #getReferences()
   * @generated
   */
  void setReferences(Resource value);

  /**
   * Returns the value of the '<em><b>Is Derivation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Derivation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Derivation</em>' attribute.
   * @see #setIsDerivation(boolean)
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getConstraint_IsDerivation()
   * @model
   * @generated
   */
  boolean isIsDerivation();

  /**
   * Sets the value of the '{@link hr.fer.rasip.remes.profile.profile.Constraint#isIsDerivation <em>Is Derivation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Derivation</em>' attribute.
   * @see #isIsDerivation()
   * @generated
   */
  void setIsDerivation(boolean value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * The literals are from the enumeration {@link hr.fer.rasip.remes.profile.profile.ConstraintOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see hr.fer.rasip.remes.profile.profile.ConstraintOperation
   * @see #setOperation(ConstraintOperation)
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getConstraint_Operation()
   * @model
   * @generated
   */
  ConstraintOperation getOperation();

  /**
   * Sets the value of the '{@link hr.fer.rasip.remes.profile.profile.Constraint#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see hr.fer.rasip.remes.profile.profile.ConstraintOperation
   * @see #getOperation()
   * @generated
   */
  void setOperation(ConstraintOperation value);

  /**
   * Returns the value of the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound</em>' attribute.
   * @see #setBound(int)
   * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getConstraint_Bound()
   * @model
   * @generated
   */
  int getBound();

  /**
   * Sets the value of the '{@link hr.fer.rasip.remes.profile.profile.Constraint#getBound <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound</em>' attribute.
   * @see #getBound()
   * @generated
   */
  void setBound(int value);

} // Constraint
