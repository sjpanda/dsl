/**
 */
package webapp.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage
 * @generated
 */
public class WebappSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebappPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebappSwitch() {
		if (modelPackage == null) {
			modelPackage = WebappPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebappPackage.WEB_APP: {
				WebApp webApp = (WebApp)theEObject;
				T result = caseWebApp(webApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.APP_CONFIG: {
				AppConfig appConfig = (AppConfig)theEObject;
				T result = caseAppConfig(appConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.WEB_CONFIG: {
				WebConfig webConfig = (WebConfig)theEObject;
				T result = caseWebConfig(webConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.PRIMARY_KEY: {
				PrimaryKey primaryKey = (PrimaryKey)theEObject;
				T result = casePrimaryKey(primaryKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.FOREIGN_KEY: {
				ForeignKey foreignKey = (ForeignKey)theEObject;
				T result = caseForeignKey(foreignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.UNIQUE: {
				Unique unique = (Unique)theEObject;
				T result = caseUnique(unique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.CHECK: {
				Check check = (Check)theEObject;
				T result = caseCheck(check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.ON_DELETE: {
				OnDelete onDelete = (OnDelete)theEObject;
				T result = caseOnDelete(onDelete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.ON_UPDATE: {
				OnUpdate onUpdate = (OnUpdate)theEObject;
				T result = caseOnUpdate(onUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.COLUMN_TYPE: {
				ColumnType columnType = (ColumnType)theEObject;
				T result = caseColumnType(columnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.NUMERIC: {
				Numeric numeric = (Numeric)theEObject;
				T result = caseNumeric(numeric);
				if (result == null) result = caseNotIntBitNumericType(numeric);
				if (result == null) result = caseColumnType(numeric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.DETAIL: {
				Detail detail = (Detail)theEObject;
				T result = caseDetail(detail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.DECIMAL: {
				Decimal decimal = (Decimal)theEObject;
				T result = caseDecimal(decimal);
				if (result == null) result = caseNotIntBitNumericType(decimal);
				if (result == null) result = caseColumnType(decimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.INT: {
				Int int_ = (Int)theEObject;
				T result = caseInt(int_);
				if (result == null) result = caseColumnType(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.INTEGER: {
				webapp.Integer integer = (webapp.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseInt(integer);
				if (result == null) result = caseColumnType(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.SMALL_INT: {
				SmallInt smallInt = (SmallInt)theEObject;
				T result = caseSmallInt(smallInt);
				if (result == null) result = caseInt(smallInt);
				if (result == null) result = caseColumnType(smallInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.TINY_INT: {
				TinyInt tinyInt = (TinyInt)theEObject;
				T result = caseTinyInt(tinyInt);
				if (result == null) result = caseInt(tinyInt);
				if (result == null) result = caseColumnType(tinyInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.MEDIUM_INT: {
				MediumInt mediumInt = (MediumInt)theEObject;
				T result = caseMediumInt(mediumInt);
				if (result == null) result = caseInt(mediumInt);
				if (result == null) result = caseColumnType(mediumInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.BIG_INT: {
				BigInt bigInt = (BigInt)theEObject;
				T result = caseBigInt(bigInt);
				if (result == null) result = caseInt(bigInt);
				if (result == null) result = caseColumnType(bigInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.NOT_INT_BIT_NUMERIC_TYPE: {
				NotIntBitNumericType notIntBitNumericType = (NotIntBitNumericType)theEObject;
				T result = caseNotIntBitNumericType(notIntBitNumericType);
				if (result == null) result = caseColumnType(notIntBitNumericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.FLOAT: {
				webapp.Float float_ = (webapp.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = caseNotIntBitNumericType(float_);
				if (result == null) result = caseColumnType(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.REAL: {
				Real real = (Real)theEObject;
				T result = caseReal(real);
				if (result == null) result = caseNotIntBitNumericType(real);
				if (result == null) result = caseColumnType(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.DOUBLE: {
				webapp.Double double_ = (webapp.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = caseNotIntBitNumericType(double_);
				if (result == null) result = caseColumnType(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.BIT: {
				Bit bit = (Bit)theEObject;
				T result = caseBit(bit);
				if (result == null) result = caseColumnType(bit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseColumnType(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseColumnType(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.TIME_STAMP: {
				TimeStamp timeStamp = (TimeStamp)theEObject;
				T result = caseTimeStamp(timeStamp);
				if (result == null) result = caseColumnType(timeStamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.YEAR: {
				Year year = (Year)theEObject;
				T result = caseYear(year);
				if (result == null) result = caseColumnType(year);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.CHAR: {
				Char char_ = (Char)theEObject;
				T result = caseChar(char_);
				if (result == null) result = caseColumnType(char_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.VARCHAR: {
				Varchar varchar = (Varchar)theEObject;
				T result = caseVarchar(varchar);
				if (result == null) result = caseColumnType(varchar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseColumnType(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.VAR_BINARY: {
				VarBinary varBinary = (VarBinary)theEObject;
				T result = caseVarBinary(varBinary);
				if (result == null) result = caseColumnType(varBinary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.BLOB: {
				Blob blob = (Blob)theEObject;
				T result = caseBlob(blob);
				if (result == null) result = caseColumnType(blob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.TINY_BLOB: {
				TinyBlob tinyBlob = (TinyBlob)theEObject;
				T result = caseTinyBlob(tinyBlob);
				if (result == null) result = caseColumnType(tinyBlob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.MEDIUM_BLOB: {
				MediumBlob mediumBlob = (MediumBlob)theEObject;
				T result = caseMediumBlob(mediumBlob);
				if (result == null) result = caseColumnType(mediumBlob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.LONG_BLOB: {
				LongBlob longBlob = (LongBlob)theEObject;
				T result = caseLongBlob(longBlob);
				if (result == null) result = caseColumnType(longBlob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.TINY_TEXT: {
				TinyText tinyText = (TinyText)theEObject;
				T result = caseTinyText(tinyText);
				if (result == null) result = caseColumnType(tinyText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseColumnType(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.MEDIUM_TEXT: {
				MediumText mediumText = (MediumText)theEObject;
				T result = caseMediumText(mediumText);
				if (result == null) result = caseColumnType(mediumText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebappPackage.LONG_TEXT: {
				LongText longText = (LongText)theEObject;
				T result = caseLongText(longText);
				if (result == null) result = caseColumnType(longText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebApp(WebApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppConfig(AppConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebConfig(WebConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryKey(PrimaryKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKey(ForeignKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnique(Unique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheck(Check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnDelete(OnDelete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnUpdate(OnUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType(ColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeric(Numeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetail(Detail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimal(Decimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInt(Int object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(webapp.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallInt(SmallInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tiny Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tiny Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTinyInt(TinyInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediumInt(MediumInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigInt(BigInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Int Bit Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Int Bit Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotIntBitNumericType(NotIntBitNumericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(webapp.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(webapp.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBit(Bit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStamp(TimeStamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYear(Year object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChar(Char object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Varchar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Varchar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarchar(Varchar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarBinary(VarBinary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlob(Blob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tiny Blob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tiny Blob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTinyBlob(TinyBlob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium Blob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium Blob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediumBlob(MediumBlob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Blob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Blob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongBlob(LongBlob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tiny Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tiny Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTinyText(TinyText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediumText(MediumText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongText(LongText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WebappSwitch
