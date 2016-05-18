/**
 */
package Platform_Metamodel.util;

import Platform_Metamodel.*;

import Sensation_Common_Metamodel.Identifiable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Platform_Metamodel.Platform_MetamodelPackage
 * @generated
 */
public class Platform_MetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Platform_MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_MetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Platform_MetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Platform_MetamodelSwitch<Adapter> modelSwitch =
		new Platform_MetamodelSwitch<Adapter>() {
			@Override
			public Adapter casePlatformApplicationModelRoot(PlatformApplicationModelRoot object) {
				return createPlatformApplicationModelRootAdapter();
			}
			@Override
			public Adapter caseVoltageFrequencyIsland(VoltageFrequencyIsland object) {
				return createVoltageFrequencyIslandAdapter();
			}
			@Override
			public Adapter caseProcessorType(ProcessorType object) {
				return createProcessorTypeAdapter();
			}
			@Override
			public Adapter caseProcessor(Processor object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseProcessorState(ProcessorState object) {
				return createProcessorStateAdapter();
			}
			@Override
			public Adapter caseProcessorStateChange(ProcessorStateChange object) {
				return createProcessorStateChangeAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Platform_Metamodel.PlatformApplicationModelRoot <em>Platform Application Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Platform_Metamodel.PlatformApplicationModelRoot
	 * @generated
	 */
	public Adapter createPlatformApplicationModelRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Platform_Metamodel.VoltageFrequencyIsland <em>Voltage Frequency Island</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Platform_Metamodel.VoltageFrequencyIsland
	 * @generated
	 */
	public Adapter createVoltageFrequencyIslandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Platform_Metamodel.ProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Platform_Metamodel.ProcessorType
	 * @generated
	 */
	public Adapter createProcessorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Platform_Metamodel.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Platform_Metamodel.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Platform_Metamodel.ProcessorState <em>Processor State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Platform_Metamodel.ProcessorState
	 * @generated
	 */
	public Adapter createProcessorStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Platform_Metamodel.ProcessorStateChange <em>Processor State Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Platform_Metamodel.ProcessorStateChange
	 * @generated
	 */
	public Adapter createProcessorStateChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Sensation_Common_Metamodel.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Sensation_Common_Metamodel.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Platform_MetamodelAdapterFactory
