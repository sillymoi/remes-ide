package se.mdh.progresside.uppaal.launch.simulator;

import java.io.File;
import java.util.Vector;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;

import se.mdh.progresside.uppaal.Activator;
import se.mdh.progresside.uppaal.perspectives.UppaalPerspective;
import se.mdh.progresside.uppaal.views.GraphicalSimulatorView;
import se.mdh.progresside.uppaal.views.SimulatorView;
import se.mdh.progresside.uppaal.views.Trace;
import se.mdh.progresside.uppaal.views.TraceElement;

import com.uppaal.engine.Engine;
import com.uppaal.engine.Problem;
import com.uppaal.model.core2.Document;
import com.uppaal.model.core2.PrototypeDocument;
import com.uppaal.model.system.UppaalSystem;

public class UppaalSimulatorLaunchConfiguration extends
		LaunchConfigurationDelegate {

	public static final String MODEL_PATH_ATTR_NAME = "uppaal.model.path";
	
	public static final String ID = "se.mdh.progresside.uppaal.launch.simulator";

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		Engine engine = Activator.getDefault().getConfiguredEngine();

		if (engine == null) {
			throw new CoreException(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					"Please specify Uppaal location in Preferences"));
		}
		
		monitor.setTaskName("Instantiating Uppaal System");
		PrototypeDocument prototype = new PrototypeDocument();

		String modelPath = configuration.getAttribute(
				UppaalSimulatorLaunchConfiguration.MODEL_PATH_ATTR_NAME, "");
		File file = new File(modelPath);
		Vector<Problem> problems = new Vector<Problem>();
		UppaalSystem system = null;
		try {
			Document document = prototype.load(file.toURI().toURL());
			system = engine.getSystem(document, problems);
		} catch (Exception e) {
			throw new CoreException(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID, e.getMessage(), e));
		}

		for (Problem p : problems) {
			if ("warning".equals(p.getType())) {
				Activator.getDefault().logInfo(p.getMessage());
			} else {
				throw new CoreException(new Status(IStatus.ERROR,
						Activator.PLUGIN_ID, "Uppaal model contains errors: "
								+ problems.get(0).toString()));					
			}
		}
			
		doLaunch(configuration, engine, system);

	}

	protected void doLaunch(ILaunchConfiguration config, final Engine engine,
			final UppaalSystem system) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				IWorkbench workbench = PlatformUI.getWorkbench();
				IWorkbenchWindow activeWorkbenchWindow = workbench
						.getActiveWorkbenchWindow();


				Trace trace = new Trace(system);
				trace.addTraceElement(new TraceElement(system.getInitial(),null));
				
				try {
					workbench.showPerspective(UppaalPerspective.ID,
							activeWorkbenchWindow);

					SimulatorView simulatorView = (SimulatorView) activeWorkbenchWindow
							.getActivePage().showView(SimulatorView.ID);
					simulatorView.initialize(engine, trace);

					GraphicalSimulatorView gView = (GraphicalSimulatorView) activeWorkbenchWindow
							.getActivePage()
							.showView(GraphicalSimulatorView.ID);
					gView.initialize(trace);
					
					simulatorView.startSimulator();

				} catch (WorkbenchException e) {
					Activator.getDefault().logError(e.getMessage(), e);
				}
			}
		});
	}
}
