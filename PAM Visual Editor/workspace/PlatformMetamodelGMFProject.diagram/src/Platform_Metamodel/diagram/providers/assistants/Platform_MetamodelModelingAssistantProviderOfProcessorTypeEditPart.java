/*
 * 
 */
package Platform_Metamodel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Platform_MetamodelModelingAssistantProviderOfProcessorTypeEditPart
		extends
		Platform_Metamodel.diagram.providers.Platform_MetamodelModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002);
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
				(Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002) {
			types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.Processor_2003);
		}
		return types;
	}

}
