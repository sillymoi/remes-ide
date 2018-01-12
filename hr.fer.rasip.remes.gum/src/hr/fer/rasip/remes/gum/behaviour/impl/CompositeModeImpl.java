/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour.impl;

import hr.fer.rasip.remes.gum.behaviour.AtomicMode;
import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.CompositeMode;
import hr.fer.rasip.remes.gum.behaviour.InitEdge;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.CompositeModeImpl#getModes <em>Modes</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.CompositeModeImpl#getInitEdge <em>Init Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeModeImpl extends ModeImpl implements CompositeMode {
	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<AtomicMode> modes;

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
	protected CompositeModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.COMPOSITE_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtomicMode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentWithInverseEList<AtomicMode>(AtomicMode.class, this, BehaviourPackage.COMPOSITE_MODE__MODES, BehaviourPackage.ATOMIC_MODE__PARENT);
		}
		return modes;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.COMPOSITE_MODE__INIT_EDGE, oldInitEdge, newInitEdge);
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
				msgs = ((InternalEObject)initEdge).eInverseRemove(this, BehaviourPackage.INIT_EDGE__CONNECT_FROM, InitEdge.class, msgs);
			if (newInitEdge != null)
				msgs = ((InternalEObject)newInitEdge).eInverseAdd(this, BehaviourPackage.INIT_EDGE__CONNECT_FROM, InitEdge.class, msgs);
			msgs = basicSetInitEdge(newInitEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.COMPOSITE_MODE__INIT_EDGE, newInitEdge, newInitEdge));
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
			case BehaviourPackage.COMPOSITE_MODE__MODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModes()).basicAdd(otherEnd, msgs);
			case BehaviourPackage.COMPOSITE_MODE__INIT_EDGE:
				if (initEdge != null)
					msgs = ((InternalEObject)initEdge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.COMPOSITE_MODE__INIT_EDGE, null, msgs);
				return basicSetInitEdge((InitEdge)otherEnd, msgs);
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
			case BehaviourPackage.COMPOSITE_MODE__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.COMPOSITE_MODE__INIT_EDGE:
				return basicSetInitEdge(null, msgs);
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
			case BehaviourPackage.COMPOSITE_MODE__MODES:
				return getModes();
			case BehaviourPackage.COMPOSITE_MODE__INIT_EDGE:
				return getInitEdge();
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
			case BehaviourPackage.COMPOSITE_MODE__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends AtomicMode>)newValue);
				return;
			case BehaviourPackage.COMPOSITE_MODE__INIT_EDGE:
				setInitEdge((InitEdge)newValue);
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
			case BehaviourPackage.COMPOSITE_MODE__MODES:
				getModes().clear();
				return;
			case BehaviourPackage.COMPOSITE_MODE__INIT_EDGE:
				setInitEdge((InitEdge)null);
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
			case BehaviourPackage.COMPOSITE_MODE__MODES:
				return modes != null && !modes.isEmpty();
			case BehaviourPackage.COMPOSITE_MODE__INIT_EDGE:
				return initEdge != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeModeImpl
