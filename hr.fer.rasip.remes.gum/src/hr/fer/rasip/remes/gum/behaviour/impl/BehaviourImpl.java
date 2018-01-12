/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour.impl;

import hr.fer.rasip.remes.gum.behaviour.Behaviour;
import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.Mode;

import hr.fer.rasip.remes.gum.structure.Behaver;
import hr.fer.rasip.remes.gum.structure.StructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.BehaviourImpl#getBehavers <em>Behavers</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.BehaviourImpl#getModes <em>Modes</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.BehaviourImpl#getTopModes <em>Top Modes</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.BehaviourImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviourImpl extends ContextImpl implements Behaviour {
	/**
	 * The cached value of the '{@link #getBehavers() <em>Behavers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavers()
	 * @generated
	 * @ordered
	 */
	protected EList<Behaver> behavers;

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> modes;

	/**
	 * The cached value of the '{@link #getTopModes() <em>Top Modes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> topModes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaver> getBehavers() {
		if (behavers == null) {
			behavers = new EObjectWithInverseResolvingEList<Behaver>(Behaver.class, this, BehaviourPackage.BEHAVIOUR__BEHAVERS, StructurePackage.BEHAVER__BEHAVIOUR);
		}
		return behavers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentEList<Mode>(Mode.class, this, BehaviourPackage.BEHAVIOUR__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getTopModes() {
		if (topModes == null) {
			topModes = new EObjectResolvingEList<Mode>(Mode.class, this, BehaviourPackage.BEHAVIOUR__TOP_MODES);
		}
		return topModes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.BEHAVIOUR__NAME, oldName, name));
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
			case BehaviourPackage.BEHAVIOUR__BEHAVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehavers()).basicAdd(otherEnd, msgs);
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
			case BehaviourPackage.BEHAVIOUR__BEHAVERS:
				return ((InternalEList<?>)getBehavers()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.BEHAVIOUR__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.BEHAVIOUR__BEHAVERS:
				return getBehavers();
			case BehaviourPackage.BEHAVIOUR__MODES:
				return getModes();
			case BehaviourPackage.BEHAVIOUR__TOP_MODES:
				return getTopModes();
			case BehaviourPackage.BEHAVIOUR__NAME:
				return getName();
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
			case BehaviourPackage.BEHAVIOUR__BEHAVERS:
				getBehavers().clear();
				getBehavers().addAll((Collection<? extends Behaver>)newValue);
				return;
			case BehaviourPackage.BEHAVIOUR__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends Mode>)newValue);
				return;
			case BehaviourPackage.BEHAVIOUR__TOP_MODES:
				getTopModes().clear();
				getTopModes().addAll((Collection<? extends Mode>)newValue);
				return;
			case BehaviourPackage.BEHAVIOUR__NAME:
				setName((String)newValue);
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
			case BehaviourPackage.BEHAVIOUR__BEHAVERS:
				getBehavers().clear();
				return;
			case BehaviourPackage.BEHAVIOUR__MODES:
				getModes().clear();
				return;
			case BehaviourPackage.BEHAVIOUR__TOP_MODES:
				getTopModes().clear();
				return;
			case BehaviourPackage.BEHAVIOUR__NAME:
				setName(NAME_EDEFAULT);
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
			case BehaviourPackage.BEHAVIOUR__BEHAVERS:
				return behavers != null && !behavers.isEmpty();
			case BehaviourPackage.BEHAVIOUR__MODES:
				return modes != null && !modes.isEmpty();
			case BehaviourPackage.BEHAVIOUR__TOP_MODES:
				return topModes != null && !topModes.isEmpty();
			case BehaviourPackage.BEHAVIOUR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //BehaviourImpl
