/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Form#getTag <em>Tag</em>}</li>
 *   <li>{@link webapp.Form#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Tag {
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
	 * @see webapp.WebappPackage#getForm_Tag()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tag> getTag();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link webapp.FormMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see webapp.FormMethod
	 * @see #setMethod(FormMethod)
	 * @see webapp.WebappPackage#getForm_Method()
	 * @model
	 * @generated
	 */
	FormMethod getMethod();

	/**
	 * Sets the value of the '{@link webapp.Form#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see webapp.FormMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(FormMethod value);

} // Form
