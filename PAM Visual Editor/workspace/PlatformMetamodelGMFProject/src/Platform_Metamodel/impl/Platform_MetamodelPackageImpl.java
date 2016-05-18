/**
 */
package Platform_Metamodel.impl;

import Platform_Metamodel.PlatformApplicationModelRoot;
import Platform_Metamodel.Platform_MetamodelFactory;
import Platform_Metamodel.Platform_MetamodelPackage;
import Platform_Metamodel.Processor;
import Platform_Metamodel.ProcessorState;
import Platform_Metamodel.ProcessorStateChange;
import Platform_Metamodel.ProcessorType;
import Platform_Metamodel.VoltageFrequencyIsland;

import Platform_Metamodel.util.Platform_MetamodelValidator;

import Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage;

import Sensation_Common_Metamodel.impl.Sensation_Common_MetamodelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Platform_MetamodelPackageImpl extends EPackageImpl implements Platform_MetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformApplicationModelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageFrequencyIslandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorStateChangeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Platform_Metamodel.Platform_MetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Platform_MetamodelPackageImpl() {
		super(eNS_URI, Platform_MetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Platform_MetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Platform_MetamodelPackage init() {
		if (isInited) return (Platform_MetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(Platform_MetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Platform_MetamodelPackageImpl thePlatform_MetamodelPackage = (Platform_MetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Platform_MetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Platform_MetamodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Sensation_Common_MetamodelPackageImpl theSensation_Common_MetamodelPackage = (Sensation_Common_MetamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sensation_Common_MetamodelPackage.eNS_URI) instanceof Sensation_Common_MetamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sensation_Common_MetamodelPackage.eNS_URI) : Sensation_Common_MetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		thePlatform_MetamodelPackage.createPackageContents();
		theSensation_Common_MetamodelPackage.createPackageContents();

		// Initialize created meta-data
		thePlatform_MetamodelPackage.initializePackageContents();
		theSensation_Common_MetamodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePlatform_MetamodelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Platform_MetamodelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePlatform_MetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Platform_MetamodelPackage.eNS_URI, thePlatform_MetamodelPackage);
		return thePlatform_MetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformApplicationModelRoot() {
		return platformApplicationModelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformApplicationModelRoot_Islands() {
		return (EReference)platformApplicationModelRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformApplicationModelRoot_ProcessorTypes() {
		return (EReference)platformApplicationModelRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformApplicationModelRoot_Processors() {
		return (EReference)platformApplicationModelRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoltageFrequencyIsland() {
		return voltageFrequencyIslandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoltageFrequencyIsland_Processors() {
		return (EReference)voltageFrequencyIslandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorType() {
		return processorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorType_PossibleStates() {
		return (EReference)processorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_InitialState() {
		return (EReference)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_PType() {
		return (EReference)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_VfIsland() {
		return (EReference)processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorState() {
		return processorStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorState_PossibleStateChanges() {
		return (EReference)processorStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorState_ProcessorType() {
		return (EReference)processorStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorState_IsWorking() {
		return (EAttribute)processorStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorState_Frequency() {
		return (EAttribute)processorStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorState_PowerConsumption() {
		return (EAttribute)processorStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorStateChange() {
		return processorStateChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorStateChange_Source() {
		return (EReference)processorStateChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorStateChange_Target() {
		return (EReference)processorStateChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorStateChange_PowerCost() {
		return (EAttribute)processorStateChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_MetamodelFactory getPlatform_MetamodelFactory() {
		return (Platform_MetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		platformApplicationModelRootEClass = createEClass(PLATFORM_APPLICATION_MODEL_ROOT);
		createEReference(platformApplicationModelRootEClass, PLATFORM_APPLICATION_MODEL_ROOT__ISLANDS);
		createEReference(platformApplicationModelRootEClass, PLATFORM_APPLICATION_MODEL_ROOT__PROCESSOR_TYPES);
		createEReference(platformApplicationModelRootEClass, PLATFORM_APPLICATION_MODEL_ROOT__PROCESSORS);

		voltageFrequencyIslandEClass = createEClass(VOLTAGE_FREQUENCY_ISLAND);
		createEReference(voltageFrequencyIslandEClass, VOLTAGE_FREQUENCY_ISLAND__PROCESSORS);

		processorTypeEClass = createEClass(PROCESSOR_TYPE);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__POSSIBLE_STATES);

		processorEClass = createEClass(PROCESSOR);
		createEReference(processorEClass, PROCESSOR__INITIAL_STATE);
		createEReference(processorEClass, PROCESSOR__PTYPE);
		createEReference(processorEClass, PROCESSOR__VF_ISLAND);

		processorStateEClass = createEClass(PROCESSOR_STATE);
		createEReference(processorStateEClass, PROCESSOR_STATE__POSSIBLE_STATE_CHANGES);
		createEReference(processorStateEClass, PROCESSOR_STATE__PROCESSOR_TYPE);
		createEAttribute(processorStateEClass, PROCESSOR_STATE__IS_WORKING);
		createEAttribute(processorStateEClass, PROCESSOR_STATE__FREQUENCY);
		createEAttribute(processorStateEClass, PROCESSOR_STATE__POWER_CONSUMPTION);

		processorStateChangeEClass = createEClass(PROCESSOR_STATE_CHANGE);
		createEReference(processorStateChangeEClass, PROCESSOR_STATE_CHANGE__SOURCE);
		createEReference(processorStateChangeEClass, PROCESSOR_STATE_CHANGE__TARGET);
		createEAttribute(processorStateChangeEClass, PROCESSOR_STATE_CHANGE__POWER_COST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Sensation_Common_MetamodelPackage theSensation_Common_MetamodelPackage = (Sensation_Common_MetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(Sensation_Common_MetamodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		voltageFrequencyIslandEClass.getESuperTypes().add(theSensation_Common_MetamodelPackage.getIdentifiable());
		processorTypeEClass.getESuperTypes().add(theSensation_Common_MetamodelPackage.getIdentifiable());
		processorEClass.getESuperTypes().add(theSensation_Common_MetamodelPackage.getIdentifiable());
		processorStateEClass.getESuperTypes().add(theSensation_Common_MetamodelPackage.getIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(platformApplicationModelRootEClass, PlatformApplicationModelRoot.class, "PlatformApplicationModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformApplicationModelRoot_Islands(), this.getVoltageFrequencyIsland(), null, "islands", null, 1, -1, PlatformApplicationModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformApplicationModelRoot_ProcessorTypes(), this.getProcessorType(), null, "processorTypes", null, 1, -1, PlatformApplicationModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformApplicationModelRoot_Processors(), this.getProcessor(), null, "processors", null, 1, -1, PlatformApplicationModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voltageFrequencyIslandEClass, VoltageFrequencyIsland.class, "VoltageFrequencyIsland", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoltageFrequencyIsland_Processors(), this.getProcessor(), null, "processors", null, 0, -1, VoltageFrequencyIsland.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processorTypeEClass, ProcessorType.class, "ProcessorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorType_PossibleStates(), this.getProcessorState(), null, "possibleStates", null, 1, -1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessor_InitialState(), this.getProcessorState(), null, "initialState", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_PType(), this.getProcessorType(), null, "pType", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_VfIsland(), this.getVoltageFrequencyIsland(), null, "vfIsland", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorStateEClass, ProcessorState.class, "ProcessorState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorState_PossibleStateChanges(), this.getProcessorStateChange(), null, "possibleStateChanges", null, 0, -1, ProcessorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessorState_ProcessorType(), this.getProcessorType(), null, "processorType", null, 1, 1, ProcessorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorState_IsWorking(), ecorePackage.getEBoolean(), "isWorking", null, 1, 1, ProcessorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorState_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, ProcessorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorState_PowerConsumption(), ecorePackage.getEInt(), "powerConsumption", null, 0, 1, ProcessorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorStateChangeEClass, ProcessorStateChange.class, "ProcessorStateChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorStateChange_Source(), this.getProcessorState(), null, "source", null, 1, 1, ProcessorStateChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessorStateChange_Target(), this.getProcessorState(), null, "target", null, 1, 1, ProcessorStateChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorStateChange_PowerCost(), ecorePackage.getEInt(), "powerCost", null, 0, 1, ProcessorStateChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
		// gmf.label
		createGmf_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/",
			 "sensation_common_metamodel", "http://www.utwente.nl/sensation/sensation_common_metamodel.ecore#/"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (platformApplicationModelRootEClass, 
		   source, 
		   new String[] {
			 "constraints", "SingletonPlatformMetamodel"
		   });	
		addAnnotation
		  (voltageFrequencyIslandEClass, 
		   source, 
		   new String[] {
			 "constraints", "SingleAppearanceOnIsland IslandHasProcessors IslandFrequencyHomogenity"
		   });	
		addAnnotation
		  (processorTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueStatesForProcessorType ProcessorTypeHasStates"
		   });	
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProcessorBelongsToIsland ProcessorInValidState"
		   });	
		addAnnotation
		  (processorStateEClass, 
		   source, 
		   new String[] {
			 "constraints", "StateBelongsToProcessorType SourceOfStateChange UniqueStateChange"
		   });	
		addAnnotation
		  (processorStateChangeEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidStateChanges PossibleTransitions"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (platformApplicationModelRootEClass, 
		   source, 
		   new String[] {
			 "SingletonPlatformMetamodel", "self.oclType().allInstances()->size() = 1"
		   });	
		addAnnotation
		  (voltageFrequencyIslandEClass, 
		   source, 
		   new String[] {
			 "SingleAppearanceOnIsland", "self.processors->forAll(p1, p2 | p1 <> p2 implies p1.identifier <> p2.identifier)",
			 "IslandHasProcessors", "self.processors->forAll(p |p.island = self)",
			 "IslandFrequencyHomogenity", "self.processors.initialState->forAll(cs1, cs2 | cs1.frequency = cs2.frequency)"
		   });	
		addAnnotation
		  (processorTypeEClass, 
		   source, 
		   new String[] {
			 "UniqueStatesForProcessorType", "self.possibleStates->forAll(ps1, ps2 | ps1 <> ps2 implies ps1.frequency <>  ps2.frequency or ps1.isWorking <>  ps2.isWorking)",
			 "ProcessorTypeHasStates", "self.possibleStates->forAll( s|s.processorType = self)"
		   });	
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "ProcessorBelongsToIsland", "self.island.processors->includes(self)",
			 "ProcessorInValidState", "self.type.possibleStates->includes(self.initialState)"
		   });	
		addAnnotation
		  (processorStateEClass, 
		   source, 
		   new String[] {
			 "StateBelongsToProcessorType", "self.processorType.possibleStates->includes(self)",
			 "SourceOfStateChange", "self.possibleStateChanges->forAll (psc | psc.source = self)",
			 "UniqueStateChange", "self.possibleStateChanges->forAll(sc1, sc2 | sc1 <> sc2 implies sc1.source <>  sc2.source or sc1.target <>  sc2.target)"
		   });	
		addAnnotation
		  (processorStateChangeEClass, 
		   source, 
		   new String[] {
			 "ValidStateChanges", "self.source.processorType = self.target.processorType",
			 "PossibleTransitions", "self.source <> self.target"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (platformApplicationModelRootEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (voltageFrequencyIslandEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.VoltageFrequencyIslandFigure",
			 "label.icon", "false",
			 "label", "identifier",
			 "resizable", "true",
			 "size", "70,70",
			 "label.placement", "external",
			 "tool.name", "Voltage Frequency Island"
		   });	
		addAnnotation
		  (processorTypeEClass, 
		   source, 
		   new String[] {
			 "label.icon", "true",
			 "label", "identifier",
			 "resizable", "true",
			 "size", "70,70",
			 "label.placement", "external",
			 "tool.name", "Processor Type",
			 "tool.small.path", "icons/processor_type_icon.gif",
			 "tool.large.path", "icons/processor_type_icon.gif"
		   });	
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ProcessorFigure",
			 "label.icon", "false",
			 "label", "identifier",
			 "resizable", "true",
			 "size", "70,70",
			 "label.placement", "external",
			 "tool.name", "Processor"
		   });	
		addAnnotation
		  (processorStateEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "figure", "ellipse",
			 "label", "identifier",
			 "resizable", "true",
			 "label.placement", "external",
			 "tool.name", "Processor State",
			 "tool.small.path", "icons/ps_s.gif",
			 "tool.large.path", "icons/ps_l.gif"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getProcessorType_PossibleStates(), 
		   source, 
		   new String[] {
			 "layout", "free",
			 "collapsible", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getProcessor_PType(), 
		   source, 
		   new String[] {
			 "label.text", "type",
			 "target.decoration", "closedarrow",
			 "tool.name", "Processor->Processor Type",
			 "tool.small.path", "icons/p2pt.gif",
			 "tool.large.path", "icons/p2pt.gif"
		   });	
		addAnnotation
		  (getProcessor_VfIsland(), 
		   source, 
		   new String[] {
			 "label.text", "island",
			 "target.decoration", "filledclosedarrow",
			 "tool.name", "Processor->Voltage Frequency Island",
			 "tool.small.path", "icons/p2is.gif",
			 "tool.large.path", "icons/p2is.gif"
		   });	
		addAnnotation
		  (processorStateChangeEClass, 
		   source, 
		   new String[] {
			 "label", "powerCost",
			 "source", "source",
			 "target", "target",
			 "target.decoration", "filledclosedarrow",
			 "tool.name", "Processor State Change",
			 "tool.small.path", "icons/psc.gif",
			 "tool.large.path", "icons/psc.gif"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.label";	
		addAnnotation
		  (getProcessorState_IsWorking(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProcessorState_Frequency(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProcessorState_PowerConsumption(), 
		   source, 
		   new String[] {
		   });
	}

} //Platform_MetamodelPackageImpl
