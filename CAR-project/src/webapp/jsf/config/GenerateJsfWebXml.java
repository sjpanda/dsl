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
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
