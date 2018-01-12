package hr.fer.rasip.remes.launcher.launching.ui;

import hr.fer.rasip.remes.converters.IConverterConstants;
import hr.fer.rasip.remes.launcher.launching.ISimulatorLaunchConstants;

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
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * Implements a launch shortcut for REMES behavior launching. 
 * @author <a href="mailto:marin.orlic@fer.hr">Marin Orlic</a>
 * @see org.eclipse.debug.ui.ILaunchShortcut
 */
public class SimulatorLaunchShortcut implements ILaunchShortcut {

	/**
	 * {@inheritDoc}
     * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.jface.viewers.ISelection, java.lang.String)
     */
    public void launch(ISelection selection, String mode) {
        if (selection instanceof IStructuredSelection) {
            Object first = ((IStructuredSelection)selection).getFirstElement();
            if (first instanceof IFile) {
                launch((IFile) first, mode);
            }
        }
    }

	/**
	 * {@inheritDoc}
     * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.ui.IEditorPart, java.lang.String)
     */
    public void launch(IEditorPart editor, String mode) {
        IEditorInput editorInput = editor.getEditorInput();
        if (editorInput instanceof IFileEditorInput) {
            IFile file = ((IFileEditorInput)editorInput).getFile();
            launch(file,mode);
        }
    }

    protected void launch(IFile file, String mode) {
        try {
	        ILaunchConfiguration config = findLaunchConfiguration(file, mode);
	        if (config != null) {
	        	config.launch(mode,null);
	        }
        } catch (CoreException e) {
			e.printStackTrace();
		} 
    }
    
	/**
	 * Locate a configuration to relaunch for the given file.  If one cannot be found, create one.
	 * 
	 * @return a re-useable config or <code>null</code> if none
	 */
	protected ILaunchConfiguration findLaunchConfiguration(IFile file, String mode) {
		ILaunchConfigurationType configType = getSimulatorLaunchConfigType();
		List<ILaunchConfiguration> candidateConfigs = Collections.emptyList();
		try {
			ILaunchConfiguration[] configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(configType);
			candidateConfigs = new ArrayList<ILaunchConfiguration>(configs.length);
			for (int i= 0; i < configs.length; i++) {
				ILaunchConfiguration config = configs[i];
				String filePath = config.getAttribute(ISimulatorLaunchConstants.REMES_FILE_NAME_ATTR, ""); //$NON-NLS-1$
				if (filePath != null && filePath.equals(file.getFullPath().toString())) {  
					candidateConfigs.add(config);
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		// If there are no existing configs associated with the IFile, create one.
		// If there is exactly one config associated with the IFile, return it.
		// Otherwise, if there is more than one config associated with the IFile, prompt the
		// user to choose one.
		int candidateCount = candidateConfigs.size();
		if (candidateCount < 1) {
			return createConfiguration(file);
		} else if (candidateCount == 1) {
			return (ILaunchConfiguration) candidateConfigs.get(0);
		} else {
			// Prompt the user to choose a config.  A null result means the user
			// canceled the dialog, in which case this method returns null,
			// since canceling the dialog should also cancel launching anything.
			ILaunchConfiguration config = chooseConfiguration(candidateConfigs, mode);
			if (config != null) {
				return config;
			}
		}
		return null;
	}
	
	/**
	 * Returns the simulator launch config type
	 */
	protected ILaunchConfigurationType getSimulatorLaunchConfigType() {
		ILaunchManager lm = DebugPlugin.getDefault().getLaunchManager();
		return lm.getLaunchConfigurationType(ISimulatorLaunchConstants.LAUNCH_CONFIG_TYPE_ID);		
	}	

	/**
	 * Create & return a new configuration based on the specified <code>IFile</code>.
	 */
	protected ILaunchConfiguration createConfiguration(IFile file) {
		ILaunchConfiguration config = null;
		try {
			ILaunchConfigurationType configType = getSimulatorLaunchConfigType();
			ILaunchConfigurationWorkingCopy wc = configType.newInstance(null, DebugPlugin.getDefault().getLaunchManager().generateUniqueLaunchConfigurationNameFrom(file.getName())); 

/*			String fileName = file.getName();
			String fileNameNoExt = fileName.substring(0, fileName.length()-file.getFileExtension().length()-1);
			
			String className = fileNameNoExt.concat("Simulator"); //$NON-NLS-1$
			
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, IConverterConstants.DEFAULT_PACKAGE_NAME + "." + className); //$NON-NLS-1$
*/			wc.setAttribute(ISimulatorLaunchConstants.REMES_FILE_NAME_ATTR, file.getFullPath().toString());
			wc.setAttribute(ISimulatorLaunchConstants.PACKAGE_NAME_ATTR, IConverterConstants.DEFAULT_PACKAGE_NAME);
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, file.getProject().getName());	

			config = wc.doSave();		
		} catch (CoreException ce) {
			ce.printStackTrace();			
		}
		return config;
	}

	/**
	 * Show a selection dialog that allows the user to choose one of the specified
	 * launch configurations.  Return the chosen config, or <code>null</code> if the
	 * user canceled the dialog.
	 */
	protected ILaunchConfiguration chooseConfiguration(List<ILaunchConfiguration> configList, String mode) {
		IDebugModelPresentation labelProvider = DebugUITools.newDebugModelPresentation();
		ElementListSelectionDialog dialog= new ElementListSelectionDialog(getShell(), labelProvider);
		dialog.setElements(configList.toArray());
		dialog.setTitle("Select configuration");  //$NON-NLS-1$
		if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			dialog.setMessage("Choose a behavior to debug");  //$NON-NLS-1$
		} else {
			dialog.setMessage("Choose a behavior to run");  //$NON-NLS-1$
		}
		dialog.setMultipleSelection(false);
		int result= dialog.open();
		labelProvider.dispose();
		if (result == Window.OK) {
			return (ILaunchConfiguration)dialog.getFirstResult();
		}
		return null;		
	}

	/**
	 * Convenience method to get the window that owns this action's Shell.
	 */
	protected Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}

}
