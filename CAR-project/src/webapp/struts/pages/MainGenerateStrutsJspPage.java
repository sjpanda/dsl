package webapp.struts.pages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.Page;
import webapp.View;
import webapp.WebApp;
import webapp.serializer.WebAppSerializer;

public class MainGenerateStrutsJspPage {
	public static void main(String[] args) {
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/aStrutsWebApp.xmi"));
		if(webApp == null){
			System.out.println("Null Web App");
		}
		View view = webApp.getView();
		if(view == null){
			System.err.println("Null View");
		}
		EList<Page> pages = view.getPage();
		if(pages == null){
			System.err.println("Null Pages");
		}

		GenerateStrutsJspPage generator = GenerateStrutsJspPage.create(null);

		try {
			for(Page page : pages){
				output = new FileWriter("generated_struts/WebContent/pages/" + page.getName() + ".jsp");
				writer = new BufferedWriter(output);
				writer.write(generator.generate(page));
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated");
	}

}