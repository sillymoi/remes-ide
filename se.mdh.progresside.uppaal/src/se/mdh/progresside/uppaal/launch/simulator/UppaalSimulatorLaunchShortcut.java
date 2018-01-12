package se.mdh.progresside.uppaal.launch.simulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;

import se.mdh.progresside.uppaal.Activator;

public class UppaalSimulatorLaunchShortcut implements ILaunchShortcut {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.jface.viewers.ISelection,
	 *      java.lang.String)
	 */
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			Object first = ((IStructuredSelection) selection).getFirstElement();
			if (first instanceof IFile) {
				launch((IFile) first, mode);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.ui.IEditorPart,
	 *      java.lang.String)
	 */
	public void launch(IEditorPart editor, String mode) {
		IEditorInput editorInput = editor.getEditorInput();
		if (editorInput instanceof IFileEditorInput) {
			IFile file = ((IFileEditorInput) editorInput).getFile();
			launch(file, mode);
		}
	}

	protected void launch(IFile file, String mode) {
		try {
			ILaunchConfiguration config = findLaunchConfiguration(file, mode);
			if (config != null) {
				config.launch(mode, null);
			}
		} catch (CoreException e) {
			MessageDialog.openError(getShell(), "Launching uppaal failed", e
					.getMessage());
			Activator.getDefault().logError(e.getMessage(), e);
		}
	}

	/**
	 * Locate a configuration to relaunch for the given file. If one cannot be
	 * found, create one.
	 * 
	 * @return a re-useable config or <code>null</code> if none
	 */
	protected ILaunchConfiguration findLaunchConfiguration(IFile file,
			String mode) {
		ILaunchConfigurationType configType = getSimulatorLaunchConfigType();
		List<ILaunchConfiguration> candidateConfigs = Collections.emptyList();
		try {
			ILaunchConfiguration[] configs = DebugPlugin.getDefault()
					.getLaunchManager().getLaunchConfigurations(configType);
			candidateConfigs = new ArrayList<ILaunchConfiguration>(
					configs.length);
			for (int i = 0; i < configs.length; i++) {
				ILaunchConfiguration config = configs[i];
				String filePath = config
						.getAttribute(
								UppaalSimulatorLaunchConfiguration.MODEL_PATH_ATTR_NAME,
								""); //$NON-NLS-1$
				if (filePath != null
						&& filePath.equals(file.getLocation().toString())) {
					candidateConfigs.add(config);
				}
			}
		} catch (CoreException e) {
			Activator.getDefault().logError(e.getMessage(), e);
		}

		int candidateCount = candidateConfigs.size();
		if (candidateCount == 0) {
			return createConfiguration(file);
		} else {
			return (ILaunchConfiguration) candidateConfigs.get(0);
		}
	}

	/**
	 * Returns the simulator launch config type
	 */
	protected ILaunchConfigurationType getSimulatorLaunchConfigType() {
		ILaunchManager lm = DebugPlugin.getDefault().getLaunchManager();
		return lm
				.getLaunchConfigurationType(UppaalSimulatorLaunchConfiguration.ID);
	}

	/**
	 * Create & return a new configuration based on the specified
	 * <code>IFile</code>.
	 */
	protected ILaunchConfiguration createConfiguration(IFile file) {
		ILaunchConfiguration config = null;
		try {
			ILaunchConfigurationType configType = getSimulatorLaunchConfigType();
			ILaunchConfigurationWorkingCopy wc = configType.newInstance(null,
					DebugPlugin.getDefault().getLaunchManager()
							.generateUniqueLaunchConfigurationNameFrom(
									file.getName()));
			wc.setAttribute(
					UppaalSimulatorLaunchConfiguration.MODEL_PATH_ATTR_NAME,
					file.getLocation().toString());

			config = wc.doSave();
		} catch (CoreException e) {
			Activator.getDefault().logError(e.getMessage(), e);
		}
		return config;
	}

	/**
	 * Convenience method to get the window that owns this action's Shell.
	 */
	protected Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}

}
