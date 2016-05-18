/**
 */
package Platform_Metamodel.impl;

import Platform_Metamodel.PlatformApplicationModelRoot;
import Platform_Metamodel.Platform_MetamodelPackage;
import Platform_Metamodel.Processor;
import Platform_Metamodel.ProcessorType;
import Platform_Metamodel.VoltageFrequencyIsland;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Application Model Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Platform_Metamodel.impl.PlatformApplicationModelRootImpl#getIslands <em>Islands</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.PlatformApplicationModelRootImpl#getProcessorTypes <em>Processor Types</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.PlatformApplicationModelRootImpl#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformApplicationModelRootImpl extends EObjectImpl implements PlatformApplicationModelRoot {
	/**
	 * The cached value of the '{@link #getIslands() <em>Islands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslands()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageFrequencyIsland> islands;

	/**
	 * The cached value of the '{@link #getProcessorTypes() <em>Processor Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessorType> processorTypes;

	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformApplicationModelRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_MetamodelPackage.Literals.PLATFORM_APPLICATION_MODEL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VoltageFrequencyIsland> getIslands() {
		if (islands == null) {
			islands = new EObjectContainmentEList<VoltageFrequencyIsland>(VoltageFrequencyIsland.class, this, Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__ISLANDS);
		}
		return islands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessorType> getProcessorTypes() {
		if (processorTypes == null) {
			processorTypes = new EObjectContainmentEList<ProcessorType>(ProcessorType.class, this, Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSOR_TYPES);
		}
		return processorTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentEList<Processor>(Processor.class, this, Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__ISLANDS:
				return ((InternalEList<?>)getIslands()).basicRemove(otherEnd, msgs);
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSOR_TYPES:
				return ((InternalEList<?>)getProcessorTypes()).basicRemove(otherEnd, msgs);
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSORS:
				return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__ISLANDS:
				return getIslands();
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSOR_TYPES:
				return getProcessorTypes();
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSORS:
				return getProcessors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__ISLANDS:
				getIslands().clear();
				getIslands().addAll((Collection<? extends VoltageFrequencyIsland>)newValue);
				return;
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSOR_TYPES:
				getProcessorTypes().clear();
				getProcessorTypes().addAll((Collection<? extends ProcessorType>)newValue);
				return;
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__ISLANDS:
				getIslands().clear();
				return;
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSOR_TYPES:
				getProcessorTypes().clear();
				return;
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSORS:
				getProcessors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__ISLANDS:
				return islands != null && !islands.isEmpty();
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSOR_TYPES:
				return processorTypes != null && !processorTypes.isEmpty();
			case Platform_MetamodelPackage.PLATFORM_APPLICATION_MODEL_ROOT__PROCESSORS:
				return processors != null && !processors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformApplicationModelRootImpl
