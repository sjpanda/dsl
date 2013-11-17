
package org.lip6.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class addContact {

	private static final long serialVersionUID = 1L;
	
	private int id_contact;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
		public int getid_contact(){
		return id_contact;
	}

	public String getfirstName(){
		return firstName;
	}

	public String getlastName(){
		return lastName;
	}

	public String getemail(){
		return email;
	}


		public void setid_contact(int id_contact){
		this.id_contact = id_contact;
	}

	public void setfirstName(String firstName){
		this.firstName = firstName;
	}

	public void setlastName(String lastName){
		this.lastName = lastName;
	}

	public void setemail(String email){
		this.email = email;
	}


	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		
				this.id_contact=null;
		this.firstName=null;
		this.lastName=null;
		this.email=null;

	}

	public ActionErrors validate( 
		  ActionMapping mapping, HttpServletRequest request ) {
		  ActionErrors errors = new ActionErrors();
		
				if(getid_contact() == null || getid_contact().length() < 1){
			 errors.add("id_contact",new ActionMessage("id_contact.error.required"));
		}
		if(getfirstName() == null || getfirstName().length() < 1){
			 errors.add("firstName",new ActionMessage("firstName.error.required"));
		}
		if(getlastName() == null || getlastName().length() < 1){
			 errors.add("lastName",new ActionMessage("lastName.error.required"));
		}
		if(getemail() == null || getemail().length() < 1){
			 errors.add("email",new ActionMessage("email.error.required"));
		}
		  
	  return errors;
	}	
	
}