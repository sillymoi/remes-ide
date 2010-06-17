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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.WriteEdge;
import se.mdh.progresside.remes.WritePoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.WritePointImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.WritePointImpl#getWriteEdges <em>Write Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WritePointImpl extends PointImpl implements WritePoint {
	/**
	 * The cached value of the '{@link #getWriteEdges() <em>Write Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<WriteEdge> writeEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WritePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.WRITE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMode getContainer() {
		if (eContainerFeatureID() != RemesPackage.WRITE_POINT__CONTAINER) return null;
		return (CompositeMode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(CompositeMode newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, RemesPackage.WRITE_POINT__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(CompositeMode newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != RemesPackage.WRITE_POINT__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, RemesPackage.COMPOSITE_MODE__WRITE_POINT, CompositeMode.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.WRITE_POINT__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WriteEdge> getWriteEdges() {
		if (writeEdges == null) {
			writeEdges = new EObjectContainmentWithInverseEList<WriteEdge>(WriteEdge.class, this, RemesPackage.WRITE_POINT__WRITE_EDGES, RemesPackage.WRITE_EDGE__CONNECT_TO);
		}
		return writeEdges;
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
			case RemesPackage.WRITE_POINT__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((CompositeMode)otherEnd, msgs);
			case RemesPackage.WRITE_POINT__WRITE_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWriteEdges()).basicAdd(otherEnd, msgs);
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
			case RemesPackage.WRITE_POINT__CONTAINER:
				return basicSetContainer(null, msgs);
			case RemesPackage.WRITE_POINT__WRITE_EDGES:
				return ((InternalEList<?>)getWriteEdges()).basicRemove(otherEnd, msgs);
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
			case RemesPackage.WRITE_POINT__CONTAINER:
				return eInternalContainer().eInverseRemove(this, RemesPackage.COMPOSITE_MODE__WRITE_POINT, CompositeMode.class, msgs);
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
			case RemesPackage.WRITE_POINT__CONTAINER:
				return getContainer();
			case RemesPackage.WRITE_POINT__WRITE_EDGES:
				return getWriteEdges();
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
			case RemesPackage.WRITE_POINT__CONTAINER:
				setContainer((CompositeMode)newValue);
				return;
			case RemesPackage.WRITE_POINT__WRITE_EDGES:
				getWriteEdges().clear();
				getWriteEdges().addAll((Collection<? extends WriteEdge>)newValue);
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
			case RemesPackage.WRITE_POINT__CONTAINER:
				setContainer((CompositeMode)null);
				return;
			case RemesPackage.WRITE_POINT__WRITE_EDGES:
				getWriteEdges().clear();
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
			case RemesPackage.WRITE_POINT__CONTAINER:
				return getContainer() != null;
			case RemesPackage.WRITE_POINT__WRITE_EDGES:
				return writeEdges != null && !writeEdges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WritePointImpl
