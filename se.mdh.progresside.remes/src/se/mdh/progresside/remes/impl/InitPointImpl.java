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

import org.eclipse.emf.ecore.util.EcoreUtil;
import se.mdh.progresside.remes.CompositeMode;
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
 *   <li>{@link se.mdh.progresside.remes.impl.InitPointImpl#getContainer <em>Container</em>}</li>
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
	public CompositeMode getContainer() {
		if (eContainerFeatureID() != RemesPackage.INIT_POINT__CONTAINER) return null;
		return (CompositeMode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(CompositeMode newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, RemesPackage.INIT_POINT__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(CompositeMode newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != RemesPackage.INIT_POINT__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, RemesPackage.COMPOSITE_MODE__INIT_POINT, CompositeMode.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.INIT_POINT__CONTAINER, newContainer, newContainer));
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
			case RemesPackage.INIT_POINT__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((CompositeMode)otherEnd, msgs);
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
			case RemesPackage.INIT_POINT__CONTAINER:
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
			case RemesPackage.INIT_POINT__CONTAINER:
				return eInternalContainer().eInverseRemove(this, RemesPackage.COMPOSITE_MODE__INIT_POINT, CompositeMode.class, msgs);
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
			case RemesPackage.INIT_POINT__INIT_EDGE:
				return getInitEdge();
			case RemesPackage.INIT_POINT__CONTAINER:
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
			case RemesPackage.INIT_POINT__INIT_EDGE:
				setInitEdge((InitEdge)newValue);
				return;
			case RemesPackage.INIT_POINT__CONTAINER:
				setContainer((CompositeMode)newValue);
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
			case RemesPackage.INIT_POINT__CONTAINER:
				setContainer((CompositeMode)null);
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
			case RemesPackage.INIT_POINT__CONTAINER:
				return getContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //InitPointImpl
