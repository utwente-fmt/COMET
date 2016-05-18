/**
 */
package Platform_Metamodel.impl;

import Platform_Metamodel.Platform_MetamodelPackage;
import Platform_Metamodel.ProcessorState;
import Platform_Metamodel.ProcessorStateChange;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor State Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Platform_Metamodel.impl.ProcessorStateChangeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorStateChangeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorStateChangeImpl#getPowerCost <em>Power Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorStateChangeImpl extends EObjectImpl implements ProcessorStateChange {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ProcessorState source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ProcessorState target;

	/**
	 * The default value of the '{@link #getPowerCost() <em>Power Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCost()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPowerCost() <em>Power Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCost()
	 * @generated
	 * @ordered
	 */
	protected int powerCost = POWER_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorStateChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_MetamodelPackage.Literals.PROCESSOR_STATE_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorState getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ProcessorState)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorState basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ProcessorState newSource) {
		ProcessorState oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorState getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ProcessorState)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorState basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ProcessorState newTarget) {
		ProcessorState oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPowerCost() {
		return powerCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerCost(int newPowerCost) {
		int oldPowerCost = powerCost;
		powerCost = newPowerCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__POWER_COST, oldPowerCost, powerCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__POWER_COST:
				return getPowerCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__SOURCE:
				setSource((ProcessorState)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__TARGET:
				setTarget((ProcessorState)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__POWER_COST:
				setPowerCost((Integer)newValue);
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
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__SOURCE:
				setSource((ProcessorState)null);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__TARGET:
				setTarget((ProcessorState)null);
				return;
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__POWER_COST:
				setPowerCost(POWER_COST_EDEFAULT);
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
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__SOURCE:
				return source != null;
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__TARGET:
				return target != null;
			case Platform_MetamodelPackage.PROCESSOR_STATE_CHANGE__POWER_COST:
				return powerCost != POWER_COST_EDEFAULT;
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
		result.append(" (powerCost: ");
		result.append(powerCost);
		result.append(')');
		return result.toString();
	}

} //ProcessorStateChangeImpl
