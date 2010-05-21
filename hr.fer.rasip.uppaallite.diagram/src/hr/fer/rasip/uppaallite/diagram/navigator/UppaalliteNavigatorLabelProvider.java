package hr.fer.rasip.uppaallite.diagram.navigator;

import hr.fer.rasip.uppaallite.UppaalDiagram;
import hr.fer.rasip.uppaallite.diagram.edit.parts.TemplateTypeEditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.TemplateTypeNameEditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.UppaalDiagramEditPart;
import hr.fer.rasip.uppaallite.diagram.part.UppaalliteDiagramEditorPlugin;
import hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry;
import hr.fer.rasip.uppaallite.diagram.providers.UppaalliteElementTypes;
import hr.fer.rasip.uppaallite.diagram.providers.UppaalliteParserProvider;

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
		case UppaalDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?UppaalDiagram", UppaalliteElementTypes.UppaalDiagram_1000); //$NON-NLS-1$
		case TemplateTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.rasip.fer.hr/remes/1.2.0/uppaallite.ecore?TemplateType", UppaalliteElementTypes.TemplateType_2001); //$NON-NLS-1$
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
		case UppaalDiagramEditPart.VISUAL_ID:
			return getUppaalDiagram_1000Text(view);
		case TemplateTypeEditPart.VISUAL_ID:
			return getTemplateType_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getUppaalDiagram_1000Text(View view) {
		UppaalDiagram domainModelElement = (UppaalDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDeclaration();
		} else {
			UppaalliteDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateType_2001Text(View view) {
		IParser parser = UppaalliteParserProvider.getParser(
				UppaalliteElementTypes.TemplateType_2001,
				view.getElement() != null ? view.getElement() : view,
				UppaalliteVisualIDRegistry
						.getType(TemplateTypeNameEditPart.VISUAL_ID));
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
		return UppaalDiagramEditPart.MODEL_ID.equals(UppaalliteVisualIDRegistry
				.getModelID(view));
	}

}
