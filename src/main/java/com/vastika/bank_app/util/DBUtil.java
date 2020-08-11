package com.vastika.bank_app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public class DBUtil {

	
	
	public static final String URL= "";
	public static final String USER_NAME ="";
	public static final String PASSWORD ="";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		
		return DriverManager.getConnection(URL,USER_NAME, PASSWORD);
	}

}
