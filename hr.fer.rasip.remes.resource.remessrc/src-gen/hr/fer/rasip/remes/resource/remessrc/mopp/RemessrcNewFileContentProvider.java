package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcNewFileContentProvider {
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcMetaInformation getMetaInformation() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation();
	}
	
	public java.lang.String getNewFileContent(java.lang.String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getRemesDiagram(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new hr.fer.rasip.remes.resource.remessrc.util.RemessrcMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		hr.fer.rasip.remes.resource.remessrc.IRemessrcTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPrinter(outputStream, new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource());
	}
	
}
