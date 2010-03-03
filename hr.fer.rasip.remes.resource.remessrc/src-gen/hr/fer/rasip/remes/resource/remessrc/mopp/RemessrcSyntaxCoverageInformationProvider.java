/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getRemesDiagram(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitPoint(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getExitPoint(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeEntryPoint(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(),
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			se.mdh.progresside.remes.RemesPackage.eINSTANCE.getRemesDiagram(),
		};
	}
	
}
