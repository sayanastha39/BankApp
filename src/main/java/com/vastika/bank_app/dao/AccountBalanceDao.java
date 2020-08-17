package com.vastika.bank_app.dao;

import com.vastika.bank_app.model.AccountBalance;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public interface AccountBalanceDao {

	double depositeAmount(AccountBalance balance);
	
	double withdrawAmount(AccountBalance balance); 
	
	
}
