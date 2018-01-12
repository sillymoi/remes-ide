/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour.impl;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.Context;
import hr.fer.rasip.remes.gum.behaviour.Resource;
import hr.fer.rasip.remes.gum.behaviour.ResourceTypes;

import hr.fer.rasip.remes.gum.expressions.ResourceRoot;

import hr.fer.rasip.remes.gum.profile.ProfilePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ResourceImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ResourceImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ResourceImpl#getResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends ReferableImpl implements Resource {
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
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected ResourceRoot expression;

	/**
	 * The cached value of the '{@link #getResolved() <em>Resolved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected hr.fer.rasip.remes.gum.profile.Resource resolved;

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
		return BehaviourPackage.Literals.RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RESOURCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getScope() {
		if (eContainerFeatureID() != BehaviourPackage.RESOURCE__SCOPE) return null;
		return (Context)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Context newScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScope, BehaviourPackage.RESOURCE__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Context newScope) {
		if (newScope != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.RESOURCE__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, BehaviourPackage.CONTEXT__RESOURCES, Context.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RESOURCE__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRoot getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ResourceRoot newExpression, NotificationChain msgs) {
		ResourceRoot oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.RESOURCE__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ResourceRoot newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.RESOURCE__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.RESOURCE__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RESOURCE__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hr.fer.rasip.remes.gum.profile.Resource getResolved() {
		if (resolved != null && resolved.eIsProxy()) {
			InternalEObject oldResolved = (InternalEObject)resolved;
			resolved = (hr.fer.rasip.remes.gum.profile.Resource)eResolveProxy(oldResolved);
			if (resolved != oldResolved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.RESOURCE__RESOLVED, oldResolved, resolved));
			}
		}
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hr.fer.rasip.remes.gum.profile.Resource basicGetResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolved(hr.fer.rasip.remes.gum.profile.Resource newResolved, NotificationChain msgs) {
		hr.fer.rasip.remes.gum.profile.Resource oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.RESOURCE__RESOLVED, oldResolved, newResolved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(hr.fer.rasip.remes.gum.profile.Resource newResolved) {
		if (newResolved != resolved) {
			NotificationChain msgs = null;
			if (resolved != null)
				msgs = ((InternalEObject)resolved).eInverseRemove(this, ProfilePackage.RESOURCE__REFERENCES, hr.fer.rasip.remes.gum.profile.Resource.class, msgs);
			if (newResolved != null)
				msgs = ((InternalEObject)newResolved).eInverseAdd(this, ProfilePackage.RESOURCE__REFERENCES, hr.fer.rasip.remes.gum.profile.Resource.class, msgs);
			msgs = basicSetResolved(newResolved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RESOURCE__RESOLVED, newResolved, newResolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.RESOURCE__SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScope((Context)otherEnd, msgs);
			case BehaviourPackage.RESOURCE__RESOLVED:
				if (resolved != null)
					msgs = ((InternalEObject)resolved).eInverseRemove(this, ProfilePackage.RESOURCE__REFERENCES, hr.fer.rasip.remes.gum.profile.Resource.class, msgs);
				return basicSetResolved((hr.fer.rasip.remes.gum.profile.Resource)otherEnd, msgs);
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
			case BehaviourPackage.RESOURCE__SCOPE:
				return basicSetScope(null, msgs);
			case BehaviourPackage.RESOURCE__EXPRESSION:
				return basicSetExpression(null, msgs);
			case BehaviourPackage.RESOURCE__RESOLVED:
				return basicSetResolved(null, msgs);
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
			case BehaviourPackage.RESOURCE__SCOPE:
				return eInternalContainer().eInverseRemove(this, BehaviourPackage.CONTEXT__RESOURCES, Context.class, msgs);
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
			case BehaviourPackage.RESOURCE__TYPE:
				return getType();
			case BehaviourPackage.RESOURCE__SCOPE:
				return getScope();
			case BehaviourPackage.RESOURCE__EXPRESSION:
				return getExpression();
			case BehaviourPackage.RESOURCE__RESOLVED:
				if (resolve) return getResolved();
				return basicGetResolved();
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
			case BehaviourPackage.RESOURCE__TYPE:
				setType((ResourceTypes)newValue);
				return;
			case BehaviourPackage.RESOURCE__SCOPE:
				setScope((Context)newValue);
				return;
			case BehaviourPackage.RESOURCE__EXPRESSION:
				setExpression((ResourceRoot)newValue);
				return;
			case BehaviourPackage.RESOURCE__RESOLVED:
				setResolved((hr.fer.rasip.remes.gum.profile.Resource)newValue);
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
			case BehaviourPackage.RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BehaviourPackage.RESOURCE__SCOPE:
				setScope((Context)null);
				return;
			case BehaviourPackage.RESOURCE__EXPRESSION:
				setExpression((ResourceRoot)null);
				return;
			case BehaviourPackage.RESOURCE__RESOLVED:
				setResolved((hr.fer.rasip.remes.gum.profile.Resource)null);
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
			case BehaviourPackage.RESOURCE__TYPE:
				return type != TYPE_EDEFAULT;
			case BehaviourPackage.RESOURCE__SCOPE:
				return getScope() != null;
			case BehaviourPackage.RESOURCE__EXPRESSION:
				return expression != null;
			case BehaviourPackage.RESOURCE__RESOLVED:
				return resolved != null;
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
