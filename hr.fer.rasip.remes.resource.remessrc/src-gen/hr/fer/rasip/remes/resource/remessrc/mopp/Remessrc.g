grammar Remessrc;

options {
	superClass = RemessrcANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package hr.fer.rasip.remes.resource.remessrc.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime.ANTLRStringStream) input).index());
	}
}
@header{
	package hr.fer.rasip.remes.resource.remessrc.mopp;
}

@members{
	private hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolverFactory tokenResolverFactory = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTokenResolverFactory();
	@SuppressWarnings("unused")
	
	private int lastPosition;
	private hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTokenResolveResult tokenResolveResult = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTokenResolveResult();
	private boolean rememberExpectedElements = false;
	private java.lang.Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	private java.util.List<hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal> expectedElements = new java.util.ArrayList<hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal>();
	private int mismatchedTokenRecoveryTries = 0;
	private java.util.Map<?, ?> options;
	//helper lists to allow a lexer to pass errors to its parser
	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>> postParseCommands;
	private boolean terminateParsing;
	private int tokenIndexOfLastCompleteElement;
	private int expectedElementsIndexOfLastCompleteElement;
	
	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
		postParseCommands.add(new hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>() {
			public boolean execute(hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for
					// code completion
					return true;
				}
				resource.addProblem(new hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem() {
					public hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType getType() {
						return hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType.ERROR;
					}
					public java.lang.String getMessage() {
						return errorMessage;
					}
				}, line, charPositionInLine, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal expectedElement) {
		if (!this.rememberExpectedElements) {
			return;
		}
		setPosition(expectedElement, input.index());
		this.expectedElements.add(expectedElement);
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcDummyEObject dummy) {
		java.lang.Object value = element.eGet(structuralFeature);
		java.lang.Object mapKey = dummy.getValueByName("key");
		java.lang.Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = hr.fer.rasip.remes.resource.remessrc.util.RemessrcMapUtil.castToEMap(value);
			if (mapKey != null && mapValue != null) {
				valueMap.put(mapKey, mapValue);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	
	private boolean addObjectToList(org.eclipse.emf.ecore.EObject element, int featureID, java.lang.Object proxy) {
		return ((java.util.List<java.lang.Object>) element.eGet(element.eClass().getEStructuralFeature(featureID))).add(proxy);
	}
	
	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
		org.eclipse.emf.ecore.EObject currentTarget = target;
		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
			assert(object instanceof hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcDummyEObject);
			hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcDummyEObject dummy = (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>() {
			public boolean execute(hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for
					// code completion
					return true;
				}
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final org.antlr.runtime.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>() {
			public boolean execute(hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for
					// code completion
					return true;
				}
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
		try {
			if (encoding == null) {
				return new RemessrcParser(new org.antlr.runtime.CommonTokenStream(new RemessrcLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream))));
			} else {
				return new RemessrcParser(new org.antlr.runtime.CommonTokenStream(new RemessrcLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	// This default constructor is only used to call createInstance() on it
	public RemessrcParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((RemessrcLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((RemessrcLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		java.lang.Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == se.mdh.progresside.remes.RemesDiagram.class) {
				return parse_se_mdh_progresside_remes_RemesDiagram();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.CompositeMode.class) {
				return parse_se_mdh_progresside_remes_CompositeMode();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.SubMode.class) {
				return parse_se_mdh_progresside_remes_SubMode();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.ConditionalConnector.class) {
				return parse_se_mdh_progresside_remes_ConditionalConnector();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.InitPoint.class) {
				return parse_se_mdh_progresside_remes_InitPoint();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.ExitPoint.class) {
				return parse_se_mdh_progresside_remes_ExitPoint();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.CompositeEntryPoint.class) {
				return parse_se_mdh_progresside_remes_CompositeEntryPoint();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.Edge.class) {
				return parse_se_mdh_progresside_remes_Edge();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.InitEdge.class) {
				return parse_se_mdh_progresside_remes_InitEdge();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.Variable.class) {
				return parse_se_mdh_progresside_remes_Variable();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.Resource.class) {
				return parse_se_mdh_progresside_remes_Resource();
			}
			if (type.getInstanceClass() == se.mdh.progresside.remes.Constant.class) {
				return parse_se_mdh_progresside_remes_Constant();
			}
		}
		throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcUnexpectedContentTypeException(typeObject);
	}
	
	private hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTokenResolveResult getFreshTokenResolveResult() {
		tokenResolveResult.clear();
		return tokenResolveResult;
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public java.lang.Object getMissingSymbol(org.antlr.runtime.IntStream arg0, org.antlr.runtime.RecognitionException arg1, int arg2, org.antlr.runtime.BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	protected java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation getMetaInformation() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation();
	}
	
	public java.lang.Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcReferenceResolverSwitch getReferenceResolverSwitch() {
		return (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
	}
	
	protected java.lang.Object getTypeObject() {
		java.lang.Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(hr.fer.rasip.remes.resource.remessrc.IRemessrcOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	// Implementation that calls {@link #doParse()}  and handles the thrown
	// RecognitionExceptions.
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>>();
		hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcParseResult parseResult = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				//? can be caused if a null is set on EMF models where not allowed;
				//? this will just happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource dummyResource) {
		rememberExpectedElements = true;
		parseToIndexTypeObject = type;
		final org.antlr.runtime.CommonTokenStream tokenStream = (org.antlr.runtime.CommonTokenStream) getTokenStream();
		hr.fer.rasip.remes.resource.remessrc.IRemessrcParseResult result = parse();
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContents().add(root);
			}
			for (hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal>();
		java.util.List<hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal> newFollowSet = new java.util.ArrayList<hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 91;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime.CommonToken nextToken = (org.antlr.runtime.CommonToken) tokenStream.get(i);
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected terminals
				// can be set
				for (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are kept
				for (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement> newFollowers = nextFollow.getTerminal().getFollowers();
						for (hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement newFollower : newFollowers) {
							hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal newFollowTerminal = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(newFollower, followSetID);
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements that were
		// added during the last iteration of the loop
		for (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = java.lang.Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			org.antlr.runtime.CommonToken tokenAtIndex = (org.antlr.runtime.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = java.lang.Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public java.lang.Object recoverFromMismatchedToken(org.antlr.runtime.IntStream input, int ttype, org.antlr.runtime.BitSet follow) throws org.antlr.runtime.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		postParseCommands.add(new hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>() {
			public boolean execute(hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for
					// code completion
					return true;
				}
				resource.registerContextDependentProxy(factory, element, reference, id, proxy);
				return true;
			}
		});
	}
	
	// Translates errors thrown by the parser into human readable messages.
	public void reportError(final org.antlr.runtime.RecognitionException e)  {
		java.lang.String message = e.getMessage();
		if (e instanceof org.antlr.runtime.MismatchedTokenException) {
			org.antlr.runtime.MismatchedTokenException mte = (org.antlr.runtime.MismatchedTokenException) e;
			java.lang.String tokenName = "<unknown>";
			if (mte.expecting == Token.EOF) {
				tokenName = "EOF";
			} else {
				tokenName = getTokenNames()[mte.expecting];
				tokenName = hr.fer.rasip.remes.resource.remessrc.util.RemessrcStringUtil.formatTokenName(tokenName);
			}
			message = "Syntax error on token \"" + e.token.getText() + "\", \"" + tokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime.MismatchedTreeNodeException) {
			org.antlr.runtime.MismatchedTreeNodeException mtne = (org.antlr.runtime.MismatchedTreeNodeException) e;
			java.lang.String tokenName = "<unknown>";
			if (mtne.expecting == Token.EOF) {
				tokenName = "EOF";
			} else {
				tokenName = getTokenNames()[mtne.expecting];
			}
			message = "mismatched tree node: "+"xxx" +"; expecting " + tokenName;
		} else if (e instanceof org.antlr.runtime.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime.MismatchedSetException) {
			org.antlr.runtime.MismatchedSetException mse = (org.antlr.runtime.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime.MismatchedNotSetException) {
			org.antlr.runtime.MismatchedNotSetException mse = (org.antlr.runtime.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime.FailedPredicateException) {
			org.antlr.runtime.FailedPredicateException fpe = (org.antlr.runtime.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText+"}?";
		}
		// the resource may be null if the parse is used for code completion
		final java.lang.String finalMessage = message;
		if (e.token instanceof org.antlr.runtime.CommonToken) {
			final org.antlr.runtime.CommonToken ct = (org.antlr.runtime.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	// Translates errors thrown by the lexer into human readable messages.
	public void reportLexicalError(final org.antlr.runtime.RecognitionException e)  {
		java.lang.String message = "";
		if (e instanceof org.antlr.runtime.MismatchedTokenException) {
			org.antlr.runtime.MismatchedTokenException mte = (org.antlr.runtime.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime.EarlyExitException) {
			org.antlr.runtime.EarlyExitException eee = (org.antlr.runtime.EarlyExitException) e;
			message ="required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime.MismatchedSetException) {
			org.antlr.runtime.MismatchedSetException mse = (org.antlr.runtime.MismatchedSetException) e;
			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime.MismatchedNotSetException) {
			org.antlr.runtime.MismatchedNotSetException mse = (org.antlr.runtime.MismatchedNotSetException) e;
			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime.MismatchedRangeException) {
			org.antlr.runtime.MismatchedRangeException mre = (org.antlr.runtime.MismatchedRangeException) e;
			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime.FailedPredicateException) {
			org.antlr.runtime.FailedPredicateException fpe = (org.antlr.runtime.FailedPredicateException) e;
			message ="rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.index, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public void terminate() {
		terminateParsing = true;
	}
	
	protected void completedElement(Object element) {
		if (element instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_0 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("remes");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_1 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_2 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("composite");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_3 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("atomic");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_4 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_5 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_6 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_7 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("var");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_8 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("resource");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_9 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("const");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_10 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("conditional");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_11 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("init");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_12 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("entry");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_13 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_14 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_15 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_16 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_17 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("invariant");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_18 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("edges");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_19 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_20 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_21 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_22 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_23 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_24 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("edge");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_25 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_26 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("edge");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_27 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_28 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("(");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_29 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_30 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("to");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_31 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_32 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(")");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_33 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_34 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_35 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_36 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_37 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("to");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_38 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_39 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_40 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_41 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_42 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_43 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_44 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_45 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("[");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_46 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_47 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_48 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("]");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_49 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("=");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_50 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_51 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_52 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_53 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(":");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_54 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_55 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_56 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE), "TEXT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_57 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME), "QUOTED_34_34");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_58 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString("=");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_59 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE), "QUOTED_34_34");
	
	public static void wire0() {
		TERMINAL_0.addFollower(TERMINAL_1);
		TERMINAL_1.addFollower(TERMINAL_2);
		TERMINAL_1.addFollower(TERMINAL_3);
		TERMINAL_1.addFollower(TERMINAL_4);
		TERMINAL_2.addFollower(TERMINAL_5);
		TERMINAL_5.addFollower(TERMINAL_6);
		TERMINAL_6.addFollower(TERMINAL_7);
		TERMINAL_6.addFollower(TERMINAL_8);
		TERMINAL_6.addFollower(TERMINAL_9);
		TERMINAL_6.addFollower(TERMINAL_3);
		TERMINAL_6.addFollower(TERMINAL_10);
		TERMINAL_6.addFollower(TERMINAL_11);
		TERMINAL_6.addFollower(TERMINAL_12);
		TERMINAL_6.addFollower(TERMINAL_13);
		TERMINAL_13.addFollower(TERMINAL_2);
		TERMINAL_13.addFollower(TERMINAL_3);
		TERMINAL_13.addFollower(TERMINAL_4);
		TERMINAL_3.addFollower(TERMINAL_14);
		TERMINAL_3.addFollower(TERMINAL_15);
		TERMINAL_14.addFollower(TERMINAL_15);
		TERMINAL_15.addFollower(TERMINAL_16);
		TERMINAL_16.addFollower(TERMINAL_7);
		TERMINAL_16.addFollower(TERMINAL_8);
		TERMINAL_16.addFollower(TERMINAL_9);
		TERMINAL_16.addFollower(TERMINAL_17);
		TERMINAL_16.addFollower(TERMINAL_18);
		TERMINAL_16.addFollower(TERMINAL_12);
		TERMINAL_17.addFollower(TERMINAL_19);
		TERMINAL_19.addFollower(TERMINAL_18);
		TERMINAL_19.addFollower(TERMINAL_12);
		TERMINAL_20.addFollower(TERMINAL_2);
		TERMINAL_20.addFollower(TERMINAL_3);
		TERMINAL_20.addFollower(TERMINAL_4);
		TERMINAL_20.addFollower(TERMINAL_7);
		TERMINAL_20.addFollower(TERMINAL_8);
		TERMINAL_20.addFollower(TERMINAL_9);
		TERMINAL_20.addFollower(TERMINAL_10);
		TERMINAL_20.addFollower(TERMINAL_11);
		TERMINAL_20.addFollower(TERMINAL_12);
		TERMINAL_20.addFollower(TERMINAL_13);
		TERMINAL_10.addFollower(TERMINAL_21);
		TERMINAL_21.addFollower(TERMINAL_22);
		TERMINAL_22.addFollower(TERMINAL_18);
		TERMINAL_22.addFollower(TERMINAL_12);
		TERMINAL_23.addFollower(TERMINAL_7);
		TERMINAL_23.addFollower(TERMINAL_8);
		TERMINAL_23.addFollower(TERMINAL_9);
		TERMINAL_23.addFollower(TERMINAL_3);
		TERMINAL_23.addFollower(TERMINAL_10);
		TERMINAL_23.addFollower(TERMINAL_11);
		TERMINAL_23.addFollower(TERMINAL_12);
		TERMINAL_23.addFollower(TERMINAL_13);
		TERMINAL_11.addFollower(TERMINAL_24);
		TERMINAL_18.addFollower(TERMINAL_25);
		TERMINAL_25.addFollower(TERMINAL_26);
		TERMINAL_25.addFollower(TERMINAL_27);
		TERMINAL_27.addFollower(TERMINAL_20);
		TERMINAL_27.addFollower(TERMINAL_23);
		TERMINAL_12.addFollower(TERMINAL_26);
		TERMINAL_26.addFollower(TERMINAL_28);
		TERMINAL_26.addFollower(TERMINAL_29);
		TERMINAL_26.addFollower(TERMINAL_30);
		TERMINAL_28.addFollower(TERMINAL_31);
		TERMINAL_31.addFollower(TERMINAL_32);
		TERMINAL_32.addFollower(TERMINAL_29);
		TERMINAL_32.addFollower(TERMINAL_30);
		TERMINAL_29.addFollower(TERMINAL_33);
		TERMINAL_33.addFollower(TERMINAL_34);
		TERMINAL_34.addFollower(TERMINAL_30);
		TERMINAL_30.addFollower(TERMINAL_35);
		TERMINAL_35.addFollower(TERMINAL_26);
		TERMINAL_35.addFollower(TERMINAL_27);
		TERMINAL_35.addFollower(TERMINAL_7);
		TERMINAL_35.addFollower(TERMINAL_8);
		TERMINAL_35.addFollower(TERMINAL_9);
		TERMINAL_35.addFollower(TERMINAL_3);
		TERMINAL_35.addFollower(TERMINAL_10);
		TERMINAL_35.addFollower(TERMINAL_11);
		TERMINAL_35.addFollower(TERMINAL_12);
		TERMINAL_35.addFollower(TERMINAL_13);
		TERMINAL_35.addFollower(TERMINAL_20);
		TERMINAL_35.addFollower(TERMINAL_23);
		TERMINAL_24.addFollower(TERMINAL_36);
		TERMINAL_24.addFollower(TERMINAL_37);
		TERMINAL_36.addFollower(TERMINAL_38);
		TERMINAL_38.addFollower(TERMINAL_39);
		TERMINAL_39.addFollower(TERMINAL_37);
		TERMINAL_37.addFollower(TERMINAL_40);
		TERMINAL_40.addFollower(TERMINAL_7);
		TERMINAL_40.addFollower(TERMINAL_8);
		TERMINAL_40.addFollower(TERMINAL_9);
		TERMINAL_40.addFollower(TERMINAL_3);
		TERMINAL_40.addFollower(TERMINAL_10);
		TERMINAL_40.addFollower(TERMINAL_11);
		TERMINAL_40.addFollower(TERMINAL_12);
		TERMINAL_40.addFollower(TERMINAL_13);
		TERMINAL_7.addFollower(TERMINAL_41);
		TERMINAL_7.addFollower(TERMINAL_42);
		TERMINAL_7.addFollower(TERMINAL_43);
		TERMINAL_7.addFollower(TERMINAL_44);
		TERMINAL_41.addFollower(TERMINAL_42);
		TERMINAL_41.addFollower(TERMINAL_43);
		TERMINAL_41.addFollower(TERMINAL_44);
		TERMINAL_42.addFollower(TERMINAL_43);
		TERMINAL_42.addFollower(TERMINAL_44);
		TERMINAL_43.addFollower(TERMINAL_44);
		TERMINAL_44.addFollower(TERMINAL_45);
		TERMINAL_44.addFollower(TERMINAL_46);
		TERMINAL_45.addFollower(TERMINAL_47);
		TERMINAL_47.addFollower(TERMINAL_48);
		TERMINAL_48.addFollower(TERMINAL_46);
		TERMINAL_46.addFollower(TERMINAL_49);
		TERMINAL_46.addFollower(TERMINAL_7);
		TERMINAL_46.addFollower(TERMINAL_8);
		TERMINAL_46.addFollower(TERMINAL_9);
		TERMINAL_46.addFollower(TERMINAL_3);
		TERMINAL_46.addFollower(TERMINAL_10);
		TERMINAL_46.addFollower(TERMINAL_11);
		TERMINAL_46.addFollower(TERMINAL_12);
		TERMINAL_46.addFollower(TERMINAL_13);
		TERMINAL_46.addFollower(TERMINAL_17);
		TERMINAL_46.addFollower(TERMINAL_18);
		TERMINAL_49.addFollower(TERMINAL_50);
		TERMINAL_50.addFollower(TERMINAL_7);
		TERMINAL_50.addFollower(TERMINAL_8);
		TERMINAL_50.addFollower(TERMINAL_9);
		TERMINAL_50.addFollower(TERMINAL_3);
		TERMINAL_50.addFollower(TERMINAL_10);
		TERMINAL_50.addFollower(TERMINAL_11);
		TERMINAL_50.addFollower(TERMINAL_12);
		TERMINAL_50.addFollower(TERMINAL_13);
		TERMINAL_50.addFollower(TERMINAL_17);
		TERMINAL_50.addFollower(TERMINAL_18);
		TERMINAL_8.addFollower(TERMINAL_51);
		TERMINAL_51.addFollower(TERMINAL_52);
		TERMINAL_52.addFollower(TERMINAL_53);
		TERMINAL_52.addFollower(TERMINAL_7);
		TERMINAL_52.addFollower(TERMINAL_8);
		TERMINAL_52.addFollower(TERMINAL_9);
		TERMINAL_52.addFollower(TERMINAL_3);
		TERMINAL_52.addFollower(TERMINAL_10);
		TERMINAL_52.addFollower(TERMINAL_11);
		TERMINAL_52.addFollower(TERMINAL_12);
		TERMINAL_52.addFollower(TERMINAL_13);
		TERMINAL_52.addFollower(TERMINAL_17);
		TERMINAL_52.addFollower(TERMINAL_18);
		TERMINAL_53.addFollower(TERMINAL_54);
		TERMINAL_54.addFollower(TERMINAL_7);
		TERMINAL_54.addFollower(TERMINAL_8);
		TERMINAL_54.addFollower(TERMINAL_9);
		TERMINAL_54.addFollower(TERMINAL_3);
		TERMINAL_54.addFollower(TERMINAL_10);
		TERMINAL_54.addFollower(TERMINAL_11);
		TERMINAL_54.addFollower(TERMINAL_12);
		TERMINAL_54.addFollower(TERMINAL_13);
		TERMINAL_54.addFollower(TERMINAL_17);
		TERMINAL_54.addFollower(TERMINAL_18);
		TERMINAL_9.addFollower(TERMINAL_55);
		TERMINAL_9.addFollower(TERMINAL_56);
		TERMINAL_55.addFollower(TERMINAL_56);
		TERMINAL_56.addFollower(TERMINAL_57);
		TERMINAL_57.addFollower(TERMINAL_58);
		TERMINAL_57.addFollower(TERMINAL_7);
		TERMINAL_57.addFollower(TERMINAL_8);
		TERMINAL_57.addFollower(TERMINAL_9);
		TERMINAL_57.addFollower(TERMINAL_3);
		TERMINAL_57.addFollower(TERMINAL_10);
		TERMINAL_57.addFollower(TERMINAL_11);
		TERMINAL_57.addFollower(TERMINAL_12);
		TERMINAL_57.addFollower(TERMINAL_13);
		TERMINAL_57.addFollower(TERMINAL_17);
		TERMINAL_57.addFollower(TERMINAL_18);
		TERMINAL_58.addFollower(TERMINAL_59);
		TERMINAL_59.addFollower(TERMINAL_7);
		TERMINAL_59.addFollower(TERMINAL_8);
		TERMINAL_59.addFollower(TERMINAL_9);
		TERMINAL_59.addFollower(TERMINAL_3);
		TERMINAL_59.addFollower(TERMINAL_10);
		TERMINAL_59.addFollower(TERMINAL_11);
		TERMINAL_59.addFollower(TERMINAL_12);
		TERMINAL_59.addFollower(TERMINAL_13);
		TERMINAL_59.addFollower(TERMINAL_17);
		TERMINAL_59.addFollower(TERMINAL_18);
	}
	// wire the terminals
	static {
		wire0();
	}
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_0, 0));
		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
	}
	(
		c0 = parse_se_mdh_progresside_remes_RemesDiagram{ element = c0; }
	)
	EOF	
;

parse_se_mdh_progresside_remes_RemesDiagram returns [se.mdh.progresside.remes.RemesDiagram element = null]
@init{
}
:
	a0 = 'remes' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_1, 1));
	}
	
	a1 = '{' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 2));
	}
	
	(
		(
			a2_0 = parse_se_mdh_progresside_remes_Mode			{
				if (terminateParsing) {
					throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
				}
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, se.mdh.progresside.remes.RemesPackage.REMES_DIAGRAM__MODES, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 3));
	}
	
	a3 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_se_mdh_progresside_remes_CompositeMode returns [se.mdh.progresside.remes.CompositeMode element = null]
@init{
}
:
	a0 = 'composite' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_5, 5));
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
			}
			if (a1 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_6, 6));
	}
	
	a2 = '{' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 7));
	}
	
	(
		(
			(
				a3_0 = parse_se_mdh_progresside_remes_Variable				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							addObjectToList(element, se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__VARIABLES, a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 8));
			}
			
			
			|			(
				a4_0 = parse_se_mdh_progresside_remes_Resource				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							addObjectToList(element, se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__RESOURCES, a4_0);
							completedElement(a4_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a4_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 9));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 9));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 9));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 9));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 9));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 9));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 9));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 9));
			}
			
			
			|			(
				a5_0 = parse_se_mdh_progresside_remes_Constant				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							addObjectToList(element, se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__CONSTANTS, a5_0);
							completedElement(a5_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a5_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 10));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 10));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 10));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 10));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 10));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 10));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 10));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 10));
			}
			
			
			|			(
				a6_0 = parse_se_mdh_progresside_remes_SubMode				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							addObjectToList(element, se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__SUB_MODES, a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 11));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 11));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 11));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 11));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 11));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 11));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 11));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 11));
			}
			
			
			|			(
				a7_0 = parse_se_mdh_progresside_remes_ConditionalConnector				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							addObjectToList(element, se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS, a7_0);
							completedElement(a7_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a7_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 12));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 12));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 12));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 12));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 12));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 12));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 12));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 12));
			}
			
			
			|			(
				a8_0 = parse_se_mdh_progresside_remes_InitPoint				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__INIT_POINT), a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 13));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 13));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 13));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 13));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 13));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 13));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 13));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 13));
			}
			
			
			|			(
				a9_0 = parse_se_mdh_progresside_remes_CompositeEntryPoint				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT), a9_0);
							completedElement(a9_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a9_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 14));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 14));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 14));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 14));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 14));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 14));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 14));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 14));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 15));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 15));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 15));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 15));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 15));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 15));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 15));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 15));
	}
	
	a10 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 16));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 16));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 16));
	}
	
