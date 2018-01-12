/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour.impl;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.Constant;
import hr.fer.rasip.remes.gum.behaviour.Context;
import hr.fer.rasip.remes.gum.behaviour.PrimitiveTypes;

import hr.fer.rasip.remes.gum.core.Data;

import hr.fer.rasip.remes.gum.profile.ConstantValue;
import hr.fer.rasip.remes.gum.profile.ProfilePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ConstantImpl#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ConstantImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ConstantImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ConstantImpl#getResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantImpl extends ReferableImpl implements Constant {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveTypes TYPE_EDEFAULT = PrimitiveTypes.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveTypes type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Data value;

	/**
	 * The cached value of the '{@link #getResolved() <em>Resolved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected ConstantValue resolved;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrimitiveTypes newType) {
		PrimitiveTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CONSTANT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getScope() {
		if (eContainerFeatureID() != BehaviourPackage.CONSTANT__SCOPE) return null;
		return (Context)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Context newScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScope, BehaviourPackage.CONSTANT__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Context newScope) {
		if (newScope != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.CONSTANT__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, BehaviourPackage.CONTEXT__CONSTANTS, Context.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CONSTANT__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Data newValue, NotificationChain msgs) {
		Data oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.CONSTANT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Data newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.CONSTANT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.CONSTANT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CONSTANT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantValue getResolved() {
		if (resolved != null && resolved.eIsProxy()) {
			InternalEObject oldResolved = (InternalEObject)resolved;
			resolved = (ConstantValue)eResolveProxy(oldResolved);
			if (resolved != oldResolved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.CONSTANT__RESOLVED, oldResolved, resolved));
			}
		}
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantValue basicGetResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolved(ConstantValue newResolved, NotificationChain msgs) {
		ConstantValue oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.CONSTANT__RESOLVED, oldResolved, newResolved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(ConstantValue newResolved) {
		if (newResolved != resolved) {
			NotificationChain msgs = null;
			if (resolved != null)
				msgs = ((InternalEObject)resolved).eInverseRemove(this, ProfilePackage.CONSTANT_VALUE__DEFINITION, ConstantValue.class, msgs);
			if (newResolved != null)
				msgs = ((InternalEObject)newResolved).eInverseAdd(this, ProfilePackage.CONSTANT_VALUE__DEFINITION, ConstantValue.class, msgs);
			msgs = basicSetResolved(newResolved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CONSTANT__RESOLVED, newResolved, newResolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.CONSTANT__SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScope((Context)otherEnd, msgs);
			case BehaviourPackage.CONSTANT__RESOLVED:
				if (resolved != null)
					msgs = ((InternalEObject)resolved).eInverseRemove(this, ProfilePackage.CONSTANT_VALUE__DEFINITION, ConstantValue.class, msgs);
				return basicSetResolved((ConstantValue)otherEnd, msgs);
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
			case BehaviourPackage.CONSTANT__SCOPE:
				return basicSetScope(null, msgs);
			case BehaviourPackage.CONSTANT__VALUE:
				return basicSetValue(null, msgs);
			case BehaviourPackage.CONSTANT__RESOLVED:
				return basicSetResolved(null, msgs);
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
			case BehaviourPackage.CONSTANT__SCOPE:
				return eInternalContainer().eInverseRemove(this, BehaviourPackage.CONTEXT__CONSTANTS, Context.class, msgs);
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
			case BehaviourPackage.CONSTANT__TYPE:
				return getType();
			case BehaviourPackage.CONSTANT__SCOPE:
				return getScope();
			case BehaviourPackage.CONSTANT__VALUE:
				return getValue();
			case BehaviourPackage.CONSTANT__RESOLVED:
				if (resolve) return getResolved();
				return basicGetResolved();
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
			case BehaviourPackage.CONSTANT__TYPE:
				setType((PrimitiveTypes)newValue);
				return;
			case BehaviourPackage.CONSTANT__SCOPE:
				setScope((Context)newValue);
				return;
			case BehaviourPackage.CONSTANT__VALUE:
				setValue((Data)newValue);
				return;
			case BehaviourPackage.CONSTANT__RESOLVED:
				setResolved((ConstantValue)newValue);
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
			case BehaviourPackage.CONSTANT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BehaviourPackage.CONSTANT__SCOPE:
				setScope((Context)null);
				return;
			case BehaviourPackage.CONSTANT__VALUE:
				setValue((Data)null);
				return;
			case BehaviourPackage.CONSTANT__RESOLVED:
				setResolved((ConstantValue)null);
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
			case BehaviourPackage.CONSTANT__TYPE:
				return type != TYPE_EDEFAULT;
			case BehaviourPackage.CONSTANT__SCOPE:
				return getScope() != null;
			case BehaviourPackage.CONSTANT__VALUE:
				return value != null;
			case BehaviourPackage.CONSTANT__RESOLVED:
				return resolved != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ConstantImpl
