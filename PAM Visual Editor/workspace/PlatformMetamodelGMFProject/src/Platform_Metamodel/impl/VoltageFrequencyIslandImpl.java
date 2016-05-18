/**
 */
package Platform_Metamodel.impl;

import Platform_Metamodel.Platform_MetamodelPackage;
import Platform_Metamodel.Processor;
import Platform_Metamodel.VoltageFrequencyIsland;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voltage Frequency Island</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Platform_Metamodel.impl.VoltageFrequencyIslandImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link Platform_Metamodel.impl.VoltageFrequencyIslandImpl#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoltageFrequencyIslandImpl extends EObjectImpl implements VoltageFrequencyIsland {
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
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' reference list.
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
	protected VoltageFrequencyIslandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_MetamodelPackage.Literals.VOLTAGE_FREQUENCY_ISLAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectResolvingEList<Processor>(Processor.class, this, Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__IDENTIFIER:
				return getIdentifier();
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__PROCESSORS:
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
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__PROCESSORS:
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
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__PROCESSORS:
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
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Platform_MetamodelPackage.VOLTAGE_FREQUENCY_ISLAND__PROCESSORS:
				return processors != null && !processors.isEmpty();
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

} //VoltageFrequencyIslandImpl
