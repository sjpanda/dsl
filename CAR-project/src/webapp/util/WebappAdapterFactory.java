/**
 */
package webapp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import webapp.AppConfig;
import webapp.BigInt;
import webapp.Binary;
import webapp.Bit;
import webapp.Blob;
import webapp.Char;
import webapp.Check;
import webapp.Column;
import webapp.ColumnType;
import webapp.Constraint;
import webapp.Controller;
import webapp.Date;
import webapp.DateTime;
import webapp.Decimal;
import webapp.Detail;
import webapp.File;
import webapp.ForeignKey;
import webapp.Image;
import webapp.Int;
import webapp.Library;
import webapp.LongBlob;
import webapp.LongText;
import webapp.MediumBlob;
import webapp.MediumInt;
import webapp.MediumText;
import webapp.Model;
import webapp.NotIntBitNumericType;
import webapp.Numeric;
import webapp.OnDelete;
import webapp.OnUpdate;
import webapp.PrimaryKey;
import webapp.Properties;
import webapp.Real;
import webapp.Resource;
import webapp.SmallInt;
import webapp.Table;
import webapp.Text;
import webapp.Time;
import webapp.TimeStamp;
import webapp.TinyBlob;
import webapp.TinyInt;
import webapp.TinyText;
import webapp.Unique;
import webapp.VarBinary;
import webapp.Varchar;
import webapp.View;
import webapp.WebApp;
import webapp.WebConfig;
import webapp.WebappPackage;
import webapp.Year;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage
 * @generated
 */
