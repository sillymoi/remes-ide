package se.mdh.progresside.remes.diagram.custom.handlers;

import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeVariablesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EdgeActionGuardEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitEdgeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitialization2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeResourcesCompartment2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeResourcesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeVariablesCompartment2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeVariablesCompartmentEditPart;

public class RemesViewTimingFilter implements IRemesViewsFilter {

	public boolean isVisible(Object obj) {
		if (obj instanceof CompositeModeInitializationEditPart
				|| obj instanceof SubModeInitialization2EditPart
				|| obj instanceof SubModeInitializationEditPart
				|| obj instanceof CompositeModeCompositeModeVariablesCompartmentEditPart
				|| obj instanceof SubModeSubModeResourcesCompartment2EditPart
				|| obj instanceof SubModeSubModeResourcesCompartmentEditPart
				|| obj instanceof SubModeSubModeVariablesCompartment2EditPart
				|| obj instanceof SubModeSubModeVariablesCompartmentEditPart
				|| obj instanceof EdgeActionGuardEditPart
				|| obj instanceof InitEdgeInitializationEditPart) {
			return false;
		}
		return true;
	}

}
