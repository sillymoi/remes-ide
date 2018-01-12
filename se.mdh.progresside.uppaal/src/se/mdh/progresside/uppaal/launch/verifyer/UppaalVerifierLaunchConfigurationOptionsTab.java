package se.mdh.progresside.uppaal.launch.verifyer;

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
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import se.mdh.progresside.uppaal.Activator;

import com.uppaal.engine.Engine;

public class UppaalVerifierLaunchConfigurationOptionsTab extends
		AbstractLaunchConfigurationTab {

	public static final String UPPAAL_OPTION_DATA_KEY = "uppaal.option";

	private Control[] controls;

	@Override
	public void createControl(Composite parent) {
		Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayout(new GridLayout(1, false));

		Group optionsGroup = new Group(contents, SWT.NONE);
		optionsGroup.setText("Model checker options");
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true,
				false).applyTo(optionsGroup);
		setControl(contents);

		Engine configuredEngine = Activator.getDefault().getConfiguredEngine();
		String status = null;
		Option[] options = null;

		if (configuredEngine == null) {
			status = "Uppaal Engine not found. Please specify Uppaal location in Preferences";
		} else {

			String xml = null;
			try {
				xml = configuredEngine.getOptionsInfo();
			} catch (Exception e) {
				status = "Cannot connect to Uppaal Engine not found. Please specify Uppaal location in Preferences";
				Activator.getDefault().logError(status, e);
			}

			if (xml != null) {
				try {
					options = OptionsHelper.readFromXml(xml);
				} catch (Exception e) {
					status = "Cannot read model checker options";
					Activator.getDefault().logError(status, e);
				}
			}
		}

		if (status != null) {
			optionsGroup.setLayout(new FillLayout());
			new Label(optionsGroup, SWT.NONE).setText(status);
		} else {
			optionsGroup.setLayout(new GridLayout(2, false));
			controls = new Control[options.length];

			for (int i = 0; i < options.length; i++) {
				Option option = options[i];

				new Label(optionsGroup, SWT.NONE).setText(option.getDisplay()
						+ ":");

				Control c = createControl(optionsGroup, option);

				GridDataFactory.swtDefaults().grab(true, false).align(SWT.FILL,
						SWT.CENTER).applyTo(c);
				c.setData(UPPAAL_OPTION_DATA_KEY, option);
				controls[i] = c;

			}
		}
	}

	@Override
	public String getName() {
		return "Options";
	}

	private Control createControl(Group optionsGroup, Option option) {
		Control c = null;
		if ("choice".equals(option.getType())) {
			c = new Combo(optionsGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
			for (Choice choice : ((ChoiceOption) option).getChoices()) {
				((Combo) c).add(choice.getDisplay());
			}
			((Combo) c).addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					setDirty(true);
					updateLaunchConfigurationDialog();
				}
			});

		} else if ("boolean".equals(option.getType())) {
			c = new Button(optionsGroup, SWT.CHECK);
			((Button) c).addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setDirty(true);
					updateLaunchConfigurationDialog();
				}
			});
		}
		return c;
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			String options = configuration.getAttribute(
					UppaalVerifierLaunchConfiguration.ENGINE_OPTIONS_ATTR_NAME,
					"");

			OptionsHelper.initControlsFromOptions(options, controls);

		} catch (CoreException e) {
			Activator.getDefault().logError(e.getMessage(), e);
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				UppaalVerifierLaunchConfiguration.ENGINE_OPTIONS_ATTR_NAME,
				OptionsHelper.getOptionsAttribute(controls));
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

}
