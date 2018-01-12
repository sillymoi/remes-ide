/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.simulator.impl;

import hr.fer.rasip.remes.gum.profile.PlatformProfile;
import hr.fer.rasip.remes.gum.simulator.Sensor;
import hr.fer.rasip.remes.gum.simulator.SimulatorConfiguration;
import hr.fer.rasip.remes.gum.simulator.SimulatorPackage;

import hr.fer.rasip.remes.gum.structure.StructureElement;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.impl.SimulatorConfigurationImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.impl.SimulatorConfigurationImpl#getSystem <em>System</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.simulator.impl.SimulatorConfigurationImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulatorConfigurationImpl extends EObjectImpl implements SimulatorConfiguration {
	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected StructureElement system;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected PlatformProfile profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulatorConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulatorPackage.Literals.SIMULATOR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentWithInverseEList<Sensor>(Sensor.class, this, SimulatorPackage.SIMULATOR_CONFIGURATION__SENSORS, SimulatorPackage.SENSOR__CONFIGURATION);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElement getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (StructureElement)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulatorPackage.SIMULATOR_CONFIGURATION__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElement basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(StructureElement newSystem) {
		StructureElement oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.SIMULATOR_CONFIGURATION__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformProfile getProfile() {
		if (profile != null && profile.eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject)profile;
			profile = (PlatformProfile)eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulatorPackage.SIMULATOR_CONFIGURATION__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformProfile basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(PlatformProfile newProfile) {
		PlatformProfile oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulatorPackage.SIMULATOR_CONFIGURATION__PROFILE, oldProfile, profile));
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
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SENSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensors()).basicAdd(otherEnd, msgs);
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
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
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
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SENSORS:
				return getSensors();
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case SimulatorPackage.SIMULATOR_CONFIGURATION__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
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
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SYSTEM:
				setSystem((StructureElement)newValue);
				return;
			case SimulatorPackage.SIMULATOR_CONFIGURATION__PROFILE:
				setProfile((PlatformProfile)newValue);
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
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SENSORS:
				getSensors().clear();
				return;
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SYSTEM:
				setSystem((StructureElement)null);
				return;
			case SimulatorPackage.SIMULATOR_CONFIGURATION__PROFILE:
				setProfile((PlatformProfile)null);
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
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case SimulatorPackage.SIMULATOR_CONFIGURATION__SYSTEM:
				return system != null;
			case SimulatorPackage.SIMULATOR_CONFIGURATION__PROFILE:
				return profile != null;
		}
		return super.eIsSet(featureID);
	}

} //SimulatorConfigurationImpl
