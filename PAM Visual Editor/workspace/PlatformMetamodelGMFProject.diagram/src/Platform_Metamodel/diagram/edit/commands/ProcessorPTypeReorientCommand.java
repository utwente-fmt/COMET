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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ProcessorPTypeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public ProcessorPTypeReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof Platform_Metamodel.Processor) {
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
		if (!(oldEnd instanceof Platform_Metamodel.ProcessorType && newEnd instanceof Platform_Metamodel.Processor)) {
			return false;
		}
		return Platform_Metamodel.diagram.edit.policies.Platform_MetamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistProcessorPType_4002(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Platform_Metamodel.ProcessorType && newEnd instanceof Platform_Metamodel.ProcessorType)) {
			return false;
		}
		return Platform_Metamodel.diagram.edit.policies.Platform_MetamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistProcessorPType_4002(
						getOldSource(), getNewTarget());
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
		getOldSource().setPType(null);
		getNewSource().setPType(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setPType(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected Platform_Metamodel.Processor getOldSource() {
		return (Platform_Metamodel.Processor) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected Platform_Metamodel.Processor getNewSource() {
		return (Platform_Metamodel.Processor) newEnd;
	}

	/**
	 * @generated
	 */
	protected Platform_Metamodel.ProcessorType getOldTarget() {
		return (Platform_Metamodel.ProcessorType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Platform_Metamodel.ProcessorType getNewTarget() {
		return (Platform_Metamodel.ProcessorType) newEnd;
	}
}
