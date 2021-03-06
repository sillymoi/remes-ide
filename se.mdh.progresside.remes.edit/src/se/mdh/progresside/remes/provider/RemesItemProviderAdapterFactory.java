/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import se.mdh.progresside.remes.util.RemesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemesItemProviderAdapterFactory extends RemesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.CompositeMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeModeItemProvider compositeModeItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.CompositeMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeModeAdapter() {
		if (compositeModeItemProvider == null) {
			compositeModeItemProvider = new CompositeModeItemProvider(this);
		}

		return compositeModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.ConditionalConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalConnectorItemProvider conditionalConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.ConditionalConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionalConnectorAdapter() {
		if (conditionalConnectorItemProvider == null) {
			conditionalConnectorItemProvider = new ConditionalConnectorItemProvider(this);
		}

		return conditionalConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.Edge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeItemProvider edgeItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEdgeAdapter() {
		if (edgeItemProvider == null) {
			edgeItemProvider = new EdgeItemProvider(this);
		}

		return edgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.InitEdge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitEdgeItemProvider initEdgeItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.InitEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitEdgeAdapter() {
		if (initEdgeItemProvider == null) {
			initEdgeItemProvider = new InitEdgeItemProvider(this);
		}

		return initEdgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.RemesDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemesDiagramItemProvider remesDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.RemesDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRemesDiagramAdapter() {
		if (remesDiagramItemProvider == null) {
			remesDiagramItemProvider = new RemesDiagramItemProvider(this);
		}

		return remesDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.SubMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubModeItemProvider subModeItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.SubMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubModeAdapter() {
		if (subModeItemProvider == null) {
			subModeItemProvider = new SubModeItemProvider(this);
		}

		return subModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.InitPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitPointItemProvider initPointItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.InitPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitPointAdapter() {
		if (initPointItemProvider == null) {
			initPointItemProvider = new InitPointItemProvider(this);
		}

		return initPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.EntryPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointItemProvider entryPointItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.EntryPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryPointAdapter() {
		if (entryPointItemProvider == null) {
			entryPointItemProvider = new EntryPointItemProvider(this);
		}

		return entryPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.ExitPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitPointItemProvider exitPointItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.ExitPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExitPointAdapter() {
		if (exitPointItemProvider == null) {
			exitPointItemProvider = new ExitPointItemProvider(this);
		}

		return exitPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.CompositeEntryPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeEntryPointItemProvider compositeEntryPointItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.CompositeEntryPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeEntryPointAdapter() {
		if (compositeEntryPointItemProvider == null) {
			compositeEntryPointItemProvider = new CompositeEntryPointItemProvider(this);
		}

		return compositeEntryPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.CompositeExitPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeExitPointItemProvider compositeExitPointItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.CompositeExitPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeExitPointAdapter() {
		if (compositeExitPointItemProvider == null) {
			compositeExitPointItemProvider = new CompositeExitPointItemProvider(this);
		}

		return compositeExitPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.Constant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantItemProvider constantItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantAdapter() {
		if (constantItemProvider == null) {
			constantItemProvider = new ConstantItemProvider(this);
		}

		return constantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.WriteEdge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteEdgeItemProvider writeEdgeItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.WriteEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWriteEdgeAdapter() {
		if (writeEdgeItemProvider == null) {
			writeEdgeItemProvider = new WriteEdgeItemProvider(this);
		}

		return writeEdgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link se.mdh.progresside.remes.WritePoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WritePointItemProvider writePointItemProvider;

	/**
	 * This creates an adapter for a {@link se.mdh.progresside.remes.WritePoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWritePointAdapter() {
		if (writePointItemProvider == null) {
			writePointItemProvider = new WritePointItemProvider(this);
		}

		return writePointItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (remesDiagramItemProvider != null) remesDiagramItemProvider.dispose();
		if (compositeModeItemProvider != null) compositeModeItemProvider.dispose();
		if (subModeItemProvider != null) subModeItemProvider.dispose();
		if (conditionalConnectorItemProvider != null) conditionalConnectorItemProvider.dispose();
		if (initPointItemProvider != null) initPointItemProvider.dispose();
		if (entryPointItemProvider != null) entryPointItemProvider.dispose();
		if (exitPointItemProvider != null) exitPointItemProvider.dispose();
		if (compositeEntryPointItemProvider != null) compositeEntryPointItemProvider.dispose();
		if (compositeExitPointItemProvider != null) compositeExitPointItemProvider.dispose();
		if (edgeItemProvider != null) edgeItemProvider.dispose();
		if (initEdgeItemProvider != null) initEdgeItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (constantItemProvider != null) constantItemProvider.dispose();
		if (writeEdgeItemProvider != null) writeEdgeItemProvider.dispose();
		if (writePointItemProvider != null) writePointItemProvider.dispose();
	}

}
