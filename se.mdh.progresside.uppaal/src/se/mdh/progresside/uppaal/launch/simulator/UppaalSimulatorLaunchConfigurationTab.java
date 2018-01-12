package se.mdh.progresside.uppaal.launch.simulator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import se.mdh.progresside.uppaal.Activator;

public class UppaalSimulatorLaunchConfigurationTab extends
		AbstractLaunchConfigurationTab {

	private Text modelText;

	@Override
	public void createControl(Composite parent) {
		Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayout(new GridLayout(1, false));

		Group modelSelectGroup = new Group(contents, SWT.NONE);
		modelSelectGroup.setLayout(new GridLayout(2, false));
		modelSelectGroup.setText("Uppaal Model File");
		GridDataFactory.swtDefaults().grab(true, false).align(SWT.FILL,
				SWT.CENTER).applyTo(modelSelectGroup);

		modelText = new Text(modelSelectGroup, SWT.NONE | SWT.BORDER);
		modelText.setEditable(false);
		modelText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				modelFileChanged(modelText.getText());
				setDirty(true);				
				updateLaunchConfigurationDialog();
			}
		});
		GridDataFactory.swtDefaults().grab(true, false).align(SWT.FILL,
				SWT.CENTER).applyTo(modelText);
		Button browseBtn = new Button(modelSelectGroup, SWT.PUSH);
		browseBtn.setText("&Browse");
		browseBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.xml", "*.*" });
				dialog.setFilterNames(new String[] { "UPPAAL System",
						"All Files" });
				String path = dialog.open();
				if (path != null) {
					modelText.setText(path);
				}
			}
		});
		setControl(contents);
	}

	protected void modelFileChanged(String path) {
	}

	@Override
	public String getName() {
		return "Main";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			String path = configuration
					.getAttribute(
							UppaalSimulatorLaunchConfiguration.MODEL_PATH_ATTR_NAME,
							"");
			modelText.setText(path);
		} catch (CoreException e) {
			Activator.getDefault().logError(e.getMessage(), e);
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				UppaalSimulatorLaunchConfiguration.MODEL_PATH_ATTR_NAME,
				modelText.getText());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

}
