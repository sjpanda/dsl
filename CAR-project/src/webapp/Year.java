/**
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Year#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getYear()
 * @model
 * @generated
 */
public interface Year extends ColumnType {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link webapp.YearSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see webapp.YearSize
	 * @see #setSize(YearSize)
	 * @see webapp.WebappPackage#getYear_Size()
	 * @model
	 * @generated
	 */
	YearSize getSize();

	/**
	 * Sets the value of the '{@link webapp.Year#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see webapp.YearSize
	 * @see #getSize()
	 * @generated
	 */
	void setSize(YearSize value);

} // Year
