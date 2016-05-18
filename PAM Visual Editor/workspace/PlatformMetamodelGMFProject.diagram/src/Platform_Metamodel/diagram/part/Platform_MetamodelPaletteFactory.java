/*
 * 
 */
package Platform_Metamodel.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class Platform_MetamodelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Platform_Metamodel.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createProcessor1CreationTool());
		paletteContainer.add(createProcessorState2CreationTool());
		paletteContainer.add(createProcessorType3CreationTool());
		paletteContainer.add(createVoltageFrequencyIsland4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Platform_Metamodel.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createProcessorStateChange1CreationTool());
		paletteContainer.add(createProcessorProcessorType2CreationTool());
		paletteContainer
				.add(createProcessorVoltageFrequencyIsland3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessor1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Platform_Metamodel.diagram.part.Messages.Processor1CreationTool_title,
				Platform_Metamodel.diagram.part.Messages.Processor1CreationTool_desc,
				Collections
						.singletonList(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.Processor_2003));
		entry.setId("createProcessor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes
				.getImageDescriptor(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.Processor_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorState2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Platform_Metamodel.diagram.part.Messages.ProcessorState2CreationTool_title,
				Platform_Metamodel.diagram.part.Messages.ProcessorState2CreationTool_desc,
				Collections
						.singletonList(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorState_3001));
		entry.setId("createProcessorState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/ps_s.gif")); //$NON-NLS-1$
		entry.setLargeIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/ps_l.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorType3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Platform_Metamodel.diagram.part.Messages.ProcessorType3CreationTool_title,
				Platform_Metamodel.diagram.part.Messages.ProcessorType3CreationTool_desc,
				Collections
						.singletonList(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorType_2002));
		entry.setId("createProcessorType3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/processor_type_icon.gif")); //$NON-NLS-1$
		entry.setLargeIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/processor_type_icon.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVoltageFrequencyIsland4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Platform_Metamodel.diagram.part.Messages.VoltageFrequencyIsland4CreationTool_title,
				Platform_Metamodel.diagram.part.Messages.VoltageFrequencyIsland4CreationTool_desc,
				Collections
						.singletonList(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.VoltageFrequencyIsland_2001));
		entry.setId("createVoltageFrequencyIsland4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes
				.getImageDescriptor(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.VoltageFrequencyIsland_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorStateChange1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Platform_Metamodel.diagram.part.Messages.ProcessorStateChange1CreationTool_title,
				Platform_Metamodel.diagram.part.Messages.ProcessorStateChange1CreationTool_desc,
				Collections
						.singletonList(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorStateChange_4001));
		entry.setId("createProcessorStateChange1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/psc.gif")); //$NON-NLS-1$
		entry.setLargeIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/psc.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorProcessorType2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Platform_Metamodel.diagram.part.Messages.ProcessorProcessorType2CreationTool_title,
				Platform_Metamodel.diagram.part.Messages.ProcessorProcessorType2CreationTool_desc,
				Collections
						.singletonList(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorPType_4002));
		entry.setId("createProcessorProcessorType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/p2pt.gif")); //$NON-NLS-1$
		entry.setLargeIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/p2pt.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorVoltageFrequencyIsland3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Platform_Metamodel.diagram.part.Messages.ProcessorVoltageFrequencyIsland3CreationTool_title,
				Platform_Metamodel.diagram.part.Messages.ProcessorVoltageFrequencyIsland3CreationTool_desc,
				Collections
						.singletonList(Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes.ProcessorVfIsland_4003));
		entry.setId("createProcessorVoltageFrequencyIsland3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/p2is.gif")); //$NON-NLS-1$
		entry.setLargeIcon(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.findImageDescriptor("icons/p2is.gif")); //$NON-NLS-1$
		return entry;
	}

}
