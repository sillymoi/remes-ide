/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour.impl;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.Edge;
import hr.fer.rasip.remes.gum.behaviour.Mode;

import hr.fer.rasip.remes.gum.expressions.ActionRoot;
import hr.fer.rasip.remes.gum.expressions.LogicalRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.EdgeImpl#getConnectFrom <em>Connect From</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.EdgeImpl#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.EdgeImpl#getActionGuard <em>Action Guard</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.EdgeImpl#getActionBody <em>Action Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeImpl extends EObjectImpl implements Edge {
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
	 * The cached value of the '{@link #getActionGuard() <em>Action Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGuard()
	 * @generated
	 * @ordered
	 */
	protected LogicalRoot actionGuard;

	/**
	 * The cached value of the '{@link #getActionBody() <em>Action Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionBody()
	 * @generated
	 * @ordered
	 */
	protected ActionRoot actionBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getConnectFrom() {
		if (eContainerFeatureID() != BehaviourPackage.EDGE__CONNECT_FROM) return null;
		return (Mode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectFrom(Mode newConnectFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnectFrom, BehaviourPackage.EDGE__CONNECT_FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectFrom(Mode newConnectFrom) {
		if (newConnectFrom != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.EDGE__CONNECT_FROM && newConnectFrom != null)) {
			if (EcoreUtil.isAncestor(this, newConnectFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnectFrom != null)
				msgs = ((InternalEObject)newConnectFrom).eInverseAdd(this, BehaviourPackage.MODE__OUTGOING_EDGES, Mode.class, msgs);
			msgs = basicSetConnectFrom(newConnectFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.EDGE__CONNECT_FROM, newConnectFrom, newConnectFrom));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.EDGE__CONNECT_TO, oldConnectTo, connectTo));
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
	public NotificationChain basicSetConnectTo(Mode newConnectTo, NotificationChain msgs) {
		Mode oldConnectTo = connectTo;
		connectTo = newConnectTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.EDGE__CONNECT_TO, oldConnectTo, newConnectTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectTo(Mode newConnectTo) {
		if (newConnectTo != connectTo) {
			NotificationChain msgs = null;
			if (connectTo != null)
				msgs = ((InternalEObject)connectTo).eInverseRemove(this, BehaviourPackage.MODE__INCOMING_EDGES, Mode.class, msgs);
			if (newConnectTo != null)
				msgs = ((InternalEObject)newConnectTo).eInverseAdd(this, BehaviourPackage.MODE__INCOMING_EDGES, Mode.class, msgs);
			msgs = basicSetConnectTo(newConnectTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.EDGE__CONNECT_TO, newConnectTo, newConnectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalRoot getActionGuard() {
		return actionGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionGuard(LogicalRoot newActionGuard, NotificationChain msgs) {
		LogicalRoot oldActionGuard = actionGuard;
		actionGuard = newActionGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.EDGE__ACTION_GUARD, oldActionGuard, newActionGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionGuard(LogicalRoot newActionGuard) {
		if (newActionGuard != actionGuard) {
			NotificationChain msgs = null;
			if (actionGuard != null)
				msgs = ((InternalEObject)actionGuard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.EDGE__ACTION_GUARD, null, msgs);
			if (newActionGuard != null)
				msgs = ((InternalEObject)newActionGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.EDGE__ACTION_GUARD, null, msgs);
			msgs = basicSetActionGuard(newActionGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.EDGE__ACTION_GUARD, newActionGuard, newActionGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRoot getActionBody() {
		return actionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionBody(ActionRoot newActionBody, NotificationChain msgs) {
		ActionRoot oldActionBody = actionBody;
		actionBody = newActionBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.EDGE__ACTION_BODY, oldActionBody, newActionBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionBody(ActionRoot newActionBody) {
		if (newActionBody != actionBody) {
			NotificationChain msgs = null;
			if (actionBody != null)
				msgs = ((InternalEObject)actionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.EDGE__ACTION_BODY, null, msgs);
			if (newActionBody != null)
				msgs = ((InternalEObject)newActionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.EDGE__ACTION_BODY, null, msgs);
			msgs = basicSetActionBody(newActionBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.EDGE__ACTION_BODY, newActionBody, newActionBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.EDGE__CONNECT_FROM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnectFrom((Mode)otherEnd, msgs);
			case BehaviourPackage.EDGE__CONNECT_TO:
				if (connectTo != null)
					msgs = ((InternalEObject)connectTo).eInverseRemove(this, BehaviourPackage.MODE__INCOMING_EDGES, Mode.class, msgs);
				return basicSetConnectTo((Mode)otherEnd, msgs);
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
			case BehaviourPackage.EDGE__CONNECT_FROM:
				return basicSetConnectFrom(null, msgs);
			case BehaviourPackage.EDGE__CONNECT_TO:
				return basicSetConnectTo(null, msgs);
			case BehaviourPackage.EDGE__ACTION_GUARD:
				return basicSetActionGuard(null, msgs);
			case BehaviourPackage.EDGE__ACTION_BODY:
				return basicSetActionBody(null, msgs);
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
			case BehaviourPackage.EDGE__CONNECT_FROM:
				return eInternalContainer().eInverseRemove(this, BehaviourPackage.MODE__OUTGOING_EDGES, Mode.class, msgs);
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
			case BehaviourPackage.EDGE__CONNECT_FROM:
				return getConnectFrom();
			case BehaviourPackage.EDGE__CONNECT_TO:
				if (resolve) return getConnectTo();
				return basicGetConnectTo();
			case BehaviourPackage.EDGE__ACTION_GUARD:
				return getActionGuard();
			case BehaviourPackage.EDGE__ACTION_BODY:
				return getActionBody();
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
			case BehaviourPackage.EDGE__CONNECT_FROM:
				setConnectFrom((Mode)newValue);
				return;
			case BehaviourPackage.EDGE__CONNECT_TO:
				setConnectTo((Mode)newValue);
				return;
			case BehaviourPackage.EDGE__ACTION_GUARD:
				setActionGuard((LogicalRoot)newValue);
				return;
			case BehaviourPackage.EDGE__ACTION_BODY:
				setActionBody((ActionRoot)newValue);
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
			case BehaviourPackage.EDGE__CONNECT_FROM:
				setConnectFrom((Mode)null);
				return;
			case BehaviourPackage.EDGE__CONNECT_TO:
				setConnectTo((Mode)null);
				return;
			case BehaviourPackage.EDGE__ACTION_GUARD:
				setActionGuard((LogicalRoot)null);
				return;
			case BehaviourPackage.EDGE__ACTION_BODY:
				setActionBody((ActionRoot)null);
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
			case BehaviourPackage.EDGE__CONNECT_FROM:
				return getConnectFrom() != null;
			case BehaviourPackage.EDGE__CONNECT_TO:
				return connectTo != null;
			case BehaviourPackage.EDGE__ACTION_GUARD:
				return actionGuard != null;
			case BehaviourPackage.EDGE__ACTION_BODY:
				return actionBody != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeImpl
