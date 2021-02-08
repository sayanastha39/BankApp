package com.vastika.bank_app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static final String URL= "jdbc:mysql://bank-app.cm/bank_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String USER_NAME= "";
	public static final String PASSWORD= "";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		return DriverManager.getConnection(URL, USER_NAME,PASSWORD);
	}
	
}
