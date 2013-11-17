package webapp.jsp;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateJsfJspPage
{
  protected static String nl;
  public static synchronized GenerateJsfJspPage create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateJsfJspPage result = new GenerateJsfJspPage();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">" + NL + "<html>" + NL + "<head>" + NL + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">";
  protected final String TEXT_5 = NL + "<title>";
  protected final String TEXT_6 = "</title>";
  protected final String TEXT_7 = NL + "<title>";
  protected final String TEXT_8 = "</title>";
  protected final String TEXT_9 = NL + "</head>" + NL + "<body>" + NL + "<f:view>";
  protected final String TEXT_10 = NL + "  <f:loadBundle basename=\"";
  protected final String TEXT_11 = "\" var=\"";
  protected final String TEXT_12 = "\" />";
  protected final String TEXT_13 = NL + "  <h:form>" + NL + "  \t";
  protected final String TEXT_14 = NL + "    <h:panelGrid columns=\"";
  protected final String TEXT_15 = "\">";
  protected final String TEXT_16 = NL + "      ";
  protected final String TEXT_17 = NL + "    </h:panelGrid>";
  protected final String TEXT_18 = NL + "    ";
  protected final String TEXT_19 = NL + "    ";
  protected final String TEXT_20 = NL + "  </h:form>";
  protected final String TEXT_21 = NL + "    <h:panelGrid columns=\"";
  protected final String TEXT_22 = "\">";
  protected final String TEXT_23 = NL + "      ";
  protected final String TEXT_24 = NL + "    </h:panelGrid>";
  protected final String TEXT_25 = NL + "    ";
  protected final String TEXT_26 = NL + "\t";
  protected final String TEXT_27 = NL + "\t";
  protected final String TEXT_28 = "\t";
  protected final String TEXT_29 = NL + "</f:view>" + NL + "</body>" + NL + "</html>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      Page page = (Page)argument;
	
    stringBuffer.append(TEXT_1);
    stringBuffer.append( "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\" pageEncoding=\"ISO-8859-1\"%>" );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( "<%@ taglib prefix=\"f\" uri=\"http://java.sun.com/jsf/core\"%>" );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( "<%@ taglib prefix=\"h\" uri=\"http://java.sun.com/jsf/html\"%>" );
    stringBuffer.append(TEXT_4);
     if (page.getTitle() != null) { 
    stringBuffer.append(TEXT_5);
    stringBuffer.append( page.getTitle().getRight() );
    stringBuffer.append(TEXT_6);
     } else { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append( page.getName() );
    stringBuffer.append(TEXT_8);
     } 
    stringBuffer.append(TEXT_9);
      String[] propName = {};
	for(Properties p : page.getProperties()){ 
	propName = p.getName().split("\\."); 
    stringBuffer.append(TEXT_10);
    stringBuffer.append( p.getName() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( propName[propName.length - 1] );
    stringBuffer.append(TEXT_12);
     } 
     for(Instruction instr : page.getInstruction()){
	if(instr instanceof Form){ 
    stringBuffer.append(TEXT_13);
     EList<Tag> formTags = ((Form)instr).getTag();
  	   int nbInputText = 0;
  	   StringBuffer contentInputText = new StringBuffer();
  	   StringBuffer contentInputButton = new StringBuffer();
  	   StringBuffer messages = new StringBuffer();
  	   for(Tag formTag : formTags){
  	   	  if(formTag instanceof Input){
  	   	  	Input input = ((Input)formTag);
  	   	  	if(input.getType() == InputType.TEXT){
  	   	  	 	nbInputText++;
  	   	  	 	Mapping label = input.getLabel();
  	   	  	 	if(label != null) {
  	   	  	 		contentInputText.append("<h:outputLabel value=\"#{" + propName[propName.length - 1] + "." + label.getLeft() + "}\"></h:outputLabel>\n");
  	   	  	 	}
  	   	  	 	Field textValue = input.getTextValue();
  	   	  	 	if(textValue != null){
  	   	  	 		if(textValue.getName().equalsIgnoreCase("password")) {
  	   	  	 			contentInputText.append("<h:inputSecret value=\"#{" + textValue.getBusinessObject().getName() + "." + textValue.getName() + "}\">\n");
  	   	  	 		} else {
  	   	  	 			contentInputText.append("<h:inputText value=\"#{" + textValue.getBusinessObject().getName() + "." + textValue.getName() + "}\">\n");
  	   	  	 		}
  	   	  	 		Validator validator = input.getValidator();
  	   	  	 		if(validator != null){
  	   	  	 			contentInputText.append("<f:validator validatorId=\"" + validator.getPackage() + "." + validator.getName() + "\" />\n");
  	   	  	 		}
  	   	  	 		if(textValue.getName().equalsIgnoreCase("password")) {
  	   	  	 			contentInputText.append("</h:inputSecret>\n");
  	   	  	 		} else {
  	   	  	 			contentInputText.append("</h:inputText>\n");
  	   	  	 		}
  	   	  	 	}
  	   	  	 }
  	   	  	 if(input.getType() == InputType.BUTTON){
  	   	  	 	contentInputButton.append("<h:commandButton action=\"#{");
  	   	  	 	contentInputButton.append(input.getAction().getBusinessObject().getName() + "." + input.getAction().getName());
  	   	  	 	contentInputButton.append("}\" value=\"#{" + propName[propName.length - 1] + "." + input.getButtonValue().getLeft() + "}\"></h:commandButton>\n");
  	   	  	 }
  	   	  }
  	   	  if(formTag instanceof Messages){
  	   	  	messages.append("<h:messages layout=\"table\"></h:messages>\n");
  	   	  }
  	   }
  	   if(nbInputText > 0){ 
    stringBuffer.append(TEXT_14);
    stringBuffer.append( nbInputText );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(TEXT_16);
    stringBuffer.append( contentInputText.toString() );
    stringBuffer.append(TEXT_17);
     } 
    stringBuffer.append(TEXT_18);
    stringBuffer.append( contentInputButton.toString() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( messages.toString() );
    stringBuffer.append(TEXT_20);
     }
	if(instr instanceof Input) {
		int nbInputText = 0;
  	    StringBuffer contentInputText = new StringBuffer();
  	    StringBuffer contentInputButton = new StringBuffer();
		Input input = ((Input)instr);
  	   	  	if(input.getType() == InputType.TEXT){
  	   	  	 	nbInputText++;
  	   	  	 	Mapping label = input.getLabel();
  	   	  	 	if(label != null) {
  	   	  	 		contentInputText.append("<h:outputLabel value=\"#{" + propName[propName.length - 1] + "." + label.getLeft() + "}\"></h:outputLabel>\n");
  	   	  	 	}
  	   	  	 	Field textValue = input.getTextValue();
  	   	  	 	if(textValue != null){
  	   	  	 		if(textValue.getName().equalsIgnoreCase("password")) {
  	   	  	 			contentInputText.append("<h:inputSecret value=\"#{" + textValue.getBusinessObject().getName() + "." + textValue.getName() + "}\">\n");
  	   	  	 		} else {
  	   	  	 			contentInputText.append("<h:inputText value=\"#{" + textValue.getBusinessObject().getName() + "." + textValue.getName() + "}\">\n");
  	   	  	 		}
  	   	  	 		Validator validator = input.getValidator();
  	   	  	 		if(validator != null){
  	   	  	 			contentInputText.append("<f:validator validatorId=\"" + validator.getName() + "\" />\n");
  	   	  	 		}
  	   	  	 		if(textValue.getName().equalsIgnoreCase("password")) {
  	   	  	 			contentInputText.append("</h:inputSecret>\n");
  	   	  	 		} else {
  	   	  	 			contentInputText.append("</h:inputText>\n");
  	   	  	 		}
  	   	  	 	}
  	   	  	 }
  	   	  	 if(input.getType() == InputType.BUTTON){
  	   	  	 	contentInputButton.append("<h:commandButton action=\"#{");
  	   	  	 	contentInputButton.append(input.getAction().getBusinessObject().getName() + "." + input.getAction().getName());
  	   	  	 	contentInputButton.append("}\" value=\"#{" + propName[propName.length - 1] + "." + input.getButtonValue().getLeft() + "}\"></h:commandButton>\n");
  	   	  	 }
  	  if(nbInputText > 0){ 
    stringBuffer.append(TEXT_21);
    stringBuffer.append( nbInputText );
    stringBuffer.append(TEXT_22);
    stringBuffer.append(TEXT_23);
    stringBuffer.append( contentInputText.toString() );
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    stringBuffer.append( contentInputButton.toString() );
    stringBuffer.append(TEXT_26);
    }	
	if(instr instanceof Text) {  
    stringBuffer.append(TEXT_27);
    stringBuffer.append( ((Text)instr).getContent() );
    stringBuffer.append(TEXT_28);
    }}
    stringBuffer.append(TEXT_29);
    return stringBuffer.toString();
  }
}
