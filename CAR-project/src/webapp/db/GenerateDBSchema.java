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
  protected final String TEXT_1 = "";

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
	boolean withFKey = false;
	StringBuffer tablesWithoutFKey = new StringBuffer();
	StringBuffer tablesWithFKey = new StringBuffer();
	StringBuffer tableTmp;
	for(Table table : tables){
		withFKey = false;
		EList<Column> columns = table.getColumn();
		if(columns == null){
			continue;
		}
		hasTableToCreate = true;
		Constraint constraint = table.getConstraint();
		if(constraint != null){
			EList<ForeignKey> foreignkeys = constraint.getForeignKey();
			if((foreignkeys != null) && (foreignkeys.size() > 0)){
				withFKey = true;
			}
		}
		tableTmp = new StringBuffer();
		tableTmp.append("create table " + table.getName() + " (\n");		
		for(int i=0; i<columns.size(); i++){
			Column column = columns.get(i);
			tableTmp.append("\t" + column.getName() + " " + column.getType());
			if(column.getSize() > 0){ 
				tableTmp.append("(" + column.getSize() +")");
				}
			if(column.getDetail() != null){ 
				tableTmp.append("(");
				if(column.getDetail().getPrecision() > 0){
					tableTmp.append(column.getDetail().getPrecision());
				}
				if(column.getDetail().getScale() > 0){
					tableTmp.append(", " + column.getDetail().getScale());
				}
				tableTmp.append(")");
			}
			if(column.isUseZeroFill() == true){ 
				tableTmp.append(" zerofill");
			}
			if(column.isUseZeroFill() == true){ 
				tableTmp.append(" not null");
			}
			if((column.getDefaultValue() != null) && (! column.getDefaultValue().equals(""))){ 
				tableTmp.append(" default " + column.getDefaultValue());
			}
			if(i < (columns.size() - 1)){
				tableTmp.append(",\n");	
			}			
		}
		
		if(constraint != null){
			PrimaryKey primarykey = constraint.getPrimaryKey();
			if(primarykey != null){
				EList<Column> pkColumns = primarykey.getColumn();
				tableTmp.append(",\n\tprimary key (");
				for(int j=0; j<pkColumns.size(); j++){
					tableTmp.append(pkColumns.get(j).getName());
					if(j < (pkColumns.size() - 1)){
						tableTmp.append(", ");
					}
				}
				tableTmp.append(")");		
			}
			EList<ForeignKey> foreignkeys = constraint.getForeignKey();
			if(foreignkeys != null){
				for(ForeignKey foreignkey : foreignkeys){
					tableTmp.append(",\n\tforeign key (" + 
											foreignkey.getInternalColumn().getName() + 
											") references " + foreignkey.getExternalTable().getName() + 
											"(" + foreignkey.getExternalColumn().getName() + ")");
					if(foreignkey.getOnDelete() != null){
						tableTmp.append(" on delete " + foreignkey.getOnDelete().getBehavior());
					}
					if(foreignkey.getOnUpdate() != null){
						tableTmp.append(" on update " + foreignkey.getOnUpdate().getBehavior());
					}
				}
			}
			EList<Unique> uniques = constraint.getUnique();
			if((uniques != null) && (uniques.size() > 0)){
				for(int p=0; p<uniques.size(); p++){
					tableTmp.append(",\n\tunique (");
					EList<Column> uColumns = uniques.get(p).getColumn();
					for(int l=0; l<uColumns.size(); l++){
						tableTmp.append(uColumns.get(l).getName());
						if(l < (uColumns.size() -1)){
							tableTmp.append(", ");
						}
					}
					tableTmp.append(")");
				}
			}
			EList<Check> checks = constraint.getCheck();
			if(checks != null){
				for(Check check : checks){
					tableTmp.append(",\n\tcheck (" + check.getExpr() + ")");
				}
			}
		}
		if(table.getCharset() == null){
			tableTmp.append("\n) charset=utf8;\n\n");
		} else{
			tableTmp.append("\n) charset=" + table.getCharset() + ";\n\n");
		}
		if(withFKey){
			tablesWithFKey.append(tableTmp.toString());
		} else {
			tablesWithoutFKey.append(tableTmp.toString());
		}
	}
	if(! hasTableToCreate){
		return "No table has columns";
	}
	
    stringBuffer.append(TEXT_1);
    stringBuffer.append(tablesWithoutFKey.toString());
    stringBuffer.append(tablesWithFKey.toString());
    return stringBuffer.toString();
  }
}
