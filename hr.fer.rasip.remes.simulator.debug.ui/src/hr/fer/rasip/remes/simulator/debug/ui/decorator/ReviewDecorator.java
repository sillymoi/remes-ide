/******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package hr.fer.rasip.remes.simulator.debug.ui.decorator;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.contexts.DebugContextEvent;
import org.eclipse.debug.ui.contexts.IDebugContextListener;

import hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugTarget;
import hr.fer.rasip.remes.simulator.debug.core.model.SimulatorStackFrame;
import hr.fer.rasip.remes.simulator.debug.core.model.SimulatorThread;
import hr.fer.rasip.remes.simulator.debug.ui.Activator;

/**
 * @author sshaw
 * 
 * Example provider for the Decorator service that will selectively decorate
 * depending on what the content of the description style field is.
 * 
 * The example will annotate a node view with an icon on the top middle of the shape
 * depending on the following conditions:
 * 
 * 1. If the description style contains the word "Passed" a checkbox will appear on top of the shape
 * 2. If the description style contains the word "Failed" an error box will appear on top of the shape
 * 3. If the description style doesn't meet the conditions in (1.) or (2.) then no decoration will appear.
 */
public class ReviewDecorator implements IDecorator, IDebugContextListener { 

	/** the object to be decorated */
	private IDecoratorTarget decoratorTarget;

	/** the decoration being displayed */
	private IDecoration decoration;

	private static final Image ICON_FAILED;

	private static final Image ICON_PASSED;

	static {
		/*
		 * prefix path with "$nl$" and use Plugin.find() to search for the
		 * locale specific file
		 */
		IPath path = new Path("$nl$").append( //$NON-NLS-1$
				"icons//failed.gif"); //$NON-NLS-1$
        URL url = FileLocator.find(Activator.getDefault().getBundle(), path, null);
        ImageDescriptor imgDesc = ImageDescriptor.createFromURL(url);
		ICON_FAILED = imgDesc.createImage();

		path = new Path("$nl$").append( //$NON-NLS-1$
				"icons//passed.gif"); //$NON-NLS-1$
     
        url = FileLocator.find(Activator.getDefault().getBundle(), path, null);
		imgDesc = ImageDescriptor.createFromURL(url);
		ICON_PASSED = imgDesc.createImage();
	}

	/**
	 * Creates a new <code>AbstractDecorator</code> for the decorator target
	 * passed in.
	 * 
	 * @param decoratorTarget
	 *            the object to be decorated
	 */
	public ReviewDecorator(IDecoratorTarget decoratorTarget) {
		this.decoratorTarget = decoratorTarget;
		DebugUITools.getDebugContextManager().addDebugContextListener(this);
	}

	/**
	 * Gets the object to be decorated.
	 * 
	 * @return Returns the object to be decorated
	 */
	protected IDecoratorTarget getDecoratorTarget() {
		return decoratorTarget;
	}

	/**
	 * @return Returns the decoration.
	 */
	public IDecoration getDecoration() {
		return decoration;
	}

	/**
	 * @param decoration
	 *            The decoration to set.
	 */
	public void setDecoration(IDecoration decoration) {
		this.decoration = decoration;
	}

	/**
	 * Removes the decoration if it exists and sets it to null.
	 */
	protected void removeDecoration() {
		if (decoration != null) {
			decoratorTarget.removeDecoration(decoration);
			decoration = null;
		}
	}

	/**
	 * getDecoratorTargetClassifier Utility method to determine if the
	 * decoratorTarget is a supported type for this decorator and return the
	 * associated Classifier element.
	 * 
	 * @param decoratorTarget
	 *            IDecoratorTarget to check and return valid Classifier target.
	 * @return node Node if IDecoratorTarget can be supported, null
	 *         otherwise.
	 */
	static public Node getDecoratorTargetNode(IDecoratorTarget decoratorTarget) {
		DescriptionStyle descStyle = null;
		View node = (View) decoratorTarget.getAdapter(View.class);
		
		if(node != null && 
			(node.getElement().eClass().getInstanceClassName().equals("se.mdh.progresside.remes.CompositeMode") ||
					node.getElement().eClass().getInstanceClassName().equals("se.mdh.progresside.remes.SubMode"))
		  &&(node.getType().equals("2008") || node.getType().equals("2007") || node.getType().equals("3026"))) {
//			descStyle = (DescriptionStyle)node.getStyle(NotationPackage.eINSTANCE.getDescriptionStyle());			 
			
//			if (descStyle != null) {
//				return (Node)node;
//			}
			return (Node) node;
		}
		return null;

	}


