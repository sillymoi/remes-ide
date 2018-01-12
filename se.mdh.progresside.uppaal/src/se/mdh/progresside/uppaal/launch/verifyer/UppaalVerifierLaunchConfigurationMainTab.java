package se.mdh.progresside.uppaal.launch.verifyer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
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
import se.mdh.progresside.uppaal.launch.simulator.UppaalSimulatorLaunchConfigurationTab;

public class UppaalVerifierLaunchConfigurationMainTab extends
		UppaalSimulatorLaunchConfigurationTab {

	private Text queryText;

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		Group queryFileGroup = new Group((Composite) getControl(), SWT.NONE);
		queryFileGroup.setText("Query file");
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true,
				false).applyTo(queryFileGroup);

		queryFileGroup.setLayout(new GridLayout(2, false));

		queryText = new Text(queryFileGroup, SWT.NONE | SWT.BORDER);
		queryText.setEditable(false);
		queryText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();				
				notifyQueryTab();

			}
		});
		GridDataFactory.swtDefaults().grab(true, false).align(SWT.FILL,
				SWT.CENTER).applyTo(queryText);

		Button browseBtn = new Button(queryFileGroup, SWT.PUSH);
		browseBtn.setText("B&rowse");
		browseBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.q", "*.*" });
				dialog.setFilterNames(new String[] { "UPPAAL Queries File",
						"All Files" });
				String path = dialog.open();
				if (path != null) {
					queryText.setText(path);
				}
			}
		});

	}

	@Override
	protected void modelFileChanged(String path) {
		int lastIndexOf = path.lastIndexOf(".");
		if (lastIndexOf != -1) {
			queryText.setText(path.substring(0, lastIndexOf) + ".q");
		}
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		super.initializeFrom(configuration);
		try {
			String path = configuration.getAttribute(
					UppaalVerifierLaunchConfiguration.QUERY_PATH_ATTR_NAME, "");
			queryText.setText(path);
		} catch (CoreException e) {
			Activator.getDefault().logError(e.getMessage(), e);
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		super.performApply(configuration);
		configuration.setAttribute(
				UppaalVerifierLaunchConfiguration.QUERY_PATH_ATTR_NAME,
				queryText.getText());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		super.setDefaults(configuration);
	}


	private void notifyQueryTab() {
		for (ILaunchConfigurationTab tab : getLaunchConfigurationDialog()
				.getTabs()) {
			if (tab instanceof UppaalVerifierLaunchConfigurationQueryTab) {
				((UppaalVerifierLaunchConfigurationQueryTab) tab)
						.reloadQueries(queryText.getText());
			}
		}
	}
}
