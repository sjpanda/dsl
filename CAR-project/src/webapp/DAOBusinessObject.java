/**
 */
package webapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.DAOBusinessObject#getBusinessObject <em>Business Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getDAOBusinessObject()
 * @model
 * @generated
 */
public interface DAOBusinessObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Business Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Object</em>' reference.
	 * @see #setBusinessObject(BusinessObject)
	 * @see webapp.WebappPackage#getDAOBusinessObject_BusinessObject()
	 * @model required="true"
	 * @generated
	 */
	BusinessObject getBusinessObject();

	/**
	 * Sets the value of the '{@link webapp.DAOBusinessObject#getBusinessObject <em>Business Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Object</em>' reference.
	 * @see #getBusinessObject()
	 * @generated
	 */
	void setBusinessObject(BusinessObject value);

} // DAOBusinessObject