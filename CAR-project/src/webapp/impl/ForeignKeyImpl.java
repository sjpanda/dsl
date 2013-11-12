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
import webapp.ForeignKey;
import webapp.OnDelete;
import webapp.OnUpdate;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.ForeignKeyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link webapp.impl.ForeignKeyImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link webapp.impl.ForeignKeyImpl#getOnUpdate <em>On Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends MinimalEObjectImpl.Container implements ForeignKey {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column;

	/**
	 * The cached value of the '{@link #getOnDelete() <em>On Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected OnDelete onDelete;

	/**
	 * The cached value of the '{@link #getOnUpdate() <em>On Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdate()
	 * @generated
	 * @ordered
	 */
	protected OnUpdate onUpdate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getColumn() {
		if (column != null && column.eIsProxy()) {
			InternalEObject oldColumn = (InternalEObject)column;
			column = (Column)eResolveProxy(oldColumn);
			if (column != oldColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.FOREIGN_KEY__COLUMN, oldColumn, column));
			}
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.FOREIGN_KEY__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDelete getOnDelete() {
		return onDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnDelete(OnDelete newOnDelete, NotificationChain msgs) {
		OnDelete oldOnDelete = onDelete;
		onDelete = newOnDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.FOREIGN_KEY__ON_DELETE, oldOnDelete, newOnDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDelete(OnDelete newOnDelete) {
		if (newOnDelete != onDelete) {
			NotificationChain msgs = null;
			if (onDelete != null)
				msgs = ((InternalEObject)onDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.FOREIGN_KEY__ON_DELETE, null, msgs);
			if (newOnDelete != null)
				msgs = ((InternalEObject)newOnDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.FOREIGN_KEY__ON_DELETE, null, msgs);
			msgs = basicSetOnDelete(newOnDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.FOREIGN_KEY__ON_DELETE, newOnDelete, newOnDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnUpdate getOnUpdate() {
		return onUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnUpdate(OnUpdate newOnUpdate, NotificationChain msgs) {
		OnUpdate oldOnUpdate = onUpdate;
		onUpdate = newOnUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.FOREIGN_KEY__ON_UPDATE, oldOnUpdate, newOnUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdate(OnUpdate newOnUpdate) {
		if (newOnUpdate != onUpdate) {
			NotificationChain msgs = null;
			if (onUpdate != null)
				msgs = ((InternalEObject)onUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.FOREIGN_KEY__ON_UPDATE, null, msgs);
			if (newOnUpdate != null)
				msgs = ((InternalEObject)newOnUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.FOREIGN_KEY__ON_UPDATE, null, msgs);
			msgs = basicSetOnUpdate(newOnUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.FOREIGN_KEY__ON_UPDATE, newOnUpdate, newOnUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.FOREIGN_KEY__ON_DELETE:
				return basicSetOnDelete(null, msgs);
			case WebappPackage.FOREIGN_KEY__ON_UPDATE:
				return basicSetOnUpdate(null, msgs);
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
			case WebappPackage.FOREIGN_KEY__COLUMN:
				if (resolve) return getColumn();
				return basicGetColumn();
			case WebappPackage.FOREIGN_KEY__ON_DELETE:
				return getOnDelete();
			case WebappPackage.FOREIGN_KEY__ON_UPDATE:
				return getOnUpdate();
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
			case WebappPackage.FOREIGN_KEY__COLUMN:
				setColumn((Column)newValue);
				return;
			case WebappPackage.FOREIGN_KEY__ON_DELETE:
				setOnDelete((OnDelete)newValue);
				return;
			case WebappPackage.FOREIGN_KEY__ON_UPDATE:
				setOnUpdate((OnUpdate)newValue);
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
			case WebappPackage.FOREIGN_KEY__COLUMN:
				setColumn((Column)null);
				return;
			case WebappPackage.FOREIGN_KEY__ON_DELETE:
				setOnDelete((OnDelete)null);
				return;
			case WebappPackage.FOREIGN_KEY__ON_UPDATE:
				setOnUpdate((OnUpdate)null);
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
			case WebappPackage.FOREIGN_KEY__COLUMN:
				return column != null;
			case WebappPackage.FOREIGN_KEY__ON_DELETE:
				return onDelete != null;
			case WebappPackage.FOREIGN_KEY__ON_UPDATE:
				return onUpdate != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
