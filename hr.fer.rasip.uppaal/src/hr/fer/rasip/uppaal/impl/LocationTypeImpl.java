/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaal.impl;

import hr.fer.rasip.uppaal.CommittedType;
import hr.fer.rasip.uppaal.LabelType;
import hr.fer.rasip.uppaal.LocationType;
import hr.fer.rasip.uppaal.NameType;
import hr.fer.rasip.uppaal.UppaalPackage;
import hr.fer.rasip.uppaal.UrgentType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaal.impl.LocationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.LocationTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.LocationTypeImpl#getUrgent <em>Urgent</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.LocationTypeImpl#getCommitted <em>Committed</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.LocationTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.LocationTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.LocationTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.LocationTypeImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationTypeImpl extends EObjectImpl implements LocationType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList label;

	/**
	 * The cached value of the '{@link #getUrgent() <em>Urgent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgent()
	 * @generated
	 * @ordered
	 */
	protected UrgentType urgent;

	/**
	 * The cached value of the '{@link #getCommitted() <em>Committed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitted()
	 * @generated
	 * @ordered
	 */
	protected CommittedType committed;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Object COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Object color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Object X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Object x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Object Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Object y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UppaalPackage.Literals.LOCATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
		NameType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.LOCATION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.LOCATION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList(LabelType.class, this, UppaalPackage.LOCATION_TYPE__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrgentType getUrgent() {
		return urgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrgent(UrgentType newUrgent, NotificationChain msgs) {
		UrgentType oldUrgent = urgent;
		urgent = newUrgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__URGENT, oldUrgent, newUrgent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrgent(UrgentType newUrgent) {
		if (newUrgent != urgent) {
			NotificationChain msgs = null;
			if (urgent != null)
				msgs = ((InternalEObject)urgent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.LOCATION_TYPE__URGENT, null, msgs);
			if (newUrgent != null)
				msgs = ((InternalEObject)newUrgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.LOCATION_TYPE__URGENT, null, msgs);
			msgs = basicSetUrgent(newUrgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__URGENT, newUrgent, newUrgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommittedType getCommitted() {
		return committed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommitted(CommittedType newCommitted, NotificationChain msgs) {
		CommittedType oldCommitted = committed;
		committed = newCommitted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__COMMITTED, oldCommitted, newCommitted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitted(CommittedType newCommitted) {
		if (newCommitted != committed) {
			NotificationChain msgs = null;
			if (committed != null)
				msgs = ((InternalEObject)committed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.LOCATION_TYPE__COMMITTED, null, msgs);
			if (newCommitted != null)
				msgs = ((InternalEObject)newCommitted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.LOCATION_TYPE__COMMITTED, null, msgs);
			msgs = basicSetCommitted(newCommitted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__COMMITTED, newCommitted, newCommitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Object newColor) {
		Object oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Object newX) {
		Object oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Object newY) {
		Object oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.LOCATION_TYPE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaalPackage.LOCATION_TYPE__NAME:
				return basicSetName(null, msgs);
			case UppaalPackage.LOCATION_TYPE__LABEL:
				return ((InternalEList)getLabel()).basicRemove(otherEnd, msgs);
			case UppaalPackage.LOCATION_TYPE__URGENT:
				return basicSetUrgent(null, msgs);
			case UppaalPackage.LOCATION_TYPE__COMMITTED:
				return basicSetCommitted(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UppaalPackage.LOCATION_TYPE__NAME:
				return getName();
			case UppaalPackage.LOCATION_TYPE__LABEL:
				return getLabel();
			case UppaalPackage.LOCATION_TYPE__URGENT:
				return getUrgent();
			case UppaalPackage.LOCATION_TYPE__COMMITTED:
				return getCommitted();
			case UppaalPackage.LOCATION_TYPE__COLOR:
				return getColor();
			case UppaalPackage.LOCATION_TYPE__ID:
				return getId();
			case UppaalPackage.LOCATION_TYPE__X:
				return getX();
			case UppaalPackage.LOCATION_TYPE__Y:
				return getY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UppaalPackage.LOCATION_TYPE__NAME:
				setName((NameType)newValue);
				return;
			case UppaalPackage.LOCATION_TYPE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection)newValue);
				return;
			case UppaalPackage.LOCATION_TYPE__URGENT:
				setUrgent((UrgentType)newValue);
				return;
			case UppaalPackage.LOCATION_TYPE__COMMITTED:
				setCommitted((CommittedType)newValue);
				return;
			case UppaalPackage.LOCATION_TYPE__COLOR:
				setColor(newValue);
				return;
			case UppaalPackage.LOCATION_TYPE__ID:
				setId((String)newValue);
				return;
			case UppaalPackage.LOCATION_TYPE__X:
				setX(newValue);
				return;
			case UppaalPackage.LOCATION_TYPE__Y:
				setY(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UppaalPackage.LOCATION_TYPE__NAME:
				setName((NameType)null);
				return;
			case UppaalPackage.LOCATION_TYPE__LABEL:
				getLabel().clear();
				return;
			case UppaalPackage.LOCATION_TYPE__URGENT:
				setUrgent((UrgentType)null);
				return;
			case UppaalPackage.LOCATION_TYPE__COMMITTED:
				setCommitted((CommittedType)null);
				return;
			case UppaalPackage.LOCATION_TYPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case UppaalPackage.LOCATION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case UppaalPackage.LOCATION_TYPE__X:
				setX(X_EDEFAULT);
				return;
			case UppaalPackage.LOCATION_TYPE__Y:
				setY(Y_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UppaalPackage.LOCATION_TYPE__NAME:
				return name != null;
			case UppaalPackage.LOCATION_TYPE__LABEL:
				return label != null && !label.isEmpty();
			case UppaalPackage.LOCATION_TYPE__URGENT:
				return urgent != null;
			case UppaalPackage.LOCATION_TYPE__COMMITTED:
				return committed != null;
			case UppaalPackage.LOCATION_TYPE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case UppaalPackage.LOCATION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UppaalPackage.LOCATION_TYPE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case UppaalPackage.LOCATION_TYPE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", id: ");
		result.append(id);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //LocationTypeImpl
