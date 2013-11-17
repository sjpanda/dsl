package org.lip6.struts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAOContact {
	private final static String RESOURCE_JDBC = "java:comp/env/jdbc/jee";
	
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
	
	
	
	public String findByid_contact(int id_contact){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jee";
			
			if(id_contact instanceof String){
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Contact WHERE id_contact = \"" + id_contact + "\"");
			} else {
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Contact WHERE id_contact = " + id_contact);
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
	
	public String updateid_contact(int id, int id_contact){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jee";
			
			final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("UPDATE Contact SET id_contact = " + id_contact + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	
	public String findByfirstName(String firstName){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jee";
			
			if(firstName instanceof String){
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Contact WHERE firstName = \"" + firstName + "\"");
			} else {
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Contact WHERE firstName = " + firstName);
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
	
	public String updatefirstName(int id, String firstName){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jee";
			
			final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("UPDATE Contact SET firstName = " + firstName + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	
	public String findBylastName(String lastName){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jee";
			
			if(lastName instanceof String){
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Contact WHERE lastName = \"" + lastName + "\"");
			} else {
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Contact WHERE lastName = " + lastName);
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
	
	public String updatelastName(int id, String lastName){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jee";
			
			final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("UPDATE Contact SET lastName = " + lastName + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	
	public String findByemail(String email){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jee";
			
			if(email instanceof String){
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Contact WHERE email = \"" + email + "\"");
			} else {
				final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Contact WHERE email = " + email);
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
	
	public String updateemail(int id, String email){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jee";
			
			final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("UPDATE Contact SET email = " + email + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	public String addContact(int id_contact, String firstName, String lastName, String email){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jee";
			
			final PreparedStatement lPreparedStatementCreation =
					connect.prepareStatement("INSERT INTO Contact(id_contact, firstName, lastName, email) VALUES(?, ?, ?, ?)");
			
			lPreparedStatementCreation.setObject(1, id_contact); 
			
			lPreparedStatementCreation.setObject(2, firstName); 
			
			lPreparedStatementCreation.setObject(3, lastName); 
			
			lPreparedStatementCreation.setObject(4, email); 
			
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
}