package com.vastika.bank_app.dao;

import com.vastika.bank_app.model.AccountBalance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.vastika.bank_app.util.DBUtil;
import com.vastika.bank_app.util.QueryUtil;
import java.sql.SQLException;

public class AccountMethodsImpl implements AccountMethods{

	@Override
	public int deposit(AccountBalance deposit) {
		
		int saved=0;

		try (Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.DEPOSIT_SQL))
		{
				ps.setDouble(1,deposit.getDepositAmount());
				
				ps.setInt(2, deposit.getAccountInfoId());
				
				saved = ps.executeUpdate();
		}
		catch( SQLException | ClassNotFoundException e)
		{
				e.printStackTrace();
		}
	
		return saved;
	}

	@Override
	public int withdrawal(AccountBalance withdraw) {
		int saved=0;

		try (Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.WITHDRAWAL_SQL))
		{
				ps.setDouble(1,withdraw.getWithdrawAmount());
				ps.setInt(2, withdraw.getAccountInfoId());
				
				saved = ps.executeUpdate();
		}
		catch( SQLException | ClassNotFoundException e)
		{
				e.printStackTrace();
		}
	
		return saved;
	}

}
