package com.vastika.bank_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.vastika.bank_app.model.AccountInfo;
import com.vastika.bank_app.util.DBUtil;
import com.vastika.bank_app.util.QueryUtil;

public class AccountInfoDaoImpl implements AccountInfoDao {

	@Override
	public int saveAccountInfo(AccountInfo accountInfo) {
		int  saved = 0;
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.INSERT_SQL);
				){
				ps.setString(1, accountInfo.getAccountName());
				ps.setString(2, accountInfo.getAddress());
				ps.setLong(3, accountInfo.getMobileno());
				ps.setString(4, accountInfo.getUniqueIdType());
				saved = ps.executeUpdate();
				System.out.println("New account created!!");
			} catch (SQLException | ClassNotFoundException e) { 
				e.printStackTrace();
			}
		return saved;
	}

	@Override
	public int updateAccountInfo(AccountInfo accountInfo) {
		int  updated = 0;
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.UPDATE_SQL);
				){
				ps.setString(1, accountInfo.getAccountName());
				ps.setString(2, accountInfo.getAddress());
				ps.setLong(3, accountInfo.getMobileno());
				ps.setString(4, accountInfo.getUniqueIdType());
				ps.setInt(5, accountInfo.getId());
				updated = ps.executeUpdate();
				System.out.println("Account Data updated!!");
			} catch (SQLException | ClassNotFoundException e) { 
				e.printStackTrace();
			}
		return updated;
	}

	@Override
	public void deleteAccountInfo(int id) {
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.DELETE_SQL);
				){
				ps.setInt(1, id);
				ps.executeUpdate();
				System.out.println("Account Data deleted!!");
			} catch (SQLException | ClassNotFoundException e) { 
				e.printStackTrace();
			}
		
	}

	@Override
	public AccountInfo getAccountById(int id) {
		AccountInfo accountInfo = new AccountInfo();
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BY_ID_SQL);
				){
				ps.setInt(1, id);
				   ResultSet rs =ps.executeQuery();
				if(rs.next()) {
					accountInfo.setId(rs.getInt("id"));
					accountInfo.setAccountName(rs.getString("account_name"));
					accountInfo.setAddress(rs.getString("address"));
					accountInfo.setMobileno(rs.getLong("mobile_no"));
					accountInfo.setUniqueIdType(rs.getString("unique_id_type"));
				}
				
			} catch (SQLException | ClassNotFoundException e) { 
				e.printStackTrace();
			}
		return accountInfo;
	}

	@Override
	public List<AccountInfo> getAllAccountInfo() {
		List<AccountInfo> accountInfoList = new ArrayList<>();
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BY_ID_SQL);
				){
				   ResultSet rs =ps.executeQuery();
				while(rs.next()) {
					AccountInfo accountInfo = new AccountInfo();
					accountInfo.setId(rs.getInt("id"));
					accountInfo.setAccountName(rs.getString("account_name"));
					accountInfo.setAddress(rs.getString("address"));
					accountInfo.setMobileno(rs.getLong("mobile_no"));
					accountInfo.setUniqueIdType(rs.getString("unique_id_type"));
					accountInfoList.add(accountInfo);
				}
				
			} catch (SQLException | ClassNotFoundException e) { 
				e.printStackTrace();
			}
		return accountInfoList;
	}

}
