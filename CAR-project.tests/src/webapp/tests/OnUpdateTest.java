/**
 */
package webapp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webapp.OnUpdate;
import webapp.WebappFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>On Update</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OnUpdateTest extends TestCase {

	/**
	 * The fixture for this On Update test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnUpdate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OnUpdateTest.class);
	}

	/**
	 * Constructs a new On Update test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnUpdateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this On Update test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OnUpdate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this On Update test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnUpdate getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebappFactory.eINSTANCE.createOnUpdate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OnUpdateTest
