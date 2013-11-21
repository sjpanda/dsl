package webapp.all;

import java.io.File;

import webapp.WebApp;
import webapp.serializer.WebAppSerializer;
import webapp.struts.main.MainStruts;

public class MainGenerateWebApp {
	public static void main(String[] args){
		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File(args[0]));
		if(webApp == null){
			System.err.println("Null Web App");
			return;
		}
		String framework = webApp.getFramework();
		if(framework.equalsIgnoreCase("struts")){
			MainStruts.main(args);
			return;
		}
		if(framework.equalsIgnoreCase("jsf")){
			MainGenerateJsf.main(args);
			return;
		}
		
	}
}
