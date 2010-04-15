/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaallite.impl;

import hr.fer.rasip.uppaallite.LocationType;
import hr.fer.rasip.uppaallite.TransitionType;
import hr.fer.rasip.uppaallite.UppaallitePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.TransitionTypeImpl#getSync <em>Sync</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.TransitionTypeImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.TransitionTypeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.TransitionTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.TransitionTypeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionTypeImpl extends EObjectImpl implements TransitionType {
	/**
	 * The default value of the '{@link #getSync() <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSync()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSync() <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSync()
	 * @generated
	 * @ordered
	 */
	protected String sync = SYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected String assignment = ASSIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected String guard = GUARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected LocationType source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected LocationType target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UppaallitePackage.Literals.TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSync() {
		return sync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSync(String newSync) {
		String oldSync = sync;
		sync = newSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.TRANSITION_TYPE__SYNC, oldSync, sync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignment() {
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignment(String newAssignment) {
		String oldAssignment = assignment;
		assignment = newAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.TRANSITION_TYPE__ASSIGNMENT, oldAssignment, assignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(String newGuard) {
		String oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.TRANSITION_TYPE__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (LocationType)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UppaallitePackage.TRANSITION_TYPE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(LocationType newSource) {
		LocationType oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.TRANSITION_TYPE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (LocationType)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UppaallitePackage.TRANSITION_TYPE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(LocationType newTarget) {
		LocationType oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.TRANSITION_TYPE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UppaallitePackage.TRANSITION_TYPE__SYNC:
				return getSync();
			case UppaallitePackage.TRANSITION_TYPE__ASSIGNMENT:
				return getAssignment();
			case UppaallitePackage.TRANSITION_TYPE__GUARD:
				return getGuard();
			case UppaallitePackage.TRANSITION_TYPE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UppaallitePackage.TRANSITION_TYPE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case UppaallitePackage.TRANSITION_TYPE__SYNC:
				setSync((String)newValue);
				return;
			case UppaallitePackage.TRANSITION_TYPE__ASSIGNMENT:
				setAssignment((String)newValue);
				return;
			case UppaallitePackage.TRANSITION_TYPE__GUARD:
				setGuard((String)newValue);
				return;
			case UppaallitePackage.TRANSITION_TYPE__SOURCE:
				setSource((LocationType)newValue);
				return;
			case UppaallitePackage.TRANSITION_TYPE__TARGET:
				setTarget((LocationType)newValue);
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
			case UppaallitePackage.TRANSITION_TYPE__SYNC:
				setSync(SYNC_EDEFAULT);
				return;
			case UppaallitePackage.TRANSITION_TYPE__ASSIGNMENT:
				setAssignment(ASSIGNMENT_EDEFAULT);
				return;
			case UppaallitePackage.TRANSITION_TYPE__GUARD:
				setGuard(GUARD_EDEFAULT);
				return;
			case UppaallitePackage.TRANSITION_TYPE__SOURCE:
				setSource((LocationType)null);
				return;
			case UppaallitePackage.TRANSITION_TYPE__TARGET:
				setTarget((LocationType)null);
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
			case UppaallitePackage.TRANSITION_TYPE__SYNC:
				return SYNC_EDEFAULT == null ? sync != null : !SYNC_EDEFAULT.equals(sync);
			case UppaallitePackage.TRANSITION_TYPE__ASSIGNMENT:
				return ASSIGNMENT_EDEFAULT == null ? assignment != null : !ASSIGNMENT_EDEFAULT.equals(assignment);
			case UppaallitePackage.TRANSITION_TYPE__GUARD:
				return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
			case UppaallitePackage.TRANSITION_TYPE__SOURCE:
				return source != null;
			case UppaallitePackage.TRANSITION_TYPE__TARGET:
				return target != null;
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
		result.append(" (sync: ");
		result.append(sync);
		result.append(", assignment: ");
		result.append(assignment);
		result.append(", guard: ");
		result.append(guard);
		result.append(')');
		return result.toString();
	}

} //TransitionTypeImpl
