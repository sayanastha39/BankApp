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

	
	public static final String URL= "jdbc:mysql://localhost:3306/bank_account?serverTimezone=UTC";
	public static final String USER_NAME ="root";
	public static final String PASSWORD ="vastika1";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		
		return DriverManager.getConnection(URL,USER_NAME, PASSWORD);
	}

}
