/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.FromCompositeModeEdge;
import se.mdh.progresside.remes.RemesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Composite Mode Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.FromCompositeModeEdgeImpl#getConnectFrom <em>Connect From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FromCompositeModeEdgeImpl extends EObjectImpl implements FromCompositeModeEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromCompositeModeEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.FROM_COMPOSITE_MODE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMode getConnectFrom() {
		if (eContainerFeatureID() != RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM) return null;
		return (CompositeMode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectFrom(CompositeMode newConnectFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnectFrom, RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectFrom(CompositeMode newConnectFrom) {
		if (newConnectFrom != eInternalContainer() || (eContainerFeatureID() != RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM && newConnectFrom != null)) {
			if (EcoreUtil.isAncestor(this, newConnectFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnectFrom != null)
				msgs = ((InternalEObject)newConnectFrom).eInverseAdd(this, RemesPackage.COMPOSITE_MODE__ENTRY_EDGE, CompositeMode.class, msgs);
			msgs = basicSetConnectFrom(newConnectFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM, newConnectFrom, newConnectFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnectFrom((CompositeMode)otherEnd, msgs);
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
			case RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM:
				return basicSetConnectFrom(null, msgs);
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
			case RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM:
				return eInternalContainer().eInverseRemove(this, RemesPackage.COMPOSITE_MODE__ENTRY_EDGE, CompositeMode.class, msgs);
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
			case RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM:
				return getConnectFrom();
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
			case RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM:
				setConnectFrom((CompositeMode)newValue);
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
			case RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM:
				setConnectFrom((CompositeMode)null);
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
			case RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM:
				return getConnectFrom() != null;
		}
		return super.eIsSet(featureID);
	}

} //FromCompositeModeEdgeImpl
