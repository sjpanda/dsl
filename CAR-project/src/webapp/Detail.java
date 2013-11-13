/**
 */
package webapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Detail#getPrecision <em>Precision</em>}</li>
 *   <li>{@link webapp.Detail#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getDetail()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='precisionBiggerThanScale'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot precisionBiggerThanScale='\n\t\tself.precision >= self.scale and self.precision >= 0 and self.scale >= 0'"
 * @generated
 */
public interface Detail extends EObject {
	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see webapp.WebappPackage#getDetail_Precision()
	 * @model required="true"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link webapp.Detail#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see webapp.WebappPackage#getDetail_Scale()
	 * @model
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link webapp.Detail#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

} // Detail
