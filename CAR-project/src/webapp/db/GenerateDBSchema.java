package webapp.db;

import org.eclipse.emf.common.util.EList;
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
  protected final String TEXT_1 = NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Model model = (Model)argument;
	EList<BusinessObject> businessObjects = model.getBusinessObject();
	StringBuffer schema = new StringBuffer();
	boolean hasTablesToCreate = false;
	for(BusinessObject obj : businessObjects){
		EList<Field> fields = obj.getField();
		if((fields == null) || (fields.size() == 0)){
			continue;
		}
		hasTablesToCreate = true;
		schema.append("create table " + obj.getName() +"(\n");
		schema.append("\tid int primary key auto_increment,\n");
		for(int i= 0; i<fields.size(); i++){
			Field field = fields.get(i);
			String columnType = "varchar(255)";
			switch(field.getType().toUpperCase()){
				case "STRING" : break;
				case "BIGDECIMAL" : 
					columnType = "decimal";
					break;
				case "BOOLEAN" :
					columnType = "bit";
					break;
				case "BYTE" :
					columnType = "tinyint";
					break;
				case "SHORT" :
					columnType = "smallint";
					break;
				case "INT" :
				case "INTEGER" : 
					columnType = "int";
					break;
				case "LONG" :
					columnType = "bigint";
					break;
				case "REAL" :
					columnType = "real";
					break;
				case "DOUBLE" :
					columnType = "double";
					break;
				case "BYTE[]" :
					columnType = "VARBINARY(255)";
					break;
				case "DATE" :
					columnType = "date";
					break;
				case "TIME" :
					columnType = "time";
					break;
				case "TIMESTAMP" :
					columnType = "timestamp";
					break;
				default :
				break;
			}
			schema.append("\t" + field.getName() + " " + columnType);
			if(i < (fields.size() - 1))
				schema.append(",");
			schema.append("\n");
		}
		schema.append(");\n\n");
	}

    if(hasTablesToCreate){
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append( schema.toString() );
    }
    return stringBuffer.toString();
  }
}
