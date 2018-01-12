/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.simulator.impl;

import hr.fer.rasip.remes.gum.behaviour.Referable;
import hr.fer.rasip.remes.gum.simulator.Sensor;
import hr.fer.rasip.remes.gum.simulator.SensorTrigger;
import hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration;
import hr.fer.rasip.remes.gum.simulator.SimulatorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.impl.SensorImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.impl.SensorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.impl.SensorImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends EObjectImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Referable source;
	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final SensorTrigger TRIGGER_EDEFAULT = SensorTrigger.VALUE_CHANGE;
	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected SensorTrigger trigger = TRIGGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulatorPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatorConfiguration getConfiguration() {
		if (eContainerFeatureID() != SimulatorPackage.SENSOR__CONFIGURATION) return null;
		return (SimulatorConfiguration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(SimulatorConfiguration newConfiguration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConfiguration, SimulatorPackage.SENSOR__CONFIGURATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(SimulatorConfiguration newConfiguration) {
		if (newConfiguration != eInternalContainer() || (eContainerFeatureID() != SimulatorPackage.SENSOR__CONFIGURATION && newConfiguration != null)) {
			if (EcoreUtil.isAncestor(this, newConfiguration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, SimulatorPackage.SIMULATOR_CONFIGURATION__SENSORS, SimulatorConfiguration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.SENSOR__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referable getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Referable)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulatorPackage.SENSOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referable basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Referable newSource) {
		Referable oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.SENSOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorTrigger getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(SensorTrigger newTrigger) {
		SensorTrigger oldTrigger = trigger;
		trigger = newTrigger == null ? TRIGGER_EDEFAULT : newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.SENSOR__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulatorPackage.SENSOR__CONFIGURATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConfiguration((SimulatorConfiguration)otherEnd, msgs);
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
			case SimulatorPackage.SENSOR__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
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
			case SimulatorPackage.SENSOR__CONFIGURATION:
				return eInternalContainer().eInverseRemove(this, SimulatorPackage.SIMULATOR_CONFIGURATION__SENSORS, SimulatorConfiguration.class, msgs);
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
			case SimulatorPackage.SENSOR__CONFIGURATION:
				return getConfiguration();
			case SimulatorPackage.SENSOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SimulatorPackage.SENSOR__TRIGGER:
				return getTrigger();
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
			case SimulatorPackage.SENSOR__CONFIGURATION:
				setConfiguration((SimulatorConfiguration)newValue);
				return;
			case SimulatorPackage.SENSOR__SOURCE:
				setSource((Referable)newValue);
				return;
			case SimulatorPackage.SENSOR__TRIGGER:
				setTrigger((SensorTrigger)newValue);
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
			case SimulatorPackage.SENSOR__CONFIGURATION:
				setConfiguration((SimulatorConfiguration)null);
				return;
			case SimulatorPackage.SENSOR__SOURCE:
				setSource((Referable)null);
				return;
			case SimulatorPackage.SENSOR__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
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
			case SimulatorPackage.SENSOR__CONFIGURATION:
				return getConfiguration() != null;
			case SimulatorPackage.SENSOR__SOURCE:
				return source != null;
			case SimulatorPackage.SENSOR__TRIGGER:
				return trigger != TRIGGER_EDEFAULT;
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
		result.append(" (trigger: ");
		result.append(trigger);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
