/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaallite.impl;

import hr.fer.rasip.uppaallite.LocationType;
import hr.fer.rasip.uppaallite.TemplateType;
import hr.fer.rasip.uppaallite.UppaallitePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.LocationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.LocationTypeImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.LocationTypeImpl#isCommited <em>Commited</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.LocationTypeImpl#isInitial <em>Initial</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.LocationTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.LocationTypeImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.LocationTypeImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationTypeImpl extends EObjectImpl implements LocationType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUrgent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean URGENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUrgent()
	 * @generated
	 * @ordered
	 */
	protected boolean urgent = URGENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCommited() <em>Commited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMMITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCommited() <em>Commited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommited()
	 * @generated
	 * @ordered
	 */
	protected boolean commited = COMMITED_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean initial = INITIAL_EDEFAULT;

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
	 * The default value of the '{@link #getInvariant() <em>Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected String invariant = INVARIANT_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return UppaallitePackage.Literals.LOCATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.LOCATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUrgent() {
		return urgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrgent(boolean newUrgent) {
		boolean oldUrgent = urgent;
		urgent = newUrgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.LOCATION_TYPE__URGENT, oldUrgent, urgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommited() {
		return commited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommited(boolean newCommited) {
		boolean oldCommited = commited;
		commited = newCommited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.LOCATION_TYPE__COMMITED, oldCommited, commited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(boolean newInitial) {
		boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.LOCATION_TYPE__INITIAL, oldInitial, initial));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.LOCATION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvariant() {
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariant(String newInvariant) {
		String oldInvariant = invariant;
		invariant = newInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.LOCATION_TYPE__INVARIANT, oldInvariant, invariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateType getContainer() {
		if (eContainerFeatureID() != UppaallitePackage.LOCATION_TYPE__CONTAINER) return null;
		return (TemplateType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(TemplateType newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, UppaallitePackage.LOCATION_TYPE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(TemplateType newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != UppaallitePackage.LOCATION_TYPE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, UppaallitePackage.TEMPLATE_TYPE__LOCATION, TemplateType.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.LOCATION_TYPE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaallitePackage.LOCATION_TYPE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((TemplateType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaallitePackage.LOCATION_TYPE__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UppaallitePackage.LOCATION_TYPE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, UppaallitePackage.TEMPLATE_TYPE__LOCATION, TemplateType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UppaallitePackage.LOCATION_TYPE__NAME:
				return getName();
			case UppaallitePackage.LOCATION_TYPE__URGENT:
				return isUrgent();
			case UppaallitePackage.LOCATION_TYPE__COMMITED:
				return isCommited();
			case UppaallitePackage.LOCATION_TYPE__INITIAL:
				return isInitial();
			case UppaallitePackage.LOCATION_TYPE__ID:
				return getId();
			case UppaallitePackage.LOCATION_TYPE__INVARIANT:
				return getInvariant();
			case UppaallitePackage.LOCATION_TYPE__CONTAINER:
				return getContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UppaallitePackage.LOCATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case UppaallitePackage.LOCATION_TYPE__URGENT:
				setUrgent((Boolean)newValue);
				return;
			case UppaallitePackage.LOCATION_TYPE__COMMITED:
				setCommited((Boolean)newValue);
				return;
			case UppaallitePackage.LOCATION_TYPE__INITIAL:
				setInitial((Boolean)newValue);
				return;
			case UppaallitePackage.LOCATION_TYPE__ID:
				setId((String)newValue);
				return;
			case UppaallitePackage.LOCATION_TYPE__INVARIANT:
				setInvariant((String)newValue);
				return;
			case UppaallitePackage.LOCATION_TYPE__CONTAINER:
				setContainer((TemplateType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UppaallitePackage.LOCATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UppaallitePackage.LOCATION_TYPE__URGENT:
				setUrgent(URGENT_EDEFAULT);
				return;
			case UppaallitePackage.LOCATION_TYPE__COMMITED:
				setCommited(COMMITED_EDEFAULT);
				return;
			case UppaallitePackage.LOCATION_TYPE__INITIAL:
				setInitial(INITIAL_EDEFAULT);
				return;
			case UppaallitePackage.LOCATION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case UppaallitePackage.LOCATION_TYPE__INVARIANT:
				setInvariant(INVARIANT_EDEFAULT);
				return;
			case UppaallitePackage.LOCATION_TYPE__CONTAINER:
				setContainer((TemplateType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UppaallitePackage.LOCATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UppaallitePackage.LOCATION_TYPE__URGENT:
				return urgent != URGENT_EDEFAULT;
			case UppaallitePackage.LOCATION_TYPE__COMMITED:
				return commited != COMMITED_EDEFAULT;
			case UppaallitePackage.LOCATION_TYPE__INITIAL:
				return initial != INITIAL_EDEFAULT;
			case UppaallitePackage.LOCATION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UppaallitePackage.LOCATION_TYPE__INVARIANT:
				return INVARIANT_EDEFAULT == null ? invariant != null : !INVARIANT_EDEFAULT.equals(invariant);
			case UppaallitePackage.LOCATION_TYPE__CONTAINER:
				return getContainer() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", urgent: ");
		result.append(urgent);
		result.append(", commited: ");
		result.append(commited);
		result.append(", initial: ");
		result.append(initial);
		result.append(", id: ");
		result.append(id);
		result.append(", invariant: ");
		result.append(invariant);
		result.append(')');
		return result.toString();
	}

} //LocationTypeImpl
