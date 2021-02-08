package com.vastika.bank_app.dao;

import com.vastika.bank_app.model.*;

public interface AccountMethods {
	
	int deposit (AccountBalance deposit);
	int withdrawal (AccountBalance withdraw);

}
