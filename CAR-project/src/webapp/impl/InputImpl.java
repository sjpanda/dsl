/**
 */
package webapp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import webapp.Action;
import webapp.Field;
import webapp.Input;
import webapp.InputType;
import webapp.Mapping;
import webapp.Validator;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.InputImpl#getType <em>Type</em>}</li>
 *   <li>{@link webapp.impl.InputImpl#getAction <em>Action</em>}</li>
 *   <li>{@link webapp.impl.InputImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link webapp.impl.InputImpl#getButtonValue <em>Button Value</em>}</li>
 *   <li>{@link webapp.impl.InputImpl#getTextValue <em>Text Value</em>}</li>
 *   <li>{@link webapp.impl.InputImpl#getValidator <em>Validator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputImpl extends TagImpl implements Input {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final InputType TYPE_EDEFAULT = InputType.TEXT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InputType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Mapping label;

	/**
	 * The cached value of the '{@link #getButtonValue() <em>Button Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonValue()
	 * @generated
	 * @ordered
	 */
	protected Mapping buttonValue;

	/**
	 * The cached value of the '{@link #getTextValue() <em>Text Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextValue()
	 * @generated
	 * @ordered
	 */
	protected Field textValue;

	/**
	 * The cached value of the '{@link #getValidator() <em>Validator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidator()
	 * @generated
	 * @ordered
	 */
	protected Validator validator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InputType newType) {
		InputType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.INPUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.INPUT__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.INPUT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (Mapping)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.INPUT__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Mapping newLabel) {
		Mapping oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.INPUT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getButtonValue() {
		if (buttonValue != null && buttonValue.eIsProxy()) {
			InternalEObject oldButtonValue = (InternalEObject)buttonValue;
			buttonValue = (Mapping)eResolveProxy(oldButtonValue);
			if (buttonValue != oldButtonValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.INPUT__BUTTON_VALUE, oldButtonValue, buttonValue));
			}
		}
		return buttonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping basicGetButtonValue() {
		return buttonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonValue(Mapping newButtonValue) {
		Mapping oldButtonValue = buttonValue;
		buttonValue = newButtonValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.INPUT__BUTTON_VALUE, oldButtonValue, buttonValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getTextValue() {
		if (textValue != null && textValue.eIsProxy()) {
			InternalEObject oldTextValue = (InternalEObject)textValue;
			textValue = (Field)eResolveProxy(oldTextValue);
			if (textValue != oldTextValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.INPUT__TEXT_VALUE, oldTextValue, textValue));
			}
		}
		return textValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetTextValue() {
		return textValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextValue(Field newTextValue) {
		Field oldTextValue = textValue;
		textValue = newTextValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.INPUT__TEXT_VALUE, oldTextValue, textValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validator getValidator() {
		if (validator != null && validator.eIsProxy()) {
			InternalEObject oldValidator = (InternalEObject)validator;
			validator = (Validator)eResolveProxy(oldValidator);
			if (validator != oldValidator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.INPUT__VALIDATOR, oldValidator, validator));
			}
		}
		return validator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validator basicGetValidator() {
		return validator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidator(Validator newValidator) {
		Validator oldValidator = validator;
		validator = newValidator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.INPUT__VALIDATOR, oldValidator, validator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebappPackage.INPUT__TYPE:
				return getType();
			case WebappPackage.INPUT__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case WebappPackage.INPUT__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case WebappPackage.INPUT__BUTTON_VALUE:
				if (resolve) return getButtonValue();
				return basicGetButtonValue();
			case WebappPackage.INPUT__TEXT_VALUE:
				if (resolve) return getTextValue();
				return basicGetTextValue();
			case WebappPackage.INPUT__VALIDATOR:
				if (resolve) return getValidator();
				return basicGetValidator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebappPackage.INPUT__TYPE:
				setType((InputType)newValue);
				return;
			case WebappPackage.INPUT__ACTION:
				setAction((Action)newValue);
				return;
			case WebappPackage.INPUT__LABEL:
				setLabel((Mapping)newValue);
				return;
			case WebappPackage.INPUT__BUTTON_VALUE:
				setButtonValue((Mapping)newValue);
				return;
			case WebappPackage.INPUT__TEXT_VALUE:
				setTextValue((Field)newValue);
				return;
			case WebappPackage.INPUT__VALIDATOR:
				setValidator((Validator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebappPackage.INPUT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WebappPackage.INPUT__ACTION:
				setAction((Action)null);
				return;
			case WebappPackage.INPUT__LABEL:
				setLabel((Mapping)null);
				return;
			case WebappPackage.INPUT__BUTTON_VALUE:
				setButtonValue((Mapping)null);
				return;
			case WebappPackage.INPUT__TEXT_VALUE:
				setTextValue((Field)null);
				return;
			case WebappPackage.INPUT__VALIDATOR:
				setValidator((Validator)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebappPackage.INPUT__TYPE:
				return type != TYPE_EDEFAULT;
			case WebappPackage.INPUT__ACTION:
				return action != null;
			case WebappPackage.INPUT__LABEL:
				return label != null;
			case WebappPackage.INPUT__BUTTON_VALUE:
				return buttonValue != null;
			case WebappPackage.INPUT__TEXT_VALUE:
				return textValue != null;
			case WebappPackage.INPUT__VALIDATOR:
				return validator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //InputImpl
