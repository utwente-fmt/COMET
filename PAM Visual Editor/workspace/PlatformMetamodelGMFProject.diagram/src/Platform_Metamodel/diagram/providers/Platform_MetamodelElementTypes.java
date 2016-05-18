/*
 * 
 */
package Platform_Metamodel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Platform_MetamodelElementTypes {

	/**
	 * @generated
	 */
	private Platform_MetamodelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType PlatformApplicationModelRoot_1000 = getElementType("PlatformMetamodelGMFProject.diagram.PlatformApplicationModelRoot_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VoltageFrequencyIsland_2001 = getElementType("PlatformMetamodelGMFProject.diagram.VoltageFrequencyIsland_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorType_2002 = getElementType("PlatformMetamodelGMFProject.diagram.ProcessorType_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Processor_2003 = getElementType("PlatformMetamodelGMFProject.diagram.Processor_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorState_3001 = getElementType("PlatformMetamodelGMFProject.diagram.ProcessorState_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorStateChange_4001 = getElementType("PlatformMetamodelGMFProject.diagram.ProcessorStateChange_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorPType_4002 = getElementType("PlatformMetamodelGMFProject.diagram.ProcessorPType_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorVfIsland_4003 = getElementType("PlatformMetamodelGMFProject.diagram.ProcessorVfIsland_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(PlatformApplicationModelRoot_1000,
					Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
							.getPlatformApplicationModelRoot());

			elements.put(VoltageFrequencyIsland_2001,
					Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
							.getVoltageFrequencyIsland());

			elements.put(ProcessorType_2002,
					Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
							.getProcessorType());

			elements.put(Processor_2003,
					Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
							.getProcessor());

			elements.put(ProcessorState_3001,
					Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
							.getProcessorState());

			elements.put(ProcessorStateChange_4001,
					Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
							.getProcessorStateChange());

			elements.put(ProcessorPType_4002,
					Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
							.getProcessor_PType());

			elements.put(ProcessorVfIsland_4003,
					Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
							.getProcessor_VfIsland());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(PlatformApplicationModelRoot_1000);
			KNOWN_ELEMENT_TYPES.add(VoltageFrequencyIsland_2001);
			KNOWN_ELEMENT_TYPES.add(ProcessorType_2002);
			KNOWN_ELEMENT_TYPES.add(Processor_2003);
			KNOWN_ELEMENT_TYPES.add(ProcessorState_3001);
			KNOWN_ELEMENT_TYPES.add(ProcessorStateChange_4001);
			KNOWN_ELEMENT_TYPES.add(ProcessorPType_4002);
			KNOWN_ELEMENT_TYPES.add(ProcessorVfIsland_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID:
			return PlatformApplicationModelRoot_1000;
		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID:
			return VoltageFrequencyIsland_2001;
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID:
			return ProcessorType_2002;
		case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return Processor_2003;
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID:
			return ProcessorState_3001;
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID:
			return ProcessorStateChange_4001;
		case Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID:
			return ProcessorPType_4002;
		case Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID:
			return ProcessorVfIsland_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
