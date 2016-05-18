/*
 * 
 */
package Platform_Metamodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Platform_MetamodelDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getVisualID(view)) {
		case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID:
			return getPlatformApplicationModelRoot_1000SemanticChildren(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeProcessorTypePossibleStatesCompartmentEditPart.VISUAL_ID:
			return getProcessorTypeProcessorTypePossibleStatesCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor> getPlatformApplicationModelRoot_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Platform_Metamodel.PlatformApplicationModelRoot modelElement = (Platform_Metamodel.PlatformApplicationModelRoot) view
				.getElement();
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIslands().iterator(); it
				.hasNext();) {
			Platform_Metamodel.VoltageFrequencyIsland childElement = (Platform_Metamodel.VoltageFrequencyIsland) it
					.next();
			int visualID = Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID) {
				result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProcessorTypes().iterator(); it
				.hasNext();) {
			Platform_Metamodel.ProcessorType childElement = (Platform_Metamodel.ProcessorType) it
					.next();
			int visualID = Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID) {
				result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProcessors().iterator(); it
				.hasNext();) {
			Platform_Metamodel.Processor childElement = (Platform_Metamodel.Processor) it
					.next();
			int visualID = Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID) {
				result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor> getProcessorTypeProcessorTypePossibleStatesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Platform_Metamodel.ProcessorType modelElement = (Platform_Metamodel.ProcessorType) containerView
				.getElement();
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPossibleStates().iterator(); it
				.hasNext();) {
			Platform_Metamodel.ProcessorState childElement = (Platform_Metamodel.ProcessorState) it
					.next();
			int visualID = Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID) {
				result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getContainedLinks(
			View view) {
		switch (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getVisualID(view)) {
		case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID:
			return getPlatformApplicationModelRoot_1000ContainedLinks(view);
		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID:
			return getVoltageFrequencyIsland_2001ContainedLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID:
			return getProcessorType_2002ContainedLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_2003ContainedLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID:
			return getProcessorState_3001ContainedLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID:
			return getProcessorStateChange_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getVisualID(view)) {
		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID:
			return getVoltageFrequencyIsland_2001IncomingLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID:
			return getProcessorType_2002IncomingLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_2003IncomingLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID:
			return getProcessorState_3001IncomingLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID:
			return getProcessorStateChange_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getVisualID(view)) {
		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID:
			return getVoltageFrequencyIsland_2001OutgoingLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID:
			return getProcessorType_2002OutgoingLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_2003OutgoingLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID:
			return getProcessorState_3001OutgoingLinks(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID:
			return getProcessorStateChange_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getPlatformApplicationModelRoot_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getVoltageFrequencyIsland_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessorType_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessor_2003ContainedLinks(
			View view) {
		Platform_Metamodel.Processor modelElement = (Platform_Metamodel.Processor) view
				.getElement();
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_PType_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_VfIsland_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessorState_3001ContainedLinks(
			View view) {
		Platform_Metamodel.ProcessorState modelElement = (Platform_Metamodel.ProcessorState) view
				.getElement();
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ProcessorStateChange_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessorStateChange_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getVoltageFrequencyIsland_2001IncomingLinks(
			View view) {
		Platform_Metamodel.VoltageFrequencyIsland modelElement = (Platform_Metamodel.VoltageFrequencyIsland) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Processor_VfIsland_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessorType_2002IncomingLinks(
			View view) {
		Platform_Metamodel.ProcessorType modelElement = (Platform_Metamodel.ProcessorType) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Processor_PType_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessor_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessorState_3001IncomingLinks(
			View view) {
		Platform_Metamodel.ProcessorState modelElement = (Platform_Metamodel.ProcessorState) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ProcessorStateChange_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessorStateChange_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getVoltageFrequencyIsland_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessorType_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessor_2003OutgoingLinks(
			View view) {
		Platform_Metamodel.Processor modelElement = (Platform_Metamodel.Processor) view
				.getElement();
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_PType_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Processor_VfIsland_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessorState_3001OutgoingLinks(
			View view) {
		Platform_Metamodel.ProcessorState modelElement = (Platform_Metamodel.ProcessorState) view
				.getElement();
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ProcessorStateChange_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getProcessorStateChange_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getContainedTypeModelFacetLinks_ProcessorStateChange_4001(
			Platform_Metamodel.ProcessorState container) {
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getPossibleStateChanges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Platform_Metamodel.ProcessorStateChange) {
				continue;
			}
			Platform_Metamodel.ProcessorStateChange link = (Platform_Metamodel.ProcessorStateChange) linkObject;
			if (Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID != Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Platform_Metamodel.ProcessorState dst = link.getTarget();
			Platform_Metamodel.ProcessorState src = link.getSource();
			result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor(
					src,
					dst,
					link,
					Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001,
					Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getIncomingTypeModelFacetLinks_ProcessorStateChange_4001(
			Platform_Metamodel.ProcessorState target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessorStateChange_Target()
					|| false == setting.getEObject() instanceof Platform_Metamodel.ProcessorStateChange) {
				continue;
			}
			Platform_Metamodel.ProcessorStateChange link = (Platform_Metamodel.ProcessorStateChange) setting
					.getEObject();
			if (Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID != Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Platform_Metamodel.ProcessorState src = link.getSource();
			result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor(
					src,
					target,
					link,
					Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001,
					Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getIncomingFeatureModelFacetLinks_Processor_PType_4002(
			Platform_Metamodel.ProcessorType target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessor_PType()) {
				result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor(
						setting.getEObject(),
						target,
						Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002,
						Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getIncomingFeatureModelFacetLinks_Processor_VfIsland_4003(
			Platform_Metamodel.VoltageFrequencyIsland target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessor_VfIsland()) {
				result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor(
						setting.getEObject(),
						target,
						Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003,
						Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getOutgoingTypeModelFacetLinks_ProcessorStateChange_4001(
			Platform_Metamodel.ProcessorState source) {
		Platform_Metamodel.ProcessorState container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Platform_Metamodel.ProcessorState) {
				container = (Platform_Metamodel.ProcessorState) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getPossibleStateChanges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Platform_Metamodel.ProcessorStateChange) {
				continue;
			}
			Platform_Metamodel.ProcessorStateChange link = (Platform_Metamodel.ProcessorStateChange) linkObject;
			if (Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID != Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Platform_Metamodel.ProcessorState dst = link.getTarget();
			Platform_Metamodel.ProcessorState src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor(
					src,
					dst,
					link,
					Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001,
					Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Processor_PType_4002(
			Platform_Metamodel.Processor source) {
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		Platform_Metamodel.ProcessorType destination = source.getPType();
		if (destination == null) {
			return result;
		}
		result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor(
				source,
				destination,
				Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002,
				Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Processor_VfIsland_4003(
			Platform_Metamodel.Processor source) {
		LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> result = new LinkedList<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor>();
		Platform_Metamodel.VoltageFrequencyIsland destination = source
				.getVfIsland();
		if (destination == null) {
			return result;
		}
		result.add(new Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor(
				source,
				destination,
				Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003,
				Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Platform_Metamodel.diagram.part.Platform_MetamodelNodeDescriptor> getSemanticChildren(
				View view) {
			return Platform_MetamodelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getContainedLinks(
				View view) {
			return Platform_MetamodelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getIncomingLinks(
				View view) {
			return Platform_MetamodelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Platform_Metamodel.diagram.part.Platform_MetamodelLinkDescriptor> getOutgoingLinks(
				View view) {
			return Platform_MetamodelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}