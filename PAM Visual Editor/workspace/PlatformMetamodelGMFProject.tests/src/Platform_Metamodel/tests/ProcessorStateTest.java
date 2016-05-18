/**
 */
package Platform_Metamodel.tests;

import Platform_Metamodel.Platform_MetamodelFactory;
import Platform_Metamodel.ProcessorState;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processor State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorStateTest extends TestCase {

	/**
	 * The fixture for this Processor State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorState fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessorStateTest.class);
	}

	/**
	 * Constructs a new Processor State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorStateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Processor State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProcessorState fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Processor State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorState getFixture() {
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
		setFixture(Platform_MetamodelFactory.eINSTANCE.createProcessorState());
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

} //ProcessorStateTest
