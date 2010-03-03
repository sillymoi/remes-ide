/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcResource extends org.eclipse.emf.ecore.resource.impl.ResourceImpl implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource {
	
	public class ElementBasedTextDiagnostic implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTextDiagnostic {
		
		private final hr.fer.rasip.remes.resource.remessrc.IRemessrcLocationMap locationMap;
		private final org.eclipse.emf.common.util.URI uri;
		private final org.eclipse.emf.ecore.EObject element;
		private final hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem problem;
		
		public ElementBasedTextDiagnostic(hr.fer.rasip.remes.resource.remessrc.IRemessrcLocationMap locationMap, org.eclipse.emf.common.util.URI uri, hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem problem, org.eclipse.emf.ecore.EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public java.lang.String getMessage() {
			return problem.getMessage();
		}
		
		public hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem getProblem() {
			return problem;
		}
		
		public java.lang.String getLocation() {
			return uri.toString();
		}
		
		public int getCharStart() {
			return Math.max(0, locationMap.getCharStart(element));
		}
		
		public int getCharEnd() {
			return Math.max(0, locationMap.getCharEnd(element));
		}
		
		public int getColumn() {
			return Math.max(0, locationMap.getColumn(element));
		}
		
		public int getLine() {
			return Math.max(0, locationMap.getLine(element));
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			if (this.element == null) {
				return false;
			}
			return this.element.equals(element);
		}
	}
	
	public class PositionBasedTextDiagnostic implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTextDiagnostic {
		
		private final org.eclipse.emf.common.util.URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem problem;
		
		public PositionBasedTextDiagnostic(org.eclipse.emf.common.util.URI uri, hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem problem, int column, int line, int charStart, int charEnd) {
			
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem getProblem() {
			return problem;
		}
		
		public int getCharStart() {
			return charStart;
		}
		
		public int getCharEnd() {
			return charEnd;
		}
		
		public int getColumn() {
			return column;
		}
		
		public int getLine() {
			return line;
		}
		
		public java.lang.String getLocation() {
			return uri.toString();
		}
		
		public java.lang.String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			return false;
		}
	}
	
	private hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolverSwitch resolverSwitch;
	private hr.fer.rasip.remes.resource.remessrc.IRemessrcLocationMap locationMap;
	private int proxyCounter = 0;
	private hr.fer.rasip.remes.resource.remessrc.IRemessrcTextParser parser;
	private java.util.Map<java.lang.String, hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>> internalURIFragmentMap = new java.util.HashMap<java.lang.String, hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>>();
	
	public RemessrcResource() {
		super();
		resetLocationMap();
	}
	
	public RemessrcResource(org.eclipse.emf.common.util.URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		java.lang.String encoding = null;
		java.io.InputStream actualInputStream = inputStream;
		java.lang.Object inputStreamPreProcessorProvider = null;
		if (options!=null) {
			inputStreamPreProcessorProvider = options.get(hr.fer.rasip.remes.resource.remessrc.IRemessrcOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
		}
		if (inputStreamPreProcessorProvider != null) {
			if (inputStreamPreProcessorProvider instanceof hr.fer.rasip.remes.resource.remessrc.IRemessrcInputStreamProcessorProvider) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcInputStreamProcessorProvider provider = (hr.fer.rasip.remes.resource.remessrc.IRemessrcInputStreamProcessorProvider) inputStreamPreProcessorProvider;
				hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
				actualInputStream = processor;
				encoding = processor.getOutputEncoding();
			}
		}
		
		parser = getMetaInformation().createParser(actualInputStream, encoding);
		parser.setOptions(options);
		hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		hr.fer.rasip.remes.resource.remessrc.IRemessrcParseResult result = parser.parse();
		clearState();
		getContents().clear();
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				getContents().add(root);
			}
			java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>> commands = result.getPostParseCommands();
			if (commands != null) {
				for (hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>  command : commands) {
					command.execute(this);
				}
			}
		}
		getReferenceResolverSwitch().setOptions(options);
		if (getErrors().isEmpty()) {
			runPostProcessors(options);
		}
	}
	
	public void reload(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		try {
			isLoaded = false;
			java.util.Map<java.lang.Object, java.lang.Object> loadOptions = addDefaultLoadOptions(options);
			doLoad(inputStream, loadOptions);
		} catch (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException tpe) {
			// do nothing - the resource is left unchanged if this exception is thrown
		}
		isLoaded = true;
	}
	
	public void cancelReload() {
		hr.fer.rasip.remes.resource.remessrc.IRemessrcTextParser parserCopy = parser;
		parserCopy.terminate();
	}
	
	protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws java.io.IOException {
		hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPrinter printer = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPrinter(outputStream, this);
		hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		for(org.eclipse.emf.ecore.EObject root : getContents()) {
			printer.print(root);
		}
	}
	
	protected String getSyntaxName() {
		return "remessrc";
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation getMetaInformation() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation();
	}
	
	protected void resetLocationMap() {
		locationMap = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcLocationMap();
	}
	
	public void addURIFragment(java.lang.String internalURIFragment, hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, java.lang.String id, org.eclipse.emf.ecore.EObject proxyElement) {
		int pos = -1;
		if (reference.isMany()) {
			pos = ((java.util.List<?>)container.eGet(reference)).size();
		}
		org.eclipse.emf.ecore.InternalEObject proxy = (org.eclipse.emf.ecore.InternalEObject) proxyElement;
		java.lang.String internalURIFragment = hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, pos, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result = uriFragment.resolve();
			if (result == null) {
				//the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachErrors(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				//remove an error that might have been added by an earlier attempt
				removeDiagnostics(uriFragment.getProxy(), getErrors());
				//remove old warnings and attach new
				removeDiagnostics(uriFragment.getProxy(), getWarnings());
				attachWarnings(result, uriFragment.getProxy());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping = result.getMappings().iterator().next();
				return getResultElement(uriFragment, mapping, uriFragment.getProxy(), result.getErrorMessage());
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	private org.eclipse.emf.ecore.EObject getResultElement(hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment, hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping, org.eclipse.emf.ecore.EObject proxy, final java.lang.String errorMessage) {
		if (mapping instanceof hr.fer.rasip.remes.resource.remessrc.IRemessrcURIMapping<?>) {
			org.eclipse.emf.common.util.URI uri = ((hr.fer.rasip.remes.resource.remessrc.IRemessrcURIMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (java.lang.Exception e) {
					//we can catch exceptions here, because EMF will try to resolve again and handle the exception
				}
				if (result == null || result.eIsProxy()) {
					//unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcProblem(errorMessage, hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof hr.fer.rasip.remes.resource.remessrc.IRemessrcElementMapping<?>) {
			org.eclipse.emf.ecore.EObject element = ((hr.fer.rasip.remes.resource.remessrc.IRemessrcElementMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.ecore.EObject> list = hr.fer.rasip.remes.resource.remessrc.util.RemessrcCastUtil.cast(element.eGet(oppositeReference, false));										//avoids duplicate entries in the reference caused by adding to the oppositeReference 
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert(false);
			return null;
		}
	}
	
	private void removeDiagnostics(org.eclipse.emf.ecore.EObject proxy, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics) {
		// remove errors/warnings from resource
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic errorCand : new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(diagnostics)) {
			if (errorCand instanceof hr.fer.rasip.remes.resource.remessrc.IRemessrcTextDiagnostic) {
				if (((hr.fer.rasip.remes.resource.remessrc.IRemessrcTextDiagnostic) errorCand).wasCausedBy(proxy)) {
					diagnostics.remove(errorCand);
				}
			}
		}
	}
	
	private void attachErrors(hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolveResult<?> result, org.eclipse.emf.ecore.EObject proxy) {
		// attach errors to resource
		assert result != null;
		final java.lang.String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcProblem(errorMessage, hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType.ERROR), proxy);
		}
	}
	
	private void attachWarnings(hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result, org.eclipse.emf.ecore.EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping : result.getMappings()) {
				final java.lang.String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcProblem(warningMessage, hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType.ERROR), proxy);
			}
		}
	}
	
	// Extends the super implementation by clearing all information about element positions.
	protected void doUnload() {
		super.doUnload();
		clearState();
	}
	
	protected void runPostProcessors(java.util.Map<?, ?> loadOptions) {
		if (loadOptions == null) {
			return;
		}
		java.lang.Object resourcePostProcessorProvider = loadOptions.get(hr.fer.rasip.remes.resource.remessrc.IRemessrcOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof hr.fer.rasip.remes.resource.remessrc.IRemessrcResourcePostProcessorProvider) {
				((hr.fer.rasip.remes.resource.remessrc.IRemessrcResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor().process(this);
			} else if (resourcePostProcessorProvider instanceof java.util.Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (processorProvider instanceof hr.fer.rasip.remes.resource.remessrc.IRemessrcResourcePostProcessorProvider) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcResourcePostProcessorProvider csProcessorProvider = (hr.fer.rasip.remes.resource.remessrc.IRemessrcResourcePostProcessorProvider) processorProvider;
						hr.fer.rasip.remes.resource.remessrc.IRemessrcResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						try {
							postProcessor.process(this);
						} catch (java.lang.Exception e) {
							hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.logError("Exception while running a post-processor.", e);
						}
					}
				}
			}
		}
	}
	
	public void load(java.util.Map<?, ?> options) throws java.io.IOException {
		java.util.Map<java.lang.Object, java.lang.Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
	}
	
	public void setURI(org.eclipse.emf.common.util.URI uri) {
		//because of the context dependent proxy resolving it is 
		//essential to resolve all proxies before the URI is changed
		//which can cause loss of object identities
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void addProblem(hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem problem, org.eclipse.emf.ecore.EObject element) {
		getDiagnostics(problem.getType()).add(new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element));
	}
	
	public void addProblem(hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem problem, int column, int line, int charStart, int charEnd) {
		getDiagnostics(problem.getType()).add(new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd));
	}
	
	public void addError(java.lang.String message, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcProblem(message, hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType.ERROR), cause);
	}
	
	public void addWarning(java.lang.String message, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcProblem(message, hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType.WARNING), cause);
	}
	
	private java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getDiagnostics(hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType type) {
		if (type == hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected java.util.Map<java.lang.Object, java.lang.Object> addDefaultLoadOptions(java.util.Map<?, ?> loadOptions) {
		java.util.Map<java.lang.Object, java.lang.Object> loadOptionsCopy = hr.fer.rasip.remes.resource.remessrc.util.RemessrcMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// find default load option providers
			org.eclipse.core.runtime.IExtensionRegistry extensionRegistry = org.eclipse.core.runtime.Platform.getExtensionRegistry();
			org.eclipse.core.runtime.IConfigurationElement configurationElements[] = extensionRegistry.getConfigurationElementsFor(hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.EP_DEFAULT_LOAD_OPTIONS_ID);
			for (org.eclipse.core.runtime.IConfigurationElement element : configurationElements) {
				try {
					hr.fer.rasip.remes.resource.remessrc.IRemessrcOptionProvider provider = (hr.fer.rasip.remes.resource.remessrc.IRemessrcOptionProvider) element.createExecutableExtension("class");
					final java.util.Map<?, ?> options = provider.getOptions();
					final java.util.Collection<?> keys = options.keySet();
					for (java.lang.Object key : keys) {
						addLoadOption(loadOptionsCopy, key, options.get(key));
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.logError("Exception while getting default options.", ce);
				}
			}
		}
		return loadOptionsCopy;
	}
	
	// Adds a new key,value pair to the list of options. If there
	// is already an option with the same key, the two values are 
	// collected in a list.
	private void addLoadOption(java.util.Map<java.lang.Object, java.lang.Object> options,java.lang.Object key, java.lang.Object value) {
		// check if there is already an option set
		if (options.containsKey(key)) {
			java.lang.Object currentValue = options.get(key);
			if (currentValue instanceof java.util.List<?>) {
				// if the current value is a list, we add the new value to
				// this list
				java.util.List<?> currentValueAsList = (java.util.List<?>) currentValue;
				java.util.List<java.lang.Object> currentValueAsObjectList = hr.fer.rasip.remes.resource.remessrc.util.RemessrcListUtil.copySafelyToObjectList(currentValueAsList);
				if (value instanceof java.util.Collection<?>) {
					currentValueAsObjectList.addAll((java.util.Collection<?>) value);
				} else {
					currentValueAsObjectList.add(value);
				}
				options.put(key, currentValueAsObjectList);
			} else {
				// if the current value is not a list, we create a fresh list
				// and add both the old (current) and the new value to this list
				java.util.List<java.lang.Object> newValueList = new java.util.ArrayList<java.lang.Object>();
				newValueList.add(currentValue);
				if (value instanceof java.util.Collection<?>) {
					newValueList.addAll((java.util.Collection<?>) value);
				} else {
					newValueList.add(value);
				}
				options.put(key, newValueList);
			}
		} else {
			options.put(key, value);
		}
	}
	
	// Extends the super implementation by clearing all information about element positions.
	protected void clearState() {
		//clear concrete syntax information
		resetLocationMap();
		internalURIFragmentMap.clear();
		getErrors().clear();
		getWarnings().clear();
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContents() {
		return new hr.fer.rasip.remes.resource.remessrc.util.RemessrcCopiedEObjectInternalEList((org.eclipse.emf.ecore.util.InternalEList<org.eclipse.emf.ecore.EObject>) super.getContents());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getWarnings() {
		return new hr.fer.rasip.remes.resource.remessrc.util.RemessrcCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getWarnings());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getErrors() {
		return new hr.fer.rasip.remes.resource.remessrc.util.RemessrcCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getErrors());
	}
	
}
