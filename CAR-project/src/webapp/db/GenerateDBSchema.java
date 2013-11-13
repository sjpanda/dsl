package webapp.db;

import webapp.*;;

public class GenerateDBSchema
{
  protected static String nl;
  public static synchronized GenerateDBSchema create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateDBSchema result = new GenerateDBSchema();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "create table toto(id int);";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      WebApp app = (WebApp)argument;
	if(app == null) {
		return "Null Web App";
	} 
	
	
	
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
