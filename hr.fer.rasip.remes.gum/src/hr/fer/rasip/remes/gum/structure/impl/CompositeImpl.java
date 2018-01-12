/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.structure.impl;

import hr.fer.rasip.remes.gum.structure.Composite;
import hr.fer.rasip.remes.gum.structure.Connection;
import hr.fer.rasip.remes.gum.structure.Interface;
import hr.fer.rasip.remes.gum.structure.PortGroup;
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
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.CompositeImpl#getInputPortGroups <em>Input Port Groups</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.CompositeImpl#getOutputPortGroups <em>Output Port Groups</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.CompositeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.CompositeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.CompositeImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.structure.impl.CompositeImpl#isReentrant <em>Reentrant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeImpl extends BehaverImpl implements Composite {
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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureElement> children;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The default value of the '{@link #isReentrant() <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REENTRANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReentrant() <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected boolean reentrant = REENTRANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortGroup> getInputPortGroups() {
		if (inputPortGroups == null) {
			inputPortGroups = new EObjectContainmentWithInverseEList<PortGroup>(PortGroup.class, this, StructurePackage.COMPOSITE__INPUT_PORT_GROUPS, StructurePackage.PORT_GROUP__INTERFACE);
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
			outputPortGroups = new EObjectContainmentEList<PortGroup>(PortGroup.class, this, StructurePackage.COMPOSITE__OUTPUT_PORT_GROUPS);
		}
		return outputPortGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite getParent() {
		if (eContainerFeatureID() != StructurePackage.COMPOSITE__PARENT) return null;
		return (Composite)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Composite newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StructurePackage.COMPOSITE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Composite newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StructurePackage.COMPOSITE__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.COMPOSITE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReentrant() {
		return reentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReentrant(boolean newReentrant) {
		boolean oldReentrant = reentrant;
		reentrant = newReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.COMPOSITE__REENTRANT, oldReentrant, reentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<StructureElement>(StructureElement.class, this, StructurePackage.COMPOSITE__CHILDREN, StructurePackage.STRUCTURE_ELEMENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, StructurePackage.COMPOSITE__CONNECTIONS, StructurePackage.CONNECTION__PARENT);
		}
		return connections;
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
			case StructurePackage.COMPOSITE__INPUT_PORT_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputPortGroups()).basicAdd(otherEnd, msgs);
			case StructurePackage.COMPOSITE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Composite)otherEnd, msgs);
			case StructurePackage.COMPOSITE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case StructurePackage.COMPOSITE__CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnections()).basicAdd(otherEnd, msgs);
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
			case StructurePackage.COMPOSITE__INPUT_PORT_GROUPS:
				return ((InternalEList<?>)getInputPortGroups()).basicRemove(otherEnd, msgs);
			case StructurePackage.COMPOSITE__OUTPUT_PORT_GROUPS:
				return ((InternalEList<?>)getOutputPortGroups()).basicRemove(otherEnd, msgs);
			case StructurePackage.COMPOSITE__PARENT:
				return basicSetParent(null, msgs);
			case StructurePackage.COMPOSITE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case StructurePackage.COMPOSITE__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.COMPOSITE__PARENT:
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
			case StructurePackage.COMPOSITE__INPUT_PORT_GROUPS:
				return getInputPortGroups();
			case StructurePackage.COMPOSITE__OUTPUT_PORT_GROUPS:
				return getOutputPortGroups();
			case StructurePackage.COMPOSITE__PARENT:
				return getParent();
			case StructurePackage.COMPOSITE__CHILDREN:
				return getChildren();
			case StructurePackage.COMPOSITE__CONNECTIONS:
				return getConnections();
			case StructurePackage.COMPOSITE__REENTRANT:
				return isReentrant();
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
			case StructurePackage.COMPOSITE__INPUT_PORT_GROUPS:
				getInputPortGroups().clear();
				getInputPortGroups().addAll((Collection<? extends PortGroup>)newValue);
				return;
			case StructurePackage.COMPOSITE__OUTPUT_PORT_GROUPS:
				getOutputPortGroups().clear();
				getOutputPortGroups().addAll((Collection<? extends PortGroup>)newValue);
				return;
			case StructurePackage.COMPOSITE__PARENT:
				setParent((Composite)newValue);
				return;
			case StructurePackage.COMPOSITE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends StructureElement>)newValue);
				return;
			case StructurePackage.COMPOSITE__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case StructurePackage.COMPOSITE__REENTRANT:
				setReentrant((Boolean)newValue);
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
			case StructurePackage.COMPOSITE__INPUT_PORT_GROUPS:
				getInputPortGroups().clear();
				return;
			case StructurePackage.COMPOSITE__OUTPUT_PORT_GROUPS:
				getOutputPortGroups().clear();
				return;
			case StructurePackage.COMPOSITE__PARENT:
				setParent((Composite)null);
				return;
			case StructurePackage.COMPOSITE__CHILDREN:
				getChildren().clear();
				return;
			case StructurePackage.COMPOSITE__CONNECTIONS:
				getConnections().clear();
				return;
			case StructurePackage.COMPOSITE__REENTRANT:
				setReentrant(REENTRANT_EDEFAULT);
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
			case StructurePackage.COMPOSITE__INPUT_PORT_GROUPS:
				return inputPortGroups != null && !inputPortGroups.isEmpty();
			case StructurePackage.COMPOSITE__OUTPUT_PORT_GROUPS:
				return outputPortGroups != null && !outputPortGroups.isEmpty();
			case StructurePackage.COMPOSITE__PARENT:
				return getParent() != null;
			case StructurePackage.COMPOSITE__CHILDREN:
				return children != null && !children.isEmpty();
			case StructurePackage.COMPOSITE__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case StructurePackage.COMPOSITE__REENTRANT:
				return reentrant != REENTRANT_EDEFAULT;
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
				case StructurePackage.COMPOSITE__INPUT_PORT_GROUPS: return StructurePackage.INTERFACE__INPUT_PORT_GROUPS;
				case StructurePackage.COMPOSITE__OUTPUT_PORT_GROUPS: return StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == StructureElement.class) {
			switch (derivedFeatureID) {
				case StructurePackage.COMPOSITE__PARENT: return StructurePackage.STRUCTURE_ELEMENT__PARENT;
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
				case StructurePackage.INTERFACE__INPUT_PORT_GROUPS: return StructurePackage.COMPOSITE__INPUT_PORT_GROUPS;
				case StructurePackage.INTERFACE__OUTPUT_PORT_GROUPS: return StructurePackage.COMPOSITE__OUTPUT_PORT_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == StructureElement.class) {
			switch (baseFeatureID) {
				case StructurePackage.STRUCTURE_ELEMENT__PARENT: return StructurePackage.COMPOSITE__PARENT;
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
		result.append(" (reentrant: ");
		result.append(reentrant);
		result.append(')');
		return result.toString();
	}

} //CompositeImpl
