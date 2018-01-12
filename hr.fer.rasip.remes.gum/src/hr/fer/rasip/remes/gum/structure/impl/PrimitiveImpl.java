/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure.impl;

import hr.fer.rasip.remes.gum.structure.Composite;
import hr.fer.rasip.remes.gum.structure.Interface;
import hr.fer.rasip.remes.gum.structure.PortGroup;
import hr.fer.rasip.remes.gum.structure.Primitive;
import hr.fer.rasip.remes.gum.structure.StructureElement;
import hr.fer.rasip.remes.gum.structure.StructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.PrimitiveImpl#getInputPortGroups <em>Input Port Groups</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.PrimitiveImpl#getOutputPortGroups <em>Output Port Groups</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.PrimitiveImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveImpl extends BehaverImpl implements Primitive {
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
	protected PrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.PRIMITIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortGroup> getInputPortGroups() {
		if (inputPortGroups == null) {
			inputPortGroups = new EObjectContainmentWithInverseEList<PortGroup>(PortGroup.class, this, StructurePackage.PRIMITIVE__INPUT_PORT_GROUPS, StructurePackage.PORT_GROUP__INTERFACE);
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
			outputPortGroups = new EObjectContainmentEList<PortGroup>(PortGroup.class, this, StructurePackage.PRIMITIVE__OUTPUT_PORT_GROUPS);
		}
		return outputPortGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite getParent() {
		if (eContainerFeatureID() != StructurePackage.PRIMITIVE__PARENT) return null;
		return (Composite)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Composite newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StructurePackage.PRIMITIVE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Composite newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StructurePackage.PRIMITIVE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, StructurePackage.COMPOSITE__CHILDREN, Composite.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PRIMITIVE__PARENT, newParent, newParent));
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
			case StructurePackage.PRIMITIVE__INPUT_PORT_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputPortGroups()).basicAdd(otherEnd, msgs);
			case StructurePackage.PRIMITIVE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Composite)otherEnd, msgs);
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
			case StructurePackage.PRIMITIVE__INPUT_PORT_GROUPS:
				return ((InternalEList<?>)getInputPortGroups()).basicRemove(otherEnd, msgs);
			case StructurePackage.PRIMITIVE__OUTPUT_PORT_GROUPS:
				return ((InternalEList<?>)getOutputPortGroups()).basicRemove(otherEnd, msgs);
			case StructurePackage.PRIMITIVE__PARENT:
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
			case StructurePackage.PRIMITIVE__PARENT:
				return eInternalContainer().eInverseRemove(this, StructurePackage.COMPOSITE__CHILDREN, Composite.class, msgs);
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
			case StructurePackage.PRIMITIVE__INPUT_PORT_GROUPS:
				return getInputPortGroups();
			case StructurePackage.PRIMITIVE__OUTPUT_PORT_GROUPS:
				return getOutputPortGroups();
			case StructurePackage.PRIMITIVE__PARENT:
				return getParent();
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
			case StructurePackage.PRIMITIVE__INPUT_PORT_GROUPS:
				getInputPortGroups().clear();
				getInputPortGroups().addAll((Collection<? extends PortGroup>)newValue);
				return;
			case StructurePackage.PRIMITIVE__OUTPUT_PORT_GROUPS:
				getOutputPortGroups().clear();
				getOutputPortGroups().addAll((Collection<? extends PortGroup>)newValue);
				return;
			case StructurePackage.PRIMITIVE__PARENT:
				setParent((Composite)newValue);
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
			case StructurePackage.PRIMITIVE__INPUT_PORT_GROUPS:
				getInputPortGroups().clear();
				return;
			case StructurePackage.PRIMITIVE__OUTPUT_PORT_GROUPS:
				getOutputPortGroups().clear();
				return;
			case StructurePackage.PRIMITIVE__PARENT:
				setParent((Composite)null);
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
			case StructurePackage.PRIMITIVE__INPUT_PORT_GROUPS:
				return inputPortGroups != null && !inputPortGroups.isEmpty();
			case StructurePackage.PRIMITIVE__OUTPUT_PORT_GROUPS:
				return outputPortGroups != null && !outputPortGroups.isEmpty();
			case StructurePackage.PRIMITIVE__PARENT:
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
		if (baseClass == Interface.class) {
			switch (derivedFeatureID) {
				case StructurePackage.PRIMITIVE__INPUT_PORT_GROUPS: return StructurePackage.INTERFACE__INPUT_PORT_GROUPS;
				case StructurePackage.PRIMITIVE__OUTPUT_PORT_GROUPS: return StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == StructureElement.class) {
			switch (derivedFeatureID) {
				case StructurePackage.PRIMITIVE__PARENT: return StructurePackage.STRUCTURE_ELEMENT__PARENT;
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
		if (baseClass == Interface.class) {
			switch (baseFeatureID) {
				case StructurePackage.INTERFACE__INPUT_PORT_GROUPS: return StructurePackage.PRIMITIVE__INPUT_PORT_GROUPS;
				case StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS: return StructurePackage.PRIMITIVE__OUTPUT_PORT_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == StructureElement.class) {
			switch (baseFeatureID) {
				case StructurePackage.STRUCTURE_ELEMENT__PARENT: return StructurePackage.PRIMITIVE__PARENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PrimitiveImpl
