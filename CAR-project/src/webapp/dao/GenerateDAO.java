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
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.sql.Connection;" + NL + "import java.sql.PreparedStatement;" + NL + "import java.sql.SQLException;" + NL + "import java.sql.ResultSet;" + NL + "" + NL + "import javax.naming.Context;" + NL + "import javax.naming.InitialContext;" + NL + "import javax.naming.NamingException;" + NL + "import javax.sql.DataSource;" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = " {" + NL + "\tprivate final static String RESOURCE_JDBC = \"java:comp/env/jdbc/";
  protected final String TEXT_4 = "\";" + NL + "\t" + NL + "\tprivate Connection getConnection(){" + NL + "\t\ttry {" + NL + "\t\t\tfinal Context lContext = new InitialContext(); " + NL + "\t\t\tfinal DataSource lDataSource = (DataSource)lContext.lookup(RESOURCE_JDBC);" + NL + "\t\t\tfinal Connection lConnection = lDataSource.getConnection();" + NL + "\t\t\treturn lConnection;" + NL + "\t\t} catch (NamingException e) {" + NL + "\t\t\treturn null; " + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\tpublic String getAll(){" + NL + "\t\tConnection connect = getConnection();" + NL + "\t\ttry{" + NL + "\t\t\tif(connect == null)" + NL + "\t\t\t\treturn \"Failed to etablish a connection to datebase ";
  protected final String TEXT_5 = "\";" + NL + "\t\t\t" + NL + "\t\t\tfinal PreparedStatement lPreparedStatementCreation =" + NL + "\t\t\t\t\tlConnection.prepareStatement(\"SELECT * FROM ";
  protected final String TEXT_6 = "\");" + NL + "\t\t\tResultSet resultSet lPreparedStatementCreation.executeQuery();" + NL + "\t\t\treturn null;" + NL + "\t\t} catch (NamingException e) {" + NL + "\t\t\treturn \"NamingException : \" + e.getMessage(); " + NL + "\t\t} catch (SQLException e) {" + NL + "\t\t\treturn \"SQLException : \" + e.getMessage();" + NL + "\t\t} " + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_7 = NL + "\t" + NL + "\tpublic String update";
  protected final String TEXT_8 = "(int id, ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = "){" + NL + "\t\tConnection connect = getConnection();" + NL + "\t\ttry{" + NL + "\t\t\tif(connect == null)" + NL + "\t\t\t\treturn \"Failed to etablish a connection to datebase ";
  protected final String TEXT_11 = "\";" + NL + "\t\t\t" + NL + "\t\t\tfinal PreparedStatement lPreparedStatementCreation =" + NL + "\t\t\t\t\tlConnection.prepareStatement(\"UPDATE ";
  protected final String TEXT_12 = " SET ";
  protected final String TEXT_13 = " = \" + ";
  protected final String TEXT_14 = " + \" WHERE id = \" + id);" + NL + "\t\t\tlPreparedStatementCreation.executeUpdate();" + NL + "\t\t\treturn null;" + NL + "\t\t} catch (NamingException e) {" + NL + "\t\t\treturn \"NamingException : \" + e.getMessage(); " + NL + "\t\t} catch (SQLException e) {" + NL + "\t\t\treturn \"SQLException : \" + e.getMessage();" + NL + "\t\t} " + NL + "\t}" + NL + "\t" + NL + "\t\t";
  protected final String TEXT_15 = NL + "\tpublic String add";
  protected final String TEXT_16 = "(";
  protected final String TEXT_17 = "){" + NL + "\t\tConnection connect = getConnection();" + NL + "\t\ttry{" + NL + "\t\t\tif(connect == null)" + NL + "\t\t\t\treturn \"Failed to etablish a connection to datebase ";
  protected final String TEXT_18 = "\";" + NL + "\t\t\t" + NL + "\t\t\tfinal PreparedStatement lPreparedStatementCreation =" + NL + "\t\t\t\t\tlConnection.prepareStatement(\"INSERT INTO ";
  protected final String TEXT_19 = "(";
  protected final String TEXT_20 = ") VALUES(";
  protected final String TEXT_21 = ")\");" + NL + "\t\t\t";
  protected final String TEXT_22 = NL + "\t\t\tlPreparedStatementCreation.setLong(";
  protected final String TEXT_23 = ", ";
  protected final String TEXT_24 = "); " + NL + "\t\t\t";
  protected final String TEXT_25 = NL + "\t\t\tlPreparedStatementCreation.executeUpdate();" + NL + "\t\t\treturn null;" + NL + "\t\t} catch (NamingException e) {" + NL + "\t\t\treturn \"NamingException : \" + e.getMessage(); " + NL + "\t\t} catch (SQLException e) {" + NL + "\t\t\treturn \"SQLException : \" + e.getMessage();" + NL + "\t\t} " + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     BusinessObject obj = (BusinessObject)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( obj.getPackage() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( obj.getName() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( obj.getModel().getDatabaseName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( obj.getModel().getDatabaseName() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( obj.getName() );
    stringBuffer.append(TEXT_6);
    
	EList<Field> fields = obj.getField();
	String methodArgs = "";
	String concatFields = "";
	String queryArgs = "";
	for(int i=0; i<fields.size(); i++){
    stringBuffer.append(TEXT_7);
    stringBuffer.append( fields.get(i).getName() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( fields.get(i).getType() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( fields.get(i).getName() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( obj.getModel().getDatabaseName() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( obj.getName() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( fields.get(i).getName() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( fields.get(i).getName() );
    stringBuffer.append(TEXT_14);
    methodArgs += fields.get(i).getType() + " " + fields.get(i).getName();
		concatFields += fields.get(i).getName();
		queryArgs += "?";
		if(i < (fields.size() - 1)){
			methodArgs += ", ";
			concatFields += ", ";
			queryArgs += ", ";
		}
	}
	
    stringBuffer.append(TEXT_15);
    stringBuffer.append( obj.getName() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( methodArgs );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( obj.getModel().getDatabaseName() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( obj.getName() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( concatFields );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( queryArgs );
    stringBuffer.append(TEXT_21);
    
			for(int j=0; j<fields.size(); j++){
			
    stringBuffer.append(TEXT_22);
    stringBuffer.append( j+1 );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( fields.get(j).getName() );
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    return stringBuffer.toString();
  }
}
