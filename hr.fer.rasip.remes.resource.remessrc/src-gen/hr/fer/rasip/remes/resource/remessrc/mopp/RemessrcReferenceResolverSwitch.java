/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcReferenceResolverSwitch implements hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolverSwitch {
	
	protected hr.fer.rasip.remes.resource.remessrc.analysis.EdgeConnectToReferenceResolver edgeConnectToReferenceResolver = new hr.fer.rasip.remes.resource.remessrc.analysis.EdgeConnectToReferenceResolver();
	protected hr.fer.rasip.remes.resource.remessrc.analysis.InitEdgeConnectToReferenceResolver initEdgeConnectToReferenceResolver = new hr.fer.rasip.remes.resource.remessrc.analysis.InitEdgeConnectToReferenceResolver();
	
	public hr.fer.rasip.remes.resource.remessrc.analysis.EdgeConnectToReferenceResolver getEdgeConnectToReferenceResolver() {
		return edgeConnectToReferenceResolver;
	}
	
	public hr.fer.rasip.remes.resource.remessrc.analysis.InitEdgeConnectToReferenceResolver getInitEdgeConnectToReferenceResolver() {
		return initEdgeConnectToReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		edgeConnectToReferenceResolver.setOptions(options);
		initEdgeConnectToReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(java.lang.String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().isInstance(container)) {
			RemessrcFuzzyResolveResult<se.mdh.progresside.remes.EntryPoint> frr = new RemessrcFuzzyResolveResult<se.mdh.progresside.remes.EntryPoint>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("connectTo")) {
				edgeConnectToReferenceResolver.resolve(identifier, (se.mdh.progresside.remes.Edge) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge().isInstance(container)) {
			RemessrcFuzzyResolveResult<se.mdh.progresside.remes.EntryPoint> frr = new RemessrcFuzzyResolveResult<se.mdh.progresside.remes.EntryPoint>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("connectTo")) {
				initEdgeConnectToReferenceResolver.resolve(identifier, (se.mdh.progresside.remes.InitEdge) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
}
