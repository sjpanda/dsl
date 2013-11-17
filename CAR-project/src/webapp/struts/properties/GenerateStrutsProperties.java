package webapp.struts.properties;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateStrutsProperties
{
  protected static String nl;
  public static synchronized GenerateStrutsProperties create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateStrutsProperties result = new GenerateStrutsProperties();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "=";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      
Properties propertie = (Properties)argument; 
for(Mapping mapping : propertie.getMapping()){

    stringBuffer.append(TEXT_1);
    stringBuffer.append( mapping.getLeft() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( mapping.getRight() );
    stringBuffer.append(TEXT_3);
    
	}

    return stringBuffer.toString();
  }
}
