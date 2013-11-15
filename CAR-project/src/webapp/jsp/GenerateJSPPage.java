package webapp.jsp;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateJSPPage
{
  protected static String nl;
  public static synchronized GenerateJSPPage create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateJSPPage result = new GenerateJSPPage();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<\\%@ page language=\\\"java\\\" contentType=\\\"text/html; charset=US-ASCII\\\" pageEncoding=\\\"US-ASCII\\\"\" %>" + NL + "<\\%@ taglib prefix=\"html\" uri=\"http://struts.apache.org/tags-html\" %\\>" + NL + "<\\%@ taglib prefix=\"bean\" uri=\"http://struts.apache.org/tags-bean\" %\\>" + NL + "<\\%@ taglib prefix=\"logic\" uri=\"http://struts.apache.org/tags-logic\" %\\> " + NL + "<\\%@ taglib prefix=\"nested\" uri=\"http://struts.apache.org/tags-nested\" %\\>" + NL + "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      Page page = (Page)argument;
	StringBuffer content = new StringBuffer();
	
	
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
