/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure.impl;

import hr.fer.rasip.remes.gum.structure.Interface;
import hr.fer.rasip.remes.gum.structure.PortGroup;
import hr.fer.rasip.remes.gum.structure.StructurePackage;

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
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.InterfaceImpl#getInputPortGroups <em>Input Port Groups</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.InterfaceImpl#getOutputPortGroups <em>Output Port Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InterfaceImpl extends EObjectImpl implements Interface {
	/**
	 * The cached value of the '{@link #getInputPortGroups() <em>Input Port Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPortGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PortGroup> inputPortGroups;

	/**
	 * The cached value of the '{@link #getOutputPortGroups() <em>Output Port Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPortGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PortGroup> outputPortGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortGroup> getInputPortGroups() {
		if (inputPortGroups == null) {
			inputPortGroups = new EObjectContainmentWithInverseEList<PortGroup>(PortGroup.class, this, StructurePackage.INTERFACE__INPUT_PORT_GROUPS, StructurePackage.PORT_GROUP__INTERFACE);
		}
		return inputPortGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortGroup> getOutputPortGroups() {
		if (outputPortGroups == null) {
			outputPortGroups = new EObjectContainmentEList<PortGroup>(PortGroup.class, this, StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS);
		}
		return outputPortGroups;
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
			case StructurePackage.INTERFACE__INPUT_PORT_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputPortGroups()).basicAdd(otherEnd, msgs);
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
			case StructurePackage.INTERFACE__INPUT_PORT_GROUPS:
				return ((InternalEList<?>)getInputPortGroups()).basicRemove(otherEnd, msgs);
			case StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS:
				return ((InternalEList<?>)getOutputPortGroups()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.INTERFACE__INPUT_PORT_GROUPS:
				return getInputPortGroups();
			case StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS:
				return getOutputPortGroups();
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
			case StructurePackage.INTERFACE__INPUT_PORT_GROUPS:
				getInputPortGroups().clear();
				getInputPortGroups().addAll((Collection<? extends PortGroup>)newValue);
				return;
			case StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS:
				getOutputPortGroups().clear();
				getOutputPortGroups().addAll((Collection<? extends PortGroup>)newValue);
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
			case StructurePackage.INTERFACE__INPUT_PORT_GROUPS:
				getInputPortGroups().clear();
				return;
			case StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS:
				getOutputPortGroups().clear();
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
			case StructurePackage.INTERFACE__INPUT_PORT_GROUPS:
				return inputPortGroups != null && !inputPortGroups.isEmpty();
			case StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS:
				return outputPortGroups != null && !outputPortGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
