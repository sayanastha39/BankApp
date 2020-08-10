package com.vastika.bank_app.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.vastika.bank_app.model.AccountInfo;
import com.vastika.bank_app.util.DBUtil;
import com.vastika.bank_app.util.QueryUtil;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 9, 2020 
 **/
public class AccountInfoDaoImpl implements AccountInfoDao{
	
	@Override
	public int saveUserInfo(AccountInfo info) {
		
		int saved=0;
		
		//register the driver
	// create connection object 
	//create statement object 
	//execute query 
	//close 
	
	
	
	
	try (Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(QueryUtil.INSERT_SQL))
	{
	

	
	System.out.println("Hello");
	ps.setInt(1, info.getId());
	ps.setString(2, info.getAccount_name());
	ps.setString(3, info.getAddress());
	ps.setLong(4, info.getMobile_no());
	ps.setLong(5, info.getPassport_number());
	
	
	saved = ps.executeUpdate();
}
catch( SQLException | ClassNotFoundException e)
{
	e.printStackTrace();
}

return saved;
}
	

	
	
}
