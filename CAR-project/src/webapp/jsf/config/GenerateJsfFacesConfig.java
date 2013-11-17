package webapp.jsf.config;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateJsfFacesConfig
{
  protected static String nl;
  public static synchronized GenerateJsfFacesConfig create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateJsfFacesConfig result = new GenerateJsfFacesConfig();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "" + NL + "<faces-config" + NL + "    xmlns=\"http://java.sun.com/xml/ns/javaee\"" + NL + "    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + NL + "    xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-facesconfig_1_2.xsd\"" + NL + "    version=\"1.2\">";
  protected final String TEXT_2 = NL + "\t<managed-bean>" + NL + "\t\t<managed-bean-name>";
  protected final String TEXT_3 = "</managed-bean-name>" + NL + "\t\t<managed-bean-class>";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = "</managed-bean-class>" + NL + "\t\t<managed-bean-scope>session</managed-bean-scope>" + NL + "\t</managed-bean>" + NL + "\t";
  protected final String TEXT_6 = NL + "\t<navigation-rule>" + NL + "\t\t<display-name>";
  protected final String TEXT_7 = "</display-name>" + NL + "\t\t<from-view-id>/";
  protected final String TEXT_8 = ".jsp</from-view-id>" + NL + "\t\t<navigation-case>" + NL + "\t\t\t<from-outcome>";
  protected final String TEXT_9 = "</from-outcome>" + NL + "\t\t\t<to-view-id>/";
  protected final String TEXT_10 = ".jsp</to-view-id>" + NL + "\t\t</navigation-case>" + NL + "\t</navigation-rule>" + NL + "\t";
  protected final String TEXT_11 = NL + "\t<validator>" + NL + "\t\t<display-name>";
  protected final String TEXT_12 = ".";
  protected final String TEXT_13 = "</display-name>" + NL + "\t\t<validator-id>";
  protected final String TEXT_14 = ".";
  protected final String TEXT_15 = "</validator-id>" + NL + "\t\t<validator-class>";
  protected final String TEXT_16 = ".";
  protected final String TEXT_17 = "</validator-class>" + NL + "\t</validator>";
  protected final String TEXT_18 = NL + "</faces-config>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      WebApp app = (WebApp)argument;
	
    stringBuffer.append(TEXT_1);
    
Model model = app.getModel();
if(model.getBusinessObject() != null){
	for(BusinessObject obj : model.getBusinessObject()){ 
    stringBuffer.append(TEXT_2);
    stringBuffer.append( obj.getName() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( obj.getPackage() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( obj.getName() );
    stringBuffer.append(TEXT_5);
    }
}
View view = app.getView();
if(view.getNavigation() != null) {
	for(Navigation navig : view.getNavigation()){
    stringBuffer.append(TEXT_6);
    stringBuffer.append( navig.getFrom().getName() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( navig.getFrom().getName() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( navig.getMessage() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( navig.getTo().getName() );
    stringBuffer.append(TEXT_10);
    }
}
Controller controller = app.getController();
for(Validator validator : controller.getValidator()){ 
    stringBuffer.append(TEXT_11);
    stringBuffer.append( validator.getPackage() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( validator.getName() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( validator.getPackage() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( validator.getName() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( validator.getPackage() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( validator.getName() );
    stringBuffer.append(TEXT_17);
    }

    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}
