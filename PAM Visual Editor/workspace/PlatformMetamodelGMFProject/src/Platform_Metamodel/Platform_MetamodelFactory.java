/**
 */
package Platform_Metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Platform_Metamodel.Platform_MetamodelPackage
 * @generated
 */
public interface Platform_MetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Platform_MetamodelFactory eINSTANCE = Platform_Metamodel.impl.Platform_MetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Platform Application Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Application Model Root</em>'.
	 * @generated
	 */
	PlatformApplicationModelRoot createPlatformApplicationModelRoot();

	/**
	 * Returns a new object of class '<em>Voltage Frequency Island</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voltage Frequency Island</em>'.
	 * @generated
	 */
	VoltageFrequencyIsland createVoltageFrequencyIsland();

	/**
	 * Returns a new object of class '<em>Processor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor Type</em>'.
	 * @generated
	 */
	ProcessorType createProcessorType();

	/**
	 * Returns a new object of class '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor</em>'.
	 * @generated
	 */
	Processor createProcessor();

	/**
	 * Returns a new object of class '<em>Processor State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor State</em>'.
	 * @generated
	 */
	ProcessorState createProcessorState();

	/**
	 * Returns a new object of class '<em>Processor State Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor State Change</em>'.
	 * @generated
	 */
	ProcessorStateChange createProcessorStateChange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Platform_MetamodelPackage getPlatform_MetamodelPackage();

} //Platform_MetamodelFactory
