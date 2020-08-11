package com.vastika.bank_app.dao;

import java.util.List;

import com.vastika.bank_app.model.AccountInfo;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public interface AccountInfoDao {

	
	int  saveUserInfo(AccountInfo info); 
	
	int updateAccountInfo(AccountInfo accountInfo);
	
	void deleteAccountInfo(int id);
	
//	AccountInfo getAccountById(int id);
//	
//	List <AccountInfo> getAllAccountInfo();	
}
