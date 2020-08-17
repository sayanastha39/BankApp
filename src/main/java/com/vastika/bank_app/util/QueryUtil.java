package com.vastika.bank_app.util;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public class QueryUtil {

	public static final String INSERT_SQL= "insert into account_info_tbl(id,account_name,address,mobile_no,unique_id_type) values(?,?,?,?,?)"; 
	
	public static final String UPDATE_SQL = "update account_info_tbl set account_name = ?, address = ?, mobile_no = ?, unique_id_type =? where id = ?";
	public static final String LIST_SQL = "select * from account_info_tbl";
	public static final String DELETE_SQL = "delete account_info_tbl where id = ?";
	public static final String GET_BY_ID_SQL = "select * from account_info_tbl where id = ?";
	
	
	//public static final String DEPOSIT_AMOUNT_SQL ="update account_balance_tbl set deposit_amount=? where account_info_id=?";
	public static final String DEPOSIT_AMOUNT_SQL="insert into account_balance_tbl (account_info_id, deposit_amount,withdraw_amount, balance) values (?,?,?,?)";
	public static final String WITHDRAW_AMOUNT_SQL= "insert into account_balance_tbl (account_info_id, deposit_amount,withdraw_amount,balance) values (?,?,?,?)";
	
	public static final String GET_USER_BALANCE = "select account_info_id, balance from account_balance_tbl where id=?";
}
