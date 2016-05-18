/*
 * 
 */
package Platform_Metamodel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class PlatformApplicationModelRootItemSemanticEditPolicy
		extends
		Platform_Metamodel.diagram.edit.policies.Platform_MetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PlatformApplicationModelRootItemSemanticEditPolicy() {
		super(
				Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.PlatformApplicationModelRoot_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.VoltageFrequencyIsland_2001 == req
				.getElementType()) {
			return getGEFWrapper(new Platform_Metamodel.diagram.edit.commands.VoltageFrequencyIslandCreateCommand(
					req));
		}
		if (Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorType_2002 == req
				.getElementType()) {
			return getGEFWrapper(new Platform_Metamodel.diagram.edit.commands.ProcessorTypeCreateCommand(
					req));
		}
		if (Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.Processor_2003 == req
				.getElementType()) {
			return getGEFWrapper(new Platform_Metamodel.diagram.edit.commands.ProcessorCreateCommand(
					req));
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