;

parse_se_mdh_progresside_remes_SubMode returns [se.mdh.progresside.remes.SubMode element = null]
@init{
}
:
	a0 = 'atomic' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_14, 17));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 17));
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
				}
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
				}
				if (a1 != null) {
					hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
					}
					java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT), resolved);
						completedElement(resolved);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 18));
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
			}
			if (a2 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_16, 19));
	}
	
	a3 = '{' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 20));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 20));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 20));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 20));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 20));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 20));
	}
	
	(
		(
			(
				a4_0 = parse_se_mdh_progresside_remes_Variable				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							addObjectToList(element, se.mdh.progresside.remes.RemesPackage.SUB_MODE__VARIABLES, a4_0);
							completedElement(a4_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a4_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 21));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 21));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 21));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 21));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 21));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 21));
			}
			
			
			|			(
				a5_0 = parse_se_mdh_progresside_remes_Resource				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							addObjectToList(element, se.mdh.progresside.remes.RemesPackage.SUB_MODE__RESOURCES, a5_0);
							completedElement(a5_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a5_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 22));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 22));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 22));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 22));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 22));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 22));
			}
			
			
			|			(
				a6_0 = parse_se_mdh_progresside_remes_Constant				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							addObjectToList(element, se.mdh.progresside.remes.RemesPackage.SUB_MODE__CONSTANTS, a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 23));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 23));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 23));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 23));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 23));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 23));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 24));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 24));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 24));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 24));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 24));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 24));
	}
	
	(
		(
			a7 = 'invariant' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 25));
			}
			
			(
				a8 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
					}
					if (a8 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 26));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 26));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 27));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 27));
	}
	
	(
		a9_0 = parse_se_mdh_progresside_remes_ExitPoint		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__EXIT_POINT), a9_0);
					completedElement(a9_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a9_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_20, 28));
	}
	
	a10 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 29));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 29));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 29));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 29));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 29));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 29));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 29));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 29));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 29));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 29));
	}
	
