package se.mdh.progresside.uppaal.preferences;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import se.mdh.progresside.uppaal.Activator;

import com.uppaal.engine.Engine;
import com.uppaal.engine.EngineStub;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class UppaalPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {
	
	public static final String ID = "se.mdh.progresside.uppaal.preferences.UppaalPreferencePage";
	private FileFieldEditor pathEditor;
	private IntegerFieldEditor simDelayEditor;

	public UppaalPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences of the Uppaal integration");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {

		pathEditor = new FileFieldEditor(PreferenceConstants.UPPAAL_PATH,
				"&Path to Uppaal server:", getFieldEditorParent()) {
			@Override
			public int getNumberOfControls() {
				return super.getNumberOfControls() + 1;
			}

			protected void adjustForNumColumns(int numColumns) {
				((GridData) getTextControl().getLayoutData()).horizontalSpan = numColumns - 3;
			}

			@Override
			protected void doFillIntoGrid(Composite parent, int numColumns) {
				super.doFillIntoGrid(parent, numColumns - 1);

				Button testBtn = new Button(parent, SWT.PUSH);
				testBtn.setText("&Test");
				testBtn.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String path = getStringValue();

						Engine engine = new Engine(EngineStub.LOCAL, 0,
								"localhost", path);

						String status;
						try {
							status = engine.getVersion();
							MessageDialog.openInformation(getShell(),
									getTitle(), status);
						} catch (Exception ex) {
							status = ex.getMessage();
							MessageDialog.openError(getShell(), getTitle(),
									status);
							Activator.getDefault()
									.logError(ex.getMessage(), ex);
						} finally {
							engine.disconnect();
						}

					}
				});
			}
		};
		addField(pathEditor);

		simDelayEditor = new IntegerFieldEditor(
				PreferenceConstants.UPPAAL_SIM_DELAY,
				"&Simulation step delay (milliseconds):",
				getFieldEditorParent());
		addField(simDelayEditor);
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

}