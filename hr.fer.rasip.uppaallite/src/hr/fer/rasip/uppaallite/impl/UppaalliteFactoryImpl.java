/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaallite.impl;

import hr.fer.rasip.uppaallite.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UppaalliteFactoryImpl extends EFactoryImpl implements UppaalliteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UppaalliteFactory init() {
		try {
			UppaalliteFactory theUppaalliteFactory = (UppaalliteFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore"); 
			if (theUppaalliteFactory != null) {
				return theUppaalliteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UppaalliteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UppaalliteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UppaallitePackage.UPPAAL_DIAGRAM: return createUppaalDiagram();
			case UppaallitePackage.TEMPLATE_TYPE: return createTemplateType();
			case UppaallitePackage.LOCATION_TYPE: return createLocationType();
			case UppaallitePackage.TRANSITION_TYPE: return createTransitionType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UppaalDiagram createUppaalDiagram() {
		UppaalDiagramImpl uppaalDiagram = new UppaalDiagramImpl();
		return uppaalDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateType createTemplateType() {
		TemplateTypeImpl templateType = new TemplateTypeImpl();
		return templateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType createTransitionType() {
		TransitionTypeImpl transitionType = new TransitionTypeImpl();
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UppaallitePackage getUppaallitePackage() {
		return (UppaallitePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UppaallitePackage getPackage() {
		return UppaallitePackage.eINSTANCE;
	}

} //UppaalliteFactoryImpl
