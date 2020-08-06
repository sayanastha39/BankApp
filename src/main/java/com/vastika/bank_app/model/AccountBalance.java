package com.vastika.bank_app.model;

public class AccountBalance {
	
	private int depositAmount;
	private int withdrawAmount;
	private int balance;
	private int accountInfoId;
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
	public int getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountInfoId() {
		return accountInfoId;
	}
	public void setAccountInfoId(int accountInfoId) {
		this.accountInfoId = accountInfoId;
	}
	
	

}
