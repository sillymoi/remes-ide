/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.ui;

//
// A text editor for 'remessrc' models.
//
public class RemessrcEditor extends org.eclipse.ui.editors.text.TextEditor implements org.eclipse.emf.edit.domain.IEditingDomainProvider {
	
	private hr.fer.rasip.remes.resource.remessrc.ui.RemessrcHighlighting highlighting;
	private org.eclipse.jface.text.source.projection.ProjectionSupport projectionSupport;
	private hr.fer.rasip.remes.resource.remessrc.ui.RemessrcCodeFoldingManager codeFoldingManager;
	private hr.fer.rasip.remes.resource.remessrc.ui.RemessrcBackgroundParsingStrategy bgParsingStrategy = new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcBackgroundParsingStrategy();
	private java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcBackgroundParsingListener> bgParsingListeners = new java.util.ArrayList<hr.fer.rasip.remes.resource.remessrc.IRemessrcBackgroundParsingListener>();
	private hr.fer.rasip.remes.resource.remessrc.ui.RemessrcColorManager colorManager = new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcColorManager();
	private hr.fer.rasip.remes.resource.remessrc.ui.RemessrcOutlinePage outlinePage;
	private hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource;
	private org.eclipse.core.resources.IResourceChangeListener resourceChangeListener = new ModelResourceChangeListener();
	private hr.fer.rasip.remes.resource.remessrc.ui.RemessrcPropertySheetPage propertySheetPage;
	private org.eclipse.emf.edit.domain.EditingDomain editingDomain;
	private org.eclipse.emf.edit.provider.ComposedAdapterFactory adapterFactory;
	private org.eclipse.swt.widgets.Display display;
	
