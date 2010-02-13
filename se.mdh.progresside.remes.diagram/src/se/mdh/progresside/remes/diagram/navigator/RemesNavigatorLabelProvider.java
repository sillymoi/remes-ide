package se.mdh.progresside.remes.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeEntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeExitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeNameEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConditionalConnectorEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConditionalConnectorNameEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EdgeActionGuardEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EdgeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint4EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint4EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitEdgeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitEdgeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.RemesDiagramEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Resource2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ResourceEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubMode2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeName2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeNameEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Variable2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Variable3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.VariableEditPart;
import se.mdh.progresside.remes.diagram.part.RemesDiagramEditorPlugin;
import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;
import se.mdh.progresside.remes.diagram.providers.RemesParserProvider;

/**
 * @generated
 */
public class RemesNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RemesDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RemesDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RemesNavigatorItem
				&& !isOwnView(((RemesNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RemesNavigatorGroup) {
			RemesNavigatorGroup group = (RemesNavigatorGroup) element;
			return RemesDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RemesNavigatorItem) {
			RemesNavigatorItem navigatorItem = (RemesNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (RemesVisualIDRegistry.getVisualID(view)) {
		case RemesDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?RemesDiagram", RemesElementTypes.RemesDiagram_1000); //$NON-NLS-1$
		case SubModeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?SubMode", RemesElementTypes.SubMode_2001); //$NON-NLS-1$
		case CompositeModeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?CompositeMode", RemesElementTypes.CompositeMode_2002); //$NON-NLS-1$
		case VariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?Variable", RemesElementTypes.Variable_3001); //$NON-NLS-1$
		case ResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?Resource", RemesElementTypes.Resource_3002); //$NON-NLS-1$
		case EntryPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?EntryPoint", RemesElementTypes.EntryPoint_3008); //$NON-NLS-1$
		case ExitPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?ExitPoint", RemesElementTypes.ExitPoint_3009); //$NON-NLS-1$
		case SubMode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?SubMode", RemesElementTypes.SubMode_3003); //$NON-NLS-1$
		case Variable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?Variable", RemesElementTypes.Variable_3004); //$NON-NLS-1$
		case Resource2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?Resource", RemesElementTypes.Resource_3005); //$NON-NLS-1$
		case EntryPoint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?EntryPoint", RemesElementTypes.EntryPoint_3010); //$NON-NLS-1$
		case ExitPoint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?ExitPoint", RemesElementTypes.ExitPoint_3011); //$NON-NLS-1$
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?ConditionalConnector", RemesElementTypes.ConditionalConnector_3006); //$NON-NLS-1$
		case EntryPoint3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?EntryPoint", RemesElementTypes.EntryPoint_3012); //$NON-NLS-1$
		case ExitPoint3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?ExitPoint", RemesElementTypes.ExitPoint_3013); //$NON-NLS-1$
		case Variable3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?Variable", RemesElementTypes.Variable_3007); //$NON-NLS-1$
		case EntryPoint4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?EntryPoint", RemesElementTypes.EntryPoint_3014); //$NON-NLS-1$
		case ExitPoint4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?ExitPoint", RemesElementTypes.ExitPoint_3015); //$NON-NLS-1$
		case CompositeEntryPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?CompositeEntryPoint", RemesElementTypes.CompositeEntryPoint_3016); //$NON-NLS-1$
		case CompositeExitPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?CompositeExitPoint", RemesElementTypes.CompositeExitPoint_3017); //$NON-NLS-1$
		case InitPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?InitPoint", RemesElementTypes.InitPoint_3018); //$NON-NLS-1$
		case EdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?Edge", RemesElementTypes.Edge_4001); //$NON-NLS-1$
		case InitEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.mdh.se/progresside/remes/1.2.0/remes.ecore?InitEdge", RemesElementTypes.InitEdge_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RemesDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RemesElementTypes.isKnownElementType(elementType)) {
			image = RemesElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof RemesNavigatorGroup) {
			RemesNavigatorGroup group = (RemesNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RemesNavigatorItem) {
			RemesNavigatorItem navigatorItem = (RemesNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RemesVisualIDRegistry.getVisualID(view)) {
		case RemesDiagramEditPart.VISUAL_ID:
			return getRemesDiagram_1000Text(view);
		case SubModeEditPart.VISUAL_ID:
			return getSubMode_2001Text(view);
		case CompositeModeEditPart.VISUAL_ID:
			return getCompositeMode_2002Text(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3001Text(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_3002Text(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3008Text(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3009Text(view);
		case SubMode2EditPart.VISUAL_ID:
			return getSubMode_3003Text(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_3004Text(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3005Text(view);
		case EntryPoint2EditPart.VISUAL_ID:
			return getEntryPoint_3010Text(view);
		case ExitPoint2EditPart.VISUAL_ID:
			return getExitPoint_3011Text(view);
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getConditionalConnector_3006Text(view);
		case EntryPoint3EditPart.VISUAL_ID:
			return getEntryPoint_3012Text(view);
		case ExitPoint3EditPart.VISUAL_ID:
			return getExitPoint_3013Text(view);
		case Variable3EditPart.VISUAL_ID:
			return getVariable_3007Text(view);
		case EntryPoint4EditPart.VISUAL_ID:
			return getEntryPoint_3014Text(view);
		case ExitPoint4EditPart.VISUAL_ID:
			return getExitPoint_3015Text(view);
		case CompositeEntryPointEditPart.VISUAL_ID:
			return getCompositeEntryPoint_3016Text(view);
		case CompositeExitPointEditPart.VISUAL_ID:
			return getCompositeExitPoint_3017Text(view);
		case InitPointEditPart.VISUAL_ID:
			return getInitPoint_3018Text(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		case InitEdgeEditPart.VISUAL_ID:
			return getInitEdge_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRemesDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSubMode_2001Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.SubMode_2001,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry.getType(SubModeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMode_2002Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.CompositeMode_2002,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry
						.getType(CompositeModeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariable_3001Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.Variable_3001,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry.getType(VariableEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResource_3002Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.Resource_3002,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry.getType(ResourceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryPoint_3008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getExitPoint_3009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSubMode_3003Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.SubMode_3003,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry.getType(SubModeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariable_3004Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.Variable_3004,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry.getType(Variable2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResource_3005Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.Resource_3005,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry.getType(Resource2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalConnector_3006Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.ConditionalConnector_3006,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry
						.getType(ConditionalConnectorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariable_3007Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.Variable_3007,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry.getType(Variable3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryPoint_3014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getExitPoint_3015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeEntryPoint_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeExitPoint_3017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInitPoint_3018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntryPoint_3012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getExitPoint_3013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntryPoint_3010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getExitPoint_3011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEdge_4001Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.Edge_4001, view.getElement() != null ? view
						.getElement() : view, RemesVisualIDRegistry
						.getType(EdgeActionGuardEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitEdge_4002Text(View view) {
		IParser parser = RemesParserProvider.getParser(
				RemesElementTypes.InitEdge_4002,
				view.getElement() != null ? view.getElement() : view,
				RemesVisualIDRegistry
						.getType(InitEdgeInitializationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RemesDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return RemesDiagramEditPart.MODEL_ID.equals(RemesVisualIDRegistry
				.getModelID(view));
	}

}
