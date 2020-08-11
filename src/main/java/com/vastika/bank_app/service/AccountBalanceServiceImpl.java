package com.vastika.bank_app.service;

import com.vastika.bank_app.dao.AccountBalanceDao;
import com.vastika.bank_app.dao.AccountBalanceDaoImpl;
import com.vastika.bank_app.model.AccountBalance;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public class AccountBalanceServiceImpl  implements AccountBalanceService{

	
	AccountBalanceDao accountBalance = new AccountBalanceDaoImpl();
	@Override
	public int depositeAmount(AccountBalance balance) {
		// TODO Auto-generated method stub
		return accountBalance.depositeAmount(balance);
	}

	@Override
	public int withdrawAmount(AccountBalance balance) {
		// TODO Auto-generated method stub
		return accountBalance.withdrawAmount(balance);
	}

}
