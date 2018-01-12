/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.wizards;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.ui.wizards.IClasspathContainerPage;
import org.eclipse.jdt.ui.wizards.IClasspathContainerPageExtension;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * @author Marin
 *
 */
public class SimulatorClasspathContainerPage extends WizardPage implements IClasspathContainerPage, IClasspathContainerPageExtension {

	/** Simulator classpath container ID */
	private final String CLASSPATH_CONTAINER = "hr.fer.rasip.remes.simulator/LIBS";
	
	/** Contains the current Java project */
	private IJavaProject javaProject = null;

	/** Contains the current classpath */
	private IPath currentClassPath = null;
	
	/**
     * Default Constructor - sets title, page name, description
     */
    public SimulatorClasspathContainerPage() {
        super("REMES Simulator library", "REMES Simulator library", null);
        setDescription("Configure REMES Simulator libraries for this project.");

        // This is internal, but the image is not shared - we're in RCP, so it should be stable
        setImageDescriptor(JavaPluginImages.DESC_WIZBAN_ADD_LIBRARY);
        setPageComplete(true);
    }
    
	@Override
	public boolean finish() {
		return true;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		composite.setFont(parent.getFont());

		new Label(composite, SWT.NONE).setText("There are no options to configure yet.");

		setControl(composite);
	}

	@Override
	public IClasspathEntry getSelection() {
        IPath containerPath = new Path(CLASSPATH_CONTAINER);
        return JavaCore.newContainerEntry(containerPath);
	}

	@Override
	public void setSelection(IClasspathEntry containerEntry) {
        if(containerEntry != null) {
            currentClassPath = containerEntry.getPath();
        }        
	}

	@Override
	public void initialize(IJavaProject project, IClasspathEntry[] currentEntries) {
		this.javaProject = project;
	}

}
