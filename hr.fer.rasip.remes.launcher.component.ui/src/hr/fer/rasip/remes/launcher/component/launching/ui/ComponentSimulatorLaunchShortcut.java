package hr.fer.rasip.remes.launcher.component.launching.ui;

import hr.fer.rasip.remes.launcher.component.launching.IComponentSimulatorLaunchConstants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import se.mdh.progresside.components.core.IComponent;

/**
 * Implements a launch shortcut for REMES behavior launching. 
 * @author <a href="mailto:marin.orlic@fer.hr">Marin Orlic</a>
 * @see org.eclipse.debug.ui.ILaunchShortcut
 */
public class ComponentSimulatorLaunchShortcut implements ILaunchShortcut {

	/**
	 * {@inheritDoc}
     * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.jface.viewers.ISelection, java.lang.String)
     */
    public void launch(ISelection selection, String mode) {
        if (selection instanceof IStructuredSelection) {
            Object first = ((IStructuredSelection)selection).getFirstElement();
            if (first instanceof IComponent) {
            	launch((IComponent) first, mode);
            }
        }
    }

	/**
	 * TODO: Modify this to load model elements corresponding to IComponent (from GMF or Forms editors).
	 * 
	 * {@inheritDoc}
     * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.ui.IEditorPart, java.lang.String)
     */
    public void launch(IEditorPart editor, String mode) {
        IEditorInput editorInput = editor.getEditorInput();
        if (editorInput instanceof IComponent) { 
            IComponent component = ((IComponent)editorInput);
            launch(component, mode);
        }
    }


    protected void launch(IComponent component, String mode) {
    	try {
	        ILaunchConfiguration config = findLaunchConfiguration(component, mode);
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
	protected ILaunchConfiguration findLaunchConfiguration(IComponent component, String mode) {
		ILaunchConfigurationType configType = getSimulatorLaunchConfigType();
		List<ILaunchConfiguration> candidateConfigs = Collections.emptyList();
		String matchUUID = component.getUUID().toString();
		try {
			ILaunchConfiguration[] configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(configType);
			candidateConfigs = new ArrayList<ILaunchConfiguration>(configs.length);
			for (int i= 0; i < configs.length; i++) {
				ILaunchConfiguration config = configs[i];
				String uuid = config.getAttribute(IComponentSimulatorLaunchConstants.COMPONENT_UUID_ATTR, ""); //$NON-NLS-1$
				if (uuid != null && uuid.equals(matchUUID)) {  
					candidateConfigs.add(config);
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		// If there are no existing configs associated with the IComponent, create one.
		// If there is exactly one config associated with the IComponent, return it.
		// Otherwise, if there is more than one config associated with the IFile, prompt the
		// user to choose one.
		int candidateCount = candidateConfigs.size();
		if (candidateCount < 1) {
			return createConfiguration(component);
		} else if (candidateCount == 1) {
			return candidateConfigs.get(0);
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
		return lm.getLaunchConfigurationType(IComponentSimulatorLaunchConstants.LAUNCH_CONFIG_TYPE_ID);		
	}	

	/**
	 * Create and return a new configuration based on the specified <code>IComponent</code>.
	 */
	protected ILaunchConfiguration createConfiguration(IComponent component) {
		ILaunchConfiguration config = null;
		try {
			ILaunchConfigurationType configType = getSimulatorLaunchConfigType();
			ILaunchConfigurationWorkingCopy wc = configType.newInstance(null, DebugPlugin.getDefault().getLaunchManager().generateUniqueLaunchConfigurationNameFrom(component.getComponentName())); 
						
			wc.setAttribute(IComponentSimulatorLaunchConstants.COMPONENT_UUID_ATTR, component.getUUID().toString());
			wc.setAttribute(IComponentSimulatorLaunchConstants.PACKAGE_NAME_ATTR, IComponentSimulatorLaunchConstants.DEFAULT_PACKAGE_NAME);
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, component.getProject().getName());	

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
