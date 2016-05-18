/**
 */
package Platform_Metamodel.tests;

import Platform_Metamodel.Platform_MetamodelFactory;
import Platform_Metamodel.ProcessorType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processor Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorTypeTest extends TestCase {

	/**
	 * The fixture for this Processor Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessorTypeTest.class);
	}

	/**
	 * Constructs a new Processor Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Processor Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProcessorType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Processor Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorType getFixture() {
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
		setFixture(Platform_MetamodelFactory.eINSTANCE.createProcessorType());
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

} //ProcessorTypeTest
