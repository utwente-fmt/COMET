/**
 */
package Platform_Metamodel;

import Sensation_Common_Metamodel.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OCL Constraint: Processor belongs to an island: A processor must be in processorList of its referenced island.
 * OCL Constraint: Processor in valid state: A processor can be only in a state that is in possibleStates list of its ProcessorType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Platform_Metamodel.Processor#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link Platform_Metamodel.Processor#getPType <em>PType</em>}</li>
 *   <li>{@link Platform_Metamodel.Processor#getVfIsland <em>Vf Island</em>}</li>
 * </ul>
 * </p>
 *
 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProcessorBelongsToIsland ProcessorInValidState'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProcessorBelongsToIsland='self.island.processors->includes(self)' ProcessorInValidState='self.type.possibleStates->includes(self.initialState)'"
 *        annotation="gmf.node figure='figures.ProcessorFigure' label.icon='false' label='identifier' resizable='true' size='70,70' label.placement='external' tool.name='Processor'"
 * @generated
 */
public interface Processor extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(ProcessorState)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessor_InitialState()
	 * @model required="true"
	 * @generated
	 */
	ProcessorState getInitialState();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.Processor#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(ProcessorState value);

	/**
	 * Returns the value of the '<em><b>PType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PType</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PType</em>' reference.
	 * @see #setPType(ProcessorType)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessor_PType()
	 * @model required="true"
	 *        annotation="gmf.link label.text='type' target.decoration='closedarrow' tool.name='Processor->Processor Type' tool.small.path='icons/p2pt.gif' tool.large.path='icons/p2pt.gif'"
	 * @generated
	 */
	ProcessorType getPType();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.Processor#getPType <em>PType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PType</em>' reference.
	 * @see #getPType()
	 * @generated
	 */
	void setPType(ProcessorType value);

	/**
	 * Returns the value of the '<em><b>Vf Island</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vf Island</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vf Island</em>' reference.
	 * @see #setVfIsland(VoltageFrequencyIsland)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessor_VfIsland()
	 * @model required="true"
	 *        annotation="gmf.link label.text='island' target.decoration='filledclosedarrow' tool.name='Processor->Voltage Frequency Island' tool.small.path='icons/p2is.gif' tool.large.path='icons/p2is.gif'"
	 * @generated
	 */
	VoltageFrequencyIsland getVfIsland();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.Processor#getVfIsland <em>Vf Island</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vf Island</em>' reference.
	 * @see #getVfIsland()
	 * @generated
	 */
	void setVfIsland(VoltageFrequencyIsland value);

} // Processor
