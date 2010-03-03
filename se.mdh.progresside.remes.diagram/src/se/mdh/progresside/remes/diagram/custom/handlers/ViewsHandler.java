package se.mdh.progresside.remes.diagram.custom.handlers;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import se.mdh.progresside.remes.diagram.part.RemesDiagramEditor;

public class ViewsHandler extends AbstractHandler {
	
	private static final String REMES_VIEWS_COMMAND_ID = "se.mdh.progresside.remes.diagram.views.showview.command";
	private static final String VIEW_PARAM_TYPE = "se.mdh.progresside.remes.diagram.views.showview.command.param";
	private static final String VIEW_PARAM_ALL = "se.mdh.progresside.remes.diagram.views.all";
	private static final String VIEW_PARAM_TIMING = "se.mdh.progresside.remes.diagram.views.timing";
	private static final String VIEW_PARAM_BEHAVIOUR = "se.mdh.progresside.remes.diagram.views.behaviour";
	private static final String VIEW_PARAM_RESOURCES = "se.mdh.progresside.remes.diagram.views.resources";
	
	/**
	 * The constructor.
	 */
	public ViewsHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String commandId = event.getCommand().getId();
		String viewType = event.getParameter(VIEW_PARAM_TYPE);
		System.out.println(commandId + " : "+ viewType);
		if (commandId == null || 
			!commandId.equals(REMES_VIEWS_COMMAND_ID) || 
			viewType == null){
			//nothing to do
			return null;
		}
		IEditorPart editorPart = HandlerUtil.getActiveEditor(event);
		if (editorPart instanceof RemesDiagramEditor){
			RemesDiagramEditor remesEditor = (RemesDiagramEditor) editorPart;
			GraphicalViewer remesViewer = remesEditor.getDiagramGraphicalViewer();
			Map editPartRegistryMap = remesViewer.getEditPartRegistry();
			
			if (viewType.equals(VIEW_PARAM_ALL)){
				processEditParts(editPartRegistryMap.values(), new RemesViewAllFilter());
			} else if (viewType.equals(VIEW_PARAM_BEHAVIOUR)){
				processEditParts(editPartRegistryMap.values(), new RemesViewBehaviourFilter());
			} else if (viewType.equals(VIEW_PARAM_RESOURCES)){
				processEditParts(editPartRegistryMap.values(), new RemesViewResourcesFilter());
			} else if (viewType.equals(VIEW_PARAM_TIMING)){
				processEditParts(editPartRegistryMap.values(), new RemesViewTimingFilter());
			} else {
				//Unknown parameter
				return null;
			}
		}
		return null;
	}
	
	private void processEditParts(Collection editParts, IRemesViewsFilter filter) {
		Iterator editPartsIterator = editParts.iterator();
		while (editPartsIterator.hasNext()){
			Object value = editPartsIterator.next();
			if (value instanceof AbstractGraphicalEditPart){
				IFigure figure = ((AbstractGraphicalEditPart) value).getFigure();
				figure.setVisible(filter.isVisible(value));
			}
		}
	}
}
