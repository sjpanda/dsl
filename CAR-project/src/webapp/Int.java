/**
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Int#getSize <em>Size</em>}</li>
 *   <li>{@link webapp.Int#isUseZeroFill <em>Use Zero Fill</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getInt()
 * @model abstract="true"
 * @generated
 */
public interface Int extends ColumnType {
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
	 * @see webapp.WebappPackage#getInt_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link webapp.Int#getSize <em>Size</em>}' attribute.
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
	 * @see webapp.WebappPackage#getInt_UseZeroFill()
	 * @model required="true"
	 * @generated
	 */
	boolean isUseZeroFill();

	/**
	 * Sets the value of the '{@link webapp.Int#isUseZeroFill <em>Use Zero Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Zero Fill</em>' attribute.
	 * @see #isUseZeroFill()
	 * @generated
	 */
	void setUseZeroFill(boolean value);

} // Int
