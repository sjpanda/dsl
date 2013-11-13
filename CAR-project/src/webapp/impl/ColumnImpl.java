/**
 */
package webapp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webapp.Column;
import webapp.ColumnType;
import webapp.Detail;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link webapp.impl.ColumnImpl#isIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link webapp.impl.ColumnImpl#getSize <em>Size</em>}</li>
 *   <li>{@link webapp.impl.ColumnImpl#isUseZeroFill <em>Use Zero Fill</em>}</li>
 *   <li>{@link webapp.impl.ColumnImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link webapp.impl.ColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link webapp.impl.ColumnImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNotNull() <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NOT_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNotNull() <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNotNull()
	 * @generated
	 * @ordered
	 */
	protected boolean isNotNull = IS_NOT_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseZeroFill() <em>Use Zero Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseZeroFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ZERO_FILL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseZeroFill() <em>Use Zero Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseZeroFill()
	 * @generated
	 * @ordered
	 */
	protected boolean useZeroFill = USE_ZERO_FILL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected Detail detail;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ColumnType TYPE_EDEFAULT = ColumnType.BIGINT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ColumnType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNotNull() {
		return isNotNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNotNull(boolean newIsNotNull) {
		boolean oldIsNotNull = isNotNull;
		isNotNull = newIsNotNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.COLUMN__IS_NOT_NULL, oldIsNotNull, isNotNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.COLUMN__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseZeroFill() {
		return useZeroFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseZeroFill(boolean newUseZeroFill) {
		boolean oldUseZeroFill = useZeroFill;
		useZeroFill = newUseZeroFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.COLUMN__USE_ZERO_FILL, oldUseZeroFill, useZeroFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detail getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(Detail newDetail, NotificationChain msgs) {
		Detail oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.COLUMN__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(Detail newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.COLUMN__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.COLUMN__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.COLUMN__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ColumnType newType) {
		ColumnType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.COLUMN__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.COLUMN__DETAIL:
				return basicSetDetail(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebappPackage.COLUMN__NAME:
				return getName();
			case WebappPackage.COLUMN__IS_NOT_NULL:
				return isIsNotNull();
			case WebappPackage.COLUMN__SIZE:
				return getSize();
			case WebappPackage.COLUMN__USE_ZERO_FILL:
				return isUseZeroFill();
			case WebappPackage.COLUMN__DETAIL:
				return getDetail();
			case WebappPackage.COLUMN__TYPE:
				return getType();
			case WebappPackage.COLUMN__DEFAULT_VALUE:
				return getDefaultValue();
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
			case WebappPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case WebappPackage.COLUMN__IS_NOT_NULL:
				setIsNotNull((Boolean)newValue);
				return;
			case WebappPackage.COLUMN__SIZE:
				setSize((Integer)newValue);
				return;
			case WebappPackage.COLUMN__USE_ZERO_FILL:
				setUseZeroFill((Boolean)newValue);
				return;
			case WebappPackage.COLUMN__DETAIL:
				setDetail((Detail)newValue);
				return;
			case WebappPackage.COLUMN__TYPE:
				setType((ColumnType)newValue);
				return;
			case WebappPackage.COLUMN__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
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
			case WebappPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebappPackage.COLUMN__IS_NOT_NULL:
				setIsNotNull(IS_NOT_NULL_EDEFAULT);
				return;
			case WebappPackage.COLUMN__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case WebappPackage.COLUMN__USE_ZERO_FILL:
				setUseZeroFill(USE_ZERO_FILL_EDEFAULT);
				return;
			case WebappPackage.COLUMN__DETAIL:
				setDetail((Detail)null);
				return;
			case WebappPackage.COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WebappPackage.COLUMN__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
			case WebappPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebappPackage.COLUMN__IS_NOT_NULL:
				return isNotNull != IS_NOT_NULL_EDEFAULT;
			case WebappPackage.COLUMN__SIZE:
				return size != SIZE_EDEFAULT;
			case WebappPackage.COLUMN__USE_ZERO_FILL:
				return useZeroFill != USE_ZERO_FILL_EDEFAULT;
			case WebappPackage.COLUMN__DETAIL:
				return detail != null;
			case WebappPackage.COLUMN__TYPE:
				return type != TYPE_EDEFAULT;
			case WebappPackage.COLUMN__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isNotNull: ");
		result.append(isNotNull);
		result.append(", size: ");
		result.append(size);
		result.append(", useZeroFill: ");
		result.append(useZeroFill);
		result.append(", type: ");
		result.append(type);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
