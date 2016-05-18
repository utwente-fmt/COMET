/*
 * 
 */
package Platform_Metamodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Platform_MetamodelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getVisualID(view)) {

			case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandIdentifierEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandIdentifierEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorTypeIdentifierEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorTypeIdentifierEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorIdentifierEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorIdentifierEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorStateIdentifierEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorStateIdentifierEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorStateIsWorkingEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorStateIsWorkingEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorStateFrequencyEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorStateFrequencyEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorStatePowerConsumptionEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorStatePowerConsumptionEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorTypeProcessorTypePossibleStatesCompartmentEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorTypeProcessorTypePossibleStatesCompartmentEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangePowerCostEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorStateChangePowerCostEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorPTypeExternalLabelEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorPTypeExternalLabelEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart(
						view);

			case Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandExternalLabelEditPart.VISUAL_ID:
				return new Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandExternalLabelEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
