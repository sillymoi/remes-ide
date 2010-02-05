/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.progresside.remes.Constant;
import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.Resource;
import se.mdh.progresside.remes.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.ModeImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ModeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ModeImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ModeImpl#getConstants <em>Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModeImpl extends ControlPathImpl implements Mode {
	/**
	 * The default value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected String initialization = INITIALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constants;

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
		return RemesPackage.Literals.MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialization(String newInitialization) {
		String oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.MODE__INITIALIZATION, oldInitialization, initialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, RemesPackage.MODE__VARIABLES, RemesPackage.VARIABLE__SCOPE);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, RemesPackage.MODE__RESOURCES, RemesPackage.RESOURCE__SCOPE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentWithInverseEList<Constant>(Constant.class, this, RemesPackage.MODE__CONSTANTS, RemesPackage.CONSTANT__SCOPE);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Checks the variables belonging to this Mode and returns the first one with the requested name.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Variable findVariableByName(String name) {
		if(name == null) return null;
		for(Variable var : this.getVariables()) {
			if(var.getName().equals(name))
				return var;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Checks the resources belonging to this Mode and returns the first one with the requested name.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Resource findResourceByName(String name) {
		if(name == null) return null;
		for(Resource res : this.getResources()) {
			if(res.getName().equals(name))
				return res;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Checks the constants belonging to this Mode and returns the first one with the requested name.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constant findConstantByName(String name) {
		if(name == null) return null;
		for(Constant cst : this.getConstants()) {
			if(cst.getName().equals(name))
				return cst;
		}
		return null;
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
			case RemesPackage.MODE__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
			case RemesPackage.MODE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case RemesPackage.MODE__CONSTANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstants()).basicAdd(otherEnd, msgs);
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
			case RemesPackage.MODE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case RemesPackage.MODE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case RemesPackage.MODE__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
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
			case RemesPackage.MODE__INITIALIZATION:
				return getInitialization();
			case RemesPackage.MODE__VARIABLES:
				return getVariables();
			case RemesPackage.MODE__RESOURCES:
				return getResources();
			case RemesPackage.MODE__CONSTANTS:
				return getConstants();
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
			case RemesPackage.MODE__INITIALIZATION:
				setInitialization((String)newValue);
				return;
			case RemesPackage.MODE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case RemesPackage.MODE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case RemesPackage.MODE__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
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
			case RemesPackage.MODE__INITIALIZATION:
				setInitialization(INITIALIZATION_EDEFAULT);
				return;
			case RemesPackage.MODE__VARIABLES:
				getVariables().clear();
				return;
			case RemesPackage.MODE__RESOURCES:
				getResources().clear();
				return;
			case RemesPackage.MODE__CONSTANTS:
				getConstants().clear();
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
			case RemesPackage.MODE__INITIALIZATION:
				return INITIALIZATION_EDEFAULT == null ? initialization != null : !INITIALIZATION_EDEFAULT.equals(initialization);
			case RemesPackage.MODE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case RemesPackage.MODE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case RemesPackage.MODE__CONSTANTS:
				return constants != null && !constants.isEmpty();
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
		result.append(" (initialization: ");
		result.append(initialization);
		result.append(')');
		return result.toString();
	}

} //ModeImpl
