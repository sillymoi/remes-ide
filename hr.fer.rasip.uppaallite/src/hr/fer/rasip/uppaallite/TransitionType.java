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
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaallite.TransitionType#getSync <em>Sync</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.TransitionType#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.TransitionType#getGuard <em>Guard</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.TransitionType#getSource <em>Source</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.TransitionType#getTarget <em>Target</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.TransitionType#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTransitionType()
 * @model
 * @generated
 */
public interface TransitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync</em>' attribute.
	 * @see #setSync(String)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTransitionType_Sync()
	 * @model
	 * @generated
	 */
	String getSync();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.TransitionType#getSync <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync</em>' attribute.
	 * @see #getSync()
	 * @generated
	 */
	void setSync(String value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' attribute.
	 * @see #setAssignment(String)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTransitionType_Assignment()
	 * @model
	 * @generated
	 */
	String getAssignment();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.TransitionType#getAssignment <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' attribute.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(String value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTransitionType_Guard()
	 * @model
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.TransitionType#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LocationType)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTransitionType_Source()
	 * @model required="true"
	 * @generated
	 */
	LocationType getSource();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.TransitionType#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LocationType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(LocationType)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTransitionType_Target()
	 * @model required="true"
	 * @generated
	 */
	LocationType getTarget();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.TransitionType#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LocationType value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hr.fer.rasip.uppaallite.TemplateType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(TemplateType)
	 * @see hr.fer.rasip.uppaallite.UppaallitePackage#getTransitionType_Container()
	 * @see hr.fer.rasip.uppaallite.TemplateType#getTransition
	 * @model opposite="transition" required="true" transient="false"
	 * @generated
	 */
	TemplateType getContainer();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaallite.TransitionType#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(TemplateType value);

} // TransitionType
