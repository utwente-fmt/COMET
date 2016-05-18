/**
 */
package Platform_Metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Application Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OCL Constraint: Single appearance in an island: One  processor can have only one reference per island.
 * OCL Constraint: Island has processors:  All the items?s island reference in processorList of a VoltageFrequencyIsland must point to this island.
 * OCL Constraint: Island frequency homogenity: All the processor in the same island run at the same frequency, no matter working or idle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Platform_Metamodel.PlatformApplicationModelRoot#getIslands <em>Islands</em>}</li>
 *   <li>{@link Platform_Metamodel.PlatformApplicationModelRoot#getProcessorTypes <em>Processor Types</em>}</li>
 *   <li>{@link Platform_Metamodel.PlatformApplicationModelRoot#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @see Platform_Metamodel.Platform_MetamodelPackage#getPlatformApplicationModelRoot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingletonPlatformMetamodel'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SingletonPlatformMetamodel='self.oclType().allInstances()->size() = 1'"
 * @generated
 */
public interface PlatformApplicationModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Islands</b></em>' containment reference list.
	 * The list contents are of type {@link Platform_Metamodel.VoltageFrequencyIsland}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Islands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Islands</em>' containment reference list.
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getPlatformApplicationModelRoot_Islands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VoltageFrequencyIsland> getIslands();

	/**
	 * Returns the value of the '<em><b>Processor Types</b></em>' containment reference list.
	 * The list contents are of type {@link Platform_Metamodel.ProcessorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Types</em>' containment reference list.
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getPlatformApplicationModelRoot_ProcessorTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcessorType> getProcessorTypes();

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link Platform_Metamodel.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getPlatformApplicationModelRoot_Processors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

} // PlatformApplicationModelRoot
