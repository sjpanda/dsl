package webapp.jsf.validator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.Controller;
import webapp.Validator;
import webapp.WebApp;
import webapp.serializer.WebAppSerializer;

public class MainGenerateJsfValidator {
	public static void main(String[] args){
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/aJsfWebApp.xmi"));
		if(webApp == null){
			System.out.println("Null Web App");
		}
		Controller controller = webApp.getController();
		if(controller == null){
			System.err.println("Null Controller");
		}
		EList<Validator> validators = controller.getValidator();
		if(validators == null){
			System.err.println("Null Validator");
		}

		GenerateJsfValidator generator = GenerateJsfValidator.create(null);

		try {
			for(Validator validator : validators){
				output = new FileWriter("generated_jsf/validators/" + validator.getName() + ".java");
				writer = new BufferedWriter(output);
				writer.write(generator.generate(validator));
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated");
	}
}
