package webapp.jsp;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateJsfJspPage
{
  protected static String nl;
  public static synchronized GenerateJsfJspPage create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateJsfJspPage result = new GenerateJsfJspPage();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">" + NL + "<html>" + NL + "<head>" + NL + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" + NL + "<title>";
  protected final String TEXT_5 = "</title>" + NL + "</head>" + NL + "<body>" + NL + "<f:view>" + NL + "" + NL + "  <f:loadBundle basename=\"de.vogella.jsf.starter.messages\" var=\"msg\" />" + NL + "  <h:form>" + NL + "    <h:panelGrid columns=\"2\">" + NL + "      <h:outputLabel value=\"#{msg.user}\"></h:outputLabel>" + NL + "      <h:inputText value=\"#{user.name}\">" + NL + "      <f:validator" + NL + "          validatorId=\"de.vogella.jsf.starter.validator.LoginValidator\" />" + NL + "      </h:inputText>" + NL + "      <h:outputLabel value=\"#{msg.password}\"></h:outputLabel>" + NL + "      <h:inputSecret value=\"#{user.password}\">" + NL + "      </h:inputSecret>" + NL + "    </h:panelGrid>" + NL + "    <h:commandButton action=\"#{user.login}\" value=\"#{msg.login}\"></h:commandButton>" + NL + "    <h:messages layout=\"table\"></h:messages>" + NL + "  </h:form>" + NL + "  " + NL + "</f:view>" + NL + "</body>" + NL + "</html>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      Page page = (Page)argument;
	StringBuffer content = new StringBuffer();
	
    stringBuffer.append(TEXT_1);
    stringBuffer.append( "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\" pageEncoding=\"ISO-8859-1\"%>" );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( "<%@ taglib prefix=\"f\" uri=\"http://java.sun.com/jsf/core\"%>" );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( "<%@ taglib prefix=\"h\" uri=\"http://java.sun.com/jsf/html\"%>" );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( page.getTitle() );
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
