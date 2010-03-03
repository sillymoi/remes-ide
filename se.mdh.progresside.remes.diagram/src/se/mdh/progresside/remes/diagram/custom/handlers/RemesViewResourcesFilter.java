package se.mdh.progresside.remes.diagram.custom.handlers;

import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EdgeActionGuardEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitEdgeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitialization2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitializationEditPart;

public class RemesViewResourcesFilter implements IRemesViewsFilter {

	public boolean isVisible(Object obj) {
		if (obj instanceof CompositeModeInitializationEditPart
				|| obj instanceof SubModeInitialization2EditPart
				|| obj instanceof SubModeInitializationEditPart
				|| obj instanceof EdgeActionGuardEditPart
				|| obj instanceof InitEdgeInitializationEditPart) {
			return false;
		}
		return true;
	}

}
