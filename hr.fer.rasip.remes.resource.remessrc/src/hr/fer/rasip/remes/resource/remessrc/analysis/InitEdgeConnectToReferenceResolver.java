/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.analysis;

import org.eclipse.emf.ecore.EObject;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.ControlPath;
import se.mdh.progresside.remes.impl.RemesFactoryImpl;

public class InitEdgeConnectToReferenceResolver implements hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolver<se.mdh.progresside.remes.InitEdge, se.mdh.progresside.remes.EntryPoint> {
	
	private hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcDefaultResolverDelegate<se.mdh.progresside.remes.InitEdge, se.mdh.progresside.remes.EntryPoint> delegate = new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcDefaultResolverDelegate<se.mdh.progresside.remes.InitEdge, se.mdh.progresside.remes.EntryPoint>();
	
	public java.lang.String deResolve(se.mdh.progresside.remes.EntryPoint element, se.mdh.progresside.remes.InitEdge container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend on any option
	}

	public void resolve(java.lang.String identifier, se.mdh.progresside.remes.InitEdge container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolveResult<se.mdh.progresside.remes.EntryPoint> result) {
			try {
				org.eclipse.emf.ecore.EClass type = reference.getEReferenceType();
				if(!type.getInstanceClassName().endsWith("EntryPoint")) {
					delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
					return;
				}
				
				org.eclipse.emf.ecore.EObject root = hr.fer.rasip.remes.resource.remessrc.util.RemessrcEObjectUtil.findRootContainer(container);
				// first check whether the root element matches
				boolean continueSearch = checkElement(root, container, identifier, resolveFuzzy, result);
				if (!continueSearch) {
					return;
				}
				// then check the contents
				for (java.util.Iterator<org.eclipse.emf.ecore.EObject> iterator = root.eAllContents(); iterator.hasNext(); ) {
					org.eclipse.emf.ecore.EObject element = iterator.next();
					continueSearch = checkElement(element, container, identifier, resolveFuzzy, result);
					if (!continueSearch) {
						return;
					}
				}
			} catch (java.lang.RuntimeException rte) {
				// catch exception here to prevent EMF proxy resolution from swallowing it
				rte.printStackTrace();
	//			delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
			}
		}

	private boolean checkElement(EObject element, se.mdh.progresside.remes.InitEdge container, String identifier, boolean resolveFuzzy, hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolveResult<se.mdh.progresside.remes.EntryPoint> result) {
			if (element.eIsProxy()) {
				return true;
			}
	
			// Entry and exit points belong to ControlPaths
			if(!(element instanceof ControlPath)) {
				return true;
			}
					
			ControlPath ctrl = (ControlPath) element;
			
			if(ctrl.getName() == null 
			|| ctrl.getName().isEmpty()) {
				return true;
			}
			
			if(ctrl.getName().equals(identifier)) {
				if(ctrl instanceof CompositeMode) {
					// Check to see if we're in a submode of the referenced compositemode
					ControlPath granny = (ControlPath) container.eContainer().eContainer(); // Edge->ExitPoint->ControlPath 
					if(granny.eContainer() == ctrl) {
						CompositeMode cm = (CompositeMode) ctrl;
						//FIXME ugly hack
						if(cm.getCompositeExitPoint() == null) {
							cm.setCompositeExitPoint(RemesFactoryImpl.eINSTANCE.createCompositeExitPoint());
						}
						result.addMapping(identifier, cm.getCompositeExitPoint());
						return false;
					}
				}
				
				if(ctrl.getEntryPoint() == null) {
					//FIXME ugly hack
					ctrl.setEntryPoint(RemesFactoryImpl.eINSTANCE.createEntryPoint());
				}
				result.addMapping(identifier, ctrl.getEntryPoint());
				return false;
			}
	/*		if (!resolveFuzzy) {
				return false;
			}
	*/		return true;
		}
	
}
