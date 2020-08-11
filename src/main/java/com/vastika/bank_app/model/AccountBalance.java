package com.vastika.bank_app.model;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public class AccountBalance {

	
	private double depositAmount;
	private double withdrawAmount;
	
	private int balance;
	private int accountInfoId;
	
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
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	

}
