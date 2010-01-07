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

import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.RemesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.InitPointImpl#getInitEdge <em>Init Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitPointImpl extends PointImpl implements InitPoint {
	/**
	 * The cached value of the '{@link #getInitEdge() <em>Init Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitEdge()
	 * @generated
	 * @ordered
	 */
	protected InitEdge initEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.INIT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitEdge getInitEdge() {
		return initEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitEdge(InitEdge newInitEdge, NotificationChain msgs) {
		InitEdge oldInitEdge = initEdge;
		initEdge = newInitEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.INIT_POINT__INIT_EDGE, oldInitEdge, newInitEdge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitEdge(InitEdge newInitEdge) {
		if (newInitEdge != initEdge) {
			NotificationChain msgs = null;
			if (initEdge != null)
				msgs = ((InternalEObject)initEdge).eInverseRemove(this, RemesPackage.INIT_EDGE__CONNECT_FROM, InitEdge.class, msgs);
			if (newInitEdge != null)
				msgs = ((InternalEObject)newInitEdge).eInverseAdd(this, RemesPackage.INIT_EDGE__CONNECT_FROM, InitEdge.class, msgs);
			msgs = basicSetInitEdge(newInitEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.INIT_POINT__INIT_EDGE, newInitEdge, newInitEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.INIT_POINT__INIT_EDGE:
				if (initEdge != null)
					msgs = ((InternalEObject)initEdge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.INIT_POINT__INIT_EDGE, null, msgs);
				return basicSetInitEdge((InitEdge)otherEnd, msgs);
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
			case RemesPackage.INIT_POINT__INIT_EDGE:
				return basicSetInitEdge(null, msgs);
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
			case RemesPackage.INIT_POINT__INIT_EDGE:
				return getInitEdge();
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
			case RemesPackage.INIT_POINT__INIT_EDGE:
				setInitEdge((InitEdge)newValue);
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
			case RemesPackage.INIT_POINT__INIT_EDGE:
				setInitEdge((InitEdge)null);
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
			case RemesPackage.INIT_POINT__INIT_EDGE:
				return initEdge != null;
		}
		return super.eIsSet(featureID);
	}

} //InitPointImpl
