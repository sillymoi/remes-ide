// $ANTLR ${project.version} ${buildNumber}

	package hr.fer.rasip.remes.resource.remessrc.mopp;


import org.antlr.runtime3_2_0.*;
import java.util.HashMap;
public class RemessrcParser extends RemessrcANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "T_URGENT", "QUOTED_40_41", "QUOTED_91_93", "T_GLOBAL", "T_READABLE", "T_WRITEABLE", "TYPE", "INTEGER", "SL_COMMENT", "FLOAT", "TEXT", "WHITESPACE", "LINEBREAK", "'remes'", "'{'", "'}'", "'composite'", "'atomic'", "'invariant'", "'conditional'", "'init'", "'edges'", "'entry'", "'edge'", "'to'", "'var'", "'['", "']'", "'='", "'resource'", "':'", "'const'"
    };
    public static final int INTEGER=12;
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
    public static final int WHITESPACE=16;
    public static final int FLOAT=14;
    public static final int TEXT=15;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T_WRITEABLE=10;
    public static final int TYPE=11;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T_GLOBAL=8;
    public static final int QUOTED_40_41=6;
    public static final int SL_COMMENT=13;
    public static final int T_URGENT=5;
    public static final int QUOTED_91_93=7;
    public static final int LINEBREAK=17;
    public static final int T_READABLE=9;

    // delegates
    // delegators


        public RemessrcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RemessrcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[42+1];
             
             
        }
        

    public String[] getTokenNames() { return RemessrcParser.tokenNames; }
    public String getGrammarFileName() { return "Remessrc.g"; }


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
    		int followSetID = 89;
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
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_20 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT), "QUOTED_40_41");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_21 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME), "ID");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_22 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector(), "{");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_23 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector(), "}");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_24 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(), "edge");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_25 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getExitPoint(), "{");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_26 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), "edge");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_27 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getExitPoint(), "}");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_28 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD), "QUOTED_40_41");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_29 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY), "QUOTED_91_93");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_30 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), "to");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_31 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO), "ID");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_32 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION), "QUOTED_91_93");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_33 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(), "to");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_34 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO), "ID");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_35 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL), "T_GLOBAL");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_36 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE), "T_READABLE");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_37 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE), "T_WRITEABLE");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_38 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE), "TYPE");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_39 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), "[");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_40 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), "ID");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_41 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), "INTEGER");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_42 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), "]");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_43 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), "=");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_44 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), "INTEGER");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_45 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE), "TYPE");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_46 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME), "ID");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_47 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), ":");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_48 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION), "QUOTED_40_41");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_49 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL), "T_GLOBAL");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_50 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE), "TYPE");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_51 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME), "ID");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_52 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedCsString(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), "=");
    	private final static hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement TERMINAL_53 = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedStructuralFeature(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE), "INTEGER");
    	
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
    		TERMINAL_39.addFollower(TERMINAL_41, EMPTY_FEATURE_ARRAY);
    		TERMINAL_41.addFollower(TERMINAL_42, EMPTY_FEATURE_ARRAY);
    		TERMINAL_42.addFollower(TERMINAL_40, EMPTY_FEATURE_ARRAY);
    		TERMINAL_40.addFollower(TERMINAL_43, EMPTY_FEATURE_ARRAY);
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
    		TERMINAL_43.addFollower(TERMINAL_44, EMPTY_FEATURE_ARRAY);
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
    		TERMINAL_8.addFollower(TERMINAL_45, EMPTY_FEATURE_ARRAY);
    		TERMINAL_45.addFollower(TERMINAL_46, EMPTY_FEATURE_ARRAY);
    		TERMINAL_46.addFollower(TERMINAL_47, EMPTY_FEATURE_ARRAY);
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
    		TERMINAL_47.addFollower(TERMINAL_48, EMPTY_FEATURE_ARRAY);
    		TERMINAL_48.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
    		TERMINAL_48.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
    		TERMINAL_48.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
    		TERMINAL_48.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
    		TERMINAL_48.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
    		TERMINAL_48.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
    		TERMINAL_48.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
    		TERMINAL_48.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
    		TERMINAL_48.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
    		TERMINAL_48.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
    		TERMINAL_48.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
    		TERMINAL_9.addFollower(TERMINAL_49, EMPTY_FEATURE_ARRAY);
    		TERMINAL_9.addFollower(TERMINAL_50, EMPTY_FEATURE_ARRAY);
    		TERMINAL_49.addFollower(TERMINAL_50, EMPTY_FEATURE_ARRAY);
    		TERMINAL_50.addFollower(TERMINAL_51, EMPTY_FEATURE_ARRAY);
    		TERMINAL_51.addFollower(TERMINAL_52, EMPTY_FEATURE_ARRAY);
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
    		TERMINAL_52.addFollower(TERMINAL_53, EMPTY_FEATURE_ARRAY);
    		TERMINAL_53.addFollower(TERMINAL_7, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
    		TERMINAL_53.addFollower(TERMINAL_8, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
    		TERMINAL_53.addFollower(TERMINAL_9, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_3, });
    		TERMINAL_53.addFollower(TERMINAL_3, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_4, });
    		TERMINAL_53.addFollower(TERMINAL_10, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_5, });
    		TERMINAL_53.addFollower(TERMINAL_11, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_6, });
    		TERMINAL_53.addFollower(TERMINAL_12, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_7, });
    		TERMINAL_53.addFollower(TERMINAL_13, EMPTY_FEATURE_ARRAY);
    		TERMINAL_53.addFollower(TERMINAL_17, EMPTY_FEATURE_ARRAY);
    		TERMINAL_53.addFollower(TERMINAL_18, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_8, });
    		TERMINAL_53.addFollower(TERMINAL_19, EMPTY_FEATURE_ARRAY);
    	}
    	// wire the terminals
    	static {
    		wire0();
    	}



    // $ANTLR start "start"
    // Remessrc.g:733:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_se_mdh_progresside_remes_RemesDiagram ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        se.mdh.progresside.remes.RemesDiagram c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Remessrc.g:734:1: ( (c0= parse_se_mdh_progresside_remes_RemesDiagram ) EOF )
            // Remessrc.g:735:2: (c0= parse_se_mdh_progresside_remes_RemesDiagram ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_0, 0));
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // Remessrc.g:740:2: (c0= parse_se_mdh_progresside_remes_RemesDiagram )
            // Remessrc.g:741:3: c0= parse_se_mdh_progresside_remes_RemesDiagram
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
    // Remessrc.g:746:1: parse_se_mdh_progresside_remes_RemesDiagram returns [se.mdh.progresside.remes.RemesDiagram element = null] : a0= 'remes' a1= '{' ( (a2_0= parse_se_mdh_progresside_remes_Mode ) )* a3= '}' ;
    public final se.mdh.progresside.remes.RemesDiagram parse_se_mdh_progresside_remes_RemesDiagram() throws RecognitionException {
        se.mdh.progresside.remes.RemesDiagram element =  null;
        int parse_se_mdh_progresside_remes_RemesDiagram_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        se.mdh.progresside.remes.Mode a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Remessrc.g:749:1: (a0= 'remes' a1= '{' ( (a2_0= parse_se_mdh_progresside_remes_Mode ) )* a3= '}' )
            // Remessrc.g:750:2: a0= 'remes' a1= '{' ( (a2_0= parse_se_mdh_progresside_remes_Mode ) )* a3= '}'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_se_mdh_progresside_remes_RemesDiagram112); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_1, 1));
              	
            }
            a1=(Token)match(input,19,FOLLOW_19_in_parse_se_mdh_progresside_remes_RemesDiagram126); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 2, FEATURE_0));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 2, FEATURE_0));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 2));
              	
            }
            // Remessrc.g:776:2: ( (a2_0= parse_se_mdh_progresside_remes_Mode ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=21 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Remessrc.g:777:3: (a2_0= parse_se_mdh_progresside_remes_Mode )
            	    {
            	    // Remessrc.g:777:3: (a2_0= parse_se_mdh_progresside_remes_Mode )
            	    // Remessrc.g:778:4: a2_0= parse_se_mdh_progresside_remes_Mode
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
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 3, FEATURE_0));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 3, FEATURE_0));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 3));
              	
            }
            a3=(Token)match(input,20,FOLLOW_20_in_parse_se_mdh_progresside_remes_RemesDiagram175); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createRemesDiagram();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
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
    // Remessrc.g:815:1: parse_se_mdh_progresside_remes_CompositeMode returns [se.mdh.progresside.remes.CompositeMode element = null] : a0= 'composite' (a1= ID ) a2= '{' ( ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) ) )* ( ( (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) ) )* a10= '}' ;
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
            // Remessrc.g:818:1: (a0= 'composite' (a1= ID ) a2= '{' ( ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) ) )* ( ( (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) ) )* a10= '}' )
            // Remessrc.g:819:2: a0= 'composite' (a1= ID ) a2= '{' ( ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) ) )* ( ( (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) ) )* a10= '}'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_se_mdh_progresside_remes_CompositeMode204); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_5, 5));
              	
            }
            // Remessrc.g:831:2: (a1= ID )
            // Remessrc.g:832:3: a1= ID
            {
            a1=(Token)match(input,ID,FOLLOW_ID_in_parse_se_mdh_progresside_remes_CompositeMode222); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_6, 6));
              	
            }
            a2=(Token)match(input,19,FOLLOW_19_in_parse_se_mdh_progresside_remes_CompositeMode243); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Remessrc.g:883:2: ( ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==30||LA3_0==34||LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Remessrc.g:884:3: ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) )
            	    {
            	    // Remessrc.g:884:3: ( (a3_0= parse_se_mdh_progresside_remes_Variable ) | (a4_0= parse_se_mdh_progresside_remes_Resource ) | (a5_0= parse_se_mdh_progresside_remes_Constant ) )
            	    int alt2=3;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt2=3;
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
            	            // Remessrc.g:885:4: (a3_0= parse_se_mdh_progresside_remes_Variable )
            	            {
            	            // Remessrc.g:885:4: (a3_0= parse_se_mdh_progresside_remes_Variable )
            	            // Remessrc.g:886:5: a3_0= parse_se_mdh_progresside_remes_Variable
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 8, FEATURE_1));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 8, FEATURE_2));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 8, FEATURE_3));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 8, FEATURE_4));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 8, FEATURE_5));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 8, FEATURE_6));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 8, FEATURE_7));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 8));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Remessrc.g:915:8: (a4_0= parse_se_mdh_progresside_remes_Resource )
            	            {
            	            // Remessrc.g:915:8: (a4_0= parse_se_mdh_progresside_remes_Resource )
            	            // Remessrc.g:916:5: a4_0= parse_se_mdh_progresside_remes_Resource
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 9, FEATURE_1));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 9, FEATURE_2));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 9, FEATURE_3));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 9, FEATURE_4));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 9, FEATURE_5));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 9, FEATURE_6));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 9, FEATURE_7));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 9));
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Remessrc.g:945:8: (a5_0= parse_se_mdh_progresside_remes_Constant )
            	            {
            	            // Remessrc.g:945:8: (a5_0= parse_se_mdh_progresside_remes_Constant )
            	            // Remessrc.g:946:5: a5_0= parse_se_mdh_progresside_remes_Constant
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 10, FEATURE_1));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 10, FEATURE_2));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 10, FEATURE_3));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 10, FEATURE_4));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 10, FEATURE_5));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 10, FEATURE_6));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 10, FEATURE_7));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 10));
            	              			
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
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 11, FEATURE_1));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 11, FEATURE_2));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 11, FEATURE_3));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 11, FEATURE_4));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 11, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 11, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 11, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 11));
              	
            }
            // Remessrc.g:988:2: ( ( (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22||(LA5_0>=24 && LA5_0<=25)||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Remessrc.g:989:3: ( (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) )
            	    {
            	    // Remessrc.g:989:3: ( (a6_0= parse_se_mdh_progresside_remes_SubMode ) | (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector ) | (a8_0= parse_se_mdh_progresside_remes_InitPoint ) | (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint ) )
            	    int alt4=4;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt4=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // Remessrc.g:990:4: (a6_0= parse_se_mdh_progresside_remes_SubMode )
            	            {
            	            // Remessrc.g:990:4: (a6_0= parse_se_mdh_progresside_remes_SubMode )
            	            // Remessrc.g:991:5: a6_0= parse_se_mdh_progresside_remes_SubMode
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_SubMode_in_parse_se_mdh_progresside_remes_CompositeMode412);
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 12, FEATURE_4));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 12, FEATURE_5));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 12, FEATURE_6));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 12, FEATURE_7));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 12));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Remessrc.g:1017:8: (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector )
            	            {
            	            // Remessrc.g:1017:8: (a7_0= parse_se_mdh_progresside_remes_ConditionalConnector )
            	            // Remessrc.g:1018:5: a7_0= parse_se_mdh_progresside_remes_ConditionalConnector
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_ConditionalConnector_in_parse_se_mdh_progresside_remes_CompositeMode454);
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 13, FEATURE_4));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 13, FEATURE_5));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 13, FEATURE_6));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 13, FEATURE_7));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 13));
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Remessrc.g:1044:8: (a8_0= parse_se_mdh_progresside_remes_InitPoint )
            	            {
            	            // Remessrc.g:1044:8: (a8_0= parse_se_mdh_progresside_remes_InitPoint )
            	            // Remessrc.g:1045:5: a8_0= parse_se_mdh_progresside_remes_InitPoint
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_InitPoint_in_parse_se_mdh_progresside_remes_CompositeMode496);
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 14, FEATURE_4));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 14, FEATURE_5));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 14, FEATURE_6));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 14, FEATURE_7));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 14));
            	              			
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Remessrc.g:1071:8: (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint )
            	            {
            	            // Remessrc.g:1071:8: (a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint )
            	            // Remessrc.g:1072:5: a9_0= parse_se_mdh_progresside_remes_CompositeEntryPoint
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_CompositeEntryPoint_in_parse_se_mdh_progresside_remes_CompositeMode538);
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 15, FEATURE_4));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 15, FEATURE_5));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 15, FEATURE_6));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 15, FEATURE_7));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 15));
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 16, FEATURE_4));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 16, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 16, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 16, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 16));
              	
            }
            a10=(Token)match(input,20,FOLLOW_20_in_parse_se_mdh_progresside_remes_CompositeMode579); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 17, FEATURE_0));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 17, FEATURE_0));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 17));
              	
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
    // Remessrc.g:1124:1: parse_se_mdh_progresside_remes_SubMode returns [se.mdh.progresside.remes.SubMode element = null] : a0= 'atomic' ( ( (a1= T_URGENT ) ) )? (a2= ID ) a3= '{' ( ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) ) )* ( (a7= 'invariant' (a8= QUOTED_40_41 ) ) )? ( ( (a9_0= parse_se_mdh_progresside_remes_ExitPoint ) ) )? a10= '}' ;
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
            // Remessrc.g:1127:1: (a0= 'atomic' ( ( (a1= T_URGENT ) ) )? (a2= ID ) a3= '{' ( ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) ) )* ( (a7= 'invariant' (a8= QUOTED_40_41 ) ) )? ( ( (a9_0= parse_se_mdh_progresside_remes_ExitPoint ) ) )? a10= '}' )
            // Remessrc.g:1128:2: a0= 'atomic' ( ( (a1= T_URGENT ) ) )? (a2= ID ) a3= '{' ( ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) ) )* ( (a7= 'invariant' (a8= QUOTED_40_41 ) ) )? ( ( (a9_0= parse_se_mdh_progresside_remes_ExitPoint ) ) )? a10= '}'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_se_mdh_progresside_remes_SubMode608); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_14, 18));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 18));
              	
            }
            // Remessrc.g:1141:2: ( ( (a1= T_URGENT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==T_URGENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Remessrc.g:1142:3: ( (a1= T_URGENT ) )
                    {
                    // Remessrc.g:1142:3: ( (a1= T_URGENT ) )
                    // Remessrc.g:1143:4: (a1= T_URGENT )
                    {
                    // Remessrc.g:1143:4: (a1= T_URGENT )
                    // Remessrc.g:1144:5: a1= T_URGENT
                    {
                    a1=(Token)match(input,T_URGENT,FOLLOW_T_URGENT_in_parse_se_mdh_progresside_remes_SubMode637); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 19));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_15, 20));
              	
            }
            // Remessrc.g:1183:2: (a2= ID )
            // Remessrc.g:1184:3: a2= ID
            {
            a2=(Token)match(input,ID,FOLLOW_ID_in_parse_se_mdh_progresside_remes_SubMode687); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_16, 21));
              	
            }
            a3=(Token)match(input,19,FOLLOW_19_in_parse_se_mdh_progresside_remes_SubMode708); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 22, FEATURE_1));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 22, FEATURE_2));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 22, FEATURE_3));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 22));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 22, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 22, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 22));
              	
            }
            // Remessrc.g:1234:2: ( ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30||LA8_0==34||LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Remessrc.g:1235:3: ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) )
            	    {
            	    // Remessrc.g:1235:3: ( (a4_0= parse_se_mdh_progresside_remes_Variable ) | (a5_0= parse_se_mdh_progresside_remes_Resource ) | (a6_0= parse_se_mdh_progresside_remes_Constant ) )
            	    int alt7=3;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // Remessrc.g:1236:4: (a4_0= parse_se_mdh_progresside_remes_Variable )
            	            {
            	            // Remessrc.g:1236:4: (a4_0= parse_se_mdh_progresside_remes_Variable )
            	            // Remessrc.g:1237:5: a4_0= parse_se_mdh_progresside_remes_Variable
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Variable_in_parse_se_mdh_progresside_remes_SubMode737);
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 23, FEATURE_1));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 23, FEATURE_2));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 23, FEATURE_3));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 23));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 23, FEATURE_8));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 23, FEATURE_8));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 23));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Remessrc.g:1265:8: (a5_0= parse_se_mdh_progresside_remes_Resource )
            	            {
            	            // Remessrc.g:1265:8: (a5_0= parse_se_mdh_progresside_remes_Resource )
            	            // Remessrc.g:1266:5: a5_0= parse_se_mdh_progresside_remes_Resource
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Resource_in_parse_se_mdh_progresside_remes_SubMode779);
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 24, FEATURE_1));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 24, FEATURE_2));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 24, FEATURE_3));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 24));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 24, FEATURE_8));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 24, FEATURE_8));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 24));
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Remessrc.g:1294:8: (a6_0= parse_se_mdh_progresside_remes_Constant )
            	            {
            	            // Remessrc.g:1294:8: (a6_0= parse_se_mdh_progresside_remes_Constant )
            	            // Remessrc.g:1295:5: a6_0= parse_se_mdh_progresside_remes_Constant
            	            {
            	            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Constant_in_parse_se_mdh_progresside_remes_SubMode821);
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
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 25, FEATURE_1));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 25, FEATURE_2));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 25, FEATURE_3));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 25));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 25, FEATURE_8));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 25, FEATURE_8));
            	              				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 25));
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 26, FEATURE_1));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 26, FEATURE_2));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 26, FEATURE_3));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 26));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 26, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 26, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 26));
              	
            }
            // Remessrc.g:1335:2: ( (a7= 'invariant' (a8= QUOTED_40_41 ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Remessrc.g:1336:3: (a7= 'invariant' (a8= QUOTED_40_41 ) )
                    {
                    // Remessrc.g:1336:3: (a7= 'invariant' (a8= QUOTED_40_41 ) )
                    // Remessrc.g:1337:4: a7= 'invariant' (a8= QUOTED_40_41 )
                    {
                    a7=(Token)match(input,23,FOLLOW_23_in_parse_se_mdh_progresside_remes_SubMode871); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_20, 27));
                      			
                    }
                    // Remessrc.g:1349:4: (a8= QUOTED_40_41 )
                    // Remessrc.g:1350:5: a8= QUOTED_40_41
                    {
                    a8=(Token)match(input,QUOTED_40_41,FOLLOW_QUOTED_40_41_in_parse_se_mdh_progresside_remes_SubMode897); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
                      					}
                      					if (a8 != null) {
                      						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_40_41");
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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 28, FEATURE_8));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 28, FEATURE_8));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 28));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 29, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 29, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 29));
              	
            }
            // Remessrc.g:1393:2: ( ( (a9_0= parse_se_mdh_progresside_remes_ExitPoint ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Remessrc.g:1394:3: ( (a9_0= parse_se_mdh_progresside_remes_ExitPoint ) )
                    {
                    // Remessrc.g:1394:3: ( (a9_0= parse_se_mdh_progresside_remes_ExitPoint ) )
                    // Remessrc.g:1395:4: (a9_0= parse_se_mdh_progresside_remes_ExitPoint )
                    {
                    // Remessrc.g:1395:4: (a9_0= parse_se_mdh_progresside_remes_ExitPoint )
                    // Remessrc.g:1396:5: a9_0= parse_se_mdh_progresside_remes_ExitPoint
                    {
                    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_ExitPoint_in_parse_se_mdh_progresside_remes_SubMode958);
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
                      						copyLocalizationInfos(a9_0, element); 					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 30));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 31));
              	
            }
            a10=(Token)match(input,20,FOLLOW_20_in_parse_se_mdh_progresside_remes_SubMode999); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createSubMode();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_2, 32, FEATURE_0));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 32, FEATURE_0));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_4, 32));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 32, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 32, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 32, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 32));
              	
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
    // Remessrc.g:1444:1: parse_se_mdh_progresside_remes_ConditionalConnector returns [se.mdh.progresside.remes.ConditionalConnector element = null] : a0= 'conditional' (a1= ID ) a2= '{' (a3_0= parse_se_mdh_progresside_remes_ExitPoint ) a4= '}' ;
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
            // Remessrc.g:1447:1: (a0= 'conditional' (a1= ID ) a2= '{' (a3_0= parse_se_mdh_progresside_remes_ExitPoint ) a4= '}' )
            // Remessrc.g:1448:2: a0= 'conditional' (a1= ID ) a2= '{' (a3_0= parse_se_mdh_progresside_remes_ExitPoint ) a4= '}'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_se_mdh_progresside_remes_ConditionalConnector1028); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_21, 33));
              	
            }
            // Remessrc.g:1460:2: (a1= ID )
            // Remessrc.g:1461:3: a1= ID
            {
            a1=(Token)match(input,ID,FOLLOW_ID_in_parse_se_mdh_progresside_remes_ConditionalConnector1046); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_22, 34));
              	
            }
            a2=(Token)match(input,19,FOLLOW_19_in_parse_se_mdh_progresside_remes_ConditionalConnector1067); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 35, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 35, FEATURE_8));
              	
            }
            // Remessrc.g:1506:2: (a3_0= parse_se_mdh_progresside_remes_ExitPoint )
            // Remessrc.g:1507:3: a3_0= parse_se_mdh_progresside_remes_ExitPoint
            {
            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_ExitPoint_in_parse_se_mdh_progresside_remes_ConditionalConnector1085);
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
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 36));
              	
            }
            a4=(Token)match(input,20,FOLLOW_20_in_parse_se_mdh_progresside_remes_ConditionalConnector1103); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConditionalConnector();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 37, FEATURE_4));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 37, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 37, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 37, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 37));
              	
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
    // Remessrc.g:1546:1: parse_se_mdh_progresside_remes_InitPoint returns [se.mdh.progresside.remes.InitPoint element = null] : a0= 'init' (a1_0= parse_se_mdh_progresside_remes_InitEdge ) ;
    public final se.mdh.progresside.remes.InitPoint parse_se_mdh_progresside_remes_InitPoint() throws RecognitionException {
        se.mdh.progresside.remes.InitPoint element =  null;
        int parse_se_mdh_progresside_remes_InitPoint_StartIndex = input.index();
        Token a0=null;
        se.mdh.progresside.remes.InitEdge a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Remessrc.g:1549:1: (a0= 'init' (a1_0= parse_se_mdh_progresside_remes_InitEdge ) )
            // Remessrc.g:1550:2: a0= 'init' (a1_0= parse_se_mdh_progresside_remes_InitEdge )
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_se_mdh_progresside_remes_InitPoint1132); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitPoint();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_24, 38, FEATURE_9));
              	
            }
            // Remessrc.g:1562:2: (a1_0= parse_se_mdh_progresside_remes_InitEdge )
            // Remessrc.g:1563:3: a1_0= parse_se_mdh_progresside_remes_InitEdge
            {
            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_InitEdge_in_parse_se_mdh_progresside_remes_InitPoint1150);
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
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 39, FEATURE_4));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 39, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 39, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 39, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 39));
              	
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
    // Remessrc.g:1590:1: parse_se_mdh_progresside_remes_ExitPoint returns [se.mdh.progresside.remes.ExitPoint element = null] : (a0= 'edges' a1= '{' ( ( (a2_0= parse_se_mdh_progresside_remes_Edge ) ) )* a3= '}' | c0= parse_se_mdh_progresside_remes_CompositeEntryPoint );
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
            // Remessrc.g:1593:1: (a0= 'edges' a1= '{' ( ( (a2_0= parse_se_mdh_progresside_remes_Edge ) ) )* a3= '}' | c0= parse_se_mdh_progresside_remes_CompositeEntryPoint )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // Remessrc.g:1594:2: a0= 'edges' a1= '{' ( ( (a2_0= parse_se_mdh_progresside_remes_Edge ) ) )* a3= '}'
                    {
                    a0=(Token)match(input,26,FOLLOW_26_in_parse_se_mdh_progresside_remes_ExitPoint1183); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
                      		}
                      		collectHiddenTokens(element);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_25, 40));
                      	
                    }
                    a1=(Token)match(input,19,FOLLOW_19_in_parse_se_mdh_progresside_remes_ExitPoint1197); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
                      		}
                      		collectHiddenTokens(element);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 41, FEATURE_10));
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 41));
                      	
                    }
                    // Remessrc.g:1619:2: ( ( (a2_0= parse_se_mdh_progresside_remes_Edge ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Remessrc.g:1620:3: ( (a2_0= parse_se_mdh_progresside_remes_Edge ) )
                    	    {
                    	    // Remessrc.g:1620:3: ( (a2_0= parse_se_mdh_progresside_remes_Edge ) )
                    	    // Remessrc.g:1621:4: (a2_0= parse_se_mdh_progresside_remes_Edge )
                    	    {
                    	    // Remessrc.g:1621:4: (a2_0= parse_se_mdh_progresside_remes_Edge )
                    	    // Remessrc.g:1622:5: a2_0= parse_se_mdh_progresside_remes_Edge
                    	    {
                    	    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Edge_in_parse_se_mdh_progresside_remes_ExitPoint1226);
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
                    	      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 42, FEATURE_10));
                    	      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 42));
                    	      			
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 43, FEATURE_10));
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_27, 43));
                      	
                    }
                    a3=(Token)match(input,20,FOLLOW_20_in_parse_se_mdh_progresside_remes_ExitPoint1267); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createExitPoint();
                      		}
                      		collectHiddenTokens(element);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 44));
                      		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 44));
                      	
                    }

                    }
                    break;
                case 2 :
                    // Remessrc.g:1667:2: c0= parse_se_mdh_progresside_remes_CompositeEntryPoint
                    {
                    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_CompositeEntryPoint_in_parse_se_mdh_progresside_remes_ExitPoint1286);
                    c0=parse_se_mdh_progresside_remes_CompositeEntryPoint();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
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
    // Remessrc.g:1671:1: parse_se_mdh_progresside_remes_CompositeEntryPoint returns [se.mdh.progresside.remes.CompositeEntryPoint element = null] : a0= 'entry' (a1_0= parse_se_mdh_progresside_remes_Edge ) ;
    public final se.mdh.progresside.remes.CompositeEntryPoint parse_se_mdh_progresside_remes_CompositeEntryPoint() throws RecognitionException {
        se.mdh.progresside.remes.CompositeEntryPoint element =  null;
        int parse_se_mdh_progresside_remes_CompositeEntryPoint_StartIndex = input.index();
        Token a0=null;
        se.mdh.progresside.remes.Edge a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Remessrc.g:1674:1: (a0= 'entry' (a1_0= parse_se_mdh_progresside_remes_Edge ) )
            // Remessrc.g:1675:2: a0= 'entry' (a1_0= parse_se_mdh_progresside_remes_Edge )
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_se_mdh_progresside_remes_CompositeEntryPoint1311); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createCompositeEntryPoint();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_26, 45, FEATURE_10));
              	
            }
            // Remessrc.g:1687:2: (a1_0= parse_se_mdh_progresside_remes_Edge )
            // Remessrc.g:1688:3: a1_0= parse_se_mdh_progresside_remes_Edge
            {
            pushFollow(FOLLOW_parse_se_mdh_progresside_remes_Edge_in_parse_se_mdh_progresside_remes_CompositeEntryPoint1329);
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
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 46, FEATURE_4));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 46, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 46, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 46, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 46));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 46));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_23, 46));
              	
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
    // Remessrc.g:1717:1: parse_se_mdh_progresside_remes_Edge returns [se.mdh.progresside.remes.Edge element = null] : a0= 'edge' ( ( (a1= QUOTED_40_41 ) ) )? ( ( (a2= QUOTED_91_93 ) ) )? a3= 'to' (a4= ID ) ;
    public final se.mdh.progresside.remes.Edge parse_se_mdh_progresside_remes_Edge() throws RecognitionException {
        se.mdh.progresside.remes.Edge element =  null;
        int parse_se_mdh_progresside_remes_Edge_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Remessrc.g:1720:1: (a0= 'edge' ( ( (a1= QUOTED_40_41 ) ) )? ( ( (a2= QUOTED_91_93 ) ) )? a3= 'to' (a4= ID ) )
            // Remessrc.g:1721:2: a0= 'edge' ( ( (a1= QUOTED_40_41 ) ) )? ( ( (a2= QUOTED_91_93 ) ) )? a3= 'to' (a4= ID )
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_se_mdh_progresside_remes_Edge1362); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_28, 47));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 47));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 47));
              	
            }
            // Remessrc.g:1735:2: ( ( (a1= QUOTED_40_41 ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==QUOTED_40_41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Remessrc.g:1736:3: ( (a1= QUOTED_40_41 ) )
                    {
                    // Remessrc.g:1736:3: ( (a1= QUOTED_40_41 ) )
                    // Remessrc.g:1737:4: (a1= QUOTED_40_41 )
                    {
                    // Remessrc.g:1737:4: (a1= QUOTED_40_41 )
                    // Remessrc.g:1738:5: a1= QUOTED_40_41
                    {
                    a1=(Token)match(input,QUOTED_40_41,FOLLOW_QUOTED_40_41_in_parse_se_mdh_progresside_remes_Edge1391); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
                      					}
                      					if (a1 != null) {
                      						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_40_41");
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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 48));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 48));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_29, 49));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 49));
              	
            }
            // Remessrc.g:1779:2: ( ( (a2= QUOTED_91_93 ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==QUOTED_91_93) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Remessrc.g:1780:3: ( (a2= QUOTED_91_93 ) )
                    {
                    // Remessrc.g:1780:3: ( (a2= QUOTED_91_93 ) )
                    // Remessrc.g:1781:4: (a2= QUOTED_91_93 )
                    {
                    // Remessrc.g:1781:4: (a2= QUOTED_91_93 )
                    // Remessrc.g:1782:5: a2= QUOTED_91_93
                    {
                    a2=(Token)match(input,QUOTED_91_93,FOLLOW_QUOTED_91_93_in_parse_se_mdh_progresside_remes_Edge1452); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
                      					}
                      					if (a2 != null) {
                      						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 50));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_30, 51));
              	
            }
            a3=(Token)match(input,29,FOLLOW_29_in_parse_se_mdh_progresside_remes_Edge1498); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createEdge();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_31, 52));
              	
            }
            // Remessrc.g:1833:2: (a4= ID )
            // Remessrc.g:1834:3: a4= ID
            {
            a4=(Token)match(input,ID,FOLLOW_ID_in_parse_se_mdh_progresside_remes_Edge1516); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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
    // Remessrc.g:1880:1: parse_se_mdh_progresside_remes_InitEdge returns [se.mdh.progresside.remes.InitEdge element = null] : a0= 'edge' ( ( (a1= QUOTED_91_93 ) ) )? a2= 'to' (a3= ID ) ;
    public final se.mdh.progresside.remes.InitEdge parse_se_mdh_progresside_remes_InitEdge() throws RecognitionException {
        se.mdh.progresside.remes.InitEdge element =  null;
        int parse_se_mdh_progresside_remes_InitEdge_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Remessrc.g:1883:1: (a0= 'edge' ( ( (a1= QUOTED_91_93 ) ) )? a2= 'to' (a3= ID ) )
            // Remessrc.g:1884:2: a0= 'edge' ( ( (a1= QUOTED_91_93 ) ) )? a2= 'to' (a3= ID )
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_se_mdh_progresside_remes_InitEdge1552); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_32, 54));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_33, 54));
              	
            }
            // Remessrc.g:1897:2: ( ( (a1= QUOTED_91_93 ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==QUOTED_91_93) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Remessrc.g:1898:3: ( (a1= QUOTED_91_93 ) )
                    {
                    // Remessrc.g:1898:3: ( (a1= QUOTED_91_93 ) )
                    // Remessrc.g:1899:4: (a1= QUOTED_91_93 )
                    {
                    // Remessrc.g:1899:4: (a1= QUOTED_91_93 )
                    // Remessrc.g:1900:5: a1= QUOTED_91_93
                    {
                    a1=(Token)match(input,QUOTED_91_93,FOLLOW_QUOTED_91_93_in_parse_se_mdh_progresside_remes_InitEdge1581); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
                      					}
                      					if (a1 != null) {
                      						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_33, 55));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_33, 56));
              	
            }
            a2=(Token)match(input,29,FOLLOW_29_in_parse_se_mdh_progresside_remes_InitEdge1627); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createInitEdge();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_34, 57));
              	
            }
            // Remessrc.g:1951:2: (a3= ID )
            // Remessrc.g:1952:3: a3= ID
            {
            a3=(Token)match(input,ID,FOLLOW_ID_in_parse_se_mdh_progresside_remes_InitEdge1645); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 58, FEATURE_4));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 58, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 58, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 58, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 58));
              	
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
    // Remessrc.g:1994:1: parse_se_mdh_progresside_remes_Variable returns [se.mdh.progresside.remes.Variable element = null] : a0= 'var' ( ( (a1= T_GLOBAL ) ) )? ( ( (a2= T_READABLE ) ) )? ( ( (a3= T_WRITEABLE ) ) )? (a4= TYPE ) ( (a5= '[' (a6= INTEGER ) a7= ']' ) )? (a8= ID ) ( (a9= '=' (a10= INTEGER ) ) )? ;
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
            // Remessrc.g:1997:1: (a0= 'var' ( ( (a1= T_GLOBAL ) ) )? ( ( (a2= T_READABLE ) ) )? ( ( (a3= T_WRITEABLE ) ) )? (a4= TYPE ) ( (a5= '[' (a6= INTEGER ) a7= ']' ) )? (a8= ID ) ( (a9= '=' (a10= INTEGER ) ) )? )
            // Remessrc.g:1998:2: a0= 'var' ( ( (a1= T_GLOBAL ) ) )? ( ( (a2= T_READABLE ) ) )? ( ( (a3= T_WRITEABLE ) ) )? (a4= TYPE ) ( (a5= '[' (a6= INTEGER ) a7= ']' ) )? (a8= ID ) ( (a9= '=' (a10= INTEGER ) ) )?
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_se_mdh_progresside_remes_Variable1681); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_35, 59));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_36, 59));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 59));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 59));
              	
            }
            // Remessrc.g:2013:2: ( ( (a1= T_GLOBAL ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==T_GLOBAL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Remessrc.g:2014:3: ( (a1= T_GLOBAL ) )
                    {
                    // Remessrc.g:2014:3: ( (a1= T_GLOBAL ) )
                    // Remessrc.g:2015:4: (a1= T_GLOBAL )
                    {
                    // Remessrc.g:2015:4: (a1= T_GLOBAL )
                    // Remessrc.g:2016:5: a1= T_GLOBAL
                    {
                    a1=(Token)match(input,T_GLOBAL,FOLLOW_T_GLOBAL_in_parse_se_mdh_progresside_remes_Variable1710); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_36, 60));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 60));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 60));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_36, 61));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 61));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 61));
              	
            }
            // Remessrc.g:2059:2: ( ( (a2= T_READABLE ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==T_READABLE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Remessrc.g:2060:3: ( (a2= T_READABLE ) )
                    {
                    // Remessrc.g:2060:3: ( (a2= T_READABLE ) )
                    // Remessrc.g:2061:4: (a2= T_READABLE )
                    {
                    // Remessrc.g:2061:4: (a2= T_READABLE )
                    // Remessrc.g:2062:5: a2= T_READABLE
                    {
                    a2=(Token)match(input,T_READABLE,FOLLOW_T_READABLE_in_parse_se_mdh_progresside_remes_Variable1771); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 62));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 62));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_37, 63));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 63));
              	
            }
            // Remessrc.g:2103:2: ( ( (a3= T_WRITEABLE ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==T_WRITEABLE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Remessrc.g:2104:3: ( (a3= T_WRITEABLE ) )
                    {
                    // Remessrc.g:2104:3: ( (a3= T_WRITEABLE ) )
                    // Remessrc.g:2105:4: (a3= T_WRITEABLE )
                    {
                    // Remessrc.g:2105:4: (a3= T_WRITEABLE )
                    // Remessrc.g:2106:5: a3= T_WRITEABLE
                    {
                    a3=(Token)match(input,T_WRITEABLE,FOLLOW_T_WRITEABLE_in_parse_se_mdh_progresside_remes_Variable1832); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 64));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_38, 65));
              	
            }
            // Remessrc.g:2145:2: (a4= TYPE )
            // Remessrc.g:2146:3: a4= TYPE
            {
            a4=(Token)match(input,TYPE,FOLLOW_TYPE_in_parse_se_mdh_progresside_remes_Variable1882); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_39, 66));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_40, 66));
              	
            }
            // Remessrc.g:2179:2: ( (a5= '[' (a6= INTEGER ) a7= ']' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Remessrc.g:2180:3: (a5= '[' (a6= INTEGER ) a7= ']' )
                    {
                    // Remessrc.g:2180:3: (a5= '[' (a6= INTEGER ) a7= ']' )
                    // Remessrc.g:2181:4: a5= '[' (a6= INTEGER ) a7= ']'
                    {
                    a5=(Token)match(input,31,FOLLOW_31_in_parse_se_mdh_progresside_remes_Variable1912); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_41, 67));
                      			
                    }
                    // Remessrc.g:2193:4: (a6= INTEGER )
                    // Remessrc.g:2194:5: a6= INTEGER
                    {
                    a6=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_se_mdh_progresside_remes_Variable1938); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
                      					}
                      					if (a6 != null) {
                      						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
                      						tokenResolver.setOptions(getOptions());
                      						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStopIndex());
                      						}
                      						java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), resolved);
                      							completedElement(resolved);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_42, 68));
                      			
                    }
                    a7=(Token)match(input,32,FOLLOW_32_in_parse_se_mdh_progresside_remes_Variable1971); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_40, 69));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_40, 70));
              	
            }
            // Remessrc.g:2245:2: (a8= ID )
            // Remessrc.g:2246:3: a8= ID
            {
            a8=(Token)match(input,ID,FOLLOW_ID_in_parse_se_mdh_progresside_remes_Variable2008); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
              			}
              			if (element == null) {
              				element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
              			}
              			if (a8 != null) {
              				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ID");
              				tokenResolver.setOptions(getOptions());
              				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_43, 71));
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
            // Remessrc.g:2289:2: ( (a9= '=' (a10= INTEGER ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Remessrc.g:2290:3: (a9= '=' (a10= INTEGER ) )
                    {
                    // Remessrc.g:2290:3: (a9= '=' (a10= INTEGER ) )
                    // Remessrc.g:2291:4: a9= '=' (a10= INTEGER )
                    {
                    a9=(Token)match(input,33,FOLLOW_33_in_parse_se_mdh_progresside_remes_Variable2038); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_44, 72));
                      			
                    }
                    // Remessrc.g:2303:4: (a10= INTEGER )
                    // Remessrc.g:2304:5: a10= INTEGER
                    {
                    a10=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_se_mdh_progresside_remes_Variable2064); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createVariable();
                      					}
                      					if (a10 != null) {
                      						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
                      						tokenResolver.setOptions(getOptions());
                      						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a10).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), resolved);
                      							completedElement(resolved);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a10, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 73, FEATURE_1));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 73, FEATURE_2));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 73, FEATURE_3));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 73, FEATURE_4));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 73, FEATURE_5));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 73, FEATURE_6));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 73, FEATURE_7));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 73));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 73));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 73, FEATURE_8));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 73));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 74, FEATURE_1));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 74, FEATURE_2));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 74, FEATURE_3));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 74, FEATURE_4));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 74, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 74, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 74, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 74));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 74));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 74, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 74));
              	
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
    // Remessrc.g:2365:1: parse_se_mdh_progresside_remes_Resource returns [se.mdh.progresside.remes.Resource element = null] : a0= 'resource' (a1= TYPE ) (a2= ID ) ( (a3= ':' (a4= QUOTED_40_41 ) ) )? ;
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
            // Remessrc.g:2368:1: (a0= 'resource' (a1= TYPE ) (a2= ID ) ( (a3= ':' (a4= QUOTED_40_41 ) ) )? )
            // Remessrc.g:2369:2: a0= 'resource' (a1= TYPE ) (a2= ID ) ( (a3= ':' (a4= QUOTED_40_41 ) ) )?
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_se_mdh_progresside_remes_Resource2125); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_45, 75));
              	
            }
            // Remessrc.g:2381:2: (a1= TYPE )
            // Remessrc.g:2382:3: a1= TYPE
            {
            a1=(Token)match(input,TYPE,FOLLOW_TYPE_in_parse_se_mdh_progresside_remes_Resource2143); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_46, 76));
              	
            }
            // Remessrc.g:2414:2: (a2= ID )
            // Remessrc.g:2415:3: a2= ID
            {
            a2=(Token)match(input,ID,FOLLOW_ID_in_parse_se_mdh_progresside_remes_Resource2168); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_47, 77));
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
            // Remessrc.g:2458:2: ( (a3= ':' (a4= QUOTED_40_41 ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Remessrc.g:2459:3: (a3= ':' (a4= QUOTED_40_41 ) )
                    {
                    // Remessrc.g:2459:3: (a3= ':' (a4= QUOTED_40_41 ) )
                    // Remessrc.g:2460:4: a3= ':' (a4= QUOTED_40_41 )
                    {
                    a3=(Token)match(input,35,FOLLOW_35_in_parse_se_mdh_progresside_remes_Resource2198); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_48, 78));
                      			
                    }
                    // Remessrc.g:2472:4: (a4= QUOTED_40_41 )
                    // Remessrc.g:2473:5: a4= QUOTED_40_41
                    {
                    a4=(Token)match(input,QUOTED_40_41,FOLLOW_QUOTED_40_41_in_parse_se_mdh_progresside_remes_Resource2224); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createResource();
                      					}
                      					if (a4 != null) {
                      						hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_40_41");
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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 79, FEATURE_1));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 79, FEATURE_2));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 79, FEATURE_3));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 79, FEATURE_4));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 79, FEATURE_5));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 79, FEATURE_6));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 79, FEATURE_7));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 79));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 79));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 79, FEATURE_8));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 79));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 80, FEATURE_1));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 80, FEATURE_2));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 80, FEATURE_3));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 80, FEATURE_4));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 80, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 80, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 80, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 80));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 80));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 80, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 80));
              	
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
    // Remessrc.g:2534:1: parse_se_mdh_progresside_remes_Constant returns [se.mdh.progresside.remes.Constant element = null] : a0= 'const' ( ( (a1= T_GLOBAL ) ) )? (a2= TYPE ) (a3= ID ) ( (a4= '=' (a5= INTEGER ) ) )? ;
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
            // Remessrc.g:2537:1: (a0= 'const' ( ( (a1= T_GLOBAL ) ) )? (a2= TYPE ) (a3= ID ) ( (a4= '=' (a5= INTEGER ) ) )? )
            // Remessrc.g:2538:2: a0= 'const' ( ( (a1= T_GLOBAL ) ) )? (a2= TYPE ) (a3= ID ) ( (a4= '=' (a5= INTEGER ) ) )?
            {
            a0=(Token)match(input,36,FOLLOW_36_in_parse_se_mdh_progresside_remes_Constant2285); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_49, 81));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_50, 81));
              	
            }
            // Remessrc.g:2551:2: ( ( (a1= T_GLOBAL ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==T_GLOBAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Remessrc.g:2552:3: ( (a1= T_GLOBAL ) )
                    {
                    // Remessrc.g:2552:3: ( (a1= T_GLOBAL ) )
                    // Remessrc.g:2553:4: (a1= T_GLOBAL )
                    {
                    // Remessrc.g:2553:4: (a1= T_GLOBAL )
                    // Remessrc.g:2554:5: a1= T_GLOBAL
                    {
                    a1=(Token)match(input,T_GLOBAL,FOLLOW_T_GLOBAL_in_parse_se_mdh_progresside_remes_Constant2314); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_50, 82));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_50, 83));
              	
            }
            // Remessrc.g:2593:2: (a2= TYPE )
            // Remessrc.g:2594:3: a2= TYPE
            {
            a2=(Token)match(input,TYPE,FOLLOW_TYPE_in_parse_se_mdh_progresside_remes_Constant2364); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_51, 84));
              	
            }
            // Remessrc.g:2626:2: (a3= ID )
            // Remessrc.g:2627:3: a3= ID
            {
            a3=(Token)match(input,ID,FOLLOW_ID_in_parse_se_mdh_progresside_remes_Constant2389); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_52, 85));
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
            // Remessrc.g:2670:2: ( (a4= '=' (a5= INTEGER ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Remessrc.g:2671:3: (a4= '=' (a5= INTEGER ) )
                    {
                    // Remessrc.g:2671:3: (a4= '=' (a5= INTEGER ) )
                    // Remessrc.g:2672:4: a4= '=' (a5= INTEGER )
                    {
                    a4=(Token)match(input,33,FOLLOW_33_in_parse_se_mdh_progresside_remes_Constant2419); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = se.mdh.progresside.remes.RemesFactory.eINSTANCE.createConstant();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_53, 86));
                      			
                    }
                    // Remessrc.g:2684:4: (a5= INTEGER )
                    // Remessrc.g:2685:5: a5= INTEGER
                    {
                    a5=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_se_mdh_progresside_remes_Constant2445); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 87, FEATURE_1));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 87, FEATURE_2));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 87, FEATURE_3));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 87, FEATURE_4));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 87, FEATURE_5));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 87, FEATURE_6));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 87, FEATURE_7));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 87));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 87));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 87, FEATURE_8));
                      				addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 87));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_7, 88, FEATURE_1));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_8, 88, FEATURE_2));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_9, 88, FEATURE_3));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_3, 88, FEATURE_4));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_10, 88, FEATURE_5));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_11, 88, FEATURE_6));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_12, 88, FEATURE_7));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_13, 88));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_17, 88));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_18, 88, FEATURE_8));
              		addExpectedElement(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal(TERMINAL_19, 88));
              	
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
    // Remessrc.g:2746:1: parse_se_mdh_progresside_remes_Mode returns [se.mdh.progresside.remes.Mode element = null] : (c0= parse_se_mdh_progresside_remes_CompositeMode | c1= parse_se_mdh_progresside_remes_SubMode );
    public final se.mdh.progresside.remes.Mode parse_se_mdh_progresside_remes_Mode() throws RecognitionException {
        se.mdh.progresside.remes.Mode element =  null;
        int parse_se_mdh_progresside_remes_Mode_StartIndex = input.index();
        se.mdh.progresside.remes.CompositeMode c0 = null;

        se.mdh.progresside.remes.SubMode c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Remessrc.g:2747:1: (c0= parse_se_mdh_progresside_remes_CompositeMode | c1= parse_se_mdh_progresside_remes_SubMode )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            else if ( (LA24_0==22) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // Remessrc.g:2748:2: c0= parse_se_mdh_progresside_remes_CompositeMode
                    {
                    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_CompositeMode_in_parse_se_mdh_progresside_remes_Mode2502);
                    c0=parse_se_mdh_progresside_remes_CompositeMode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Remessrc.g:2749:4: c1= parse_se_mdh_progresside_remes_SubMode
                    {
                    pushFollow(FOLLOW_parse_se_mdh_progresside_remes_SubMode_in_parse_se_mdh_progresside_remes_Mode2512);
                    c1=parse_se_mdh_progresside_remes_SubMode();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_RemesDiagram_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_se_mdh_progresside_remes_RemesDiagram112 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_se_mdh_progresside_remes_RemesDiagram126 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Mode_in_parse_se_mdh_progresside_remes_RemesDiagram149 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_parse_se_mdh_progresside_remes_RemesDiagram175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_se_mdh_progresside_remes_CompositeMode204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parse_se_mdh_progresside_remes_CompositeMode222 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_se_mdh_progresside_remes_CompositeMode243 = new BitSet(new long[]{0x000000144B700000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Variable_in_parse_se_mdh_progresside_remes_CompositeMode272 = new BitSet(new long[]{0x000000144B700000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Resource_in_parse_se_mdh_progresside_remes_CompositeMode314 = new BitSet(new long[]{0x000000144B700000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Constant_in_parse_se_mdh_progresside_remes_CompositeMode356 = new BitSet(new long[]{0x000000144B700000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_SubMode_in_parse_se_mdh_progresside_remes_CompositeMode412 = new BitSet(new long[]{0x000000000B700000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_ConditionalConnector_in_parse_se_mdh_progresside_remes_CompositeMode454 = new BitSet(new long[]{0x000000000B700000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_InitPoint_in_parse_se_mdh_progresside_remes_CompositeMode496 = new BitSet(new long[]{0x000000000B700000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_CompositeEntryPoint_in_parse_se_mdh_progresside_remes_CompositeMode538 = new BitSet(new long[]{0x000000000B700000L});
    public static final BitSet FOLLOW_20_in_parse_se_mdh_progresside_remes_CompositeMode579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_se_mdh_progresside_remes_SubMode608 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_T_URGENT_in_parse_se_mdh_progresside_remes_SubMode637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parse_se_mdh_progresside_remes_SubMode687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_se_mdh_progresside_remes_SubMode708 = new BitSet(new long[]{0x000000144FF00000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Variable_in_parse_se_mdh_progresside_remes_SubMode737 = new BitSet(new long[]{0x000000144FF00000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Resource_in_parse_se_mdh_progresside_remes_SubMode779 = new BitSet(new long[]{0x000000144FF00000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Constant_in_parse_se_mdh_progresside_remes_SubMode821 = new BitSet(new long[]{0x000000144FF00000L});
    public static final BitSet FOLLOW_23_in_parse_se_mdh_progresside_remes_SubMode871 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_40_41_in_parse_se_mdh_progresside_remes_SubMode897 = new BitSet(new long[]{0x000000000F700000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_ExitPoint_in_parse_se_mdh_progresside_remes_SubMode958 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_se_mdh_progresside_remes_SubMode999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_se_mdh_progresside_remes_ConditionalConnector1028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parse_se_mdh_progresside_remes_ConditionalConnector1046 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_se_mdh_progresside_remes_ConditionalConnector1067 = new BitSet(new long[]{0x000000000F600000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_ExitPoint_in_parse_se_mdh_progresside_remes_ConditionalConnector1085 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_se_mdh_progresside_remes_ConditionalConnector1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_se_mdh_progresside_remes_InitPoint1132 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_InitEdge_in_parse_se_mdh_progresside_remes_InitPoint1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_se_mdh_progresside_remes_ExitPoint1183 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_se_mdh_progresside_remes_ExitPoint1197 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Edge_in_parse_se_mdh_progresside_remes_ExitPoint1226 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_parse_se_mdh_progresside_remes_ExitPoint1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_CompositeEntryPoint_in_parse_se_mdh_progresside_remes_ExitPoint1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_se_mdh_progresside_remes_CompositeEntryPoint1311 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_Edge_in_parse_se_mdh_progresside_remes_CompositeEntryPoint1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_se_mdh_progresside_remes_Edge1362 = new BitSet(new long[]{0x00000000200000C0L});
    public static final BitSet FOLLOW_QUOTED_40_41_in_parse_se_mdh_progresside_remes_Edge1391 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_QUOTED_91_93_in_parse_se_mdh_progresside_remes_Edge1452 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_se_mdh_progresside_remes_Edge1498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parse_se_mdh_progresside_remes_Edge1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_se_mdh_progresside_remes_InitEdge1552 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_QUOTED_91_93_in_parse_se_mdh_progresside_remes_InitEdge1581 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_se_mdh_progresside_remes_InitEdge1627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parse_se_mdh_progresside_remes_InitEdge1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_se_mdh_progresside_remes_Variable1681 = new BitSet(new long[]{0x0000000000000F00L});
    public static final BitSet FOLLOW_T_GLOBAL_in_parse_se_mdh_progresside_remes_Variable1710 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_T_READABLE_in_parse_se_mdh_progresside_remes_Variable1771 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_T_WRITEABLE_in_parse_se_mdh_progresside_remes_Variable1832 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TYPE_in_parse_se_mdh_progresside_remes_Variable1882 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_parse_se_mdh_progresside_remes_Variable1912 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_parse_se_mdh_progresside_remes_Variable1938 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_se_mdh_progresside_remes_Variable1971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parse_se_mdh_progresside_remes_Variable2008 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_parse_se_mdh_progresside_remes_Variable2038 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_parse_se_mdh_progresside_remes_Variable2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_se_mdh_progresside_remes_Resource2125 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TYPE_in_parse_se_mdh_progresside_remes_Resource2143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parse_se_mdh_progresside_remes_Resource2168 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_parse_se_mdh_progresside_remes_Resource2198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_40_41_in_parse_se_mdh_progresside_remes_Resource2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_parse_se_mdh_progresside_remes_Constant2285 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_T_GLOBAL_in_parse_se_mdh_progresside_remes_Constant2314 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TYPE_in_parse_se_mdh_progresside_remes_Constant2364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parse_se_mdh_progresside_remes_Constant2389 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_parse_se_mdh_progresside_remes_Constant2419 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_parse_se_mdh_progresside_remes_Constant2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_CompositeMode_in_parse_se_mdh_progresside_remes_Mode2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_se_mdh_progresside_remes_SubMode_in_parse_se_mdh_progresside_remes_Mode2512 = new BitSet(new long[]{0x0000000000000002L});

}