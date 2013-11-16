package webapp.db;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import webapp.WebApp;
import webapp.serializer.WebAppSerializer;

public class MainGenerateDBSchema {
	public static void main(String[] args) {
		FileWriter output;
		BufferedWriter writer;

		WebAppSerializer serializer = new WebAppSerializer();
		WebApp webApp = serializer.load(new File("instances/complexDBWebApp.xmi"));
		GenerateDBSchema generator = GenerateDBSchema.create(null);
		
		try {
			output = new FileWriter("generated_sql/webapp_" + webApp.getName() + ".sql");
			writer = new BufferedWriter(output);
			writer.write(generator.generate(webApp));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}