public class WebappAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebappPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebappAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebappPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebappSwitch<Adapter> modelSwitch =
		new WebappSwitch<Adapter>() {
			@Override
			public Adapter caseWebApp(WebApp object) {
				return createWebAppAdapter();
			}
			@Override
			public Adapter caseAppConfig(AppConfig object) {
				return createAppConfigAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseWebConfig(WebConfig object) {
				return createWebConfigAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter casePrimaryKey(PrimaryKey object) {
				return createPrimaryKeyAdapter();
			}
			@Override
			public Adapter caseForeignKey(ForeignKey object) {
				return createForeignKeyAdapter();
			}
			@Override
			public Adapter caseUnique(Unique object) {
				return createUniqueAdapter();
			}
			@Override
			public Adapter caseCheck(Check object) {
				return createCheckAdapter();
			}
			@Override
			public Adapter caseOnDelete(OnDelete object) {
				return createOnDeleteAdapter();
			}
			@Override
			public Adapter caseOnUpdate(OnUpdate object) {
				return createOnUpdateAdapter();
			}
			@Override
			public Adapter caseColumnType(ColumnType object) {
				return createColumnTypeAdapter();
			}
			@Override
			public Adapter caseNumeric(Numeric object) {
				return createNumericAdapter();
			}
			@Override
			public Adapter caseDetail(Detail object) {
				return createDetailAdapter();
			}
			@Override
			public Adapter caseDecimal(Decimal object) {
				return createDecimalAdapter();
			}
			@Override
			public Adapter caseInt(Int object) {
				return createIntAdapter();
			}
			@Override
			public Adapter caseInteger(webapp.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseSmallInt(SmallInt object) {
				return createSmallIntAdapter();
			}
			@Override
			public Adapter caseTinyInt(TinyInt object) {
				return createTinyIntAdapter();
			}
			@Override
			public Adapter caseMediumInt(MediumInt object) {
				return createMediumIntAdapter();
			}
			@Override
			public Adapter caseBigInt(BigInt object) {
				return createBigIntAdapter();
			}
			@Override
			public Adapter caseNotIntBitNumericType(NotIntBitNumericType object) {
				return createNotIntBitNumericTypeAdapter();
			}
			@Override
			public Adapter caseFloat(webapp.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseReal(Real object) {
				return createRealAdapter();
			}
			@Override
			public Adapter caseDouble(webapp.Double object) {
				return createDoubleAdapter();
			}
			@Override
			public Adapter caseBit(Bit object) {
				return createBitAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseTimeStamp(TimeStamp object) {
				return createTimeStampAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseYear(Year object) {
				return createYearAdapter();
			}
			@Override
			public Adapter caseChar(Char object) {
				return createCharAdapter();
			}
			@Override
			public Adapter caseVarchar(Varchar object) {
				return createVarcharAdapter();
			}
			@Override
			public Adapter caseBinary(Binary object) {
				return createBinaryAdapter();
			}
			@Override
			public Adapter caseVarBinary(VarBinary object) {
				return createVarBinaryAdapter();
			}
			@Override
			public Adapter caseBlob(Blob object) {
				return createBlobAdapter();
			}
			@Override
			public Adapter caseTinyBlob(TinyBlob object) {
				return createTinyBlobAdapter();
			}
			@Override
			public Adapter caseMediumBlob(MediumBlob object) {
				return createMediumBlobAdapter();
			}
			@Override
			public Adapter caseLongBlob(LongBlob object) {
				return createLongBlobAdapter();
			}
			@Override
			public Adapter caseTinyText(TinyText object) {
				return createTinyTextAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseMediumText(MediumText object) {
				return createMediumTextAdapter();
			}
			@Override
			public Adapter caseLongText(LongText object) {
				return createLongTextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link webapp.WebApp <em>Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.WebApp
	 * @generated
	 */
	public Adapter createWebAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.AppConfig <em>App Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.AppConfig
	 * @generated
	 */
	public Adapter createAppConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.WebConfig <em>Web Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.WebConfig
	 * @generated
	 */
	public Adapter createWebConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.PrimaryKey
	 * @generated
	 */
	public Adapter createPrimaryKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.ForeignKey
	 * @generated
	 */
	public Adapter createForeignKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Unique
	 * @generated
	 */
	public Adapter createUniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Check
	 * @generated
	 */
	public Adapter createCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.OnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.OnDelete
	 * @generated
	 */
	public Adapter createOnDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.OnUpdate <em>On Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.OnUpdate
	 * @generated
	 */
	public Adapter createOnUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.ColumnType
	 * @generated
	 */
	public Adapter createColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Numeric
	 * @generated
	 */
	public Adapter createNumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Detail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Detail
	 * @generated
	 */
	public Adapter createDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Decimal
	 * @generated
	 */
	public Adapter createDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Int
	 * @generated
	 */
	public Adapter createIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.SmallInt <em>Small Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.SmallInt
	 * @generated
	 */
	public Adapter createSmallIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.TinyInt <em>Tiny Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.TinyInt
	 * @generated
	 */
	public Adapter createTinyIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.MediumInt <em>Medium Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.MediumInt
	 * @generated
	 */
	public Adapter createMediumIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.BigInt <em>Big Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.BigInt
	 * @generated
	 */
	public Adapter createBigIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.NotIntBitNumericType <em>Not Int Bit Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.NotIntBitNumericType
	 * @generated
	 */
	public Adapter createNotIntBitNumericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Real
	 * @generated
	 */
	public Adapter createRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Double
	 * @generated
	 */
	public Adapter createDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Bit
	 * @generated
	 */
	public Adapter createBitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.TimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.TimeStamp
	 * @generated
	 */
	public Adapter createTimeStampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Year
	 * @generated
	 */
	public Adapter createYearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Char
	 * @generated
	 */
	public Adapter createCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Varchar <em>Varchar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Varchar
	 * @generated
	 */
	public Adapter createVarcharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Binary
	 * @generated
	 */
	public Adapter createBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.VarBinary <em>Var Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.VarBinary
	 * @generated
	 */
	public Adapter createVarBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Blob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Blob
	 * @generated
	 */
	public Adapter createBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.TinyBlob <em>Tiny Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.TinyBlob
	 * @generated
	 */
	public Adapter createTinyBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.MediumBlob <em>Medium Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.MediumBlob
	 * @generated
	 */
	public Adapter createMediumBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.LongBlob <em>Long Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.LongBlob
	 * @generated
	 */
	public Adapter createLongBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.TinyText <em>Tiny Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.TinyText
	 * @generated
	 */
	public Adapter createTinyTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.MediumText <em>Medium Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.MediumText
	 * @generated
	 */
	public Adapter createMediumTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webapp.LongText <em>Long Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webapp.LongText
	 * @generated
	 */
	public Adapter createLongTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebappAdapterFactory
