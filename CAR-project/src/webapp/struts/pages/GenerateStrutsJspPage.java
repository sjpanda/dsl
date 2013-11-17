package webapp.struts.pages;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateStrutsJspPage
{
  protected static String nl;
  public static synchronized GenerateStrutsJspPage create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateStrutsJspPage result = new GenerateStrutsJspPage();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "    " + NL + "<html:html>" + NL + "<head>" + NL + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">";
  protected final String TEXT_6 = NL + "    <title><bean:message key=\"";
  protected final String TEXT_7 = "\" /></title>";
  protected final String TEXT_8 = NL + "    <title>";
  protected final String TEXT_9 = "</title>";
  protected final String TEXT_10 = NL + "</head>" + NL + "<body>";
  protected final String TEXT_11 = NL + "        ";
  protected final String TEXT_12 = NL + "    ";
  protected final String TEXT_13 = NL + "        <html:form action=\"";
  protected final String TEXT_14 = "\">";
  protected final String TEXT_15 = NL + "            ";
  protected final String TEXT_16 = NL + "            ";
  protected final String TEXT_17 = NL + "        </html:form>";
  protected final String TEXT_18 = NL + "    ";
  protected final String TEXT_19 = NL + "                ";
  protected final String TEXT_20 = NL + "                ";
  protected final String TEXT_21 = NL + "</body>" + NL + "</html:html>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      Page page = (Page)argument;
    
    stringBuffer.append(TEXT_1);
    stringBuffer.append( "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\" pageEncoding=\"ISO-8859-1\"%>" );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( "<%@ taglib prefix=\"html\" uri=\"http://struts.apache.org/tags-html\" %>" );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( "<%@ taglib prefix=\"bean\" uri=\"http://struts.apache.org/tags-bean\" %>" );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( "<%@ taglib prefix=\"nested\" uri=\"http://struts.apache.org/tags-nested\" %>" );
    stringBuffer.append(TEXT_5);
     if (page.getTitle() != null) { 
    stringBuffer.append(TEXT_6);
    stringBuffer.append( page.getTitle().getLeft() );
    stringBuffer.append(TEXT_7);
     } else { 
    stringBuffer.append(TEXT_8);
    stringBuffer.append( page.getName() );
    stringBuffer.append(TEXT_9);
     } 
    stringBuffer.append(TEXT_10);
     for(Instruction instr : page.getInstruction()){ 
     if(instr instanceof Text){ 
    stringBuffer.append(TEXT_11);
    stringBuffer.append( ((Text)instr).getContent() );
     } 
    stringBuffer.append(TEXT_12);
     if(instr instanceof Form){ 
     EList<Tag> formTags = ((Form)instr).getTag();
        StringBuffer contentInputText = new StringBuffer();
        StringBuffer contentInputButton = new StringBuffer();
        StringBuffer action = new StringBuffer();
        
        for(Tag formTag : formTags){
            if(formTag instanceof Input){
                Input input = ((Input)formTag);
                if(input.getType() == InputType.TEXT){
                    Mapping label = input.getLabel();
                    if(label != null) {
                        contentInputText.append("<label><bean:message key=\"" + label.getLeft() +"\" /></label>\n");
                    }
                    Field textValue = input.getTextValue();
                    String property = input.getProperty();
                    if(property != null){
                        contentInputText.append("<html:text type=\"text\" property=\""+ property +"\"");
                    }
                    EList<Attribute> attrs = input.getAttribute();
                    for(Attribute attr : attrs){
                        contentInputText.append(" "+attr.getName() + "=\"" + attr.getValue() + "\"");
                    }
                    contentInputText.append("/>\n");
                }
                if(input.getType() == InputType.BUTTON){
                    Mapping label = input.getButtonValue();
                    if(label != null) {
                        contentInputButton.append("<html:submit");
                        EList<Attribute> attrs = input.getAttribute();
                        for(Attribute attr : attrs){
                            contentInputButton.append(" "+attr.getName() + "=\"" + attr.getValue() + "\"");
                        }                  
                        contentInputButton.append("><bean:message key=\"" + label.getLeft() +"\" /></html:submit>\n");
                    }
                    else{
                    	contentInputButton.append("<html:submit></html:submit>");
                    }
                    action.append(input.getAction().getName());
                }
            }
        } 
    stringBuffer.append(TEXT_13);
    stringBuffer.append( action.toString() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    stringBuffer.append( contentInputText.toString() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( contentInputButton.toString() );
    stringBuffer.append(TEXT_17);
     } 
    stringBuffer.append(TEXT_18);
        
        if(instr instanceof Input){
        
            StringBuffer contentInputText = new StringBuffer();
            StringBuffer contentInputButton = new StringBuffer();
            Input input = ((Input)instr);
                if(input.getType() == InputType.TEXT){
                    Mapping label = input.getLabel();
                    if(label != null) {
                        contentInputText.append("<label><bean:message key=\"" + label.getLeft() +"\" /></label>\n");
                    }
                    Field textValue = input.getTextValue();
                    String property = input.getProperty();
                    if(property != null){
                        contentInputText.append("<html:text type=\"text\" property=\""+ property +"\"");
                    }
                    EList<Attribute> attrs = input.getAttribute();
                    for(Attribute attr : attrs){
                        contentInputText.append(" "+attr.getName() + "=\"" + attr.getValue() + "\"");
                    }
                    contentInputText.append("/>\n");
                }
                if(input.getType() == InputType.BUTTON){
                    Mapping label = input.getButtonValue();
                    if(label != null) {
                        contentInputButton.append("<html:submit");
                        EList<Attribute> attrs = input.getAttribute();
                        for(Attribute attr : attrs){
                            contentInputButton.append(" "+attr.getName() + "=\"" + attr.getValue() + "\"");
                        }                  
                        contentInputButton.append("><bean:message key=\"" + label.getLeft() +"\" /></html:submit>\n");
                    }
                }
    stringBuffer.append(TEXT_19);
    stringBuffer.append( contentInputText.toString() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( contentInputButton.toString() );
     }     
    
     } 
    stringBuffer.append(TEXT_21);
    return stringBuffer.toString();
  }
}
