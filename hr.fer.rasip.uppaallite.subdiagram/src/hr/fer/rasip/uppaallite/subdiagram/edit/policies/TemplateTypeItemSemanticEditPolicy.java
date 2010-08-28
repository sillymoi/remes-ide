package hr.fer.rasip.uppaallite.subdiagram.edit.policies;

import hr.fer.rasip.uppaallite.subdiagram.edit.commands.LocationType2CreateCommand;
import hr.fer.rasip.uppaallite.subdiagram.edit.commands.LocationType3CreateCommand;
import hr.fer.rasip.uppaallite.subdiagram.edit.commands.LocationType4CreateCommand;
import hr.fer.rasip.uppaallite.subdiagram.edit.commands.LocationType5CreateCommand;
import hr.fer.rasip.uppaallite.subdiagram.edit.commands.LocationType6CreateCommand;
import hr.fer.rasip.uppaallite.subdiagram.edit.commands.LocationTypeCreateCommand;
import hr.fer.rasip.uppaallite.subdiagram.providers.UppaalliteElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class TemplateTypeItemSemanticEditPolicy extends
		UppaalliteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TemplateTypeItemSemanticEditPolicy() {
		super(UppaalliteElementTypes.TemplateType_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UppaalliteElementTypes.LocationType_2007 == req.getElementType()) {
			return getGEFWrapper(new LocationTypeCreateCommand(req));
		}
		if (UppaalliteElementTypes.LocationType_2008 == req.getElementType()) {
			return getGEFWrapper(new LocationType2CreateCommand(req));
		}
		if (UppaalliteElementTypes.LocationType_2009 == req.getElementType()) {
			return getGEFWrapper(new LocationType3CreateCommand(req));
		}
		if (UppaalliteElementTypes.LocationType_2010 == req.getElementType()) {
			return getGEFWrapper(new LocationType4CreateCommand(req));
		}
		if (UppaalliteElementTypes.LocationType_2011 == req.getElementType()) {
			return getGEFWrapper(new LocationType5CreateCommand(req));
		}
		if (UppaalliteElementTypes.LocationType_2012 == req.getElementType()) {
			return getGEFWrapper(new LocationType6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
