package se.mdh.progresside.remes.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class RemesPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createNodes2Group());
		paletteRoot.add(createEdges3Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(createVariable1CreationTool());
		paletteContainer.add(createResource2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Nodes2Group_title);
		paletteContainer.setId("createNodes2Group"); //$NON-NLS-1$
		paletteContainer.add(createSubMode1CreationTool());
		paletteContainer.add(createConditionalConnector2CreationTool());
		paletteContainer.add(createCompositeMode3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Edges" palette tool group
	 * @generated
	 */
	private PaletteContainer createEdges3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Edges3Group_title);
		paletteContainer.setId("createEdges3Group"); //$NON-NLS-1$
		paletteContainer.add(createEdge1CreationTool());
		paletteContainer.add(createInitEdge2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariable1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(RemesElementTypes.Variable_3022);
		types.add(RemesElementTypes.Variable_3027);
		types.add(RemesElementTypes.Variable_3034);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Variable1CreationTool_title,
				Messages.Variable1CreationTool_desc, types);
		entry.setId("createVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RemesElementTypes
				.getImageDescriptor(RemesElementTypes.Variable_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(RemesElementTypes.Resource_3023);
		types.add(RemesElementTypes.Resource_3028);
		types.add(RemesElementTypes.Resource_3040);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Resource2CreationTool_title,
				Messages.Resource2CreationTool_desc, types);
		entry.setId("createResource2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RemesElementTypes
				.getImageDescriptor(RemesElementTypes.Resource_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubMode1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(RemesElementTypes.SubMode_2007);
		types.add(RemesElementTypes.SubMode_3026);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SubMode1CreationTool_title,
				Messages.SubMode1CreationTool_desc, types);
		entry.setId("createSubMode1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(RemesDiagramEditorPlugin
						.findImageDescriptor("/se.mdh.progresside.remes.diagram/icons/submode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionalConnector2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RemesElementTypes.ConditionalConnector_3031);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConditionalConnector2CreationTool_title,
				Messages.ConditionalConnector2CreationTool_desc, types);
		entry.setId("createConditionalConnector2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(RemesDiagramEditorPlugin
						.findImageDescriptor("/se.mdh.progresside.remes.diagram/icons/conditionalconnector.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeMode3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RemesElementTypes.CompositeMode_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CompositeMode3CreationTool_title,
				Messages.CompositeMode3CreationTool_desc, types);
		entry.setId("createCompositeMode3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(RemesDiagramEditorPlugin
						.findImageDescriptor("/se.mdh.progresside.remes.diagram/icons/compositemode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdge1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RemesElementTypes.Edge_4028);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Edge1CreationTool_title,
				Messages.Edge1CreationTool_desc, types);
		entry.setId("createEdge1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(RemesDiagramEditorPlugin
						.findImageDescriptor("/se.mdh.progresside.remes.diagram/icons/InternalEdge.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitEdge2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(RemesElementTypes.InitEdge_4029);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InitEdge2CreationTool_title,
				Messages.InitEdge2CreationTool_desc, types);
		entry.setId("createInitEdge2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(RemesDiagramEditorPlugin
						.findImageDescriptor("/se.mdh.progresside.remes.diagram/icons/initEdge.gif")); //$NON-NLS-1$
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
