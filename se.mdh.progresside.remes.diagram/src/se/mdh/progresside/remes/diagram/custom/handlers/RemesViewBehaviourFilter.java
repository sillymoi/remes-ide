package se.mdh.progresside.remes.diagram.custom.handlers;

import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeConstantsCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeResourcesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeVariablesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitialization2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInvariant2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInvariantEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeIsUrgent2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeIsUrgentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeConstantsCompartment2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeConstantsCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeResourcesCompartment2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeResourcesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeVariablesCompartment2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeVariablesCompartmentEditPart;

public class RemesViewBehaviourFilter implements IRemesViewsFilter {

	public boolean isVisible(Object obj) {
		if (obj instanceof CompositeModeInitializationEditPart ||
			obj instanceof SubModeInitialization2EditPart ||
			obj instanceof SubModeInitializationEditPart ||
			obj instanceof SubModeInvariant2EditPart ||
			obj instanceof SubModeInvariantEditPart ||
			obj instanceof SubModeIsUrgent2EditPart ||
			obj instanceof SubModeIsUrgentEditPart ||
			obj instanceof CompositeModeCompositeModeConstantsCompartmentEditPart ||
			obj instanceof CompositeModeCompositeModeVariablesCompartmentEditPart ||
			obj instanceof CompositeModeCompositeModeResourcesCompartmentEditPart ||
			obj instanceof SubModeSubModeResourcesCompartment2EditPart ||
			obj instanceof SubModeSubModeResourcesCompartmentEditPart ||
			obj instanceof SubModeSubModeConstantsCompartment2EditPart ||
			obj instanceof SubModeSubModeConstantsCompartmentEditPart ||
			obj instanceof SubModeSubModeVariablesCompartment2EditPart ||
			obj instanceof SubModeSubModeVariablesCompartmentEditPart){
			return false;
		}
		return true;
	}

}
