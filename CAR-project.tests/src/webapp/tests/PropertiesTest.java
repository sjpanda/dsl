/**
 */
package webapp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webapp.Properties;
import webapp.WebappFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesTest extends TestCase {

	/**
	 * The fixture for this Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Properties fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertiesTest.class);
	}

	/**
	 * Constructs a new Properties test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Properties fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Properties getFixture() {
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
		setFixture(WebappFactory.eINSTANCE.createProperties());
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

} //PropertiesTest
