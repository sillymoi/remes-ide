/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.progresside.attributes.impl.AttributableImpl;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.FromConditionalConnectorEdge;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.ToConditionalConnectorEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl#getEntryEdges <em>Entry Edges</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl#getExitEdges <em>Exit Edges</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalConnectorImpl extends AttributableImpl implements ConditionalConnector {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryEdges() <em>Entry Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ToConditionalConnectorEdge> entryEdges;

	/**
	 * The cached value of the '{@link #getExitEdges() <em>Exit Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<FromConditionalConnectorEdge> exitEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.CONDITIONAL_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.CONDITIONAL_CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToConditionalConnectorEdge> getEntryEdges() {
		if (entryEdges == null) {
			entryEdges = new EObjectWithInverseResolvingEList<ToConditionalConnectorEdge>(ToConditionalConnectorEdge.class, this, RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES, RemesPackage.TO_CONDITIONAL_CONNECTOR_EDGE__CONNECT_TO);
		}
		return entryEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FromConditionalConnectorEdge> getExitEdges() {
		if (exitEdges == null) {
			exitEdges = new EObjectContainmentWithInverseEList<FromConditionalConnectorEdge>(FromConditionalConnectorEdge.class, this, RemesPackage.CONDITIONAL_CONNECTOR__EXIT_EDGES, RemesPackage.FROM_CONDITIONAL_CONNECTOR_EDGE__CONNECT_FROM);
		}
		return exitEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMode getParent() {
		if (eContainerFeatureID() != RemesPackage.CONDITIONAL_CONNECTOR__PARENT) return null;
		return (CompositeMode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(CompositeMode newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, RemesPackage.CONDITIONAL_CONNECTOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CompositeMode newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != RemesPackage.CONDITIONAL_CONNECTOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS, CompositeMode.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.CONDITIONAL_CONNECTOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntryEdges()).basicAdd(otherEnd, msgs);
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExitEdges()).basicAdd(otherEnd, msgs);
			case RemesPackage.CONDITIONAL_CONNECTOR__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((CompositeMode)otherEnd, msgs);
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
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES:
				return ((InternalEList<?>)getEntryEdges()).basicRemove(otherEnd, msgs);
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_EDGES:
				return ((InternalEList<?>)getExitEdges()).basicRemove(otherEnd, msgs);
			case RemesPackage.CONDITIONAL_CONNECTOR__PARENT:
				return basicSetParent(null, msgs);
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
			case RemesPackage.CONDITIONAL_CONNECTOR__PARENT:
				return eInternalContainer().eInverseRemove(this, RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS, CompositeMode.class, msgs);
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
			case RemesPackage.CONDITIONAL_CONNECTOR__NAME:
				return getName();
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES:
				return getEntryEdges();
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_EDGES:
				return getExitEdges();
			case RemesPackage.CONDITIONAL_CONNECTOR__PARENT:
				return getParent();
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
			case RemesPackage.CONDITIONAL_CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES:
				getEntryEdges().clear();
				getEntryEdges().addAll((Collection<? extends ToConditionalConnectorEdge>)newValue);
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_EDGES:
				getExitEdges().clear();
				getExitEdges().addAll((Collection<? extends FromConditionalConnectorEdge>)newValue);
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__PARENT:
				setParent((CompositeMode)newValue);
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
			case RemesPackage.CONDITIONAL_CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES:
				getEntryEdges().clear();
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_EDGES:
				getExitEdges().clear();
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__PARENT:
				setParent((CompositeMode)null);
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
			case RemesPackage.CONDITIONAL_CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_EDGES:
				return entryEdges != null && !entryEdges.isEmpty();
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_EDGES:
				return exitEdges != null && !exitEdges.isEmpty();
			case RemesPackage.CONDITIONAL_CONNECTOR__PARENT:
				return getParent() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConditionalConnectorImpl
