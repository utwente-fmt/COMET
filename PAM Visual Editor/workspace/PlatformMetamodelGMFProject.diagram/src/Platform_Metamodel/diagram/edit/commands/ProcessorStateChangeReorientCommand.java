/*
 * 
 */
package Platform_Metamodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ProcessorStateChangeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ProcessorStateChangeReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Platform_Metamodel.ProcessorStateChange) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Platform_Metamodel.ProcessorState && newEnd instanceof Platform_Metamodel.ProcessorState)) {
			return false;
		}
		Platform_Metamodel.ProcessorState target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Platform_Metamodel.ProcessorState)) {
			return false;
		}
		Platform_Metamodel.ProcessorState container = (Platform_Metamodel.ProcessorState) getLink()
				.eContainer();
		return Platform_Metamodel.diagram.edit.policies.Platform_MetamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistProcessorStateChange_4001(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Platform_Metamodel.ProcessorState && newEnd instanceof Platform_Metamodel.ProcessorState)) {
			return false;
		}
		Platform_Metamodel.ProcessorState source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Platform_Metamodel.ProcessorState)) {
			return false;
		}
		Platform_Metamodel.ProcessorState container = (Platform_Metamodel.ProcessorState) getLink()
				.eContainer();
		return Platform_Metamodel.diagram.edit.policies.Platform_MetamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistProcessorStateChange_4001(
						container, getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Platform_Metamodel.ProcessorStateChange getLink() {
		return (Platform_Metamodel.ProcessorStateChange) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Platform_Metamodel.ProcessorState getOldSource() {
		return (Platform_Metamodel.ProcessorState) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Platform_Metamodel.ProcessorState getNewSource() {
		return (Platform_Metamodel.ProcessorState) newEnd;
	}

	/**
	 * @generated
	 */
	protected Platform_Metamodel.ProcessorState getOldTarget() {
		return (Platform_Metamodel.ProcessorState) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Platform_Metamodel.ProcessorState getNewTarget() {
		return (Platform_Metamodel.ProcessorState) newEnd;
	}
}
