package com.vastika.bank_app.dao;

import java.util.List;

import com.vastika.bank_app.model.AccountInfo;

public interface AccountInfoDao {
	
	int saveClientInfo(AccountInfo client);
	
	int updateClientInfo(AccountInfo client);
	
	void deleteClientInfo(int id);
	
	AccountInfo getClientById(int id);
	
	List<AccountInfo> getAllClientInfo();
	

}
