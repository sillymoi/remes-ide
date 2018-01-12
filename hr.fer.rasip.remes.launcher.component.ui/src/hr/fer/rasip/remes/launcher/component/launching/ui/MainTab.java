package hr.fer.rasip.remes.launcher.component.launching.ui;

import hr.fer.rasip.remes.launcher.component.ui.Activator;
import hr.fer.rasip.remes.launcher.component.launching.IComponentSimulatorLaunchConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.dialogs.SelectionDialog;

/**
 * The main tab. Adapted from MainATLTab (M2M ATL project)
 * 
 * @author <a href="mailto:marin.orlic@fer.hr">Marin Orlic</a>
 */
public class MainTab extends AbstractLaunchConfigurationTab {

	/** Source file. */
	public static final int IS_SOURCE = 1;
	
	/** Target file. */
	public static final int IS_TARGET = 2;
	
	/** Platform profile. */
	public static final int IS_PROFILE = 4;

	/** Behavior model. */
	public static final int IS_REMES = 8;
	
	/** Widgets. */
	private ScrolledComposite scrollContainer;
	private Composite rootContainer;
	
	private Group componentGroup;
	private Group packageGroup;
	private Group profileGroup;
	
	private Text componentText;
	private Text packageNameText;
	private Text profilePathText;
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		scrollContainer = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		scrollContainer.setExpandHorizontal(true);
		scrollContainer.setExpandVertical(true);

		rootContainer = new Composite(scrollContainer, SWT.NULL);
		rootContainer.setLayout(new GridLayout());
		scrollContainer.setContent(rootContainer);

		componentGroup = new Group(rootContainer, SWT.NULL);
		componentGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		componentGroup.setLayout(new GridLayout(3, false));
		componentGroup.setText("Component behavior"); 

		componentText = new Text(componentGroup, SWT.SINGLE | SWT.BORDER);
		componentText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		componentText.setEnabled(false);
		componentText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		
		final Button browseWorkspace = new Button(componentGroup, SWT.RIGHT);
		browseWorkspace.setText("Workspace..."); 
		browseWorkspace.setEnabled(false);

