/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaal.impl;

import hr.fer.rasip.uppaal.NtaType;
import hr.fer.rasip.uppaal.TemplateType;
import hr.fer.rasip.uppaal.UppaalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nta Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaal.impl.NtaTypeImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.NtaTypeImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.NtaTypeImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.NtaTypeImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.NtaTypeImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NtaTypeImpl extends EObjectImpl implements NtaType {
	/**
	 * The default value of the '{@link #getImports() <em>Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected String imports = IMPORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String declaration = DECLARATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList template;

	/**
	 * The default value of the '{@link #getInstantiation() <em>Instantiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiation()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANTIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiation()
	 * @generated
	 * @ordered
	 */
	protected String instantiation = INSTANTIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected String system = SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NtaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UppaalPackage.Literals.NTA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImports() {
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImports(String newImports) {
		String oldImports = imports;
		imports = newImports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.NTA_TYPE__IMPORTS, oldImports, imports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(String newDeclaration) {
		String oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.NTA_TYPE__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTemplate() {
		if (template == null) {
			template = new EObjectContainmentEList(TemplateType.class, this, UppaalPackage.NTA_TYPE__TEMPLATE);
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstantiation() {
		return instantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiation(String newInstantiation) {
		String oldInstantiation = instantiation;
		instantiation = newInstantiation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.NTA_TYPE__INSTANTIATION, oldInstantiation, instantiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(String newSystem) {
		String oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.NTA_TYPE__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaalPackage.NTA_TYPE__TEMPLATE:
				return ((InternalEList)getTemplate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UppaalPackage.NTA_TYPE__IMPORTS:
				return getImports();
			case UppaalPackage.NTA_TYPE__DECLARATION:
				return getDeclaration();
			case UppaalPackage.NTA_TYPE__TEMPLATE:
				return getTemplate();
			case UppaalPackage.NTA_TYPE__INSTANTIATION:
				return getInstantiation();
			case UppaalPackage.NTA_TYPE__SYSTEM:
				return getSystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UppaalPackage.NTA_TYPE__IMPORTS:
				setImports((String)newValue);
				return;
			case UppaalPackage.NTA_TYPE__DECLARATION:
				setDeclaration((String)newValue);
				return;
			case UppaalPackage.NTA_TYPE__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((Collection)newValue);
				return;
			case UppaalPackage.NTA_TYPE__INSTANTIATION:
				setInstantiation((String)newValue);
				return;
			case UppaalPackage.NTA_TYPE__SYSTEM:
				setSystem((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UppaalPackage.NTA_TYPE__IMPORTS:
				setImports(IMPORTS_EDEFAULT);
				return;
			case UppaalPackage.NTA_TYPE__DECLARATION:
				setDeclaration(DECLARATION_EDEFAULT);
				return;
			case UppaalPackage.NTA_TYPE__TEMPLATE:
				getTemplate().clear();
				return;
			case UppaalPackage.NTA_TYPE__INSTANTIATION:
				setInstantiation(INSTANTIATION_EDEFAULT);
				return;
			case UppaalPackage.NTA_TYPE__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UppaalPackage.NTA_TYPE__IMPORTS:
				return IMPORTS_EDEFAULT == null ? imports != null : !IMPORTS_EDEFAULT.equals(imports);
			case UppaalPackage.NTA_TYPE__DECLARATION:
				return DECLARATION_EDEFAULT == null ? declaration != null : !DECLARATION_EDEFAULT.equals(declaration);
			case UppaalPackage.NTA_TYPE__TEMPLATE:
				return template != null && !template.isEmpty();
			case UppaalPackage.NTA_TYPE__INSTANTIATION:
				return INSTANTIATION_EDEFAULT == null ? instantiation != null : !INSTANTIATION_EDEFAULT.equals(instantiation);
			case UppaalPackage.NTA_TYPE__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (imports: ");
		result.append(imports);
		result.append(", declaration: ");
		result.append(declaration);
		result.append(", instantiation: ");
		result.append(instantiation);
		result.append(", system: ");
		result.append(system);
		result.append(')');
		return result.toString();
	}

} //NtaTypeImpl
