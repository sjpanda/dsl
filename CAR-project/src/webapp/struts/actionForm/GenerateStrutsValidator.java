package webapp.struts.actionForm;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateStrutsValidator
{
  protected static String nl;
  public static synchronized GenerateStrutsValidator create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateStrutsValidator result = new GenerateStrutsValidator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import org.apache.struts.action.ActionErrors;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "import org.apache.struts.action.ActionMessage;" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = " {" + NL + "" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL + "\t";
  protected final String TEXT_4 = NL + "\tprivate ";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = " = ";
  protected final String TEXT_7 = ";" + NL + "\t\t";
  protected final String TEXT_8 = NL + "\tprivate ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = ";" + NL + "\t";
  protected final String TEXT_11 = NL + "\t";
  protected final String TEXT_12 = NL + "\t";
  protected final String TEXT_13 = NL + "\t" + NL + "\tpublic void reset(ActionMapping mapping, HttpServletRequest request) {" + NL + "\t\t";
  protected final String TEXT_14 = NL + "\t\t";
  protected final String TEXT_15 = NL + "\t}" + NL + "" + NL + "\tpublic ActionErrors validate( " + NL + "\t\t  ActionMapping mapping, HttpServletRequest request ) {" + NL + "\t\t  ActionErrors errors = new ActionErrors();" + NL + "\t\t";
  protected final String TEXT_16 = NL + "\t\t";
  protected final String TEXT_17 = "\t\t  " + NL + "\t  return errors;" + NL + "\t}\t" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
	Input input = (Input)argument;
	Validator validator = input.getValidator();
	Action action = input.getAction(); 
	BusinessObject businessObject = action.getBusinessObject();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( validator.getPackage() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( validator.getName() );
    stringBuffer.append(TEXT_3);
    
	EList<Field> fields = businessObject.getField();
	StringBuffer getters = new StringBuffer();
	StringBuffer setters = new StringBuffer();
	for(Field field : fields){ 
		String defaultValue = field.getDefaultValue();
		if((defaultValue != null) && (! defaultValue.equals(""))){
    stringBuffer.append(TEXT_4);
    stringBuffer.append( field.getType() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( defaultValue );
    stringBuffer.append(TEXT_7);
    } else {
    stringBuffer.append(TEXT_8);
    stringBuffer.append( field.getType() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_10);
    
		}
	getters.append("\tpublic " + field.getType() + " get" + field.getName() + "(){\n"); 
	getters.append("\t\treturn " + field.getName() + ";\n");
	getters.append("\t}\n\n");
	setters.append("\tpublic void set" + field.getName() + "(" + field.getType() + " " + field.getName() + "){\n");
	setters.append("\t\tthis." + field.getName() + " = " + field.getName() + ";\n");
	setters.append("\t}\n\n");
	}
    stringBuffer.append(TEXT_11);
    stringBuffer.append( getters.toString() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( setters.toString() );
    stringBuffer.append(TEXT_13);
     
			StringBuffer reset = new StringBuffer();
			for(Field field : fields){ 
				reset.append("\t\tthis."+field.getName()+"=null;\n");
			}
		
    stringBuffer.append(TEXT_14);
    stringBuffer.append( reset.toString() );
    stringBuffer.append(TEXT_15);
     
			StringBuffer valide = new StringBuffer();
			for(Field field : fields){ 
				valide.append("\t\tif(get"+field.getName()+"() == null || get"+field.getName()+"().length() < 1){\n");
				valide.append("\t\t\t errors.add(\""+field.getName()+"\",new ActionMessage(\""+field.getName()+".error.required\"));\n");
				valide.append("\t\t}\n");
			}
		
    stringBuffer.append(TEXT_16);
    stringBuffer.append( valide.toString() );
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
