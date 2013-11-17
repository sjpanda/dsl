package webapp.db;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import webapp.WebApp;
import webapp.serializer.WebAppSerializer;

public class MainGenerateContextXml {
	public static void main(String[] args){
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/aJsfWebApp.xmi"));
		if(webApp == null){
			System.out.println("Null Web App");
			return;
		}

		if(webApp.getModel() == null){
			System.out.println("Null Model");
			return;
		}
		
		GenerateContextXml generator = GenerateContextXml.create(null);

		try {
			output = new FileWriter("generated_jsf/context.xml");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(webApp.getModel()));
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated");
	}
}
