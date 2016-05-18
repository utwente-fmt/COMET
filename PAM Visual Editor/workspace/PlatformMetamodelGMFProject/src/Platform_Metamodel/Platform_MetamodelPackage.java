/**
 */
package Platform_Metamodel;

import Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Platform_Metamodel.Platform_MetamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/' sensation_common_metamodel='http://www.utwente.nl/sensation/sensation_common_metamodel.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Platform_MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Platform_Metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.utwente.nl/sensation/platform_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platform_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Platform_MetamodelPackage eINSTANCE = Platform_Metamodel.impl.Platform_MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Platform_Metamodel.impl.PlatformApplicationModelRootImpl <em>Platform Application Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Platform_Metamodel.impl.PlatformApplicationModelRootImpl
	 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getPlatformApplicationModelRoot()
	 * @generated
	 */
	int PLATFORM_APPLICATION_MODEL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Islands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_APPLICATION_MODEL_ROOT__ISLANDS = 0;

	/**
	 * The feature id for the '<em><b>Processor Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_APPLICATION_MODEL_ROOT__PROCESSOR_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_APPLICATION_MODEL_ROOT__PROCESSORS = 2;

	/**
	 * The number of structural features of the '<em>Platform Application Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_APPLICATION_MODEL_ROOT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Platform_Metamodel.impl.VoltageFrequencyIslandImpl <em>Voltage Frequency Island</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Platform_Metamodel.impl.VoltageFrequencyIslandImpl
	 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getVoltageFrequencyIsland()
	 * @generated
	 */
	int VOLTAGE_FREQUENCY_ISLAND = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_FREQUENCY_ISLAND__IDENTIFIER = Sensation_Common_MetamodelPackage.IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_FREQUENCY_ISLAND__PROCESSORS = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Voltage Frequency Island</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_FREQUENCY_ISLAND_FEATURE_COUNT = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Platform_Metamodel.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Platform_Metamodel.impl.ProcessorTypeImpl
	 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getProcessorType()
	 * @generated
	 */
	int PROCESSOR_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__IDENTIFIER = Sensation_Common_MetamodelPackage.IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Possible States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__POSSIBLE_STATES = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Processor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE_FEATURE_COUNT = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Platform_Metamodel.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Platform_Metamodel.impl.ProcessorImpl
	 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__IDENTIFIER = Sensation_Common_MetamodelPackage.IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__INITIAL_STATE = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PTYPE = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vf Island</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__VF_ISLAND = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Platform_Metamodel.impl.ProcessorStateImpl <em>Processor State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Platform_Metamodel.impl.ProcessorStateImpl
	 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getProcessorState()
	 * @generated
	 */
	int PROCESSOR_STATE = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE__IDENTIFIER = Sensation_Common_MetamodelPackage.IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Possible State Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE__POSSIBLE_STATE_CHANGES = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE__PROCESSOR_TYPE = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Working</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE__IS_WORKING = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE__FREQUENCY = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Power Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE__POWER_CONSUMPTION = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Processor State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE_FEATURE_COUNT = Sensation_Common_MetamodelPackage.IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link Platform_Metamodel.impl.ProcessorStateChangeImpl <em>Processor State Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Platform_Metamodel.impl.ProcessorStateChangeImpl
	 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getProcessorStateChange()
	 * @generated
	 */
	int PROCESSOR_STATE_CHANGE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE_CHANGE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE_CHANGE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Power Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE_CHANGE__POWER_COST = 2;

	/**
	 * The number of structural features of the '<em>Processor State Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_STATE_CHANGE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link Platform_Metamodel.PlatformApplicationModelRoot <em>Platform Application Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Application Model Root</em>'.
	 * @see Platform_Metamodel.PlatformApplicationModelRoot
	 * @generated
	 */
	EClass getPlatformApplicationModelRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link Platform_Metamodel.PlatformApplicationModelRoot#getIslands <em>Islands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Islands</em>'.
	 * @see Platform_Metamodel.PlatformApplicationModelRoot#getIslands()
	 * @see #getPlatformApplicationModelRoot()
	 * @generated
	 */
	EReference getPlatformApplicationModelRoot_Islands();

	/**
	 * Returns the meta object for the containment reference list '{@link Platform_Metamodel.PlatformApplicationModelRoot#getProcessorTypes <em>Processor Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor Types</em>'.
	 * @see Platform_Metamodel.PlatformApplicationModelRoot#getProcessorTypes()
	 * @see #getPlatformApplicationModelRoot()
	 * @generated
	 */
	EReference getPlatformApplicationModelRoot_ProcessorTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link Platform_Metamodel.PlatformApplicationModelRoot#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see Platform_Metamodel.PlatformApplicationModelRoot#getProcessors()
	 * @see #getPlatformApplicationModelRoot()
	 * @generated
	 */
	EReference getPlatformApplicationModelRoot_Processors();

	/**
	 * Returns the meta object for class '{@link Platform_Metamodel.VoltageFrequencyIsland <em>Voltage Frequency Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Frequency Island</em>'.
	 * @see Platform_Metamodel.VoltageFrequencyIsland
	 * @generated
	 */
	EClass getVoltageFrequencyIsland();

	/**
	 * Returns the meta object for the reference list '{@link Platform_Metamodel.VoltageFrequencyIsland#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processors</em>'.
	 * @see Platform_Metamodel.VoltageFrequencyIsland#getProcessors()
	 * @see #getVoltageFrequencyIsland()
	 * @generated
	 */
	EReference getVoltageFrequencyIsland_Processors();

	/**
	 * Returns the meta object for class '{@link Platform_Metamodel.ProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Type</em>'.
	 * @see Platform_Metamodel.ProcessorType
	 * @generated
	 */
	EClass getProcessorType();

	/**
	 * Returns the meta object for the containment reference list '{@link Platform_Metamodel.ProcessorType#getPossibleStates <em>Possible States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible States</em>'.
	 * @see Platform_Metamodel.ProcessorType#getPossibleStates()
	 * @see #getProcessorType()
	 * @generated
	 */
	EReference getProcessorType_PossibleStates();

	/**
	 * Returns the meta object for class '{@link Platform_Metamodel.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see Platform_Metamodel.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the reference '{@link Platform_Metamodel.Processor#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see Platform_Metamodel.Processor#getInitialState()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_InitialState();

	/**
	 * Returns the meta object for the reference '{@link Platform_Metamodel.Processor#getPType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PType</em>'.
	 * @see Platform_Metamodel.Processor#getPType()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_PType();

	/**
	 * Returns the meta object for the reference '{@link Platform_Metamodel.Processor#getVfIsland <em>Vf Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vf Island</em>'.
	 * @see Platform_Metamodel.Processor#getVfIsland()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_VfIsland();

	/**
	 * Returns the meta object for class '{@link Platform_Metamodel.ProcessorState <em>Processor State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor State</em>'.
	 * @see Platform_Metamodel.ProcessorState
	 * @generated
	 */
	EClass getProcessorState();

	/**
	 * Returns the meta object for the containment reference list '{@link Platform_Metamodel.ProcessorState#getPossibleStateChanges <em>Possible State Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible State Changes</em>'.
	 * @see Platform_Metamodel.ProcessorState#getPossibleStateChanges()
	 * @see #getProcessorState()
	 * @generated
	 */
	EReference getProcessorState_PossibleStateChanges();

	/**
	 * Returns the meta object for the reference '{@link Platform_Metamodel.ProcessorState#getProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor Type</em>'.
	 * @see Platform_Metamodel.ProcessorState#getProcessorType()
	 * @see #getProcessorState()
	 * @generated
	 */
	EReference getProcessorState_ProcessorType();

	/**
	 * Returns the meta object for the attribute '{@link Platform_Metamodel.ProcessorState#isIsWorking <em>Is Working</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Working</em>'.
	 * @see Platform_Metamodel.ProcessorState#isIsWorking()
	 * @see #getProcessorState()
	 * @generated
	 */
	EAttribute getProcessorState_IsWorking();

	/**
	 * Returns the meta object for the attribute '{@link Platform_Metamodel.ProcessorState#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see Platform_Metamodel.ProcessorState#getFrequency()
	 * @see #getProcessorState()
	 * @generated
	 */
	EAttribute getProcessorState_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link Platform_Metamodel.ProcessorState#getPowerConsumption <em>Power Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Consumption</em>'.
	 * @see Platform_Metamodel.ProcessorState#getPowerConsumption()
	 * @see #getProcessorState()
	 * @generated
	 */
	EAttribute getProcessorState_PowerConsumption();

	/**
	 * Returns the meta object for class '{@link Platform_Metamodel.ProcessorStateChange <em>Processor State Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor State Change</em>'.
	 * @see Platform_Metamodel.ProcessorStateChange
	 * @generated
	 */
	EClass getProcessorStateChange();

	/**
	 * Returns the meta object for the reference '{@link Platform_Metamodel.ProcessorStateChange#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Platform_Metamodel.ProcessorStateChange#getSource()
	 * @see #getProcessorStateChange()
	 * @generated
	 */
	EReference getProcessorStateChange_Source();

	/**
	 * Returns the meta object for the reference '{@link Platform_Metamodel.ProcessorStateChange#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Platform_Metamodel.ProcessorStateChange#getTarget()
	 * @see #getProcessorStateChange()
	 * @generated
	 */
	EReference getProcessorStateChange_Target();

	/**
	 * Returns the meta object for the attribute '{@link Platform_Metamodel.ProcessorStateChange#getPowerCost <em>Power Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Cost</em>'.
	 * @see Platform_Metamodel.ProcessorStateChange#getPowerCost()
	 * @see #getProcessorStateChange()
	 * @generated
	 */
	EAttribute getProcessorStateChange_PowerCost();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Platform_MetamodelFactory getPlatform_MetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Platform_Metamodel.impl.PlatformApplicationModelRootImpl <em>Platform Application Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Platform_Metamodel.impl.PlatformApplicationModelRootImpl
		 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getPlatformApplicationModelRoot()
		 * @generated
		 */
		EClass PLATFORM_APPLICATION_MODEL_ROOT = eINSTANCE.getPlatformApplicationModelRoot();

		/**
		 * The meta object literal for the '<em><b>Islands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_APPLICATION_MODEL_ROOT__ISLANDS = eINSTANCE.getPlatformApplicationModelRoot_Islands();

		/**
		 * The meta object literal for the '<em><b>Processor Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_APPLICATION_MODEL_ROOT__PROCESSOR_TYPES = eINSTANCE.getPlatformApplicationModelRoot_ProcessorTypes();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_APPLICATION_MODEL_ROOT__PROCESSORS = eINSTANCE.getPlatformApplicationModelRoot_Processors();

		/**
		 * The meta object literal for the '{@link Platform_Metamodel.impl.VoltageFrequencyIslandImpl <em>Voltage Frequency Island</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Platform_Metamodel.impl.VoltageFrequencyIslandImpl
		 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getVoltageFrequencyIsland()
		 * @generated
		 */
		EClass VOLTAGE_FREQUENCY_ISLAND = eINSTANCE.getVoltageFrequencyIsland();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLTAGE_FREQUENCY_ISLAND__PROCESSORS = eINSTANCE.getVoltageFrequencyIsland_Processors();

		/**
		 * The meta object literal for the '{@link Platform_Metamodel.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Platform_Metamodel.impl.ProcessorTypeImpl
		 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getProcessorType()
		 * @generated
		 */
		EClass PROCESSOR_TYPE = eINSTANCE.getProcessorType();

		/**
		 * The meta object literal for the '<em><b>Possible States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_TYPE__POSSIBLE_STATES = eINSTANCE.getProcessorType_PossibleStates();

		/**
		 * The meta object literal for the '{@link Platform_Metamodel.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Platform_Metamodel.impl.ProcessorImpl
		 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__INITIAL_STATE = eINSTANCE.getProcessor_InitialState();

		/**
		 * The meta object literal for the '<em><b>PType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__PTYPE = eINSTANCE.getProcessor_PType();

		/**
		 * The meta object literal for the '<em><b>Vf Island</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__VF_ISLAND = eINSTANCE.getProcessor_VfIsland();

		/**
		 * The meta object literal for the '{@link Platform_Metamodel.impl.ProcessorStateImpl <em>Processor State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Platform_Metamodel.impl.ProcessorStateImpl
		 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getProcessorState()
		 * @generated
		 */
		EClass PROCESSOR_STATE = eINSTANCE.getProcessorState();

		/**
		 * The meta object literal for the '<em><b>Possible State Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_STATE__POSSIBLE_STATE_CHANGES = eINSTANCE.getProcessorState_PossibleStateChanges();

		/**
		 * The meta object literal for the '<em><b>Processor Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_STATE__PROCESSOR_TYPE = eINSTANCE.getProcessorState_ProcessorType();

		/**
		 * The meta object literal for the '<em><b>Is Working</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_STATE__IS_WORKING = eINSTANCE.getProcessorState_IsWorking();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_STATE__FREQUENCY = eINSTANCE.getProcessorState_Frequency();

		/**
		 * The meta object literal for the '<em><b>Power Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_STATE__POWER_CONSUMPTION = eINSTANCE.getProcessorState_PowerConsumption();

		/**
		 * The meta object literal for the '{@link Platform_Metamodel.impl.ProcessorStateChangeImpl <em>Processor State Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Platform_Metamodel.impl.ProcessorStateChangeImpl
		 * @see Platform_Metamodel.impl.Platform_MetamodelPackageImpl#getProcessorStateChange()
		 * @generated
		 */
		EClass PROCESSOR_STATE_CHANGE = eINSTANCE.getProcessorStateChange();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_STATE_CHANGE__SOURCE = eINSTANCE.getProcessorStateChange_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_STATE_CHANGE__TARGET = eINSTANCE.getProcessorStateChange_Target();

		/**
		 * The meta object literal for the '<em><b>Power Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_STATE_CHANGE__POWER_COST = eINSTANCE.getProcessorStateChange_PowerCost();

	}

} //Platform_MetamodelPackage
