/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.profile.impl;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.Constant;
import hr.fer.rasip.remes.gum.core.Data;
import hr.fer.rasip.remes.gum.profile.ConstantValue;
import hr.fer.rasip.remes.gum.profile.PlatformProfile;
import hr.fer.rasip.remes.gum.profile.ProfilePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.impl.ConstantValueImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.impl.ConstantValueImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.impl.ConstantValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantValueImpl extends EObjectImpl implements ConstantValue {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Constant definition;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.CONSTANT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformProfile getPlatform() {
		if (eContainerFeatureID() != ProfilePackage.CONSTANT_VALUE__PLATFORM) return null;
		return (PlatformProfile)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatform(PlatformProfile newPlatform, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlatform, ProfilePackage.CONSTANT_VALUE__PLATFORM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatform(PlatformProfile newPlatform) {
		if (newPlatform != eInternalContainer() || (eContainerFeatureID() != ProfilePackage.CONSTANT_VALUE__PLATFORM && newPlatform != null)) {
			if (EcoreUtil.isAncestor(this, newPlatform))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject)newPlatform).eInverseAdd(this, ProfilePackage.PLATFORM_PROFILE__CONSTANT_VALUES, PlatformProfile.class, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTANT_VALUE__PLATFORM, newPlatform, newPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (Constant)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.CONSTANT_VALUE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Constant newDefinition, NotificationChain msgs) {
		Constant oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTANT_VALUE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Constant newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, BehaviourPackage.CONSTANT__RESOLVED, Constant.class, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, BehaviourPackage.CONSTANT__RESOLVED, Constant.class, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTANT_VALUE__DEFINITION, newDefinition, newDefinition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTANT_VALUE__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilePackage.CONSTANT_VALUE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilePackage.CONSTANT_VALUE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTANT_VALUE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilePackage.CONSTANT_VALUE__PLATFORM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlatform((PlatformProfile)otherEnd, msgs);
			case ProfilePackage.CONSTANT_VALUE__DEFINITION:
				if (definition != null)
					msgs = ((InternalEObject)definition).eInverseRemove(this, BehaviourPackage.CONSTANT__RESOLVED, Constant.class, msgs);
				return basicSetDefinition((Constant)otherEnd, msgs);
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
			case ProfilePackage.CONSTANT_VALUE__PLATFORM:
				return basicSetPlatform(null, msgs);
			case ProfilePackage.CONSTANT_VALUE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case ProfilePackage.CONSTANT_VALUE__VALUE:
				return basicSetValue(null, msgs);
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
			case ProfilePackage.CONSTANT_VALUE__PLATFORM:
				return eInternalContainer().eInverseRemove(this, ProfilePackage.PLATFORM_PROFILE__CONSTANT_VALUES, PlatformProfile.class, msgs);
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
			case ProfilePackage.CONSTANT_VALUE__PLATFORM:
				return getPlatform();
			case ProfilePackage.CONSTANT_VALUE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ProfilePackage.CONSTANT_VALUE__VALUE:
				return getValue();
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
			case ProfilePackage.CONSTANT_VALUE__PLATFORM:
				setPlatform((PlatformProfile)newValue);
				return;
			case ProfilePackage.CONSTANT_VALUE__DEFINITION:
				setDefinition((Constant)newValue);
				return;
			case ProfilePackage.CONSTANT_VALUE__VALUE:
				setValue((Data)newValue);
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
			case ProfilePackage.CONSTANT_VALUE__PLATFORM:
				setPlatform((PlatformProfile)null);
				return;
			case ProfilePackage.CONSTANT_VALUE__DEFINITION:
				setDefinition((Constant)null);
				return;
			case ProfilePackage.CONSTANT_VALUE__VALUE:
				setValue((Data)null);
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
			case ProfilePackage.CONSTANT_VALUE__PLATFORM:
				return getPlatform() != null;
			case ProfilePackage.CONSTANT_VALUE__DEFINITION:
				return definition != null;
			case ProfilePackage.CONSTANT_VALUE__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstantValueImpl
