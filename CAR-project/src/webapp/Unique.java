/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Unique#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getUnique()
 * @model
 * @generated
 */
public interface Unique extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference list.
	 * The list contents are of type {@link webapp.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference list.
	 * @see webapp.WebappPackage#getUnique_Column()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getColumn();

} // Unique
