/**
 */
package webapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.ForeignKey#getColumn <em>Column</em>}</li>
 *   <li>{@link webapp.ForeignKey#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link webapp.ForeignKey#getOnUpdate <em>On Update</em>}</li>
 *   <li>{@link webapp.ForeignKey#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see webapp.WebappPackage#getForeignKey_Column()
	 * @model required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link webapp.ForeignKey#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' containment reference.
	 * @see #setOnDelete(OnDelete)
	 * @see webapp.WebappPackage#getForeignKey_OnDelete()
	 * @model containment="true"
	 * @generated
	 */
	OnDelete getOnDelete();

	/**
	 * Sets the value of the '{@link webapp.ForeignKey#getOnDelete <em>On Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete</em>' containment reference.
	 * @see #getOnDelete()
	 * @generated
	 */
	void setOnDelete(OnDelete value);

	/**
	 * Returns the value of the '<em><b>On Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Update</em>' containment reference.
	 * @see #setOnUpdate(OnUpdate)
	 * @see webapp.WebappPackage#getForeignKey_OnUpdate()
	 * @model containment="true"
	 * @generated
	 */
	OnUpdate getOnUpdate();

	/**
	 * Sets the value of the '{@link webapp.ForeignKey#getOnUpdate <em>On Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Update</em>' containment reference.
	 * @see #getOnUpdate()
	 * @generated
	 */
	void setOnUpdate(OnUpdate value);

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
	 * @see webapp.WebappPackage#getForeignKey_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link webapp.ForeignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ForeignKey
