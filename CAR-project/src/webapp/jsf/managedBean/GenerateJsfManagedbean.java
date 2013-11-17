package webapp.jsf.managedBean;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateJsfManagedbean
{
  protected static String nl;
  public static synchronized GenerateJsfManagedbean create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateJsfManagedbean result = new GenerateJsfManagedbean();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = " {" + NL + "\t";
  protected final String TEXT_4 = NL + "\tprivate ";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = " = ";
  protected final String TEXT_7 = ";" + NL + "\t\t";
  protected final String TEXT_8 = NL + "\tprivate ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = ";" + NL + "\t";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL + "\tpublic ";
  protected final String TEXT_14 = " ";
  protected final String TEXT_15 = "(){" + NL + "\t\t// TODO: implement this method" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}\t\t" + NL + "\t";
  protected final String TEXT_16 = NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     BusinessObject obj = (BusinessObject)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( obj.getPackage() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( obj.getName() );
    stringBuffer.append(TEXT_3);
    
	EList<Field> fields = obj.getField();
	StringBuffer getters = new StringBuffer();
	StringBuffer setters = new StringBuffer();
	for(Field field : fields){ 
		String defaultValue = field.getDefaultValue();
		if((defaultValue != null) && (! defaultValue.equals(""))){
    stringBuffer.append(TEXT_4);
    stringBuffer.append( field.getType() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( defaultValue );
    stringBuffer.append(TEXT_7);
    } else {
    stringBuffer.append(TEXT_8);
    stringBuffer.append( field.getType() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_10);
    
		}
	getters.append("\tpublic " + field.getType() + " get" + field.getName() + "(){\n"); 
	getters.append("\t\treturn " + field.getName() + ";\n");
	getters.append("\t}\n\n");
	setters.append("\tpublic void set" + field.getName() + "(" + field.getType() + " " + field.getName() + "){\n");
	setters.append("\t\tthis." + field.getName() + " = " + field.getName() + ";\n");
	setters.append("\t}\n\n");
	}
    stringBuffer.append(TEXT_11);
    stringBuffer.append( getters.toString() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( setters.toString() );
     EList<Action> actions = obj.getAction();
	for(Action action : actions){
    stringBuffer.append(TEXT_13);
    stringBuffer.append( action.getReturnType() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( action.getName() );
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    return stringBuffer.toString();
  }
}
