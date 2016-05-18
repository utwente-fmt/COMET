/**
 */
package Platform_Metamodel.tests;

import Platform_Metamodel.Platform_MetamodelFactory;
import Platform_Metamodel.ProcessorStateChange;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processor State Change</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorStateChangeTest extends TestCase {

	/**
	 * The fixture for this Processor State Change test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorStateChange fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessorStateChangeTest.class);
	}

	/**
	 * Constructs a new Processor State Change test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorStateChangeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Processor State Change test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProcessorStateChange fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Processor State Change test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorStateChange getFixture() {
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
		setFixture(Platform_MetamodelFactory.eINSTANCE.createProcessorStateChange());
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

} //ProcessorStateChangeTest
