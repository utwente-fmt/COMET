/**
 */
package Platform_Metamodel;

import Sensation_Common_Metamodel.Identifiable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OCL Constraint: Unique States for a ProcessorType: No two elements of a possibleStates list of a ProcessorType can be the same. An element of this set is uniquely defined with its two properties: frequency and isWorking.
 * OCL Constraint: ProcessorType has states: All the items' processorType reference in possibleStates list of a ProcessorType must be pointing to this ProcessorType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Platform_Metamodel.ProcessorType#getPossibleStates <em>Possible States</em>}</li>
 * </ul>
 * </p>
 *
 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueStatesForProcessorType ProcessorTypeHasStates'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueStatesForProcessorType='self.possibleStates->forAll(ps1, ps2 | ps1 <> ps2 implies ps1.frequency <>  ps2.frequency or ps1.isWorking <>  ps2.isWorking)' ProcessorTypeHasStates='self.possibleStates->forAll( s|s.processorType = self)'"
 *        annotation="gmf.node label.icon='true' label='identifier' resizable='true' size='70,70' label.placement='external' tool.name='Processor Type' tool.small.path='icons/processor_type_icon.gif' tool.large.path='icons/processor_type_icon.gif'"
 * @generated
 */
public interface ProcessorType extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Possible States</b></em>' containment reference list.
	 * The list contents are of type {@link Platform_Metamodel.ProcessorState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible States</em>' containment reference list.
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorType_PossibleStates()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='free' collapsible='false'"
	 * @generated
	 */
	EList<ProcessorState> getPossibleStates();

} // ProcessorType
