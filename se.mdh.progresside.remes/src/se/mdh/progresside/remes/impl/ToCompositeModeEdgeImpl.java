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

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.ToCompositeModeEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Composite Mode Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.ToCompositeModeEdgeImpl#getConnectTo <em>Connect To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ToCompositeModeEdgeImpl extends EObjectImpl implements ToCompositeModeEdge {
	/**
	 * The cached value of the '{@link #getConnectTo() <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTo()
	 * @generated
	 * @ordered
	 */
	protected CompositeMode connectTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToCompositeModeEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.TO_COMPOSITE_MODE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMode getConnectTo() {
		if (connectTo != null && connectTo.eIsProxy()) {
			InternalEObject oldConnectTo = (InternalEObject)connectTo;
			connectTo = (CompositeMode)eResolveProxy(oldConnectTo);
			if (connectTo != oldConnectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO, oldConnectTo, connectTo));
			}
		}
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMode basicGetConnectTo() {
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectTo(CompositeMode newConnectTo, NotificationChain msgs) {
		CompositeMode oldConnectTo = connectTo;
		connectTo = newConnectTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO, oldConnectTo, newConnectTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectTo(CompositeMode newConnectTo) {
		if (newConnectTo != connectTo) {
			NotificationChain msgs = null;
			if (connectTo != null)
				msgs = ((InternalEObject)connectTo).eInverseRemove(this, RemesPackage.COMPOSITE_MODE__EXIT_EDGES, CompositeMode.class, msgs);
			if (newConnectTo != null)
				msgs = ((InternalEObject)newConnectTo).eInverseAdd(this, RemesPackage.COMPOSITE_MODE__EXIT_EDGES, CompositeMode.class, msgs);
			msgs = basicSetConnectTo(newConnectTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO, newConnectTo, newConnectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO:
				if (connectTo != null)
					msgs = ((InternalEObject)connectTo).eInverseRemove(this, RemesPackage.COMPOSITE_MODE__EXIT_EDGES, CompositeMode.class, msgs);
				return basicSetConnectTo((CompositeMode)otherEnd, msgs);
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
			case RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO:
				if (resolve) return getConnectTo();
				return basicGetConnectTo();
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
			case RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO:
				setConnectTo((CompositeMode)newValue);
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
			case RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO:
				setConnectTo((CompositeMode)null);
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
			case RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO:
				return connectTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ToCompositeModeEdgeImpl
