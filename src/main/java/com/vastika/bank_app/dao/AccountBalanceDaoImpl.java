package com.vastika.bank_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.bank_app.model.AccountBalance;
import com.vastika.bank_app.util.DBUtil;
import com.vastika.bank_app.util.QueryUtil;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public class AccountBalanceDaoImpl implements AccountBalanceDao{

	@Override
	public double depositeAmount(AccountBalance balance) {
		
		int saved=0;

		try (Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.DEPOSIT_AMOUNT_SQL))
		{
			ps.setInt(1, balance.getAccountInfoId());
				ps.setDouble(2,balance.getDepositAmount());
				ps.setDouble(3, balance.getWithdrawAmount());
			
				ps.setDouble(4,  balance.getBalance());
				
				
				saved = ps.executeUpdate();
		}
		catch( SQLException | ClassNotFoundException e)
		{
				e.printStackTrace();
		}
	
		return saved;
		
	}

	@Override
	public double withdrawAmount(AccountBalance balance) {
		int saved=0;


		try (Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.WITHDRAW_AMOUNT_SQL))
		{
			ps.setInt(1, balance.getAccountInfoId());
				ps.setDouble(2,balance.getDepositAmount());
				ps.setDouble(3, balance.getWithdrawAmount());
			
				ps.setDouble(4,  balance.getBalance());
				
				
				saved = ps.executeUpdate();
		}
		catch( SQLException | ClassNotFoundException e)
		{
				e.printStackTrace();
		}
	
		return saved;
	
		
	}

	

	
	
}