;

parse_se_mdh_progresside_remes_ConditionalConnector returns [se.mdh.progresside.remes.ConditionalConnector element = null]
@init{
}
:
	a0 = 'conditional' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_21, 30));
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
			}
			if (a1 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_22, 31));
	}
	
	a2 = '{' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 32));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 32));
	}
	
	(
		a3_0 = parse_se_mdh_progresside_remes_ExitPoint		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 33));
	}
	
	a4 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 34));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 34));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 34));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 34));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 34));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 34));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 34));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 34));
	}
	
;

parse_se_mdh_progresside_remes_InitPoint returns [se.mdh.progresside.remes.InitPoint element = null]
@init{
}
:
	a0 = 'init' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitPoint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_24, 35));
	}
	
	(
		a1_0 = parse_se_mdh_progresside_remes_InitEdge		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitPoint();
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_POINT__INIT_EDGE), a1_0);
					completedElement(a1_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a1_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 36));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 36));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 36));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 36));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 36));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 36));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 36));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 36));
	}
	
;

parse_se_mdh_progresside_remes_ExitPoint returns [se.mdh.progresside.remes.ExitPoint element = null]
@init{
}
:
	a0 = 'edges' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_25, 37));
	}
	
	a1 = '{' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 38));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 38));
	}
	
	(
		(
			(
				a2_0 = parse_se_mdh_progresside_remes_Edge				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							addObjectToList(element, se.mdh.progresside.remes.RemesPackage.EXIT_POINT__EXIT_EDGES, a2_0);
							completedElement(a2_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a2_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 39));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 39));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 40));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 40));
	}
	
	a3 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_20, 41));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 41));
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_se_mdh_progresside_remes_CompositeEntryPoint{ element = c0; /* this is a subclass choice */ }
	
