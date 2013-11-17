
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
import org.lip6.struts.domain.DAOContact;
import org.lip6.struts.actionForm.AddContactValidationForm;

public class AddContactAction {

	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) {
			
		final AddContactValidationForm lForm = (AddContactValidationForm )pForm;
		 
		int id_contact = lForm.getid_contact();
		 
		String firstName = lForm.getfirstName();
		 
		String lastName = lForm.getlastName();
		 
		String email = lForm.getemail();
		
		
		final DAOContact lDAOContact = new DAOContact();
		final String lError = lDAOContact.AddContact(id_contact, firstName, lastName, email); 	
		
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