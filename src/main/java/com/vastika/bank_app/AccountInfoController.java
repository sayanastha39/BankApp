package com.vastika.bank_app;

import java.util.Scanner;

import com.vastika.bank_app.model.AccountBalance;
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
    	AccountMethodService accountMethodService = new AccountMethodImplService();
    	
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
        		 AccountBalance accountBalance1 = new AccountBalance();
        		 
        		 System.out.print("Enter your id: ");
        		 int id1 = reader.nextInt();
        		 accountBalance1.setAccountInfoId(id1);
        		 
        		 System.out.print("Enter the balance to withdraw: ");
        		 double withdraw = reader.nextDouble();
        		 accountBalance1.setWithdrawAmount(withdraw);
        		 
        		 if(withdraw<= accountBalance1.getBalance()) {
        			 double balance = accountBalance1.getBalance()- withdraw;
        			 accountBalance1.setBalance(balance);
        			 System.out.println("Withdraw sucessfull");
        		 }
        		 else 
      	    		System.out.println("Not changed.....");
        		 break;
        		 
        	 case "deposit":
        		 AccountBalance accountBalance2= new AccountBalance();
        		 System.out.print("Enter your id: ");
        		 int id2 = reader.nextInt();
        		 accountBalance2.setAccountInfoId(id2);
        		 
        		 System.out.print("Enter the balance to deposit: ");
        		 double balance = reader.nextDouble(); 
        		 accountBalance2.setDepositAmount(balance);
        		 
        		 
        		 int deposit = accountMethodService.deposit(accountBalance2);
        		 
        		 if(deposit >=1)
     	    		System.out.println("deposit balance changed in database");
     	    	else 
     	    		System.out.println("Not changed.....");
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
