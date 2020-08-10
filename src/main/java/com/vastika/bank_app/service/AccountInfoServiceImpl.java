package com.vastika.bank_app.service;

import com.vastika.bank_app.dao.AccountInfoDao;
import com.vastika.bank_app.dao.AccountInfoDaoImpl;
import com.vastika.bank_app.model.AccountInfo;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public class AccountInfoServiceImpl implements AccountInfoService{

	AccountInfoDao accountInfoDao = new AccountInfoDaoImpl();

	@Override
	public int saveUserInfo(AccountInfo info) {
		// TODO Auto-generated method stub
		return accountInfoDao.saveUserInfo(info);
	} 
}
