package webapp.db;

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
  protected final String TEXT_1 = "\tcreate table toto(id int);";
  protected final String TEXT_2 = NL + "\tcreate table titi(name varchar(255));";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      int arg = (int)argument;
	if(arg == 1) 
    stringBuffer.append(TEXT_1);
     else 
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
