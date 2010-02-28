package se.mdh.progresside.remes.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeEntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeExitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConditionalConnectorEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubMode2EditPart;
import se.mdh.progresside.remes.diagram.part.RemesDiagramUpdater;
import se.mdh.progresside.remes.diagram.part.RemesNodeDescriptor;
import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;

/**
 * @generated
 */
public class CompositeModeCompositeModeCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = RemesDiagramUpdater
				.getCompositeModeCompositeModeCompartment_7022SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((RemesNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = RemesVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case SubMode2EditPart.VISUAL_ID:
		case ConditionalConnectorEditPart.VISUAL_ID:
		case CompositeEntryPointEditPart.VISUAL_ID:
		case CompositeExitPointEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getCompositeMode_SubModes());
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getCompositeMode_ConditionalConnectors());
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getCompositeMode_CompositeEntryPoint());
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getCompositeMode_CompositeExitPoint());
		}
		return myFeaturesToSynchronize;
	}

}
