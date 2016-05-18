/**
 */
package Sensation_Common_Metamodel.util;

import Sensation_Common_Metamodel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage
 * @generated
 */
public class Sensation_Common_MetamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Sensation_Common_MetamodelValidator INSTANCE = new Sensation_Common_MetamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Sensation_Common_Metamodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensation_Common_MetamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Sensation_Common_MetamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Sensation_Common_MetamodelPackage.IDENTIFIABLE:
				return validateIdentifiable((Identifiable)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiable(Identifiable identifiable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(identifiable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(identifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(identifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(identifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(identifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(identifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(identifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(identifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(identifiable, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifiable_UniqueIdentifiableInstance(identifiable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueIdentifiableInstance constraint of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IDENTIFIABLE__UNIQUE_IDENTIFIABLE_INSTANCE__EEXPRESSION = "self.oclType().allInstances()->forAll(id1, id2 |id1 <> id2 implies id1.identifier <> id2.identifier)";

	/**
	 * Validates the UniqueIdentifiableInstance constraint of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiable_UniqueIdentifiableInstance(Identifiable identifiable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Sensation_Common_MetamodelPackage.Literals.IDENTIFIABLE,
				 identifiable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueIdentifiableInstance",
				 IDENTIFIABLE__UNIQUE_IDENTIFIABLE_INSTANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Sensation_Common_MetamodelValidator
