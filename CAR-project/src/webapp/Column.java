/**
 */
package webapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Column#getName <em>Name</em>}</li>
 *   <li>{@link webapp.Column#isIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link webapp.Column#getSize <em>Size</em>}</li>
 *   <li>{@link webapp.Column#isUseZeroFill <em>Use Zero Fill</em>}</li>
 *   <li>{@link webapp.Column#getDetail <em>Detail</em>}</li>
 *   <li>{@link webapp.Column#getType <em>Type</em>}</li>
 *   <li>{@link webapp.Column#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getColumn()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='detailC useZeroFillC sizeC'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot detailC='\n\t\t(self.type <> ColumnType::NUMERIC \n\t\t\tand self.type <> ColumnType::DECIMAL \n\t\t\tand self.type <> ColumnType::FLOAT\n\t\t\tand self.type <> ColumnType::DOUBLE\n\t\t\tand self.type <> ColumnType::REAL\n\t\t) implies self.detail->isEmpty()' useZeroFillC='\n\t\t((self.type <> ColumnType::INTEGER\n\t\t\tand self.type <> ColumnType::BIGINT \n\t\t\tand self.type <> ColumnType::SMALLINT\n\t\t\tand self.type <> ColumnType::MEDIUMINT\n\t\t\tand self.type <> ColumnType::TINYINT\n\t\t) implies self.useZeroFill=false)' sizeC='\n\t\t((self.type <> ColumnType::INTEGER\n\t\t\tand self.type <> ColumnType::BIGINT \n\t\t\tand self.type <> ColumnType::SMALLINT\n\t\t\tand self.type <> ColumnType::MEDIUMINT\n\t\t\tand self.type <> ColumnType::TINYINT\n\t\t\tand self.type <> ColumnType::CHAR\n\t\t\tand self.type <> ColumnType::VARCHAR\n\t\t\tand self.type <> ColumnType::BINARY\n\t\t\tand self.type <> ColumnType::VARBINARY\n\t\t\tand self.type <> ColumnType::BIT\n\t\t\tand self.type <> ColumnType::YEAR\n\t\t) implies (self.size->isEmpty() or self.size = 0))\n\t\tand\n\t\t(self.type = ColumnType::BIT implies (self.size >= 1 and self.size <= 64))\n\t\tand\n\t\t((self.type = ColumnType::CHAR or self.type = ColumnType::VARCHAR) implies (self.size >= 0 and self.size <= 255))\n\t\tand\n\t\t(self.type = ColumnType::YEAR implies (self.size = 2 or self.size = 4))\n\t\tand\n\t\t(self.size->notEmpty() implies self.size >= 0)'"
 * @generated
 */
public interface Column extends EObject {
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
	 * @see webapp.WebappPackage#getColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link webapp.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Not Null</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Not Null</em>' attribute.
	 * @see #setIsNotNull(boolean)
	 * @see webapp.WebappPackage#getColumn_IsNotNull()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsNotNull();

	/**
	 * Sets the value of the '{@link webapp.Column#isIsNotNull <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Not Null</em>' attribute.
	 * @see #isIsNotNull()
	 * @generated
	 */
	void setIsNotNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see webapp.WebappPackage#getColumn_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link webapp.Column#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Use Zero Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Zero Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Zero Fill</em>' attribute.
	 * @see #setUseZeroFill(boolean)
	 * @see webapp.WebappPackage#getColumn_UseZeroFill()
	 * @model required="true"
	 * @generated
	 */
	boolean isUseZeroFill();

	/**
	 * Sets the value of the '{@link webapp.Column#isUseZeroFill <em>Use Zero Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Zero Fill</em>' attribute.
	 * @see #isUseZeroFill()
	 * @generated
	 */
	void setUseZeroFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(Detail)
	 * @see webapp.WebappPackage#getColumn_Detail()
	 * @model containment="true"
	 * @generated
	 */
	Detail getDetail();

	/**
	 * Sets the value of the '{@link webapp.Column#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(Detail value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link webapp.ColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see webapp.ColumnType
	 * @see #setType(ColumnType)
	 * @see webapp.WebappPackage#getColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	ColumnType getType();

	/**
	 * Sets the value of the '{@link webapp.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see webapp.ColumnType
	 * @see #getType()
	 * @generated
	 */
	void setType(ColumnType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see webapp.WebappPackage#getColumn_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link webapp.Column#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // Column
