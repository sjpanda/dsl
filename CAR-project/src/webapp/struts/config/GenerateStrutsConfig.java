package webapp.struts.config;

import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class GenerateStrutsConfig
{
  protected static String nl;
  public static synchronized GenerateStrutsConfig create(String lineSeparator)
  {
    nl = lineSeparator;
    GenerateStrutsConfig result = new GenerateStrutsConfig();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>" + NL + "" + NL + "<!DOCTYPE struts-config PUBLIC" + NL + "          \"-//Apache Software Foundation//DTD Struts Configuration 1.1//EN\"" + NL + "          \"http://jakarta.apache.org/struts/dtds/struts-config_1_3.dtd\">" + NL + "" + NL + "<struts-config>" + NL + "\t";
  protected final String TEXT_2 = NL + "\t<form-beans>" + NL + "\t\t";
  protected final String TEXT_3 = NL + "\t</form-beans>" + NL + "\t<action-mappings>" + NL + "\t\t";
  protected final String TEXT_4 = NL + "\t</action-mappings>" + NL + "" + NL + "<!-- ========== Ressources de definitions de messages =========================== -->" + NL + "\t";
  protected final String TEXT_5 = NL + "\t";
  protected final String TEXT_6 = NL + NL + "</struts-config>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
WebApp webApp = (WebApp) argument;  
View view = webApp.getView();
if(view == null){
	return "";
}
EList<Page> pages = view.getPage();
if(pages == null){
	return "";
}

StringBuffer validators = new StringBuffer();
StringBuffer actions = new StringBuffer();

    stringBuffer.append(TEXT_1);
     
		for(Page page : pages){
			boolean haveForm = false;
			for(Instruction instr : page.getInstruction()){
				if(instr instanceof Form){
					EList<Tag> formTags = ((Form)instr).getTag();
					for(Tag formTag : formTags){
						if(formTag instanceof Input){
							Input input = ((Input)formTag);
							if(input.getType() == InputType.BUTTON){
								haveForm = true;
								Validator v = input.getValidator();
								Action a = input.getAction();
								if(v != null){
									validators.append("<form-bean name=\""+v.getName()+"\" type=\""+v.getPackage()+"."+v.getName()+"\"/>\n");
								}
								if(v != null && a != null){
									actions.append("<action path=\"/"+page.getName()+"\" "+
															"type=\"struts.servletAction."+a.getName()+"Action\""+
															" name=\""+v.getName()+"ValidationForm\" scope=\"request\"" +
															
															" input=\"/pages/"+v.getPage().getName()+".jsp\">\n"+
														"\t\t\t<forward name=\"success\" path=\"/pages/success.jsp\" />\n"+
														"\t\t\t<forward name=\"error\" path=\"/pages/error.jsp\" />\n"+
													"\t\t</action>\n");
								}	
							}
						}
					}
				}
			}
			if(!haveForm){
				actions.append("\t\t<action path=\"/"+page.getName()+"\" forward=\"/pages/"+page.getName().toLowerCase() +".jsp\" />");
			}
		}
	
    stringBuffer.append(TEXT_2);
    stringBuffer.append( validators.toString() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( actions.toString() );
    stringBuffer.append(TEXT_4);
    
		StringBuffer message = new StringBuffer();
		Resource resource = webApp.getResource();
		if(resource != null){
			EList<Properties> properties = resource.getPropertie();
			for(Properties propertie : properties){
				message.append("<message-resources parameter=\""+propertie.getName()+"\" />");
			}
		}
	
    stringBuffer.append(TEXT_5);
    stringBuffer.append( message.toString() );
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
