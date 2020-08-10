package com.vastika.bank_app.util;

public class QueryUtil {
	
	public static final String INSERT_SQL = "insert into account_info_tbl(account_name, address, mobile_no, unique_id_type)values(?,?,?,?)";
	public static final String UPDATE_SQL = "update account_info_tbl set account_name = ?, address = ?, mobile_no = ?, unique_id_type =? where id = ?";
	public static final String LIST_SQL = "select * from account_info_tbl";
	public static final String DELETE_SQL = "delete account_info_tbl where id = ?";
	public static final String GET_BY_ID_SQL = "select * from account_info_tbl where id = ?";

}



