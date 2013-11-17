package de.vogella.jsf.starter.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Card {
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
					lConnection.prepareStatement("SELECT * FROM Card");
			lPreparedStatementCreation.executeQuery();
			return null;
		} catch (NamingException e) {
			return "NamingException : " + e.getMessage(); 
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
	
	
	public String updateleftside(int id, int leftside){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			final PreparedStatement lPreparedStatementCreation =
					lConnection.prepareStatement("UPDATE Card SET leftside = " + leftside + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (NamingException e) {
			return "NamingException : " + e.getMessage(); 
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	
	public String updaterightside(int id, int rightside){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			final PreparedStatement lPreparedStatementCreation =
					lConnection.prepareStatement("UPDATE Card SET rightside = " + rightside + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (NamingException e) {
			return "NamingException : " + e.getMessage(); 
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	
	public String updateresult(int id, int result){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			final PreparedStatement lPreparedStatementCreation =
					lConnection.prepareStatement("UPDATE Card SET result = " + result + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (NamingException e) {
			return "NamingException : " + e.getMessage(); 
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	public String addCard(int leftside, int rightside, int result){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			
			final PreparedStatement lPreparedStatementCreation =
					lConnection.prepareStatement("INSERT INTO Card(leftside, rightside, result) VALUES(?, ?, ?)");
			
			lPreparedStatementCreation.setLong(1, leftside); 
			
			lPreparedStatementCreation.setLong(2, rightside); 
			
			lPreparedStatementCreation.setLong(3, result); 
			
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (NamingException e) {
			return "NamingException : " + e.getMessage(); 
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
}