/**
 */
package Sensation_Common_Metamodel.impl;

import Platform_Metamodel.Platform_MetamodelPackage;

import Platform_Metamodel.impl.Platform_MetamodelPackageImpl;

import Sensation_Common_Metamodel.Identifiable;
import Sensation_Common_Metamodel.Sensation_Common_MetamodelFactory;
import Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage;

import Sensation_Common_Metamodel.util.Sensation_Common_MetamodelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sensation_Common_MetamodelPackageImpl extends EPackageImpl implements Sensation_Common_MetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

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
	 * @see Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Sensation_Common_MetamodelPackageImpl() {
		super(eNS_URI, Sensation_Common_MetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Sensation_Common_MetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Sensation_Common_MetamodelPackage init() {
		if (isInited) return (Sensation_Common_MetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(Sensation_Common_MetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Sensation_Common_MetamodelPackageImpl theSensation_Common_MetamodelPackage = (Sensation_Common_MetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Sensation_Common_MetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Sensation_Common_MetamodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Platform_MetamodelPackageImpl thePlatform_MetamodelPackage = (Platform_MetamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Platform_MetamodelPackage.eNS_URI) instanceof Platform_MetamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Platform_MetamodelPackage.eNS_URI) : Platform_MetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theSensation_Common_MetamodelPackage.createPackageContents();
		thePlatform_MetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theSensation_Common_MetamodelPackage.initializePackageContents();
		thePlatform_MetamodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSensation_Common_MetamodelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Sensation_Common_MetamodelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSensation_Common_MetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Sensation_Common_MetamodelPackage.eNS_URI, theSensation_Common_MetamodelPackage);
		return theSensation_Common_MetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Identifier() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensation_Common_MetamodelFactory getSensation_Common_MetamodelFactory() {
		return (Sensation_Common_MetamodelFactory)getEFactoryInstance();
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
		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__IDENTIFIER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
		  (identifiableEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueIdentifiableInstance"
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
		  (identifiableEClass, 
		   source, 
		   new String[] {
			 "UniqueIdentifiableInstance", "self.oclType().allInstances()->forAll(id1, id2 |id1 <> id2 implies id1.identifier <> id2.identifier)"
		   });
	}

} //Sensation_Common_MetamodelPackageImpl
