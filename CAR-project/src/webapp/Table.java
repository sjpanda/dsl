/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Table#getName <em>Name</em>}</li>
 *   <li>{@link webapp.Table#getColumn <em>Column</em>}</li>
 *   <li>{@link webapp.Table#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link webapp.Table#getCharset <em>Charset</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
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
	 * @see webapp.WebappPackage#getTable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link webapp.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see webapp.WebappPackage#getTable_Column()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Constraint)
	 * @see webapp.WebappPackage#getTable_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getConstraint();

	/**
	 * Sets the value of the '{@link webapp.Table#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * The literals are from the enumeration {@link webapp.Charset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see webapp.Charset
	 * @see #setCharset(Charset)
	 * @see webapp.WebappPackage#getTable_Charset()
	 * @model
	 * @generated
	 */
	Charset getCharset();

	/**
	 * Sets the value of the '{@link webapp.Table#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see webapp.Charset
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(Charset value);

} // Table
