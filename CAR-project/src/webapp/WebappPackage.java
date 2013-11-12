/**
 */
package webapp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webapp.WebappFactory
 * @model kind="package"
 * @generated
 */
public interface WebappPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webapp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://webapp/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webapp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebappPackage eINSTANCE = webapp.impl.WebappPackageImpl.init();

	/**
	 * The meta object id for the '{@link webapp.impl.WebAppImpl <em>Web App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.WebAppImpl
	 * @see webapp.impl.WebappPackageImpl#getWebApp()
	 * @generated
	 */
	int WEB_APP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__NAME = 0;

	/**
	 * The feature id for the '<em><b>App Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__APP_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Web Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__WEB_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__VIEW = 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__MODEL = 5;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__CONTROLLER = 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__FRAMEWORK = 8;

	/**
	 * The number of structural features of the '<em>Web App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Web App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.AppConfigImpl <em>App Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.AppConfigImpl
	 * @see webapp.impl.WebappPackageImpl#getAppConfig()
	 * @generated
	 */
	int APP_CONFIG = 1;

	/**
	 * The number of structural features of the '<em>App Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>App Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ViewImpl
	 * @see webapp.impl.WebappPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.LibraryImpl
	 * @see webapp.impl.WebappPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 3;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.WebConfigImpl <em>Web Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.WebConfigImpl
	 * @see webapp.impl.WebappPackageImpl#getWebConfig()
	 * @generated
	 */
	int WEB_CONFIG = 4;

	/**
	 * The number of structural features of the '<em>Web Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONFIG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Web Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ModelImpl
	 * @see webapp.impl.WebappPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATABASE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__URL = 2;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__USER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PASSWORD = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ControllerImpl
	 * @see webapp.impl.WebappPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 6;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ResourceImpl
	 * @see webapp.impl.WebappPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__FILE = 1;

	/**
	 * The feature id for the '<em><b>Propertie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROPERTIE = 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ImageImpl
	 * @see webapp.impl.WebappPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 8;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.FileImpl
	 * @see webapp.impl.WebappPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 9;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.PropertiesImpl
	 * @see webapp.impl.WebappPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 10;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.TableImpl
	 * @see webapp.impl.WebappPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CHARSET = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ColumnImpl
	 * @see webapp.impl.WebappPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_NOT_NULL = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ConstraintImpl
	 * @see webapp.impl.WebappPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PRIMARY_KEY = 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__UNIQUE = 1;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CHECK = 2;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__FOREIGN_KEY = 3;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.PrimaryKeyImpl
	 * @see webapp.impl.WebappPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 14;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ForeignKeyImpl
	 * @see webapp.impl.WebappPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 15;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__ON_DELETE = 1;

	/**
	 * The feature id for the '<em><b>On Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__ON_UPDATE = 2;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.UniqueImpl <em>Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.UniqueImpl
	 * @see webapp.impl.WebappPackageImpl#getUnique()
	 * @generated
	 */
	int UNIQUE = 16;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.CheckImpl
	 * @see webapp.impl.WebappPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 17;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__EXPR = 0;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.OnDeleteImpl <em>On Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.OnDeleteImpl
	 * @see webapp.impl.WebappPackageImpl#getOnDelete()
	 * @generated
	 */
	int ON_DELETE = 18;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DELETE__BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>On Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DELETE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>On Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DELETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.OnUpdateImpl <em>On Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.OnUpdateImpl
	 * @see webapp.impl.WebappPackageImpl#getOnUpdate()
	 * @generated
	 */
	int ON_UPDATE = 19;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_UPDATE__BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>On Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_UPDATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>On Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ColumnTypeImpl <em>Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ColumnTypeImpl
	 * @see webapp.impl.WebappPackageImpl#getColumnType()
	 * @generated
	 */
	int COLUMN_TYPE = 20;

	/**
	 * The number of structural features of the '<em>Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.NotIntBitNumericTypeImpl <em>Not Int Bit Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.NotIntBitNumericTypeImpl
	 * @see webapp.impl.WebappPackageImpl#getNotIntBitNumericType()
	 * @generated
	 */
	int NOT_INT_BIT_NUMERIC_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INT_BIT_NUMERIC_TYPE__DETAIL = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Int Bit Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INT_BIT_NUMERIC_TYPE_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Int Bit Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INT_BIT_NUMERIC_TYPE_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.NumericImpl <em>Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.NumericImpl
	 * @see webapp.impl.WebappPackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 21;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__DETAIL = NOT_INT_BIT_NUMERIC_TYPE__DETAIL;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = NOT_INT_BIT_NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION_COUNT = NOT_INT_BIT_NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.DetailImpl <em>Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.DetailImpl
	 * @see webapp.impl.WebappPackageImpl#getDetail()
	 * @generated
	 */
	int DETAIL = 22;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL__PRECISION = 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL__SCALE = 1;

	/**
	 * The number of structural features of the '<em>Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.DecimalImpl <em>Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.DecimalImpl
	 * @see webapp.impl.WebappPackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 23;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__DETAIL = NOT_INT_BIT_NUMERIC_TYPE__DETAIL;

	/**
	 * The number of structural features of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_FEATURE_COUNT = NOT_INT_BIT_NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_OPERATION_COUNT = NOT_INT_BIT_NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.IntImpl <em>Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.IntImpl
	 * @see webapp.impl.WebappPackageImpl#getInt()
	 * @generated
	 */
	int INT = 24;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__SIZE = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Zero Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__USE_ZERO_FILL = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.IntegerImpl
	 * @see webapp.impl.WebappPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 25;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__SIZE = INT__SIZE;

	/**
	 * The feature id for the '<em><b>Use Zero Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__USE_ZERO_FILL = INT__USE_ZERO_FILL;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.SmallIntImpl <em>Small Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.SmallIntImpl
	 * @see webapp.impl.WebappPackageImpl#getSmallInt()
	 * @generated
	 */
	int SMALL_INT = 26;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_INT__SIZE = INT__SIZE;

	/**
	 * The feature id for the '<em><b>Use Zero Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_INT__USE_ZERO_FILL = INT__USE_ZERO_FILL;

	/**
	 * The number of structural features of the '<em>Small Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_INT_FEATURE_COUNT = INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Small Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_INT_OPERATION_COUNT = INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.TinyIntImpl <em>Tiny Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.TinyIntImpl
	 * @see webapp.impl.WebappPackageImpl#getTinyInt()
	 * @generated
	 */
	int TINY_INT = 27;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINY_INT__SIZE = INT__SIZE;

	/**
	 * The feature id for the '<em><b>Use Zero Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINY_INT__USE_ZERO_FILL = INT__USE_ZERO_FILL;

	/**
	 * The number of structural features of the '<em>Tiny Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINY_INT_FEATURE_COUNT = INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tiny Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINY_INT_OPERATION_COUNT = INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.MediumIntImpl <em>Medium Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.MediumIntImpl
	 * @see webapp.impl.WebappPackageImpl#getMediumInt()
	 * @generated
	 */
	int MEDIUM_INT = 28;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_INT__SIZE = INT__SIZE;

	/**
	 * The feature id for the '<em><b>Use Zero Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_INT__USE_ZERO_FILL = INT__USE_ZERO_FILL;

	/**
	 * The number of structural features of the '<em>Medium Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_INT_FEATURE_COUNT = INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Medium Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_INT_OPERATION_COUNT = INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.BigIntImpl <em>Big Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.BigIntImpl
	 * @see webapp.impl.WebappPackageImpl#getBigInt()
	 * @generated
	 */
	int BIG_INT = 29;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INT__SIZE = INT__SIZE;

	/**
	 * The feature id for the '<em><b>Use Zero Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INT__USE_ZERO_FILL = INT__USE_ZERO_FILL;

	/**
	 * The number of structural features of the '<em>Big Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INT_FEATURE_COUNT = INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Big Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INT_OPERATION_COUNT = INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.FloatImpl
	 * @see webapp.impl.WebappPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 31;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__DETAIL = NOT_INT_BIT_NUMERIC_TYPE__DETAIL;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = NOT_INT_BIT_NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = NOT_INT_BIT_NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.RealImpl
	 * @see webapp.impl.WebappPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 32;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__DETAIL = NOT_INT_BIT_NUMERIC_TYPE__DETAIL;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = NOT_INT_BIT_NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = NOT_INT_BIT_NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.DoubleImpl
	 * @see webapp.impl.WebappPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 33;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__DETAIL = NOT_INT_BIT_NUMERIC_TYPE__DETAIL;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = NOT_INT_BIT_NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = NOT_INT_BIT_NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.BitImpl <em>Bit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.BitImpl
	 * @see webapp.impl.WebappPackageImpl#getBit()
	 * @generated
	 */
	int BIT = 34;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__SIZE = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.DateImpl
	 * @see webapp.impl.WebappPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 35;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.DateTimeImpl
	 * @see webapp.impl.WebappPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 36;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.TimeStampImpl <em>Time Stamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.TimeStampImpl
	 * @see webapp.impl.WebappPackageImpl#getTimeStamp()
	 * @generated
	 */
	int TIME_STAMP = 37;

	/**
	 * The number of structural features of the '<em>Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.TimeImpl
	 * @see webapp.impl.WebappPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 38;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.YearImpl
	 * @see webapp.impl.WebappPackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 39;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__SIZE = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.CharImpl
	 * @see webapp.impl.WebappPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 40;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__SIZE = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.VarcharImpl <em>Varchar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.VarcharImpl
	 * @see webapp.impl.WebappPackageImpl#getVarchar()
	 * @generated
	 */
	int VARCHAR = 41;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARCHAR__SIZE = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Varchar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARCHAR_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Varchar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARCHAR_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.BinaryImpl
	 * @see webapp.impl.WebappPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 42;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__SIZE = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.VarBinaryImpl <em>Var Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.VarBinaryImpl
	 * @see webapp.impl.WebappPackageImpl#getVarBinary()
	 * @generated
	 */
	int VAR_BINARY = 43;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_BINARY__SIZE = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_BINARY_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_BINARY_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.BlobImpl <em>Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.BlobImpl
	 * @see webapp.impl.WebappPackageImpl#getBlob()
	 * @generated
	 */
	int BLOB = 44;

	/**
	 * The number of structural features of the '<em>Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.TinyBlobImpl <em>Tiny Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.TinyBlobImpl
	 * @see webapp.impl.WebappPackageImpl#getTinyBlob()
	 * @generated
	 */
	int TINY_BLOB = 45;

	/**
	 * The number of structural features of the '<em>Tiny Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINY_BLOB_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tiny Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINY_BLOB_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.MediumBlobImpl <em>Medium Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.MediumBlobImpl
	 * @see webapp.impl.WebappPackageImpl#getMediumBlob()
	 * @generated
	 */
	int MEDIUM_BLOB = 46;

	/**
	 * The number of structural features of the '<em>Medium Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_BLOB_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Medium Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_BLOB_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.LongBlobImpl <em>Long Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.LongBlobImpl
	 * @see webapp.impl.WebappPackageImpl#getLongBlob()
	 * @generated
	 */
	int LONG_BLOB = 47;

	/**
	 * The number of structural features of the '<em>Long Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BLOB_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_BLOB_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.TinyTextImpl <em>Tiny Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.TinyTextImpl
	 * @see webapp.impl.WebappPackageImpl#getTinyText()
	 * @generated
	 */
	int TINY_TEXT = 48;

	/**
	 * The number of structural features of the '<em>Tiny Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINY_TEXT_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tiny Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINY_TEXT_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.TextImpl
	 * @see webapp.impl.WebappPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 49;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.MediumTextImpl <em>Medium Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.MediumTextImpl
	 * @see webapp.impl.WebappPackageImpl#getMediumText()
	 * @generated
	 */
	int MEDIUM_TEXT = 50;

	/**
	 * The number of structural features of the '<em>Medium Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_TEXT_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Medium Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_TEXT_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.LongTextImpl <em>Long Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.LongTextImpl
	 * @see webapp.impl.WebappPackageImpl#getLongText()
	 * @generated
	 */
	int LONG_TEXT = 51;

	/**
	 * The number of structural features of the '<em>Long Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_TEXT_FEATURE_COUNT = COLUMN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_TEXT_OPERATION_COUNT = COLUMN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.Behavior <em>Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.Behavior
	 * @see webapp.impl.WebappPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 52;

	/**
	 * The meta object id for the '{@link webapp.Charset <em>Charset</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.Charset
	 * @see webapp.impl.WebappPackageImpl#getCharset()
	 * @generated
	 */
	int CHARSET = 53;

	/**
	 * The meta object id for the '{@link webapp.YearSize <em>Year Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.YearSize
	 * @see webapp.impl.WebappPackageImpl#getYearSize()
	 * @generated
	 */
	int YEAR_SIZE = 54;


	/**
	 * Returns the meta object for class '{@link webapp.WebApp <em>Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web App</em>'.
	 * @see webapp.WebApp
	 * @generated
	 */
	EClass getWebApp();

	/**
	 * Returns the meta object for the attribute '{@link webapp.WebApp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webapp.WebApp#getName()
	 * @see #getWebApp()
	 * @generated
	 */
	EAttribute getWebApp_Name();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.WebApp#getAppConfig <em>App Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App Config</em>'.
	 * @see webapp.WebApp#getAppConfig()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_AppConfig();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.WebApp#getWebConfig <em>Web Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Config</em>'.
	 * @see webapp.WebApp#getWebConfig()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_WebConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.WebApp#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library</em>'.
	 * @see webapp.WebApp#getLibrary()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Library();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.WebApp#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see webapp.WebApp#getView()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_View();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.WebApp#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see webapp.WebApp#getModel()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.WebApp#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller</em>'.
	 * @see webapp.WebApp#getController()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Controller();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.WebApp#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see webapp.WebApp#getResource()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Resource();

	/**
	 * Returns the meta object for the attribute '{@link webapp.WebApp#getFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework</em>'.
	 * @see webapp.WebApp#getFramework()
	 * @see #getWebApp()
	 * @generated
	 */
	EAttribute getWebApp_Framework();

	/**
	 * Returns the meta object for class '{@link webapp.AppConfig <em>App Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Config</em>'.
	 * @see webapp.AppConfig
	 * @generated
	 */
	EClass getAppConfig();

	/**
	 * Returns the meta object for class '{@link webapp.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see webapp.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for class '{@link webapp.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see webapp.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for class '{@link webapp.WebConfig <em>Web Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Config</em>'.
	 * @see webapp.WebConfig
	 * @generated
	 */
	EClass getWebConfig();

	/**
	 * Returns the meta object for class '{@link webapp.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see webapp.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Model#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see webapp.Model#getTable()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Table();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Model#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see webapp.Model#getDatabaseName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Model#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see webapp.Model#getUrl()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Url();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Model#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see webapp.Model#getUserName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_UserName();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Model#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see webapp.Model#getPassword()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Password();

	/**
	 * Returns the meta object for class '{@link webapp.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see webapp.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for class '{@link webapp.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see webapp.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Resource#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see webapp.Resource#getImage()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Resource#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File</em>'.
	 * @see webapp.Resource#getFile()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_File();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Resource#getPropertie <em>Propertie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propertie</em>'.
	 * @see webapp.Resource#getPropertie()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Propertie();

	/**
	 * Returns the meta object for class '{@link webapp.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see webapp.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link webapp.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see webapp.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '{@link webapp.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see webapp.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for class '{@link webapp.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see webapp.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webapp.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Table#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see webapp.Table#getColumn()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Column();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.Table#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see webapp.Table#getConstraint()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Table#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see webapp.Table#getCharset()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Charset();

	/**
	 * Returns the meta object for class '{@link webapp.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see webapp.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webapp.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Column#isIsNotNull <em>Is Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Not Null</em>'.
	 * @see webapp.Column#isIsNotNull()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsNotNull();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Column#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see webapp.Column#getDefaultValue()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_DefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see webapp.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Type();

	/**
	 * Returns the meta object for class '{@link webapp.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see webapp.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.Constraint#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key</em>'.
	 * @see webapp.Constraint#getPrimaryKey()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Constraint#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique</em>'.
	 * @see webapp.Constraint#getUnique()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Unique();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Constraint#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check</em>'.
	 * @see webapp.Constraint#getCheck()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Check();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Constraint#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key</em>'.
	 * @see webapp.Constraint#getForeignKey()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ForeignKey();

	/**
	 * Returns the meta object for class '{@link webapp.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see webapp.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the reference list '{@link webapp.PrimaryKey#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column</em>'.
	 * @see webapp.PrimaryKey#getColumn()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Column();

	/**
	 * Returns the meta object for class '{@link webapp.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see webapp.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link webapp.ForeignKey#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see webapp.ForeignKey#getColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Column();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.ForeignKey#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Delete</em>'.
	 * @see webapp.ForeignKey#getOnDelete()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_OnDelete();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.ForeignKey#getOnUpdate <em>On Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Update</em>'.
	 * @see webapp.ForeignKey#getOnUpdate()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_OnUpdate();

	/**
	 * Returns the meta object for class '{@link webapp.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique</em>'.
	 * @see webapp.Unique
	 * @generated
	 */
	EClass getUnique();

	/**
	 * Returns the meta object for the reference list '{@link webapp.Unique#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column</em>'.
	 * @see webapp.Unique#getColumn()
	 * @see #getUnique()
	 * @generated
	 */
	EReference getUnique_Column();

	/**
	 * Returns the meta object for class '{@link webapp.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see webapp.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Check#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see webapp.Check#getExpr()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Expr();

	/**
	 * Returns the meta object for class '{@link webapp.OnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Delete</em>'.
	 * @see webapp.OnDelete
	 * @generated
	 */
	EClass getOnDelete();

	/**
	 * Returns the meta object for the attribute '{@link webapp.OnDelete#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see webapp.OnDelete#getBehavior()
	 * @see #getOnDelete()
	 * @generated
	 */
	EAttribute getOnDelete_Behavior();

	/**
	 * Returns the meta object for class '{@link webapp.OnUpdate <em>On Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Update</em>'.
	 * @see webapp.OnUpdate
	 * @generated
	 */
	EClass getOnUpdate();

	/**
	 * Returns the meta object for the attribute '{@link webapp.OnUpdate#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see webapp.OnUpdate#getBehavior()
	 * @see #getOnUpdate()
	 * @generated
	 */
	EAttribute getOnUpdate_Behavior();

	/**
	 * Returns the meta object for class '{@link webapp.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type</em>'.
	 * @see webapp.ColumnType
	 * @generated
	 */
	EClass getColumnType();

	/**
	 * Returns the meta object for class '{@link webapp.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see webapp.Numeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for class '{@link webapp.Detail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail</em>'.
	 * @see webapp.Detail
	 * @generated
	 */
	EClass getDetail();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Detail#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see webapp.Detail#getPrecision()
	 * @see #getDetail()
	 * @generated
	 */
	EAttribute getDetail_Precision();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Detail#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see webapp.Detail#getScale()
	 * @see #getDetail()
	 * @generated
	 */
	EAttribute getDetail_Scale();

	/**
	 * Returns the meta object for class '{@link webapp.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal</em>'.
	 * @see webapp.Decimal
	 * @generated
	 */
	EClass getDecimal();

	/**
	 * Returns the meta object for class '{@link webapp.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int</em>'.
	 * @see webapp.Int
	 * @generated
	 */
	EClass getInt();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Int#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see webapp.Int#getSize()
	 * @see #getInt()
	 * @generated
	 */
	EAttribute getInt_Size();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Int#isUseZeroFill <em>Use Zero Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Zero Fill</em>'.
	 * @see webapp.Int#isUseZeroFill()
	 * @see #getInt()
	 * @generated
	 */
	EAttribute getInt_UseZeroFill();

	/**
	 * Returns the meta object for class '{@link webapp.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see webapp.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link webapp.SmallInt <em>Small Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Int</em>'.
	 * @see webapp.SmallInt
	 * @generated
	 */
	EClass getSmallInt();

	/**
	 * Returns the meta object for class '{@link webapp.TinyInt <em>Tiny Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tiny Int</em>'.
	 * @see webapp.TinyInt
	 * @generated
	 */
	EClass getTinyInt();

	/**
	 * Returns the meta object for class '{@link webapp.MediumInt <em>Medium Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium Int</em>'.
	 * @see webapp.MediumInt
	 * @generated
	 */
	EClass getMediumInt();

	/**
	 * Returns the meta object for class '{@link webapp.BigInt <em>Big Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Int</em>'.
	 * @see webapp.BigInt
	 * @generated
	 */
	EClass getBigInt();

	/**
	 * Returns the meta object for class '{@link webapp.NotIntBitNumericType <em>Not Int Bit Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Int Bit Numeric Type</em>'.
	 * @see webapp.NotIntBitNumericType
	 * @generated
	 */
	EClass getNotIntBitNumericType();

	/**
	 * Returns the meta object for the reference '{@link webapp.NotIntBitNumericType#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detail</em>'.
	 * @see webapp.NotIntBitNumericType#getDetail()
	 * @see #getNotIntBitNumericType()
	 * @generated
	 */
	EReference getNotIntBitNumericType_Detail();

	/**
	 * Returns the meta object for class '{@link webapp.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see webapp.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link webapp.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see webapp.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '{@link webapp.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see webapp.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link webapp.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit</em>'.
	 * @see webapp.Bit
	 * @generated
	 */
	EClass getBit();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Bit#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see webapp.Bit#getSize()
	 * @see #getBit()
	 * @generated
	 */
	EAttribute getBit_Size();

	/**
	 * Returns the meta object for class '{@link webapp.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see webapp.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link webapp.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see webapp.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for class '{@link webapp.TimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stamp</em>'.
	 * @see webapp.TimeStamp
	 * @generated
	 */
	EClass getTimeStamp();

	/**
	 * Returns the meta object for class '{@link webapp.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see webapp.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link webapp.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see webapp.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Year#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see webapp.Year#getSize()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_Size();

	/**
	 * Returns the meta object for class '{@link webapp.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see webapp.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Char#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see webapp.Char#getSize()
	 * @see #getChar()
	 * @generated
	 */
	EAttribute getChar_Size();

	/**
	 * Returns the meta object for class '{@link webapp.Varchar <em>Varchar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Varchar</em>'.
	 * @see webapp.Varchar
	 * @generated
	 */
	EClass getVarchar();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Varchar#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see webapp.Varchar#getSize()
	 * @see #getVarchar()
	 * @generated
	 */
	EAttribute getVarchar_Size();

	/**
	 * Returns the meta object for class '{@link webapp.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see webapp.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Binary#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see webapp.Binary#getSize()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Size();

	/**
	 * Returns the meta object for class '{@link webapp.VarBinary <em>Var Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Binary</em>'.
	 * @see webapp.VarBinary
	 * @generated
	 */
	EClass getVarBinary();

	/**
	 * Returns the meta object for the attribute '{@link webapp.VarBinary#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see webapp.VarBinary#getSize()
	 * @see #getVarBinary()
	 * @generated
	 */
	EAttribute getVarBinary_Size();

	/**
	 * Returns the meta object for class '{@link webapp.Blob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob</em>'.
	 * @see webapp.Blob
	 * @generated
	 */
	EClass getBlob();

	/**
	 * Returns the meta object for class '{@link webapp.TinyBlob <em>Tiny Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tiny Blob</em>'.
	 * @see webapp.TinyBlob
	 * @generated
	 */
	EClass getTinyBlob();

	/**
	 * Returns the meta object for class '{@link webapp.MediumBlob <em>Medium Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium Blob</em>'.
	 * @see webapp.MediumBlob
	 * @generated
	 */
	EClass getMediumBlob();

	/**
	 * Returns the meta object for class '{@link webapp.LongBlob <em>Long Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Blob</em>'.
	 * @see webapp.LongBlob
	 * @generated
	 */
	EClass getLongBlob();

	/**
	 * Returns the meta object for class '{@link webapp.TinyText <em>Tiny Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tiny Text</em>'.
	 * @see webapp.TinyText
	 * @generated
	 */
	EClass getTinyText();

	/**
	 * Returns the meta object for class '{@link webapp.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see webapp.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link webapp.MediumText <em>Medium Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium Text</em>'.
	 * @see webapp.MediumText
	 * @generated
	 */
	EClass getMediumText();

	/**
	 * Returns the meta object for class '{@link webapp.LongText <em>Long Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Text</em>'.
	 * @see webapp.LongText
	 * @generated
	 */
	EClass getLongText();

	/**
	 * Returns the meta object for enum '{@link webapp.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior</em>'.
	 * @see webapp.Behavior
	 * @generated
	 */
	EEnum getBehavior();

	/**
	 * Returns the meta object for enum '{@link webapp.Charset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charset</em>'.
	 * @see webapp.Charset
	 * @generated
	 */
	EEnum getCharset();

	/**
	 * Returns the meta object for enum '{@link webapp.YearSize <em>Year Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Year Size</em>'.
	 * @see webapp.YearSize
	 * @generated
	 */
	EEnum getYearSize();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebappFactory getWebappFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webapp.impl.WebAppImpl <em>Web App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.WebAppImpl
		 * @see webapp.impl.WebappPackageImpl#getWebApp()
		 * @generated
		 */
		EClass WEB_APP = eINSTANCE.getWebApp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APP__NAME = eINSTANCE.getWebApp_Name();

		/**
		 * The meta object literal for the '<em><b>App Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__APP_CONFIG = eINSTANCE.getWebApp_AppConfig();

		/**
		 * The meta object literal for the '<em><b>Web Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__WEB_CONFIG = eINSTANCE.getWebApp_WebConfig();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__LIBRARY = eINSTANCE.getWebApp_Library();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__VIEW = eINSTANCE.getWebApp_View();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__MODEL = eINSTANCE.getWebApp_Model();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__CONTROLLER = eINSTANCE.getWebApp_Controller();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__RESOURCE = eINSTANCE.getWebApp_Resource();

		/**
		 * The meta object literal for the '<em><b>Framework</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APP__FRAMEWORK = eINSTANCE.getWebApp_Framework();

		/**
		 * The meta object literal for the '{@link webapp.impl.AppConfigImpl <em>App Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.AppConfigImpl
		 * @see webapp.impl.WebappPackageImpl#getAppConfig()
		 * @generated
		 */
		EClass APP_CONFIG = eINSTANCE.getAppConfig();

		/**
		 * The meta object literal for the '{@link webapp.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ViewImpl
		 * @see webapp.impl.WebappPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '{@link webapp.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.LibraryImpl
		 * @see webapp.impl.WebappPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link webapp.impl.WebConfigImpl <em>Web Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.WebConfigImpl
		 * @see webapp.impl.WebappPackageImpl#getWebConfig()
		 * @generated
		 */
		EClass WEB_CONFIG = eINSTANCE.getWebConfig();

		/**
		 * The meta object literal for the '{@link webapp.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ModelImpl
		 * @see webapp.impl.WebappPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TABLE = eINSTANCE.getModel_Table();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__DATABASE_NAME = eINSTANCE.getModel_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__URL = eINSTANCE.getModel_Url();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__USER_NAME = eINSTANCE.getModel_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PASSWORD = eINSTANCE.getModel_Password();

		/**
		 * The meta object literal for the '{@link webapp.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ControllerImpl
		 * @see webapp.impl.WebappPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '{@link webapp.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ResourceImpl
		 * @see webapp.impl.WebappPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__IMAGE = eINSTANCE.getResource_Image();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__FILE = eINSTANCE.getResource_File();

		/**
		 * The meta object literal for the '<em><b>Propertie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PROPERTIE = eINSTANCE.getResource_Propertie();

		/**
		 * The meta object literal for the '{@link webapp.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ImageImpl
		 * @see webapp.impl.WebappPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link webapp.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.FileImpl
		 * @see webapp.impl.WebappPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link webapp.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.PropertiesImpl
		 * @see webapp.impl.WebappPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '{@link webapp.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.TableImpl
		 * @see webapp.impl.WebappPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMN = eINSTANCE.getTable_Column();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CONSTRAINT = eINSTANCE.getTable_Constraint();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CHARSET = eINSTANCE.getTable_Charset();

		/**
		 * The meta object literal for the '{@link webapp.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ColumnImpl
		 * @see webapp.impl.WebappPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Is Not Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_NOT_NULL = eINSTANCE.getColumn_IsNotNull();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DEFAULT_VALUE = eINSTANCE.getColumn_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link webapp.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ConstraintImpl
		 * @see webapp.impl.WebappPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__PRIMARY_KEY = eINSTANCE.getConstraint_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__UNIQUE = eINSTANCE.getConstraint_Unique();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CHECK = eINSTANCE.getConstraint_Check();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__FOREIGN_KEY = eINSTANCE.getConstraint_ForeignKey();

		/**
		 * The meta object literal for the '{@link webapp.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.PrimaryKeyImpl
		 * @see webapp.impl.WebappPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__COLUMN = eINSTANCE.getPrimaryKey_Column();

		/**
		 * The meta object literal for the '{@link webapp.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ForeignKeyImpl
		 * @see webapp.impl.WebappPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__COLUMN = eINSTANCE.getForeignKey_Column();

		/**
		 * The meta object literal for the '<em><b>On Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__ON_DELETE = eINSTANCE.getForeignKey_OnDelete();

		/**
		 * The meta object literal for the '<em><b>On Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__ON_UPDATE = eINSTANCE.getForeignKey_OnUpdate();

		/**
		 * The meta object literal for the '{@link webapp.impl.UniqueImpl <em>Unique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.UniqueImpl
		 * @see webapp.impl.WebappPackageImpl#getUnique()
		 * @generated
		 */
		EClass UNIQUE = eINSTANCE.getUnique();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE__COLUMN = eINSTANCE.getUnique_Column();

		/**
		 * The meta object literal for the '{@link webapp.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.CheckImpl
		 * @see webapp.impl.WebappPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__EXPR = eINSTANCE.getCheck_Expr();

		/**
		 * The meta object literal for the '{@link webapp.impl.OnDeleteImpl <em>On Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.OnDeleteImpl
		 * @see webapp.impl.WebappPackageImpl#getOnDelete()
		 * @generated
		 */
		EClass ON_DELETE = eINSTANCE.getOnDelete();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_DELETE__BEHAVIOR = eINSTANCE.getOnDelete_Behavior();

		/**
		 * The meta object literal for the '{@link webapp.impl.OnUpdateImpl <em>On Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.OnUpdateImpl
		 * @see webapp.impl.WebappPackageImpl#getOnUpdate()
		 * @generated
		 */
		EClass ON_UPDATE = eINSTANCE.getOnUpdate();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_UPDATE__BEHAVIOR = eINSTANCE.getOnUpdate_Behavior();

		/**
		 * The meta object literal for the '{@link webapp.impl.ColumnTypeImpl <em>Column Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ColumnTypeImpl
		 * @see webapp.impl.WebappPackageImpl#getColumnType()
		 * @generated
		 */
		EClass COLUMN_TYPE = eINSTANCE.getColumnType();

		/**
		 * The meta object literal for the '{@link webapp.impl.NumericImpl <em>Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.NumericImpl
		 * @see webapp.impl.WebappPackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '{@link webapp.impl.DetailImpl <em>Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.DetailImpl
		 * @see webapp.impl.WebappPackageImpl#getDetail()
		 * @generated
		 */
		EClass DETAIL = eINSTANCE.getDetail();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL__PRECISION = eINSTANCE.getDetail_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL__SCALE = eINSTANCE.getDetail_Scale();

		/**
		 * The meta object literal for the '{@link webapp.impl.DecimalImpl <em>Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.DecimalImpl
		 * @see webapp.impl.WebappPackageImpl#getDecimal()
		 * @generated
		 */
		EClass DECIMAL = eINSTANCE.getDecimal();

		/**
		 * The meta object literal for the '{@link webapp.impl.IntImpl <em>Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.IntImpl
		 * @see webapp.impl.WebappPackageImpl#getInt()
		 * @generated
		 */
		EClass INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT__SIZE = eINSTANCE.getInt_Size();

		/**
		 * The meta object literal for the '<em><b>Use Zero Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT__USE_ZERO_FILL = eINSTANCE.getInt_UseZeroFill();

		/**
		 * The meta object literal for the '{@link webapp.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.IntegerImpl
		 * @see webapp.impl.WebappPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link webapp.impl.SmallIntImpl <em>Small Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.SmallIntImpl
		 * @see webapp.impl.WebappPackageImpl#getSmallInt()
		 * @generated
		 */
		EClass SMALL_INT = eINSTANCE.getSmallInt();

		/**
		 * The meta object literal for the '{@link webapp.impl.TinyIntImpl <em>Tiny Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.TinyIntImpl
		 * @see webapp.impl.WebappPackageImpl#getTinyInt()
		 * @generated
		 */
		EClass TINY_INT = eINSTANCE.getTinyInt();

		/**
		 * The meta object literal for the '{@link webapp.impl.MediumIntImpl <em>Medium Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.MediumIntImpl
		 * @see webapp.impl.WebappPackageImpl#getMediumInt()
		 * @generated
		 */
		EClass MEDIUM_INT = eINSTANCE.getMediumInt();

		/**
		 * The meta object literal for the '{@link webapp.impl.BigIntImpl <em>Big Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.BigIntImpl
		 * @see webapp.impl.WebappPackageImpl#getBigInt()
		 * @generated
		 */
		EClass BIG_INT = eINSTANCE.getBigInt();

		/**
		 * The meta object literal for the '{@link webapp.impl.NotIntBitNumericTypeImpl <em>Not Int Bit Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.NotIntBitNumericTypeImpl
		 * @see webapp.impl.WebappPackageImpl#getNotIntBitNumericType()
		 * @generated
		 */
		EClass NOT_INT_BIT_NUMERIC_TYPE = eINSTANCE.getNotIntBitNumericType();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_INT_BIT_NUMERIC_TYPE__DETAIL = eINSTANCE.getNotIntBitNumericType_Detail();

		/**
		 * The meta object literal for the '{@link webapp.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.FloatImpl
		 * @see webapp.impl.WebappPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link webapp.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.RealImpl
		 * @see webapp.impl.WebappPackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '{@link webapp.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.DoubleImpl
		 * @see webapp.impl.WebappPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link webapp.impl.BitImpl <em>Bit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.BitImpl
		 * @see webapp.impl.WebappPackageImpl#getBit()
		 * @generated
		 */
		EClass BIT = eINSTANCE.getBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT__SIZE = eINSTANCE.getBit_Size();

		/**
		 * The meta object literal for the '{@link webapp.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.DateImpl
		 * @see webapp.impl.WebappPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link webapp.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.DateTimeImpl
		 * @see webapp.impl.WebappPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '{@link webapp.impl.TimeStampImpl <em>Time Stamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.TimeStampImpl
		 * @see webapp.impl.WebappPackageImpl#getTimeStamp()
		 * @generated
		 */
		EClass TIME_STAMP = eINSTANCE.getTimeStamp();

		/**
		 * The meta object literal for the '{@link webapp.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.TimeImpl
		 * @see webapp.impl.WebappPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link webapp.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.YearImpl
		 * @see webapp.impl.WebappPackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__SIZE = eINSTANCE.getYear_Size();

		/**
		 * The meta object literal for the '{@link webapp.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.CharImpl
		 * @see webapp.impl.WebappPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR__SIZE = eINSTANCE.getChar_Size();

		/**
		 * The meta object literal for the '{@link webapp.impl.VarcharImpl <em>Varchar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.VarcharImpl
		 * @see webapp.impl.WebappPackageImpl#getVarchar()
		 * @generated
		 */
		EClass VARCHAR = eINSTANCE.getVarchar();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARCHAR__SIZE = eINSTANCE.getVarchar_Size();

		/**
		 * The meta object literal for the '{@link webapp.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.BinaryImpl
		 * @see webapp.impl.WebappPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__SIZE = eINSTANCE.getBinary_Size();

		/**
		 * The meta object literal for the '{@link webapp.impl.VarBinaryImpl <em>Var Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.VarBinaryImpl
		 * @see webapp.impl.WebappPackageImpl#getVarBinary()
		 * @generated
		 */
		EClass VAR_BINARY = eINSTANCE.getVarBinary();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_BINARY__SIZE = eINSTANCE.getVarBinary_Size();

		/**
		 * The meta object literal for the '{@link webapp.impl.BlobImpl <em>Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.BlobImpl
		 * @see webapp.impl.WebappPackageImpl#getBlob()
		 * @generated
		 */
		EClass BLOB = eINSTANCE.getBlob();

		/**
		 * The meta object literal for the '{@link webapp.impl.TinyBlobImpl <em>Tiny Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.TinyBlobImpl
		 * @see webapp.impl.WebappPackageImpl#getTinyBlob()
		 * @generated
		 */
		EClass TINY_BLOB = eINSTANCE.getTinyBlob();

		/**
		 * The meta object literal for the '{@link webapp.impl.MediumBlobImpl <em>Medium Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.MediumBlobImpl
		 * @see webapp.impl.WebappPackageImpl#getMediumBlob()
		 * @generated
		 */
		EClass MEDIUM_BLOB = eINSTANCE.getMediumBlob();

		/**
		 * The meta object literal for the '{@link webapp.impl.LongBlobImpl <em>Long Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.LongBlobImpl
		 * @see webapp.impl.WebappPackageImpl#getLongBlob()
		 * @generated
		 */
		EClass LONG_BLOB = eINSTANCE.getLongBlob();

		/**
		 * The meta object literal for the '{@link webapp.impl.TinyTextImpl <em>Tiny Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.TinyTextImpl
		 * @see webapp.impl.WebappPackageImpl#getTinyText()
		 * @generated
		 */
		EClass TINY_TEXT = eINSTANCE.getTinyText();

		/**
		 * The meta object literal for the '{@link webapp.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.TextImpl
		 * @see webapp.impl.WebappPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link webapp.impl.MediumTextImpl <em>Medium Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.MediumTextImpl
		 * @see webapp.impl.WebappPackageImpl#getMediumText()
		 * @generated
		 */
		EClass MEDIUM_TEXT = eINSTANCE.getMediumText();

		/**
		 * The meta object literal for the '{@link webapp.impl.LongTextImpl <em>Long Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.LongTextImpl
		 * @see webapp.impl.WebappPackageImpl#getLongText()
		 * @generated
		 */
		EClass LONG_TEXT = eINSTANCE.getLongText();

		/**
		 * The meta object literal for the '{@link webapp.Behavior <em>Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.Behavior
		 * @see webapp.impl.WebappPackageImpl#getBehavior()
		 * @generated
		 */
		EEnum BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '{@link webapp.Charset <em>Charset</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.Charset
		 * @see webapp.impl.WebappPackageImpl#getCharset()
		 * @generated
		 */
		EEnum CHARSET = eINSTANCE.getCharset();

		/**
		 * The meta object literal for the '{@link webapp.YearSize <em>Year Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.YearSize
		 * @see webapp.impl.WebappPackageImpl#getYearSize()
		 * @generated
		 */
		EEnum YEAR_SIZE = eINSTANCE.getYearSize();

	}

} //WebappPackage
