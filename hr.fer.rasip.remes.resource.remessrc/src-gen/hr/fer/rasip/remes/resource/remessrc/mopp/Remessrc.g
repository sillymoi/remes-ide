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
	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
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
	protected java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>());
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
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_2_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
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
				return new RemessrcParser(new org.antlr.runtime3_2_0.CommonTokenStream(new RemessrcLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new RemessrcParser(new org.antlr.runtime3_2_0.CommonTokenStream(new RemessrcLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream, encoding))));
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
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_2_0.RecognitionException {
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
	
	public java.lang.Object getMissingSymbol(org.antlr.runtime3_2_0.IntStream arg0, org.antlr.runtime3_2_0.RecognitionException arg1, int arg2, org.antlr.runtime3_2_0.BitSet arg3) {
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
		} catch (org.antlr.runtime3_2_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				//? can be caused if a null is set on EMF models where not allowed;
				//? this will just happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_2_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource dummyResource) {
		rememberExpectedElements = true;
		parseToIndexTypeObject = type;
		final org.antlr.runtime3_2_0.CommonTokenStream tokenStream = (org.antlr.runtime3_2_0.CommonTokenStream) getTokenStream();
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
				System.out.println("FOLLOW ELEMENT " + expectedElementI);
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 87;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_2_0.CommonToken nextToken = (org.antlr.runtime3_2_0.CommonToken) tokenStream.get(i);
			System.out.println("REMAINING TOKEN: " + nextToken);
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
					System.out.println("CHECKING : " + nextFollow);
					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						System.out.println("MATCH! " + nextFollow);
						java.util.Collection<hr.fer.rasip.remes.resource.remessrc.util.RemessrcPair<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (hr.fer.rasip.remes.resource.remessrc.util.RemessrcPair<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement newFollower = newFollowerPair.getLeft();
							hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal newFollowTerminal = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
			org.antlr.runtime3_2_0.CommonToken tokenAtIndex = (org.antlr.runtime3_2_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = java.lang.Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public java.lang.Object recoverFromMismatchedToken(org.antlr.runtime3_2_0.IntStream input, int ttype, org.antlr.runtime3_2_0.BitSet follow) throws org.antlr.runtime3_2_0.RecognitionException {
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
	public void reportError(final org.antlr.runtime3_2_0.RecognitionException e)  {
		java.lang.String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
			java.lang.String tokenName = "<unknown>";
			if (mte.expecting == Token.EOF) {
				tokenName = "EOF";
			} else {
				tokenName = getTokenNames()[mte.expecting];
				tokenName = hr.fer.rasip.remes.resource.remessrc.util.RemessrcStringUtil.formatTokenName(tokenName);
			}
			message = "Syntax error on token \"" + e.token.getText() + "\", \"" + tokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_2_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_2_0.MismatchedTreeNodeException) e;
			java.lang.String tokenName = "<unknown>";
			if (mtne.expecting == Token.EOF) {
				tokenName = "EOF";
			} else {
				tokenName = getTokenNames()[mtne.expecting];
			}
			message = "mismatched tree node: "+"xxx" +"; expecting " + tokenName;
		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText+"}?";
		}
		// the resource may be null if the parse is used for code completion
		final java.lang.String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_2_0.CommonToken) {
			final org.antlr.runtime3_2_0.CommonToken ct = (org.antlr.runtime3_2_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	// Translates errors thrown by the lexer into human readable messages.
	public void reportLexicalError(final org.antlr.runtime3_2_0.RecognitionException e)  {
		java.lang.String message = "";
		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
			org.antlr.runtime3_2_0.EarlyExitException eee = (org.antlr.runtime3_2_0.EarlyExitException) e;
			message ="required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedRangeException) {
			org.antlr.runtime3_2_0.MismatchedRangeException mre = (org.antlr.runtime3_2_0.MismatchedRangeException) e;
			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
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
	
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_0 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getRemesDiagram(), "remes");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_1 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getRemesDiagram(), "{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_2 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode(), "composite");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_3 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(), "atomic");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_4 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getRemesDiagram(), "}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_5 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME), "ID");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_6 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode(), "{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_7 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), "var");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_8 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), "resource");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_9 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), "const");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_10 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector(), "conditional");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_11 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitPoint(), "init");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_12 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeEntryPoint(), "entry");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_13 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode(), "}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_14 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT), "T_URGENT");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_15 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME), "ID");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_16 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(), "{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_17 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(), "invariant");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_18 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getExitPoint(), "edges");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_19 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(), "}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_20 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT), "IN_PARENS");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_21 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME), "ID");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_22 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector(), "{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_23 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector(), "}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_24 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(), "edge");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_25 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getExitPoint(), "{");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_26 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), "edge");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_27 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getExitPoint(), "}");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_28 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD), "IN_PARENS");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_29 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY), "IN_BRACES");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_30 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), "to");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_31 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO), "ID");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_32 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION), "IN_BRACES");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_33 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(), "to");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_34 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO), "ID");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_35 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL), "T_GLOBAL");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_36 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE), "T_READABLE");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_37 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE), "T_WRITEABLE");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_38 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE), "TYPE");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_39 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), "ARRAY_SIZE");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_40 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), "ID");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_41 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), "=");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_42 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), "INTEGER");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_43 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE), "TYPE");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_44 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME), "ID");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_45 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), ":");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_46 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION), "IN_PARENS");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_47 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL), "T_GLOBAL");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_48 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE), "TYPE");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_49 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME), "ID");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_50 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), "=");
	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_51 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE), "INTEGER");
	
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_0 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getRemesDiagram().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.REMES_DIAGRAM__MODES);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_1 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.MODE__VARIABLES);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_2 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.MODE__RESOURCES);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_3 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.MODE__CONSTANTS);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_4 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__SUB_MODES);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_5 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_6 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__INIT_POINT);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_7 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_8 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getControlPath().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONTROL_PATH__EXIT_POINT);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_9 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitPoint().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_POINT__INIT_EDGE);
	private final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_10 = se.mdh.progresside.remes.RemesPackage.eINSTANCE.getExitPoint().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EXIT_POINT__EXIT_EDGES);
	
	private final static org.eclipse.emf.ecore.EStructuralFeature[] EMPTY_FEATURE_ARRAY = new org.eclipse.emf.ecore.EStructuralFeature[0];
	
	public static void wire0() {
		TERMINAL_0.addFollower(TERMINAL_1, EMPTY_FEATURE_ARRAY);
		TERMINAL_1.addFollower(TERMINAL_2, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, });
		TERMINAL_1.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, });
		TERMINAL_1.addFollower(TERMINAL_4, EMPTY_FEATURE_ARRAY);
		TERMINAL_2.addFollower(TERMINAL_5, EMPTY_FEATURE_ARRAY);
		TERMINAL_5.addFollower(TERMINAL_6, EMPTY_FEATURE_ARRAY);
		TERMINAL_6.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
		TERMINAL_6.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_6.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_6.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_6.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_6.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_6.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_6.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_13.addFollower(TERMINAL_2, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, });
		TERMINAL_13.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, });
		TERMINAL_13.addFollower(TERMINAL_4, EMPTY_FEATURE_ARRAY);
		TERMINAL_3.addFollower(TERMINAL_14, EMPTY_FEATURE_ARRAY);
		TERMINAL_3.addFollower(TERMINAL_15, EMPTY_FEATURE_ARRAY);
		TERMINAL_14.addFollower(TERMINAL_15, EMPTY_FEATURE_ARRAY);
		TERMINAL_15.addFollower(TERMINAL_16, EMPTY_FEATURE_ARRAY);
		TERMINAL_16.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
		TERMINAL_16.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_16.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_16.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
		TERMINAL_16.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_16.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_16.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_17.addFollower(TERMINAL_20, EMPTY_FEATURE_ARRAY);
		TERMINAL_20.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_20.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_20.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_19.addFollower(TERMINAL_2, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, });
		TERMINAL_19.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, });
		TERMINAL_19.addFollower(TERMINAL_4, EMPTY_FEATURE_ARRAY);
		TERMINAL_19.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_19.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_19.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_19.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_10.addFollower(TERMINAL_21, EMPTY_FEATURE_ARRAY);
		TERMINAL_21.addFollower(TERMINAL_22, EMPTY_FEATURE_ARRAY);
		TERMINAL_22.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_22.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_23.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_23.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_23.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_23.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_23.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_11.addFollower(TERMINAL_24, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_9, });
		TERMINAL_18.addFollower(TERMINAL_25, EMPTY_FEATURE_ARRAY);
		TERMINAL_25.addFollower(TERMINAL_26, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_10, });
		TERMINAL_25.addFollower(TERMINAL_27, EMPTY_FEATURE_ARRAY);
		TERMINAL_27.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_27.addFollower(TERMINAL_23, EMPTY_FEATURE_ARRAY);
		TERMINAL_12.addFollower(TERMINAL_26, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_10, });
		TERMINAL_26.addFollower(TERMINAL_28, EMPTY_FEATURE_ARRAY);
		TERMINAL_26.addFollower(TERMINAL_29, EMPTY_FEATURE_ARRAY);
		TERMINAL_26.addFollower(TERMINAL_30, EMPTY_FEATURE_ARRAY);
		TERMINAL_28.addFollower(TERMINAL_29, EMPTY_FEATURE_ARRAY);
		TERMINAL_28.addFollower(TERMINAL_30, EMPTY_FEATURE_ARRAY);
		TERMINAL_29.addFollower(TERMINAL_30, EMPTY_FEATURE_ARRAY);
		TERMINAL_30.addFollower(TERMINAL_31, EMPTY_FEATURE_ARRAY);
		TERMINAL_31.addFollower(TERMINAL_26, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_10, });
		TERMINAL_31.addFollower(TERMINAL_27, EMPTY_FEATURE_ARRAY);
		TERMINAL_31.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_31.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_31.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_31.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_31.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_31.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_31.addFollower(TERMINAL_23, EMPTY_FEATURE_ARRAY);
		TERMINAL_24.addFollower(TERMINAL_32, EMPTY_FEATURE_ARRAY);
		TERMINAL_24.addFollower(TERMINAL_33, EMPTY_FEATURE_ARRAY);
		TERMINAL_32.addFollower(TERMINAL_33, EMPTY_FEATURE_ARRAY);
		TERMINAL_33.addFollower(TERMINAL_34, EMPTY_FEATURE_ARRAY);
		TERMINAL_34.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_34.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_34.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_34.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_34.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_7.addFollower(TERMINAL_35, EMPTY_FEATURE_ARRAY);
		TERMINAL_7.addFollower(TERMINAL_36, EMPTY_FEATURE_ARRAY);
		TERMINAL_7.addFollower(TERMINAL_37, EMPTY_FEATURE_ARRAY);
		TERMINAL_7.addFollower(TERMINAL_38, EMPTY_FEATURE_ARRAY);
		TERMINAL_35.addFollower(TERMINAL_36, EMPTY_FEATURE_ARRAY);
		TERMINAL_35.addFollower(TERMINAL_37, EMPTY_FEATURE_ARRAY);
		TERMINAL_35.addFollower(TERMINAL_38, EMPTY_FEATURE_ARRAY);
		TERMINAL_36.addFollower(TERMINAL_37, EMPTY_FEATURE_ARRAY);
		TERMINAL_36.addFollower(TERMINAL_38, EMPTY_FEATURE_ARRAY);
		TERMINAL_37.addFollower(TERMINAL_38, EMPTY_FEATURE_ARRAY);
		TERMINAL_38.addFollower(TERMINAL_39, EMPTY_FEATURE_ARRAY);
		TERMINAL_38.addFollower(TERMINAL_40, EMPTY_FEATURE_ARRAY);
		TERMINAL_39.addFollower(TERMINAL_40, EMPTY_FEATURE_ARRAY);
		TERMINAL_40.addFollower(TERMINAL_41, EMPTY_FEATURE_ARRAY);
		TERMINAL_40.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
		TERMINAL_40.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_40.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_40.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_40.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_40.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_40.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_40.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_40.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
		TERMINAL_40.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_40.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_41.addFollower(TERMINAL_42, EMPTY_FEATURE_ARRAY);
		TERMINAL_42.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
		TERMINAL_42.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_42.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_42.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_42.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_42.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_42.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_42.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_42.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
		TERMINAL_42.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_42.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_8.addFollower(TERMINAL_43, EMPTY_FEATURE_ARRAY);
		TERMINAL_43.addFollower(TERMINAL_44, EMPTY_FEATURE_ARRAY);
		TERMINAL_44.addFollower(TERMINAL_45, EMPTY_FEATURE_ARRAY);
		TERMINAL_44.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
		TERMINAL_44.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_44.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_44.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_44.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_44.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_44.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_44.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_44.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
		TERMINAL_44.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_44.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_45.addFollower(TERMINAL_46, EMPTY_FEATURE_ARRAY);
		TERMINAL_46.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
		TERMINAL_46.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_46.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_46.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_46.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_46.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_46.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_46.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_46.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
		TERMINAL_46.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_46.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_9.addFollower(TERMINAL_47, EMPTY_FEATURE_ARRAY);
		TERMINAL_9.addFollower(TERMINAL_48, EMPTY_FEATURE_ARRAY);
		TERMINAL_47.addFollower(TERMINAL_48, EMPTY_FEATURE_ARRAY);
		TERMINAL_48.addFollower(TERMINAL_49, EMPTY_FEATURE_ARRAY);
		TERMINAL_49.addFollower(TERMINAL_50, EMPTY_FEATURE_ARRAY);
		TERMINAL_49.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
		TERMINAL_49.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_49.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_49.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_49.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_49.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_49.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_49.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_49.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
		TERMINAL_49.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_49.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
		TERMINAL_50.addFollower(TERMINAL_51, EMPTY_FEATURE_ARRAY);
		TERMINAL_51.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
		TERMINAL_51.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_51.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
		TERMINAL_51.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
		TERMINAL_51.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
		TERMINAL_51.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
		TERMINAL_51.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
		TERMINAL_51.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
		TERMINAL_51.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
		TERMINAL_51.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
		TERMINAL_51.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 2, FEATURE_0));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 2, FEATURE_0));
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
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 3, FEATURE_0));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 3, FEATURE_0));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 3));
	}
	
	a3 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_5, 5));
	}
	
	(
		a1 = ID		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
			}
			if (a1 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ID");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 7, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 7, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 7, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 7, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 7, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 7, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 7, FEATURE_7));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 8, FEATURE_1));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 8, FEATURE_2));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 8, FEATURE_3));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 8, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 8, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 8, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 8, FEATURE_7));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 9, FEATURE_1));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 9, FEATURE_2));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 9, FEATURE_3));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 9, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 9, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 9, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 9, FEATURE_7));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 10, FEATURE_1));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 10, FEATURE_2));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 10, FEATURE_3));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 10, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 10, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 10, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 10, FEATURE_7));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 10));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 11, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 11, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 11, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 11, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 11, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 11, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 11, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 11));
	}
	
	(
		(
			(
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 12, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 12, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 12, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 12, FEATURE_7));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 12));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 13, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 13, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 13, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 13, FEATURE_7));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 13));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 14, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 14, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 14, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 14, FEATURE_7));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 14));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 15, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 15, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 15, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 15, FEATURE_7));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 15));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 16, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 16, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 16, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 16, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 16));
	}
	
	a10 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 17, FEATURE_0));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 17, FEATURE_0));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 17));
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_14, 18));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 18));
	}
	
	(
		(
			(
				a1 = T_URGENT				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
					}
					if (a1 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_URGENT");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
						}
						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 19));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 20));
	}
	
	(
		a2 = ID		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
			}
			if (a2 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ID");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_16, 21));
	}
	
	a3 = '{' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 22, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 22, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 22, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 22));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 22, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 22, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 22));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 23, FEATURE_1));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 23, FEATURE_2));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 23, FEATURE_3));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 23));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 23, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 23, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 23));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 24, FEATURE_1));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 24, FEATURE_2));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 24, FEATURE_3));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 24));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 24, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 24, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 24));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 25, FEATURE_1));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 25, FEATURE_2));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 25, FEATURE_3));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 25));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 25, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 25, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 25));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 26, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 26, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 26, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 26));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 26, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 26, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 26));
	}
	
	(
		(
			a7 = 'invariant' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_20, 27));
			}
			
			(
				a8 = IN_PARENS				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
					}
					if (a8 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IN_PARENS");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 28, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 28, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 28));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 29, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 29, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 29));
	}
	
	(
		(
			(
				a9_0 = parse_se_mdh_progresside_remes_ExitPoint				{
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
						copyLocalizationInfos(a9_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 30));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 31));
	}
	
	a10 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 32, FEATURE_0));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 32, FEATURE_0));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 32));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 32, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 32, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 32, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 32));
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_21, 33));
	}
	
	(
		a1 = ID		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
			}
			if (a1 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ID");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_22, 34));
	}
	
	a2 = '{' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 35, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 35, FEATURE_8));
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
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 36));
	}
	
	a4 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 37, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 37, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 37, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 37, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 37));
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_24, 38, FEATURE_9));
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
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 39, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 39, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 39, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 39, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 39));
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_25, 40));
	}
	
	a1 = '{' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 41, FEATURE_10));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 41));
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
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 42, FEATURE_10));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 42));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 43, FEATURE_10));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 43));
	}
	
	a3 = '}' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 44));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 44));
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_se_mdh_progresside_remes_CompositeEntryPoint{ element = c0; /* this is a subclass or primitive expression choice */ }
	
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 45, FEATURE_10));
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
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 46, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 46, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 46, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 46, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 46));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 46));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 46));
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_28, 47));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 47));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 47));
	}
	
	(
		(
			(
				a1 = IN_PARENS				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
					}
					if (a1 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IN_PARENS");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 48));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 48));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 49));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 49));
	}
	
	(
		(
			(
				a2 = IN_BRACES				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
					}
					if (a2 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IN_BRACES");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 50));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 51));
	}
	
	a3 = 'to' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_31, 52));
	}
	
	(
		a4 = ID		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
			}
			if (a4 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ID");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
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
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 53, FEATURE_10));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 53));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 53, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 53, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 53, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 53, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 53));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 53));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 53));
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_32, 54));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_33, 54));
	}
	
	(
		(
			(
				a1 = IN_BRACES				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
					}
					if (a1 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IN_BRACES");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_33, 55));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_33, 56));
	}
	
	a2 = 'to' {
		if (element == null) {
			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_34, 57));
	}
	
	(
		a3 = ID		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
			}
			if (a3 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ID");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
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
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 58, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 58, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 58, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 58, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 58));
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_35, 59));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_36, 59));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 59));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 59));
	}
	
	(
		(
			(
				a1 = T_GLOBAL				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a1 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_GLOBAL");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
						}
						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_36, 60));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 60));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 60));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_36, 61));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 61));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 61));
	}
	
	(
		(
			(
				a2 = T_READABLE				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a2 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_READABLE");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
						}
						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 62));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 62));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 63));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 63));
	}
	
	(
		(
			(
				a3 = T_WRITEABLE				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a3 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_WRITEABLE");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
						}
						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 64));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 65));
	}
	
	(
		a4 = TYPE		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
			}
			if (a4 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TYPE");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
				}
				se.mdh.progresside.remes.PrimitiveTypes resolved = (se.mdh.progresside.remes.PrimitiveTypes)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_39, 66));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_40, 66));
	}
	
	(
		(
			(
				a5 = ARRAY_SIZE				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a5 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ARRAY_SIZE");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
						}
						java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_40, 67));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_40, 68));
	}
	
	(
		a6 = ID		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
			}
			if (a6 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ID");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_41, 69));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 69, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 69, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 69, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 69, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 69, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 69, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 69, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 69));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 69));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 69, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 69));
	}
	
	(
		(
			a7 = '=' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_42, 70));
			}
			
			(
				a8 = INTEGER				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
					}
					if (a8 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 71, FEATURE_1));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 71, FEATURE_2));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 71, FEATURE_3));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 71, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 71, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 71, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 71, FEATURE_7));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 71));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 71));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 71, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 71));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 72, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 72, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 72, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 72, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 72, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 72, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 72, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 72));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 72));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 72, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 72));
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 73));
	}
	
	(
		a1 = TYPE		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
			}
			if (a1 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TYPE");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
				}
				se.mdh.progresside.remes.ResourceTypes resolved = (se.mdh.progresside.remes.ResourceTypes)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 74));
	}
	
	(
		a2 = ID		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
			}
			if (a2 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ID");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_45, 75));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 75, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 75, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 75, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 75, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 75, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 75, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 75, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 75));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 75));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 75, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 75));
	}
	
	(
		(
			a3 = ':' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_46, 76));
			}
			
			(
				a4 = IN_PARENS				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
					}
					if (a4 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IN_PARENS");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 77, FEATURE_1));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 77, FEATURE_2));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 77, FEATURE_3));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 77, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 77, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 77, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 77, FEATURE_7));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 77));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 77));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 77, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 77));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 78, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 78, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 78, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 78, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 78, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 78, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 78, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 78));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 78));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 78, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 78));
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
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_47, 79));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_48, 79));
	}
	
	(
		(
			(
				a1 = T_GLOBAL				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
					}
					if (a1 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_GLOBAL");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
						}
						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_48, 80));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_48, 81));
	}
	
	(
		a2 = TYPE		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
			}
			if (a2 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TYPE");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				se.mdh.progresside.remes.PrimitiveTypes resolved = (se.mdh.progresside.remes.PrimitiveTypes)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_49, 82));
	}
	
	(
		a3 = ID		
		{
			if (terminateParsing) {
				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
			}
			if (element == null) {
				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
			}
			if (a3 != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ID");
				tokenResolver.setOptions(getOptions());
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_50, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 83, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 83, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 83, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 83, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 83, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 83, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 83, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 83));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 83, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 83));
	}
	
	(
		(
			a4 = '=' {
				if (element == null) {
					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_51, 84));
			}
			
			(
				a5 = INTEGER				
				{
					if (terminateParsing) {
						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
					}
					if (element == null) {
						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
					}
					if (a5 != null) {
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
						tokenResolver.setOptions(getOptions());
						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 85, FEATURE_1));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 85, FEATURE_2));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 85, FEATURE_3));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 85, FEATURE_4));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 85, FEATURE_5));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 85, FEATURE_6));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 85, FEATURE_7));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 85));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 85));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 85, FEATURE_8));
				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 85));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 86, FEATURE_1));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 86, FEATURE_2));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 86, FEATURE_3));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 86, FEATURE_4));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 86, FEATURE_5));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 86, FEATURE_6));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 86, FEATURE_7));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 86));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 86));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 86, FEATURE_8));
		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 86));
	}
	
;

parse_se_mdh_progresside_remes_Mode returns [se.mdh.progresside.remes.Mode element = null]
:
	c0 = parse_se_mdh_progresside_remes_CompositeMode{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_se_mdh_progresside_remes_SubMode{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

SL_COMMENT:
	'//'(~('\n'|'\r'|'\uffff'))*
	{ _channel = 99; }
;
INTEGER:
	('-')?('1'..'9')('0'..'9')*|'0';
FLOAT:
	('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ 	{ _channel = 99; }
;
T_GLOBAL:
	'global';
T_READABLE:
	'readable';
T_WRITEABLE:
	'writeable';
T_URGENT:
	'urgent';
TYPE:
	('integer'|'natural'|'boolean'|'clock'|'float')
;
ID:
	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
ARRAY_SIZE:
	('[')(' ' | '\t' | '\f')*('1'..'9')('0'..'9')*(' ' | '\t' | '\f')*(']')
;
IN_BRACES:
	('[')(~(']'))*(']')
;
IN_PARENS:
	('\(')(~('\)'))*('\)')
;
WHITESPACE:
	(' ' | '\t' | '\f')
	{ _channel = 99; }
;
LINEBREAK:
	('\r\n' | '\r' | '\n')
	{ _channel = 99; }
;

