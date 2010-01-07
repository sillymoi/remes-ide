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

import org.eclipse.emf.ecore.util.EcoreUtil;

import se.mdh.progresside.attributes.impl.AttributableImpl;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.ControlPath;
import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.RemesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl#getExitPoint <em>Exit Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ConditionalConnectorImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalConnectorImpl extends AttributableImpl implements ConditionalConnector {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT, oldEntryPoint, newEntryPoint);
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
				msgs = ((InternalEObject)entryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT, null, msgs);
			if (newEntryPoint != null)
				msgs = ((InternalEObject)newEntryPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT, null, msgs);
			msgs = basicSetEntryPoint(newEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT, newEntryPoint, newEntryPoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT, oldExitPoint, newExitPoint);
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
				msgs = ((InternalEObject)exitPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT, null, msgs);
			if (newExitPoint != null)
				msgs = ((InternalEObject)newExitPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT, null, msgs);
			msgs = basicSetExitPoint(newExitPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT, newExitPoint, newExitPoint));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT:
				return basicSetEntryPoint(null, msgs);
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT:
				return basicSetExitPoint(null, msgs);
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
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT:
				return getEntryPoint();
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT:
				return getExitPoint();
			case RemesPackage.CONDITIONAL_CONNECTOR__NAME:
				return getName();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT:
				setEntryPoint((EntryPoint)newValue);
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT:
				setExitPoint((ExitPoint)newValue);
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__NAME:
				setName((String)newValue);
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
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT:
				setEntryPoint((EntryPoint)null);
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT:
				setExitPoint((ExitPoint)null);
				return;
			case RemesPackage.CONDITIONAL_CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
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
			case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT:
				return entryPoint != null;
			case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT:
				return exitPoint != null;
			case RemesPackage.CONDITIONAL_CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ControlPath.class) {
			switch (derivedFeatureID) {
				case RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT: return RemesPackage.CONTROL_PATH__ENTRY_POINT;
				case RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT: return RemesPackage.CONTROL_PATH__EXIT_POINT;
				case RemesPackage.CONDITIONAL_CONNECTOR__NAME: return RemesPackage.CONTROL_PATH__NAME;
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
		if (baseClass == ControlPath.class) {
			switch (baseFeatureID) {
				case RemesPackage.CONTROL_PATH__ENTRY_POINT: return RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT;
				case RemesPackage.CONTROL_PATH__EXIT_POINT: return RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT;
				case RemesPackage.CONTROL_PATH__NAME: return RemesPackage.CONDITIONAL_CONNECTOR__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConditionalConnectorImpl
