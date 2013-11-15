/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Td</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Td#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getTd()
 * @model
 * @generated
 */
public interface Td extends Tag {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see webapp.WebappPackage#getTd_Tag()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTag();

} // Td
