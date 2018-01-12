/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour.impl;

import hr.fer.rasip.remes.gum.behaviour.Behaviour;
import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.Edge;
import hr.fer.rasip.remes.gum.behaviour.Mode;

import hr.fer.rasip.remes.gum.expressions.LogicalRoot;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ModeImpl#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ModeImpl#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ModeImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ModeImpl#getEnclosingBehaviour <em>Enclosing Behaviour</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ModeImpl#getInvariant <em>Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModeImpl extends ContextImpl implements Mode {
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
	 * The cached value of the '{@link #getIncomingEdges() <em>Incoming Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> incomingEdges;

	/**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outgoingEdges;

	/**
	 * The cached value of the '{@link #getEnclosingBehaviour() <em>Enclosing Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingBehaviour()
	 * @generated
	 * @ordered
	 */
	protected Behaviour enclosingBehaviour;

	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected LogicalRoot invariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.MODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getIncomingEdges() {
		if (incomingEdges == null) {
			incomingEdges = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, BehaviourPackage.MODE__INCOMING_EDGES, BehaviourPackage.EDGE__CONNECT_TO);
		}
		return incomingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getOutgoingEdges() {
		if (outgoingEdges == null) {
			outgoingEdges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, BehaviourPackage.MODE__OUTGOING_EDGES, BehaviourPackage.EDGE__CONNECT_FROM);
		}
		return outgoingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour getEnclosingBehaviour() {
		if (enclosingBehaviour != null && enclosingBehaviour.eIsProxy()) {
			InternalEObject oldEnclosingBehaviour = (InternalEObject)enclosingBehaviour;
			enclosingBehaviour = (Behaviour)eResolveProxy(oldEnclosingBehaviour);
			if (enclosingBehaviour != oldEnclosingBehaviour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.MODE__ENCLOSING_BEHAVIOUR, oldEnclosingBehaviour, enclosingBehaviour));
			}
		}
		return enclosingBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour basicGetEnclosingBehaviour() {
		return enclosingBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingBehaviour(Behaviour newEnclosingBehaviour) {
		Behaviour oldEnclosingBehaviour = enclosingBehaviour;
		enclosingBehaviour = newEnclosingBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MODE__ENCLOSING_BEHAVIOUR, oldEnclosingBehaviour, enclosingBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalRoot getInvariant() {
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvariant(LogicalRoot newInvariant, NotificationChain msgs) {
		LogicalRoot oldInvariant = invariant;
		invariant = newInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.MODE__INVARIANT, oldInvariant, newInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariant(LogicalRoot newInvariant) {
		if (newInvariant != invariant) {
			NotificationChain msgs = null;
			if (invariant != null)
				msgs = ((InternalEObject)invariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.MODE__INVARIANT, null, msgs);
			if (newInvariant != null)
				msgs = ((InternalEObject)newInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.MODE__INVARIANT, null, msgs);
			msgs = basicSetInvariant(newInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MODE__INVARIANT, newInvariant, newInvariant));
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
			case BehaviourPackage.MODE__INCOMING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingEdges()).basicAdd(otherEnd, msgs);
			case BehaviourPackage.MODE__OUTGOING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingEdges()).basicAdd(otherEnd, msgs);
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
			case BehaviourPackage.MODE__INCOMING_EDGES:
				return ((InternalEList<?>)getIncomingEdges()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.MODE__OUTGOING_EDGES:
				return ((InternalEList<?>)getOutgoingEdges()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.MODE__INVARIANT:
				return basicSetInvariant(null, msgs);
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
			case BehaviourPackage.MODE__NAME:
				return getName();
			case BehaviourPackage.MODE__INCOMING_EDGES:
				return getIncomingEdges();
			case BehaviourPackage.MODE__OUTGOING_EDGES:
				return getOutgoingEdges();
			case BehaviourPackage.MODE__ENCLOSING_BEHAVIOUR:
				if (resolve) return getEnclosingBehaviour();
				return basicGetEnclosingBehaviour();
			case BehaviourPackage.MODE__INVARIANT:
				return getInvariant();
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
			case BehaviourPackage.MODE__NAME:
				setName((String)newValue);
				return;
			case BehaviourPackage.MODE__INCOMING_EDGES:
				getIncomingEdges().clear();
				getIncomingEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case BehaviourPackage.MODE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				getOutgoingEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case BehaviourPackage.MODE__ENCLOSING_BEHAVIOUR:
				setEnclosingBehaviour((Behaviour)newValue);
				return;
			case BehaviourPackage.MODE__INVARIANT:
				setInvariant((LogicalRoot)newValue);
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
			case BehaviourPackage.MODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviourPackage.MODE__INCOMING_EDGES:
				getIncomingEdges().clear();
				return;
			case BehaviourPackage.MODE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				return;
			case BehaviourPackage.MODE__ENCLOSING_BEHAVIOUR:
				setEnclosingBehaviour((Behaviour)null);
				return;
			case BehaviourPackage.MODE__INVARIANT:
				setInvariant((LogicalRoot)null);
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
			case BehaviourPackage.MODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviourPackage.MODE__INCOMING_EDGES:
				return incomingEdges != null && !incomingEdges.isEmpty();
			case BehaviourPackage.MODE__OUTGOING_EDGES:
				return outgoingEdges != null && !outgoingEdges.isEmpty();
			case BehaviourPackage.MODE__ENCLOSING_BEHAVIOUR:
				return enclosingBehaviour != null;
			case BehaviourPackage.MODE__INVARIANT:
				return invariant != null;
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

} //ModeImpl