;

parse_se_mdh_progresside_remes_CompositeEntryPoint returns [se.mdh.progresside.remes.CompositeEntryPoint element = null]
@init{
}
:
	a0 = 'entry' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeEntryPoint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 42));
	}
	
	(
		a1_0 = parse_se_mdh_progresside_remes_Edge		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeEntryPoint();
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					addObjectToList(element, se.mdh.progresside.remes.RemesPackage.COMPOSITE_ENTRY_POINT__EXIT_EDGES, a1_0);
					completedElement(a1_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a1_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 43));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 43));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 43));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 43));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 43));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 43));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 43));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 43));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_20, 43));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 43));
	}
	
;

parse_se_mdh_progresside_remes_Edge returns [se.mdh.progresside.remes.Edge element = null]
@init{
}
:
	a0 = 'edge' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_28, 44));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 44));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 44));
	}
	
	(
		(
			a1 = '(' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_31, 45));
			}
			
			(
				a2 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
					}
					if (a2 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_32, 46));
			}
			
			a3 = ')' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 47));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 47));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 48));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 48));
	}
	
	(
		(
			a4 = '{' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_33, 49));
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
					}
					if (a5 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_34, 50));
			}
			
			a6 = '}' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 51));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 52));
	}
	
	a7 = 'to' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_35, 53));
	}
	
	(
		a8 = TEXT		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
			}
			if (a8 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				se.mdh.progresside.remes.EntryPoint proxy = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEntryPoint();
				collectHiddenTokens(element);
				registerContextDependentProxy(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcContextDependentURIFragmentFactory<se.mdh.progresside.remes.Edge, se.mdh.progresside.remes.EntryPoint>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEdgeConnectToReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_20, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 54));
	}
	
