/**
 */
package Platform_Metamodel.impl;

import Platform_Metamodel.Platform_MetamodelPackage;
import Platform_Metamodel.ProcessorState;
import Platform_Metamodel.ProcessorStateChange;
import Platform_Metamodel.ProcessorType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Platform_Metamodel.impl.ProcessorStateImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorStateImpl#getPossibleStateChanges <em>Possible State Changes</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorStateImpl#getProcessorType <em>Processor Type</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorStateImpl#isIsWorking <em>Is Working</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorStateImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorStateImpl#getPowerConsumption <em>Power Consumption</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorStateImpl extends EObjectImpl implements ProcessorState {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPossibleStateChanges() <em>Possible State Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleStateChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessorStateChange> possibleStateChanges;

	/**
	 * The cached value of the '{@link #getProcessorType() <em>Processor Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorType()
	 * @generated
	 * @ordered
	 */
	protected ProcessorType processorType;

	/**
	 * The default value of the '{@link #isIsWorking() <em>Is Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWorking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WORKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWorking() <em>Is Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWorking()
	 * @generated
	 * @ordered
	 */
	protected boolean isWorking = IS_WORKING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_CONSUMPTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected int powerConsumption = POWER_CONSUMPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_MetamodelPackage.Literals.PROCESSOR_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR_STATE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessorStateChange> getPossibleStateChanges() {
		if (possibleStateChanges == null) {
			possibleStateChanges = new EObjectContainmentEList<ProcessorStateChange>(ProcessorStateChange.class, this, Platform_MetamodelPackage.PROCESSOR_STATE__POSSIBLE_STATE_CHANGES);
		}
		return possibleStateChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorType getProcessorType() {
		if (processorType != null && processorType.eIsProxy()) {
			InternalEObject oldProcessorType = (InternalEObject)processorType;
			processorType = (ProcessorType)eResolveProxy(oldProcessorType);
			if (processorType != oldProcessorType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_MetamodelPackage.PROCESSOR_STATE__PROCESSOR_TYPE, oldProcessorType, processorType));
			}
		}
		return processorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorType basicGetProcessorType() {
		return processorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorType(ProcessorType newProcessorType) {
		ProcessorType oldProcessorType = processorType;
		processorType = newProcessorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR_STATE__PROCESSOR_TYPE, oldProcessorType, processorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWorking() {
		return isWorking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWorking(boolean newIsWorking) {
		boolean oldIsWorking = isWorking;
		isWorking = newIsWorking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR_STATE__IS_WORKING, oldIsWorking, isWorking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR_STATE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPowerConsumption() {
		return powerConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerConsumption(int newPowerConsumption) {
		int oldPowerConsumption = powerConsumption;
		powerConsumption = newPowerConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR_STATE__POWER_CONSUMPTION, oldPowerConsumption, powerConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Platform_MetamodelPackage.PROCESSOR_STATE__POSSIBLE_STATE_CHANGES:
				return ((InternalEList<?>)getPossibleStateChanges()).basicRemove(otherEnd, msgs);
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
			case Platform_MetamodelPackage.PROCESSOR_STATE__IDENTIFIER:
				return getIdentifier();
			case Platform_MetamodelPackage.PROCESSOR_STATE__POSSIBLE_STATE_CHANGES:
				return getPossibleStateChanges();
			case Platform_MetamodelPackage.PROCESSOR_STATE__PROCESSOR_TYPE:
				if (resolve) return getProcessorType();
				return basicGetProcessorType();
			case Platform_MetamodelPackage.PROCESSOR_STATE__IS_WORKING:
				return isIsWorking();
			case Platform_MetamodelPackage.PROCESSOR_STATE__FREQUENCY:
				return getFrequency();
			case Platform_MetamodelPackage.PROCESSOR_STATE__POWER_CONSUMPTION:
				return getPowerConsumption();
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
			case Platform_MetamodelPackage.PROCESSOR_STATE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__POSSIBLE_STATE_CHANGES:
				getPossibleStateChanges().clear();
				getPossibleStateChanges().addAll((Collection<? extends ProcessorStateChange>)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__PROCESSOR_TYPE:
				setProcessorType((ProcessorType)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__IS_WORKING:
				setIsWorking((Boolean)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__FREQUENCY:
				setFrequency((Integer)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__POWER_CONSUMPTION:
				setPowerConsumption((Integer)newValue);
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
			case Platform_MetamodelPackage.PROCESSOR_STATE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__POSSIBLE_STATE_CHANGES:
				getPossibleStateChanges().clear();
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__PROCESSOR_TYPE:
				setProcessorType((ProcessorType)null);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__IS_WORKING:
				setIsWorking(IS_WORKING_EDEFAULT);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE__POWER_CONSUMPTION:
				setPowerConsumption(POWER_CONSUMPTION_EDEFAULT);
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
			case Platform_MetamodelPackage.PROCESSOR_STATE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Platform_MetamodelPackage.PROCESSOR_STATE__POSSIBLE_STATE_CHANGES:
				return possibleStateChanges != null && !possibleStateChanges.isEmpty();
			case Platform_MetamodelPackage.PROCESSOR_STATE__PROCESSOR_TYPE:
				return processorType != null;
			case Platform_MetamodelPackage.PROCESSOR_STATE__IS_WORKING:
				return isWorking != IS_WORKING_EDEFAULT;
			case Platform_MetamodelPackage.PROCESSOR_STATE__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case Platform_MetamodelPackage.PROCESSOR_STATE__POWER_CONSUMPTION:
				return powerConsumption != POWER_CONSUMPTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", isWorking: ");
		result.append(isWorking);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", powerConsumption: ");
		result.append(powerConsumption);
		result.append(')');
		return result.toString();
	}

} //ProcessorStateImpl
