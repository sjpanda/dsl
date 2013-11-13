package webapp.db;

import java.io.File;

import webapp.WebApp;


public class MainGenerateDBSchema {
        public static void main(String[] args) {
                WebAppSerializer serializer = new WebAppSerializer();
                WebApp webApp = serializer.load(new File("instances/complexDBWebApp.xmi"));
                GenerateDBSchema generator = GenerateDBSchema.create(null);
                System.out.println(generator.generate(webApp));
        }

}