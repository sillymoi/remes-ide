/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaal.LocationType#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.LocationType#getLabel <em>Label</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.LocationType#getUrgent <em>Urgent</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.LocationType#getCommitted <em>Committed</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.LocationType#getColor <em>Color</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.LocationType#getId <em>Id</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.LocationType#getX <em>X</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.LocationType#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.uppaal.UppaalPackage#getLocationType()
 * @model extendedMetaData="name='location_._type' kind='elementOnly'"
 * @generated
 */
public interface LocationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getLocationType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.LocationType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link hr.fer.rasip.uppaal.LabelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getLocationType_Label()
	 * @model type="hr.fer.rasip.uppaal.LabelType" containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getLabel();

	/**
	 * Returns the value of the '<em><b>Urgent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urgent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urgent</em>' containment reference.
	 * @see #setUrgent(UrgentType)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getLocationType_Urgent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='urgent' namespace='##targetNamespace'"
	 * @generated
	 */
	UrgentType getUrgent();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.LocationType#getUrgent <em>Urgent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgent</em>' containment reference.
	 * @see #getUrgent()
	 * @generated
	 */
	void setUrgent(UrgentType value);

	/**
	 * Returns the value of the '<em><b>Committed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Committed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committed</em>' containment reference.
	 * @see #setCommitted(CommittedType)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getLocationType_Committed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='committed' namespace='##targetNamespace'"
	 * @generated
	 */
	CommittedType getCommitted();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.LocationType#getCommitted <em>Committed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committed</em>' containment reference.
	 * @see #getCommitted()
	 * @generated
	 */
	void setCommitted(CommittedType value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Object)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getLocationType_Color()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getColor();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.LocationType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Object value);

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
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getLocationType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.LocationType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Object)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getLocationType_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getX();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.LocationType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Object value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Object)
	 * @see hr.fer.rasip.uppaal.UppaalPackage#getLocationType_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getY();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.uppaal.LocationType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Object value);

} // LocationType
