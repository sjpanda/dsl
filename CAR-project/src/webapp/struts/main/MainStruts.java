package webapp.struts.main;

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
		String str [] = new String[1];
		str[0] = new String("instances/strutsTest.xmi");
		MainGeneratorStrutsValidator.main(str);
		MainGenerateStrutsServlet.main(str);
		MainGenerateStrutsConfig.main(str);
		MainGenerateStrutsWebXml.main(str);
		MainGenerateDAO.main(str);
		MainGenerateStrutsClassMetier.main(str);
		MainGenerateStrutsJspPage.main(str);
		MainGenerateStrutsProperties.main(str);
	}

}
