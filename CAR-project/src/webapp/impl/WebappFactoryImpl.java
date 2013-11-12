/**
 */
package webapp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import webapp.AppConfig;
import webapp.Behavior;
import webapp.BigInt;
import webapp.Binary;
import webapp.Bit;
import webapp.Char;
import webapp.Charset;
import webapp.Check;
import webapp.Column;
import webapp.Controller;
import webapp.Date;
import webapp.DateTime;
import webapp.Decimal;
import webapp.Detail;
import webapp.File;
import webapp.ForeignKey;
import webapp.Image;
import webapp.Library;
import webapp.LongBlob;
import webapp.LongText;
import webapp.MediumBlob;
import webapp.MediumInt;
import webapp.MediumText;
import webapp.Model;
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
import webapp.WebappFactory;
import webapp.WebappPackage;
import webapp.Year;
import webapp.YearSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebappFactoryImpl extends EFactoryImpl implements WebappFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebappFactory init() {
		try {
			WebappFactory theWebappFactory = (WebappFactory)EPackage.Registry.INSTANCE.getEFactory(WebappPackage.eNS_URI);
			if (theWebappFactory != null) {
				return theWebappFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebappFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebappFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebappPackage.WEB_APP: return createWebApp();
			case WebappPackage.APP_CONFIG: return createAppConfig();
			case WebappPackage.VIEW: return createView();
			case WebappPackage.LIBRARY: return createLibrary();
			case WebappPackage.WEB_CONFIG: return createWebConfig();
			case WebappPackage.MODEL: return createModel();
			case WebappPackage.CONTROLLER: return createController();
			case WebappPackage.RESOURCE: return createResource();
			case WebappPackage.IMAGE: return createImage();
			case WebappPackage.FILE: return createFile();
			case WebappPackage.PROPERTIES: return createProperties();
			case WebappPackage.TABLE: return createTable();
			case WebappPackage.COLUMN: return createColumn();
			case WebappPackage.PRIMARY_KEY: return createPrimaryKey();
			case WebappPackage.FOREIGN_KEY: return createForeignKey();
			case WebappPackage.UNIQUE: return createUnique();
			case WebappPackage.CHECK: return createCheck();
			case WebappPackage.ON_DELETE: return createOnDelete();
			case WebappPackage.ON_UPDATE: return createOnUpdate();
			case WebappPackage.NUMERIC: return createNumeric();
			case WebappPackage.DETAIL: return createDetail();
			case WebappPackage.DECIMAL: return createDecimal();
			case WebappPackage.INTEGER: return createInteger();
			case WebappPackage.SMALL_INT: return createSmallInt();
			case WebappPackage.TINY_INT: return createTinyInt();
			case WebappPackage.MEDIUM_INT: return createMediumInt();
			case WebappPackage.BIG_INT: return createBigInt();
			case WebappPackage.FLOAT: return createFloat();
			case WebappPackage.REAL: return createReal();
			case WebappPackage.DOUBLE: return createDouble();
			case WebappPackage.BIT: return createBit();
			case WebappPackage.DATE: return createDate();
			case WebappPackage.DATE_TIME: return createDateTime();
			case WebappPackage.TIME_STAMP: return createTimeStamp();
			case WebappPackage.TIME: return createTime();
			case WebappPackage.YEAR: return createYear();
			case WebappPackage.CHAR: return createChar();
			case WebappPackage.VARCHAR: return createVarchar();
			case WebappPackage.BINARY: return createBinary();
			case WebappPackage.VAR_BINARY: return createVarBinary();
			case WebappPackage.TINY_BLOB: return createTinyBlob();
			case WebappPackage.MEDIUM_BLOB: return createMediumBlob();
			case WebappPackage.LONG_BLOB: return createLongBlob();
			case WebappPackage.TINY_TEXT: return createTinyText();
			case WebappPackage.TEXT: return createText();
			case WebappPackage.MEDIUM_TEXT: return createMediumText();
			case WebappPackage.LONG_TEXT: return createLongText();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WebappPackage.BEHAVIOR:
				return createBehaviorFromString(eDataType, initialValue);
			case WebappPackage.CHARSET:
				return createCharsetFromString(eDataType, initialValue);
			case WebappPackage.YEAR_SIZE:
				return createYearSizeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WebappPackage.BEHAVIOR:
				return convertBehaviorToString(eDataType, instanceValue);
			case WebappPackage.CHARSET:
				return convertCharsetToString(eDataType, instanceValue);
			case WebappPackage.YEAR_SIZE:
				return convertYearSizeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebApp createWebApp() {
		WebAppImpl webApp = new WebAppImpl();
		return webApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppConfig createAppConfig() {
		AppConfigImpl appConfig = new AppConfigImpl();
		return appConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebConfig createWebConfig() {
		WebConfigImpl webConfig = new WebConfigImpl();
		return webConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey createPrimaryKey() {
		PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey createForeignKey() {
		ForeignKeyImpl foreignKey = new ForeignKeyImpl();
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unique createUnique() {
		UniqueImpl unique = new UniqueImpl();
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Check createCheck() {
		CheckImpl check = new CheckImpl();
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDelete createOnDelete() {
		OnDeleteImpl onDelete = new OnDeleteImpl();
		return onDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnUpdate createOnUpdate() {
		OnUpdateImpl onUpdate = new OnUpdateImpl();
		return onUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Numeric createNumeric() {
		NumericImpl numeric = new NumericImpl();
		return numeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detail createDetail() {
		DetailImpl detail = new DetailImpl();
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public webapp.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallInt createSmallInt() {
		SmallIntImpl smallInt = new SmallIntImpl();
		return smallInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinyInt createTinyInt() {
		TinyIntImpl tinyInt = new TinyIntImpl();
		return tinyInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumInt createMediumInt() {
		MediumIntImpl mediumInt = new MediumIntImpl();
		return mediumInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInt createBigInt() {
		BigIntImpl bigInt = new BigIntImpl();
		return bigInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public webapp.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public webapp.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bit createBit() {
		BitImpl bit = new BitImpl();
		return bit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp createTimeStamp() {
		TimeStampImpl timeStamp = new TimeStampImpl();
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year createYear() {
		YearImpl year = new YearImpl();
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Varchar createVarchar() {
		VarcharImpl varchar = new VarcharImpl();
		return varchar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarBinary createVarBinary() {
		VarBinaryImpl varBinary = new VarBinaryImpl();
		return varBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinyBlob createTinyBlob() {
		TinyBlobImpl tinyBlob = new TinyBlobImpl();
		return tinyBlob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumBlob createMediumBlob() {
		MediumBlobImpl mediumBlob = new MediumBlobImpl();
		return mediumBlob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongBlob createLongBlob() {
		LongBlobImpl longBlob = new LongBlobImpl();
		return longBlob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinyText createTinyText() {
		TinyTextImpl tinyText = new TinyTextImpl();
		return tinyText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumText createMediumText() {
		MediumTextImpl mediumText = new MediumTextImpl();
		return mediumText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongText createLongText() {
		LongTextImpl longText = new LongTextImpl();
		return longText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehaviorFromString(EDataType eDataType, String initialValue) {
		Behavior result = Behavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Charset createCharsetFromString(EDataType eDataType, String initialValue) {
		Charset result = Charset.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharsetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearSize createYearSizeFromString(EDataType eDataType, String initialValue) {
		YearSize result = YearSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYearSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebappPackage getWebappPackage() {
		return (WebappPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebappPackage getPackage() {
		return WebappPackage.eINSTANCE;
	}

} //WebappFactoryImpl
