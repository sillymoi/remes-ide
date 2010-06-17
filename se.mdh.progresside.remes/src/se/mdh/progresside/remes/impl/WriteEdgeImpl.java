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

import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.WriteEdge;
import se.mdh.progresside.remes.WritePoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.WriteEdgeImpl#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.WriteEdgeImpl#getConnectFrom <em>Connect From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WriteEdgeImpl extends EObjectImpl implements WriteEdge {
	/**
	 * The cached value of the '{@link #getConnectFrom() <em>Connect From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectFrom()
	 * @generated
	 * @ordered
	 */
	protected ExitPoint connectFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.WRITE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritePoint getConnectTo() {
		if (eContainerFeatureID() != RemesPackage.WRITE_EDGE__CONNECT_TO) return null;
		return (WritePoint)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectTo(WritePoint newConnectTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnectTo, RemesPackage.WRITE_EDGE__CONNECT_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectTo(WritePoint newConnectTo) {
		if (newConnectTo != eInternalContainer() || (eContainerFeatureID() != RemesPackage.WRITE_EDGE__CONNECT_TO && newConnectTo != null)) {
			if (EcoreUtil.isAncestor(this, newConnectTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnectTo != null)
				msgs = ((InternalEObject)newConnectTo).eInverseAdd(this, RemesPackage.WRITE_POINT__WRITE_EDGES, WritePoint.class, msgs);
			msgs = basicSetConnectTo(newConnectTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.WRITE_EDGE__CONNECT_TO, newConnectTo, newConnectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint getConnectFrom() {
		if (connectFrom != null && connectFrom.eIsProxy()) {
			InternalEObject oldConnectFrom = (InternalEObject)connectFrom;
			connectFrom = (ExitPoint)eResolveProxy(oldConnectFrom);
			if (connectFrom != oldConnectFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RemesPackage.WRITE_EDGE__CONNECT_FROM, oldConnectFrom, connectFrom));
			}
		}
		return connectFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint basicGetConnectFrom() {
		return connectFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectFrom(ExitPoint newConnectFrom) {
		ExitPoint oldConnectFrom = connectFrom;
		connectFrom = newConnectFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.WRITE_EDGE__CONNECT_FROM, oldConnectFrom, connectFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.WRITE_EDGE__CONNECT_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnectTo((WritePoint)otherEnd, msgs);
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
			case RemesPackage.WRITE_EDGE__CONNECT_TO:
				return basicSetConnectTo(null, msgs);
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
			case RemesPackage.WRITE_EDGE__CONNECT_TO:
				return eInternalContainer().eInverseRemove(this, RemesPackage.WRITE_POINT__WRITE_EDGES, WritePoint.class, msgs);
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
			case RemesPackage.WRITE_EDGE__CONNECT_TO:
				return getConnectTo();
			case RemesPackage.WRITE_EDGE__CONNECT_FROM:
				if (resolve) return getConnectFrom();
				return basicGetConnectFrom();
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
			case RemesPackage.WRITE_EDGE__CONNECT_TO:
				setConnectTo((WritePoint)newValue);
				return;
			case RemesPackage.WRITE_EDGE__CONNECT_FROM:
				setConnectFrom((ExitPoint)newValue);
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
			case RemesPackage.WRITE_EDGE__CONNECT_TO:
				setConnectTo((WritePoint)null);
				return;
			case RemesPackage.WRITE_EDGE__CONNECT_FROM:
				setConnectFrom((ExitPoint)null);
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
			case RemesPackage.WRITE_EDGE__CONNECT_TO:
				return getConnectTo() != null;
			case RemesPackage.WRITE_EDGE__CONNECT_FROM:
				return connectFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //WriteEdgeImpl
