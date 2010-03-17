/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaal.provider;


import hr.fer.rasip.uppaal.DocumentRoot;
import hr.fer.rasip.uppaal.UppaalFactory;
import hr.fer.rasip.uppaal.UppaalPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hr.fer.rasip.uppaal.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
	extends ItemProviderAdapter
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDeclarationPropertyDescriptor(object);
			addImportsPropertyDescriptor(object);
			addInstantiationPropertyDescriptor(object);
			addSystemPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Declaration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclarationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_declaration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_declaration_feature", "_UI_DocumentRoot_type"),
				 UppaalPackage.Literals.DOCUMENT_ROOT__DECLARATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_imports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_imports_feature", "_UI_DocumentRoot_type"),
				 UppaalPackage.Literals.DOCUMENT_ROOT__IMPORTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instantiation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstantiationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_instantiation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_instantiation_feature", "_UI_DocumentRoot_type"),
				 UppaalPackage.Literals.DOCUMENT_ROOT__INSTANTIATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_system_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_system_feature", "_UI_DocumentRoot_type"),
				 UppaalPackage.Literals.DOCUMENT_ROOT__SYSTEM,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__COMMITTED);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__INIT);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__LABEL);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__LOCATION);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__NAIL);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__NAME);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__NTA);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__PARAMETER);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__SOURCE);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__TARGET);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__TEMPLATE);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__TRANSITION);
			childrenFeatures.add(UppaalPackage.Literals.DOCUMENT_ROOT__URGENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((DocumentRoot)object).getDeclaration();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") :
			getString("_UI_DocumentRoot_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case UppaalPackage.DOCUMENT_ROOT__DECLARATION:
			case UppaalPackage.DOCUMENT_ROOT__IMPORTS:
			case UppaalPackage.DOCUMENT_ROOT__INSTANTIATION:
			case UppaalPackage.DOCUMENT_ROOT__SYSTEM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UppaalPackage.DOCUMENT_ROOT__COMMITTED:
			case UppaalPackage.DOCUMENT_ROOT__INIT:
			case UppaalPackage.DOCUMENT_ROOT__LABEL:
			case UppaalPackage.DOCUMENT_ROOT__LOCATION:
			case UppaalPackage.DOCUMENT_ROOT__NAIL:
			case UppaalPackage.DOCUMENT_ROOT__NAME:
			case UppaalPackage.DOCUMENT_ROOT__NTA:
			case UppaalPackage.DOCUMENT_ROOT__PARAMETER:
			case UppaalPackage.DOCUMENT_ROOT__SOURCE:
			case UppaalPackage.DOCUMENT_ROOT__TARGET:
			case UppaalPackage.DOCUMENT_ROOT__TEMPLATE:
			case UppaalPackage.DOCUMENT_ROOT__TRANSITION:
			case UppaalPackage.DOCUMENT_ROOT__URGENT:
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__COMMITTED,
				 UppaalFactory.eINSTANCE.createCommittedType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__INIT,
				 UppaalFactory.eINSTANCE.createInitType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__LABEL,
				 UppaalFactory.eINSTANCE.createLabelType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__LOCATION,
				 UppaalFactory.eINSTANCE.createLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__NAIL,
				 UppaalFactory.eINSTANCE.createNailType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__NAME,
				 UppaalFactory.eINSTANCE.createNameType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__NTA,
				 UppaalFactory.eINSTANCE.createNtaType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__PARAMETER,
				 UppaalFactory.eINSTANCE.createParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__SOURCE,
				 UppaalFactory.eINSTANCE.createSourceType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__TARGET,
				 UppaalFactory.eINSTANCE.createTargetType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__TEMPLATE,
				 UppaalFactory.eINSTANCE.createTemplateType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__TRANSITION,
				 UppaalFactory.eINSTANCE.createTransitionType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.DOCUMENT_ROOT__URGENT,
				 UppaalFactory.eINSTANCE.createUrgentType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return uppaalEditPlugin.INSTANCE;
	}

}
