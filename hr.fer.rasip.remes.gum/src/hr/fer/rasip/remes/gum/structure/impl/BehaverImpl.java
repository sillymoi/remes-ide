/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure.impl;

import hr.fer.rasip.remes.gum.behaviour.Behaviour;
import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;

import hr.fer.rasip.remes.gum.structure.Behaver;
import hr.fer.rasip.remes.gum.structure.StructurePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.BehaverImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.BehaverImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaverImpl extends EObjectImpl implements Behaver {
	/**
	 * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected Behaviour behaviour;

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
	protected BehaverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.BEHAVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour getBehaviour() {
		if (behaviour != null && behaviour.eIsProxy()) {
			InternalEObject oldBehaviour = (InternalEObject)behaviour;
			behaviour = (Behaviour)eResolveProxy(oldBehaviour);
			if (behaviour != oldBehaviour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.BEHAVER__BEHAVIOUR, oldBehaviour, behaviour));
			}
		}
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour basicGetBehaviour() {
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviour(Behaviour newBehaviour, NotificationChain msgs) {
		Behaviour oldBehaviour = behaviour;
		behaviour = newBehaviour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.BEHAVER__BEHAVIOUR, oldBehaviour, newBehaviour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviour(Behaviour newBehaviour) {
		if (newBehaviour != behaviour) {
			NotificationChain msgs = null;
			if (behaviour != null)
				msgs = ((InternalEObject)behaviour).eInverseRemove(this, BehaviourPackage.BEHAVIOUR__BEHAVERS, Behaviour.class, msgs);
			if (newBehaviour != null)
				msgs = ((InternalEObject)newBehaviour).eInverseAdd(this, BehaviourPackage.BEHAVIOUR__BEHAVERS, Behaviour.class, msgs);
			msgs = basicSetBehaviour(newBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.BEHAVER__BEHAVIOUR, newBehaviour, newBehaviour));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.BEHAVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.BEHAVER__BEHAVIOUR:
				if (behaviour != null)
					msgs = ((InternalEObject)behaviour).eInverseRemove(this, BehaviourPackage.BEHAVIOUR__BEHAVERS, Behaviour.class, msgs);
				return basicSetBehaviour((Behaviour)otherEnd, msgs);
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
			case StructurePackage.BEHAVER__BEHAVIOUR:
				return basicSetBehaviour(null, msgs);
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
			case StructurePackage.BEHAVER__BEHAVIOUR:
				if (resolve) return getBehaviour();
				return basicGetBehaviour();
			case StructurePackage.BEHAVER__NAME:
				return getName();
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
			case StructurePackage.BEHAVER__BEHAVIOUR:
				setBehaviour((Behaviour)newValue);
				return;
			case StructurePackage.BEHAVER__NAME:
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
			case StructurePackage.BEHAVER__BEHAVIOUR:
				setBehaviour((Behaviour)null);
				return;
			case StructurePackage.BEHAVER__NAME:
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
			case StructurePackage.BEHAVER__BEHAVIOUR:
				return behaviour != null;
			case StructurePackage.BEHAVER__NAME:
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

} //BehaverImpl
