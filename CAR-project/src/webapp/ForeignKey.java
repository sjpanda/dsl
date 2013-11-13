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
 *   <li>{@link webapp.ForeignKey#getExternalColumn <em>External Column</em>}</li>
 *   <li>{@link webapp.ForeignKey#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link webapp.ForeignKey#getOnUpdate <em>On Update</em>}</li>
 *   <li>{@link webapp.ForeignKey#getExternalTable <em>External Table</em>}</li>
 *   <li>{@link webapp.ForeignKey#getInternalColumn <em>Internal Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>External Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Column</em>' reference.
	 * @see #setExternalColumn(Column)
	 * @see webapp.WebappPackage#getForeignKey_ExternalColumn()
	 * @model required="true"
	 * @generated
	 */
	Column getExternalColumn();

	/**
	 * Sets the value of the '{@link webapp.ForeignKey#getExternalColumn <em>External Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Column</em>' reference.
	 * @see #getExternalColumn()
	 * @generated
	 */
	void setExternalColumn(Column value);

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
	 * Returns the value of the '<em><b>External Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Table</em>' reference.
	 * @see #setExternalTable(Table)
	 * @see webapp.WebappPackage#getForeignKey_ExternalTable()
	 * @model required="true"
	 * @generated
	 */
	Table getExternalTable();

	/**
	 * Sets the value of the '{@link webapp.ForeignKey#getExternalTable <em>External Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Table</em>' reference.
	 * @see #getExternalTable()
	 * @generated
	 */
	void setExternalTable(Table value);

	/**
	 * Returns the value of the '<em><b>Internal Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Column</em>' reference.
	 * @see #setInternalColumn(Column)
	 * @see webapp.WebappPackage#getForeignKey_InternalColumn()
	 * @model required="true"
	 * @generated
	 */
	Column getInternalColumn();

	/**
	 * Sets the value of the '{@link webapp.ForeignKey#getInternalColumn <em>Internal Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Column</em>' reference.
	 * @see #getInternalColumn()
	 * @generated
	 */
	void setInternalColumn(Column value);

} // ForeignKey
