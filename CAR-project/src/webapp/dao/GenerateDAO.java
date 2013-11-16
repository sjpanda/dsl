package webapp.dao;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateDAO
{
  protected static String nl;
  public static synchronized GenerateDAO create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateDAO result = new GenerateDAO();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    return stringBuffer.toString();
  }
}
