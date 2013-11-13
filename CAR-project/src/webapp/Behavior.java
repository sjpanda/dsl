/**
 */
package webapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Behavior</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage#getBehavior()
 * @model
 * @generated
 */
public enum Behavior implements Enumerator {
	/**
	 * The '<em><b>CASCADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASCADE_VALUE
	 * @generated
	 * @ordered
	 */
	CASCADE(0, "CASCADE", "CASCADE"),

	/**
	 * The '<em><b>RESTRICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRICT_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICT(1, "RESTRICT", "RESTRICT");

	/**
	 * The '<em><b>CASCADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASCADE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASCADE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_VALUE = 0;

	/**
	 * The '<em><b>RESTRICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESTRICT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTRICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Behavior[] VALUES_ARRAY =
		new Behavior[] {
			CASCADE,
			RESTRICT,
		};

	/**
	 * A public read-only list of all the '<em><b>Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Behavior> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Behavior</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Behavior get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Behavior result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Behavior getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Behavior result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Behavior get(int value) {
		switch (value) {
			case CASCADE_VALUE: return CASCADE;
			case RESTRICT_VALUE: return RESTRICT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Behavior(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Behavior
