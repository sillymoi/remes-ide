/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.RemesFactory;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.util.RemesDefaultElementFactory;

/**
 * This is the item provider adapter for a {@link se.mdh.progresside.remes.CompositeMode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeModeItemProvider
	extends ModeItemProvider
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
	public CompositeModeItemProvider(AdapterFactory adapterFactory) {
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

			addSubModesPropertyDescriptor(object);
			addConditionalConnectorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sub Modes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubModesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeMode_subModes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeMode_subModes_feature", "_UI_CompositeMode_type"),
				 RemesPackage.Literals.COMPOSITE_MODE__SUB_MODES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conditional Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionalConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeMode_conditionalConnectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeMode_conditionalConnectors_feature", "_UI_CompositeMode_type"),
				 RemesPackage.Literals.COMPOSITE_MODE__CONDITIONAL_CONNECTORS,
				 false,
				 false,
				 false,
				 null,
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
			childrenFeatures.add(RemesPackage.Literals.COMPOSITE_MODE__SUB_MODES);
			childrenFeatures.add(RemesPackage.Literals.COMPOSITE_MODE__CONDITIONAL_CONNECTORS);
			childrenFeatures.add(RemesPackage.Literals.COMPOSITE_MODE__INIT_POINT);
			childrenFeatures.add(RemesPackage.Literals.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT);
			childrenFeatures.add(RemesPackage.Literals.COMPOSITE_MODE__COMPOSITE_EXIT_POINT);
			childrenFeatures.add(RemesPackage.Literals.COMPOSITE_MODE__WRITE_POINT);
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
	 * This returns CompositeMode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeMode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeMode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeMode_type") :
			getString("_UI_CompositeMode_type") + " " + label;
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

		switch (notification.getFeatureID(CompositeMode.class)) {
			case RemesPackage.COMPOSITE_MODE__SUB_MODES:
			case RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS:
			case RemesPackage.COMPOSITE_MODE__INIT_POINT:
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT:
			case RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT:
			case RemesPackage.COMPOSITE_MODE__WRITE_POINT:
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
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		// Create children with default values and initialization of sub-elements
		RemesDefaultElementFactory defaultFactory = new RemesDefaultElementFactory();
				
		newChildDescriptors.add
			(createChildParameter
				(RemesPackage.Literals.COMPOSITE_MODE__SUB_MODES,
				 defaultFactory.createDefaultSubMode()));

		newChildDescriptors.add
			(createChildParameter
				(RemesPackage.Literals.COMPOSITE_MODE__CONDITIONAL_CONNECTORS,
				 defaultFactory.createDefaultConditionalConnector()));

		newChildDescriptors.add
			(createChildParameter
				(RemesPackage.Literals.COMPOSITE_MODE__INIT_POINT,
				 RemesFactory.eINSTANCE.createInitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RemesPackage.Literals.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT,
				 RemesFactory.eINSTANCE.createCompositeEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RemesPackage.Literals.COMPOSITE_MODE__COMPOSITE_EXIT_POINT,
				 RemesFactory.eINSTANCE.createCompositeExitPoint()));
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
			childFeature == RemesPackage.Literals.CONTROL_PATH__ENTRY_POINT ||
			childFeature == RemesPackage.Literals.COMPOSITE_MODE__COMPOSITE_EXIT_POINT ||
			childFeature == RemesPackage.Literals.CONTROL_PATH__EXIT_POINT ||
			childFeature == RemesPackage.Literals.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