	public RemessrcEditor() {
		super();
		setDocumentProvider(new org.eclipse.ui.editors.text.FileDocumentProvider());
		setSourceViewerConfiguration(new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcEditorConfiguration(this, colorManager));
		initializeEditingDomain();
		addBackgroundParsingListener(new MarkerUpdateListener());
		org.eclipse.core.resources.ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, org.eclipse.core.resources.IResourceChangeEvent.POST_CHANGE);
	}
	
	private final class MarkerUpdateListener implements hr.fer.rasip.remes.resource.remessrc.IRemessrcBackgroundParsingListener {
		public void parsingCompleted(org.eclipse.emf.ecore.resource.Resource parsedResource) {
			if (parsedResource != null && parsedResource.getErrors().isEmpty()) {
				org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(parsedResource);
			}
			refreshMarkers(parsedResource);
		}
	}
	
	// A custom document listener that triggers background parsing if needed.
	private final class DocumentListener implements org.eclipse.jface.text.IDocumentListener {
		
		public void documentAboutToBeChanged(org.eclipse.jface.text.DocumentEvent event) {
		}
		
		public void documentChanged(org.eclipse.jface.text.DocumentEvent event) {
			bgParsingStrategy.parse(event, getResource(), RemessrcEditor.this);
		}
	}
	
	//
	// Reacts to changes of the text resource displayed in the editor and
	// resources cross-referenced by it. Cross-referenced resources are
	// unloaded, the displayed resource is reloaded. An attempt to resolve all
	// proxies in the displayed resource is made after each change.
	//
	// The code pretty much corresponds to what EMF generates for a tree editor
	//
	private class ModelResourceChangeListener implements org.eclipse.core.resources.IResourceChangeListener {
		public void resourceChanged(org.eclipse.core.resources.IResourceChangeEvent event) {
			org.eclipse.core.resources.IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor implements org.eclipse.core.resources.IResourceDeltaVisitor {
					protected org.eclipse.emf.ecore.resource.ResourceSet resourceSet = editingDomain.getResourceSet();
					
					public boolean visit(org.eclipse.core.resources.IResourceDelta delta) {
						if (delta.getResource().getType() != org.eclipse.core.resources.IResource.FILE) {
							return true;
						}
						int deltaKind = delta.getKind();
						if (deltaKind == org.eclipse.core.resources.IResourceDelta.CHANGED && delta.getFlags() != org.eclipse.core.resources.IResourceDelta.MARKERS) {
							org.eclipse.emf.ecore.resource.Resource changedResource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(delta.getFullPath().toString()), false);
							if (changedResource != null) {
								changedResource.unload();
								hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource currentResource = getResource();
								if (changedResource.equals(currentResource)) {
									// reload the resource displayed in the editor
									resourceSet.getResource(currentResource.getURI(), true);
								}
								if (currentResource != null && currentResource.getErrors().isEmpty()) {
									org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(currentResource);
								}
								refreshMarkers(currentResource);
								// reset the selected element in outline and
								// properties by text position
								if (highlighting != null) {
									highlighting.setEObjectSelection();
								}
							}
						}
						
						return true;
					}
				}
				
				ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
				delta.accept(visitor);
			} catch (org.eclipse.core.runtime.CoreException exception) {
				hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.logError("Unexpected Error: ", exception);
			}
		}
	}
	
	@SuppressWarnings("unchecked")	
	public java.lang.Object getAdapter(Class required) {
		if (org.eclipse.ui.views.contentoutline.IContentOutlinePage.class.equals(required)) {
			return getOutlinePage();
		} else if (required.equals(org.eclipse.ui.views.properties.IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(required);
	}
	
	public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
		super.createPartControl(parent);
		display = parent.getShell().getDisplay();
		// we might need to refresh the markers, because the display was not set before, which
		// prevents updates of the markers
		refreshMarkers(getResource());
		
		// Code Folding
		org.eclipse.jface.text.source.projection.ProjectionViewer viewer = (org.eclipse.jface.text.source.projection.ProjectionViewer) getSourceViewer();
		// Occurrence initiation, need ITextResource and ISourceViewer.
		highlighting = new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcHighlighting(getResource(), viewer, colorManager, this);
		
		projectionSupport = new org.eclipse.jface.text.source.projection.ProjectionSupport(viewer, getAnnotationAccess(), getSharedColors());
		projectionSupport.install();
		
		// turn projection mode on
		viewer.doOperation(org.eclipse.jface.text.source.projection.ProjectionViewer.TOGGLE);
		codeFoldingManager = new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcCodeFoldingManager(viewer, this);
	}
	
	protected void doSetInput(org.eclipse.ui.IEditorInput editorInput) throws org.eclipse.core.runtime.CoreException {
		super.doSetInput(editorInput);
		initializeResourceObject(editorInput);
		org.eclipse.jface.text.IDocument document = getDocumentProvider().getDocument(getEditorInput());
		document.addDocumentListener(new DocumentListener());
	}
	
	private void initializeResourceObject(org.eclipse.ui.IEditorInput editorInput) {
		org.eclipse.ui.part.FileEditorInput input = (org.eclipse.ui.part.FileEditorInput) editorInput;
		org.eclipse.core.resources.IFile inputFile = input.getFile();
		hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcNature.activate(inputFile.getProject());
		String path = inputFile.getFullPath().toString();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(path, true);
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = editingDomain.getResourceSet();
		hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource loadedResource = (hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource) resourceSet.getResource(uri, false);
		if (loadedResource == null) {
			try {
				org.eclipse.emf.ecore.resource.Resource demandLoadedResource = null;
				//here we do not use getResource(), because 'resource' might be null, which is ok when initializing the resource object
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource currentResource = this.resource;
				if (currentResource != null && !currentResource.getURI().fileExtension().equals(uri.fileExtension())) {
					//do not attempt to load if file extension has changed in a 'save as' operation	
				}
				else {
					demandLoadedResource = resourceSet.getResource(uri, true);
				}
				if (demandLoadedResource instanceof hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource) {
					setResource((hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource) demandLoadedResource);
				} else {
					// the resource was not loaded by an EMFText resource, but
					// some other EMF resource
					hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.showErrorDialog("No EMFText resource.", "The file '" + uri.lastSegment() + "' of type '" + uri.fileExtension() + "' can not be handled by the RemessrcEditor.");
					//close this editor because it can not present the resource
					close(false);
				}
			} catch (java.lang.Exception e) {
				hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.logError("Exception while loading resource in " + this.getClass().getSimpleName() + ".", e);
			}
		} else {
			setResource(loadedResource);
		}
	}
	
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
	
	protected void performSave(boolean overwrite, org.eclipse.core.runtime.IProgressMonitor progressMonitor) {
		
		super.performSave(overwrite, progressMonitor);
		// update markers after the resource has been reloaded
		refreshMarkers(getResource());
		
		// Save code folding state
		codeFoldingManager.saveCodeFoldingStateFile(getResource().getURI().toString());
	}
	
	public void registerTextPresentationListener(org.eclipse.jface.text.ITextPresentationListener listener) {
		org.eclipse.jface.text.source.ISourceViewer viewer = getSourceViewer();
		if (viewer instanceof org.eclipse.jface.text.TextViewer) {
			((org.eclipse.jface.text.TextViewer) viewer).addTextPresentationListener(listener);
		}
	}
	
	public void invalidateTextRepresentation() {
		org.eclipse.jface.text.source.ISourceViewer viewer = getSourceViewer();
		if (viewer != null) {
			viewer.invalidateTextPresentation();
		}
		highlighting.resetValues();
	}
	
	public void setFocus() {
		super.setFocus();
		this.invalidateTextRepresentation();
	}
	
	protected void performSaveAs(org.eclipse.core.runtime.IProgressMonitor progressMonitor) {
		org.eclipse.ui.part.FileEditorInput input = (org.eclipse.ui.part.FileEditorInput) getEditorInput();
		String path = input.getFile().getFullPath().toString();
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = editingDomain.getResourceSet();
		org.eclipse.emf.common.util.URI platformURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(path, true);
		org.eclipse.emf.ecore.resource.Resource oldFile = resourceSet.getResource(platformURI, true);
		
		super.performSaveAs(progressMonitor);
		
		// load and resave - input has been changed to new path by super
		org.eclipse.ui.part.FileEditorInput newInput = (org.eclipse.ui.part.FileEditorInput) getEditorInput();
		String newPath = newInput.getFile().getFullPath().toString();
		org.eclipse.emf.common.util.URI newPlatformURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(newPath, true);
		org.eclipse.emf.ecore.resource.Resource newFile = resourceSet.createResource(newPlatformURI);
		// if the extension is the same, saving was already performed by super by saving the plain text
		if (platformURI.fileExtension().equals(newPlatformURI.fileExtension())) {
			oldFile.unload();
			// save code folding state, is it possible with a new name
			codeFoldingManager.saveCodeFoldingStateFile(getResource().getURI().toString());
		}
		else {
			newFile.getContents().clear();
			newFile.getContents().addAll(oldFile.getContents());
			try {
				oldFile.unload();
				if (newFile.getErrors().isEmpty()) {
					newFile.save(null);
				}
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public org.eclipse.emf.ecore.resource.ResourceSet getResourceSet() {
		return editingDomain.getResourceSet();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource getResource() {
		assert resource != null;
		return resource;
	}
	
	private void setResource(hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource) {
		assert resource != null;
		this.resource = resource;
		if (this.resource.getErrors().isEmpty()) {
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this.resource);
		}
		refreshMarkers(this.resource);
	}
	
	private java.lang.Object getOutlinePage() {
		if (outlinePage == null) {
			outlinePage = new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcOutlinePage(this);
			outlinePage.addSelectionChangedListener(highlighting);
			highlighting.addSelectionChangedListener(outlinePage);
		}
		return outlinePage;
	}
	
	public org.eclipse.ui.views.properties.IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcPropertySheetPage();
			// add a slightly modified adapter factory that does not return any
			// editors for properties
			// this way, a model can never be modified through the properties
			// view
			propertySheetPage.setPropertySourceProvider(new org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider(adapterFactory) {
				protected org.eclipse.ui.views.properties.IPropertySource createPropertySource(java.lang.Object object, org.eclipse.emf.edit.provider.IItemPropertySource itemPropertySource) {
					return new org.eclipse.emf.edit.ui.provider.PropertySource(object, itemPropertySource) {
						protected org.eclipse.ui.views.properties.IPropertyDescriptor createPropertyDescriptor(org.eclipse.emf.edit.provider.IItemPropertyDescriptor itemPropertyDescriptor) {
							return new org.eclipse.emf.edit.ui.provider.PropertyDescriptor(object, itemPropertyDescriptor) {
								public org.eclipse.jface.viewers.CellEditor createPropertyEditor(org.eclipse.swt.widgets.Composite composite) {
									return null;
								}
							};
						}
					};
				}
			});
			highlighting.addSelectionChangedListener(propertySheetPage);
		}
		return propertySheetPage;
	}
	
	protected void createActions() {
		super.createActions();
		
	}
	
	public org.eclipse.emf.edit.domain.EditingDomain getEditingDomain() {
		return editingDomain;
	}
	
	private void initializeEditingDomain() {
		adapterFactory = new org.eclipse.emf.edit.provider.ComposedAdapterFactory(org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory());
		
		org.eclipse.emf.common.command.BasicCommandStack commandStack = new org.eclipse.emf.common.command.BasicCommandStack();
		// CommandStackListeners can listen for changes. Not sure whether this
		// is needed.
		
		editingDomain = new org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain(adapterFactory,commandStack, new java.util.HashMap<org.eclipse.emf.ecore.resource.Resource, Boolean>());
	}
	
	//
	// Sets the caret to the offset of the given element.
	//
	// @param element
	//            has to be contained in the resource of this editor.
	//
	public void setCaret(org.eclipse.emf.ecore.EObject element, String text) {
		try {
			if (element == null || text == null || text.equals("")) {
				return;
			}
			org.eclipse.jface.text.source.ISourceViewer viewer = getSourceViewer();
			hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource textResource = (hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource) element.eResource();
			hr.fer.rasip.remes.resource.remessrc.IRemessrcLocationMap locationMap = textResource.getLocationMap();
			int destination = locationMap.getCharStart(element);
			int length = locationMap.getCharEnd(element) + 1 - destination;
			
			hr.fer.rasip.remes.resource.remessrc.IRemessrcTextScanner lexer = getResource().getMetaInformation().createLexer();
			try {
				lexer.setText(viewer.getDocument().get(destination, length));
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTextToken token = lexer.getNextToken();
				String tokenText = token.getText();
				while (tokenText != null) {
					if (token.getText().equals(text)) {
						destination += token.getOffset();
						break;
					}
					token = lexer.getNextToken();
					tokenText = token.getText();
				}
			} catch (org.eclipse.jface.text.BadLocationException e) {
			}
			destination = ((org.eclipse.jface.text.source.projection.ProjectionViewer) viewer).modelOffset2WidgetOffset(destination);
			if (destination < 0) {
				destination = 0;
			}
			viewer.getTextWidget().setSelection(destination);
		} catch (java.lang.Exception e) {
			hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.logError("java.lang.Exception in setCaret()", e);
		}
	}
	
	protected org.eclipse.jface.text.source.ISourceViewer createSourceViewer(org.eclipse.swt.widgets.Composite parent, org.eclipse.jface.text.source.IVerticalRuler ruler, int styles) {
		org.eclipse.jface.text.source.ISourceViewer viewer = new org.eclipse.jface.text.source.projection.ProjectionViewer(parent, ruler, getOverviewRuler(), isOverviewRulerVisible(), styles);
		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);
		return viewer;
	}
	
	public void addBackgroundParsingListener(hr.fer.rasip.remes.resource.remessrc.IRemessrcBackgroundParsingListener listener) {
		bgParsingListeners.add(listener);
	}
	
	public void notifyBackgroundParsingFinished() {
		for (hr.fer.rasip.remes.resource.remessrc.IRemessrcBackgroundParsingListener listener : bgParsingListeners) {
			listener.parsingCompleted(getResource());
		}
	}
	
	private void refreshMarkers(final org.eclipse.emf.ecore.resource.Resource resourceToRefresh) {
		if (resourceToRefresh == null) {
			return;
		}
		if (display != null) {
			display.asyncExec(new java.lang.Runnable() {
				public void run() {
					try {
						hr.fer.rasip.remes.resource.remessrc.ui.RemessrcMarkerHelper.unmark(resourceToRefresh);
						hr.fer.rasip.remes.resource.remessrc.ui.RemessrcMarkerHelper.mark(resourceToRefresh);
					} catch (org.eclipse.core.runtime.CoreException e) {
						hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.logError("Exception while updating markers on resource", e);
					}
				}
			});
		}
	}
}
