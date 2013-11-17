package webapp.all;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.BusinessObject;
import webapp.Controller;
import webapp.Model;
import webapp.Page;
import webapp.Validator;
import webapp.View;
import webapp.WebApp;
import webapp.dao.GenerateDAO;
import webapp.db.GenerateContextXml;
import webapp.db.GenerateDBSchema;
import webapp.jsf.config.GenerateJsfFacesConfig;
import webapp.jsf.config.GenerateJsfWebXml;
import webapp.jsf.managedBean.GenerateJsfManagedbean;
import webapp.jsf.validator.GenerateJsfValidator;
import webapp.jsp.GenerateJsfJspPage;
import webapp.serializer.WebAppSerializer;

public class MainGenerateAll {
	public static void main(String[] args) {
		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/aJsfWebApp.xmi"));
		if(webApp == null){
			System.err.println("Null Web App");
			return;
		}

		String webAppFolder = webApp.getName().replaceAll("\\s+", "_");
		if(! (new File(webAppFolder)).exists()){
			if(! (new File(webAppFolder)).mkdirs()){
				System.err.println("Cannot create the folder " + webAppFolder);
				return;
			}
		}
		
		if(! generateWebXml(webApp.getName(), webAppFolder)){
			System.err.println("Generation of web.xml is failed");
			return;
		}

		if(! generateFacesConfigXml(webApp, webAppFolder)){
			System.err.println("Generation of faces-config.xml is failed");
			return;
		}
		
		Model model = webApp.getModel();
		if(model == null){
			System.err.println("Null Model");
		}
		
		if(! generateContextXml(model, webAppFolder)){
			System.err.println("Generation of context.xml or MANIFEST.MF is failed");
			return;
		}

		EList<BusinessObject> businessObjects = model.getBusinessObject();
		if(businessObjects == null){
			System.err.println("Null BusinessObject");
			return;
		}

		if(! generateDAO(businessObjects, webAppFolder)){
			System.err.println("Generation of dao is failed");
			return;
		}

		if(! generateDB(model, webAppFolder)){
			System.err.println("Generation of db is failed");
			return;
		}
		
		if(! generateManagedBean(businessObjects, webAppFolder)){
			System.err.println("Generation of managed beans is failed");
			return;
		}
		
		Controller controller = webApp.getController();
		if(controller == null){
			System.err.println("Null Controller");
			return;
		}
		
		EList<Validator> validators = controller.getValidator();
		if(validators == null){
			System.err.println("Null Validator");
			return;
		}
		
		if(! generateValidator(validators, webAppFolder)){
			System.err.println("Generation of validators is failed");
			return;
		}
		
		View view = webApp.getView();
		if(view == null){
			System.err.println("Null View");
			return;
		}
		
		EList<Page> pages = view.getPage();
		if(pages == null){
			System.err.println("Null Pages");
			return;
		}
		
		if(! generatePage(pages, webAppFolder)){
			System.err.println("Generation of pages is failed");
			return;
		}
		
		if(! (new File(webAppFolder + "/WebContent/WEB-INF/lib")).exists()){
			if(! (new File(webAppFolder + "/WebContent/WEB-INF/lib")).mkdirs()){
				System.err.println("Cannot create the folder " + webAppFolder + "/WebContent/WEB-INF/lib");
				return;
			}
		}
		
		System.out.println("\n=> Your JSF Web App \"" + webApp.getName() + "\" is now generated and stored in the folder " + webAppFolder);
	} 