;

parse_se_mdh_progresside_remes_InitEdge returns [se.mdh.progresside.remes.InitEdge element = null]
@init{
}
:
	a0 = 'edge' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_36, 55));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 55));
	}
	
	(
		(
			a1 = '{' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 56));
			}
			
			(
				a2 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
					}
					if (a2 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_39, 57));
			}
			
			a3 = '}' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 58));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 59));
	}
	
	a4 = 'to' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_40, 60));
	}
	
	(
		a5 = TEXT		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
			}
			if (a5 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				se.mdh.progresside.remes.EntryPoint proxy = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEntryPoint();
				collectHiddenTokens(element);
				registerContextDependentProxy(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcContextDependentURIFragmentFactory<se.mdh.progresside.remes.InitEdge, se.mdh.progresside.remes.EntryPoint>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInitEdgeConnectToReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 61));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 61));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 61));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 61));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 61));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 61));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 61));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 61));
	}
	
;

parse_se_mdh_progresside_remes_Variable returns [se.mdh.progresside.remes.Variable element = null]
@init{
}
:
	a0 = 'var' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_41, 62));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_42, 62));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 62));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 62));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a1 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
						}
						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_42, 63));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 63));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 63));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_42, 64));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 64));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 64));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a2 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 65));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 65));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 66));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 66));
	}
	
	(
		(
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a3 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 67));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 68));
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
			}
			if (a4 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
				}
				se.mdh.progresside.remes.PrimitiveTypes resolved = (se.mdh.progresside.remes.PrimitiveTypes)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_45, 69));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_46, 69));
	}
	
	(
		(
			a5 = '[' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_47, 70));
			}
			
			(
				a6 = TEXT				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a6 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
						}
						java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_48, 71));
			}
			
			a7 = ']' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_46, 72));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_46, 73));
	}
	
	(
		a8 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
			}
			if (a8 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_49, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 74));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 74));
	}
	
	(
		(
			a9 = '=' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_50, 75));
			}
			
			(
				a10 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a10 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a10).getLine(), ((org.antlr.runtime.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a10).getStartIndex(), ((org.antlr.runtime.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 76));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 76));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 76));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 76));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 76));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 76));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 76));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 76));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 76));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 76));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 77));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 77));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 77));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 77));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 77));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 77));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 77));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 77));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 77));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 77));
	}
	
