package se.mdh.progresside.remes.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import se.mdh.progresside.remes.diagram.edit.parts.CompositeEntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeExitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConditionalConnectorEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint4EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint4EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.RemesDiagramEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubMode2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeEditPart;
import se.mdh.progresside.remes.diagram.part.Messages;
import se.mdh.progresside.remes.diagram.part.RemesDiagramEditorPlugin;

/**
 * @generated
 */
public class RemesModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof SubModeEditPart) {
			ArrayList types = new ArrayList(5);
			types.add(RemesElementTypes.EntryPoint_3024);
			types.add(RemesElementTypes.ExitPoint_3025);
			types.add(RemesElementTypes.Constant_3041);
			types.add(RemesElementTypes.Variable_3022);
			types.add(RemesElementTypes.Resource_3023);
			return types;
		}
		if (editPart instanceof CompositeModeEditPart) {
			ArrayList types = new ArrayList(6);
			types.add(RemesElementTypes.EntryPoint_3035);
			types.add(RemesElementTypes.ExitPoint_3036);
			types.add(RemesElementTypes.InitPoint_3039);
			types.add(RemesElementTypes.Constant_3043);
			types.add(RemesElementTypes.Variable_3034);
			types.add(RemesElementTypes.Resource_3040);
			return types;
		}
		if (editPart instanceof SubMode2EditPart) {
			ArrayList types = new ArrayList(5);
			types.add(RemesElementTypes.EntryPoint_3029);
			types.add(RemesElementTypes.ExitPoint_3030);
			types.add(RemesElementTypes.Constant_3042);
			types.add(RemesElementTypes.Variable_3027);
			types.add(RemesElementTypes.Resource_3028);
			return types;
		}
		if (editPart instanceof ConditionalConnectorEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(RemesElementTypes.EntryPoint_3032);
			types.add(RemesElementTypes.ExitPoint_3033);
			return types;
		}
		if (editPart instanceof CompositeModeCompositeModeCompartmentEditPart) {
			ArrayList types = new ArrayList(4);
			types.add(RemesElementTypes.SubMode_3026);
			types.add(RemesElementTypes.ConditionalConnector_3031);
			types.add(RemesElementTypes.CompositeEntryPoint_3037);
			types.add(RemesElementTypes.CompositeExitPoint_3038);
			return types;
		}
		if (editPart instanceof RemesDiagramEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(RemesElementTypes.SubMode_2007);
			types.add(RemesElementTypes.CompositeMode_2008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ExitPointEditPart) {
			return ((ExitPointEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExitPoint2EditPart) {
			return ((ExitPoint2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExitPoint3EditPart) {
			return ((ExitPoint3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExitPoint4EditPart) {
			return ((ExitPoint4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeEntryPointEditPart) {
			return ((CompositeEntryPointEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InitPointEditPart) {
			return ((InitPointEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof EntryPointEditPart) {
			return ((EntryPointEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EntryPoint2EditPart) {
			return ((EntryPoint2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EntryPoint3EditPart) {
			return ((EntryPoint3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EntryPoint4EditPart) {
			return ((EntryPoint4EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompositeExitPointEditPart) {
			return ((CompositeExitPointEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ExitPointEditPart) {
			return ((ExitPointEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExitPoint2EditPart) {
			return ((ExitPoint2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExitPoint3EditPart) {
			return ((ExitPoint3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExitPoint4EditPart) {
			return ((ExitPoint4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeEntryPointEditPart) {
			return ((CompositeEntryPointEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InitPointEditPart) {
			return ((InitPointEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof EntryPointEditPart) {
			return ((EntryPointEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EntryPoint2EditPart) {
			return ((EntryPoint2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EntryPoint3EditPart) {
			return ((EntryPoint3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EntryPoint4EditPart) {
			return ((EntryPoint4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompositeExitPointEditPart) {
			return ((CompositeExitPointEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ExitPointEditPart) {
			return ((ExitPointEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExitPoint2EditPart) {
			return ((ExitPoint2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExitPoint3EditPart) {
			return ((ExitPoint3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExitPoint4EditPart) {
			return ((ExitPoint4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeEntryPointEditPart) {
			return ((CompositeEntryPointEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InitPointEditPart) {
			return ((InitPointEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				RemesDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.RemesModelingAssistantProviderMessage);
		dialog.setTitle(Messages.RemesModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
