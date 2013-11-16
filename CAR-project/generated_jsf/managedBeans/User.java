package de.vogella.jsf.starter.model;

public class User {
	
	private String name;
	
	private String password;
	
	public String getname(){
		return name;
	}

	public String getpassword(){
		return password;
	}


	public void setname(String name){
		this.name = name;
	}

	public void setpassword(String password){
		this.password = password;
	}


	public String login(){
		// TODO: implement this method
		throw new UnsupportedOperationException();
	}		
	
}