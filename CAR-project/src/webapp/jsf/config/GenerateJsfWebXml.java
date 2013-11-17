package webapp.jsf.config;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateJsfWebXml
{
  protected static String nl;
  public static synchronized GenerateJsfWebXml create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateJsfWebXml result = new GenerateJsfWebXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://java.sun.com/xml/ns/javaee\" xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" id=\"WebApp_ID\" version=\"2.5\">" + NL + "  <display-name>";
  protected final String TEXT_2 = "</display-name>" + NL + "  <servlet>" + NL + "    <servlet-name>Faces Servlet</servlet-name>" + NL + "    <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>" + NL + "    <load-on-startup>1</load-on-startup>" + NL + "  </servlet>" + NL + "  <servlet-mapping>" + NL + "    <servlet-name>Faces Servlet</servlet-name>" + NL + "    <url-pattern>/faces/*</url-pattern>" + NL + "  </servlet-mapping>" + NL + "  <context-param>" + NL + "    <param-name>javax.servlet.jsp.jstl.fmt.localizationContext</param-name>" + NL + "    <param-value>resources.application</param-value>" + NL + "  </context-param>" + NL + "  <context-param>" + NL + "    <description>State saving method: 'client' or 'server' (=default). See JSF Specification 2.5.2</description>" + NL + "    <param-name>javax.faces.STATE_SAVING_METHOD</param-name>" + NL + "    <param-value>client</param-value>" + NL + "  </context-param>" + NL + "  <context-param>" + NL + "    <description>" + NL + "\tThis parameter tells MyFaces if javascript code should be allowed in" + NL + "\tthe rendered HTML output." + NL + "\tIf javascript is allowed, command_link anchors will have javascript code" + NL + "\tthat submits the corresponding form." + NL + "\tIf javascript is not allowed, the state saving info and nested parameters" + NL + "\twill be added as url parameters." + NL + "\tDefault is 'true'</description>" + NL + "    <param-name>org.apache.myfaces.ALLOW_JAVASCRIPT</param-name>" + NL + "    <param-value>true</param-value>" + NL + "  </context-param>" + NL + "  <context-param>" + NL + "    <description>" + NL + "\tIf true, rendered HTML code will be formatted, so that it is 'human-readable'" + NL + "\ti.e. additional line separators and whitespace will be written, that do not" + NL + "\tinfluence the HTML code." + NL + "\tDefault is 'true'</description>" + NL + "    <param-name>org.apache.myfaces.PRETTY_HTML</param-name>" + NL + "    <param-value>true</param-value>" + NL + "  </context-param>" + NL + "  <context-param>" + NL + "    <param-name>org.apache.myfaces.DETECT_JAVASCRIPT</param-name>" + NL + "    <param-value>false</param-value>" + NL + "  </context-param>" + NL + "  <context-param>" + NL + "    <description>" + NL + "\tIf true, a javascript function will be rendered that is able to restore the" + NL + "\tformer vertical scroll on every request. Convenient feature if you have pages" + NL + "\twith long lists and you do not want the browser page to always jump to the top" + NL + "\tif you trigger a link or button action that stays on the same page." + NL + "\tDefault is 'false'" + NL + "</description>" + NL + "    <param-name>org.apache.myfaces.AUTO_SCROLL</param-name>" + NL + "    <param-value>true</param-value>" + NL + "  </context-param>" + NL + "  <listener>" + NL + "    <listener-class>org.apache.myfaces.webapp.StartupServletContextListener</listener-class>" + NL + "  </listener>" + NL + "</web-app>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     String webAppName = (String)argument;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( webAppName );
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
