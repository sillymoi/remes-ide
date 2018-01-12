package se.mdh.progresside.uppaal.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.part.ViewPart;

import se.mdh.progresside.uppaal.Activator;
import se.mdh.progresside.uppaal.preferences.PreferenceConstants;
import se.mdh.progresside.uppaal.preferences.UppaalPreferencePage;

import com.uppaal.engine.Engine;
import com.uppaal.model.system.Transition;

public class SimulatorView extends ViewPart {

	private class Simulator implements Runnable {

		private boolean running;

		private long stepDelay = 1000;

		public Simulator() {
			IPreferenceStore preferenceStore = Activator.getDefault()
					.getPreferenceStore();
			stepDelay = preferenceStore
					.getInt(PreferenceConstants.UPPAAL_SIM_DELAY);
			preferenceStore
					.addPropertyChangeListener(new IPropertyChangeListener() {

						@Override
						public void propertyChange(PropertyChangeEvent event) {
							if (PreferenceConstants.UPPAAL_SIM_DELAY
									.equals(event.getProperty())) {
								stepDelay = (Integer) event.getNewValue();
							}
						}
					});
		}

		public void run() {
			setRunning(true);
			switchStartStopButton(true);
			Random randomGenerator = new Random();
			List<Transition> enabledTransitions = getEnabledTransitions();
			Display display = getSite().getShell().getDisplay();

			while (isRunning() && !enabledTransitions.isEmpty()) {
				int nextTransitionIndex = randomGenerator
						.nextInt(enabledTransitions.size());
				final Transition nextTransition = enabledTransitions
						.get(nextTransitionIndex);

				display.syncExec(new Runnable() {

					@Override
					public void run() {
						transitionsViewer.setSelection(new StructuredSelection(
								nextTransition));
					}
				});

				try {
					Thread.sleep(stepDelay / 2);
				} catch (InterruptedException e) {
					setRunning(false);
					Activator.getDefault().logInfo(
							"Simulator sleep was interrupted");
				}

				display.syncExec(new Runnable() {

					@Override
					public void run() {
						addElementToTrace(new TraceElement(nextTransition
								.getTarget(), nextTransition));
					}
				});

				try {
					Thread.sleep(stepDelay / 2);
				} catch (InterruptedException e) {
					setRunning(false);
					Activator.getDefault().logInfo(
							"Simulator sleep was interrupted");
				}

				enabledTransitions = getEnabledTransitions();
			}

			stop();
		}

		private List<Transition> getEnabledTransitions() {

			final List<Transition> result = new ArrayList<Transition>();

			getSite().getShell().getDisplay().syncExec(new Runnable() {

				@Override
				public void run() {
					for (int i = 0; i < transitionsViewer.getTable()
							.getItemCount(); i++) {
						Transition transition = (Transition) transitionsViewer
								.getElementAt(i);
						if (transition.getTarget() != null) {
							result.add(transition);
						}
					}
				}
			});

			return result;
		}

		public void stop() {
			setRunning(false);
			switchStartStopButton(false);
		}

		public void setRunning(boolean running) {
			this.running = running;
		}

		public boolean isRunning() {
			return running;
		}

	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "se.mdh.progresside.uppaal.views.SimulatorView";

	private TransitionsViewer transitionsViewer;
	private TraceViewer traceViewer;

	private Action startStopAction;
	private Action configDelayAction;
	private Action doubleClickAction;

	private Trace trace;

	private Simulator simulator = new Simulator();

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {

		SashForm sash = new SashForm(parent, SWT.VERTICAL);

		Composite traceComposite = new Composite(sash, SWT.NONE);
		traceComposite.setLayout(new GridLayout(1, false));

		Label traceViewerTitle = new Label(traceComposite, SWT.NONE);
		traceViewerTitle.setText("Simulation Trace:");
		GridDataFactory.swtDefaults().applyTo(traceViewerTitle);

		traceViewer = new TraceViewer(traceComposite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(
				traceViewer.getControl());

		traceViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();

						if (selection.isEmpty()) {
							// no transitions are shown
							transitionsViewer.setInput(null);
						} else {
							TraceElement traceElement = (TraceElement) selection
									.getFirstElement();
							VariablesView variablesView = (VariablesView) getSite()
									.getPage().findView(VariablesView.ID);
							if (variablesView != null) {
								variablesView.init(trace.getUppaalSystem(),
										traceElement.getState());
							}
							transitionsViewer.setInput(traceElement.getState());
						}
					}
				});

		Composite transitionsComposite = new Composite(sash, SWT.NONE);
		transitionsComposite.setLayout(new GridLayout(1, false));

		Label transitionsViewerTitle = new Label(transitionsComposite, SWT.NONE);
		transitionsViewerTitle.setText("Enabled Transitions:");
		GridDataFactory.swtDefaults().applyTo(transitionsViewerTitle);

		transitionsViewer = new TransitionsViewer(transitionsComposite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(
				transitionsViewer.getControl());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(
				transitionsViewer.getControl(),
				"se.mdh.progresside.uppaal.launch.verifier.querytab");
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
				SimulatorView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(transitionsViewer.getControl());
		transitionsViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, transitionsViewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(startStopAction);
		manager.add(new Separator());
		manager.add(configDelayAction);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(startStopAction);
		manager.add(configDelayAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(startStopAction);
		manager.add(configDelayAction);
	}

	private void makeActions() {
		startStopAction = new Action() {
			public void run() {
				if (simulator.isRunning()) {
					simulator.stop();
				} else {
					startSimulator();
				}
			}
		};
		switchStartStopButton(false);

		configDelayAction = new Action() {
			public void run() {
				PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(getSite().getShell(),
						UppaalPreferencePage.ID, new String[0], null);
				dialog.open();
			}
		};
		configDelayAction.setText("Config speed");
		configDelayAction.setToolTipText("Config simulation speed");
		configDelayAction.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages().getImageDescriptor(
						ISharedImages.IMG_OBJS_INFO_TSK));

		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = transitionsViewer.getSelection();
				Transition transition = (Transition) ((IStructuredSelection) selection)
						.getFirstElement();
				if (transition != null && transition.getTarget() != null) {
					addElementToTrace(new TraceElement(transition.getTarget(),
							transition));
				}
			}
		};
	}

	private void switchStartStopButton(boolean started) {
		if (started) {
			startStopAction.setText("Stop");
			startStopAction.setImageDescriptor(PlatformUI.getWorkbench()
					.getSharedImages().getImageDescriptor(
							ISharedImages.IMG_ELCL_STOP));
		} else {
			startStopAction.setText("Start");
			startStopAction.setImageDescriptor(Activator.getDefault()
					.getImageRegistry().getDescriptor(Activator.RUN_ICON_KEY));
		}
	}

	private void hookDoubleClickAction() {
		transitionsViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(
				transitionsViewer.getControl().getShell(), "Upaal Simulator",
				message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		getSite().setSelectionProvider(traceViewer);
		transitionsViewer.getControl().setFocus();
	}

	public void initialize(Engine engine, Trace trace) {
		this.trace = trace;
		traceViewer.setInput(trace);
		transitionsViewer.init(engine, trace.getUppaalSystem());
	}

	private void addElementToTrace(TraceElement element) {
		if (trace.addTraceElement(element)) {
			traceViewer.setSelection(new StructuredSelection(element));
		}
	}

	public void startSimulator() {
		new Thread(simulator).start();
	}

}