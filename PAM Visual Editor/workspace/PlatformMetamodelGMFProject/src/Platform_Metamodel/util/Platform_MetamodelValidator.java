/**
 */
package Platform_Metamodel.util;

import Platform_Metamodel.*;

import Sensation_Common_Metamodel.util.Sensation_Common_MetamodelValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Platform_Metamodel.Platform_MetamodelPackage
 * @generated
 */
public class Platform_MetamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Platform_MetamodelValidator INSTANCE = new Platform_MetamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Platform_Metamodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sensation_Common_MetamodelValidator sensation_Common_MetamodelValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_MetamodelValidator() {
		super();
		sensation_Common_MetamodelValidator = Sensation_Common_MetamodelValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Platform_MetamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT:
				return validatePlatformApplicationModelRoot((PlatformApplicationModelRoot)value, diagnostics, context);
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND:
				return validateVoltageFrequencyIsland((VoltageFrequencyIsland)value, diagnostics, context);
			case Platform_MetamodelPackage.PROCESSOR_TYPE:
				return validateProcessorType((ProcessorType)value, diagnostics, context);
			case Platform_MetamodelPackage.PROCESSOR:
				return validateProcessor((Processor)value, diagnostics, context);
			case Platform_MetamodelPackage.PROCESSOR_STATE:
				return validateProcessorState((ProcessorState)value, diagnostics, context);
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE:
				return validateProcessorStateChange((ProcessorStateChange)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformApplicationModelRoot(PlatformApplicationModelRoot platformApplicationModelRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(platformApplicationModelRoot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(platformApplicationModelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(platformApplicationModelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(platformApplicationModelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(platformApplicationModelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(platformApplicationModelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(platformApplicationModelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(platformApplicationModelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(platformApplicationModelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformApplicationModelRoot_SingletonPlatformMetamodel(platformApplicationModelRoot, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SingletonPlatformMetamodel constraint of '<em>Platform Application Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLATFORM_APPLICATION_MODEL_ROOT__SINGLETON_PLATFORM_METAMODEL__EEXPRESSION = "self.oclType().allInstances()->size() = 1";

	/**
	 * Validates the SingletonPlatformMetamodel constraint of '<em>Platform Application Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformApplicationModelRoot_SingletonPlatformMetamodel(PlatformApplicationModelRoot platformApplicationModelRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PLATFORM_APPLICATION_MODEL_ROOT,
				 platformApplicationModelRoot,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SingletonPlatformMetamodel",
				 PLATFORM_APPLICATION_MODEL_ROOT__SINGLETON_PLATFORM_METAMODEL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageFrequencyIsland(VoltageFrequencyIsland voltageFrequencyIsland, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(voltageFrequencyIsland, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= sensation_Common_MetamodelValidator.validateIdentifiable_UniqueIdentifiableInstance(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validateVoltageFrequencyIsland_SingleAppearanceOnIsland(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validateVoltageFrequencyIsland_IslandHasProcessors(voltageFrequencyIsland, diagnostics, context);
		if (result || diagnostics != null) result &= validateVoltageFrequencyIsland_IslandFrequencyHomogenity(voltageFrequencyIsland, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SingleAppearanceOnIsland constraint of '<em>Voltage Frequency Island</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VOLTAGE_FREQUENCY_ISLAND__SINGLE_APPEARANCE_ON_ISLAND__EEXPRESSION = "self.processors->forAll(p1, p2 | p1 <> p2 implies p1.identifier <> p2.identifier)";

	/**
	 * Validates the SingleAppearanceOnIsland constraint of '<em>Voltage Frequency Island</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageFrequencyIsland_SingleAppearanceOnIsland(VoltageFrequencyIsland voltageFrequencyIsland, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.VOLTAGE_FREQUENCY_ISLAND,
				 voltageFrequencyIsland,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SingleAppearanceOnIsland",
				 VOLTAGE_FREQUENCY_ISLAND__SINGLE_APPEARANCE_ON_ISLAND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IslandHasProcessors constraint of '<em>Voltage Frequency Island</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VOLTAGE_FREQUENCY_ISLAND__ISLAND_HAS_PROCESSORS__EEXPRESSION = "self.processors->forAll(p |p.island = self)";

	/**
	 * Validates the IslandHasProcessors constraint of '<em>Voltage Frequency Island</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageFrequencyIsland_IslandHasProcessors(VoltageFrequencyIsland voltageFrequencyIsland, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.VOLTAGE_FREQUENCY_ISLAND,
				 voltageFrequencyIsland,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IslandHasProcessors",
				 VOLTAGE_FREQUENCY_ISLAND__ISLAND_HAS_PROCESSORS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IslandFrequencyHomogenity constraint of '<em>Voltage Frequency Island</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VOLTAGE_FREQUENCY_ISLAND__ISLAND_FREQUENCY_HOMOGENITY__EEXPRESSION = "self.processors.initialState->forAll(cs1, cs2 | cs1.frequency = cs2.frequency)";

	/**
	 * Validates the IslandFrequencyHomogenity constraint of '<em>Voltage Frequency Island</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageFrequencyIsland_IslandFrequencyHomogenity(VoltageFrequencyIsland voltageFrequencyIsland, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.VOLTAGE_FREQUENCY_ISLAND,
				 voltageFrequencyIsland,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IslandFrequencyHomogenity",
				 VOLTAGE_FREQUENCY_ISLAND__ISLAND_FREQUENCY_HOMOGENITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorType(ProcessorType processorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processorType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= sensation_Common_MetamodelValidator.validateIdentifiable_UniqueIdentifiableInstance(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessorType_UniqueStatesForProcessorType(processorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessorType_ProcessorTypeHasStates(processorType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueStatesForProcessorType constraint of '<em>Processor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR_TYPE__UNIQUE_STATES_FOR_PROCESSOR_TYPE__EEXPRESSION = "self.possibleStates->forAll(ps1, ps2 | ps1 <> ps2 implies ps1.frequency <>  ps2.frequency or ps1.isWorking <>  ps2.isWorking)";

	/**
	 * Validates the UniqueStatesForProcessorType constraint of '<em>Processor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorType_UniqueStatesForProcessorType(ProcessorType processorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PROCESSOR_TYPE,
				 processorType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueStatesForProcessorType",
				 PROCESSOR_TYPE__UNIQUE_STATES_FOR_PROCESSOR_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ProcessorTypeHasStates constraint of '<em>Processor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR_TYPE__PROCESSOR_TYPE_HAS_STATES__EEXPRESSION = "self.possibleStates->forAll( s|s.processorType = self)";

	/**
	 * Validates the ProcessorTypeHasStates constraint of '<em>Processor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorType_ProcessorTypeHasStates(ProcessorType processorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PROCESSOR_TYPE,
				 processorType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProcessorTypeHasStates",
				 PROCESSOR_TYPE__PROCESSOR_TYPE_HAS_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processor, diagnostics, context);
		if (result || diagnostics != null) result &= sensation_Common_MetamodelValidator.validateIdentifiable_UniqueIdentifiableInstance(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessor_ProcessorBelongsToIsland(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessor_ProcessorInValidState(processor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProcessorBelongsToIsland constraint of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR__PROCESSOR_BELONGS_TO_ISLAND__EEXPRESSION = "self.island.processors->includes(self)";

	/**
	 * Validates the ProcessorBelongsToIsland constraint of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor_ProcessorBelongsToIsland(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PROCESSOR,
				 processor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProcessorBelongsToIsland",
				 PROCESSOR__PROCESSOR_BELONGS_TO_ISLAND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ProcessorInValidState constraint of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR__PROCESSOR_IN_VALID_STATE__EEXPRESSION = "self.type.possibleStates->includes(self.initialState)";

	/**
	 * Validates the ProcessorInValidState constraint of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor_ProcessorInValidState(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PROCESSOR,
				 processor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProcessorInValidState",
				 PROCESSOR__PROCESSOR_IN_VALID_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorState(ProcessorState processorState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processorState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= sensation_Common_MetamodelValidator.validateIdentifiable_UniqueIdentifiableInstance(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessorState_StateBelongsToProcessorType(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessorState_SourceOfStateChange(processorState, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessorState_UniqueStateChange(processorState, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StateBelongsToProcessorType constraint of '<em>Processor State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR_STATE__STATE_BELONGS_TO_PROCESSOR_TYPE__EEXPRESSION = "self.processorType.possibleStates->includes(self)";

	/**
	 * Validates the StateBelongsToProcessorType constraint of '<em>Processor State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorState_StateBelongsToProcessorType(ProcessorState processorState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PROCESSOR_STATE,
				 processorState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "StateBelongsToProcessorType",
				 PROCESSOR_STATE__STATE_BELONGS_TO_PROCESSOR_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SourceOfStateChange constraint of '<em>Processor State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR_STATE__SOURCE_OF_STATE_CHANGE__EEXPRESSION = "self.possibleStateChanges->forAll (psc | psc.source = self)";

	/**
	 * Validates the SourceOfStateChange constraint of '<em>Processor State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorState_SourceOfStateChange(ProcessorState processorState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PROCESSOR_STATE,
				 processorState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SourceOfStateChange",
				 PROCESSOR_STATE__SOURCE_OF_STATE_CHANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueStateChange constraint of '<em>Processor State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR_STATE__UNIQUE_STATE_CHANGE__EEXPRESSION = "self.possibleStateChanges->forAll(sc1, sc2 | sc1 <> sc2 implies sc1.source <>  sc2.source or sc1.target <>  sc2.target)";

	/**
	 * Validates the UniqueStateChange constraint of '<em>Processor State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorState_UniqueStateChange(ProcessorState processorState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PROCESSOR_STATE,
				 processorState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueStateChange",
				 PROCESSOR_STATE__UNIQUE_STATE_CHANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorStateChange(ProcessorStateChange processorStateChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processorStateChange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processorStateChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processorStateChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processorStateChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processorStateChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processorStateChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processorStateChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processorStateChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processorStateChange, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessorStateChange_ValidStateChanges(processorStateChange, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessorStateChange_PossibleTransitions(processorStateChange, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidStateChanges constraint of '<em>Processor State Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR_STATE_CHANGE__VALID_STATE_CHANGES__EEXPRESSION = "self.source.processorType = self.target.processorType";

	/**
	 * Validates the ValidStateChanges constraint of '<em>Processor State Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorStateChange_ValidStateChanges(ProcessorStateChange processorStateChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PROCESSOR_STATE_CHANGE,
				 processorStateChange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidStateChanges",
				 PROCESSOR_STATE_CHANGE__VALID_STATE_CHANGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PossibleTransitions constraint of '<em>Processor State Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR_STATE_CHANGE__POSSIBLE_TRANSITIONS__EEXPRESSION = "self.source <> self.target";

	/**
	 * Validates the PossibleTransitions constraint of '<em>Processor State Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorStateChange_PossibleTransitions(ProcessorStateChange processorStateChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Platform_MetamodelPackage.Literals.PROCESSOR_STATE_CHANGE,
				 processorStateChange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PossibleTransitions",
				 PROCESSOR_STATE_CHANGE__POSSIBLE_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Platform_MetamodelValidator
