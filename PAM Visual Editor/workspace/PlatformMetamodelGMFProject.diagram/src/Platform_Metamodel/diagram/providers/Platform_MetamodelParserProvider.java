/*
 * 
 */
package Platform_Metamodel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Platform_MetamodelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser voltageFrequencyIslandIdentifier_5001Parser;

	/**
	 * @generated
	 */
	private IParser getVoltageFrequencyIslandIdentifier_5001Parser() {
		if (voltageFrequencyIslandIdentifier_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage.eINSTANCE
					.getIdentifiable_Identifier() };
			Platform_Metamodel.diagram.parsers.MessageFormatParser parser = new Platform_Metamodel.diagram.parsers.MessageFormatParser(
					features);
			voltageFrequencyIslandIdentifier_5001Parser = parser;
		}
		return voltageFrequencyIslandIdentifier_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser processorTypeIdentifier_5006Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorTypeIdentifier_5006Parser() {
		if (processorTypeIdentifier_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage.eINSTANCE
					.getIdentifiable_Identifier() };
			Platform_Metamodel.diagram.parsers.MessageFormatParser parser = new Platform_Metamodel.diagram.parsers.MessageFormatParser(
					features);
			processorTypeIdentifier_5006Parser = parser;
		}
		return processorTypeIdentifier_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser processorIdentifier_5007Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorIdentifier_5007Parser() {
		if (processorIdentifier_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage.eINSTANCE
					.getIdentifiable_Identifier() };
			Platform_Metamodel.diagram.parsers.MessageFormatParser parser = new Platform_Metamodel.diagram.parsers.MessageFormatParser(
					features);
			processorIdentifier_5007Parser = parser;
		}
		return processorIdentifier_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser processorStateIdentifier_5002Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorStateIdentifier_5002Parser() {
		if (processorStateIdentifier_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage.eINSTANCE
					.getIdentifiable_Identifier() };
			Platform_Metamodel.diagram.parsers.MessageFormatParser parser = new Platform_Metamodel.diagram.parsers.MessageFormatParser(
					features);
			processorStateIdentifier_5002Parser = parser;
		}
		return processorStateIdentifier_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser processorStateIsWorking_5003Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorStateIsWorking_5003Parser() {
		if (processorStateIsWorking_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessorState_IsWorking() };
			Platform_Metamodel.diagram.parsers.MessageFormatParser parser = new Platform_Metamodel.diagram.parsers.MessageFormatParser(
					features);
			processorStateIsWorking_5003Parser = parser;
		}
		return processorStateIsWorking_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser processorStateFrequency_5004Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorStateFrequency_5004Parser() {
		if (processorStateFrequency_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessorState_Frequency() };
			Platform_Metamodel.diagram.parsers.MessageFormatParser parser = new Platform_Metamodel.diagram.parsers.MessageFormatParser(
					features);
			processorStateFrequency_5004Parser = parser;
		}
		return processorStateFrequency_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser processorStatePowerConsumption_5005Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorStatePowerConsumption_5005Parser() {
		if (processorStatePowerConsumption_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessorState_PowerConsumption() };
			Platform_Metamodel.diagram.parsers.MessageFormatParser parser = new Platform_Metamodel.diagram.parsers.MessageFormatParser(
					features);
			processorStatePowerConsumption_5005Parser = parser;
		}
		return processorStatePowerConsumption_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser processorStateChangePowerCost_6001Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorStateChangePowerCost_6001Parser() {
		if (processorStateChangePowerCost_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { Platform_Metamodel.Platform_MetamodelPackage.eINSTANCE
					.getProcessorStateChange_PowerCost() };
			Platform_Metamodel.diagram.parsers.MessageFormatParser parser = new Platform_Metamodel.diagram.parsers.MessageFormatParser(
					features);
			processorStateChangePowerCost_6001Parser = parser;
		}
		return processorStateChangePowerCost_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandIdentifierEditPart.VISUAL_ID:
			return getVoltageFrequencyIslandIdentifier_5001Parser();
		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeIdentifierEditPart.VISUAL_ID:
			return getProcessorTypeIdentifier_5006Parser();
		case Platform_Metamodel.diagram.edit.parts.ProcessorIdentifierEditPart.VISUAL_ID:
			return getProcessorIdentifier_5007Parser();
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateIdentifierEditPart.VISUAL_ID:
			return getProcessorStateIdentifier_5002Parser();
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateIsWorkingEditPart.VISUAL_ID:
			return getProcessorStateIsWorking_5003Parser();
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateFrequencyEditPart.VISUAL_ID:
			return getProcessorStateFrequency_5004Parser();
		case Platform_Metamodel.diagram.edit.parts.ProcessorStatePowerConsumptionEditPart.VISUAL_ID:
			return getProcessorStatePowerConsumption_5005Parser();
		case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangePowerCostEditPart.VISUAL_ID:
			return getProcessorStateChangePowerCost_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (Platform_Metamodel.diagram.providers.Platform_MetamodelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
