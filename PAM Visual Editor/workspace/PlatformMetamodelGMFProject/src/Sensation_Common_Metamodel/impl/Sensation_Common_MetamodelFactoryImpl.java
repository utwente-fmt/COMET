/**
 */
package Sensation_Common_Metamodel.impl;

import Sensation_Common_Metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sensation_Common_MetamodelFactoryImpl extends EFactoryImpl implements Sensation_Common_MetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sensation_Common_MetamodelFactory init() {
		try {
			Sensation_Common_MetamodelFactory theSensation_Common_MetamodelFactory = (Sensation_Common_MetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(Sensation_Common_MetamodelPackage.eNS_URI);
			if (theSensation_Common_MetamodelFactory != null) {
				return theSensation_Common_MetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Sensation_Common_MetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensation_Common_MetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensation_Common_MetamodelPackage getSensation_Common_MetamodelPackage() {
		return (Sensation_Common_MetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Sensation_Common_MetamodelPackage getPackage() {
		return Sensation_Common_MetamodelPackage.eINSTANCE;
	}

} //Sensation_Common_MetamodelFactoryImpl
