package de.vogella.jsf.starter.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAOCard {
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
	
	
	
	public String findByleftside(int leftside){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			PreparedStatement lPreparedStatementCreation = null;
			if(((Object)leftside) instanceof String){
				lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Card WHERE leftside = \"" + leftside + "\"");
			} else {
				lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Card WHERE leftside = " + leftside);
			}
			if(lPreparedStatementCreation == null)
				return "Cannot create a preparedStatement";
			ResultSet resultSet = lPreparedStatementCreation.executeQuery();
			if(resultSet.next()){
				return null;
			}
			return "Not found";
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
					connect.prepareStatement("UPDATE Card SET leftside = " + leftside + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	
	public String findByrightside(int rightside){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			PreparedStatement lPreparedStatementCreation = null;
			if(((Object)rightside) instanceof String){
				lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Card WHERE rightside = \"" + rightside + "\"");
			} else {
				lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Card WHERE rightside = " + rightside);
			}
			if(lPreparedStatementCreation == null)
				return "Cannot create a preparedStatement";
			ResultSet resultSet = lPreparedStatementCreation.executeQuery();
			if(resultSet.next()){
				return null;
			}
			return "Not found";
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
					connect.prepareStatement("UPDATE Card SET rightside = " + rightside + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
	
		
	
	public String findByresult(int result){
		Connection connect = getConnection();
		try{
			if(connect == null)
				return "Failed to etablish a connection to datebase jsf";
			PreparedStatement lPreparedStatementCreation = null;
			if(((Object)result) instanceof String){
				lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Card WHERE result = \"" + result + "\"");
			} else {
				lPreparedStatementCreation =
					connect.prepareStatement("SELECT * FROM Card WHERE result = " + result);
			}
			if(lPreparedStatementCreation == null)
				return "Cannot create a preparedStatement";
			ResultSet resultSet = lPreparedStatementCreation.executeQuery();
			if(resultSet.next()){
				return null;
			}
			return "Not found";
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
					connect.prepareStatement("UPDATE Card SET result = " + result + " WHERE id = " + id);
			lPreparedStatementCreation.executeUpdate();
			return null;
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
					connect.prepareStatement("INSERT INTO Card(leftside, rightside, result) VALUES(?, ?, ?)");
			
			lPreparedStatementCreation.setObject(1, leftside); 
			
			lPreparedStatementCreation.setObject(2, rightside); 
			
			lPreparedStatementCreation.setObject(3, result); 
			
			lPreparedStatementCreation.executeUpdate();
			return null;
		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();
		} 
	}
}