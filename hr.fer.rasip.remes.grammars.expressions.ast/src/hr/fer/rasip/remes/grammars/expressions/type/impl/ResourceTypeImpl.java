/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.type.impl;

import hr.fer.rasip.remes.grammars.expressions.type.ResourceType;
import hr.fer.rasip.remes.grammars.expressions.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResourceTypeImpl extends BaseTypeImpl implements ResourceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.RESOURCE_TYPE;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.BaseTypeImpl#getPrimitiveTypeIndex()
	 */
	@Override
	public int getPrimitiveTypeIndex() {
		return 5; // PrimitiveTypes.FLOAT.getValue() + 1;	
	}
	
} //ResourceTypeImpl
