/**
 */
package webapp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webapp.WebApp;
import webapp.WebappFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Web App</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebAppTest extends TestCase {

	/**
	 * The fixture for this Web App test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApp fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WebAppTest.class);
	}

	/**
	 * Constructs a new Web App test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Web App test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WebApp fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Web App test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApp getFixture() {
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
		setFixture(WebappFactory.eINSTANCE.createWebApp());
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

} //WebAppTest
