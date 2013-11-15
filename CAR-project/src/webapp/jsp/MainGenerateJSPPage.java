package webapp.jsp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.Page;
import webapp.View;
import webapp.WebApp;
import webapp.serializer.WebAppSerializer;

public class MainGenerateJSPPage {
	public static void main(String[] args) {
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/complexDBWebApp.xmi"));
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

		GenerateJSPPage generator = GenerateJSPPage.create(null);

		try {
			for(Page page : pages){
				output = new FileWriter("jsp/" + page.getName() + ".jsp");
				writer = new BufferedWriter(output);
				writer.write(generator.generate(page));
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}