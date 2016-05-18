/**
 */
package Platform_Metamodel;

import Sensation_Common_Metamodel.Identifiable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OCL Constraint: State belongs to ProcessorType: A FrequencyPowerRelation must be in possibleStates list of its referenced ProcessorType.
 * OCL Constraint: Source of State Change: FrequencyPowerRelation defines a list for possible state changes from this instance. Source reference of all the items in the list must be this instance.
 * OCL Constraint: Possible Transition Count: The number of possible transitions from an idle state of a processor is between [1..3]. The number of possible transitions from a working state of a processor is 1.
 * OCL Constraint: Unique State Change: No two elements of possibleStateChanges list of a FrequencyPowerRelation can be the same. An element of this set is uniquely defined with its two properties: source and target.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Platform_Metamodel.ProcessorState#getPossibleStateChanges <em>Possible State Changes</em>}</li>
 *   <li>{@link Platform_Metamodel.ProcessorState#getProcessorType <em>Processor Type</em>}</li>
 *   <li>{@link Platform_Metamodel.ProcessorState#isIsWorking <em>Is Working</em>}</li>
 *   <li>{@link Platform_Metamodel.ProcessorState#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link Platform_Metamodel.ProcessorState#getPowerConsumption <em>Power Consumption</em>}</li>
 * </ul>
 * </p>
 *
 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StateBelongsToProcessorType SourceOfStateChange UniqueStateChange'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StateBelongsToProcessorType='self.processorType.possibleStates->includes(self)' SourceOfStateChange='self.possibleStateChanges->forAll (psc | psc.source = self)' UniqueStateChange='self.possibleStateChanges->forAll(sc1, sc2 | sc1 <> sc2 implies sc1.source <>  sc2.source or sc1.target <>  sc2.target)'"
 *        annotation="gmf.node label.icon='false' figure='ellipse' label='identifier' resizable='true' label.placement='external' tool.name='Processor State' tool.small.path='icons/ps_s.gif' tool.large.path='icons/ps_l.gif'"
 * @generated
 */
public interface ProcessorState extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Possible State Changes</b></em>' containment reference list.
	 * The list contents are of type {@link Platform_Metamodel.ProcessorStateChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible State Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible State Changes</em>' containment reference list.
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorState_PossibleStateChanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessorStateChange> getPossibleStateChanges();

	/**
	 * Returns the value of the '<em><b>Processor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Type</em>' reference.
	 * @see #setProcessorType(ProcessorType)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorState_ProcessorType()
	 * @model required="true"
	 * @generated
	 */
	ProcessorType getProcessorType();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.ProcessorState#getProcessorType <em>Processor Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Type</em>' reference.
	 * @see #getProcessorType()
	 * @generated
	 */
	void setProcessorType(ProcessorType value);

	/**
	 * Returns the value of the '<em><b>Is Working</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Working</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Working</em>' attribute.
	 * @see #setIsWorking(boolean)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorState_IsWorking()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsWorking();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.ProcessorState#isIsWorking <em>Is Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Working</em>' attribute.
	 * @see #isIsWorking()
	 * @generated
	 */
	void setIsWorking(boolean value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorState_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.ProcessorState#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Power Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Consumption</em>' attribute.
	 * @see #setPowerConsumption(int)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorState_PowerConsumption()
	 * @model
	 * @generated
	 */
	int getPowerConsumption();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.ProcessorState#getPowerConsumption <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Consumption</em>' attribute.
	 * @see #getPowerConsumption()
	 * @generated
	 */
	void setPowerConsumption(int value);

} // ProcessorState
