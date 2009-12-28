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

import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.EntryConditionalTopInitEdge;
import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.ToConditionalConnectorEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Conditional Top Init Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.EntryConditionalTopInitEdgeImpl#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.EntryConditionalTopInitEdgeImpl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryConditionalTopInitEdgeImpl extends FromCompositeModeInitEdgeImpl implements EntryConditionalTopInitEdge {
	/**
	 * The cached value of the '{@link #getConnectTo() <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTo()
	 * @generated
	 * @ordered
	 */
	protected ConditionalConnector connectTo;

	/**
	 * The default value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected String initialization = INITIALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryConditionalTopInitEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.ENTRY_CONDITIONAL_TOP_INIT_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalConnector getConnectTo() {
		if (connectTo != null && connectTo.eIsProxy()) {
			InternalEObject oldConnectTo = (InternalEObject)connectTo;
			connectTo = (ConditionalConnector)eResolveProxy(oldConnectTo);
			if (connectTo != oldConnectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO, oldConnectTo, connectTo));
			}
		}
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalConnector basicGetConnectTo() {
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectTo(ConditionalConnector newConnectTo, NotificationChain msgs) {
		ConditionalConnector oldConnectTo = connectTo;
		connectTo = newConnectTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO, oldConnectTo, newConnectTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectTo(ConditionalConnector newConnectTo) {
		if (newConnectTo != connectTo) {
			NotificationChain msgs = null;
			if (connectTo != null)
				msgs = ((InternalEObject)connectTo).eInverseRemove(this, RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES, ConditionalConnector.class, msgs);
			if (newConnectTo != null)
				msgs = ((InternalEObject)newConnectTo).eInverseAdd(this, RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES, ConditionalConnector.class, msgs);
			msgs = basicSetConnectTo(newConnectTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO, newConnectTo, newConnectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialization(String newInitialization) {
		String oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__INITIALIZATION, oldInitialization, initialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO:
				if (connectTo != null)
					msgs = ((InternalEObject)connectTo).eInverseRemove(this, RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES, ConditionalConnector.class, msgs);
				return basicSetConnectTo((ConditionalConnector)otherEnd, msgs);
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
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO:
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
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO:
				if (resolve) return getConnectTo();
				return basicGetConnectTo();
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__INITIALIZATION:
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
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO:
				setConnectTo((ConditionalConnector)newValue);
				return;
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__INITIALIZATION:
				setInitialization((String)newValue);
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
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO:
				setConnectTo((ConditionalConnector)null);
				return;
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__INITIALIZATION:
				setInitialization(INITIALIZATION_EDEFAULT);
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
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO:
				return connectTo != null;
			case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__INITIALIZATION:
				return INITIALIZATION_EDEFAULT == null ? initialization != null : !INITIALIZATION_EDEFAULT.equals(initialization);
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
		if (baseClass == ToConditionalConnectorEdge.class) {
			switch (derivedFeatureID) {
				case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO: return RemesPackage.TO_CONDITIONAL_CONNECTOR_EDGE__CONNECT_TO;
				default: return -1;
			}
		}
		if (baseClass == InitEdge.class) {
			switch (derivedFeatureID) {
				case RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__INITIALIZATION: return RemesPackage.INIT_EDGE__INITIALIZATION;
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
		if (baseClass == ToConditionalConnectorEdge.class) {
			switch (baseFeatureID) {
				case RemesPackage.TO_CONDITIONAL_CONNECTOR_EDGE__CONNECT_TO: return RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__CONNECT_TO;
				default: return -1;
			}
		}
		if (baseClass == InitEdge.class) {
			switch (baseFeatureID) {
				case RemesPackage.INIT_EDGE__INITIALIZATION: return RemesPackage.ENTRY_CONDITIONAL_TOP_INIT_EDGE__INITIALIZATION;
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
		result.append(" (initialization: ");
		result.append(initialization);
		result.append(')');
		return result.toString();
	}

} //EntryConditionalTopInitEdgeImpl
