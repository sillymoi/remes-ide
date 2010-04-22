package hr.fer.rasip.uppaallite.diagram.part;

import hr.fer.rasip.uppaallite.diagram.providers.UppaalliteElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createTemplateType1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateType1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UppaalliteElementTypes.TemplateType_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TemplateType1CreationTool_title,
				Messages.TemplateType1CreationTool_desc, types);
		entry.setId("createTemplateType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UppaalliteElementTypes
				.getImageDescriptor(UppaalliteElementTypes.TemplateType_2001));
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
}
