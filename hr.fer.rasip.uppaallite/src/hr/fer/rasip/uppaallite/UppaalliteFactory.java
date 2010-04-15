/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaallite;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hr.fer.rasip.uppaallite.UppaallitePackage
 * @generated
 */
public interface UppaalliteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UppaalliteFactory eINSTANCE = hr.fer.rasip.uppaallite.impl.UppaalliteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Uppaal Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uppaal Diagram</em>'.
	 * @generated
	 */
	UppaalDiagram createUppaalDiagram();

	/**
	 * Returns a new object of class '<em>Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Type</em>'.
	 * @generated
	 */
	TemplateType createTemplateType();

	/**
	 * Returns a new object of class '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Type</em>'.
	 * @generated
	 */
	LocationType createLocationType();

	/**
	 * Returns a new object of class '<em>Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Type</em>'.
	 * @generated
	 */
	TransitionType createTransitionType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UppaallitePackage getUppaallitePackage();

} //UppaalliteFactory
