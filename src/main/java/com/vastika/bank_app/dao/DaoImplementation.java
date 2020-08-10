package com.vastika.bank_app.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.vastika.bank_app.model.AccountBalance;
import com.vastika.bank_app.model.AccountInfo;
import com.vastika.bank_app.util.DBUtil;
import com.vastika.bank_app.util.QueryUtil;

public class DaoImplementation implements DaoClass
{
	public void openAcc (AccountInfo acci)
	{
		try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(QueryUtil.ADD_USER);){
			
		}catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	public void deposit (AccountBalance accb)
	{
		try (Connection con = DBUtil.getConnection(); PreparedStatement ps= con.prepareStatement(QueryUtil.AC_DEPOSIT))
		{
			ps.setDouble(1, accb.getDepositAmount());
			ps.setDouble(2, accb.getWithdrawAmount());
			ps.setDouble(3, accb.getBalance());
			ps.setInt(4, accb.getAccountInfoId());
			ps.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
	}
	public void withdrawal (AccountBalance accb) {
		try (Connection con = DBUtil.getConnection(); PreparedStatement ps= con.prepareStatement(QueryUtil.AC_WITHDRAWAL))
		{
			ps.setDouble(1, accb.getDepositAmount());
			ps.setDouble(2, accb.getWithdrawAmount());
			ps.setDouble(3, accb.getBalance());
			ps.setInt(4, accb.getAccountInfoId());
			ps.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		
	}
	
}
