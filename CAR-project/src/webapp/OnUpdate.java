/**
 */
package webapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.OnUpdate#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getOnUpdate()
 * @model
 * @generated
 */
public interface OnUpdate extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link webapp.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see webapp.Behavior
	 * @see #setBehavior(Behavior)
	 * @see webapp.WebappPackage#getOnUpdate_Behavior()
	 * @model required="true"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link webapp.OnUpdate#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see webapp.Behavior
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // OnUpdate
