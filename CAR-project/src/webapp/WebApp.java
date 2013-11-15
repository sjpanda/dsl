/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.WebApp#getName <em>Name</em>}</li>
 *   <li>{@link webapp.WebApp#getAppConfig <em>App Config</em>}</li>
 *   <li>{@link webapp.WebApp#getWebConfig <em>Web Config</em>}</li>
 *   <li>{@link webapp.WebApp#getLibrary <em>Library</em>}</li>
 *   <li>{@link webapp.WebApp#getView <em>View</em>}</li>
 *   <li>{@link webapp.WebApp#getModel <em>Model</em>}</li>
 *   <li>{@link webapp.WebApp#getController <em>Controller</em>}</li>
 *   <li>{@link webapp.WebApp#getResource <em>Resource</em>}</li>
 *   <li>{@link webapp.WebApp#getFramework <em>Framework</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getWebApp()
 * @model
 * @generated
 */
public interface WebApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see webapp.WebappPackage#getWebApp_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link webapp.WebApp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>App Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Config</em>' containment reference.
	 * @see #setAppConfig(AppConfig)
	 * @see webapp.WebappPackage#getWebApp_AppConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AppConfig getAppConfig();

	/**
	 * Sets the value of the '{@link webapp.WebApp#getAppConfig <em>App Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Config</em>' containment reference.
	 * @see #getAppConfig()
	 * @generated
	 */
	void setAppConfig(AppConfig value);

	/**
	 * Returns the value of the '<em><b>Web Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Config</em>' containment reference.
	 * @see #setWebConfig(WebConfig)
	 * @see webapp.WebappPackage#getWebApp_WebConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WebConfig getWebConfig();

	/**
	 * Sets the value of the '{@link webapp.WebApp#getWebConfig <em>Web Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Config</em>' containment reference.
	 * @see #getWebConfig()
	 * @generated
	 */
	void setWebConfig(WebConfig value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see webapp.WebappPackage#getWebApp_Library()
	 * @model containment="true"
	 * @generated
	 */
	EList<Library> getLibrary();

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #setView(View)
	 * @see webapp.WebappPackage#getWebApp_View()
	 * @model containment="true" required="true"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link webapp.WebApp#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(Model)
	 * @see webapp.WebappPackage#getWebApp_Model()
	 * @model containment="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link webapp.WebApp#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference.
	 * @see #setController(Controller)
	 * @see webapp.WebappPackage#getWebApp_Controller()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link webapp.WebApp#getController <em>Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' containment reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Resource)
	 * @see webapp.WebappPackage#getWebApp_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link webapp.WebApp#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework</em>' attribute.
	 * @see #setFramework(String)
	 * @see webapp.WebappPackage#getWebApp_Framework()
	 * @model required="true"
	 * @generated
	 */
	String getFramework();

	/**
	 * Sets the value of the '{@link webapp.WebApp#getFramework <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework</em>' attribute.
	 * @see #getFramework()
	 * @generated
	 */
	void setFramework(String value);

} // WebApp
