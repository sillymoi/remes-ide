/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.simulator.traces.impl;

import hr.fer.rasip.remes.simulator.traces.TracesPackage;
import hr.fer.rasip.remes.simulator.traces.Value;
import hr.fer.rasip.remes.simulator.traces.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.impl.ValueImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.impl.ValueImpl#getClockMin <em>Clock Min</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.impl.ValueImpl#getClockMax <em>Clock Max</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.impl.ValueImpl#getValueMin <em>Value Min</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.simulator.traces.impl.ValueImpl#getValueMax <em>Value Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends EObjectImpl implements Value {
	/**
	 * The default value of the '{@link #getClockMin() <em>Clock Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockMin()
	 * @generated
	 * @ordered
	 */
	protected static final float CLOCK_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClockMin() <em>Clock Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockMin()
	 * @generated
	 * @ordered
	 */
	protected float clockMin = CLOCK_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getClockMax() <em>Clock Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockMax()
	 * @generated
	 * @ordered
	 */
	protected static final float CLOCK_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClockMax() <em>Clock Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockMax()
	 * @generated
	 * @ordered
	 */
	protected float clockMax = CLOCK_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueMin() <em>Value Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMin()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValueMin() <em>Value Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMin()
	 * @generated
	 * @ordered
	 */
	protected float valueMin = VALUE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueMax() <em>Value Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMax()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValueMax() <em>Value Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMax()
	 * @generated
	 * @ordered
	 */
	protected float valueMax = VALUE_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (eContainerFeatureID() != TracesPackage.VALUE__VARIABLE) return null;
		return (Variable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariable, TracesPackage.VALUE__VARIABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		if (newVariable != eInternalContainer() || (eContainerFeatureID() != TracesPackage.VALUE__VARIABLE && newVariable != null)) {
			if (EcoreUtil.isAncestor(this, newVariable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, TracesPackage.VARIABLE__VALUES, Variable.class, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracesPackage.VALUE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getClockMin() {
		return clockMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockMin(float newClockMin) {
		float oldClockMin = clockMin;
		clockMin = newClockMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracesPackage.VALUE__CLOCK_MIN, oldClockMin, clockMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getClockMax() {
		return clockMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockMax(float newClockMax) {
		float oldClockMax = clockMax;
		clockMax = newClockMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracesPackage.VALUE__CLOCK_MAX, oldClockMax, clockMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValueMin() {
		return valueMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMin(float newValueMin) {
		float oldValueMin = valueMin;
		valueMin = newValueMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracesPackage.VALUE__VALUE_MIN, oldValueMin, valueMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValueMax() {
		return valueMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMax(float newValueMax) {
		float oldValueMax = valueMax;
		valueMax = newValueMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracesPackage.VALUE__VALUE_MAX, oldValueMax, valueMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracesPackage.VALUE__VARIABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariable((Variable)otherEnd, msgs);
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
			case TracesPackage.VALUE__VARIABLE:
				return basicSetVariable(null, msgs);
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
			case TracesPackage.VALUE__VARIABLE:
				return eInternalContainer().eInverseRemove(this, TracesPackage.VARIABLE__VALUES, Variable.class, msgs);
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
			case TracesPackage.VALUE__VARIABLE:
				return getVariable();
			case TracesPackage.VALUE__CLOCK_MIN:
				return getClockMin();
			case TracesPackage.VALUE__CLOCK_MAX:
				return getClockMax();
			case TracesPackage.VALUE__VALUE_MIN:
				return getValueMin();
			case TracesPackage.VALUE__VALUE_MAX:
				return getValueMax();
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
			case TracesPackage.VALUE__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case TracesPackage.VALUE__CLOCK_MIN:
				setClockMin((Float)newValue);
				return;
			case TracesPackage.VALUE__CLOCK_MAX:
				setClockMax((Float)newValue);
				return;
			case TracesPackage.VALUE__VALUE_MIN:
				setValueMin((Float)newValue);
				return;
			case TracesPackage.VALUE__VALUE_MAX:
				setValueMax((Float)newValue);
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
			case TracesPackage.VALUE__VARIABLE:
				setVariable((Variable)null);
				return;
			case TracesPackage.VALUE__CLOCK_MIN:
				setClockMin(CLOCK_MIN_EDEFAULT);
				return;
			case TracesPackage.VALUE__CLOCK_MAX:
				setClockMax(CLOCK_MAX_EDEFAULT);
				return;
			case TracesPackage.VALUE__VALUE_MIN:
				setValueMin(VALUE_MIN_EDEFAULT);
				return;
			case TracesPackage.VALUE__VALUE_MAX:
				setValueMax(VALUE_MAX_EDEFAULT);
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
			case TracesPackage.VALUE__VARIABLE:
				return getVariable() != null;
			case TracesPackage.VALUE__CLOCK_MIN:
				return clockMin != CLOCK_MIN_EDEFAULT;
			case TracesPackage.VALUE__CLOCK_MAX:
				return clockMax != CLOCK_MAX_EDEFAULT;
			case TracesPackage.VALUE__VALUE_MIN:
				return valueMin != VALUE_MIN_EDEFAULT;
			case TracesPackage.VALUE__VALUE_MAX:
				return valueMax != VALUE_MAX_EDEFAULT;
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
		result.append(" (clockMin: ");
		result.append(clockMin);
		result.append(", clockMax: ");
		result.append(clockMax);
		result.append(", valueMin: ");
		result.append(valueMin);
		result.append(", valueMax: ");
		result.append(valueMax);
		result.append(')');
		return result.toString();
	}

} //ValueImpl
