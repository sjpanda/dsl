/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.View#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject {

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see webapp.WebappPackage#getView_Page()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPage();
} // View
