/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.profile.impl;

import hr.fer.rasip.remes.gum.profile.ConstantValue;
import hr.fer.rasip.remes.gum.profile.PlatformProfile;
import hr.fer.rasip.remes.gum.profile.ProfilePackage;

import hr.fer.rasip.remes.gum.profile.Resource;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.impl.PlatformProfileImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.impl.PlatformProfileImpl#getConstantValues <em>Constant Values</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.impl.PlatformProfileImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformProfileImpl extends EObjectImpl implements PlatformProfile {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;
	/**
	 * The cached value of the '{@link #getConstantValues() <em>Constant Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstantValue> constantValues;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.PLATFORM_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, ProfilePackage.PLATFORM_PROFILE__RESOURCES, ProfilePackage.RESOURCE__PLATFORM);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstantValue> getConstantValues() {
		if (constantValues == null) {
			constantValues = new EObjectContainmentWithInverseEList<ConstantValue>(ConstantValue.class, this, ProfilePackage.PLATFORM_PROFILE__CONSTANT_VALUES, ProfilePackage.CONSTANT_VALUE__PLATFORM);
		}
		return constantValues;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PLATFORM_PROFILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case ProfilePackage.PLATFORM_PROFILE__CONSTANT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstantValues()).basicAdd(otherEnd, msgs);
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
			case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ProfilePackage.PLATFORM_PROFILE__CONSTANT_VALUES:
				return ((InternalEList<?>)getConstantValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
				return getResources();
			case ProfilePackage.PLATFORM_PROFILE__CONSTANT_VALUES:
				return getConstantValues();
			case ProfilePackage.PLATFORM_PROFILE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case ProfilePackage.PLATFORM_PROFILE__CONSTANT_VALUES:
				getConstantValues().clear();
				getConstantValues().addAll((Collection<? extends ConstantValue>)newValue);
				return;
			case ProfilePackage.PLATFORM_PROFILE__NAME:
				setName((String)newValue);
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
			case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
				getResources().clear();
				return;
			case ProfilePackage.PLATFORM_PROFILE__CONSTANT_VALUES:
				getConstantValues().clear();
				return;
			case ProfilePackage.PLATFORM_PROFILE__NAME:
				setName(NAME_EDEFAULT);
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
			case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ProfilePackage.PLATFORM_PROFILE__CONSTANT_VALUES:
				return constantValues != null && !constantValues.isEmpty();
			case ProfilePackage.PLATFORM_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //PlatformProfileImpl
