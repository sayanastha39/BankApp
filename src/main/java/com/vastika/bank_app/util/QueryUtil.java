package com.vastika.bank_app.util;

import java.sql.*;

public class QueryUtil 
{
	public static final String ADD_USER = "insert into user_tbl(user_name, password)values(?,?)";
	
	public static final String UPDATE_USER = "update user_tbl set user_name=?, password=? where id=?";
	
	public static final String SHOW_USER = "select * from user_table";
	
	public static final String DELETE_USER = "delete from user_tbl where id=?";
	
	public static final String GET_USER = "select * from user_tbl where id=?";

	public static final String AI_TABLE = "create table(id int not null auto_increment), accountName varchar(50), address varchar(150), mobileno int, uniqueIdType varchar(15)";
	
	public static final String AC_TABLE = "create table(depositAmount int, withdrawAmount int, balance int, accountInfoId)";
	
	public static final String AC_DEPOSIT = "update table set depositAmount=?, balance=?";

	public static final String AC_WITHDRAWAL = "update table set withdrawAmount=?, balance=?";

	
}
