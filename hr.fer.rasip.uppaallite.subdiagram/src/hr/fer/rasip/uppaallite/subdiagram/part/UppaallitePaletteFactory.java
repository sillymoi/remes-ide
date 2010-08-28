package hr.fer.rasip.uppaallite.subdiagram.part;

import hr.fer.rasip.uppaallite.subdiagram.providers.UppaalliteElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class UppaallitePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createUppaallite1Group());
	}

	/**
	 * Creates "uppaallite" palette tool group
	 * @generated
	 */
	private PaletteContainer createUppaallite1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Uppaallite1Group_title);
		paletteContainer.setId("createUppaallite1Group"); //$NON-NLS-1$
		paletteContainer.add(createLocationType1CreationTool());
		paletteContainer.add(createTransitionType2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLocationType1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UppaalliteElementTypes.LocationType_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LocationType1CreationTool_title,
				Messages.LocationType1CreationTool_desc, types);
		entry.setId("createLocationType1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(UppaalliteDiagramEditorPlugin
						.findImageDescriptor("/hr.fer.rasip.uppaallite.subdiagram/icons/locationCreationToolIcon.jpeg")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransitionType2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UppaalliteElementTypes.TransitionType_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TransitionType2CreationTool_title,
				Messages.TransitionType2CreationTool_desc, types);
		entry.setId("createTransitionType2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(UppaalliteDiagramEditorPlugin
						.findImageDescriptor("/hr.fer.rasip.uppaallite.subdiagram/icons/transitionCreationToolIcon.JPG")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
