package webapp.struts.actionServlet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import webapp.Action;
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

public class MainGenerateStrutsServlet {

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
		View view = webApp.getView();
		if(view == null){
			System.err.println("Null View");
		}
		EList<Page> pages = view.getPage();
		if(pages == null){
			System.err.println("Null Pages");
		}

		for(Page page : pages){
			for(Instruction instr : page.getInstruction()){
				if(instr instanceof Form){
					EList<Tag> formTags = ((Form)instr).getTag();
					for(Tag formTag : formTags){
						if(formTag instanceof Input){
							Input input = ((Input)formTag);
							if(input.getType() == InputType.BUTTON){
								Validator v = input.getValidator();
								Action a = input.getAction();
								if(v != null && a != null){
									GenerateStrutsServlet generator = GenerateStrutsServlet.create(null);
									try {
										output = new FileWriter("generated_struts/src/servletAction/"+a.getName()+"Action.java");
										writer = new BufferedWriter(output);
										writer.write(generator.generate(input));
										writer.close();
									} catch (IOException e) {
										e.printStackTrace();
									}
									System.out.println("Terminated");


								}
							}
						}
					}
				}
			}
		}

	}

}
