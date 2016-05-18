/*
 * 
 */
package Platform_Metamodel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Platform_MetamodelModelingAssistantProviderOfPlatformApplicationModelRootEditPart
		extends
		Platform_Metamodel.diagram.providers.Platform_MetamodelModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.VoltageFrequencyIsland_2001);
		types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorType_2002);
		types.add(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.Processor_2003);
		return types;
	}

}
