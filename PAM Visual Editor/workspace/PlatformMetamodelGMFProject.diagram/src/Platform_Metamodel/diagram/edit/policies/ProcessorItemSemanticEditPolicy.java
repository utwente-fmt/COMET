/*
 * 
 */
package Platform_Metamodel.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ProcessorItemSemanticEditPolicy
		extends
		Platform_Metamodel.diagram.edit.policies.Platform_MetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessorItemSemanticEditPolicy() {
		super(
				Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.Processor_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getVisualID(outgoingLink) == Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getVisualID(outgoingLink) == Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002 == req
				.getElementType()) {
			return getGEFWrapper(new Platform_Metamodel.diagram.edit.commands.ProcessorPTypeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003 == req
				.getElementType()) {
			return getGEFWrapper(new Platform_Metamodel.diagram.edit.commands.ProcessorVfIslandCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002 == req
				.getElementType()) {
			return null;
		}
		if (Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID:
			return getGEFWrapper(new Platform_Metamodel.diagram.edit.commands.ProcessorPTypeReorientCommand(
					req));
		case Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID:
			return getGEFWrapper(new Platform_Metamodel.diagram.edit.commands.ProcessorVfIslandReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
