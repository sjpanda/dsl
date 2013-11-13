/**
 */
package webapp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webapp.Detail;
import webapp.WebappFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Detail</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DetailTest extends TestCase {

	/**
	 * The fixture for this Detail test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Detail fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DetailTest.class);
	}

	/**
	 * Constructs a new Detail test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Detail test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Detail fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Detail test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Detail getFixture() {
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
		setFixture(WebappFactory.eINSTANCE.createDetail());
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

} //DetailTest
