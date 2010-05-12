/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaallite.impl;

import hr.fer.rasip.uppaallite.TemplateType;
import hr.fer.rasip.uppaallite.UppaalDiagram;
import hr.fer.rasip.uppaallite.UppaallitePackage;

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
 * An implementation of the model object '<em><b>Uppaal Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.UppaalDiagramImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.UppaalDiagramImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaallite.impl.UppaalDiagramImpl#getResourceWeightDeclaration <em>Resource Weight Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UppaalDiagramImpl extends EObjectImpl implements UppaalDiagram {
	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateType> template;

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
	 * The default value of the '{@link #getResourceWeightDeclaration() <em>Resource Weight Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceWeightDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_WEIGHT_DECLARATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceWeightDeclaration() <em>Resource Weight Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceWeightDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String resourceWeightDeclaration = RESOURCE_WEIGHT_DECLARATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UppaalDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UppaallitePackage.Literals.UPPAAL_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateType> getTemplate() {
		if (template == null) {
			template = new EObjectContainmentEList<TemplateType>(TemplateType.class, this, UppaallitePackage.UPPAAL_DIAGRAM__TEMPLATE);
		}
		return template;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.UPPAAL_DIAGRAM__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceWeightDeclaration() {
		return resourceWeightDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceWeightDeclaration(String newResourceWeightDeclaration) {
		String oldResourceWeightDeclaration = resourceWeightDeclaration;
		resourceWeightDeclaration = newResourceWeightDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaallitePackage.UPPAAL_DIAGRAM__RESOURCE_WEIGHT_DECLARATION, oldResourceWeightDeclaration, resourceWeightDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaallitePackage.UPPAAL_DIAGRAM__TEMPLATE:
				return ((InternalEList<?>)getTemplate()).basicRemove(otherEnd, msgs);
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
			case UppaallitePackage.UPPAAL_DIAGRAM__TEMPLATE:
				return getTemplate();
			case UppaallitePackage.UPPAAL_DIAGRAM__DECLARATION:
				return getDeclaration();
			case UppaallitePackage.UPPAAL_DIAGRAM__RESOURCE_WEIGHT_DECLARATION:
				return getResourceWeightDeclaration();
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
			case UppaallitePackage.UPPAAL_DIAGRAM__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((Collection<? extends TemplateType>)newValue);
				return;
			case UppaallitePackage.UPPAAL_DIAGRAM__DECLARATION:
				setDeclaration((String)newValue);
				return;
			case UppaallitePackage.UPPAAL_DIAGRAM__RESOURCE_WEIGHT_DECLARATION:
				setResourceWeightDeclaration((String)newValue);
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
			case UppaallitePackage.UPPAAL_DIAGRAM__TEMPLATE:
				getTemplate().clear();
				return;
			case UppaallitePackage.UPPAAL_DIAGRAM__DECLARATION:
				setDeclaration(DECLARATION_EDEFAULT);
				return;
			case UppaallitePackage.UPPAAL_DIAGRAM__RESOURCE_WEIGHT_DECLARATION:
				setResourceWeightDeclaration(RESOURCE_WEIGHT_DECLARATION_EDEFAULT);
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
			case UppaallitePackage.UPPAAL_DIAGRAM__TEMPLATE:
				return template != null && !template.isEmpty();
			case UppaallitePackage.UPPAAL_DIAGRAM__DECLARATION:
				return DECLARATION_EDEFAULT == null ? declaration != null : !DECLARATION_EDEFAULT.equals(declaration);
			case UppaallitePackage.UPPAAL_DIAGRAM__RESOURCE_WEIGHT_DECLARATION:
				return RESOURCE_WEIGHT_DECLARATION_EDEFAULT == null ? resourceWeightDeclaration != null : !RESOURCE_WEIGHT_DECLARATION_EDEFAULT.equals(resourceWeightDeclaration);
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
		result.append(" (declaration: ");
		result.append(declaration);
		result.append(", resourceWeightDeclaration: ");
		result.append(resourceWeightDeclaration);
		result.append(')');
		return result.toString();
	}

} //UppaalDiagramImpl
