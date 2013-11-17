
package org.lip6.struts.servletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.lip6.struts.DAOContact;
import org.lip6.struts.addContact;

public class addContactAction {

	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) {
			
		final addContactValidationForm pForm = (addContactValidationForm )pForm;
		 
		private int id_contact = lform.getid_contact();
		 
		private String firstName = lform.getfirstName();
		 
		private String lastName = lform.getlastName();
		 
		private String email = lform.getemail();
		
		
		final DAOContact lDAOContact = new DAOContact();
		final String lError = lDAOContact.addContact(id_contact, firstName, lastName, email); 	
		
		if(lError == null) {
			// if no exception is raised,  forward "success"
			return pMapping.findForward("success");
		}
		else {
			// If any exception, return the "error" forward
			return pMapping.findForward("error");
		}							
	}

	
}