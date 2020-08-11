package com.vastika.bank_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	public int depositeAmount(AccountBalance balance) {
		
		int saved=0;

		try (Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.DEPOSIT_AMOUNT_SQL))
		{
				ps.setDouble(1,balance.getDepositAmount());
				
				ps.setInt(2, balance.getAccountInfoId());
				
				saved = ps.executeUpdate();
		}
		catch( SQLException | ClassNotFoundException e)
		{
				e.printStackTrace();
		}
	
		return saved;
		
	}

	@Override
	public int withdrawAmount(AccountBalance balance) {
		int saved=0;

		try (Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.DEPOSIT_AMOUNT_SQL))
		{
				ps.setDouble(1,balance.getWithdrawAmount());
				ps.setInt(2, balance.getAccountInfoId());
				
				saved = ps.executeUpdate();
		}
		catch( SQLException | ClassNotFoundException e)
		{
				e.printStackTrace();
		}
	
		return saved;
	}

	
	
}
