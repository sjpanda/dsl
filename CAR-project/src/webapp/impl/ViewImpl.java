/**
 */
package webapp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webapp.Navigation;
import webapp.Page;
import webapp.View;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.ViewImpl#getPage <em>Page</em>}</li>
 *   <li>{@link webapp.impl.ViewImpl#getNavigation <em>Navigation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends MinimalEObjectImpl.Container implements View {
	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> page;

	/**
	 * The cached value of the '{@link #getNavigation() <em>Navigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigation()
	 * @generated
	 * @ordered
	 */
	protected EList<Navigation> navigation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<Page>(Page.class, this, WebappPackage.VIEW__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Navigation> getNavigation() {
		if (navigation == null) {
			navigation = new EObjectContainmentEList<Navigation>(Navigation.class, this, WebappPackage.VIEW__NAVIGATION);
		}
		return navigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.VIEW__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
			case WebappPackage.VIEW__NAVIGATION:
				return ((InternalEList<?>)getNavigation()).basicRemove(otherEnd, msgs);
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
			case WebappPackage.VIEW__PAGE:
				return getPage();
			case WebappPackage.VIEW__NAVIGATION:
				return getNavigation();
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
			case WebappPackage.VIEW__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends Page>)newValue);
				return;
			case WebappPackage.VIEW__NAVIGATION:
				getNavigation().clear();
				getNavigation().addAll((Collection<? extends Navigation>)newValue);
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
			case WebappPackage.VIEW__PAGE:
				getPage().clear();
				return;
			case WebappPackage.VIEW__NAVIGATION:
				getNavigation().clear();
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
			case WebappPackage.VIEW__PAGE:
				return page != null && !page.isEmpty();
			case WebappPackage.VIEW__NAVIGATION:
				return navigation != null && !navigation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewImpl
