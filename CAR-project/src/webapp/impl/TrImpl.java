/**
 */
package webapp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webapp.Td;
import webapp.Th;
import webapp.Tr;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.TrImpl#getTh <em>Th</em>}</li>
 *   <li>{@link webapp.impl.TrImpl#getTd <em>Td</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrImpl extends TagImpl implements Tr {
	/**
	 * The cached value of the '{@link #getTh() <em>Th</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTh()
	 * @generated
	 * @ordered
	 */
	protected EList<Th> th;

	/**
	 * The cached value of the '{@link #getTd() <em>Td</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTd()
	 * @generated
	 * @ordered
	 */
	protected EList<Td> td;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.TR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Th> getTh() {
		if (th == null) {
			th = new EObjectContainmentEList<Th>(Th.class, this, WebappPackage.TR__TH);
		}
		return th;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Td> getTd() {
		if (td == null) {
			td = new EObjectContainmentEList<Td>(Td.class, this, WebappPackage.TR__TD);
		}
		return td;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.TR__TH:
				return ((InternalEList<?>)getTh()).basicRemove(otherEnd, msgs);
			case WebappPackage.TR__TD:
				return ((InternalEList<?>)getTd()).basicRemove(otherEnd, msgs);
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
			case WebappPackage.TR__TH:
				return getTh();
			case WebappPackage.TR__TD:
				return getTd();
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
			case WebappPackage.TR__TH:
				getTh().clear();
				getTh().addAll((Collection<? extends Th>)newValue);
				return;
			case WebappPackage.TR__TD:
				getTd().clear();
				getTd().addAll((Collection<? extends Td>)newValue);
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
			case WebappPackage.TR__TH:
				getTh().clear();
				return;
			case WebappPackage.TR__TD:
				getTd().clear();
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
			case WebappPackage.TR__TH:
				return th != null && !th.isEmpty();
			case WebappPackage.TR__TD:
				return td != null && !td.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrImpl
