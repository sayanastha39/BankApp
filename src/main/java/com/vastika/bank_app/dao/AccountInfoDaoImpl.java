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

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 9, 2020 
 **/
public class AccountInfoDaoImpl implements AccountInfoDao{
	
	@Override
	public int saveUserInfo(AccountInfo info)
	{
		
		int saved=0;

		try (Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.INSERT_SQL);
			
			)
		{
				ps.setInt(1, info.getId());
				ps.setString(2, info.getAccountName());
				ps.setString(3, info.getAddress());
				ps.setLong(4, info.getMobileNo());
				ps.setString(5, info.getUniqueIdType());
				
				
				saved = ps.executeUpdate();
		}
		catch( SQLException | ClassNotFoundException e)
		{
				e.printStackTrace();
		}
	
		
		return saved;
	}

	@Override
	public int updateAccountInfo(AccountInfo accountInfo)
	{
		int  updated = 0;
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.UPDATE_SQL);
				){
				ps.setString(1, accountInfo.getAccountName());
				ps.setString(2, accountInfo.getAddress());
				ps.setLong(3, accountInfo.getMobileNo());
				ps.setString(4, accountInfo.getUniqueIdType());
				ps.setInt(5, accountInfo.getId());
				updated = ps.executeUpdate();
				
				
			} catch (SQLException | ClassNotFoundException e) { 
				e.printStackTrace();
			}
		return updated;
	
	}

	@Override
	public void deleteAccountInfo(int id) {
		// TODO Auto-generated method stub
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

//	@Override
//	public AccountInfo getAccountById(int id) {
//		AccountInfo accountInfo = new AccountInfo();
//		try (
//				Connection con = DBUtil.getConnection();
//				PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BY_ID_SQL);
//				){
//				ps.setInt(1, id);
//				   ResultSet rs =ps.executeQuery();
//				if(rs.next()) {
//					accountInfo.setId(rs.getInt("id"));
//					accountInfo.setAccountName(rs.getString("account_name"));
//					accountInfo.setAddress(rs.getString("address"));
//					accountInfo.setMobileNo(rs.getLong("mobile_no"));
//					accountInfo.setUniqueIdType(rs.getString("unique_id_type"));
//				}
//				
//			} catch (SQLException | ClassNotFoundException e) { 
//				e.printStackTrace();
//			}
//		return accountInfo;
//	}

//	@Override
//	public List<AccountInfo> getAllAccountInfo() {
//		// TODO Auto-generated method stub
//		List<AccountInfo> accountInfoList = new ArrayList<>();
//		try (
//				Connection con = DBUtil.getConnection();
//				PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BY_ID_SQL);
//				){
//				   ResultSet rs =ps.executeQuery();
//				while(rs.next()) {
//					AccountInfo accountInfo = new AccountInfo();
//					accountInfo.setId(rs.getInt("id"));
//					accountInfo.setAccountName(rs.getString("account_name"));
//					accountInfo.setAddress(rs.getString("address"));
//					accountInfo.setMobileNo(rs.getLong("mobile_no"));
//					accountInfo.setUniqueIdType(rs.getString("unique_id_type"));
//					accountInfoList.add(accountInfo);
//				}
//				
//			} catch (SQLException | ClassNotFoundException e) { 
//				e.printStackTrace();
//			}
//		return accountInfoList
//;
//
//	}
//	

	
	
}
