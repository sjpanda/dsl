package webapp.jsf.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import webapp.WebApp;
import webapp.serializer.WebAppSerializer;

public class MainGenerateJsfFacesConfig {
	public static void main(String[] args){
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/aJsfWebApp.xmi"));
		if(webApp == null){
			System.out.println("Null Web App");
		}

		GenerateJsfFacesConfig generator = GenerateJsfFacesConfig.create(null);

		try {
			output = new FileWriter("generated_jsf/faces-config.xml");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(webApp));
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated");
	}
}
