package webapp.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.BusinessObject;
import webapp.Model;
import webapp.WebApp;
import webapp.jsf.managedBean.GenerateJsfManagedbean;
import webapp.serializer.WebAppSerializer;

public class MainGenerateDAO {

	public static void main(String[] args) {
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/aJsfWebApp.xmi"));
		if(webApp == null){
			System.out.println("Null Web App");
			return;
		}
		Model model = webApp.getModel();
		if(model == null){
			System.err.println("Null Model");
			return;
		}
		EList<BusinessObject> businessObjects = model.getBusinessObject();
		if(businessObjects == null){
			System.err.println("Null BusinessObject");
			return;
		}

		GenerateDAO generator = GenerateDAO.create(null);

		try {
			for(BusinessObject businessObject : businessObjects){
				output = new FileWriter("generated_daos/DAO" + businessObject.getName() + ".java");
				writer = new BufferedWriter(output);
				writer.write(generator.generate(businessObject));
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated");
	}

}
