package webapp.struts.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.Controller;
import webapp.Form;
import webapp.Input;
import webapp.InputType;
import webapp.Instruction;
import webapp.Page;
import webapp.Tag;
import webapp.Validator;
import webapp.View;
import webapp.WebApp;
import webapp.serializer.WebAppSerializer;
import webapp.struts.actionForm.GenerateStrutsValidator;

public class MainGenerateStrutsConfig {

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
		GenerateStrutsConfig generator = GenerateStrutsConfig.create(null);

		try {
			output = new FileWriter("generated_struts/WebContent/WEB-INF/struts-config.xml");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(webApp));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated");

	}

}
