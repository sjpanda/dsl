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
import webapp.Table;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.ForeignKeyImpl#getExternalColumn <em>External Column</em>}</li>
 *   <li>{@link webapp.impl.ForeignKeyImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link webapp.impl.ForeignKeyImpl#getOnUpdate <em>On Update</em>}</li>
 *   <li>{@link webapp.impl.ForeignKeyImpl#getExternalTable <em>External Table</em>}</li>
 *   <li>{@link webapp.impl.ForeignKeyImpl#getInternalColumn <em>Internal Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends MinimalEObjectImpl.Container implements ForeignKey {
	/**
	 * The cached value of the '{@link #getExternalColumn() <em>External Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalColumn()
	 * @generated
	 * @ordered
	 */
	protected Column externalColumn;

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
	 * The cached value of the '{@link #getExternalTable() <em>External Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalTable()
	 * @generated
	 * @ordered
	 */
	protected Table externalTable;

	/**
	 * The cached value of the '{@link #getInternalColumn() <em>Internal Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalColumn()
	 * @generated
	 * @ordered
	 */
	protected Column internalColumn;

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
	public Column getExternalColumn() {
		if (externalColumn != null && externalColumn.eIsProxy()) {
			InternalEObject oldExternalColumn = (InternalEObject)externalColumn;
			externalColumn = (Column)eResolveProxy(oldExternalColumn);
			if (externalColumn != oldExternalColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.FOREIGN_KEY__EXTERNAL_COLUMN, oldExternalColumn, externalColumn));
			}
		}
		return externalColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetExternalColumn() {
		return externalColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalColumn(Column newExternalColumn) {
		Column oldExternalColumn = externalColumn;
		externalColumn = newExternalColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.FOREIGN_KEY__EXTERNAL_COLUMN, oldExternalColumn, externalColumn));
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
	public Table getExternalTable() {
		if (externalTable != null && externalTable.eIsProxy()) {
			InternalEObject oldExternalTable = (InternalEObject)externalTable;
			externalTable = (Table)eResolveProxy(oldExternalTable);
			if (externalTable != oldExternalTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.FOREIGN_KEY__EXTERNAL_TABLE, oldExternalTable, externalTable));
			}
		}
		return externalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetExternalTable() {
		return externalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalTable(Table newExternalTable) {
		Table oldExternalTable = externalTable;
		externalTable = newExternalTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.FOREIGN_KEY__EXTERNAL_TABLE, oldExternalTable, externalTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getInternalColumn() {
		if (internalColumn != null && internalColumn.eIsProxy()) {
			InternalEObject oldInternalColumn = (InternalEObject)internalColumn;
			internalColumn = (Column)eResolveProxy(oldInternalColumn);
			if (internalColumn != oldInternalColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.FOREIGN_KEY__INTERNAL_COLUMN, oldInternalColumn, internalColumn));
			}
		}
		return internalColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetInternalColumn() {
		return internalColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalColumn(Column newInternalColumn) {
		Column oldInternalColumn = internalColumn;
		internalColumn = newInternalColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.FOREIGN_KEY__INTERNAL_COLUMN, oldInternalColumn, internalColumn));
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
			case WebappPackage.FOREIGN_KEY__EXTERNAL_COLUMN:
				if (resolve) return getExternalColumn();
				return basicGetExternalColumn();
			case WebappPackage.FOREIGN_KEY__ON_DELETE:
				return getOnDelete();
			case WebappPackage.FOREIGN_KEY__ON_UPDATE:
				return getOnUpdate();
			case WebappPackage.FOREIGN_KEY__EXTERNAL_TABLE:
				if (resolve) return getExternalTable();
				return basicGetExternalTable();
			case WebappPackage.FOREIGN_KEY__INTERNAL_COLUMN:
				if (resolve) return getInternalColumn();
				return basicGetInternalColumn();
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
			case WebappPackage.FOREIGN_KEY__EXTERNAL_COLUMN:
				setExternalColumn((Column)newValue);
				return;
			case WebappPackage.FOREIGN_KEY__ON_DELETE:
				setOnDelete((OnDelete)newValue);
				return;
			case WebappPackage.FOREIGN_KEY__ON_UPDATE:
				setOnUpdate((OnUpdate)newValue);
				return;
			case WebappPackage.FOREIGN_KEY__EXTERNAL_TABLE:
				setExternalTable((Table)newValue);
				return;
			case WebappPackage.FOREIGN_KEY__INTERNAL_COLUMN:
				setInternalColumn((Column)newValue);
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
			case WebappPackage.FOREIGN_KEY__EXTERNAL_COLUMN:
				setExternalColumn((Column)null);
				return;
			case WebappPackage.FOREIGN_KEY__ON_DELETE:
				setOnDelete((OnDelete)null);
				return;
			case WebappPackage.FOREIGN_KEY__ON_UPDATE:
				setOnUpdate((OnUpdate)null);
				return;
			case WebappPackage.FOREIGN_KEY__EXTERNAL_TABLE:
				setExternalTable((Table)null);
				return;
			case WebappPackage.FOREIGN_KEY__INTERNAL_COLUMN:
				setInternalColumn((Column)null);
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
			case WebappPackage.FOREIGN_KEY__EXTERNAL_COLUMN:
				return externalColumn != null;
			case WebappPackage.FOREIGN_KEY__ON_DELETE:
				return onDelete != null;
			case WebappPackage.FOREIGN_KEY__ON_UPDATE:
				return onUpdate != null;
			case WebappPackage.FOREIGN_KEY__EXTERNAL_TABLE:
				return externalTable != null;
			case WebappPackage.FOREIGN_KEY__INTERNAL_COLUMN:
				return internalColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
