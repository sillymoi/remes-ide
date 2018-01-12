/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure.impl;

import hr.fer.rasip.remes.gum.structure.Composite;
import hr.fer.rasip.remes.gum.structure.Connection;
import hr.fer.rasip.remes.gum.structure.Port;
import hr.fer.rasip.remes.gum.structure.StructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.ConnectionImpl#getConnectFrom <em>Connect From</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.ConnectionImpl#getConnectTo <em>Connect To</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.ConnectionImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends EObjectImpl implements Connection {
	/**
	 * The cached value of the '{@link #getConnectFrom() <em>Connect From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectFrom()
	 * @generated
	 * @ordered
	 */
	protected Port connectFrom;

	/**
	 * The cached value of the '{@link #getConnectTo() <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTo()
	 * @generated
	 * @ordered
	 */
	protected Port connectTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getConnectFrom() {
		if (connectFrom != null && connectFrom.eIsProxy()) {
			InternalEObject oldConnectFrom = (InternalEObject)connectFrom;
			connectFrom = (Port)eResolveProxy(oldConnectFrom);
			if (connectFrom != oldConnectFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONNECTION__CONNECT_FROM, oldConnectFrom, connectFrom));
			}
		}
		return connectFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetConnectFrom() {
		return connectFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectFrom(Port newConnectFrom) {
		Port oldConnectFrom = connectFrom;
		connectFrom = newConnectFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTION__CONNECT_FROM, oldConnectFrom, connectFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getConnectTo() {
		if (connectTo != null && connectTo.eIsProxy()) {
			InternalEObject oldConnectTo = (InternalEObject)connectTo;
			connectTo = (Port)eResolveProxy(oldConnectTo);
			if (connectTo != oldConnectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONNECTION__CONNECT_TO, oldConnectTo, connectTo));
			}
		}
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetConnectTo() {
		return connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectTo(Port newConnectTo) {
		Port oldConnectTo = connectTo;
		connectTo = newConnectTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTION__CONNECT_TO, oldConnectTo, connectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite getParent() {
		if (eContainerFeatureID() != StructurePackage.CONNECTION__PARENT) return null;
		return (Composite)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Composite newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StructurePackage.CONNECTION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Composite newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StructurePackage.CONNECTION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, StructurePackage.COMPOSITE__CONNECTIONS, Composite.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.CONNECTION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Composite)otherEnd, msgs);
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
			case StructurePackage.CONNECTION__PARENT:
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
			case StructurePackage.CONNECTION__PARENT:
				return eInternalContainer().eInverseRemove(this, StructurePackage.COMPOSITE__CONNECTIONS, Composite.class, msgs);
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
			case StructurePackage.CONNECTION__CONNECT_FROM:
				if (resolve) return getConnectFrom();
				return basicGetConnectFrom();
			case StructurePackage.CONNECTION__CONNECT_TO:
				if (resolve) return getConnectTo();
				return basicGetConnectTo();
			case StructurePackage.CONNECTION__PARENT:
				return getParent();
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
			case StructurePackage.CONNECTION__CONNECT_FROM:
				setConnectFrom((Port)newValue);
				return;
			case StructurePackage.CONNECTION__CONNECT_TO:
				setConnectTo((Port)newValue);
				return;
			case StructurePackage.CONNECTION__PARENT:
				setParent((Composite)newValue);
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
			case StructurePackage.CONNECTION__CONNECT_FROM:
				setConnectFrom((Port)null);
				return;
			case StructurePackage.CONNECTION__CONNECT_TO:
				setConnectTo((Port)null);
				return;
			case StructurePackage.CONNECTION__PARENT:
				setParent((Composite)null);
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
			case StructurePackage.CONNECTION__CONNECT_FROM:
				return connectFrom != null;
			case StructurePackage.CONNECTION__CONNECT_TO:
				return connectTo != null;
			case StructurePackage.CONNECTION__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
