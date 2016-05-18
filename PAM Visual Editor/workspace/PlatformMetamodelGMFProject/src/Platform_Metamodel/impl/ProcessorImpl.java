/**
 */
package Platform_Metamodel.impl;

import Platform_Metamodel.Platform_MetamodelPackage;
import Platform_Metamodel.Processor;
import Platform_Metamodel.ProcessorState;
import Platform_Metamodel.ProcessorType;
import Platform_Metamodel.VoltageFrequencyIsland;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Platform_Metamodel.impl.ProcessorImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorImpl#getPType <em>PType</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.ProcessorImpl#getVfIsland <em>Vf Island</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends EObjectImpl implements Processor {
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
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected ProcessorState initialState;

	/**
	 * The cached value of the '{@link #getPType() <em>PType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPType()
	 * @generated
	 * @ordered
	 */
	protected ProcessorType pType;

	/**
	 * The cached value of the '{@link #getVfIsland() <em>Vf Island</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVfIsland()
	 * @generated
	 * @ordered
	 */
	protected VoltageFrequencyIsland vfIsland;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_MetamodelPackage.Literals.PROCESSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorState getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (ProcessorState)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_MetamodelPackage.PROCESSOR__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorState basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(ProcessorState newInitialState) {
		ProcessorState oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorType getPType() {
		if (pType != null && pType.eIsProxy()) {
			InternalEObject oldPType = (InternalEObject)pType;
			pType = (ProcessorType)eResolveProxy(oldPType);
			if (pType != oldPType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_MetamodelPackage.PROCESSOR__PTYPE, oldPType, pType));
			}
		}
		return pType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorType basicGetPType() {
		return pType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPType(ProcessorType newPType) {
		ProcessorType oldPType = pType;
		pType = newPType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR__PTYPE, oldPType, pType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageFrequencyIsland getVfIsland() {
		if (vfIsland != null && vfIsland.eIsProxy()) {
			InternalEObject oldVfIsland = (InternalEObject)vfIsland;
			vfIsland = (VoltageFrequencyIsland)eResolveProxy(oldVfIsland);
			if (vfIsland != oldVfIsland) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_MetamodelPackage.PROCESSOR__VF_ISLAND, oldVfIsland, vfIsland));
			}
		}
		return vfIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageFrequencyIsland basicGetVfIsland() {
		return vfIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVfIsland(VoltageFrequencyIsland newVfIsland) {
		VoltageFrequencyIsland oldVfIsland = vfIsland;
		vfIsland = newVfIsland;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.PROCESSOR__VF_ISLAND, oldVfIsland, vfIsland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Platform_MetamodelPackage.PROCESSOR__IDENTIFIER:
				return getIdentifier();
			case Platform_MetamodelPackage.PROCESSOR__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case Platform_MetamodelPackage.PROCESSOR__PTYPE:
				if (resolve) return getPType();
				return basicGetPType();
			case Platform_MetamodelPackage.PROCESSOR__VF_ISLAND:
				if (resolve) return getVfIsland();
				return basicGetVfIsland();
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
			case Platform_MetamodelPackage.PROCESSOR__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR__INITIAL_STATE:
				setInitialState((ProcessorState)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR__PTYPE:
				setPType((ProcessorType)newValue);
				return;
			case Platform_MetamodelPackage.PROCESSOR__VF_ISLAND:
				setVfIsland((VoltageFrequencyIsland)newValue);
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
			case Platform_MetamodelPackage.PROCESSOR__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Platform_MetamodelPackage.PROCESSOR__INITIAL_STATE:
				setInitialState((ProcessorState)null);
				return;
			case Platform_MetamodelPackage.PROCESSOR__PTYPE:
				setPType((ProcessorType)null);
				return;
			case Platform_MetamodelPackage.PROCESSOR__VF_ISLAND:
				setVfIsland((VoltageFrequencyIsland)null);
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
			case Platform_MetamodelPackage.PROCESSOR__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Platform_MetamodelPackage.PROCESSOR__INITIAL_STATE:
				return initialState != null;
			case Platform_MetamodelPackage.PROCESSOR__PTYPE:
				return pType != null;
			case Platform_MetamodelPackage.PROCESSOR__VF_ISLAND:
				return vfIsland != null;
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
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl
