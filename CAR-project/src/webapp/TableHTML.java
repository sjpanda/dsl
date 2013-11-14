/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table HTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.TableHTML#getTr <em>Tr</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getTableHTML()
 * @model
 * @generated
 */
public interface TableHTML extends Tag {
	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Tr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference list.
	 * @see webapp.WebappPackage#getTableHTML_Tr()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tr> getTr();

} // TableHTML
