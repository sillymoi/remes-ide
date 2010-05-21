package hr.fer.rasip.uppaallite.subdiagram.navigator;

import hr.fer.rasip.uppaallite.TemplateType;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeNameEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TemplateTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeAssignmentEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteDiagramEditorPlugin;
import hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry;
import hr.fer.rasip.uppaallite.subdiagram.providers.UppaalliteElementTypes;
import hr.fer.rasip.uppaallite.subdiagram.providers.UppaalliteParserProvider;

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

/**
 * @generated
 */
public class UppaalliteNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		UppaalliteDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		UppaalliteDiagramEditorPlugin
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
		if (element instanceof UppaalliteNavigatorItem
				&& !isOwnView(((UppaalliteNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof UppaalliteNavigatorGroup) {
			UppaalliteNavigatorGroup group = (UppaalliteNavigatorGroup) element;
			return UppaalliteDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof UppaalliteNavigatorItem) {
			UppaalliteNavigatorItem navigatorItem = (UppaalliteNavigatorItem) element;
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
		switch (UppaalliteVisualIDRegistry.getVisualID(view)) {
		case TemplateTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?TemplateType", UppaalliteElementTypes.TemplateType_1000); //$NON-NLS-1$
		case LocationTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?LocationType", UppaalliteElementTypes.LocationType_2001); //$NON-NLS-1$
		case LocationType2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?LocationType", UppaalliteElementTypes.LocationType_2002); //$NON-NLS-1$
		case LocationType3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?LocationType", UppaalliteElementTypes.LocationType_2003); //$NON-NLS-1$
		case LocationType4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?LocationType", UppaalliteElementTypes.LocationType_2004); //$NON-NLS-1$
		case LocationType5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?LocationType", UppaalliteElementTypes.LocationType_2005); //$NON-NLS-1$
		case LocationType6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?LocationType", UppaalliteElementTypes.LocationType_2006); //$NON-NLS-1$
		case TransitionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?TransitionType", UppaalliteElementTypes.TransitionType_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UppaalliteDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& UppaalliteElementTypes.isKnownElementType(elementType)) {
			image = UppaalliteElementTypes.getImage(elementType);
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
		if (element instanceof UppaalliteNavigatorGroup) {
			UppaalliteNavigatorGroup group = (UppaalliteNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UppaalliteNavigatorItem) {
			UppaalliteNavigatorItem navigatorItem = (UppaalliteNavigatorItem) element;
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
		switch (UppaalliteVisualIDRegistry.getVisualID(view)) {
		case TemplateTypeEditPart.VISUAL_ID:
			return getTemplateType_1000Text(view);
		case LocationTypeEditPart.VISUAL_ID:
			return getLocationType_2001Text(view);
		case LocationType2EditPart.VISUAL_ID:
			return getLocationType_2002Text(view);
		case LocationType3EditPart.VISUAL_ID:
			return getLocationType_2003Text(view);
		case LocationType4EditPart.VISUAL_ID:
			return getLocationType_2004Text(view);
		case LocationType5EditPart.VISUAL_ID:
			return getLocationType_2005Text(view);
		case LocationType6EditPart.VISUAL_ID:
			return getLocationType_2006Text(view);
		case TransitionTypeEditPart.VISUAL_ID:
			return getTransitionType_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTemplateType_1000Text(View view) {
		TemplateType domainModelElement = (TemplateType) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			UppaalliteDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocationType_2001Text(View view) {
		IParser parser = UppaalliteParserProvider.getParser(
				UppaalliteElementTypes.LocationType_2001,
				view.getElement() != null ? view.getElement() : view,
				UppaalliteVisualIDRegistry
						.getType(LocationTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UppaalliteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocationType_2002Text(View view) {
		IParser parser = UppaalliteParserProvider.getParser(
				UppaalliteElementTypes.LocationType_2002,
				view.getElement() != null ? view.getElement() : view,
				UppaalliteVisualIDRegistry
						.getType(LocationTypeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UppaalliteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocationType_2003Text(View view) {
		IParser parser = UppaalliteParserProvider.getParser(
				UppaalliteElementTypes.LocationType_2003,
				view.getElement() != null ? view.getElement() : view,
				UppaalliteVisualIDRegistry
						.getType(LocationTypeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UppaalliteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocationType_2004Text(View view) {
		IParser parser = UppaalliteParserProvider.getParser(
				UppaalliteElementTypes.LocationType_2004,
				view.getElement() != null ? view.getElement() : view,
				UppaalliteVisualIDRegistry
						.getType(LocationTypeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UppaalliteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocationType_2005Text(View view) {
		IParser parser = UppaalliteParserProvider.getParser(
				UppaalliteElementTypes.LocationType_2005,
				view.getElement() != null ? view.getElement() : view,
				UppaalliteVisualIDRegistry
						.getType(LocationTypeName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UppaalliteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocationType_2006Text(View view) {
		IParser parser = UppaalliteParserProvider.getParser(
				UppaalliteElementTypes.LocationType_2006,
				view.getElement() != null ? view.getElement() : view,
				UppaalliteVisualIDRegistry
						.getType(LocationTypeName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UppaalliteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransitionType_4001Text(View view) {
		IParser parser = UppaalliteParserProvider.getParser(
				UppaalliteElementTypes.TransitionType_4001,
				view.getElement() != null ? view.getElement() : view,
				UppaalliteVisualIDRegistry
						.getType(TransitionTypeAssignmentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UppaalliteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
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
		return TemplateTypeEditPart.MODEL_ID.equals(UppaalliteVisualIDRegistry
				.getModelID(view));
	}

}
