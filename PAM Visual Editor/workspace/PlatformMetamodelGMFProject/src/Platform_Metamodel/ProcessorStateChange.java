/**
 */
package Platform_Metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor State Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OCL Constraint: Valid State Changes: Both source and target references of a ProcessorStateChange must belong to the same ProcessorType.
 * OCL Constraint: Possible Transitions: ProcessorStateChange supports the following transitions: (a) Changing from the idle location in a certain frequency to the working location in the same frequency. (b) Changing from the idle location in a certain frequency to the idle location in the different frequency. (c) Changing from the working location in a certain frequency to the idle location in the same frequency.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Platform_Metamodel.ProcessorStateChange#getSource <em>Source</em>}</li>
 *   <li>{@link Platform_Metamodel.ProcessorStateChange#getTarget <em>Target</em>}</li>
 *   <li>{@link Platform_Metamodel.ProcessorStateChange#getPowerCost <em>Power Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorStateChange()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidStateChanges PossibleTransitions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidStateChanges='self.source.processorType = self.target.processorType' PossibleTransitions='self.source <> self.target'"
 *        annotation="gmf.link label='powerCost' source='source' target='target' target.decoration='filledclosedarrow' tool.name='Processor State Change' tool.small.path='icons/psc.gif' tool.large.path='icons/psc.gif'"
 * @generated
 */
public interface ProcessorStateChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ProcessorState)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorStateChange_Source()
	 * @model required="true"
	 * @generated
	 */
	ProcessorState getSource();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.ProcessorStateChange#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ProcessorState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ProcessorState)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorStateChange_Target()
	 * @model required="true"
	 * @generated
	 */
	ProcessorState getTarget();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.ProcessorStateChange#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ProcessorState value);

	/**
	 * Returns the value of the '<em><b>Power Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Cost</em>' attribute.
	 * @see #setPowerCost(int)
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getProcessorStateChange_PowerCost()
	 * @model
	 * @generated
	 */
	int getPowerCost();

	/**
	 * Sets the value of the '{@link Platform_Metamodel.ProcessorStateChange#getPowerCost <em>Power Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Cost</em>' attribute.
	 * @see #getPowerCost()
	 * @generated
	 */
	void setPowerCost(int value);

} // ProcessorStateChange
