package webapp.struts.config;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateStrutsWebXml
{
  protected static String nl;
  public static synchronized GenerateStrutsWebXml create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateStrutsWebXml result = new GenerateStrutsWebXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " " + NL + "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://java.sun.com/xml/ns/javaee\" xmlns:web=\"http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" id=\"WebApp_ID\" version=\"2.5\">" + NL + "  <display-name>";
  protected final String TEXT_2 = "</display-name>" + NL + "  <welcome-file-list>" + NL + "  \t";
  protected final String TEXT_3 = NL + "    \t<welcome-file>pages/";
  protected final String TEXT_4 = ".jsp</welcome-file>";
  protected final String TEXT_5 = NL + "  </welcome-file-list>" + NL + "    <!-- Configuration de l'action servlet -->" + NL + "  <servlet>" + NL + "    <servlet-name>action</servlet-name>" + NL + "    <servlet-class>org.apache.struts.action.ActionServlet</servlet-class>" + NL + "    <init-param>" + NL + "      <param-name>config</param-name>" + NL + "      <param-value>/WEB-INF/struts-config.xml</param-value>" + NL + "    </init-param>" + NL + "    <!-- The below example tells the container that the servlet will be loaded at first." + NL + "    The <load-on-startup> sub-element indicates the order in which each servlet should be loaded. " + NL + "    Lower positive values are loaded first. If the value is negative or unspecified, " + NL + "    then the container can load the servlet at anytime during startup -->" + NL + "    <load-on-startup>1</load-on-startup>" + NL + "  </servlet>" + NL + "  <!-- Action Servlet Mapping -->" + NL + "\t<servlet-mapping>" + NL + "\t\t<servlet-name>action</servlet-name>" + NL + "\t\t<url-pattern>*.do</url-pattern>" + NL + "\t</servlet-mapping>" + NL + "</web-app>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
	WebApp webApp = (WebApp) argument;
	String mainPage = null;
	for(Page page : webApp.getView().getPage()){
		if(page.isIsMain())
			mainPage = page.getName();
	}

    stringBuffer.append(TEXT_1);
    stringBuffer.append( webApp.getName() );
    stringBuffer.append(TEXT_2);
     if(mainPage != null){
    stringBuffer.append(TEXT_3);
    stringBuffer.append(mainPage);
    stringBuffer.append(TEXT_4);
     }
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
