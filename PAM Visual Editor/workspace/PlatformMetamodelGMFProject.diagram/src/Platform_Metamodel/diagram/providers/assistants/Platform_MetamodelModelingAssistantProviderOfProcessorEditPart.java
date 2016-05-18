/*
 * 
 */
package Platform_Metamodel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Platform_MetamodelModelingAssistantProviderOfProcessorEditPart
		extends
		Platform_Metamodel.diagram.providers.Platform_MetamodelModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Platform_Metamodel.diagram.edit.parts.ProcessorEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Platform_Metamodel.diagram.edit.parts.ProcessorEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002);
		types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(Platform_Metamodel.diagram.edit.parts.ProcessorEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Platform_Metamodel.diagram.edit.parts.ProcessorEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart) {
			types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002);
		}
		if (targetEditPart instanceof Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart) {
			types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(Platform_Metamodel.diagram.edit.parts.ProcessorEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Platform_Metamodel.diagram.edit.parts.ProcessorEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002) {
			types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorType_2002);
		} else if (relationshipType == Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003) {
			types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.VoltageFrequencyIsland_2001);
		}
		return types;
	}

}
