/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Tr#getTh <em>Th</em>}</li>
 *   <li>{@link webapp.Tr#getTd <em>Td</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getTr()
 * @model
 * @generated
 */
public interface Tr extends Tag {
	/**
	 * Returns the value of the '<em><b>Th</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Th}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Th</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Th</em>' containment reference list.
	 * @see webapp.WebappPackage#getTr_Th()
	 * @model containment="true"
	 * @generated
	 */
	EList<Th> getTh();

	/**
	 * Returns the value of the '<em><b>Td</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Td}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Td</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Td</em>' containment reference list.
	 * @see webapp.WebappPackage#getTr_Td()
	 * @model containment="true"
	 * @generated
	 */
	EList<Td> getTd();

} // Tr
