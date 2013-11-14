/**
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Input#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends Tag {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link webapp.InputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see webapp.InputType
	 * @see #setType(InputType)
	 * @see webapp.WebappPackage#getInput_Type()
	 * @model required="true"
	 * @generated
	 */
	InputType getType();

	/**
	 * Sets the value of the '{@link webapp.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see webapp.InputType
	 * @see #getType()
	 * @generated
	 */
	void setType(InputType value);

} // Input
