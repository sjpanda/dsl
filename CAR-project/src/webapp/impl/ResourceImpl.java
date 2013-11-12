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

import webapp.File;
import webapp.Image;
import webapp.Properties;
import webapp.Resource;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.ResourceImpl#getImage <em>Image</em>}</li>
 *   <li>{@link webapp.impl.ResourceImpl#getFile <em>File</em>}</li>
 *   <li>{@link webapp.impl.ResourceImpl#getPropertie <em>Propertie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> image;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList<File> file;

	/**
	 * The cached value of the '{@link #getPropertie() <em>Propertie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertie()
	 * @generated
	 * @ordered
	 */
	protected EList<Properties> propertie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<Image>(Image.class, this, WebappPackage.RESOURCE__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFile() {
		if (file == null) {
			file = new EObjectContainmentEList<File>(File.class, this, WebappPackage.RESOURCE__FILE);
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Properties> getPropertie() {
		if (propertie == null) {
			propertie = new EObjectContainmentEList<Properties>(Properties.class, this, WebappPackage.RESOURCE__PROPERTIE);
		}
		return propertie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.RESOURCE__IMAGE:
				return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
			case WebappPackage.RESOURCE__FILE:
				return ((InternalEList<?>)getFile()).basicRemove(otherEnd, msgs);
			case WebappPackage.RESOURCE__PROPERTIE:
				return ((InternalEList<?>)getPropertie()).basicRemove(otherEnd, msgs);
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
			case WebappPackage.RESOURCE__IMAGE:
				return getImage();
			case WebappPackage.RESOURCE__FILE:
				return getFile();
			case WebappPackage.RESOURCE__PROPERTIE:
				return getPropertie();
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
			case WebappPackage.RESOURCE__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends Image>)newValue);
				return;
			case WebappPackage.RESOURCE__FILE:
				getFile().clear();
				getFile().addAll((Collection<? extends File>)newValue);
				return;
			case WebappPackage.RESOURCE__PROPERTIE:
				getPropertie().clear();
				getPropertie().addAll((Collection<? extends Properties>)newValue);
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
			case WebappPackage.RESOURCE__IMAGE:
				getImage().clear();
				return;
			case WebappPackage.RESOURCE__FILE:
				getFile().clear();
				return;
			case WebappPackage.RESOURCE__PROPERTIE:
				getPropertie().clear();
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
			case WebappPackage.RESOURCE__IMAGE:
				return image != null && !image.isEmpty();
			case WebappPackage.RESOURCE__FILE:
				return file != null && !file.isEmpty();
			case WebappPackage.RESOURCE__PROPERTIE:
				return propertie != null && !propertie.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