	private static boolean generateDAO(EList<BusinessObject> businessObjects, String webAppFolder){
		FileWriter output;
		BufferedWriter writer;

		GenerateDAO generator = GenerateDAO.create(null);

		try {
			for(BusinessObject businessObject : businessObjects){
				String daoFolder = webAppFolder + "/src/" + businessObject.getPackage().replaceAll("\\.", "/");
				if(! (new File(daoFolder)).exists()){
					if(! (new File(daoFolder).mkdirs())){
						System.err.println("Cannot create the folder " + daoFolder);
						return false;
					}
				}
				output = new FileWriter(daoFolder + "/DAO" + businessObject.getName() + ".java");
				writer = new BufferedWriter(output);
				writer.write(generator.generate(businessObject));
				writer.close();
			}
			System.out.println("Generation of dao is terminated");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	private static boolean generateDB(Model model, String webAppFolder){
		FileWriter output;
		BufferedWriter writer;

		GenerateDBSchema generator = GenerateDBSchema.create(null);

		try {
			String dbFolder = webAppFolder + "/sql";
			if(! (new File(dbFolder)).exists()){
				if(! (new File(dbFolder).mkdirs())){
					System.err.println("Cannot create the folder " + dbFolder);
					return false;
				}
			}
			output = new FileWriter(dbFolder + "/" + webAppFolder + ".sql");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(model));
			writer.close();
			System.out.println("Generation of db is terminated");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private static boolean generateContextXml(Model model, String webAppFolder){
		FileWriter output;
		BufferedWriter writer;

		GenerateContextXml generator = GenerateContextXml.create(null);

		try {
			String contextFolder = webAppFolder + "/WebContent/META-INF";
			if(! (new File(contextFolder)).exists()){
				if(! (new File(contextFolder).mkdirs())){
					System.err.println("Cannot create the folder " + contextFolder);
					return false;
				}
			}
			output = new FileWriter(contextFolder + "/context.xml");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(model));
			writer.close();
			System.out.println("Generation of context.xml is terminated");
			output = new FileWriter(contextFolder + "/MANIFEST.MF");
			writer = new BufferedWriter(output);
			writer.write("Manifest-Version: 1.0\nClass-Path: ");
			writer.close();
			System.out.println("Generation of MANIFEST.MF is terminated");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private static boolean generateWebXml(String webAppName, String webAppFolder){
		FileWriter output;
		BufferedWriter writer;

		GenerateJsfWebXml generator = GenerateJsfWebXml.create(null);

		try {
			String webXmlFolder = webAppFolder + "/WebContent/WEB-INF/";
			if(! (new File(webXmlFolder)).exists()){
				if(! (new File(webXmlFolder).mkdirs())){
					System.err.println("Cannot create the folder " + webXmlFolder);
					return false;
				}
			}
			output = new FileWriter(webXmlFolder + "/web.xml");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(webAppName));
			writer.close();
			System.out.println("Generation of web.xml is terminated");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private static boolean generateFacesConfigXml(WebApp webApp, String webAppFolder){
		FileWriter output;
		BufferedWriter writer;

		GenerateJsfFacesConfig generator = GenerateJsfFacesConfig.create(null);

		try {
			String facesConfigXmlFolder = webAppFolder + "/WebContent/WEB-INF/";
			if(! (new File(facesConfigXmlFolder)).exists()){
				if(! (new File(facesConfigXmlFolder).mkdirs())){
					System.err.println("Cannot create the folder " + facesConfigXmlFolder);
					return false;
				}
			}
			output = new FileWriter(facesConfigXmlFolder + "/faces-config.xml");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(webApp));
			writer.close();
			System.out.println("Generation of faces-config.xml is terminated");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private static boolean generateManagedBean(EList<BusinessObject> businessObjects, String webAppFolder){
		FileWriter output;
		BufferedWriter writer;

		GenerateJsfManagedbean generator = GenerateJsfManagedbean.create(null);

		try {
			for(BusinessObject businessObject : businessObjects){
				String managedBeanFolder = webAppFolder + "/src/" + businessObject.getPackage().replaceAll("\\.", "/");
				if(! (new File(managedBeanFolder)).exists()){
					if(! (new File(managedBeanFolder).mkdirs())){
						System.err.println("Cannot create the folder " + managedBeanFolder);
						return false;
					}
				}
				output = new FileWriter(managedBeanFolder + "/" + businessObject.getName() + ".java");
				writer = new BufferedWriter(output);
				writer.write(generator.generate(businessObject));
				writer.close();
			}
			System.out.println("Generation of managed beans is terminated");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private static boolean generateValidator(EList<Validator> validators, String webAppFolder){
		FileWriter output;
		BufferedWriter writer;

		GenerateJsfValidator generator = GenerateJsfValidator.create(null);
		
		try {
			
			for(Validator validator : validators){
				String validatorFolder = webAppFolder + "/src/" + validator.getPackage().replaceAll("\\.", "/");
				if(! (new File(validatorFolder)).exists()){
					if(! (new File(validatorFolder).mkdirs())){
						System.err.println("Cannot create the folder " + validatorFolder);
						return false;
					}
				}
				output = new FileWriter(validatorFolder + "/" + validator.getName() + ".java");
				writer = new BufferedWriter(output);
				writer.write(generator.generate(validator));
				writer.close();
			}
			System.out.println("Generation of validators is terminated");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private static boolean generatePage(EList<Page> pages, String webAppFolder){
		FileWriter output;
		BufferedWriter writer;

		GenerateJsfJspPage generator = GenerateJsfJspPage.create(null);
		
		try {
			for(Page page : pages){
				String pageFolder = webAppFolder + "/WebContent";
				if(! (new File(pageFolder)).exists()){
					if(! (new File(pageFolder).mkdirs())){
						System.err.println("Cannot create the folder " + pageFolder);
						return false;
					}
				}
				if(! (new File(pageFolder + "/index.jsp")).exists()){
					output = new FileWriter(pageFolder + "/index.jsp");
					writer = new BufferedWriter(output);
					writer.write("Welcome");
					writer.close();
				}
				output = new FileWriter(pageFolder + "/" + page.getName() + ".jsp");
				writer = new BufferedWriter(output);
				writer.write(generator.generate(page));
				writer.close();
			}
			System.out.println("Generation of pages is terminated");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
