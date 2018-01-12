/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.behaviour.impl;

import hr.fer.rasip.remes.gum.behaviour.BehaviourPackage;
import hr.fer.rasip.remes.gum.behaviour.Constant;
import hr.fer.rasip.remes.gum.behaviour.Context;
import hr.fer.rasip.remes.gum.behaviour.Renaming;
import hr.fer.rasip.remes.gum.behaviour.Resource;
import hr.fer.rasip.remes.gum.behaviour.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ContextImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ContextImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ContextImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.behaviour.impl.ContextImpl#getRenamings <em>Renamings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContextImpl extends EObjectImpl implements Context {
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
	 * The cached value of the '{@link #getRenamings() <em>Renamings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenamings()
	 * @generated
	 * @ordered
	 */
	protected EList<Renaming> renamings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, BehaviourPackage.CONTEXT__VARIABLES, BehaviourPackage.VARIABLE__SCOPE);
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
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, BehaviourPackage.CONTEXT__RESOURCES, BehaviourPackage.RESOURCE__SCOPE);
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
			constants = new EObjectContainmentWithInverseEList<Constant>(Constant.class, this, BehaviourPackage.CONTEXT__CONSTANTS, BehaviourPackage.CONSTANT__SCOPE);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Renaming> getRenamings() {
		if (renamings == null) {
			renamings = new EObjectContainmentWithInverseEList<Renaming>(Renaming.class, this, BehaviourPackage.CONTEXT__RENAMINGS, BehaviourPackage.RENAMING__CONTEXT);
		}
		return renamings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getReadableVariables() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getWritableVariables() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case BehaviourPackage.CONTEXT__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
			case BehaviourPackage.CONTEXT__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case BehaviourPackage.CONTEXT__CONSTANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstants()).basicAdd(otherEnd, msgs);
			case BehaviourPackage.CONTEXT__RENAMINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRenamings()).basicAdd(otherEnd, msgs);
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
			case BehaviourPackage.CONTEXT__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.CONTEXT__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.CONTEXT__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.CONTEXT__RENAMINGS:
				return ((InternalEList<?>)getRenamings()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.CONTEXT__VARIABLES:
				return getVariables();
			case BehaviourPackage.CONTEXT__RESOURCES:
				return getResources();
			case BehaviourPackage.CONTEXT__CONSTANTS:
				return getConstants();
			case BehaviourPackage.CONTEXT__RENAMINGS:
				return getRenamings();
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
			case BehaviourPackage.CONTEXT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case BehaviourPackage.CONTEXT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case BehaviourPackage.CONTEXT__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
				return;
			case BehaviourPackage.CONTEXT__RENAMINGS:
				getRenamings().clear();
				getRenamings().addAll((Collection<? extends Renaming>)newValue);
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
			case BehaviourPackage.CONTEXT__VARIABLES:
				getVariables().clear();
				return;
			case BehaviourPackage.CONTEXT__RESOURCES:
				getResources().clear();
				return;
			case BehaviourPackage.CONTEXT__CONSTANTS:
				getConstants().clear();
				return;
			case BehaviourPackage.CONTEXT__RENAMINGS:
				getRenamings().clear();
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
			case BehaviourPackage.CONTEXT__VARIABLES:
				return variables != null && !variables.isEmpty();
			case BehaviourPackage.CONTEXT__RESOURCES:
				return resources != null && !resources.isEmpty();
			case BehaviourPackage.CONTEXT__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case BehaviourPackage.CONTEXT__RENAMINGS:
				return renamings != null && !renamings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
