package webapp.struts.actionServlet;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateStrutsServlet
{
  protected static String nl;
  public static synchronized GenerateStrutsServlet create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateStrutsServlet result = new GenerateStrutsServlet();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package org.lip6.struts.servletAction;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "" + NL + "import org.apache.struts.Globals;" + NL + "import org.apache.struts.action.Action;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionForward;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "import org.apache.struts.action.ActionMessage;" + NL + "import org.apache.struts.action.ActionMessages;" + NL + "import ";
  protected final String TEXT_2 = ".DAO";
  protected final String TEXT_3 = ";" + NL + "import ";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = ";" + NL + "" + NL + "public class ";
  protected final String TEXT_6 = "Action {" + NL + "" + NL + "\tpublic ActionForward execute(final ActionMapping pMapping," + NL + "\t\t\tActionForm pForm, final HttpServletRequest pRequest," + NL + "\t\t\tfinal HttpServletResponse pResponse) {" + NL + "\t\t\t" + NL + "\t\tfinal ";
  protected final String TEXT_7 = "ValidationForm pForm = (";
  protected final String TEXT_8 = "ValidationForm )pForm;" + NL + "\t\t";
  protected final String TEXT_9 = " " + NL + "\t\tprivate ";
  protected final String TEXT_10 = " ";
  protected final String TEXT_11 = " = lform.get";
  protected final String TEXT_12 = "();" + NL + "\t\t";
  protected final String TEXT_13 = NL + "\t\t";
  protected final String TEXT_14 = NL + "\t\tfinal DAO";
  protected final String TEXT_15 = " lDAO";
  protected final String TEXT_16 = " = new DAO";
  protected final String TEXT_17 = "();" + NL + "\t\tfinal String lError = lDAO";
  protected final String TEXT_18 = ".";
  protected final String TEXT_19 = "(";
  protected final String TEXT_20 = "); \t" + NL + "\t\t" + NL + "\t\tif(lError == null) {" + NL + "\t\t\t// if no exception is raised,  forward \"success\"" + NL + "\t\t\treturn pMapping.findForward(\"success\");" + NL + "\t\t}" + NL + "\t\telse {" + NL + "\t\t\t// If any exception, return the \"error\" forward" + NL + "\t\t\treturn pMapping.findForward(\"error\");" + NL + "\t\t}\t\t\t\t\t\t\t" + NL + "\t}" + NL + "" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
	Input input = (Input)argument;
	Validator validator = input.getValidator();
	Action action = input.getAction(); 
	BusinessObject businessObject = action.getBusinessObject();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( businessObject.getPackage() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( businessObject.getName() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( validator.getPackage() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( validator.getName() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( action.getName() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( validator.getName() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( validator.getName() );
    stringBuffer.append(TEXT_8);
     
			EList<Field> fields = businessObject.getField();
			for(Field field : fields){
		
    stringBuffer.append(TEXT_9);
    stringBuffer.append( field.getType() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_12);
    
			}
		
    stringBuffer.append(TEXT_13);
    
			StringBuffer strFields = new StringBuffer();
			int i = 0;
			for(Field field : fields){
				if(i == 0){
					strFields.append(field.getName());
				}
				else{
					strFields.append(", " + field.getName());
				}
				i++;
			}
			
		
    stringBuffer.append(TEXT_14);
    stringBuffer.append( businessObject.getName() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( businessObject.getName() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( businessObject.getName() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( businessObject.getName() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append(action.getName() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( strFields.toString() );
    stringBuffer.append(TEXT_20);
    return stringBuffer.toString();
  }
}
