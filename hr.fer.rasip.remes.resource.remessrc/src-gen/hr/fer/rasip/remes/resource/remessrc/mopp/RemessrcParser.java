// $ANTLR 3.1.1

	package hr.fer.rasip.remes.resource.remessrc.mopp;


import org.antlr.runtime.*;
import java.util.HashMap;
public class RemessrcParser extends RemessrcANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUOTED_34_34", "TEXT", "COMMENT", "INTEGER", "FLOAT", "WHITESPACE", "LINEBREAK", "'remes'", "'{'", "'}'", "'composite'", "'atomic'", "'invariant'", "'conditional'", "'init'", "'edges'", "'entry'", "'edge'", "'('", "')'", "'to'", "'var'", "'['", "']'", "'='", "'resource'", "':'", "'const'"
    };
    public static final int INTEGER=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=9;
    public static final int FLOAT=8;
    public static final int TEXT=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int COMMENT=6;
    public static final int QUOTED_34_34=4;
    public static final int LINEBREAK=10;

    // delegates
    // delegators


        public RemessrcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RemessrcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[41+1];
             
             
        }
        

    public String[] getTokenNames() { return RemessrcParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g"; }


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



    // $ANTLR start "start"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:730:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_se_mdh_progresside_remes_RemesDiagram ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        se.mdh.progresside.remes.RemesDiagram c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:731:1: ( (c0= parse_se_mdh_progresside_remes_RemesDiagram ) EOF )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:732:2: (c0= parse_se_mdh_progresside_remes_RemesDiagram ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_0, 0));
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:737:2: (c0= parse_se_mdh_progresside_remes_RemesDiagram )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:738:3: c0= parse_se_mdh_progresside_remes_RemesDiagram
            {
            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_RemesDiagram_in_start82);
            c0=parse_se_mdh_progresside_remes_RemesDiagram();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_se_mdh_progresside_remes_RemesDiagram"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:743:1: parse_se_mdh_progresside_remes_RemesDiagram returns [se.mdh.progresside.remes.RemesDiagram element = null] : a0= 'remes' a1= '{' ( (a2_0= parse_se_mdh_progresside_remes_Mode ) )* a3= '}' ;
    public final se.mdh.progresside.remes.RemesDiagram parse_se_mdh_progresside_remes_RemesDiagram() throws RecognitionException {
        se.mdh.progresside.remes.RemesDiagram element =  null;
        int parse_se_mdh_progresside_remes_RemesDiagram_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        se.mdh.progresside.remes.Mode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:746:1: (a0= 'remes' a1= '{' ( (a2_0= parse_se_mdh_progresside_remes_Mode ) )* a3= '}' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:747:2: a0= 'remes' a1= '{' ( (a2_0= parse_se_mdh_progresside_remes_Mode ) )* a3= '}'
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_se_mdh_progresside_remes_RemesDiagram112); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_1, 1));
              	
            }
            a1=(Token)match(input,12,FOLLOW_12_in_parse_se_mdh_progresside_remes_RemesDiagram126); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 2));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 2));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 2));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:773:2: ( (a2_0= parse_se_mdh_progresside_remes_Mode ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:774:3: (a2_0= parse_se_mdh_progresside_remes_Mode )
            	    {
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:774:3: (a2_0= parse_se_mdh_progresside_remes_Mode )
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:775:4: a2_0= parse_se_mdh_progresside_remes_Mode
            	    {
            	    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Mode_in_parse_se_mdh_progresside_remes_RemesDiagram149);
            	    a2_0=parse_se_mdh_progresside_remes_Mode();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 3));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 3));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 3));
              	
            }
            a3=(Token)match(input,13,FOLLOW_13_in_parse_se_mdh_progresside_remes_RemesDiagram175); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_se_mdh_progresside_remes_RemesDiagram_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_RemesDiagram"


    // $ANTLR start "parse_se_mdh_progresside_remes_CompositeMode"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:812:1: parse_se_mdh_progresside_remes_CompositeMode returns [se.mdh.progresside.remes.CompositeMode element = null] : a0= 'composite' (a1= QUOTED_34_34 ) a2= '{' ( ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) | (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) ) )* a10= '}' ;
    public final se.mdh.progresside.remes.CompositeMode parse_se_mdh_progresside_remes_CompositeMode() throws RecognitionException {
        se.mdh.progresside.remes.CompositeMode element =  null;
        int parse_se_mdh_progresside_remes_CompositeMode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a10=null;
        se.mdh.progresside.remes.Variable a3_0 = null;

        se.mdh.progresside.remes.Resource a4_0 = null;

        se.mdh.progresside.remes.Constant a5_0 = null;

        se.mdh.progresside.remes.SubMode a6_0 = null;

        se.mdh.progresside.remes.ConditionalConnector a7_0 = null;

        se.mdh.progresside.remes.InitPoint a8_0 = null;

        se.mdh.progresside.remes.CompositeEntryPoint a9_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:815:1: (a0= 'composite' (a1= QUOTED_34_34 ) a2= '{' ( ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) | (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) ) )* a10= '}' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:816:2: a0= 'composite' (a1= QUOTED_34_34 ) a2= '{' ( ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) | (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) ) )* a10= '}'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_se_mdh_progresside_remes_CompositeMode204); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_5, 5));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:828:2: (a1= QUOTED_34_34 )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:829:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_CompositeMode222); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_6, 6));
              	
            }
            a2=(Token)match(input,12,FOLLOW_12_in_parse_se_mdh_progresside_remes_CompositeMode243); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:880:2: ( ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) | (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||(LA3_0>=17 && LA3_0<=18)||LA3_0==20||LA3_0==25||LA3_0==29||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:881:3: ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) | (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) )
            	    {
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:881:3: ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) | (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) )
            	    int alt2=7;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt2=4;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt2=5;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt2=6;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt2=7;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:882:4: (a3_0= parse_se_mdh_progresside_remes_Variable )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:882:4: (a3_0= parse_se_mdh_progresside_remes_Variable )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:883:5: a3_0= parse_se_mdh_progresside_remes_Variable
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Variable_in_parse_se_mdh_progresside_remes_CompositeMode272);
            	            a3_0=parse_se_mdh_progresside_remes_Variable();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

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

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:912:8: (a4_0= parse_se_mdh_progresside_remes_Resource )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:912:8: (a4_0= parse_se_mdh_progresside_remes_Resource )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:913:5: a4_0= parse_se_mdh_progresside_remes_Resource
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Resource_in_parse_se_mdh_progresside_remes_CompositeMode314);
            	            a4_0=parse_se_mdh_progresside_remes_Resource();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

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

            	            }
            	            break;
            	        case 3 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:942:8: (a5_0= parse_se_mdh_progresside_remes_Constant )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:942:8: (a5_0= parse_se_mdh_progresside_remes_Constant )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:943:5: a5_0= parse_se_mdh_progresside_remes_Constant
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Constant_in_parse_se_mdh_progresside_remes_CompositeMode356);
            	            a5_0=parse_se_mdh_progresside_remes_Constant();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

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

            	            }
            	            break;
            	        case 4 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:972:8: (a6_0= parse_se_mdh_progresside_remes_SubMode )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:972:8: (a6_0= parse_se_mdh_progresside_remes_SubMode )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:973:5: a6_0= parse_se_mdh_progresside_remes_SubMode
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_SubMode_in_parse_se_mdh_progresside_remes_CompositeMode398);
            	            a6_0=parse_se_mdh_progresside_remes_SubMode();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

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

            	            }
            	            break;
            	        case 5 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1002:8: (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1002:8: (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1003:5: a7_0= parse_se_mdh_progresside_remes_ConditionalConnector
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_ConditionalConnector_in_parse_se_mdh_progresside_remes_CompositeMode440);
            	            a7_0=parse_se_mdh_progresside_remes_ConditionalConnector();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

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

            	            }
            	            break;
            	        case 6 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1032:8: (a8_0= parse_se_mdh_progresside_remes_InitPoint )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1032:8: (a8_0= parse_se_mdh_progresside_remes_InitPoint )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1033:5: a8_0= parse_se_mdh_progresside_remes_InitPoint
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_InitPoint_in_parse_se_mdh_progresside_remes_CompositeMode482);
            	            a8_0=parse_se_mdh_progresside_remes_InitPoint();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

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

            	            }
            	            break;
            	        case 7 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1062:8: (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1062:8: (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1063:5: a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_CompositeEntryPoint_in_parse_se_mdh_progresside_remes_CompositeMode524);
            	            a9_0=parse_se_mdh_progresside_remes_CompositeEntryPoint();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

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

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {

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
            a10=(Token)match(input,13,FOLLOW_13_in_parse_se_mdh_progresside_remes_CompositeMode565); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 16));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 16));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 16));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_se_mdh_progresside_remes_CompositeMode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_CompositeMode"


    // $ANTLR start "parse_se_mdh_progresside_remes_SubMode"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1121:1: parse_se_mdh_progresside_remes_SubMode returns [se.mdh.progresside.remes.SubMode element = null] : a0= 'atomic' ( (a1= TEXT ) )? (a2= QUOTED_34_34 ) a3= '{' ( ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) ) )* ( (a7= 'invariant' (a8= QUOTED_34_34 ) ) )? (a9_0= parse_se_mdh_progresside_remes_ExitPoint ) a10= '}' ;
    public final se.mdh.progresside.remes.SubMode parse_se_mdh_progresside_remes_SubMode() throws RecognitionException {
        se.mdh.progresside.remes.SubMode element =  null;
        int parse_se_mdh_progresside_remes_SubMode_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a7=null;
        Token a8=null;
        Token a10=null;
        se.mdh.progresside.remes.Variable a4_0 = null;

        se.mdh.progresside.remes.Resource a5_0 = null;

        se.mdh.progresside.remes.Constant a6_0 = null;

        se.mdh.progresside.remes.ExitPoint a9_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1124:1: (a0= 'atomic' ( (a1= TEXT ) )? (a2= QUOTED_34_34 ) a3= '{' ( ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) ) )* ( (a7= 'invariant' (a8= QUOTED_34_34 ) ) )? (a9_0= parse_se_mdh_progresside_remes_ExitPoint ) a10= '}' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1125:2: a0= 'atomic' ( (a1= TEXT ) )? (a2= QUOTED_34_34 ) a3= '{' ( ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) ) )* ( (a7= 'invariant' (a8= QUOTED_34_34 ) ) )? (a9_0= parse_se_mdh_progresside_remes_ExitPoint ) a10= '}'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_se_mdh_progresside_remes_SubMode594); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_14, 17));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 17));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1138:2: ( (a1= TEXT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TEXT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1139:3: (a1= TEXT )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1139:3: (a1= TEXT )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1140:4: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_SubMode617); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 18));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1173:2: (a2= QUOTED_34_34 )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1174:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_SubMode651); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_16, 19));
              	
            }
            a3=(Token)match(input,12,FOLLOW_12_in_parse_se_mdh_progresside_remes_SubMode672); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 20));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 20));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 20));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 20));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 20));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 20));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1223:2: ( ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25||LA6_0==29||LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1224:3: ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) )
            	    {
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1224:3: ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) )
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1225:4: (a4_0= parse_se_mdh_progresside_remes_Variable )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1225:4: (a4_0= parse_se_mdh_progresside_remes_Variable )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1226:5: a4_0= parse_se_mdh_progresside_remes_Variable
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Variable_in_parse_se_mdh_progresside_remes_SubMode701);
            	            a4_0=parse_se_mdh_progresside_remes_Variable();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 21));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 21));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 21));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 21));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 21));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 21));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1253:8: (a5_0= parse_se_mdh_progresside_remes_Resource )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1253:8: (a5_0= parse_se_mdh_progresside_remes_Resource )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1254:5: a5_0= parse_se_mdh_progresside_remes_Resource
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Resource_in_parse_se_mdh_progresside_remes_SubMode743);
            	            a5_0=parse_se_mdh_progresside_remes_Resource();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 22));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 22));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 22));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 22));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 22));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 22));
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1281:8: (a6_0= parse_se_mdh_progresside_remes_Constant )
            	            {
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1281:8: (a6_0= parse_se_mdh_progresside_remes_Constant )
            	            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1282:5: a6_0= parse_se_mdh_progresside_remes_Constant
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Constant_in_parse_se_mdh_progresside_remes_SubMode785);
            	            a6_0=parse_se_mdh_progresside_remes_Constant();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 23));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 23));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 23));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 23));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 23));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 23));
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 24));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 24));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 24));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 24));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 24));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 24));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1320:2: ( (a7= 'invariant' (a8= QUOTED_34_34 ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1321:3: (a7= 'invariant' (a8= QUOTED_34_34 ) )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1321:3: (a7= 'invariant' (a8= QUOTED_34_34 ) )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1322:4: a7= 'invariant' (a8= QUOTED_34_34 )
                    {
                    a7=(Token)match(input,16,FOLLOW_16_in_parse_se_mdh_progresside_remes_SubMode835); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 25));
                      			
                    }
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1334:4: (a8= QUOTED_34_34 )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1335:5: a8= QUOTED_34_34
                    {
                    a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_SubMode861); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 26));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 26));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 27));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 27));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1376:2: (a9_0= parse_se_mdh_progresside_remes_ExitPoint )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1377:3: a9_0= parse_se_mdh_progresside_remes_ExitPoint
            {
            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_ExitPoint_in_parse_se_mdh_progresside_remes_SubMode911);
            a9_0=parse_se_mdh_progresside_remes_ExitPoint();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_20, 28));
              	
            }
            a10=(Token)match(input,13,FOLLOW_13_in_parse_se_mdh_progresside_remes_SubMode929); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
              	
            }
            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_se_mdh_progresside_remes_SubMode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_SubMode"


    // $ANTLR start "parse_se_mdh_progresside_remes_ConditionalConnector"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1421:1: parse_se_mdh_progresside_remes_ConditionalConnector returns [se.mdh.progresside.remes.ConditionalConnector element = null] : a0= 'conditional' (a1= QUOTED_34_34 ) a2= '{' (a3_0= parse_se_mdh_progresside_remes_ExitPoint ) a4= '}' ;
    public final se.mdh.progresside.remes.ConditionalConnector parse_se_mdh_progresside_remes_ConditionalConnector() throws RecognitionException {
        se.mdh.progresside.remes.ConditionalConnector element =  null;
        int parse_se_mdh_progresside_remes_ConditionalConnector_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        se.mdh.progresside.remes.ExitPoint a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1424:1: (a0= 'conditional' (a1= QUOTED_34_34 ) a2= '{' (a3_0= parse_se_mdh_progresside_remes_ExitPoint ) a4= '}' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1425:2: a0= 'conditional' (a1= QUOTED_34_34 ) a2= '{' (a3_0= parse_se_mdh_progresside_remes_ExitPoint ) a4= '}'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_se_mdh_progresside_remes_ConditionalConnector958); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_21, 30));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1437:2: (a1= QUOTED_34_34 )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1438:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_ConditionalConnector976); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_22, 31));
              	
            }
            a2=(Token)match(input,12,FOLLOW_12_in_parse_se_mdh_progresside_remes_ConditionalConnector997); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 32));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 32));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1483:2: (a3_0= parse_se_mdh_progresside_remes_ExitPoint )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1484:3: a3_0= parse_se_mdh_progresside_remes_ExitPoint
            {
            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_ExitPoint_in_parse_se_mdh_progresside_remes_ConditionalConnector1015);
            a3_0=parse_se_mdh_progresside_remes_ExitPoint();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 33));
              	
            }
            a4=(Token)match(input,13,FOLLOW_13_in_parse_se_mdh_progresside_remes_ConditionalConnector1033); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_se_mdh_progresside_remes_ConditionalConnector_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_ConditionalConnector"


    // $ANTLR start "parse_se_mdh_progresside_remes_InitPoint"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1526:1: parse_se_mdh_progresside_remes_InitPoint returns [se.mdh.progresside.remes.InitPoint element = null] : a0= 'init' (a1_0= parse_se_mdh_progresside_remes_InitEdge ) ;
    public final se.mdh.progresside.remes.InitPoint parse_se_mdh_progresside_remes_InitPoint() throws RecognitionException {
        se.mdh.progresside.remes.InitPoint element =  null;
        int parse_se_mdh_progresside_remes_InitPoint_StartIndex = input.index();
        Token a0=null;
        se.mdh.progresside.remes.InitEdge a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1529:1: (a0= 'init' (a1_0= parse_se_mdh_progresside_remes_InitEdge ) )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1530:2: a0= 'init' (a1_0= parse_se_mdh_progresside_remes_InitEdge )
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_se_mdh_progresside_remes_InitPoint1062); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitPoint();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_24, 35));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1542:2: (a1_0= parse_se_mdh_progresside_remes_InitEdge )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1543:3: a1_0= parse_se_mdh_progresside_remes_InitEdge
            {
            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_InitEdge_in_parse_se_mdh_progresside_remes_InitPoint1080);
            a1_0=parse_se_mdh_progresside_remes_InitEdge();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_se_mdh_progresside_remes_InitPoint_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_InitPoint"


    // $ANTLR start "parse_se_mdh_progresside_remes_ExitPoint"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1573:1: parse_se_mdh_progresside_remes_ExitPoint returns [se.mdh.progresside.remes.ExitPoint element = null] : (a0= 'edges' a1= '{' ( ( (a2_0= parse_se_mdh_progresside_remes_Edge ) ) )* a3= '}' | c0= parse_se_mdh_progresside_remes_CompositeEntryPoint );
    public final se.mdh.progresside.remes.ExitPoint parse_se_mdh_progresside_remes_ExitPoint() throws RecognitionException {
        se.mdh.progresside.remes.ExitPoint element =  null;
        int parse_se_mdh_progresside_remes_ExitPoint_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        se.mdh.progresside.remes.Edge a2_0 = null;

        se.mdh.progresside.remes.CompositeEntryPoint c0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1576:1: (a0= 'edges' a1= '{' ( ( (a2_0= parse_se_mdh_progresside_remes_Edge ) ) )* a3= '}' | c0= parse_se_mdh_progresside_remes_CompositeEntryPoint )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1577:2: a0= 'edges' a1= '{' ( ( (a2_0= parse_se_mdh_progresside_remes_Edge ) ) )* a3= '}'
                    {
                    a0=(Token)match(input,19,FOLLOW_19_in_parse_se_mdh_progresside_remes_ExitPoint1113); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
                      		}
                      		collectHiddenTokens(element);
                      		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_25, 37));
                      	
                    }
                    a1=(Token)match(input,12,FOLLOW_12_in_parse_se_mdh_progresside_remes_ExitPoint1127); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
                      		}
                      		collectHiddenTokens(element);
                      		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 38));
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 38));
                      	
                    }
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1602:2: ( ( (a2_0= parse_se_mdh_progresside_remes_Edge ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1603:3: ( (a2_0= parse_se_mdh_progresside_remes_Edge ) )
                    	    {
                    	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1603:3: ( (a2_0= parse_se_mdh_progresside_remes_Edge ) )
                    	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1604:4: (a2_0= parse_se_mdh_progresside_remes_Edge )
                    	    {
                    	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1604:4: (a2_0= parse_se_mdh_progresside_remes_Edge )
                    	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1605:5: a2_0= parse_se_mdh_progresside_remes_Edge
                    	    {
                    	    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Edge_in_parse_se_mdh_progresside_remes_ExitPoint1156);
                    	    a2_0=parse_se_mdh_progresside_remes_Edge();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      				// expected elements (follow set)
                    	      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 39));
                    	      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 39));
                    	      			
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 40));
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 40));
                      	
                    }
                    a3=(Token)match(input,13,FOLLOW_13_in_parse_se_mdh_progresside_remes_ExitPoint1197); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
                      		}
                      		collectHiddenTokens(element);
                      		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_20, 41));
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 41));
                      	
                    }

                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1650:2: c0= parse_se_mdh_progresside_remes_CompositeEntryPoint
                    {
                    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_CompositeEntryPoint_in_parse_se_mdh_progresside_remes_ExitPoint1216);
                    c0=parse_se_mdh_progresside_remes_CompositeEntryPoint();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_se_mdh_progresside_remes_ExitPoint_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_ExitPoint"


    // $ANTLR start "parse_se_mdh_progresside_remes_CompositeEntryPoint"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1654:1: parse_se_mdh_progresside_remes_CompositeEntryPoint returns [se.mdh.progresside.remes.CompositeEntryPoint element = null] : a0= 'entry' (a1_0= parse_se_mdh_progresside_remes_Edge ) ;
    public final se.mdh.progresside.remes.CompositeEntryPoint parse_se_mdh_progresside_remes_CompositeEntryPoint() throws RecognitionException {
        se.mdh.progresside.remes.CompositeEntryPoint element =  null;
        int parse_se_mdh_progresside_remes_CompositeEntryPoint_StartIndex = input.index();
        Token a0=null;
        se.mdh.progresside.remes.Edge a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1657:1: (a0= 'entry' (a1_0= parse_se_mdh_progresside_remes_Edge ) )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1658:2: a0= 'entry' (a1_0= parse_se_mdh_progresside_remes_Edge )
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_se_mdh_progresside_remes_CompositeEntryPoint1241); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeEntryPoint();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 42));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1670:2: (a1_0= parse_se_mdh_progresside_remes_Edge )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1671:3: a1_0= parse_se_mdh_progresside_remes_Edge
            {
            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Edge_in_parse_se_mdh_progresside_remes_CompositeEntryPoint1259);
            a1_0=parse_se_mdh_progresside_remes_Edge();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_se_mdh_progresside_remes_CompositeEntryPoint_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_CompositeEntryPoint"


    // $ANTLR start "parse_se_mdh_progresside_remes_Edge"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1703:1: parse_se_mdh_progresside_remes_Edge returns [se.mdh.progresside.remes.Edge element = null] : a0= 'edge' ( (a1= '(' (a2= QUOTED_34_34 ) a3= ')' ) )? ( (a4= '{' (a5= QUOTED_34_34 ) a6= '}' ) )? a7= 'to' (a8= TEXT ) ;
    public final se.mdh.progresside.remes.Edge parse_se_mdh_progresside_remes_Edge() throws RecognitionException {
        se.mdh.progresside.remes.Edge element =  null;
        int parse_se_mdh_progresside_remes_Edge_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1706:1: (a0= 'edge' ( (a1= '(' (a2= QUOTED_34_34 ) a3= ')' ) )? ( (a4= '{' (a5= QUOTED_34_34 ) a6= '}' ) )? a7= 'to' (a8= TEXT ) )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1707:2: a0= 'edge' ( (a1= '(' (a2= QUOTED_34_34 ) a3= ')' ) )? ( (a4= '{' (a5= QUOTED_34_34 ) a6= '}' ) )? a7= 'to' (a8= TEXT )
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_se_mdh_progresside_remes_Edge1292); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_28, 44));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 44));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 44));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1721:2: ( (a1= '(' (a2= QUOTED_34_34 ) a3= ')' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1722:3: (a1= '(' (a2= QUOTED_34_34 ) a3= ')' )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1722:3: (a1= '(' (a2= QUOTED_34_34 ) a3= ')' )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1723:4: a1= '(' (a2= QUOTED_34_34 ) a3= ')'
                    {
                    a1=(Token)match(input,22,FOLLOW_22_in_parse_se_mdh_progresside_remes_Edge1315); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_31, 45));
                      			
                    }
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1735:4: (a2= QUOTED_34_34 )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1736:5: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Edge1341); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_32, 46));
                      			
                    }
                    a3=(Token)match(input,23,FOLLOW_23_in_parse_se_mdh_progresside_remes_Edge1374); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 47));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 47));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 48));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 48));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1789:2: ( (a4= '{' (a5= QUOTED_34_34 ) a6= '}' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1790:3: (a4= '{' (a5= QUOTED_34_34 ) a6= '}' )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1790:3: (a4= '{' (a5= QUOTED_34_34 ) a6= '}' )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1791:4: a4= '{' (a5= QUOTED_34_34 ) a6= '}'
                    {
                    a4=(Token)match(input,12,FOLLOW_12_in_parse_se_mdh_progresside_remes_Edge1416); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_33, 49));
                      			
                    }
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1803:4: (a5= QUOTED_34_34 )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1804:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Edge1442); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_34, 50));
                      			
                    }
                    a6=(Token)match(input,13,FOLLOW_13_in_parse_se_mdh_progresside_remes_Edge1475); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 51));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 52));
              	
            }
            a7=(Token)match(input,24,FOLLOW_24_in_parse_se_mdh_progresside_remes_Edge1508); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_35, 53));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1867:2: (a8= TEXT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1868:3: a8= TEXT
            {
            a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Edge1526); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_se_mdh_progresside_remes_Edge_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_Edge"


    // $ANTLR start "parse_se_mdh_progresside_remes_InitEdge"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1917:1: parse_se_mdh_progresside_remes_InitEdge returns [se.mdh.progresside.remes.InitEdge element = null] : a0= 'edge' ( (a1= '{' (a2= QUOTED_34_34 ) a3= '}' ) )? a4= 'to' (a5= TEXT ) ;
    public final se.mdh.progresside.remes.InitEdge parse_se_mdh_progresside_remes_InitEdge() throws RecognitionException {
        se.mdh.progresside.remes.InitEdge element =  null;
        int parse_se_mdh_progresside_remes_InitEdge_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1920:1: (a0= 'edge' ( (a1= '{' (a2= QUOTED_34_34 ) a3= '}' ) )? a4= 'to' (a5= TEXT ) )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1921:2: a0= 'edge' ( (a1= '{' (a2= QUOTED_34_34 ) a3= '}' ) )? a4= 'to' (a5= TEXT )
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_se_mdh_progresside_remes_InitEdge1562); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_36, 55));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 55));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1934:2: ( (a1= '{' (a2= QUOTED_34_34 ) a3= '}' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1935:3: (a1= '{' (a2= QUOTED_34_34 ) a3= '}' )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1935:3: (a1= '{' (a2= QUOTED_34_34 ) a3= '}' )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1936:4: a1= '{' (a2= QUOTED_34_34 ) a3= '}'
                    {
                    a1=(Token)match(input,12,FOLLOW_12_in_parse_se_mdh_progresside_remes_InitEdge1585); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 56));
                      			
                    }
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1948:4: (a2= QUOTED_34_34 )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:1949:5: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_InitEdge1611); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_39, 57));
                      			
                    }
                    a3=(Token)match(input,13,FOLLOW_13_in_parse_se_mdh_progresside_remes_InitEdge1644); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 58));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 59));
              	
            }
            a4=(Token)match(input,24,FOLLOW_24_in_parse_se_mdh_progresside_remes_InitEdge1677); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_40, 60));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2012:2: (a5= TEXT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2013:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_InitEdge1695); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_se_mdh_progresside_remes_InitEdge_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_InitEdge"


    // $ANTLR start "parse_se_mdh_progresside_remes_Variable"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2058:1: parse_se_mdh_progresside_remes_Variable returns [se.mdh.progresside.remes.Variable element = null] : a0= 'var' ( ( (a1= TEXT ) ) )? ( ( (a2= TEXT ) ) )? ( ( (a3= TEXT ) ) )? (a4= TEXT ) ( (a5= '[' (a6= TEXT ) a7= ']' ) )? (a8= QUOTED_34_34 ) ( (a9= '=' (a10= QUOTED_34_34 ) ) )? ;
    public final se.mdh.progresside.remes.Variable parse_se_mdh_progresside_remes_Variable() throws RecognitionException {
        se.mdh.progresside.remes.Variable element =  null;
        int parse_se_mdh_progresside_remes_Variable_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2061:1: (a0= 'var' ( ( (a1= TEXT ) ) )? ( ( (a2= TEXT ) ) )? ( ( (a3= TEXT ) ) )? (a4= TEXT ) ( (a5= '[' (a6= TEXT ) a7= ']' ) )? (a8= QUOTED_34_34 ) ( (a9= '=' (a10= QUOTED_34_34 ) ) )? )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2062:2: a0= 'var' ( ( (a1= TEXT ) ) )? ( ( (a2= TEXT ) ) )? ( ( (a3= TEXT ) ) )? (a4= TEXT ) ( (a5= '[' (a6= TEXT ) a7= ']' ) )? (a8= QUOTED_34_34 ) ( (a9= '=' (a10= QUOTED_34_34 ) ) )?
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_se_mdh_progresside_remes_Variable1731); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_41, 62));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_42, 62));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 62));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 62));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2077:2: ( ( (a1= TEXT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==TEXT) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred19_Remessrc()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2078:3: ( (a1= TEXT ) )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2078:3: ( (a1= TEXT ) )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2079:4: (a1= TEXT )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2079:4: (a1= TEXT )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2080:5: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1760); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_42, 63));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 63));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 63));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_42, 64));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 64));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 64));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2123:2: ( ( (a2= TEXT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TEXT) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred20_Remessrc()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2124:3: ( (a2= TEXT ) )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2124:3: ( (a2= TEXT ) )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2125:4: (a2= TEXT )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2125:4: (a2= TEXT )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2126:5: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1821); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 65));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 65));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 66));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 66));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2167:2: ( ( (a3= TEXT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TEXT) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==TEXT) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2168:3: ( (a3= TEXT ) )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2168:3: ( (a3= TEXT ) )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2169:4: (a3= TEXT )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2169:4: (a3= TEXT )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2170:5: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1882); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 67));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 68));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2209:2: (a4= TEXT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2210:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1932); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_45, 69));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_46, 69));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2243:2: ( (a5= '[' (a6= TEXT ) a7= ']' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2244:3: (a5= '[' (a6= TEXT ) a7= ']' )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2244:3: (a5= '[' (a6= TEXT ) a7= ']' )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2245:4: a5= '[' (a6= TEXT ) a7= ']'
                    {
                    a5=(Token)match(input,26,FOLLOW_26_in_parse_se_mdh_progresside_remes_Variable1962); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_47, 70));
                      			
                    }
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2257:4: (a6= TEXT )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2258:5: a6= TEXT
                    {
                    a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1988); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_48, 71));
                      			
                    }
                    a7=(Token)match(input,27,FOLLOW_27_in_parse_se_mdh_progresside_remes_Variable2021); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_46, 72));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_46, 73));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2309:2: (a8= QUOTED_34_34 )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2310:3: a8= QUOTED_34_34
            {
            a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Variable2058); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2352:2: ( (a9= '=' (a10= QUOTED_34_34 ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2353:3: (a9= '=' (a10= QUOTED_34_34 ) )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2353:3: (a9= '=' (a10= QUOTED_34_34 ) )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2354:4: a9= '=' (a10= QUOTED_34_34 )
                    {
                    a9=(Token)match(input,28,FOLLOW_28_in_parse_se_mdh_progresside_remes_Variable2088); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_50, 75));
                      			
                    }
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2366:4: (a10= QUOTED_34_34 )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2367:5: a10= QUOTED_34_34
                    {
                    a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Variable2114); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_se_mdh_progresside_remes_Variable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_Variable"


    // $ANTLR start "parse_se_mdh_progresside_remes_Resource"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2426:1: parse_se_mdh_progresside_remes_Resource returns [se.mdh.progresside.remes.Resource element = null] : a0= 'resource' (a1= TEXT ) (a2= QUOTED_34_34 ) ( (a3= ':' (a4= QUOTED_34_34 ) ) )? ;
    public final se.mdh.progresside.remes.Resource parse_se_mdh_progresside_remes_Resource() throws RecognitionException {
        se.mdh.progresside.remes.Resource element =  null;
        int parse_se_mdh_progresside_remes_Resource_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2429:1: (a0= 'resource' (a1= TEXT ) (a2= QUOTED_34_34 ) ( (a3= ':' (a4= QUOTED_34_34 ) ) )? )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2430:2: a0= 'resource' (a1= TEXT ) (a2= QUOTED_34_34 ) ( (a3= ':' (a4= QUOTED_34_34 ) ) )?
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_se_mdh_progresside_remes_Resource2175); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_51, 78));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2442:2: (a1= TEXT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2443:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Resource2193); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_52, 79));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2475:2: (a2= QUOTED_34_34 )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2476:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Resource2218); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2518:2: ( (a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2519:3: (a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2519:3: (a3= ':' (a4= QUOTED_34_34 ) )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2520:4: a3= ':' (a4= QUOTED_34_34 )
                    {
                    a3=(Token)match(input,30,FOLLOW_30_in_parse_se_mdh_progresside_remes_Resource2248); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_54, 81));
                      			
                    }
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2532:4: (a4= QUOTED_34_34 )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2533:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Resource2274); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_se_mdh_progresside_remes_Resource_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_Resource"


    // $ANTLR start "parse_se_mdh_progresside_remes_Constant"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2592:1: parse_se_mdh_progresside_remes_Constant returns [se.mdh.progresside.remes.Constant element = null] : a0= 'const' ( (a1= TEXT ) )? (a2= TEXT ) (a3= QUOTED_34_34 ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? ;
    public final se.mdh.progresside.remes.Constant parse_se_mdh_progresside_remes_Constant() throws RecognitionException {
        se.mdh.progresside.remes.Constant element =  null;
        int parse_se_mdh_progresside_remes_Constant_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2595:1: (a0= 'const' ( (a1= TEXT ) )? (a2= TEXT ) (a3= QUOTED_34_34 ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2596:2: a0= 'const' ( (a1= TEXT ) )? (a2= TEXT ) (a3= QUOTED_34_34 ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_se_mdh_progresside_remes_Constant2335); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_55, 84));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_56, 84));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2609:2: ( (a1= TEXT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TEXT) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==TEXT) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2610:3: (a1= TEXT )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2610:3: (a1= TEXT )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2611:4: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Constant2358); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_56, 85));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2644:2: (a2= TEXT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2645:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Constant2392); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_57, 86));
              	
            }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2677:2: (a3= QUOTED_34_34 )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2678:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Constant2417); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2720:2: ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2721:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    {
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2721:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2722:4: a4= '=' (a5= QUOTED_34_34 )
                    {
                    a4=(Token)match(input,28,FOLLOW_28_in_parse_se_mdh_progresside_remes_Constant2447); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_59, 88));
                      			
                    }
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2734:4: (a5= QUOTED_34_34 )
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2735:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Constant2473); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_se_mdh_progresside_remes_Constant_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_Constant"


    // $ANTLR start "parse_se_mdh_progresside_remes_Mode"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2794:1: parse_se_mdh_progresside_remes_Mode returns [se.mdh.progresside.remes.Mode element = null] : (c0= parse_se_mdh_progresside_remes_CompositeMode | c1= parse_se_mdh_progresside_remes_SubMode );
    public final se.mdh.progresside.remes.Mode parse_se_mdh_progresside_remes_Mode() throws RecognitionException {
        se.mdh.progresside.remes.Mode element =  null;
        int parse_se_mdh_progresside_remes_Mode_StartIndex = input.index();
        se.mdh.progresside.remes.CompositeMode c0 = null;

        se.mdh.progresside.remes.SubMode c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2795:1: (c0= parse_se_mdh_progresside_remes_CompositeMode | c1= parse_se_mdh_progresside_remes_SubMode )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            else if ( (LA21_0==15) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2796:2: c0= parse_se_mdh_progresside_remes_CompositeMode
                    {
                    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_CompositeMode_in_parse_se_mdh_progresside_remes_Mode2530);
                    c0=parse_se_mdh_progresside_remes_CompositeMode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2797:4: c1= parse_se_mdh_progresside_remes_SubMode
                    {
                    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_SubMode_in_parse_se_mdh_progresside_remes_Mode2540);
                    c1=parse_se_mdh_progresside_remes_SubMode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_se_mdh_progresside_remes_Mode_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_se_mdh_progresside_remes_Mode"

    // $ANTLR start synpred19_Remessrc
    public final void synpred19_Remessrc_fragment() throws RecognitionException {   
        Token a1=null;

        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2078:3: ( ( (a1= TEXT ) ) )
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2078:3: ( (a1= TEXT ) )
        {
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2078:3: ( (a1= TEXT ) )
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2079:4: (a1= TEXT )
        {
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2079:4: (a1= TEXT )
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2080:5: a1= TEXT
        {
        a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_synpred19_Remessrc1760); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_Remessrc

    // $ANTLR start synpred20_Remessrc
    public final void synpred20_Remessrc_fragment() throws RecognitionException {   
        Token a2=null;

        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2124:3: ( ( (a2= TEXT ) ) )
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2124:3: ( (a2= TEXT ) )
        {
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2124:3: ( (a2= TEXT ) )
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2125:4: (a2= TEXT )
        {
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2125:4: (a2= TEXT )
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.resource.remessrc\\src-gen\\hr\\fer\\rasip\\remes\\resource\\remessrc\\mopp\\Remessrc.g:2126:5: a2= TEXT
        {
        a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_synpred20_Remessrc1821); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_Remessrc

    // Delegated rules

    public final boolean synpred19_Remessrc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Remessrc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Remessrc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Remessrc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_RemesDiagram_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_se_mdh_progresside_remes_RemesDiagram112 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_se_mdh_progresside_remes_RemesDiagram126 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Mode_in_parse_se_mdh_progresside_remes_RemesDiagram149 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13_in_parse_se_mdh_progresside_remes_RemesDiagram175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_se_mdh_progresside_remes_CompositeMode204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_CompositeMode222 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_se_mdh_progresside_remes_CompositeMode243 = new BitSet(new long[]{0x00000000A216E000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Variable_in_parse_se_mdh_progresside_remes_CompositeMode272 = new BitSet(new long[]{0x00000000A216E000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Resource_in_parse_se_mdh_progresside_remes_CompositeMode314 = new BitSet(new long[]{0x00000000A216E000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Constant_in_parse_se_mdh_progresside_remes_CompositeMode356 = new BitSet(new long[]{0x00000000A216E000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_SubMode_in_parse_se_mdh_progresside_remes_CompositeMode398 = new BitSet(new long[]{0x00000000A216E000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_ConditionalConnector_in_parse_se_mdh_progresside_remes_CompositeMode440 = new BitSet(new long[]{0x00000000A216E000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_InitPoint_in_parse_se_mdh_progresside_remes_CompositeMode482 = new BitSet(new long[]{0x00000000A216E000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_CompositeEntryPoint_in_parse_se_mdh_progresside_remes_CompositeMode524 = new BitSet(new long[]{0x00000000A216E000L});
    public static final BitSet FOLLOW_13_in_parse_se_mdh_progresside_remes_CompositeMode565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_se_mdh_progresside_remes_SubMode594 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_SubMode617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_SubMode651 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_se_mdh_progresside_remes_SubMode672 = new BitSet(new long[]{0x00000000A21FC000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Variable_in_parse_se_mdh_progresside_remes_SubMode701 = new BitSet(new long[]{0x00000000A21FC000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Resource_in_parse_se_mdh_progresside_remes_SubMode743 = new BitSet(new long[]{0x00000000A21FC000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Constant_in_parse_se_mdh_progresside_remes_SubMode785 = new BitSet(new long[]{0x00000000A21FC000L});
    public static final BitSet FOLLOW_16_in_parse_se_mdh_progresside_remes_SubMode835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_SubMode861 = new BitSet(new long[]{0x00000000A21FC000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_ExitPoint_in_parse_se_mdh_progresside_remes_SubMode911 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_se_mdh_progresside_remes_SubMode929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_se_mdh_progresside_remes_ConditionalConnector958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_ConditionalConnector976 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_se_mdh_progresside_remes_ConditionalConnector997 = new BitSet(new long[]{0x00000000A21FC000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_ExitPoint_in_parse_se_mdh_progresside_remes_ConditionalConnector1015 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_se_mdh_progresside_remes_ConditionalConnector1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_se_mdh_progresside_remes_InitPoint1062 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_InitEdge_in_parse_se_mdh_progresside_remes_InitPoint1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_se_mdh_progresside_remes_ExitPoint1113 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_se_mdh_progresside_remes_ExitPoint1127 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Edge_in_parse_se_mdh_progresside_remes_ExitPoint1156 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_parse_se_mdh_progresside_remes_ExitPoint1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_CompositeEntryPoint_in_parse_se_mdh_progresside_remes_ExitPoint1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_se_mdh_progresside_remes_CompositeEntryPoint1241 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Edge_in_parse_se_mdh_progresside_remes_CompositeEntryPoint1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_se_mdh_progresside_remes_Edge1292 = new BitSet(new long[]{0x0000000001401000L});
    public static final BitSet FOLLOW_22_in_parse_se_mdh_progresside_remes_Edge1315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Edge1341 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_se_mdh_progresside_remes_Edge1374 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_12_in_parse_se_mdh_progresside_remes_Edge1416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Edge1442 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_se_mdh_progresside_remes_Edge1475 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_se_mdh_progresside_remes_Edge1508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Edge1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_se_mdh_progresside_remes_InitEdge1562 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_12_in_parse_se_mdh_progresside_remes_InitEdge1585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_InitEdge1611 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_se_mdh_progresside_remes_InitEdge1644 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_se_mdh_progresside_remes_InitEdge1677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_InitEdge1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_se_mdh_progresside_remes_Variable1731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1760 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1821 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1882 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1932 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_parse_se_mdh_progresside_remes_Variable1962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Variable1988 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_se_mdh_progresside_remes_Variable2021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Variable2058 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_parse_se_mdh_progresside_remes_Variable2088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Variable2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_se_mdh_progresside_remes_Resource2175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Resource2193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Resource2218 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_parse_se_mdh_progresside_remes_Resource2248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Resource2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_se_mdh_progresside_remes_Constant2335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Constant2358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_se_mdh_progresside_remes_Constant2392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Constant2417 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_parse_se_mdh_progresside_remes_Constant2447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_se_mdh_progresside_remes_Constant2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_CompositeMode_in_parse_se_mdh_progresside_remes_Mode2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_SubMode_in_parse_se_mdh_progresside_remes_Mode2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_synpred19_Remessrc1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_synpred20_Remessrc1821 = new BitSet(new long[]{0x0000000000000002L});

}