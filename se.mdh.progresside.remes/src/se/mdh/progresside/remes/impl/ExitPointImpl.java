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

import se.mdh.progresside.remes.ControlPath;
import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.RemesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.ExitPointImpl#getExitEdges <em>Exit Edges</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.ExitPointImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExitPointImpl extends PointImpl implements ExitPoint {
	/**
	 * The cached value of the '{@link #getExitEdges() <em>Exit Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> exitEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.EXIT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getExitEdges() {
		if (exitEdges == null) {
			exitEdges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, RemesPackage.EXIT_POINT__EXIT_EDGES, RemesPackage.EDGE__CONNECT_FROM);
		}
		return exitEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPath getContainer() {
		if (eContainerFeatureID() != RemesPackage.EXIT_POINT__CONTAINER) return null;
		return (ControlPath)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ControlPath newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, RemesPackage.EXIT_POINT__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ControlPath newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != RemesPackage.EXIT_POINT__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, RemesPackage.CONTROL_PATH__EXIT_POINT, ControlPath.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.EXIT_POINT__CONTAINER, newContainer, newContainer));
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
			case RemesPackage.EXIT_POINT__EXIT_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExitEdges()).basicAdd(otherEnd, msgs);
			case RemesPackage.EXIT_POINT__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((ControlPath)otherEnd, msgs);
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
			case RemesPackage.EXIT_POINT__EXIT_EDGES:
				return ((InternalEList<?>)getExitEdges()).basicRemove(otherEnd, msgs);
			case RemesPackage.EXIT_POINT__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case RemesPackage.EXIT_POINT__CONTAINER:
				return eInternalContainer().eInverseRemove(this, RemesPackage.CONTROL_PATH__EXIT_POINT, ControlPath.class, msgs);
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
			case RemesPackage.EXIT_POINT__EXIT_EDGES:
				return getExitEdges();
			case RemesPackage.EXIT_POINT__CONTAINER:
				return getContainer();
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
			case RemesPackage.EXIT_POINT__EXIT_EDGES:
				getExitEdges().clear();
				getExitEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case RemesPackage.EXIT_POINT__CONTAINER:
				setContainer((ControlPath)newValue);
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
			case RemesPackage.EXIT_POINT__EXIT_EDGES:
				getExitEdges().clear();
				return;
			case RemesPackage.EXIT_POINT__CONTAINER:
				setContainer((ControlPath)null);
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
			case RemesPackage.EXIT_POINT__EXIT_EDGES:
				return exitEdges != null && !exitEdges.isEmpty();
			case RemesPackage.EXIT_POINT__CONTAINER:
				return getContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExitPointImpl
