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

} // Action
