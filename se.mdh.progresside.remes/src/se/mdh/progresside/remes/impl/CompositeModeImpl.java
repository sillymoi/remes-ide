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

import se.mdh.progresside.remes.CompositeEntryPoint;
import se.mdh.progresside.remes.CompositeExitPoint;
import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.SubMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getSubModes <em>Sub Modes</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getConditionalConnectors <em>Conditional Connectors</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getInitPoint <em>Init Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getCompositeEntryPoint <em>Composite Entry Point</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.CompositeModeImpl#getCompositeExitPoint <em>Composite Exit Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeModeImpl extends ModeImpl implements CompositeMode {
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
	 * The cached value of the '{@link #getInitPoint() <em>Init Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitPoint()
	 * @generated
	 * @ordered
	 */
	protected InitPoint initPoint;

	/**
	 * The cached value of the '{@link #getCompositeEntryPoint() <em>Composite Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected CompositeEntryPoint compositeEntryPoint;

	/**
	 * The cached value of the '{@link #getCompositeExitPoint() <em>Composite Exit Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeExitPoint()
	 * @generated
	 * @ordered
	 */
	protected CompositeExitPoint compositeExitPoint;

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
	public InitPoint getInitPoint() {
		return initPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitPoint(InitPoint newInitPoint, NotificationChain msgs) {
		InitPoint oldInitPoint = initPoint;
		initPoint = newInitPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__INIT_POINT, oldInitPoint, newInitPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitPoint(InitPoint newInitPoint) {
		if (newInitPoint != initPoint) {
			NotificationChain msgs = null;
			if (initPoint != null)
				msgs = ((InternalEObject)initPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.COMPOSITE_MODE__INIT_POINT, null, msgs);
			if (newInitPoint != null)
				msgs = ((InternalEObject)newInitPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RemesPackage.COMPOSITE_MODE__INIT_POINT, null, msgs);
			msgs = basicSetInitPoint(newInitPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__INIT_POINT, newInitPoint, newInitPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeEntryPoint getCompositeEntryPoint() {
		return compositeEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeEntryPoint(CompositeEntryPoint newCompositeEntryPoint, NotificationChain msgs) {
		CompositeEntryPoint oldCompositeEntryPoint = compositeEntryPoint;
		compositeEntryPoint = newCompositeEntryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT, oldCompositeEntryPoint, newCompositeEntryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeEntryPoint(CompositeEntryPoint newCompositeEntryPoint) {
		if (newCompositeEntryPoint != compositeEntryPoint) {
			NotificationChain msgs = null;
			if (compositeEntryPoint != null)
				msgs = ((InternalEObject)compositeEntryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT, null, msgs);
			if (newCompositeEntryPoint != null)
				msgs = ((InternalEObject)newCompositeEntryPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT, null, msgs);
			msgs = basicSetCompositeEntryPoint(newCompositeEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT, newCompositeEntryPoint, newCompositeEntryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeExitPoint getCompositeExitPoint() {
		return compositeExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeExitPoint(CompositeExitPoint newCompositeExitPoint, NotificationChain msgs) {
		CompositeExitPoint oldCompositeExitPoint = compositeExitPoint;
		compositeExitPoint = newCompositeExitPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT, oldCompositeExitPoint, newCompositeExitPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeExitPoint(CompositeExitPoint newCompositeExitPoint) {
		if (newCompositeExitPoint != compositeExitPoint) {
			NotificationChain msgs = null;
			if (compositeExitPoint != null)
				msgs = ((InternalEObject)compositeExitPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT, null, msgs);
			if (newCompositeExitPoint != null)
				msgs = ((InternalEObject)newCompositeExitPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT, null, msgs);
			msgs = basicSetCompositeExitPoint(newCompositeExitPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT, newCompositeExitPoint, newCompositeExitPoint));
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
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				return ((InternalEList<?>)getSubModes()).basicRemove(otherEnd, msgs);
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				return ((InternalEList<?>)getConditionalConnectors()).basicRemove(otherEnd, msgs);
			case RemesPackage.COMPOSITE_MODE__INIT_POINT:
				return basicSetInitPoint(null, msgs);
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT:
				return basicSetCompositeEntryPoint(null, msgs);
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT:
				return basicSetCompositeExitPoint(null, msgs);
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
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				return getSubModes();
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				return getConditionalConnectors();
			case RemesPackage.COMPOSITE_MODE__INIT_POINT:
				return getInitPoint();
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT:
				return getCompositeEntryPoint();
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT:
				return getCompositeExitPoint();
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
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				getSubModes().clear();
				getSubModes().addAll((Collection<? extends SubMode>)newValue);
				return;
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				getConditionalConnectors().clear();
				getConditionalConnectors().addAll((Collection<? extends ConditionalConnector>)newValue);
				return;
			case RemesPackage.COMPOSITE_MODE__INIT_POINT:
				setInitPoint((InitPoint)newValue);
				return;
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT:
				setCompositeEntryPoint((CompositeEntryPoint)newValue);
				return;
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT:
				setCompositeExitPoint((CompositeExitPoint)newValue);
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
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				getSubModes().clear();
				return;
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				getConditionalConnectors().clear();
				return;
			case RemesPackage.COMPOSITE_MODE__INIT_POINT:
				setInitPoint((InitPoint)null);
				return;
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT:
				setCompositeEntryPoint((CompositeEntryPoint)null);
				return;
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT:
				setCompositeExitPoint((CompositeExitPoint)null);
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
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
				return subModes != null && !subModes.isEmpty();
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
				return conditionalConnectors != null && !conditionalConnectors.isEmpty();
			case RemesPackage.COMPOSITE_MODE__INIT_POINT:
				return initPoint != null;
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT:
				return compositeEntryPoint != null;
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT:
				return compositeExitPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeModeImpl
