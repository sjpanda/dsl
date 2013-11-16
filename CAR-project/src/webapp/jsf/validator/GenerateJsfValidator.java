package webapp.jsf.validator;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateJsfValidator
{
  protected static String nl;
  public static synchronized GenerateJsfValidator create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateJsfValidator result = new GenerateJsfValidator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import javax.faces.application.FacesMessage;" + NL + "import javax.faces.component.UIComponent;" + NL + "import javax.faces.context.FacesContext;" + NL + "import javax.faces.validator.Validator;" + NL + "import javax.faces.validator.ValidatorException;" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = " implements Validator {" + NL + "\tpublic void validate(FacesContext context, UIComponent component," + NL + "      Object value) throws ValidatorException {" + NL + "\t\t// TODO: implement this method" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "    }" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Validator validator = (Validator)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( validator.getPackage() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( validator.getName() );
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
