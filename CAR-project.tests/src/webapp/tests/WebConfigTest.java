/**
 */
package webapp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webapp.WebConfig;
import webapp.WebappFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Web Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebConfigTest extends TestCase {

	/**
	 * The fixture for this Web Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebConfig fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WebConfigTest.class);
	}

	/**
	 * Constructs a new Web Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebConfigTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Web Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WebConfig fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Web Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebConfig getFixture() {
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
		setFixture(WebappFactory.eINSTANCE.createWebConfig());
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

} //WebConfigTest
