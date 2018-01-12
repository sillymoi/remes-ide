/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.profile.impl;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.ResourceTypes;
import hr.fer.rasip.remes.gum.behaviour.impl.ReferableImpl;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.impl.ResourceImpl#getReferences <em>References</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.impl.ResourceImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.profile.impl.ResourceImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends ReferableImpl implements Resource {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<hr.fer.rasip.remes.gum.behaviour.Resource> references;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceTypes TYPE_EDEFAULT = ResourceTypes.CPU;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResourceTypes type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<hr.fer.rasip.remes.gum.behaviour.Resource> getReferences() {
		if (references == null) {
			references = new EObjectWithInverseResolvingEList<hr.fer.rasip.remes.gum.behaviour.Resource>(hr.fer.rasip.remes.gum.behaviour.Resource.class, this, ProfilePackage.RESOURCE__REFERENCES, BehaviourPackage.RESOURCE__RESOLVED);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformProfile getPlatform() {
		if (eContainerFeatureID() != ProfilePackage.RESOURCE__PLATFORM) return null;
		return (PlatformProfile)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatform(PlatformProfile newPlatform, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlatform, ProfilePackage.RESOURCE__PLATFORM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatform(PlatformProfile newPlatform) {
		if (newPlatform != eInternalContainer() || (eContainerFeatureID() != ProfilePackage.RESOURCE__PLATFORM && newPlatform != null)) {
			if (EcoreUtil.isAncestor(this, newPlatform))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject)newPlatform).eInverseAdd(this, ProfilePackage.PLATFORM_PROFILE__RESOURCES, PlatformProfile.class, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.RESOURCE__PLATFORM, newPlatform, newPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ResourceTypes newType) {
		ResourceTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.RESOURCE__TYPE, oldType, type));
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
			case ProfilePackage.RESOURCE__REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferences()).basicAdd(otherEnd, msgs);
			case ProfilePackage.RESOURCE__PLATFORM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlatform((PlatformProfile)otherEnd, msgs);
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
			case ProfilePackage.RESOURCE__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case ProfilePackage.RESOURCE__PLATFORM:
				return basicSetPlatform(null, msgs);
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
			case ProfilePackage.RESOURCE__PLATFORM:
				return eInternalContainer().eInverseRemove(this, ProfilePackage.PLATFORM_PROFILE__RESOURCES, PlatformProfile.class, msgs);
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
			case ProfilePackage.RESOURCE__REFERENCES:
				return getReferences();
			case ProfilePackage.RESOURCE__PLATFORM:
				return getPlatform();
			case ProfilePackage.RESOURCE__TYPE:
				return getType();
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
			case ProfilePackage.RESOURCE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends hr.fer.rasip.remes.gum.behaviour.Resource>)newValue);
				return;
			case ProfilePackage.RESOURCE__PLATFORM:
				setPlatform((PlatformProfile)newValue);
				return;
			case ProfilePackage.RESOURCE__TYPE:
				setType((ResourceTypes)newValue);
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
			case ProfilePackage.RESOURCE__REFERENCES:
				getReferences().clear();
				return;
			case ProfilePackage.RESOURCE__PLATFORM:
				setPlatform((PlatformProfile)null);
				return;
			case ProfilePackage.RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ProfilePackage.RESOURCE__REFERENCES:
				return references != null && !references.isEmpty();
			case ProfilePackage.RESOURCE__PLATFORM:
				return getPlatform() != null;
			case ProfilePackage.RESOURCE__TYPE:
				return type != TYPE_EDEFAULT;
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

} //ResourceImpl
