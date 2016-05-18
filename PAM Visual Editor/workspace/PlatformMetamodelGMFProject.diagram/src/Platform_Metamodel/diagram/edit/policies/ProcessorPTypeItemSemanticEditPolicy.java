/*
 * 
 */
package Platform_Metamodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ProcessorPTypeItemSemanticEditPolicy
		extends
		Platform_Metamodel.diagram.edit.policies.Platform_MetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessorPTypeItemSemanticEditPolicy() {
		super(
				Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
