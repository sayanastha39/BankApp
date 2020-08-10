package com.vastika.bank_app.model;

/**
 * @author : Nabin Neupane
 *
 *
 * @date:	 Aug 10, 2020 
 **/
public class AccountInfo {
	private String account_name;
	private String address; 
	private long mobile_no;
	private int id; 
	private long passport_number;
	
	
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPassport_number() {
		return passport_number;
	}
	public void setPassport_number(long passport_number) {
		this.passport_number = passport_number;
	} 

}
