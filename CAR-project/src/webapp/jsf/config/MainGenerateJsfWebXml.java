package webapp.jsf.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.BusinessObject;
import webapp.Model;
import webapp.WebApp;
import webapp.dao.GenerateDAO;
import webapp.serializer.WebAppSerializer;

public class MainGenerateJsfWebXml {
	public static void main(String[] args){
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/aJsfWebApp.xmi"));
		if(webApp == null){
			System.out.println("Null Web App");
		}

		GenerateJsfWebXml generator = GenerateJsfWebXml.create(null);

		try {
			output = new FileWriter("generated_jsf/web.xml");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(webApp.getName()));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated");
	}
}
