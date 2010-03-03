/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcPrinter implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTextPrinter {
	
	protected final static java.lang.String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	protected hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolverFactory tokenResolverFactory = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/** Holds the resource that is associated with this printer. may be null if the printer is used stand alone. */
	private hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource;
	private java.util.Map<?, ?> options;
	
	public RemessrcPrinter(java.io.OutputStream outputStream, hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected static int matchCount(java.util.Map<java.lang.String, java.lang.Integer> featureCounter, java.util.Collection<java.lang.String> needed){
		int pos = 0;
		int neg = 0;
		
		for(java.lang.String featureName:featureCounter.keySet()){
			if(needed.contains(featureName)){
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, java.lang.String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof se.mdh.progresside.remes.RemesDiagram) {
			print_se_mdh_progresside_remes_RemesDiagram((se.mdh.progresside.remes.RemesDiagram) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.CompositeMode) {
			print_se_mdh_progresside_remes_CompositeMode((se.mdh.progresside.remes.CompositeMode) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.SubMode) {
			print_se_mdh_progresside_remes_SubMode((se.mdh.progresside.remes.SubMode) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.ConditionalConnector) {
			print_se_mdh_progresside_remes_ConditionalConnector((se.mdh.progresside.remes.ConditionalConnector) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.InitPoint) {
			print_se_mdh_progresside_remes_InitPoint((se.mdh.progresside.remes.InitPoint) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.CompositeEntryPoint) {
			print_se_mdh_progresside_remes_CompositeEntryPoint((se.mdh.progresside.remes.CompositeEntryPoint) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.Edge) {
			print_se_mdh_progresside_remes_Edge((se.mdh.progresside.remes.Edge) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.InitEdge) {
			print_se_mdh_progresside_remes_InitEdge((se.mdh.progresside.remes.InitEdge) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.Variable) {
			print_se_mdh_progresside_remes_Variable((se.mdh.progresside.remes.Variable) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.Resource) {
			print_se_mdh_progresside_remes_Resource((se.mdh.progresside.remes.Resource) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.Constant) {
			print_se_mdh_progresside_remes_Constant((se.mdh.progresside.remes.Constant) element, globaltab, out);
			return;
		}
		if (element instanceof se.mdh.progresside.remes.ExitPoint) {
			print_se_mdh_progresside_remes_ExitPoint((se.mdh.progresside.remes.ExitPoint) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The cs printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcReferenceResolverSwitch getReferenceResolverSwitch() {
		return (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcReferenceResolverSwitch) new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final java.lang.String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcProblem(errorMessage, hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource getResource() {
		return resource;
	}
	
	/** Calls {@link #doPrint(EObject, String)} and writes the result to the underlying output stream. */
	public void print(org.eclipse.emf.ecore.EObject element)  {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_se_mdh_progresside_remes_RemesDiagram(se.mdh.progresside.remes.RemesDiagram element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.REMES_DIAGRAM__MODES));
		printCountingMap.put("modes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("remes");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("modes");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.REMES_DIAGRAM__MODES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("modes", 0);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_se_mdh_progresside_remes_CompositeMode(se.mdh.progresside.remes.CompositeMode element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(12);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__ENTRY_POINT));
		printCountingMap.put("entryPoint", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__EXIT_POINT));
		printCountingMap.put("exitPoint", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__INITIALIZATION));
		printCountingMap.put("initialization", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__VARIABLES));
		printCountingMap.put("variables", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__RESOURCES));
		printCountingMap.put("resources", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__CONSTANTS));
		printCountingMap.put("constants", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__SUB_MODES));
		printCountingMap.put("subModes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS));
		printCountingMap.put("conditionalConnectors", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__INIT_POINT));
		printCountingMap.put("initPoint", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT));
		printCountingMap.put("compositeEntryPoint", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__COMPOSITE_EXIT_POINT));
		printCountingMap.put("compositeExitPoint", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("composite");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("ID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_se_mdh_progresside_remes_CompositeMode_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_se_mdh_progresside_remes_CompositeMode_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	public void print_se_mdh_progresside_remes_CompositeMode_0(se.mdh.progresside.remes.CompositeMode element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"variables"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"resources"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"constants"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("resources");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__RESOURCES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("resources", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("constants");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__CONSTANTS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("constants", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("variables");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__VARIABLES));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("variables", count - 1);
			}
		}
	}
	public void print_se_mdh_progresside_remes_CompositeMode_1(se.mdh.progresside.remes.CompositeMode element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"subModes"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"conditionalConnectors"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"initPoint"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"compositeEntryPoint"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("conditionalConnectors");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("conditionalConnectors", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("initPoint");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__INIT_POINT));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("initPoint", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("compositeEntryPoint");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("compositeEntryPoint", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("subModes");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__SUB_MODES));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("subModes", count - 1);
			}
		}
	}
	
	public void print_se_mdh_progresside_remes_SubMode(se.mdh.progresside.remes.SubMode element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(11);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__ENTRY_POINT));
		printCountingMap.put("entryPoint", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__EXIT_POINT));
		printCountingMap.put("exitPoint", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INITIALIZATION));
		printCountingMap.put("initialization", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__VARIABLES));
		printCountingMap.put("variables", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__RESOURCES));
		printCountingMap.put("resources", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__CONSTANTS));
		printCountingMap.put("constants", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT));
		printCountingMap.put("invariant", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT));
		printCountingMap.put("isUrgent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__PARENT));
		printCountingMap.put("parent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__PARSED_INVARIANT));
		printCountingMap.put("parsedInvariant", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("atomic");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_SubMode_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("ID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_se_mdh_progresside_remes_SubMode_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_SubMode_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_SubMode_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	public void print_se_mdh_progresside_remes_SubMode_0(se.mdh.progresside.remes.SubMode element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("isUrgent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_URGENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT), element));
				out.print(" ");
			}
			printCountingMap.put("isUrgent", count - 1);
		}
	}
	public void print_se_mdh_progresside_remes_SubMode_1(se.mdh.progresside.remes.SubMode element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"variables"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"resources"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"constants"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("resources");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__RESOURCES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("resources", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("constants");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__CONSTANTS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("constants", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("variables");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__VARIABLES));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("variables", count - 1);
			}
		}
	}
	public void print_se_mdh_progresside_remes_SubMode_2(se.mdh.progresside.remes.SubMode element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("invariant");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("invariant");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_40_41");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT), element));
				out.print(" ");
			}
			printCountingMap.put("invariant", count - 1);
		}
	}
	public void print_se_mdh_progresside_remes_SubMode_3(se.mdh.progresside.remes.SubMode element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exitPoint");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__EXIT_POINT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exitPoint", count - 1);
		}
	}
	
	public void print_se_mdh_progresside_remes_ConditionalConnector(se.mdh.progresside.remes.ConditionalConnector element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__ENTRY_POINT));
		printCountingMap.put("entryPoint", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT));
		printCountingMap.put("exitPoint", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__PARENT));
		printCountingMap.put("parent", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("conditional");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("ID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exitPoint");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exitPoint", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_se_mdh_progresside_remes_InitPoint(se.mdh.progresside.remes.InitPoint element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_POINT__INIT_EDGE));
		printCountingMap.put("initEdge", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_POINT__CONTAINER));
		printCountingMap.put("container", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("init");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initEdge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_POINT__INIT_EDGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initEdge", count - 1);
		}
	}
	
	public void print_se_mdh_progresside_remes_ExitPoint(se.mdh.progresside.remes.ExitPoint element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EXIT_POINT__EXIT_EDGES));
		printCountingMap.put("exitEdges", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EXIT_POINT__CONTAINER));
		printCountingMap.put("container", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("edges");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_se_mdh_progresside_remes_ExitPoint_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	public void print_se_mdh_progresside_remes_ExitPoint_0(se.mdh.progresside.remes.ExitPoint element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exitEdges");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EXIT_POINT__EXIT_EDGES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exitEdges", count - 1);
		}
	}
	
	public void print_se_mdh_progresside_remes_CompositeEntryPoint(se.mdh.progresside.remes.CompositeEntryPoint element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_ENTRY_POINT__EXIT_EDGES));
		printCountingMap.put("exitEdges", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_ENTRY_POINT__CONTAINER));
		printCountingMap.put("container", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_ENTRY_POINT__COMPOSITE));
		printCountingMap.put("composite", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("entry");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exitEdges");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_ENTRY_POINT__EXIT_EDGES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exitEdges", count - 1);
		}
	}
	
	public void print_se_mdh_progresside_remes_Edge(se.mdh.progresside.remes.Edge element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD));
		printCountingMap.put("actionGuard", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY));
		printCountingMap.put("actionBody", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__PARSED_ACTION_GUARD));
		printCountingMap.put("parsedActionGuard", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_FROM));
		printCountingMap.put("connectFrom", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO));
		printCountingMap.put("connectTo", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__PARSED_ACTION_BODY));
		printCountingMap.put("parsedActionBody", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("edge");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Edge_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Edge_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("connectTo");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("ID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEdgeConnectToReferenceResolver().deResolve((se.mdh.progresside.remes.EntryPoint) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO)), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO), element));
				out.print(" ");
			}
			printCountingMap.put("connectTo", count - 1);
		}
	}
	public void print_se_mdh_progresside_remes_Edge_0(se.mdh.progresside.remes.Edge element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("actionGuard");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_40_41");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD), element));
				out.print(" ");
			}
			printCountingMap.put("actionGuard", count - 1);
		}
	}
	public void print_se_mdh_progresside_remes_Edge_1(se.mdh.progresside.remes.Edge element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("actionBody");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY), element));
				out.print(" ");
			}
			printCountingMap.put("actionBody", count - 1);
		}
	}
	
	public void print_se_mdh_progresside_remes_InitEdge(se.mdh.progresside.remes.InitEdge element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION));
		printCountingMap.put("initialization", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_FROM));
		printCountingMap.put("connectFrom", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO));
		printCountingMap.put("connectTo", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__PARSED_INITIALIZATION));
		printCountingMap.put("parsedInitialization", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("edge");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_InitEdge_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("connectTo");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("ID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInitEdgeConnectToReferenceResolver().deResolve((se.mdh.progresside.remes.EntryPoint) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO)), element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO), element));
				out.print(" ");
			}
			printCountingMap.put("connectTo", count - 1);
		}
	}
	public void print_se_mdh_progresside_remes_InitEdge_0(se.mdh.progresside.remes.InitEdge element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("initialization");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION), element));
				out.print(" ");
			}
			printCountingMap.put("initialization", count - 1);
		}
	}
	
	public void print_se_mdh_progresside_remes_Variable(se.mdh.progresside.remes.Variable element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(8);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE));
		printCountingMap.put("vectorSize", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL));
		printCountingMap.put("global", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__SCOPE));
		printCountingMap.put("scope", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE));
		printCountingMap.put("readable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE));
		printCountingMap.put("writable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("var");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Variable_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Variable_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Variable_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("TYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Variable_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("ID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Variable_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_se_mdh_progresside_remes_Variable_0(se.mdh.progresside.remes.Variable element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("global");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_GLOBAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL), element));
				out.print(" ");
			}
			printCountingMap.put("global", count - 1);
		}
	}
	public void print_se_mdh_progresside_remes_Variable_1(se.mdh.progresside.remes.Variable element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("readable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_READABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE), element));
				out.print(" ");
			}
			printCountingMap.put("readable", count - 1);
		}
	}
	public void print_se_mdh_progresside_remes_Variable_2(se.mdh.progresside.remes.Variable element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("writable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_WRITEABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE), element));
				out.print(" ");
			}
			printCountingMap.put("writable", count - 1);
		}
	}
	public void print_se_mdh_progresside_remes_Variable_3(se.mdh.progresside.remes.Variable element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("vectorSize");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE), element));
				out.print(" ");
			}
			printCountingMap.put("vectorSize", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
	}
	public void print_se_mdh_progresside_remes_Variable_4(se.mdh.progresside.remes.Variable element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	public void print_se_mdh_progresside_remes_Resource(se.mdh.progresside.remes.Resource element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION));
		printCountingMap.put("expression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__SCOPE));
		printCountingMap.put("scope", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__PARSED_EXPRESSION));
		printCountingMap.put("parsedExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("resource");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("TYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("ID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Resource_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_se_mdh_progresside_remes_Resource_0(se.mdh.progresside.remes.Resource element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("expression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_40_41");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION), element));
				out.print(" ");
			}
			printCountingMap.put("expression", count - 1);
		}
	}
	
	public void print_se_mdh_progresside_remes_Constant(se.mdh.progresside.remes.Constant element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL));
		printCountingMap.put("global", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__SCOPE));
		printCountingMap.put("scope", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("const");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Constant_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("TYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("ID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_se_mdh_progresside_remes_Constant_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_se_mdh_progresside_remes_Constant_0(se.mdh.progresside.remes.Constant element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("global");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_GLOBAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL), element));
				out.print(" ");
			}
			printCountingMap.put("global", count - 1);
		}
	}
	public void print_se_mdh_progresside_remes_Constant_1(se.mdh.progresside.remes.Constant element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE));
			if (o != null) {
				hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
}
