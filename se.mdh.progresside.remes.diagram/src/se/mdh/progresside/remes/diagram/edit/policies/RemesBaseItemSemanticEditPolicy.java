package se.mdh.progresside.remes.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;

import java.util.Map;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;

import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.diagram.edit.helpers.RemesBaseEditHelper;
import se.mdh.progresside.remes.diagram.expressions.RemesAbstractExpression;
import se.mdh.progresside.remes.diagram.expressions.RemesOCLFactory;
import se.mdh.progresside.remes.diagram.part.RemesDiagramEditorPlugin;
import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class RemesBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected RemesBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(RemesVisualIDRegistry
						.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand()
					: new CommandProxy(editPolicyCommand);
			request.setParameter(RemesBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(RemesBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(RemesBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(RemesBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = RemesElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		private static final String OPPOSITE_END_VAR = "oppositeEnd"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		private static RemesAbstractExpression Edge_4028_TargetExpression;

		/**
		 * @generated
		 */
		private static RemesAbstractExpression InitEdge_4029_TargetExpression;

		/**
		 * @generated
		 */
		public static boolean canCreateEdge_4028(ExitPoint container,
				ExitPoint source, EntryPoint target) {
			return canExistEdge_4028(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateInitEdge_4029(InitPoint container,
				InitPoint source, EntryPoint target) {
			if (container != null) {
				if (container.getInitEdge() != null) {
					return false;
				}
			}
			return canExistInitEdge_4029(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistEdge_4028(ExitPoint container,
				ExitPoint source, EntryPoint target) {
			try {
				if (target == null) {
					return true;
				}
				if (Edge_4028_TargetExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							RemesPackage.eINSTANCE.getExitPoint());
					Edge_4028_TargetExpression = RemesOCLFactory
							.getExpression(
									"((oppositeEnd.container.oclIsTypeOf(SubMode) and oppositeEnd.container.oclAsType(SubMode).parent.oclIsUndefined() and \r\n\t\t\t\t\t\t((self.container.oclIsTypeOf(SubMode) and self.container.oclAsType(SubMode).parent.oclIsUndefined()) or \r\n\t\t\t\t\t\t (self.container.oclIsTypeOf(CompositeMode))))\r\nor (oppositeEnd.container.oclIsTypeOf(SubMode) and not oppositeEnd.container.oclAsType(SubMode).parent.oclIsUndefined() and \r\n\t\t\t\t\t\t((self.container.oclIsTypeOf(SubMode) and self.container.oclAsType(SubMode).parent = oppositeEnd.container.oclAsType(SubMode).parent) or\r\n\t\t\t\t\t\t (self.container.oclIsTypeOf(ConditionalConnector) and self.container.oclAsType(ConditionalConnector).parent = oppositeEnd.container.oclAsType(SubMode).parent) or\r\n\t\t\t\t\t\t (self.oclIsTypeOf(CompositeExitPoint) and self.oclAsType(CompositeExitPoint).composite = oppositeEnd.container.oclAsType(SubMode).parent)))\r\nor (oppositeEnd.container.oclIsTypeOf(ConditionalConnector) and \r\n\t\t\t\t\t\t((self.container.oclIsTypeOf(SubMode) and self.container.oclAsType(SubMode).parent = oppositeEnd.container.oclAsType(ConditionalConnector).parent) or\r\n\t\t\t\t\t\t (self.container.oclIsTypeOf(ConditionalConnector) and self.container.oclAsType(ConditionalConnector).parent = oppositeEnd.container.oclAsType(ConditionalConnector).parent) or\r\n\t\t\t\t\t\t (self.oclIsTypeOf(CompositeExitPoint) and self.oclAsType(CompositeExitPoint).composite = oppositeEnd.container.oclAsType(ConditionalConnector).parent))) \t\t\t\t\t\t\r\nor (oppositeEnd.container.oclIsTypeOf(CompositeMode) and not oppositeEnd.oclIsTypeOf(CompositeEntryPoint) and\r\n\t\t\t\t\t\t((self.container.oclIsTypeOf(SubMode) and self.container.oclAsType(SubMode).parent.oclIsUndefined()) or \r\n\t\t\t\t\t\t(self.container.oclIsTypeOf(CompositeMode) and not (self.container = oppositeEnd.container) and not (self.oclIsTypeOf(CompositeExitPoint)))))\r\nor (oppositeEnd.oclIsTypeOf(CompositeEntryPoint) and\r\n\t\t\t\t\t\t((self.container.oclIsTypeOf(SubMode) and self.container.oclAsType(SubMode).parent = oppositeEnd.oclAsType(CompositeEntryPoint).composite) or\r\n\t\t\t\t\t\t  (self.container.oclIsTypeOf(ConditionalConnector) and self.container.oclAsType(ConditionalConnector).parent = oppositeEnd.oclAsType(CompositeEntryPoint).composite) or\r\n\t\t\t\t\t\t  (self.oclIsTypeOf(CompositeExitPoint) and self.oclAsType(CompositeExitPoint).composite = oppositeEnd.oclAsType(CompositeEntryPoint).composite))))\r\nand not (self.container.oclIsTypeOf(ConditionalConnector) and oppositeEnd.container.oclIsTypeOf(ConditionalConnector))", RemesPackage.eINSTANCE.getEntryPoint(), env); //$NON-NLS-1$
				}
				Object targetVal = Edge_4028_TargetExpression.evaluate(target,
						Collections.singletonMap(OPPOSITE_END_VAR, source));
				if (false == targetVal instanceof Boolean
						|| !((Boolean) targetVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				RemesDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public static boolean canExistInitEdge_4029(InitPoint container,
				InitPoint source, EntryPoint target) {
			try {
				if (target == null) {
					return true;
				}
				if (InitEdge_4029_TargetExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							RemesPackage.eINSTANCE.getInitPoint());
					InitEdge_4029_TargetExpression = RemesOCLFactory
							.getExpression(
									"(self.container.oclIsTypeOf(SubMode) and self.container.oclAsType(SubMode).parent = oppositeEnd.container) or\r\n(self.container.oclIsTypeOf(ConditionalConnector) and self.container.oclAsType(ConditionalConnector).parent = oppositeEnd.container)", RemesPackage.eINSTANCE.getEntryPoint(), env); //$NON-NLS-1$
				}
				Object targetVal = InitEdge_4029_TargetExpression.evaluate(
						target, Collections.singletonMap(OPPOSITE_END_VAR,
								source));
				if (false == targetVal instanceof Boolean
						|| !((Boolean) targetVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				RemesDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

	}

}
