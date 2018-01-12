/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.ui.presentation;

import hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugTarget;
import hr.fer.rasip.remes.simulator.debug.core.model.SimulatorStackFrame;
import hr.fer.rasip.remes.simulator.debug.core.model.SimulatorThread;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.ui.IDebugEditorPresentation;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.FileEditorInput;

import se.mdh.progresside.remes.diagram.part.RemesDiagramEditor;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugModelPresentation implements IDebugModelPresentation, IDebugEditorPresentation {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.IDebugModelPresentation#computeDetail(org.eclipse.debug.core.model.IValue, org.eclipse.debug.ui.IValueDetailListener)
	 */
	@Override
	public void computeDetail(IValue value, IValueDetailListener listener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.IDebugModelPresentation#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		try {
			if (element instanceof SimulatorDebugTarget) {
				return ((SimulatorDebugTarget)element).getName();
			} else if (element instanceof SimulatorThread) {
				return ((SimulatorThread)element).getName();
			} else if (element instanceof SimulatorStackFrame) {
				return ((SimulatorStackFrame)element).getName();
			}
		} catch(DebugException e) {
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.IDebugModelPresentation#setAttribute(java.lang.String, java.lang.Object)
	 */
	@Override
	public void setAttribute(String attribute, Object value) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ISourcePresentation#getEditorId(org.eclipse.ui.IEditorInput, java.lang.Object)
	 */
	@Override
	public String getEditorId(IEditorInput input, Object element) {
		if (element instanceof IFile || element instanceof ILineBreakpoint) {
			return "se.mdh.progresside.remes.diagram.part.RemesDiagramEditorID";
			//return "org.eclipse.jdt.ui.CompilationUnitEditor";
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ISourcePresentation#getEditorInput(java.lang.Object)
	 */
	@Override
	public IEditorInput getEditorInput(Object element) {
		if (element instanceof IFile) {
			return new FileEditorInput((IFile)element);
		}
		if (element instanceof ILineBreakpoint) {
			return new FileEditorInput((IFile)((ILineBreakpoint)element).getMarker().getResource());
		}
		return null;
	}

	@Override
	public Image getImage(Object element) {
		return null;
	}

	@Override
	public boolean addAnnotations(IEditorPart editorPart, IStackFrame frame) {
		if (editorPart instanceof RemesDiagramEditor && frame instanceof SimulatorStackFrame) {
			RemesDiagramEditor remesEditor = (RemesDiagramEditor) editorPart;
			SimulatorStackFrame simulatorStackFrame = (SimulatorStackFrame) frame;			

			remesEditor.selectAndReveal(simulatorStackFrame.getIdentifier());
			
//			Node node = null;
//			FlowchartPage page = null;
			
//			int i = -1;
//			while (node == null && i < getPageCount() - 1) {                
//			    page = (FlowchartPage) getEditor(++i);
//			    node = FlowchartUtils.getNode(page.getFlowchart(),nodeId);                
//			}
//			setActivePage(i);
			
//			EditPart editPart = (EditPart) page.getGraphicalViewer().getEditPartRegistry().get(node);
//			page.getGraphicalViewer().select(editPart);
//			page.getGraphicalViewer().reveal(editPart);

//			EditPart editPart = (EditPart) remesEditor.getGraphicalViewer
			
			
	/*		if (editPart instanceof FlowchartNodeEditPart) {
				((FlowchartNodeEditPart)editPart).setStepping(stepping);
			}
	*/
			
//			String nodeId = simulatorStackFrame.getNodeId();
//			if (nodeId == null) {
//				System.out.println("Missing node mapping.");
//			} else {
//				flowchartEditor.selectAndReveal(nodeId/*, true*/);
//			}
		}

		return true;
	}

	@Override
	public void removeAnnotations(IEditorPart editorPart, IThread thread) {
		thread = null;
//		if (editorPart instanceof FlowchartEditor &&
//				thread instanceof FlowchartThread) {
//						
//			FlowchartEditor flowchartEditor = (FlowchartEditor) editorPart;
//			IStackFrame[] frames = new IStackFrame[0];
//			try {
//				frames = thread.getStackFrames();
//			} catch (DebugException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			for (int i = 0; i < frames.length; i++) {
//				FlowchartStackFrame flowchartStackFrame = (FlowchartStackFrame) frames[i];
//				String nodeId = flowchartStackFrame.getNodeId();			
//				flowchartEditor.selectAndReveal(nodeId, false);
//			}
//		}

	}

}
