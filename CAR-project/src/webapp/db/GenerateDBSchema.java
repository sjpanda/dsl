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
  protected final String TEXT_1 = "\t\tcreate table ";
  protected final String TEXT_2 = " (" + NL + "\t\t";
  protected final String TEXT_3 = NL + "\t\t\t";
  protected final String TEXT_4 = " ";
  protected final String TEXT_5 = NL + "\t\t\t";
  protected final String TEXT_6 = " " + NL + "\t\t\t\t(";
  protected final String TEXT_7 = ") " + NL + "\t\t\t";
  protected final String TEXT_8 = " " + NL + "\t\t\t\t(";
  protected final String TEXT_9 = ", ";
  protected final String TEXT_10 = ") ";
  protected final String TEXT_11 = " " + NL + "\t\t\t\tzerofill " + NL + "\t\t\t";
  protected final String TEXT_12 = " " + NL + "\t\t\t\tnot null " + NL + "\t\t\t";
  protected final String TEXT_13 = " " + NL + "\t\t\t\tdefault ";
  protected final String TEXT_14 = " " + NL + "\t\t\t";
  protected final String TEXT_15 = ",";
  protected final String TEXT_16 = ", primary key (";
  protected final String TEXT_17 = ", ";
  protected final String TEXT_18 = ")";
  protected final String TEXT_19 = NL + "\t\t\t\t\t, foreign key (";
  protected final String TEXT_20 = ") references ";
  protected final String TEXT_21 = " (";
  protected final String TEXT_22 = ")";
  protected final String TEXT_23 = ") ";
  protected final String TEXT_24 = "charset=utf8";
  protected final String TEXT_25 = "charset=";
  protected final String TEXT_26 = ";";
  protected final String TEXT_27 = NL + "\t\t" + NL + "\t\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      WebApp app = (WebApp)argument;
	if(app == null){
		return "Null Web App";
	}
	 
	Model model = app.getModel();
	if(model == null){
		return "Null Model";
	}
	
	EList<Table> tables = model.getTable();
	if((tables == null) || (tables.size() == 0)){
		return "Null table";
	}
	boolean hasTableToCreate = false;
	for(Table table : tables){
		EList<Column> columns = table.getColumn();
		if(columns == null){
			continue;
		}
		hasTableToCreate = true;
		
    stringBuffer.append(TEXT_1);
    stringBuffer.append( table.getName() );
    stringBuffer.append(TEXT_2);
    
		
		for(int i=0; i<columns.size(); i++){
			Column column = columns.get(i);
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append( column.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( column.getType() );
    stringBuffer.append(TEXT_5);
    
			if(column.getSize() > 0){ 
    stringBuffer.append(TEXT_6);
    stringBuffer.append( column.getSize() );
    stringBuffer.append(TEXT_7);
    }
			if(column.getDetail() != null){ 
    stringBuffer.append(TEXT_8);
    if(column.getDetail().getPrecision() > 0){
    stringBuffer.append( column.getDetail().getPrecision() );
    if(column.getDetail().getScale() > 0){
    stringBuffer.append(TEXT_9);
    stringBuffer.append( column.getDetail().getScale() );
    }}
    stringBuffer.append(TEXT_10);
    
			}
			if(column.isUseZeroFill() == true){ 
    stringBuffer.append(TEXT_11);
    }
			if(column.isUseZeroFill() == true){ 
    stringBuffer.append(TEXT_12);
    }
			if((column.getDefaultValue() != null) && (! column.getDefaultValue().equals(""))){ 
    stringBuffer.append(TEXT_13);
    stringBuffer.append( column.getDefaultValue() );
    stringBuffer.append(TEXT_14);
    }
			if(i < (columns.size() - 1)){
				
    stringBuffer.append(TEXT_15);
    	
			}
		}
		Constraint constraint = table.getConstraint();
		if(constraint != null){
			PrimaryKey primarykey = constraint.getPrimaryKey();
			if(primarykey != null){
				
    stringBuffer.append(TEXT_16);
    
					EList<Column> pkColumns = primarykey.getColumn();
					for(int i=0; i<pkColumns.size(); i++){
						
    stringBuffer.append( pkColumns.get(i).getName() );
    
						if(i < (pkColumns.size() - 1)){
							
    stringBuffer.append(TEXT_17);
    
						}
					}
				
    stringBuffer.append(TEXT_18);
    
			}
			EList<ForeignKey> foreignkeys = constraint.getForeignKey();
			if(foreignkeys != null){
				for(ForeignKey foreignkey : foreignkeys){
    stringBuffer.append(TEXT_19);
    stringBuffer.append( foreignkey.getInternalColumn().getName() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( foreignkey.getExternalTable().getName() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( foreignkey.getExternalColumn().getName() );
    stringBuffer.append(TEXT_22);
    
				}
			}
		}
		
    stringBuffer.append(TEXT_23);
     if(table.getCharset() == null){
    stringBuffer.append(TEXT_24);
    }else{
    stringBuffer.append(TEXT_25);
    stringBuffer.append( table.getCharset() );
    } 
    stringBuffer.append(TEXT_26);
    
		
    stringBuffer.append(TEXT_27);
    
	}
	if(! hasTableToCreate){
		return "No table has columns";
	}
	
    return stringBuffer.toString();
  }
}
