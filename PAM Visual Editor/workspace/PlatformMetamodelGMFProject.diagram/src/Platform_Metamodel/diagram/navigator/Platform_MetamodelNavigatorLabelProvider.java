/*
 * 
 */
package Platform_Metamodel.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Platform_MetamodelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem
				&& !isOwnView(((Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup) {
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup group = (Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup) element;
			return Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem) {
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem navigatorItem = (Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getVisualID(view)) {
		case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.utwente.nl/sensation/platform_metamodel?PlatformApplicationModelRoot", Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.PlatformApplicationModelRoot_1000); //$NON-NLS-1$
		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.utwente.nl/sensation/platform_metamodel?VoltageFrequencyIsland", Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.VoltageFrequencyIsland_2001); //$NON-NLS-1$
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.utwente.nl/sensation/platform_metamodel?ProcessorType", Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorType_2002); //$NON-NLS-1$
		case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.utwente.nl/sensation/platform_metamodel?Processor", Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.Processor_2003); //$NON-NLS-1$
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.utwente.nl/sensation/platform_metamodel?ProcessorState", Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorState_3001); //$NON-NLS-1$
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.utwente.nl/sensation/platform_metamodel?ProcessorStateChange", Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001); //$NON-NLS-1$
		case Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.utwente.nl/sensation/platform_metamodel?Processor?pType", Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002); //$NON-NLS-1$
		case Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.utwente.nl/sensation/platform_metamodel?Processor?vfIsland", Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes
						.isKnownElementType(elementType)) {
			image = Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup) {
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup group = (Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem) {
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem navigatorItem = (Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getVisualID(view)) {
		case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID:
			return getPlatformApplicationModelRoot_1000Text(view);
		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID:
			return getVoltageFrequencyIsland_2001Text(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID:
			return getProcessorType_2002Text(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_2003Text(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID:
			return getProcessorState_3001Text(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID:
			return getProcessorStateChange_4001Text(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID:
			return getProcessorPType_4002Text(view);
		case Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID:
			return getProcessorVfIsland_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPlatformApplicationModelRoot_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getVoltageFrequencyIsland_2001Text(View view) {
		IParser parser = Platform_Metamodel.diagram.providers.Platform_MetamodelParserProvider
				.getParser(
						Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.VoltageFrequencyIsland_2001,
						view.getElement() != null ? view.getElement() : view,
						Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
								.getType(Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorType_2002Text(View view) {
		IParser parser = Platform_Metamodel.diagram.providers.Platform_MetamodelParserProvider
				.getParser(
						Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorType_2002,
						view.getElement() != null ? view.getElement() : view,
						Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
								.getType(Platform_Metamodel.diagram.edit.parts.ProcessorTypeIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessor_2003Text(View view) {
		IParser parser = Platform_Metamodel.diagram.providers.Platform_MetamodelParserProvider
				.getParser(
						Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.Processor_2003,
						view.getElement() != null ? view.getElement() : view,
						Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
								.getType(Platform_Metamodel.diagram.edit.parts.ProcessorIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorState_3001Text(View view) {
		IParser parser = Platform_Metamodel.diagram.providers.Platform_MetamodelParserProvider
				.getParser(
						Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorState_3001,
						view.getElement() != null ? view.getElement() : view,
						Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
								.getType(Platform_Metamodel.diagram.edit.parts.ProcessorStateIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorStateChange_4001Text(View view) {
		IParser parser = Platform_Metamodel.diagram.providers.Platform_MetamodelParserProvider
				.getParser(
						Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001,
						view.getElement() != null ? view.getElement() : view,
						Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
								.getType(Platform_Metamodel.diagram.edit.parts.ProcessorStateChangePowerCostEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorPType_4002Text(View view) {
		IParser parser = Platform_Metamodel.diagram.providers.Platform_MetamodelParserProvider
				.getParser(
						Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorVfIsland_4003Text(View view) {
		IParser parser = Platform_Metamodel.diagram.providers.Platform_MetamodelParserProvider
				.getParser(
						Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.MODEL_ID
				.equals(Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
						.getModelID(view));
	}

}
