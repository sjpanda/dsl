/**
 */
package webapp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webapp.Check;
import webapp.Constraint;
import webapp.ForeignKey;
import webapp.PrimaryKey;
import webapp.Unique;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.ConstraintImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link webapp.impl.ConstraintImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link webapp.impl.ConstraintImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link webapp.impl.ConstraintImpl#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primaryKey;

	/**
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
	protected EList<Unique> unique;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected EList<Check> check;

	/**
	 * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> foreignKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.CONSTRAINT__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		if (newPrimaryKey != primaryKey) {
			NotificationChain msgs = null;
			if (primaryKey != null)
				msgs = ((InternalEObject)primaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.CONSTRAINT__PRIMARY_KEY, null, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.CONSTRAINT__PRIMARY_KEY, null, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.CONSTRAINT__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unique> getUnique() {
		if (unique == null) {
			unique = new EObjectContainmentEList<Unique>(Unique.class, this, WebappPackage.CONSTRAINT__UNIQUE);
		}
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Check> getCheck() {
		if (check == null) {
			check = new EObjectContainmentEList<Check>(Check.class, this, WebappPackage.CONSTRAINT__CHECK);
		}
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getForeignKey() {
		if (foreignKey == null) {
			foreignKey = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, WebappPackage.CONSTRAINT__FOREIGN_KEY);
		}
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.CONSTRAINT__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
			case WebappPackage.CONSTRAINT__UNIQUE:
				return ((InternalEList<?>)getUnique()).basicRemove(otherEnd, msgs);
			case WebappPackage.CONSTRAINT__CHECK:
				return ((InternalEList<?>)getCheck()).basicRemove(otherEnd, msgs);
			case WebappPackage.CONSTRAINT__FOREIGN_KEY:
				return ((InternalEList<?>)getForeignKey()).basicRemove(otherEnd, msgs);
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
			case WebappPackage.CONSTRAINT__PRIMARY_KEY:
				return getPrimaryKey();
			case WebappPackage.CONSTRAINT__UNIQUE:
				return getUnique();
			case WebappPackage.CONSTRAINT__CHECK:
				return getCheck();
			case WebappPackage.CONSTRAINT__FOREIGN_KEY:
				return getForeignKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebappPackage.CONSTRAINT__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
				return;
			case WebappPackage.CONSTRAINT__UNIQUE:
				getUnique().clear();
				getUnique().addAll((Collection<? extends Unique>)newValue);
				return;
			case WebappPackage.CONSTRAINT__CHECK:
				getCheck().clear();
				getCheck().addAll((Collection<? extends Check>)newValue);
				return;
			case WebappPackage.CONSTRAINT__FOREIGN_KEY:
				getForeignKey().clear();
				getForeignKey().addAll((Collection<? extends ForeignKey>)newValue);
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
			case WebappPackage.CONSTRAINT__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
				return;
			case WebappPackage.CONSTRAINT__UNIQUE:
				getUnique().clear();
				return;
			case WebappPackage.CONSTRAINT__CHECK:
				getCheck().clear();
				return;
			case WebappPackage.CONSTRAINT__FOREIGN_KEY:
				getForeignKey().clear();
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
			case WebappPackage.CONSTRAINT__PRIMARY_KEY:
				return primaryKey != null;
			case WebappPackage.CONSTRAINT__UNIQUE:
				return unique != null && !unique.isEmpty();
			case WebappPackage.CONSTRAINT__CHECK:
				return check != null && !check.isEmpty();
			case WebappPackage.CONSTRAINT__FOREIGN_KEY:
				return foreignKey != null && !foreignKey.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintImpl
