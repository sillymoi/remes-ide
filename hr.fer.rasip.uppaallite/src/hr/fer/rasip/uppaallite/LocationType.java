/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaallite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaallite.LocationType#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.LocationType#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.LocationType#isCommited <em>Commited</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.LocationType#isInitial <em>Initial</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.LocationType#getId <em>Id</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.LocationType#getInvariant <em>Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getLocationType()
 * @model
 * @generated
 */
public interface LocationType extends EObject {
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
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getLocationType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.LocationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urgent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urgent</em>' attribute.
	 * @see #setUrgent(boolean)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getLocationType_Urgent()
	 * @model
	 * @generated
	 */
	boolean isUrgent();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.LocationType#isUrgent <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgent</em>' attribute.
	 * @see #isUrgent()
	 * @generated
	 */
	void setUrgent(boolean value);

	/**
	 * Returns the value of the '<em><b>Commited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commited</em>' attribute.
	 * @see #setCommited(boolean)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getLocationType_Commited()
	 * @model
	 * @generated
	 */
	boolean isCommited();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.LocationType#isCommited <em>Commited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commited</em>' attribute.
	 * @see #isCommited()
	 * @generated
	 */
	void setCommited(boolean value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getLocationType_Initial()
	 * @model
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.LocationType#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getLocationType_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.LocationType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' attribute.
	 * @see #setInvariant(String)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getLocationType_Invariant()
	 * @model
	 * @generated
	 */
	String getInvariant();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.LocationType#getInvariant <em>Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' attribute.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(String value);

} // LocationType
