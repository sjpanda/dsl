/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Controller#getValidator <em>Validator</em>}</li>
 *   <li>{@link webapp.Controller#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {

	/**
	 * Returns the value of the '<em><b>Validator</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Validator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator</em>' containment reference list.
	 * @see webapp.WebappPackage#getController_Validator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Validator> getValidator();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see webapp.WebappPackage#getController_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getAction();
} // Controller
