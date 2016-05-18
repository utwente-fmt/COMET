/*
 * 
 */
package Platform_Metamodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ProcessorTypeProcessorTypePossibleStatesCompartmentItemSemanticEditPolicy
		extends
		Platform_Metamodel.diagram.edit.policies.Platform_MetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessorTypeProcessorTypePossibleStatesCompartmentItemSemanticEditPolicy() {
		super(
				Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorType_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorState_3001 == req
				.getElementType()) {
			return getGEFWrapper(new Platform_Metamodel.diagram.edit.commands.ProcessorStateCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
