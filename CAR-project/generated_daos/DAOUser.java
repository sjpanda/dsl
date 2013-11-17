package de.vogella.jsf.starter.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAOUser {
	private final static String RESOURCE_JDBC = "java:comp/env/jdbc/jsf";
	
	private Connection getConnection(){
		try {
			final Context lContext = new InitialContext(); 
			final DataSource lDataSource = (DataSource)lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection = lDataSource.getConnection();
			return lConnection;
		} catch (NamingException e) {
			return null; 
		} catch (SQLException e) {
			return null;
		} 
	}
	
	
	
	public String findByname(String name){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			if(name instanceof String){
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM User WHERE name = \"" + name + "\"");
			} else {
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM User WHERE name = " + name);
			}
			ResultSet resultSet = lPreparedStatementCreation.executeQuery();
			if(resultSet.next()){
				return null;
			}
			return "Not found";
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
					connect.prepareStatement("UPDATE User SET name = " + name + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	
	public String findBypassword(String password){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			if(password instanceof String){
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM User WHERE password = \"" + password + "\"");
			} else {
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM User WHERE password = " + password);
			}
			ResultSet resultSet = lPreparedStatementCreation.executeQuery();
			if(resultSet.next()){
				return null;
			}
			return "Not found";
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
					connect.prepareStatement("UPDATE User SET password = " + password + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
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
					connect.prepareStatement("INSERT INTO User(name, password) VALUES(?, ?)");
			
			lPreparedStatementCreation.setObject(1, name); 
			
			lPreparedStatementCreation.setObject(2, password); 
			
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
}