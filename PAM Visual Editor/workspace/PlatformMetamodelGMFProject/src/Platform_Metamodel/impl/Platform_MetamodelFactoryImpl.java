/**
 */
package Platform_Metamodel.impl;

import Platform_Metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Platform_MetamodelFactoryImpl extends EFactoryImpl implements Platform_MetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Platform_MetamodelFactory init() {
		try {
			Platform_MetamodelFactory thePlatform_MetamodelFactory = (Platform_MetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(Platform_MetamodelPackage.eNS_URI);
			if (thePlatform_MetamodelFactory != null) {
				return thePlatform_MetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Platform_MetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_MetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT: return createPlatformApplicationModelRoot();
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND: return createVoltageFrequencyIsland();
			case Platform_MetamodelPackage.PROCESSOR_TYPE: return createProcessorType();
			case Platform_MetamodelPackage.PROCESSOR: return createProcessor();
			case Platform_MetamodelPackage.PROCESSOR_STATE: return createProcessorState();
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE: return createProcessorStateChange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformApplicationModelRoot createPlatformApplicationModelRoot() {
		PlatformApplicationModelRootImpl platformApplicationModelRoot = new PlatformApplicationModelRootImpl();
		return platformApplicationModelRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageFrequencyIsland createVoltageFrequencyIsland() {
		VoltageFrequencyIslandImpl voltageFrequencyIsland = new VoltageFrequencyIslandImpl();
		return voltageFrequencyIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorType createProcessorType() {
		ProcessorTypeImpl processorType = new ProcessorTypeImpl();
		return processorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorState createProcessorState() {
		ProcessorStateImpl processorState = new ProcessorStateImpl();
		return processorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorStateChange createProcessorStateChange() {
		ProcessorStateChangeImpl processorStateChange = new ProcessorStateChangeImpl();
		return processorStateChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_MetamodelPackage getPlatform_MetamodelPackage() {
		return (Platform_MetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Platform_MetamodelPackage getPackage() {
		return Platform_MetamodelPackage.eINSTANCE;
	}

} //Platform_MetamodelFactoryImpl
