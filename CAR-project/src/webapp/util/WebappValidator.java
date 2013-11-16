/**
 */
package webapp.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import webapp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage
 * @generated
 */
public class WebappValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebappValidator INSTANCE = new WebappValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "webapp";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebappValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WebappPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WebappPackage.WEB_APP:
				return validateWebApp((WebApp)value, diagnostics, context);
			case WebappPackage.APP_CONFIG:
				return validateAppConfig((AppConfig)value, diagnostics, context);
			case WebappPackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case WebappPackage.LIBRARY:
				return validateLibrary((Library)value, diagnostics, context);
			case WebappPackage.WEB_CONFIG:
				return validateWebConfig((WebConfig)value, diagnostics, context);
			case WebappPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case WebappPackage.CONTROLLER:
				return validateController((Controller)value, diagnostics, context);
			case WebappPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case WebappPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case WebappPackage.FILE:
				return validateFile((File)value, diagnostics, context);
			case WebappPackage.PROPERTIES:
				return validateProperties((Properties)value, diagnostics, context);
			case WebappPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case WebappPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case WebappPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case WebappPackage.PRIMARY_KEY:
				return validatePrimaryKey((PrimaryKey)value, diagnostics, context);
			case WebappPackage.FOREIGN_KEY:
				return validateForeignKey((ForeignKey)value, diagnostics, context);
			case WebappPackage.UNIQUE:
				return validateUnique((Unique)value, diagnostics, context);
			case WebappPackage.CHECK:
				return validateCheck((Check)value, diagnostics, context);
			case WebappPackage.ON_DELETE:
				return validateOnDelete((OnDelete)value, diagnostics, context);
			case WebappPackage.ON_UPDATE:
				return validateOnUpdate((OnUpdate)value, diagnostics, context);
			case WebappPackage.DETAIL:
				return validateDetail((Detail)value, diagnostics, context);
			case WebappPackage.VALIDATOR:
				return validateValidator((Validator)value, diagnostics, context);
			case WebappPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case WebappPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case WebappPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case WebappPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case WebappPackage.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case WebappPackage.INPUT:
				return validateInput((Input)value, diagnostics, context);
			case WebappPackage.TABLE_HTML:
				return validateTableHTML((TableHTML)value, diagnostics, context);
			case WebappPackage.TR:
				return validateTr((Tr)value, diagnostics, context);
			case WebappPackage.TD:
				return validateTd((Td)value, diagnostics, context);
			case WebappPackage.TH:
				return validateTh((Th)value, diagnostics, context);
			case WebappPackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case WebappPackage.BUSINESS_OBJECT:
				return validateBusinessObject((BusinessObject)value, diagnostics, context);
			case WebappPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case WebappPackage.DAO_BUSINESS_OBJECT:
				return validateDAOBusinessObject((DAOBusinessObject)value, diagnostics, context);
			case WebappPackage.MESSAGES:
				return validateMessages((Messages)value, diagnostics, context);
			case WebappPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case WebappPackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case WebappPackage.CHARSET:
				return validateCharset((Charset)value, diagnostics, context);
			case WebappPackage.COLUMN_TYPE:
				return validateColumnType((ColumnType)value, diagnostics, context);
			case WebappPackage.FORM_METHOD:
				return validateFormMethod((FormMethod)value, diagnostics, context);
			case WebappPackage.INPUT_TYPE:
				return validateInputType((InputType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebApp(WebApp webApp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webApp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppConfig(AppConfig appConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appConfig, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(view, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(library, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebConfig(WebConfig webConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webConfig, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController(Controller controller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(file, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperties(Properties properties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(properties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(column, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumn_detailC(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumn_useZeroFillC(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumn_sizeC(column, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the detailC constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__DETAIL_C__EEXPRESSION = "\n" +
		"\t\t(self.type <> ColumnType::NUMERIC \n" +
		"\t\t\tand self.type <> ColumnType::DECIMAL \n" +
		"\t\t\tand self.type <> ColumnType::FLOAT\n" +
		"\t\t\tand self.type <> ColumnType::DOUBLE\n" +
		"\t\t\tand self.type <> ColumnType::REAL\n" +
		"\t\t) implies self.detail->isEmpty()";

	/**
	 * Validates the detailC constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_detailC(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebappPackage.Literals.COLUMN,
				 column,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "detailC",
				 COLUMN__DETAIL_C__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the useZeroFillC constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__USE_ZERO_FILL_C__EEXPRESSION = "\n" +
		"\t\t((self.type <> ColumnType::INTEGER\n" +
		"\t\t\tand self.type <> ColumnType::BIGINT \n" +
		"\t\t\tand self.type <> ColumnType::SMALLINT\n" +
		"\t\t\tand self.type <> ColumnType::MEDIUMINT\n" +
		"\t\t\tand self.type <> ColumnType::TINYINT\n" +
		"\t\t) implies self.useZeroFill=false)";

	/**
	 * Validates the useZeroFillC constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_useZeroFillC(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebappPackage.Literals.COLUMN,
				 column,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "useZeroFillC",
				 COLUMN__USE_ZERO_FILL_C__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the sizeC constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__SIZE_C__EEXPRESSION = "\n" +
		"\t\t((self.type <> ColumnType::INTEGER\n" +
		"\t\t\tand self.type <> ColumnType::BIGINT \n" +
		"\t\t\tand self.type <> ColumnType::SMALLINT\n" +
		"\t\t\tand self.type <> ColumnType::MEDIUMINT\n" +
		"\t\t\tand self.type <> ColumnType::TINYINT\n" +
		"\t\t\tand self.type <> ColumnType::CHAR\n" +
		"\t\t\tand self.type <> ColumnType::VARCHAR\n" +
		"\t\t\tand self.type <> ColumnType::BINARY\n" +
		"\t\t\tand self.type <> ColumnType::VARBINARY\n" +
		"\t\t\tand self.type <> ColumnType::BIT\n" +
		"\t\t\tand self.type <> ColumnType::YEAR\n" +
		"\t\t) implies (self.size->isEmpty() or self.size = 0))\n" +
		"\t\tand\n" +
		"\t\t(self.type = ColumnType::BIT implies (self.size >= 1 and self.size <= 64))\n" +
		"\t\tand\n" +
		"\t\t((self.type = ColumnType::CHAR or self.type = ColumnType::VARCHAR) implies (self.size >= 0 and self.size <= 255))\n" +
		"\t\tand\n" +
		"\t\t(self.type = ColumnType::YEAR implies (self.size = 2 or self.size = 4))\n" +
		"\t\tand\n" +
		"\t\t(self.size->notEmpty() implies self.size >= 0)";

	/**
	 * Validates the sizeC constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_sizeC(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebappPackage.Literals.COLUMN,
				 column,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sizeC",
				 COLUMN__SIZE_C__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primaryKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foreignKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnique(Unique unique, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unique, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheck(Check check, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(check, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnDelete(OnDelete onDelete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onDelete, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnUpdate(OnUpdate onUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetail(Detail detail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(detail, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(detail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(detail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(detail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(detail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(detail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(detail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(detail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(detail, diagnostics, context);
		if (result || diagnostics != null) result &= validateDetail_precisionBiggerThanScale(detail, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the precisionBiggerThanScale constraint of '<em>Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DETAIL__PRECISION_BIGGER_THAN_SCALE__EEXPRESSION = "\n" +
		"\t\tself.precision >= self.scale and self.precision >= 0 and self.scale >= 0";

	/**
	 * Validates the precisionBiggerThanScale constraint of '<em>Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetail_precisionBiggerThanScale(Detail detail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebappPackage.Literals.DETAIL,
				 detail,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "precisionBiggerThanScale",
				 DETAIL__PRECISION_BIGGER_THAN_SCALE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidator(Validator validator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(page, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(form, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput(Input input, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(input, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(input, diagnostics, context);
		if (result || diagnostics != null) result &= validateInput_typeC(input, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeC constraint of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INPUT__TYPE_C__EEXPRESSION = "\n" +
		"\t\t(self.type <> InputType::BUTTON implies self.action->isEmpty())\n" +
		"\t\tand\n" +
		"\t\t(self.type <> InputType::BUTTON implies self.buttonValue->isEmpty())\n" +
		"\t\tand \n" +
		"\t\t(self.type <> InputType::TEXT implies self.textValue->isEmpty())";

	/**
	 * Validates the typeC constraint of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput_typeC(Input input, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebappPackage.Literals.INPUT,
				 input,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "typeC",
				 INPUT__TYPE_C__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableHTML(TableHTML tableHTML, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableHTML, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTr(Tr tr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTd(Td td, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(td, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTh(Th th, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(th, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessObject(BusinessObject businessObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(businessObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(field, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAOBusinessObject(DAOBusinessObject daoBusinessObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daoBusinessObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessages(Messages messages, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messages, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharset(Charset charset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType(ColumnType columnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormMethod(FormMethod formMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType(InputType inputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WebappValidator
