package webapp.struts.properties;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.Page;
import webapp.Properties;
import webapp.Resource;
import webapp.View;
import webapp.WebApp;
import webapp.serializer.WebAppSerializer;
import webapp.struts.pages.GenerateStrutsJspPage;

public class MainGenerateStrutsProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/aStrutsWebApp.xmi"));
		if(webApp == null){
			System.out.println("Null Web App");
		}
		Resource resource = webApp.getResource();
		if(resource == null){
			System.err.println("Null resource");
		}
		EList<Properties> properties = resource.getPropertie();
		if(properties == null){
			System.err.println("Null Properties");
		}

		GenerateStrutsProperties generator = GenerateStrutsProperties.create(null);

		try {
			for(Properties propertie : properties){
				output = new FileWriter("generated_struts/src/" + propertie.getName() + ".properties");
				writer = new BufferedWriter(output);
				writer.write(generator.generate(propertie));
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated");

	}

}
