package se.mdh.progresside.uppaal.launch.verifyer;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.help.WorkbenchHelpSystem;

import se.mdh.progresside.uppaal.Activator;

public class UppaalVerifierLaunchConfigurationQueryTab extends
		AbstractLaunchConfigurationTab {

	private static final String UPPAAL_PROPS_HELP_CONTEXT_ID = "se.mdh.progresside.uppaal.properties";
	public static final String SELECTED_QUERIES_DELIMITER = ",";

	private static class QueryDialog extends Dialog {

		private Text qText;
		private Text commentText;
		private Query q;

		protected QueryDialog(Shell parentShell, Query q) {
			super(parentShell);
			this.q = q;
		}

		@Override
		protected void configureShell(Shell newShell) {
			super.configureShell(newShell);
			newShell.setText("Edit query");
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite composite = (Composite) super.createDialogArea(parent);
			Label txt = new Label(composite, SWT.NONE);
			txt.setText("Query");
			qText = new Text(composite, SWT.BORDER);
			GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(
					true, false).applyTo(qText);

			txt = new Label(composite, SWT.NONE);
			txt.setText("Comment");
			commentText = new Text(composite, SWT.BORDER | SWT.MULTI
					| SWT.V_SCROLL);
			GridDataFactory.fillDefaults().grab(true, true).hint(400, 100)
					.applyTo(commentText);

			qText.setText(q.getQuery());
			commentText.setText(q.getComment());

			return composite;
		}

		@Override
		protected void okPressed() {
			q.setQuery(qText.getText().trim());
			q.setComment(commentText.getText().trim());
			super.okPressed();
		}
	}

	private static class ListContentProvider implements
			IStructuredContentProvider {
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			List<?> list = (List<?>) inputElement;
			return list.toArray();
		}
	}

	// private List<Query> queries;
	private ListViewer viewer;
	private String path;
	private Group queryGroup;
	private List<Query> queries;
	private Button addQueryBtn;
	private Button editQueryBtn;
	private Button removeQueryBtn;

	@Override
	public void createControl(Composite parent) {
		Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayout(new GridLayout(1, false));

		queryGroup = new Group(contents, SWT.NONE);
		queryGroup.setLayout(new GridLayout(2, false));
		queryGroup.setText("Queries (no file specified)");
		GridDataFactory.fillDefaults().grab(true, true).applyTo(queryGroup);
		setControl(contents);

		viewer = new ListViewer(queryGroup);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(
				viewer.getControl());

		viewer.setLabelProvider(new LabelProvider());
		viewer.setContentProvider(new ListContentProvider());
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				boolean empty = event.getSelection().isEmpty();
				editQueryBtn.setEnabled(!empty);
				removeQueryBtn.setEnabled(!empty);

				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});

		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				editQuery();
			}
		});

		Composite buttonsPanel = new Composite(queryGroup, SWT.NONE);
		buttonsPanel.setLayout(new GridLayout(1, false));
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.BEGINNING).applyTo(
				buttonsPanel);

		createButtons(buttonsPanel);

		PlatformUI.getWorkbench().getHelpSystem().setHelp(contents,
				UPPAAL_PROPS_HELP_CONTEXT_ID);

	}

	private void createButtons(Composite buttonsPanel) {
		addQueryBtn = new Button(buttonsPanel, SWT.PUSH);
		addQueryBtn.setText("&Add");
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true,
				false).applyTo(addQueryBtn);
		addQueryBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Query query = new Query("", "");
				QueryDialog qd = new QueryDialog(getShell(), query);

				if (qd.open() == IDialogConstants.OK_ID) {
					queries.add(query);
					viewer.refresh();

					setDirty(true);
					updateLaunchConfigurationDialog();
				}
			}
		});

		editQueryBtn = new Button(buttonsPanel, SWT.PUSH);
		editQueryBtn.setText("&Edit");
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true,
				false).applyTo(editQueryBtn);
		editQueryBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				editQuery();
			}
		});

		removeQueryBtn = new Button(buttonsPanel, SWT.PUSH);
		removeQueryBtn.setText("&Remove");
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true,
				false).applyTo(removeQueryBtn);
		removeQueryBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) viewer
						.getSelection();
				Iterator iterator = selection.iterator();
				while (iterator.hasNext()) {
					Query q = (Query) iterator.next();
					queries.remove(q);
				}

				if (!selection.isEmpty()) {
					setDirty(true);
					updateLaunchConfigurationDialog();

					viewer.refresh();
				}
			}
		});

		Button helpBtn = new Button(buttonsPanel, SWT.PUSH);
		helpBtn.setText("&Help");
		helpBtn.setImage(PlatformUI.getWorkbench().getSharedImages().getImage(
				ISharedImages.IMG_LCL_LINKTO_HELP));
		
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true,
				false).applyTo(helpBtn);
		helpBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				WorkbenchHelpSystem.getInstance().displayHelp(UPPAAL_PROPS_HELP_CONTEXT_ID);
				
			}
		});

		editQueryBtn.setEnabled(false);
		removeQueryBtn.setEnabled(false);
	}

	private void editQuery() {
		IStructuredSelection selection = (IStructuredSelection) viewer
				.getSelection();
		Query q = (Query) selection.getFirstElement();
		if (q != null) {
			QueryDialog qd = new QueryDialog(getShell(), q);

			if (qd.open() == IDialogConstants.OK_ID) {
				viewer.update(q, null);

				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		}
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			String selectedQueries = configuration
					.getAttribute(
							UppaalVerifierLaunchConfiguration.SELECTED_QUERIES_ATTR_NAME,
							"");

			if (!selectedQueries.isEmpty()) {
				String[] indices = selectedQueries
						.split(SELECTED_QUERIES_DELIMITER);
				List<Query> selection = new ArrayList<Query>();
				for (String q : indices) {
					int index = Integer.parseInt(q);
					if (index < this.queries.size()) {
						Query query = this.queries.get(index);
						if (query != null) {
							selection.add(query);
						}
					}
				}
				viewer.setSelection(new StructuredSelection(selection));
			}

		} catch (CoreException e) {
			Activator.getDefault().logError(e.getMessage(), e);
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {

		// store queries
		if (path != null && !path.isEmpty()) {
			try {
				File file = new File(path);
				if (!file.exists()) {
					file.createNewFile();
				}
				QueryParser.saveQueries(queries, file);
			} catch (Exception e) {
				Activator.getDefault().logError("Failed saving queries", e);
			}
		}

		// build selected queries string
		StringBuffer sb = new StringBuffer();
		IStructuredSelection selection = (IStructuredSelection) viewer
				.getSelection();
		Iterator iterator = selection.iterator();
		while (iterator.hasNext()) {
			Query q = (Query) iterator.next();
			sb.append(queries.indexOf(q));
			if (iterator.hasNext()) {
				sb.append(SELECTED_QUERIES_DELIMITER);
			}
		}

		configuration.setAttribute(
				UppaalVerifierLaunchConfiguration.SELECTED_QUERIES_ATTR_NAME,
				sb.toString());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public String getName() {
		return "Queries";
	}

	public void reloadQueries(String path) {

		queries = new ArrayList<Query>();
		this.path = path;

		if (path != null && !path.isEmpty()) {
			File file = new File(path);
			if (file.exists()) {
				try {
					queries = QueryParser.loadQueries(file);
					this.queryGroup.setText("Queries (" + path + ")");

				} catch (Exception e) {
					Activator.getDefault()
							.logError("Failed loading queries", e);
				}
			}
		}
		viewer.setInput(queries);

	}
}
