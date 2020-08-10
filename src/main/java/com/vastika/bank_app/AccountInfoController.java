package com.vastika.bank_app;

import java.util.Scanner;
import com.vastika.bank_app.model.AccountInfo;
import com.vastika.bank_app.service.*;

public class AccountInfoController {
	
	public static AccountInfo getUserData(String type, Scanner reader) {
		AccountInfo accountInfo= new AccountInfo();
		 if(type.contentEquals("update")) {
			 System.out.println("Enter id:  ");
			 int id = reader.nextInt();
			 accountInfo.setId(id);
		 }
	   	 System.out.println("Enter account name: ");
	   	 String accountName= reader.next();
	   	 System.out.println("Enter address: ");
	   	 String address= reader.next();
	   	 System.out.println("Enter mobileno: ");
	   	 Long mobileno= reader.nextLong();
	   	 System.out.println("Enter uniqueIdType: ");
	   	String uniqueIdType= reader.next();
	   	
		accountInfo.setAccountName(accountName);
		accountInfo.setAddress(address);
		accountInfo.setMobileno(mobileno);
		accountInfo.setUniqueIdType(uniqueIdType);
	   	 return accountInfo;
		}
	
    public static void main( String[] args ) {
    	AccountInfoService accountInfoService = new AccountInfoServiceImpl();
    	String decision = "";
    	 Scanner reader  =  new Scanner(System.in);
    	 
    	 do {
    		 System.out.println("Enter your choice for operation from create/withdraw/deposit: ");
        	 String choice = reader.next();
        	 
        	 switch(choice) {
        	 case "create":
        		 AccountInfo saveAccountInfo = getUserData(choice, reader);
            	 int saved = accountInfoService.saveAccountInfo(saveAccountInfo);
            	 if (saved>=1) {
            		 System.out.println("New user created sucessfully!");
            	 }
            	 else {
            		 System.out.println("User create failed!!");
            	 }
        		 break;
        		 
        	 case "withdraw":
        		 
        		 break;
        		 
        	 case "deposit":
        		 
        		 break;
        		 
        	default:
        		System.out.println("Wrong input for choice!");
        		break;
        	 }
        	 System.out.println("Do you want to perform next? y or n");
        	 decision = reader.next();
    	 }
    	 while(decision.equalsIgnoreCase("y"));
    }
   
}
