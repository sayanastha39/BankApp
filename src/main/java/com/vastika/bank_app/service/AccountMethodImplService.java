package com.vastika.bank_app.service;

import com.vastika.bank_app.dao.*;
import com.vastika.bank_app.model.AccountBalance;

public class AccountMethodImplService implements AccountMethodService{
	
	AccountMethods accountMethods = new AccountMethodsImpl();

	@Override
	public int deposit(AccountBalance deposit) {
		
		return accountMethods.deposit(deposit);
	}

	@Override
	public int withdrawal(AccountBalance withdraw) {
		return accountMethods.withdrawal(withdraw);
	}

}
