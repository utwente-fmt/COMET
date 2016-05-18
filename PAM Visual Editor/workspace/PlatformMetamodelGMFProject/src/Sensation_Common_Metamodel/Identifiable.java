/**
 */
package Sensation_Common_Metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OCL Constraint: Unique identifier: Each identifiable item must has an unique identifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Sensation_Common_Metamodel.Identifiable#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage#getIdentifiable()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueIdentifiableInstance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueIdentifiableInstance='self.oclType().allInstances()->forAll(id1, id2 |id1 <> id2 implies id1.identifier <> id2.identifier)'"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see Sensation_Common_Metamodel.Sensation_Common_MetamodelPackage#getIdentifiable_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link Sensation_Common_Metamodel.Identifiable#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

} // Identifiable
