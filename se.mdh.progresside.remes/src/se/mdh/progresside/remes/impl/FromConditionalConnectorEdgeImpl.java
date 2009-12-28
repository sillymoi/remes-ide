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

import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.FromConditionalConnectorEdge;
import se.mdh.progresside.remes.RemesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Conditional Connector Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.FromConditionalConnectorEdgeImpl#getConnectFrom <em>Connect From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FromConditionalConnectorEdgeImpl extends EObjectImpl implements FromConditionalConnectorEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromConditionalConnectorEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.FROM_CONDITIONAL_CONNECTOR_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalConnector getConnectFrom() {
		if (eContainerFeatureID() != RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM) return null;
		return (ConditionalConnector)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectFrom(ConditionalConnector newConnectFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnectFrom, RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectFrom(ConditionalConnector newConnectFrom) {
		if (newConnectFrom != eInternalContainer() || (eContainerFeatureID() != RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM && newConnectFrom != null)) {
			if (EcoreUtil.isAncestor(this, newConnectFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnectFrom != null)
				msgs = ((InternalEObject)newConnectFrom).eInverseAdd(this, RemesPackage.CONDITIONAL_CONNECTOR__EXIT_EDGES, ConditionalConnector.class, msgs);
			msgs = basicSetConnectFrom(newConnectFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM, newConnectFrom, newConnectFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnectFrom((ConditionalConnector)otherEnd, msgs);
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
			case RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM:
				return basicSetConnectFrom(null, msgs);
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
			case RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM:
				return eInternalContainer().eInverseRemove(this, RemesPackage.CONDITIONAL_CONNECTOR__EXIT_EDGES, ConditionalConnector.class, msgs);
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
			case RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM:
				return getConnectFrom();
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
			case RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM:
				setConnectFrom((ConditionalConnector)newValue);
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
			case RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM:
				setConnectFrom((ConditionalConnector)null);
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
			case RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM:
				return getConnectFrom() != null;
		}
		return super.eIsSet(featureID);
	}

} //FromConditionalConnectorEdgeImpl
