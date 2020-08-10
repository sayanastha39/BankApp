package com.vastika.bank_app.util;

import java.sql.*;

public class QueryUtil 
{
	public static final String AI_TABLE = "create account_info_tbl(id int not null auto_increment), accountName varchar(50), address varchar(150), mobileno int, uniqueIdType varchar(15)";
	
	public static final String AC_TABLE = "create account_balance_tbl(depositAmount int, withdrawAmount int, balance int, accountInfoId)";
	
	public static final String INSERT_SQL = "insert into account_info_tbl(id, account_name, address, mobile_no, unique_id)values(?,?,?,?,?)";
	
	public static final String UPDATE_SQL = "update account_info_tbl set id = ?, account_name = ?, address = ?, mobile_no = ?, unique_id =? where id = ?";
	
	public static final String LIST_SQL = "select * from account_info_tbl";
	
	public static final String DELETE_SQL = "delete account_info_tbl where id = ?";
	
	public static final String GET_BY_ID_SQL = "select * from account_info_tbl where id = ?";
	
	public static final String AC_DEPOSIT = "update table set depositAmount=?, balance=?";

	public static final String AC_WITHDRAWAL = "update table set withdrawAmount=?, balance=?";

	
}
