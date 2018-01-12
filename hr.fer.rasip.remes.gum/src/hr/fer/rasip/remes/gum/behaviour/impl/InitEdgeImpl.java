/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour.impl;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.CompositeMode;
import hr.fer.rasip.remes.gum.behaviour.InitEdge;
import hr.fer.rasip.remes.gum.behaviour.Mode;

import hr.fer.rasip.remes.gum.expressions.ActionRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.InitEdgeImpl#getConnectFrom <em>Connect From</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.InitEdgeImpl#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.InitEdgeImpl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitEdgeImpl extends EObjectImpl implements InitEdge {
	/**
	 * The cached value of the '{@link #getConnectTo() <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTo()
	 * @generated
	 * @ordered
	 */
	protected Mode connectTo;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected ActionRoot initialization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.INIT_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMode getConnectFrom() {
		if (eContainerFeatureID() != BehaviourPackage.INIT_EDGE__CONNECT_FROM) return null;
		return (CompositeMode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectFrom(CompositeMode newConnectFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnectFrom, BehaviourPackage.INIT_EDGE__CONNECT_FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectFrom(CompositeMode newConnectFrom) {
		if (newConnectFrom != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.INIT_EDGE__CONNECT_FROM && newConnectFrom != null)) {
			if (EcoreUtil.isAncestor(this, newConnectFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnectFrom != null)
				msgs = ((InternalEObject)newConnectFrom).eInverseAdd(this, BehaviourPackage.COMPOSITE_MODE__INIT_EDGE, CompositeMode.class, msgs);
			msgs = basicSetConnectFrom(newConnectFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.INIT_EDGE__CONNECT_FROM, newConnectFrom, newConnectFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getConnectTo() {
		if (connectTo != null && connectTo.eIsProxy()) {
			InternalEObject oldConnectTo = (InternalEObject)connectTo;
			connectTo = (Mode)eResolveProxy(oldConnectTo);
			if (connectTo != oldConnectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.INIT_EDGE__CONNECT_TO, oldConnectTo, connectTo));
			}
		}
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetConnectTo() {
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectTo(Mode newConnectTo) {
		Mode oldConnectTo = connectTo;
		connectTo = newConnectTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.INIT_EDGE__CONNECT_TO, oldConnectTo, connectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRoot getInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialization(ActionRoot newInitialization, NotificationChain msgs) {
		ActionRoot oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.INIT_EDGE__INITIALIZATION, oldInitialization, newInitialization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialization(ActionRoot newInitialization) {
		if (newInitialization != initialization) {
			NotificationChain msgs = null;
			if (initialization != null)
				msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.INIT_EDGE__INITIALIZATION, null, msgs);
			if (newInitialization != null)
				msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.INIT_EDGE__INITIALIZATION, null, msgs);
			msgs = basicSetInitialization(newInitialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.INIT_EDGE__INITIALIZATION, newInitialization, newInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.INIT_EDGE__CONNECT_FROM:
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
			case BehaviourPackage.INIT_EDGE__CONNECT_FROM:
				return basicSetConnectFrom(null, msgs);
			case BehaviourPackage.INIT_EDGE__INITIALIZATION:
				return basicSetInitialization(null, msgs);
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
			case BehaviourPackage.INIT_EDGE__CONNECT_FROM:
				return eInternalContainer().eInverseRemove(this, BehaviourPackage.COMPOSITE_MODE__INIT_EDGE, CompositeMode.class, msgs);
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
			case BehaviourPackage.INIT_EDGE__CONNECT_FROM:
				return getConnectFrom();
			case BehaviourPackage.INIT_EDGE__CONNECT_TO:
				if (resolve) return getConnectTo();
				return basicGetConnectTo();
			case BehaviourPackage.INIT_EDGE__INITIALIZATION:
				return getInitialization();
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
			case BehaviourPackage.INIT_EDGE__CONNECT_FROM:
				setConnectFrom((CompositeMode)newValue);
				return;
			case BehaviourPackage.INIT_EDGE__CONNECT_TO:
				setConnectTo((Mode)newValue);
				return;
			case BehaviourPackage.INIT_EDGE__INITIALIZATION:
				setInitialization((ActionRoot)newValue);
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
			case BehaviourPackage.INIT_EDGE__CONNECT_FROM:
				setConnectFrom((CompositeMode)null);
				return;
			case BehaviourPackage.INIT_EDGE__CONNECT_TO:
				setConnectTo((Mode)null);
				return;
			case BehaviourPackage.INIT_EDGE__INITIALIZATION:
				setInitialization((ActionRoot)null);
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
			case BehaviourPackage.INIT_EDGE__CONNECT_FROM:
				return getConnectFrom() != null;
			case BehaviourPackage.INIT_EDGE__CONNECT_TO:
				return connectTo != null;
			case BehaviourPackage.INIT_EDGE__INITIALIZATION:
				return initialization != null;
		}
		return super.eIsSet(featureID);
	}

} //InitEdgeImpl
