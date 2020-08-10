package com.vastika.bank_app.service;

import java.util.List;

import com.vastika.bank_app.model.AccountInfo;
import com.vastika.bank_app.dao.*;

public class AccountInfoServiceImpl implements AccountInfoService{
	
	AccountInfoDao accountInfoDao = new AccountInfoDaoImpl();

	@Override
	public int saveAccountInfo(AccountInfo accountInfo) {
		
		return accountInfoDao.saveAccountInfo(accountInfo);
	}

	@Override
	public int updateAccountInfo(AccountInfo accountInfo) {
		return accountInfoDao.updateAccountInfo(accountInfo);
	}

	@Override
	public void deleteAccountInfo(int id) {
	  accountInfoDao.deleteAccountInfo(id);
	}

	@Override
	public AccountInfo getAccountById(int id) {
		return accountInfoDao.getAccountById(id);	
	}

	@Override
	public List<AccountInfo> getAllAccountInfo() {
		return accountInfoDao.getAllAccountInfo();
	}

}
