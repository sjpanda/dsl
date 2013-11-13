/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Constraint#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link webapp.Constraint#getUnique <em>Unique</em>}</li>
 *   <li>{@link webapp.Constraint#getCheck <em>Check</em>}</li>
 *   <li>{@link webapp.Constraint#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see webapp.WebappPackage#getConstraint_PrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link webapp.Constraint#getPrimaryKey <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' containment reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Unique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' containment reference list.
	 * @see webapp.WebappPackage#getConstraint_Unique()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unique> getUnique();

	/**
	 * Returns the value of the '<em><b>Check</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Check}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' containment reference list.
	 * @see webapp.WebappPackage#getConstraint_Check()
	 * @model containment="true"
	 * @generated
	 */
	EList<Check> getCheck();

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference list.
	 * @see webapp.WebappPackage#getConstraint_ForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getForeignKey();

} // Constraint
