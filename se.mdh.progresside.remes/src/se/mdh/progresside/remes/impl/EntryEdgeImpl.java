/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import hr.fer.rasip.remes.grammars.logical.tree.LogicalRoot;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.progresside.attributes.Attributable;
import se.mdh.progresside.attributes.Attribute;
import se.mdh.progresside.attributes.AttributeValue;
import se.mdh.progresside.attributes.AttributesPackage;

import se.mdh.progresside.attributes.framework.registry.AttributeId;

import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.EntryEdge;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.SubMode;
import se.mdh.progresside.remes.ToSubModeEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.EntryEdgeImpl#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.EntryEdgeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.EntryEdgeImpl#getActionGuard <em>Action Guard</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.EntryEdgeImpl#getActionBody <em>Action Body</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.EntryEdgeImpl#getParsedActionGuard <em>Parsed Action Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryEdgeImpl extends FromCompositeModeEdgeImpl implements EntryEdge {
	/**
	 * The cached value of the '{@link #getConnectTo() <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTo()
	 * @generated
	 * @ordered
	 */
	protected SubMode connectTo;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.ENTRY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubMode getConnectTo() {
		if (connectTo != null && connectTo.eIsProxy()) {
			InternalEObject oldConnectTo = (InternalEObject)connectTo;
			connectTo = (SubMode)eResolveProxy(oldConnectTo);
			if (connectTo != oldConnectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RemesPackage.ENTRY_EDGE__CONNECT_TO, oldConnectTo, connectTo));
			}
		}
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubMode basicGetConnectTo() {
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectTo(SubMode newConnectTo, NotificationChain msgs) {
		SubMode oldConnectTo = connectTo;
		connectTo = newConnectTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.ENTRY_EDGE__CONNECT_TO, oldConnectTo, newConnectTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectTo(SubMode newConnectTo) {
		if (newConnectTo != connectTo) {
			NotificationChain msgs = null;
			if (connectTo != null)
				msgs = ((InternalEObject)connectTo).eInverseRemove(this, RemesPackage.SUB_MODE__ENTRY_EDGES, SubMode.class, msgs);
			if (newConnectTo != null)
				msgs = ((InternalEObject)newConnectTo).eInverseAdd(this, RemesPackage.SUB_MODE__ENTRY_EDGES, SubMode.class, msgs);
			msgs = basicSetConnectTo(newConnectTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.ENTRY_EDGE__CONNECT_TO, newConnectTo, newConnectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RemesPackage.ENTRY_EDGE__ATTRIBUTES);
		}
		return attributes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.ENTRY_EDGE__ACTION_GUARD, oldActionGuard, actionGuard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.ENTRY_EDGE__ACTION_BODY, oldActionBody, actionBody));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD, oldParsedActionGuard, newParsedActionGuard);
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
				msgs = ((InternalEObject)parsedActionGuard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD, null, msgs);
			if (newParsedActionGuard != null)
				msgs = ((InternalEObject)newParsedActionGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD, null, msgs);
			msgs = basicSetParsedActionGuard(newParsedActionGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD, newParsedActionGuard, newParsedActionGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValue> getAttributeValues(AttributeId id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue createAttributeValue(AttributeId id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAttributeValue(AttributeId id, AttributeValue value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.ENTRY_EDGE__CONNECT_TO:
				if (connectTo != null)
					msgs = ((InternalEObject)connectTo).eInverseRemove(this, RemesPackage.SUB_MODE__ENTRY_EDGES, SubMode.class, msgs);
				return basicSetConnectTo((SubMode)otherEnd, msgs);
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
			case RemesPackage.ENTRY_EDGE__CONNECT_TO:
				return basicSetConnectTo(null, msgs);
			case RemesPackage.ENTRY_EDGE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD:
				return basicSetParsedActionGuard(null, msgs);
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
			case RemesPackage.ENTRY_EDGE__CONNECT_TO:
				if (resolve) return getConnectTo();
				return basicGetConnectTo();
			case RemesPackage.ENTRY_EDGE__ATTRIBUTES:
				return getAttributes();
			case RemesPackage.ENTRY_EDGE__ACTION_GUARD:
				return getActionGuard();
			case RemesPackage.ENTRY_EDGE__ACTION_BODY:
				return getActionBody();
			case RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD:
				return getParsedActionGuard();
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
			case RemesPackage.ENTRY_EDGE__CONNECT_TO:
				setConnectTo((SubMode)newValue);
				return;
			case RemesPackage.ENTRY_EDGE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case RemesPackage.ENTRY_EDGE__ACTION_GUARD:
				setActionGuard((String)newValue);
				return;
			case RemesPackage.ENTRY_EDGE__ACTION_BODY:
				setActionBody((String)newValue);
				return;
			case RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD:
				setParsedActionGuard((LogicalRoot)newValue);
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
			case RemesPackage.ENTRY_EDGE__CONNECT_TO:
				setConnectTo((SubMode)null);
				return;
			case RemesPackage.ENTRY_EDGE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case RemesPackage.ENTRY_EDGE__ACTION_GUARD:
				setActionGuard(ACTION_GUARD_EDEFAULT);
				return;
			case RemesPackage.ENTRY_EDGE__ACTION_BODY:
				setActionBody(ACTION_BODY_EDEFAULT);
				return;
			case RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD:
				setParsedActionGuard((LogicalRoot)null);
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
			case RemesPackage.ENTRY_EDGE__CONNECT_TO:
				return connectTo != null;
			case RemesPackage.ENTRY_EDGE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case RemesPackage.ENTRY_EDGE__ACTION_GUARD:
				return ACTION_GUARD_EDEFAULT == null ? actionGuard != null : !ACTION_GUARD_EDEFAULT.equals(actionGuard);
			case RemesPackage.ENTRY_EDGE__ACTION_BODY:
				return ACTION_BODY_EDEFAULT == null ? actionBody != null : !ACTION_BODY_EDEFAULT.equals(actionBody);
			case RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD:
				return parsedActionGuard != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ToSubModeEdge.class) {
			switch (derivedFeatureID) {
				case RemesPackage.ENTRY_EDGE__CONNECT_TO: return RemesPackage.TO_SUB_MODE_EDGE__CONNECT_TO;
				default: return -1;
			}
		}
		if (baseClass == Attributable.class) {
			switch (derivedFeatureID) {
				case RemesPackage.ENTRY_EDGE__ATTRIBUTES: return AttributesPackage.ATTRIBUTABLE__ATTRIBUTES;
				default: return -1;
			}
		}
		if (baseClass == Edge.class) {
			switch (derivedFeatureID) {
				case RemesPackage.ENTRY_EDGE__ACTION_GUARD: return RemesPackage.EDGE__ACTION_GUARD;
				case RemesPackage.ENTRY_EDGE__ACTION_BODY: return RemesPackage.EDGE__ACTION_BODY;
				case RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD: return RemesPackage.EDGE__PARSED_ACTION_GUARD;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ToSubModeEdge.class) {
			switch (baseFeatureID) {
				case RemesPackage.TO_SUB_MODE_EDGE__CONNECT_TO: return RemesPackage.ENTRY_EDGE__CONNECT_TO;
				default: return -1;
			}
		}
		if (baseClass == Attributable.class) {
			switch (baseFeatureID) {
				case AttributesPackage.ATTRIBUTABLE__ATTRIBUTES: return RemesPackage.ENTRY_EDGE__ATTRIBUTES;
				default: return -1;
			}
		}
		if (baseClass == Edge.class) {
			switch (baseFeatureID) {
				case RemesPackage.EDGE__ACTION_GUARD: return RemesPackage.ENTRY_EDGE__ACTION_GUARD;
				case RemesPackage.EDGE__ACTION_BODY: return RemesPackage.ENTRY_EDGE__ACTION_BODY;
				case RemesPackage.EDGE__PARSED_ACTION_GUARD: return RemesPackage.ENTRY_EDGE__PARSED_ACTION_GUARD;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //EntryEdgeImpl
