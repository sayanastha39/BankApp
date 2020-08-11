package com.vastika.bank_app.service;

import com.vastika.bank_app.model.AccountBalance;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public interface AccountBalanceService {

	
	int depositeAmount(AccountBalance balance);
	
	int withdrawAmount(AccountBalance balance); 
}
