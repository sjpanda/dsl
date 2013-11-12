/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Resource#getImage <em>Image</em>}</li>
 *   <li>{@link webapp.Resource#getFile <em>File</em>}</li>
 *   <li>{@link webapp.Resource#getPropertie <em>Propertie</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see webapp.WebappPackage#getResource_Image()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImage();

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see webapp.WebappPackage#getResource_File()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFile();

	/**
	 * Returns the value of the '<em><b>Propertie</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Properties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propertie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propertie</em>' containment reference list.
	 * @see webapp.WebappPackage#getResource_Propertie()
	 * @model containment="true"
	 * @generated
	 */
	EList<Properties> getPropertie();

} // Resource
