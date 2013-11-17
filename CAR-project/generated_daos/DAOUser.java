package de.vogella.jsf.starter.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class User {
	private final static String RESOURCE_JDBC = "java:comp/env/jdbc/jsf";
	
	private Connection getConnection(){
		try {
			final Context lContext = new InitialContext(); 
			final DataSource lDataSource = (DataSource)lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection = lDataSource.getConnection();
			return lConnection;
		} catch (NamingException e) {
			return null; 
		}
	}
	
	public String getAll(){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			final PreparedStatement lPreparedStatementCreation =
					lConnection.prepareStatement("SELECT * FROM User");
			lPreparedStatementCreation.executeQuery();
			return null;
		} catch (NamingException e) {
			return "NamingException : " + e.getMessage(); 
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
	
	
	public String updatename(int id, String name){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			final PreparedStatement lPreparedStatementCreation =
					lConnection.prepareStatement("UPDATE User SET name = " + name + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (NamingException e) {
			return "NamingException : " + e.getMessage(); 
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	
	public String updatepassword(int id, String password){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			final PreparedStatement lPreparedStatementCreation =
					lConnection.prepareStatement("UPDATE User SET password = " + password + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (NamingException e) {
			return "NamingException : " + e.getMessage(); 
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	public String addUser(String name, String password){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			final PreparedStatement lPreparedStatementCreation =
					lConnection.prepareStatement("INSERT INTO User(name, password) VALUES(?, ?)");
			
			lPreparedStatementCreation.setLong(1, name); 
			
			lPreparedStatementCreation.setLong(2, password); 
			
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (NamingException e) {
			return "NamingException : " + e.getMessage(); 
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
}