package webapp.struts.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.BusinessObject;
import webapp.Model;
import webapp.WebApp;
import webapp.dao.GenerateDAO;
import webapp.db.GenerateContextXml;
import webapp.db.GenerateDBSchema;
import webapp.serializer.WebAppSerializer;
import webapp.struts.actionForm.MainGeneratorStrutsValidator;
import webapp.struts.actionServlet.MainGenerateStrutsServlet;
import webapp.struts.config.MainGenerateStrutsConfig;
import webapp.struts.config.MainGenerateStrutsWebXml;
import webapp.struts.domain.MainGenerateDAO;
import webapp.struts.domain.MainGenerateStrutsClassMetier;
import webapp.struts.pages.MainGenerateStrutsJspPage;
import webapp.struts.properties.MainGenerateStrutsProperties;

public class MainStruts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/strutsTest.xmi"));
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
		
		String dbFolder = webAppFolder + "/sql";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}
		
		dbFolder = webAppFolder + "/src";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}
		
		dbFolder = webAppFolder + "/src/org/lip6/struts/actionForm";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}
		
		dbFolder = webAppFolder + "/src/org/lip6/struts/domain";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}

		dbFolder = webAppFolder + "/src/org/lip6/struts/servletAction";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}

		dbFolder = webAppFolder + "/WebContent";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}

		dbFolder = webAppFolder + "/WebContent/META-INF";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}

		dbFolder = webAppFolder + "/WebContent/pages";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}

		dbFolder = webAppFolder + "/WebContent/WEB-INF";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}

		dbFolder = webAppFolder + "/WebContent/WEB-INF/lib";
		if(! (new File(dbFolder)).exists()){
			if(! (new File(dbFolder).mkdirs())){
				System.err.println("Cannot create the folder " + dbFolder);
				return ;
			}
		}
		
		Model model = webApp.getModel();
		if(model == null){
			System.err.println("Null Model");
		}
		
		EList<BusinessObject> businessObjects = model.getBusinessObject();
		if(businessObjects == null){
			System.err.println("Null BusinessObject");
			return;
		}
		
		
		if(! generateContextXml(model, webAppFolder)){
			System.err.println("Generation of context.xml or MANIFEST.MF is failed");
			return;
		}

		if(! generateDB(model, webAppFolder)){
			System.err.println("Generation of db is failed");
			return;
		}
		
		String str [] = new String[2];
		str[0] = new String("instances/strutsTest.xmi");
		str[1] = webAppFolder;
		
		MainGeneratorStrutsValidator.main(str);
		MainGenerateStrutsServlet.main(str);
		MainGenerateStrutsConfig.main(str);
		MainGenerateStrutsWebXml.main(str);
		MainGenerateDAO.main(str);
		MainGenerateStrutsClassMetier.main(str);
		MainGenerateStrutsJspPage.main(str);
		MainGenerateStrutsProperties.main(str);
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

}
