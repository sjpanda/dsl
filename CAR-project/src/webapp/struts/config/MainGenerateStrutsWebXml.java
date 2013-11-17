package webapp.struts.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import webapp.WebApp;
import webapp.serializer.WebAppSerializer;

public class MainGenerateStrutsWebXml {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File(args[0]));
		if(webApp == null){
			System.out.println("Null Web App");
		}

		GenerateStrutsWebXml generator = GenerateStrutsWebXml.create(null);

		try {
			output = new FileWriter("generated_struts/WebContent/WEB-INF/web.xml");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(webApp));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated");
	}

}
