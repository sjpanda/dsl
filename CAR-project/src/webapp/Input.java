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
 *   <li>{@link webapp.Input#getAction <em>Action</em>}</li>
 *   <li>{@link webapp.Input#getLabel <em>Label</em>}</li>
 *   <li>{@link webapp.Input#getButtonValue <em>Button Value</em>}</li>
 *   <li>{@link webapp.Input#getTextValue <em>Text Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getInput()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeC'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeC='\n\t\t(self.type <> InputType::BUTTON implies self.action->isEmpty())\n\t\tand\n\t\t(self.type <> InputType::BUTTON implies self.buttonValue->isEmpty())\n\t\tand \n\t\t(self.type <> InputType::TEXT implies self.textValue->isEmpty())'"
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

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see webapp.WebappPackage#getInput_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link webapp.Input#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(Mapping)
	 * @see webapp.WebappPackage#getInput_Label()
	 * @model
	 * @generated
	 */
	Mapping getLabel();

	/**
	 * Sets the value of the '{@link webapp.Input#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Mapping value);

	/**
	 * Returns the value of the '<em><b>Button Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Value</em>' reference.
	 * @see #setButtonValue(Mapping)
	 * @see webapp.WebappPackage#getInput_ButtonValue()
	 * @model
	 * @generated
	 */
	Mapping getButtonValue();

	/**
	 * Sets the value of the '{@link webapp.Input#getButtonValue <em>Button Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Value</em>' reference.
	 * @see #getButtonValue()
	 * @generated
	 */
	void setButtonValue(Mapping value);

	/**
	 * Returns the value of the '<em><b>Text Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Value</em>' reference.
	 * @see #setTextValue(Field)
	 * @see webapp.WebappPackage#getInput_TextValue()
	 * @model
	 * @generated
	 */
	Field getTextValue();

	/**
	 * Sets the value of the '{@link webapp.Input#getTextValue <em>Text Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Value</em>' reference.
	 * @see #getTextValue()
	 * @generated
	 */
	void setTextValue(Field value);

} // Input
