package com.vastika.bank_app.dao;

import java.util.List;
import com.vastika.bank_app.model.AccountInfo;


public interface AccountInfoDao {
	
	int saveAccountInfo(AccountInfo accountInfo);
	 
	int updateAccountInfo(AccountInfo accountInfo);
	
	void deleteAccountInfo(int id);
	
	AccountInfo getAccountById(int id);
	
	List <AccountInfo> getAllAccountInfo();	

}
