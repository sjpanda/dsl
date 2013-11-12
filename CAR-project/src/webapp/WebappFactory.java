/**
 */
package webapp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage
 * @generated
 */
public interface WebappFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebappFactory eINSTANCE = webapp.impl.WebappFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web App</em>'.
	 * @generated
	 */
	WebApp createWebApp();

	/**
	 * Returns a new object of class '<em>App Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Config</em>'.
	 * @generated
	 */
	AppConfig createAppConfig();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Web Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Config</em>'.
	 * @generated
	 */
	WebConfig createWebConfig();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
	Controller createController();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	Properties createProperties();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Key</em>'.
	 * @generated
	 */
	PrimaryKey createPrimaryKey();

	/**
	 * Returns a new object of class '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Key</em>'.
	 * @generated
	 */
	ForeignKey createForeignKey();

	/**
	 * Returns a new object of class '<em>Unique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique</em>'.
	 * @generated
	 */
	Unique createUnique();

	/**
	 * Returns a new object of class '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check</em>'.
	 * @generated
	 */
	Check createCheck();

	/**
	 * Returns a new object of class '<em>On Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Delete</em>'.
	 * @generated
	 */
	OnDelete createOnDelete();

	/**
	 * Returns a new object of class '<em>On Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Update</em>'.
	 * @generated
	 */
	OnUpdate createOnUpdate();

	/**
	 * Returns a new object of class '<em>Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric</em>'.
	 * @generated
	 */
	Numeric createNumeric();

	/**
	 * Returns a new object of class '<em>Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detail</em>'.
	 * @generated
	 */
	Detail createDetail();

	/**
	 * Returns a new object of class '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal</em>'.
	 * @generated
	 */
	Decimal createDecimal();

	/**
	 * Returns a new object of class '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer</em>'.
	 * @generated
	 */
	Integer createInteger();

	/**
	 * Returns a new object of class '<em>Small Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Small Int</em>'.
	 * @generated
	 */
	SmallInt createSmallInt();

	/**
	 * Returns a new object of class '<em>Tiny Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tiny Int</em>'.
	 * @generated
	 */
	TinyInt createTinyInt();

	/**
	 * Returns a new object of class '<em>Medium Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medium Int</em>'.
	 * @generated
	 */
	MediumInt createMediumInt();

	/**
	 * Returns a new object of class '<em>Big Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Big Int</em>'.
	 * @generated
	 */
	BigInt createBigInt();

	/**
	 * Returns a new object of class '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float</em>'.
	 * @generated
	 */
	Float createFloat();

	/**
	 * Returns a new object of class '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real</em>'.
	 * @generated
	 */
	Real createReal();

	/**
	 * Returns a new object of class '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double</em>'.
	 * @generated
	 */
	Double createDouble();

	/**
	 * Returns a new object of class '<em>Bit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit</em>'.
	 * @generated
	 */
	Bit createBit();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time</em>'.
	 * @generated
	 */
	DateTime createDateTime();

	/**
	 * Returns a new object of class '<em>Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Stamp</em>'.
	 * @generated
	 */
	TimeStamp createTimeStamp();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year</em>'.
	 * @generated
	 */
	Year createYear();

	/**
	 * Returns a new object of class '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char</em>'.
	 * @generated
	 */
	Char createChar();

	/**
	 * Returns a new object of class '<em>Varchar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Varchar</em>'.
	 * @generated
	 */
	Varchar createVarchar();

	/**
	 * Returns a new object of class '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary</em>'.
	 * @generated
	 */
	Binary createBinary();

	/**
	 * Returns a new object of class '<em>Var Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Binary</em>'.
	 * @generated
	 */
	VarBinary createVarBinary();

	/**
	 * Returns a new object of class '<em>Tiny Blob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tiny Blob</em>'.
	 * @generated
	 */
	TinyBlob createTinyBlob();

	/**
	 * Returns a new object of class '<em>Medium Blob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medium Blob</em>'.
	 * @generated
	 */
	MediumBlob createMediumBlob();

	/**
	 * Returns a new object of class '<em>Long Blob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Blob</em>'.
	 * @generated
	 */
	LongBlob createLongBlob();

	/**
	 * Returns a new object of class '<em>Tiny Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tiny Text</em>'.
	 * @generated
	 */
	TinyText createTinyText();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Medium Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medium Text</em>'.
	 * @generated
	 */
	MediumText createMediumText();

	/**
	 * Returns a new object of class '<em>Long Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Text</em>'.
	 * @generated
	 */
	LongText createLongText();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebappPackage getWebappPackage();

} //WebappFactory
