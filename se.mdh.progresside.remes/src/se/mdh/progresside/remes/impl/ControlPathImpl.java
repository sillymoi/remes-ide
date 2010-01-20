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

import se.mdh.progresside.remes.ControlPath;
import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.RemesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.ControlPathImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ControlPathImpl#getExitPoint <em>Exit Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ControlPathImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ControlPathImpl extends EObjectImpl implements ControlPath {
	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint entryPoint;

	/**
	 * The cached value of the '{@link #getExitPoint() <em>Exit Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitPoint()
	 * @generated
	 * @ordered
	 */
	protected ExitPoint exitPoint;

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
	protected ControlPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.CONTROL_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint getEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryPoint(EntryPoint newEntryPoint, NotificationChain msgs) {
		EntryPoint oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.CONTROL_PATH__ENTRY_POINT, oldEntryPoint, newEntryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint(EntryPoint newEntryPoint) {
		if (newEntryPoint != entryPoint) {
			NotificationChain msgs = null;
			if (entryPoint != null)
				msgs = ((InternalEObject)entryPoint).eInverseRemove(this, RemesPackage.ENTRY_POINT__CONTAINER, EntryPoint.class, msgs);
			if (newEntryPoint != null)
				msgs = ((InternalEObject)newEntryPoint).eInverseAdd(this, RemesPackage.ENTRY_POINT__CONTAINER, EntryPoint.class, msgs);
			msgs = basicSetEntryPoint(newEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.CONTROL_PATH__ENTRY_POINT, newEntryPoint, newEntryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint getExitPoint() {
		return exitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitPoint(ExitPoint newExitPoint, NotificationChain msgs) {
		ExitPoint oldExitPoint = exitPoint;
		exitPoint = newExitPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.CONTROL_PATH__EXIT_POINT, oldExitPoint, newExitPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitPoint(ExitPoint newExitPoint) {
		if (newExitPoint != exitPoint) {
			NotificationChain msgs = null;
			if (exitPoint != null)
				msgs = ((InternalEObject)exitPoint).eInverseRemove(this, RemesPackage.EXIT_POINT__CONTAINER, ExitPoint.class, msgs);
			if (newExitPoint != null)
				msgs = ((InternalEObject)newExitPoint).eInverseAdd(this, RemesPackage.EXIT_POINT__CONTAINER, ExitPoint.class, msgs);
			msgs = basicSetExitPoint(newExitPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.CONTROL_PATH__EXIT_POINT, newExitPoint, newExitPoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.CONTROL_PATH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.CONTROL_PATH__ENTRY_POINT:
				if (entryPoint != null)
					msgs = ((InternalEObject)entryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.CONTROL_PATH__ENTRY_POINT, null, msgs);
				return basicSetEntryPoint((EntryPoint)otherEnd, msgs);
			case RemesPackage.CONTROL_PATH__EXIT_POINT:
				if (exitPoint != null)
					msgs = ((InternalEObject)exitPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.CONTROL_PATH__EXIT_POINT, null, msgs);
				return basicSetExitPoint((ExitPoint)otherEnd, msgs);
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
			case RemesPackage.CONTROL_PATH__ENTRY_POINT:
				return basicSetEntryPoint(null, msgs);
			case RemesPackage.CONTROL_PATH__EXIT_POINT:
				return basicSetExitPoint(null, msgs);
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
			case RemesPackage.CONTROL_PATH__ENTRY_POINT:
				return getEntryPoint();
			case RemesPackage.CONTROL_PATH__EXIT_POINT:
				return getExitPoint();
			case RemesPackage.CONTROL_PATH__NAME:
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
			case RemesPackage.CONTROL_PATH__ENTRY_POINT:
				setEntryPoint((EntryPoint)newValue);
				return;
			case RemesPackage.CONTROL_PATH__EXIT_POINT:
				setExitPoint((ExitPoint)newValue);
				return;
			case RemesPackage.CONTROL_PATH__NAME:
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
			case RemesPackage.CONTROL_PATH__ENTRY_POINT:
				setEntryPoint((EntryPoint)null);
				return;
			case RemesPackage.CONTROL_PATH__EXIT_POINT:
				setExitPoint((ExitPoint)null);
				return;
			case RemesPackage.CONTROL_PATH__NAME:
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
			case RemesPackage.CONTROL_PATH__ENTRY_POINT:
				return entryPoint != null;
			case RemesPackage.CONTROL_PATH__EXIT_POINT:
				return exitPoint != null;
			case RemesPackage.CONTROL_PATH__NAME:
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

} //ControlPathImpl
