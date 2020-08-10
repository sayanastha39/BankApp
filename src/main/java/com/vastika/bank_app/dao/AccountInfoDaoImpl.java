package com.vastika.bank_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.vastika.bank_app.model.AccountInfo;
import com.vastika.bank_app.util.DBUtil;
import com.vastika.bank_app.util.QueryUtil;

public class AccountInfoDaoImpl implements AccountInfoDao{

	@Override
	public int saveClientInfo(AccountInfo client) {
		
		int saved = 0;
		
		try (
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(QueryUtil.INSERT_SQL);) {
			ps.setString(1, client.getAccountName());
			ps.setString(2, client.getAddress());
			ps.setLong(3, client.getMobileno());
			ps.setInt(4, client.getId());

			saved = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return saved;
	}

	@Override
	public int updateClientInfo(AccountInfo client) {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClientInfo(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccountInfo getClientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountInfo> getAllClientInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}