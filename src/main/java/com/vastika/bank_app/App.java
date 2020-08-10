package com.vastika.bank_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.bank_app.Util.DBUtil;

/**
 * Hello world!
 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String SQL = "Create database fokat";
    		//register the driver
    	// create connection object 
    	//create statement object 
    	//execute query 
    	//close 
    	
    	
    	
    	
    	try (Connection con = DBUtil.getConnection();
    			Statement st = con.createStatement())
    	{
    	
    	st.executeUpdate(SQL);
    	
    	System.out.println("Database is created...");
    
    
    	}catch(SQLException | ClassNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    
    
    
}
}
