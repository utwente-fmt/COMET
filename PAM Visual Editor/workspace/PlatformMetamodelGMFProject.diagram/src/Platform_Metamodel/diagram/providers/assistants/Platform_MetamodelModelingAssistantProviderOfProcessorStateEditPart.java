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
public class Platform_MetamodelModelingAssistantProviderOfProcessorStateEditPart
		extends
		Platform_Metamodel.diagram.providers.Platform_MetamodelModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001);
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
				(Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart) {
			types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001);
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
				(Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001) {
			types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorState_3001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001) {
			types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorState_3001);
		}
		return types;
	}

}
