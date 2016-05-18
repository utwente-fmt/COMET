/**
 */
package Platform_Metamodel.tests;

import Platform_Metamodel.Platform_MetamodelFactory;
import Platform_Metamodel.VoltageFrequencyIsland;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Voltage Frequency Island</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VoltageFrequencyIslandTest extends TestCase {

	/**
	 * The fixture for this Voltage Frequency Island test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoltageFrequencyIsland fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VoltageFrequencyIslandTest.class);
	}

	/**
	 * Constructs a new Voltage Frequency Island test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageFrequencyIslandTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Voltage Frequency Island test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VoltageFrequencyIsland fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Voltage Frequency Island test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoltageFrequencyIsland getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Platform_MetamodelFactory.eINSTANCE.createVoltageFrequencyIsland());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VoltageFrequencyIslandTest
