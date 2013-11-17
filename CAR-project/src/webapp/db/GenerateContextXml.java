package webapp.db;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateContextXml
{
  protected static String nl;
  public static synchronized GenerateContextXml create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateContextXml result = new GenerateContextXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<Context>" + NL + "    <!-- Specify a JDBC datasource -->" + NL + "    <Resource " + NL + "    \tauth=\"Container\" " + NL + "    \tdriverClassName=\"com.mysql.jdbc.Driver\" " + NL + "    \tmaxActive=\"100\" " + NL + "    \tmaxIdle=\"30\" " + NL + "    \tmaxWait=\"10000\" " + NL + "    \tname=\"jdbc/";
  protected final String TEXT_2 = "\" " + NL + "    \tusername=\"";
  protected final String TEXT_3 = "\"" + NL + "    \tpassword=\"";
  protected final String TEXT_4 = "\" " + NL + "    \ttype=\"javax.sql.DataSource\" " + NL + "    \turl=\"jdbc:mysql://";
  protected final String TEXT_5 = "/";
  protected final String TEXT_6 = "\"/>" + NL + "    <ResourceLink name=\"jdbc/";
  protected final String TEXT_7 = "\" global=\"jdbc/";
  protected final String TEXT_8 = "\" type=\"javax.sql.DataSource\"/>" + NL + "</Context>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Model model = (Model)argument; 
	String password = "";
	if(model.getPassword() != null)
	{
		password = model.getPassword();
	}
    stringBuffer.append(TEXT_1);
    stringBuffer.append( model.getDatabaseName() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( model.getUserName() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( password );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( model.getUrl() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( model.getDatabaseName() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( model.getDatabaseName() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( model.getDatabaseName() );
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
