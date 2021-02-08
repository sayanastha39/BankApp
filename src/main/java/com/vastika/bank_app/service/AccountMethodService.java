package com.vastika.bank_app.service;

import com.vastika.bank_app.model.AccountBalance;

public interface AccountMethodService {
	
	int deposit (AccountBalance deposit);
	int withdrawal (AccountBalance withdraw);

}
