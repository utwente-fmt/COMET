/**
 */
package Platform_Metamodel;

import Sensation_Common_Metamodel.Identifiable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Frequency Island</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Platform_Metamodel.VoltageFrequencyIsland#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @see Platform_Metamodel.Platform_MetamodelPackage#getVoltageFrequencyIsland()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleAppearanceOnIsland IslandHasProcessors IslandFrequencyHomogenity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SingleAppearanceOnIsland='self.processors->forAll(p1, p2 | p1 <> p2 implies p1.identifier <> p2.identifier)' IslandHasProcessors='self.processors->forAll(p |p.island = self)' IslandFrequencyHomogenity='self.processors.initialState->forAll(cs1, cs2 | cs1.frequency = cs2.frequency)'"
 *        annotation="gmf.node figure='figures.VoltageFrequencyIslandFigure' label.icon='false' label='identifier' resizable='true' size='70,70' label.placement='external' tool.name='Voltage Frequency Island'"
 * @generated
 */
public interface VoltageFrequencyIsland extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Processors</b></em>' reference list.
	 * The list contents are of type {@link Platform_Metamodel.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' reference list.
	 * @see Platform_Metamodel.Platform_MetamodelPackage#getVoltageFrequencyIsland_Processors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Processor> getProcessors();

} // VoltageFrequencyIsland