	/**
	 * Creates the appropriate review decoration if all the criteria is
	 * satisfied by the view passed in.
	 */
	public void refresh() {
		removeDecoration();

		SimulatorStackFrame frame = getDebugStackFrame();
		
		if(frame != null) {
			Node node = getDecoratorTargetNode(getDecoratorTarget());

			if(node != null) {
				if(getXmiId(node.getElement()).equals(frame.getIdentifier())) {
					setDecoration(getDecoratorTarget().addShapeDecoration((frame.isTopFrame()) ? ICON_PASSED : ICON_FAILED, IDecoratorTarget.Direction.NORTH, -5, true));
				}
			}
		}
	}

	protected String getXmiId(EObject obj) {
		String id = null;
		Resource res = obj.eResource();
		
		if(res instanceof XMIResource) {
			XMIResource xmi = (XMIResource) res;
			id = xmi.getID(obj);
		}
		
		return id;
	}
	
	/**
	 * @param frame
	 * @return
	 */
	protected SimulatorStackFrame getDebugStackFrame() {
//		ISelection selection = DebugUITools.getDebugContextManager().getContextService( window ).getActiveContext();
//        if ( selection instanceof IStructuredSelection ) {
//            Object element = ((IStructuredSelection)selection).getFirstElement();
//            if ( element instanceof IAdaptable )
//                return (ISteppingModeTarget)((IAdaptable)element).getAdapter( ISteppingModeTarget.class );
//        }
//        return null;
		
		
		IAdaptable debugContext = DebugUITools.getDebugContext();
		SimulatorStackFrame frame = null;
		
	    if (debugContext instanceof SimulatorStackFrame) {
	       frame = (SimulatorStackFrame) debugContext;
	    } else if (debugContext instanceof SimulatorThread) {
	    	SimulatorThread thread = (SimulatorThread) debugContext;
	        try {
	            frame = (SimulatorStackFrame) thread.getTopStackFrame();
	        } catch (DebugException e) {
	            return null;
	        }
	    } else if (debugContext instanceof SimulatorDebugTarget) {
	        SimulatorDebugTarget target = (SimulatorDebugTarget) debugContext;
	        try {
	            IThread[] threads = target.getThreads();
	            if (threads.length > 0) {
	                frame = (SimulatorStackFrame) threads[0].getTopStackFrame();
	            }
	        } catch (DebugException e) {
	            return null;
	        }
	    }
		return frame;
	}

	/**
	 * getDescriptionStyle
	 * Accessor to retrieve the description style from a Node.
	 * 
	 * @param node Node to retrieve the description style from.
	 * @return DescriptionStyle style object
	 */
	private DescriptionStyle getDescriptionStyle(Node node) {
		return (DescriptionStyle)node.getStyle(NotationPackage.eINSTANCE.getDescriptionStyle());			 
	}

	private NotificationListener notificationListener = new NotificationListener() {

        /* (non-Javadoc)
         * @see org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener#notifyChanged(org.eclipse.emf.common.notify.Notification)
         */
        public void notifyChanged(Notification notification) {
            refresh();
        }
	};
	
	/**
	 * Adds decoration if applicable.
	 */
	public void activate() {
		
        IGraphicalEditPart gep = (IGraphicalEditPart)getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
        assert gep != null;

        DebugUITools.getDebugContextManager().addDebugContextListener(this);
//        DiagramEventBroker.getInstance(gep.getEditingDomain()).addNotificationListener(gep.getNotationView(), 
//                NotationPackage.eINSTANCE.getDescriptionStyle_Description(), notificationListener);
	}

	/**
	 * Removes the decoration.
	 */
	public void deactivate() {
		removeDecoration();

        IGraphicalEditPart gep = (IGraphicalEditPart)getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
        assert gep != null;
        
//        DiagramEventBroker.getInstance(gep.getEditingDomain()).removeNotificationListener(gep.getNotationView(),NotationPackage.eINSTANCE.getDescriptionStyle_Description(), notificationListener);
        DebugUITools.getDebugContextManager().removeDebugContextListener(this);
	}

	@Override
	public void debugContextChanged(DebugContextEvent event) {
		refresh();
	}
	
}