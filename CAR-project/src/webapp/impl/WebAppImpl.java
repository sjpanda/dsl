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

import webapp.AppConfig;
import webapp.Controller;
import webapp.Library;
import webapp.Model;
import webapp.Resource;
import webapp.View;
import webapp.WebApp;
import webapp.WebConfig;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.WebAppImpl#getName <em>Name</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getAppConfig <em>App Config</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getWebConfig <em>Web Config</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getView <em>View</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getModel <em>Model</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getController <em>Controller</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getFramework <em>Framework</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebAppImpl extends MinimalEObjectImpl.Container implements WebApp {
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
	 * The cached value of the '{@link #getAppConfig() <em>App Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppConfig()
	 * @generated
	 * @ordered
	 */
	protected AppConfig appConfig;

	/**
	 * The cached value of the '{@link #getWebConfig() <em>Web Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebConfig()
	 * @generated
	 * @ordered
	 */
	protected WebConfig webConfig;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> library;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> view;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controller;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The default value of the '{@link #getFramework() <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMEWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramework() <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework()
	 * @generated
	 * @ordered
	 */
	protected String framework = FRAMEWORK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.WEB_APP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppConfig getAppConfig() {
		return appConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppConfig(AppConfig newAppConfig, NotificationChain msgs) {
		AppConfig oldAppConfig = appConfig;
		appConfig = newAppConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__APP_CONFIG, oldAppConfig, newAppConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppConfig(AppConfig newAppConfig) {
		if (newAppConfig != appConfig) {
			NotificationChain msgs = null;
			if (appConfig != null)
				msgs = ((InternalEObject)appConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__APP_CONFIG, null, msgs);
			if (newAppConfig != null)
				msgs = ((InternalEObject)newAppConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__APP_CONFIG, null, msgs);
			msgs = basicSetAppConfig(newAppConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__APP_CONFIG, newAppConfig, newAppConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebConfig getWebConfig() {
		return webConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebConfig(WebConfig newWebConfig, NotificationChain msgs) {
		WebConfig oldWebConfig = webConfig;
		webConfig = newWebConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__WEB_CONFIG, oldWebConfig, newWebConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebConfig(WebConfig newWebConfig) {
		if (newWebConfig != webConfig) {
			NotificationChain msgs = null;
			if (webConfig != null)
				msgs = ((InternalEObject)webConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__WEB_CONFIG, null, msgs);
			if (newWebConfig != null)
				msgs = ((InternalEObject)newWebConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__WEB_CONFIG, null, msgs);
			msgs = basicSetWebConfig(newWebConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__WEB_CONFIG, newWebConfig, newWebConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Library>(Library.class, this, WebappPackage.WEB_APP__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getView() {
		if (view == null) {
			view = new EObjectContainmentEList<View>(View.class, this, WebappPackage.WEB_APP__VIEW);
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getController() {
		if (controller == null) {
			controller = new EObjectContainmentEList<Controller>(Controller.class, this, WebappPackage.WEB_APP__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFramework() {
		return framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFramework(String newFramework) {
		String oldFramework = framework;
		framework = newFramework;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__FRAMEWORK, oldFramework, framework));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.WEB_APP__APP_CONFIG:
				return basicSetAppConfig(null, msgs);
			case WebappPackage.WEB_APP__WEB_CONFIG:
				return basicSetWebConfig(null, msgs);
			case WebappPackage.WEB_APP__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case WebappPackage.WEB_APP__VIEW:
				return ((InternalEList<?>)getView()).basicRemove(otherEnd, msgs);
			case WebappPackage.WEB_APP__MODEL:
				return basicSetModel(null, msgs);
			case WebappPackage.WEB_APP__CONTROLLER:
				return ((InternalEList<?>)getController()).basicRemove(otherEnd, msgs);
			case WebappPackage.WEB_APP__RESOURCE:
				return basicSetResource(null, msgs);
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
			case WebappPackage.WEB_APP__NAME:
				return getName();
			case WebappPackage.WEB_APP__APP_CONFIG:
				return getAppConfig();
			case WebappPackage.WEB_APP__WEB_CONFIG:
				return getWebConfig();
			case WebappPackage.WEB_APP__LIBRARY:
				return getLibrary();
			case WebappPackage.WEB_APP__VIEW:
				return getView();
			case WebappPackage.WEB_APP__MODEL:
				return getModel();
			case WebappPackage.WEB_APP__CONTROLLER:
				return getController();
			case WebappPackage.WEB_APP__RESOURCE:
				return getResource();
			case WebappPackage.WEB_APP__FRAMEWORK:
				return getFramework();
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
			case WebappPackage.WEB_APP__NAME:
				setName((String)newValue);
				return;
			case WebappPackage.WEB_APP__APP_CONFIG:
				setAppConfig((AppConfig)newValue);
				return;
			case WebappPackage.WEB_APP__WEB_CONFIG:
				setWebConfig((WebConfig)newValue);
				return;
			case WebappPackage.WEB_APP__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends Library>)newValue);
				return;
			case WebappPackage.WEB_APP__VIEW:
				getView().clear();
				getView().addAll((Collection<? extends View>)newValue);
				return;
			case WebappPackage.WEB_APP__MODEL:
				setModel((Model)newValue);
				return;
			case WebappPackage.WEB_APP__CONTROLLER:
				getController().clear();
				getController().addAll((Collection<? extends Controller>)newValue);
				return;
			case WebappPackage.WEB_APP__RESOURCE:
				setResource((Resource)newValue);
				return;
			case WebappPackage.WEB_APP__FRAMEWORK:
				setFramework((String)newValue);
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
			case WebappPackage.WEB_APP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebappPackage.WEB_APP__APP_CONFIG:
				setAppConfig((AppConfig)null);
				return;
			case WebappPackage.WEB_APP__WEB_CONFIG:
				setWebConfig((WebConfig)null);
				return;
			case WebappPackage.WEB_APP__LIBRARY:
				getLibrary().clear();
				return;
			case WebappPackage.WEB_APP__VIEW:
				getView().clear();
				return;
			case WebappPackage.WEB_APP__MODEL:
				setModel((Model)null);
				return;
			case WebappPackage.WEB_APP__CONTROLLER:
				getController().clear();
				return;
			case WebappPackage.WEB_APP__RESOURCE:
				setResource((Resource)null);
				return;
			case WebappPackage.WEB_APP__FRAMEWORK:
				setFramework(FRAMEWORK_EDEFAULT);
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
			case WebappPackage.WEB_APP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebappPackage.WEB_APP__APP_CONFIG:
				return appConfig != null;
			case WebappPackage.WEB_APP__WEB_CONFIG:
				return webConfig != null;
			case WebappPackage.WEB_APP__LIBRARY:
				return library != null && !library.isEmpty();
			case WebappPackage.WEB_APP__VIEW:
				return view != null && !view.isEmpty();
			case WebappPackage.WEB_APP__MODEL:
				return model != null;
			case WebappPackage.WEB_APP__CONTROLLER:
				return controller != null && !controller.isEmpty();
			case WebappPackage.WEB_APP__RESOURCE:
				return resource != null;
			case WebappPackage.WEB_APP__FRAMEWORK:
				return FRAMEWORK_EDEFAULT == null ? framework != null : !FRAMEWORK_EDEFAULT.equals(framework);
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
		result.append(", framework: ");
		result.append(framework);
		result.append(')');
		return result.toString();
	}

} //WebAppImpl
