package se.mdh.progresside.uppaal.views;


import java.io.FileOutputStream;

import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import se.mdh.progresside.uppaal.Activator;


public class GraphicalSimulatorView extends ViewPart {

	public static final String ID = "se.mdh.progresside.uppaal.views.GraphicalSimulatorView";

	private Action action1;
	private Action action2;
	private Action doubleClickAction;

	private GraphicalSimulatorViewer viewer;

	public GraphicalSimulatorView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
//		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "se.mdh.progresside.uppaal.viewer");
		
		Canvas canvas = new Canvas(parent, SWT.NULL);	    
	    LightweightSystem lws = new LightweightSystem(canvas);
		viewer = new GraphicalSimulatorViewer();
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setContents(viewer);
		lws.setContents(scrollPane);
		
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				GraphicalSimulatorView.this.fillContextMenu(manager);
			}
		});
//		Menu menu = menuMgr.createContextMenu(viewer.getControl());
//		viewer.getControl().setMenu(menu);
//		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				exportImageAsSvg();
				showMessage("Image exported as SVG");
			}
		};
		action1.setText("Export SVG...");
		action1.setToolTipText("Exports trace to a SVG file");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
//				ISelection selection = viewer.getSelection();
//				Object obj = ((IStructuredSelection)selection).getFirstElement();
//				showMessage("Double-click detected on "+obj.toString());
			}
		};
	}

	protected void exportImageAsSvg() {
		// Get SVG file name
		FileDialog dialog = new FileDialog (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.SAVE);
		String [] filterNames = new String [] {"SVG Files", "All Files (*)"};
		String [] filterExtensions = new String [] {"*.svg", "*"};
		String filterPath = ".";
		String platform = SWT.getPlatform();
		if (platform.equals("win32") || platform.equals("wpf")) {
			filterNames = new String [] {"Image Files", "All Files (*.*)"};
			filterExtensions = new String [] {"*.svg", "*.*"};
		}
		dialog.setFilterNames(filterNames);
		dialog.setFilterExtensions(filterExtensions);
		dialog.setFilterPath(filterPath);
		dialog.setFileName("trace");
		
		try {
			String fileName = dialog.open();
			if(fileName != null) {
				// Save SVG
				FileOutputStream fos = new FileOutputStream(fileName);
				SVGImageExporter.export(viewer, fos);
				fos.close();
			}
		} catch(Exception e) {
			Activator.getDefault().logError("Unable to export SVG", e);
		}
	}

	private void hookDoubleClickAction() {
//		viewer.addDoubleClickListener(new IDoubleClickListener() {
//			public void doubleClick(DoubleClickEvent event) {
//				doubleClickAction.run();
//			}
//		});
	}
	private void showMessage(String message) {
//		MessageDialog.openInformation(
//			viewer.getControl().getShell(),
//			"Graphical Simulation Trace",
//			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		
	}

	public void initialize(Trace trace) {
		viewer.setTrace(trace);
	}
}