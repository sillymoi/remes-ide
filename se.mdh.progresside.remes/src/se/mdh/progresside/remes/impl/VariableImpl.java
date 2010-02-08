/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.PrimitiveTypes;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.VariableImpl#getValue <em>Value</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.VariableImpl#getVectorSize <em>Vector Size</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.VariableImpl#isGlobal <em>Global</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.VariableImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.VariableImpl#isReadable <em>Readable</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.VariableImpl#isWritable <em>Writable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends ReferableImpl implements Variable {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveTypes TYPE_EDEFAULT = PrimitiveTypes.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveTypes type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVectorSize() <em>Vector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorSize()
	 * @generated
	 * @ordered
	 */
	protected static final int VECTOR_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVectorSize() <em>Vector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorSize()
	 * @generated
	 * @ordered
	 */
	protected int vectorSize = VECTOR_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLOBAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobal()
	 * @generated
	 * @ordered
	 */
	protected boolean global = GLOBAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadable() <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReadable() <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadable()
	 * @generated
	 * @ordered
	 */
	protected boolean readable = READABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected boolean writable = WRITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.VARIABLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrimitiveTypes newType) {
		PrimitiveTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVectorSize() {
		return vectorSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorSize(int newVectorSize) {
		int oldVectorSize = vectorSize;
		vectorSize = newVectorSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.VARIABLE__VECTOR_SIZE, oldVectorSize, vectorSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobal(boolean newGlobal) {
		boolean oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.VARIABLE__GLOBAL, oldGlobal, global));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getScope() {
		if (eContainerFeatureID() != RemesPackage.VARIABLE__SCOPE) return null;
		return (Mode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Mode newScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScope, RemesPackage.VARIABLE__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Mode newScope) {
		if (newScope != eInternalContainer() || (eContainerFeatureID() != RemesPackage.VARIABLE__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, RemesPackage.MODE__VARIABLES, Mode.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.VARIABLE__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadable() {
		return readable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadable(boolean newReadable) {
		boolean oldReadable = readable;
		readable = newReadable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.VARIABLE__READABLE, oldReadable, readable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWritable() {
		return writable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritable(boolean newWritable) {
		boolean oldWritable = writable;
		writable = newWritable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.VARIABLE__WRITABLE, oldWritable, writable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.VARIABLE__SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScope((Mode)otherEnd, msgs);
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
			case RemesPackage.VARIABLE__SCOPE:
				return basicSetScope(null, msgs);
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
			case RemesPackage.VARIABLE__SCOPE:
				return eInternalContainer().eInverseRemove(this, RemesPackage.MODE__VARIABLES, Mode.class, msgs);
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
			case RemesPackage.VARIABLE__VALUE:
				return getValue();
			case RemesPackage.VARIABLE__TYPE:
				return getType();
			case RemesPackage.VARIABLE__VECTOR_SIZE:
				return getVectorSize();
			case RemesPackage.VARIABLE__GLOBAL:
				return isGlobal();
			case RemesPackage.VARIABLE__SCOPE:
				return getScope();
			case RemesPackage.VARIABLE__READABLE:
				return isReadable();
			case RemesPackage.VARIABLE__WRITABLE:
				return isWritable();
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
			case RemesPackage.VARIABLE__VALUE:
				setValue((String)newValue);
				return;
			case RemesPackage.VARIABLE__TYPE:
				setType((PrimitiveTypes)newValue);
				return;
			case RemesPackage.VARIABLE__VECTOR_SIZE:
				setVectorSize((Integer)newValue);
				return;
			case RemesPackage.VARIABLE__GLOBAL:
				setGlobal((Boolean)newValue);
				return;
			case RemesPackage.VARIABLE__SCOPE:
				setScope((Mode)newValue);
				return;
			case RemesPackage.VARIABLE__READABLE:
				setReadable((Boolean)newValue);
				return;
			case RemesPackage.VARIABLE__WRITABLE:
				setWritable((Boolean)newValue);
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
			case RemesPackage.VARIABLE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RemesPackage.VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RemesPackage.VARIABLE__VECTOR_SIZE:
				setVectorSize(VECTOR_SIZE_EDEFAULT);
				return;
			case RemesPackage.VARIABLE__GLOBAL:
				setGlobal(GLOBAL_EDEFAULT);
				return;
			case RemesPackage.VARIABLE__SCOPE:
				setScope((Mode)null);
				return;
			case RemesPackage.VARIABLE__READABLE:
				setReadable(READABLE_EDEFAULT);
				return;
			case RemesPackage.VARIABLE__WRITABLE:
				setWritable(WRITABLE_EDEFAULT);
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
			case RemesPackage.VARIABLE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case RemesPackage.VARIABLE__TYPE:
				return type != TYPE_EDEFAULT;
			case RemesPackage.VARIABLE__VECTOR_SIZE:
				return vectorSize != VECTOR_SIZE_EDEFAULT;
			case RemesPackage.VARIABLE__GLOBAL:
				return global != GLOBAL_EDEFAULT;
			case RemesPackage.VARIABLE__SCOPE:
				return getScope() != null;
			case RemesPackage.VARIABLE__READABLE:
				return readable != READABLE_EDEFAULT;
			case RemesPackage.VARIABLE__WRITABLE:
				return writable != WRITABLE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", type: ");
		result.append(type);
		result.append(", vectorSize: ");
		result.append(vectorSize);
		result.append(", global: ");
		result.append(global);
		result.append(", readable: ");
		result.append(readable);
		result.append(", writable: ");
		result.append(writable);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
