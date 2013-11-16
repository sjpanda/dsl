/**
 */
package webapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Action#getValidator <em>Validator</em>}</li>
 *   <li>{@link webapp.Action#getName <em>Name</em>}</li>
 *   <li>{@link webapp.Action#getBusinessObject <em>Business Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Validator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator</em>' reference.
	 * @see #setValidator(Validator)
	 * @see webapp.WebappPackage#getAction_Validator()
	 * @model
	 * @generated
	 */
	Validator getValidator();

	/**
	 * Sets the value of the '{@link webapp.Action#getValidator <em>Validator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator</em>' reference.
	 * @see #getValidator()
	 * @generated
	 */
	void setValidator(Validator value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see webapp.WebappPackage#getAction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link webapp.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see webapp.WebappPackage#getAction_BusinessObject()
	 * @model required="true"
	 * @generated
	 */
	BusinessObject getBusinessObject();

	/**
	 * Sets the value of the '{@link webapp.Action#getBusinessObject <em>Business Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Object</em>' reference.
	 * @see #getBusinessObject()
	 * @generated
	 */
	void setBusinessObject(BusinessObject value);

} // Action
