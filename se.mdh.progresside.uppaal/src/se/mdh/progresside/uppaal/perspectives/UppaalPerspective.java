package se.mdh.progresside.uppaal.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

import se.mdh.progresside.uppaal.views.GraphicalSimulatorView;
import se.mdh.progresside.uppaal.views.SimulatorView;
import se.mdh.progresside.uppaal.views.VariablesView;

public class UppaalPerspective implements IPerspectiveFactory {

	public static final String ID = "se.mdh.progresside.uppaal.perspectives.UppaalPerspective";
	private IPageLayout factory;

	public UppaalPerspective() {
		super();
	}

	public void createInitialLayout(IPageLayout factory) {
		this.factory = factory;
		addViews();
		addActionSets();
		addNewWizardShortcuts();
		addPerspectiveShortcuts();
		addViewShortcuts();
	}

	private void addViews() {
		// Creates the overall folder layout.
		// Note that each new Folder uses a percentage of the remaining
		// EditorArea.
		
		IFolderLayout topLeft = factory.createFolder("topLeft", // NON-NLS-1
				IPageLayout.LEFT, 0.25f, factory.getEditorArea());
		topLeft.addView(SimulatorView.ID);

		IFolderLayout bottomLeft = factory.createFolder("bottomLeft", // NON-NLS-1
				IPageLayout.BOTTOM, 0.50f, "topLeft");
		bottomLeft.addView(VariablesView.ID);
		
		IFolderLayout bottom = factory.createFolder("bottomRight", // NON-NLS-1
				IPageLayout.BOTTOM, 0.50f, factory.getEditorArea());
		bottom.addView(GraphicalSimulatorView.ID);
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
	}

	private void addActionSets() {
		factory.addActionSet("org.eclipse.debug.ui.launchActionSet"); // NON-NLS-1
		factory.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET); // NON-NLS-1
	}

	private void addPerspectiveShortcuts() {
		factory.addPerspectiveShortcut("org.eclipse.ui.resourcePerspective"); // NON-NLS-1
	}

	private void addNewWizardShortcuts() {
		// factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");//NON-NLS-1
		// factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");//NON-NLS-1
	}

	private void addViewShortcuts() {
		factory.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
		factory.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		factory.addShowViewShortcut(IPageLayout.ID_OUTLINE);
	}

}
