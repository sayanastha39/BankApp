package com.vastika.bank_app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static final String URL= "jdbc:mysql://bank-app.cylb9hvtwc8w.us-east-2.rds.amazonaws.com/bank_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String USER_NAME= "root";
	public static final String PASSWORD= "root1234";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		return DriverManager.getConnection(URL, USER_NAME,PASSWORD);
	}
	
}
