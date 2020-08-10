package com.vastika.bank_app.dao;

import com.vastika.bank_app.model.*;
public interface DaoClass {
	void openAcc (AccountInfo acci);
	void deposit (AccountBalance accb);
	void withdrawal (AccountBalance accb);
	
}