		browseWorkspace.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent evt) {
				String path = editPath(IS_REMES | IS_SOURCE);
				if (path != null && path.trim().length() > 0) {
					componentText.setText(path);
				}
			}
		});

		packageGroup = new Group(rootContainer, SWT.NULL);
		packageGroup.setText("Package for generated classes"); 
		packageGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		packageGroup.setLayout(new GridLayout(3, false));
		
		packageNameText = new Text(packageGroup, SWT.SINGLE | SWT.BORDER);
		packageNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		packageNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		
		final Button browsePackages = new Button(packageGroup, SWT.RIGHT);
		browsePackages.setText("Browse..."); 

		browsePackages.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent evt) {
				String pkg = editPackage();
				if (pkg != null && pkg.trim().length() > 0) {
					packageNameText.setText(pkg);
				}
			}
		});
		
		profileGroup = new Group(rootContainer, SWT.NULL);
		profileGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		profileGroup.setLayout(new GridLayout(3, false));
		profileGroup.setText("Platform profile for simulation"); 

		profilePathText = new Text(profileGroup, SWT.SINGLE | SWT.BORDER);
		profilePathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		profilePathText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		
		final Button browseWorkspace2 = new Button(profileGroup, SWT.RIGHT);
		browseWorkspace2.setText("Workspace..."); 

		browseWorkspace2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent evt) {
				String path = editPath(IS_SOURCE | IS_PROFILE);
				if (path != null && path.trim().length() > 0) {
					profilePathText.setText(path);
				}
			}
		});
		
		setControl(scrollContainer);
	}

	private void rebuild() {
		layout();
	}

	private void layout() {
		componentGroup.layout();
		packageGroup.layout();
		profileGroup.layout();
		rootContainer.layout();

		scrollContainer.setMinSize(rootContainer.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		scrollContainer.layout();

		updateLaunchConfigurationDialog();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(IComponentSimulatorLaunchConstants.PACKAGE_NAME_ATTR, IComponentSimulatorLaunchConstants.DEFAULT_PACKAGE_NAME);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			String uuid = configuration.getAttribute(IComponentSimulatorLaunchConstants.COMPONENT_UUID_ATTR, ""); //$NON-NLS-1$
			String packageName = configuration.getAttribute(IComponentSimulatorLaunchConstants.PACKAGE_NAME_ATTR, IComponentSimulatorLaunchConstants.DEFAULT_PACKAGE_NAME);
			String profileName = configuration.getAttribute(IComponentSimulatorLaunchConstants.PROFILE_FILE_NAME_ATTR, ""); //$NON-NLS-1$
			
			if (!uuid.equals(componentText.getText())) {
				componentText.setText(uuid);
			}
			if (!packageName.equals(packageNameText.getText())) {
				packageNameText.setText(packageName);
			}
			if (!profileName.equals(profilePathText.getText())) {
				profilePathText.setText(profileName);
			}
		} catch (CoreException e) {
			log(IStatus.ERROR, e.getLocalizedMessage(), e);
		}
		rebuild();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		String component = componentText.getText();
		String packageName = packageNameText.getText();
		String profileName = profilePathText.getText();
	
		// Set Java attributes
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
//		String path = componentText.getText();
//		IResource res = wsRoot.findMember(path);

//		if (res instanceof IFile) {
//			String projectName = res.getProject().getName();
//			String extension = res.getFileExtension();
//			String fileName = res.getName();
//			String fileNameNoExt = fileName.substring(0, fileName.length()-extension.length()-1);
//			String className = fileNameNoExt.concat("Simulator"); //$NON-NLS-1$
			
//			configuration.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, packageName + "." + className); //$NON-NLS-1$
//			configuration.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, projectName);
			configuration.setAttribute(IComponentSimulatorLaunchConstants.COMPONENT_UUID_ATTR, component);
//			configuration.setAttribute(ISimulatorLaunchConstants.REMES_FILE_NAME_ATTR, behaviorFileName);
			configuration.setAttribute(IComponentSimulatorLaunchConstants.PACKAGE_NAME_ATTR, packageName);	
			configuration.setAttribute(IComponentSimulatorLaunchConstants.PROFILE_FILE_NAME_ATTR, profileName);
//		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return "Component Behavior Configuration";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		String component = componentText.getText();
		String profileFileName = profilePathText.getText();
		String packageName = packageNameText.getText();
		
/*		if (!validateFileName(component, ISimulatorLaunchConstants.REMES_EXTENSIONS, false)) {
			this.setErrorMessage("Please enter a REMES behavior model file name"); //$NON-NLS-1$
			return false;
		}
*/		
		if (!validateFileName(profileFileName, IComponentSimulatorLaunchConstants.PROFILE_EXTENSIONS, true)) { 
			this.setErrorMessage("Please enter a simulator profile model file name"); //$NON-NLS-2$ 
			return false;
		}
		
		if ( !(packageName.isEmpty() || JavaConventions.validatePackageName(packageName, null, null).isOK())) {
			this.setErrorMessage("Please enter a valid package name"); //$NON-NLS-2$ 
			return false;			
		}
			
		this.setErrorMessage(null);
		return super.isValid(launchConfig);
	}


	/**
	 * Checks if the model file name is valid. The file name should not be blank and refer to a
	 * valid IFile in the workspace. Optionally, file extension is checked to match the validExtensions.
	 * 
	 * @param modelFileName file name to check
	 * @param validExtensions optional list of extensions that are allowed (can be null)
	 * @param allowBlanks if set, blank file names are allowed
	 * @return true if file name is valid, false otherwise
	 */
	private boolean validateFileName(String modelFileName, String[] validExtensions, boolean allowBlanks) {
		// Sanity check
		if (modelFileName == null)
			return false;
		
		if (modelFileName.equals("") && allowBlanks) //$NON-NLS-1$)
			return true;
			
		// Try to find file, check extensions
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		IResource res = wsRoot.findMember(modelFileName);
		if (res instanceof IFile) {
			boolean checkOk = true;
			
			if(validExtensions != null) {
				String extension = res.getFileExtension();
				checkOk = false;
				for (int i = 0; i < validExtensions.length; i++) {
					if(extension.equals(validExtensions[i])) {
						checkOk = true;
						break;
					}
				}
			}
			return checkOk;
		}
		
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getImage()
	 */
	@Override
	public Image getImage() {
		return Activator.getImage(IComponentSimulatorLaunchConstants.REMES_ICON_PATH);
	}

	/**
	 * This method edit the path of the model selected. The path corresponding the a file in the workspace
	 * 
	 * @param type
	 * @param table
	 */
	private String editPath(final int type) {
		String ret = ""; //$NON-NLS-1$

		if ((type & IS_TARGET)!=0) {
			SaveAsDialog sad = new SaveAsDialog(getShell());
			sad.open();
			IPath outputPath = sad.getResult();
			if (outputPath != null) {
				ret = outputPath.toString();
			}
		} else {
			String[] extensions = null;
			
			if((type & IS_REMES)!=0) {
				extensions = IComponentSimulatorLaunchConstants.REMES_EXTENSIONS;
			} else if((type & IS_PROFILE)!=0) {
				extensions = IComponentSimulatorLaunchConstants.PROFILE_EXTENSIONS;
			}
			
			WorkspaceFileDialog dialog = new WorkspaceFileDialog(getShell(), extensions);
			dialog.open();
			Object result = dialog.getFirstResult();

			if ((result != null) && (result instanceof IFile)) {
				IFile currentFile = (IFile)result;
				ret = currentFile.getFullPath().toString();
			}
		}
		return ret;
	}
	
	/**
	 * This method edit the package name that will be used to generate code. 
	 * The package name comes from a package selection dialog (JavaUI).
	 * 
	 * @see JavaUI#createPackageDialog()
	 */
	private String editPackage() {
		Shell parent = getShell();
        SelectionDialog dialog = JavaUI.createPackageDialog(
            parent, 
            new ProgressMonitorDialog(parent),
            SearchEngine.createWorkspaceScope(),
            false, // multipleSelection
            false, // removeDuplicates
            ""); // no filtering //$NON-NLS-1$
        dialog.setTitle("Package selection"); 
        dialog.setMessage("Choose a package");
        if (dialog.open() == IDialogConstants.CANCEL_ID)
            return null;

        Object[] pkg = dialog.getResult();
        if (pkg == null || pkg.length == 0)
            return null;
        return ((IPackageFragment)pkg[0]).getElementName(); //FIXME - full IPackageFragment might be useful
	}
	
	/**
	 * @param level 
	 * @param message
	 */
	private void log(int level, String message) {
		Activator.log(level, message); 
	}

	/**
	 * @param level 
	 * @param message
	 * @param t
	 */
	private void log(int level, String message, Throwable t) {
		Activator.log(level, message, t); 
	}
}