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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.FromCompositeModeEdge;
import se.mdh.progresside.remes.FromCompositeModeInitEdge;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.SubMode;
import se.mdh.progresside.remes.ToCompositeModeEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getExitEdges <em>Exit Edges</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getInitEdge <em>Init Edge</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getEntryEdge <em>Entry Edge</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getSubModes <em>Sub Modes</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getConditionalConnectors <em>Conditional Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeModeImpl extends ModeImpl implements CompositeMode {
	/**
	 * The cached value of the '{@link #getExitEdges() <em>Exit Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ToCompositeModeEdge> exitEdges;

	/**
	 * The cached value of the '{@link #getInitEdge() <em>Init Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitEdge()
	 * @generated
	 * @ordered
	 */
	protected FromCompositeModeInitEdge initEdge;

	/**
	 * The cached value of the '{@link #getEntryEdge() <em>Entry Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryEdge()
	 * @generated
	 * @ordered
	 */
	protected FromCompositeModeEdge entryEdge;

	/**
	 * The cached value of the '{@link #getSubModes() <em>Sub Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModes()
	 * @generated
	 * @ordered
	 */
	protected EList<SubMode> subModes;

	/**
	 * The cached value of the '{@link #getConditionalConnectors() <em>Conditional Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalConnector> conditionalConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.COMPOSITE_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToCompositeModeEdge> getExitEdges() {
		if (exitEdges == null) {
			exitEdges = new EObjectWithInverseResolvingEList<ToCompositeModeEdge>(ToCompositeModeEdge.class, this, RemesPackage.COMPOSITE_MODE__EXIT_EDGES, RemesPackage.TO_COMPOSITE_MODE_EDGE__CONNECT_TO);
		}
		return exitEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromCompositeModeInitEdge getInitEdge() {
		return initEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitEdge(FromCompositeModeInitEdge newInitEdge, NotificationChain msgs) {
		FromCompositeModeInitEdge oldInitEdge = initEdge;
		initEdge = newInitEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__INIT_EDGE, oldInitEdge, newInitEdge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitEdge(FromCompositeModeInitEdge newInitEdge) {
		if (newInitEdge != initEdge) {
			NotificationChain msgs = null;
			if (initEdge != null)
				msgs = ((InternalEObject)initEdge).eInverseRemove(this, RemesPackage.FROM_COMPOSITE_MODE_INIT_EDGE__CONNECT_FROM, FromCompositeModeInitEdge.class, msgs);
			if (newInitEdge != null)
				msgs = ((InternalEObject)newInitEdge).eInverseAdd(this, RemesPackage.FROM_COMPOSITE_MODE_INIT_EDGE__CONNECT_FROM, FromCompositeModeInitEdge.class, msgs);
			msgs = basicSetInitEdge(newInitEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__INIT_EDGE, newInitEdge, newInitEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromCompositeModeEdge getEntryEdge() {
		return entryEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryEdge(FromCompositeModeEdge newEntryEdge, NotificationChain msgs) {
		FromCompositeModeEdge oldEntryEdge = entryEdge;
		entryEdge = newEntryEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__ENTRY_EDGE, oldEntryEdge, newEntryEdge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryEdge(FromCompositeModeEdge newEntryEdge) {
		if (newEntryEdge != entryEdge) {
			NotificationChain msgs = null;
			if (entryEdge != null)
				msgs = ((InternalEObject)entryEdge).eInverseRemove(this, RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM, FromCompositeModeEdge.class, msgs);
			if (newEntryEdge != null)
				msgs = ((InternalEObject)newEntryEdge).eInverseAdd(this, RemesPackage.FROM_COMPOSITE_MODE_EDGE__CONNECT_FROM, FromCompositeModeEdge.class, msgs);
			msgs = basicSetEntryEdge(newEntryEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__ENTRY_EDGE, newEntryEdge, newEntryEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubMode> getSubModes() {
		if (subModes == null) {
			subModes = new EObjectContainmentWithInverseEList<SubMode>(SubMode.class, this, RemesPackage.COMPOSITE_MODE__SUB_MODES, RemesPackage.SUB_MODE__PARENT);
		}
		return subModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalConnector> getConditionalConnectors() {
		if (conditionalConnectors == null) {
			conditionalConnectors = new EObjectContainmentWithInverseEList<ConditionalConnector>(ConditionalConnector.class, this, RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS, RemesPackage.CONDITIONAL_CONNECTOR__PARENT);
		}
		return conditionalConnectors;
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
			case RemesPackage.COMPOSITE_MODE__EXIT_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExitEdges()).basicAdd(otherEnd, msgs);
			case RemesPackage.COMPOSITE_MODE__INIT_EDGE:
				if (initEdge != null)
					msgs = ((InternalEObject)initEdge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.COMPOSITE_MODE__INIT_EDGE, null, msgs);
				return basicSetInitEdge((FromCompositeModeInitEdge)otherEnd, msgs);
			case RemesPackage.COMPOSITE_MODE__ENTRY_EDGE:
				if (entryEdge != null)
					msgs = ((InternalEObject)entryEdge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.COMPOSITE_MODE__ENTRY_EDGE, null, msgs);
				return basicSetEntryEdge((FromCompositeModeEdge)otherEnd, msgs);
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubModes()).basicAdd(otherEnd, msgs);
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditionalConnectors()).basicAdd(otherEnd, msgs);
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
			case RemesPackage.COMPOSITE_MODE__EXIT_EDGES:
				return ((InternalEList<?>)getExitEdges()).basicRemove(otherEnd, msgs);
			case RemesPackage.COMPOSITE_MODE__INIT_EDGE:
				return basicSetInitEdge(null, msgs);
			case RemesPackage.COMPOSITE_MODE__ENTRY_EDGE:
				return basicSetEntryEdge(null, msgs);
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				return ((InternalEList<?>)getSubModes()).basicRemove(otherEnd, msgs);
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				return ((InternalEList<?>)getConditionalConnectors()).basicRemove(otherEnd, msgs);
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
			case RemesPackage.COMPOSITE_MODE__EXIT_EDGES:
				return getExitEdges();
			case RemesPackage.COMPOSITE_MODE__INIT_EDGE:
				return getInitEdge();
			case RemesPackage.COMPOSITE_MODE__ENTRY_EDGE:
				return getEntryEdge();
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				return getSubModes();
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				return getConditionalConnectors();
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
			case RemesPackage.COMPOSITE_MODE__EXIT_EDGES:
				getExitEdges().clear();
				getExitEdges().addAll((Collection<? extends ToCompositeModeEdge>)newValue);
				return;
			case RemesPackage.COMPOSITE_MODE__INIT_EDGE:
				setInitEdge((FromCompositeModeInitEdge)newValue);
				return;
			case RemesPackage.COMPOSITE_MODE__ENTRY_EDGE:
				setEntryEdge((FromCompositeModeEdge)newValue);
				return;
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				getSubModes().clear();
				getSubModes().addAll((Collection<? extends SubMode>)newValue);
				return;
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				getConditionalConnectors().clear();
				getConditionalConnectors().addAll((Collection<? extends ConditionalConnector>)newValue);
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
			case RemesPackage.COMPOSITE_MODE__EXIT_EDGES:
				getExitEdges().clear();
				return;
			case RemesPackage.COMPOSITE_MODE__INIT_EDGE:
				setInitEdge((FromCompositeModeInitEdge)null);
				return;
			case RemesPackage.COMPOSITE_MODE__ENTRY_EDGE:
				setEntryEdge((FromCompositeModeEdge)null);
				return;
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				getSubModes().clear();
				return;
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				getConditionalConnectors().clear();
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
			case RemesPackage.COMPOSITE_MODE__EXIT_EDGES:
				return exitEdges != null && !exitEdges.isEmpty();
			case RemesPackage.COMPOSITE_MODE__INIT_EDGE:
				return initEdge != null;
			case RemesPackage.COMPOSITE_MODE__ENTRY_EDGE:
				return entryEdge != null;
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				return subModes != null && !subModes.isEmpty();
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				return conditionalConnectors != null && !conditionalConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeModeImpl
