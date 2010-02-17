/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast.provider;


import hr.fer.rasip.remes.grammars.expressions.ast.AstFactory;
import hr.fer.rasip.remes.grammars.expressions.ast.AstPackage;
import hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType;
import hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TernaryExpressionItemProvider
	extends ExpressionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TernaryExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TernaryExpression_operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TernaryExpression_operation_feature", "_UI_TernaryExpression_type"),
				 AstPackage.Literals.TERNARY_EXPRESSION__OPERATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AstPackage.Literals.TERNARY_EXPRESSION__PARAM1);
			childrenFeatures.add(AstPackage.Literals.TERNARY_EXPRESSION__PARAM2);
			childrenFeatures.add(AstPackage.Literals.TERNARY_EXPRESSION__PARAM3);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TernaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TernaryExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ResolvedType labelValue = ((TernaryExpression)object).getType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TernaryExpression_type") :
			getString("_UI_TernaryExpression_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TernaryExpression.class)) {
			case AstPackage.TERNARY_EXPRESSION__OPERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AstPackage.TERNARY_EXPRESSION__PARAM1:
			case AstPackage.TERNARY_EXPRESSION__PARAM2:
			case AstPackage.TERNARY_EXPRESSION__PARAM3:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM1,
				 AstFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM1,
				 AstFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM1,
				 AstFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM1,
				 AstFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM1,
				 AstFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM1,
				 AstFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM2,
				 AstFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM2,
				 AstFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM2,
				 AstFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM2,
				 AstFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM2,
				 AstFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM2,
				 AstFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM3,
				 AstFactory.eINSTANCE.createTernaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM3,
				 AstFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM3,
				 AstFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM3,
				 AstFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM3,
				 AstFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AstPackage.Literals.TERNARY_EXPRESSION__PARAM3,
				 AstFactory.eINSTANCE.createLiteral()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AstPackage.Literals.TERNARY_EXPRESSION__PARAM1 ||
			childFeature == AstPackage.Literals.TERNARY_EXPRESSION__PARAM2 ||
			childFeature == AstPackage.Literals.TERNARY_EXPRESSION__PARAM3;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