;

parse_se_mdh_progresside_remes_Resource returns [se.mdh.progresside.remes.Resource element = null]
@init{
}
:
	a0 = 'resource' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_51, 78));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
			}
			if (a1 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				se.mdh.progresside.remes.ResourceTypes resolved = (se.mdh.progresside.remes.ResourceTypes)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_52, 79));
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
			}
			if (a2 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_53, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 80));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 80));
	}
	
	(
		(
			a3 = ':' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_54, 81));
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
					}
					if (a4 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 82));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 82));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 82));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 82));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 82));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 82));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 82));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 82));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 82));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 82));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 83));
	}
	
;

parse_se_mdh_progresside_remes_Constant returns [se.mdh.progresside.remes.Constant element = null]
@init{
}
:
	a0 = 'const' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_55, 84));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_56, 84));
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
				}
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
				}
				if (a1 != null) {
					hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
					}
					java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL), resolved);
						completedElement(resolved);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_56, 85));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
			}
			if (a2 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				se.mdh.progresside.remes.PrimitiveTypes resolved = (se.mdh.progresside.remes.PrimitiveTypes)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_57, 86));
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
			}
			if (a3 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_58, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 87));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 87));
	}
	
	(
		(
			a4 = '=' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_59, 88));
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
					}
					if (a5 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 89));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 89));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 89));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 89));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 89));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 89));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 89));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 89));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 89));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 89));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 90));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 90));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 90));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 90));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 90));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 90));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 90));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 90));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 90));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 90));
	}
	
;

parse_se_mdh_progresside_remes_Mode returns [se.mdh.progresside.remes.Mode element = null]
:
	c0 = parse_se_mdh_progresside_remes_CompositeMode{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_se_mdh_progresside_remes_SubMode{ element = c1; /* this is a subclass choice */ }
	
;

COMMENT:
	'//'(~('\n'|'\r'|'\uffff'))*
	{ _channel = 99; }
;
INTEGER:
	('-')?('1'..'9')('0'..'9')*|'0'	{ _channel = 99; }
;
FLOAT:
	('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ 	{ _channel = 99; }
;
TEXT:
	('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+;
WHITESPACE:
	(' ' | '\t' | '\f')
	{ _channel = 99; }
;
LINEBREAK:
	('\r\n' | '\r' | '\n')
	{ _channel = 99; }
;
QUOTED_34_34:
	('"')(~('"'))*('"')
;

