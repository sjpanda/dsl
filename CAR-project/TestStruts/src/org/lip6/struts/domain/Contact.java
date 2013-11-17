package org.lip6.struts.domain;

public class Contact {
	
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


}