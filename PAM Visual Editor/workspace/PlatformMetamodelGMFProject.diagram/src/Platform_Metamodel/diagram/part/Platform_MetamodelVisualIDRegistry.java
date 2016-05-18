/*
 * 
 */
package Platform_Metamodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Platform_MetamodelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "PlatformMetamodelGMFProject.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.MODEL_ID
					.equals(view.getType())) {
				return Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
				.getPlatformApplicationModelRoot().isSuperTypeOf(
						domainElement.eClass())
				&& isDiagram((Platform_Metamodel.PlatformApplicationModelRoot) domainElement)) {
			return Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getModelID(containerView);
		if (!Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"Platform_Metamodel".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID:
			if (Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getVoltageFrequencyIsland().isSuperTypeOf(
							domainElement.eClass())) {
				return Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID;
			}
			if (Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessorType().isSuperTypeOf(domainElement.eClass())) {
				return Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID;
			}
			if (Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessor().isSuperTypeOf(domainElement.eClass())) {
				return Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID;
			}
			break;
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeProcessorTypePossibleStatesCompartmentEditPart.VISUAL_ID:
			if (Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessorState().isSuperTypeOf(domainElement.eClass())) {
				return Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getModelID(containerView);
		if (!Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"Platform_Metamodel".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID:
			if (Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID:
			if (Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID:
			if (Platform_Metamodel.diagram.edit.parts.ProcessorTypeIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Platform_Metamodel.diagram.edit.parts.ProcessorTypeProcessorTypePossibleStatesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			if (Platform_Metamodel.diagram.edit.parts.ProcessorIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID:
			if (Platform_Metamodel.diagram.edit.parts.ProcessorStateIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Platform_Metamodel.diagram.edit.parts.ProcessorStateIsWorkingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Platform_Metamodel.diagram.edit.parts.ProcessorStateFrequencyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Platform_Metamodel.diagram.edit.parts.ProcessorStatePowerConsumptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeProcessorTypePossibleStatesCompartmentEditPart.VISUAL_ID:
			if (Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID:
			if (Platform_Metamodel.diagram.edit.parts.ProcessorStateChangePowerCostEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID:
			if (Platform_Metamodel.diagram.edit.parts.ProcessorPTypeExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID:
			if (Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
				.getProcessorStateChange()
				.isSuperTypeOf(domainElement.eClass())) {
			return Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			Platform_Metamodel.PlatformApplicationModelRoot element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeProcessorTypePossibleStatesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID:
			return false;
		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID:
		case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
