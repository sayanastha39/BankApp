package com.vastika.bank_app.model;

import java.util.Random;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public class AccountInfo {
	
	
	
	private String accountName;
	private String address; 
	private long mobileNo;
	private int id; 
	private String UniqueIdType;
	
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId() {
		
		 int random = 1000;
		this.id = random++;
	}
	public String getUniqueIdType() {
		return UniqueIdType;
	}
	public void setUniqueIdType(String uniqueIdType) {
		UniqueIdType = uniqueIdType;
	}
	
}
