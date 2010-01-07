/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import hr.fer.rasip.remes.grammars.logical.tree.LogicalRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import se.mdh.progresside.attributes.impl.AttributableImpl;

import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.RemesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.EdgeImpl#getActionGuard <em>Action Guard</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.EdgeImpl#getActionBody <em>Action Body</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.EdgeImpl#getParsedActionGuard <em>Parsed Action Guard</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.EdgeImpl#getConnectFrom <em>Connect From</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.EdgeImpl#getConnectTo <em>Connect To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeImpl extends AttributableImpl implements Edge {
	/**
	 * The default value of the '{@link #getActionGuard() <em>Action Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionGuard() <em>Action Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionGuard()
	 * @generated
	 * @ordered
	 */
	protected String actionGuard = ACTION_GUARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionBody() <em>Action Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionBody()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionBody() <em>Action Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionBody()
	 * @generated
	 * @ordered
	 */
	protected String actionBody = ACTION_BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParsedActionGuard() <em>Parsed Action Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsedActionGuard()
	 * @generated
	 * @ordered
	 */
	protected LogicalRoot parsedActionGuard;

	/**
	 * The cached value of the '{@link #getConnectTo() <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTo()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint connectTo;

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
		return RemesPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionGuard() {
		return actionGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionGuard(String newActionGuard) {
		String oldActionGuard = actionGuard;
		actionGuard = newActionGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.EDGE__ACTION_GUARD, oldActionGuard, actionGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionBody() {
		return actionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionBody(String newActionBody) {
		String oldActionBody = actionBody;
		actionBody = newActionBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.EDGE__ACTION_BODY, oldActionBody, actionBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalRoot getParsedActionGuard() {
		return parsedActionGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParsedActionGuard(LogicalRoot newParsedActionGuard, NotificationChain msgs) {
		LogicalRoot oldParsedActionGuard = parsedActionGuard;
		parsedActionGuard = newParsedActionGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.EDGE__PARSED_ACTION_GUARD, oldParsedActionGuard, newParsedActionGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsedActionGuard(LogicalRoot newParsedActionGuard) {
		if (newParsedActionGuard != parsedActionGuard) {
			NotificationChain msgs = null;
			if (parsedActionGuard != null)
				msgs = ((InternalEObject)parsedActionGuard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.EDGE__PARSED_ACTION_GUARD, null, msgs);
			if (newParsedActionGuard != null)
				msgs = ((InternalEObject)newParsedActionGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RemesPackage.EDGE__PARSED_ACTION_GUARD, null, msgs);
			msgs = basicSetParsedActionGuard(newParsedActionGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.EDGE__PARSED_ACTION_GUARD, newParsedActionGuard, newParsedActionGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint getConnectFrom() {
		if (eContainerFeatureID() != RemesPackage.EDGE__CONNECT_FROM) return null;
		return (ExitPoint)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectFrom(ExitPoint newConnectFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnectFrom, RemesPackage.EDGE__CONNECT_FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectFrom(ExitPoint newConnectFrom) {
		if (newConnectFrom != eInternalContainer() || (eContainerFeatureID() != RemesPackage.EDGE__CONNECT_FROM && newConnectFrom != null)) {
			if (EcoreUtil.isAncestor(this, newConnectFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnectFrom != null)
				msgs = ((InternalEObject)newConnectFrom).eInverseAdd(this, RemesPackage.EXIT_POINT__EXIT_EDGES, ExitPoint.class, msgs);
			msgs = basicSetConnectFrom(newConnectFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.EDGE__CONNECT_FROM, newConnectFrom, newConnectFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint getConnectTo() {
		if (connectTo != null && connectTo.eIsProxy()) {
			InternalEObject oldConnectTo = (InternalEObject)connectTo;
			connectTo = (EntryPoint)eResolveProxy(oldConnectTo);
			if (connectTo != oldConnectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RemesPackage.EDGE__CONNECT_TO, oldConnectTo, connectTo));
			}
		}
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint basicGetConnectTo() {
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectTo(EntryPoint newConnectTo, NotificationChain msgs) {
		EntryPoint oldConnectTo = connectTo;
		connectTo = newConnectTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.EDGE__CONNECT_TO, oldConnectTo, newConnectTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectTo(EntryPoint newConnectTo) {
		if (newConnectTo != connectTo) {
			NotificationChain msgs = null;
			if (connectTo != null)
				msgs = ((InternalEObject)connectTo).eInverseRemove(this, RemesPackage.ENTRY_POINT__ENTRY_EDGES, EntryPoint.class, msgs);
			if (newConnectTo != null)
				msgs = ((InternalEObject)newConnectTo).eInverseAdd(this, RemesPackage.ENTRY_POINT__ENTRY_EDGES, EntryPoint.class, msgs);
			msgs = basicSetConnectTo(newConnectTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.EDGE__CONNECT_TO, newConnectTo, newConnectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.EDGE__CONNECT_FROM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnectFrom((ExitPoint)otherEnd, msgs);
			case RemesPackage.EDGE__CONNECT_TO:
				if (connectTo != null)
					msgs = ((InternalEObject)connectTo).eInverseRemove(this, RemesPackage.ENTRY_POINT__ENTRY_EDGES, EntryPoint.class, msgs);
				return basicSetConnectTo((EntryPoint)otherEnd, msgs);
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
			case RemesPackage.EDGE__PARSED_ACTION_GUARD:
				return basicSetParsedActionGuard(null, msgs);
			case RemesPackage.EDGE__CONNECT_FROM:
				return basicSetConnectFrom(null, msgs);
			case RemesPackage.EDGE__CONNECT_TO:
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
			case RemesPackage.EDGE__CONNECT_FROM:
				return eInternalContainer().eInverseRemove(this, RemesPackage.EXIT_POINT__EXIT_EDGES, ExitPoint.class, msgs);
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
			case RemesPackage.EDGE__ACTION_GUARD:
				return getActionGuard();
			case RemesPackage.EDGE__ACTION_BODY:
				return getActionBody();
			case RemesPackage.EDGE__PARSED_ACTION_GUARD:
				return getParsedActionGuard();
			case RemesPackage.EDGE__CONNECT_FROM:
				return getConnectFrom();
			case RemesPackage.EDGE__CONNECT_TO:
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
			case RemesPackage.EDGE__ACTION_GUARD:
				setActionGuard((String)newValue);
				return;
			case RemesPackage.EDGE__ACTION_BODY:
				setActionBody((String)newValue);
				return;
			case RemesPackage.EDGE__PARSED_ACTION_GUARD:
				setParsedActionGuard((LogicalRoot)newValue);
				return;
			case RemesPackage.EDGE__CONNECT_FROM:
				setConnectFrom((ExitPoint)newValue);
				return;
			case RemesPackage.EDGE__CONNECT_TO:
				setConnectTo((EntryPoint)newValue);
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
			case RemesPackage.EDGE__ACTION_GUARD:
				setActionGuard(ACTION_GUARD_EDEFAULT);
				return;
			case RemesPackage.EDGE__ACTION_BODY:
				setActionBody(ACTION_BODY_EDEFAULT);
				return;
			case RemesPackage.EDGE__PARSED_ACTION_GUARD:
				setParsedActionGuard((LogicalRoot)null);
				return;
			case RemesPackage.EDGE__CONNECT_FROM:
				setConnectFrom((ExitPoint)null);
				return;
			case RemesPackage.EDGE__CONNECT_TO:
				setConnectTo((EntryPoint)null);
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
			case RemesPackage.EDGE__ACTION_GUARD:
				return ACTION_GUARD_EDEFAULT == null ? actionGuard != null : !ACTION_GUARD_EDEFAULT.equals(actionGuard);
			case RemesPackage.EDGE__ACTION_BODY:
				return ACTION_BODY_EDEFAULT == null ? actionBody != null : !ACTION_BODY_EDEFAULT.equals(actionBody);
			case RemesPackage.EDGE__PARSED_ACTION_GUARD:
				return parsedActionGuard != null;
			case RemesPackage.EDGE__CONNECT_FROM:
				return getConnectFrom() != null;
			case RemesPackage.EDGE__CONNECT_TO:
				return connectTo != null;
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
		result.append(" (actionGuard: ");
		result.append(actionGuard);
		result.append(", actionBody: ");
		result.append(actionBody);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
