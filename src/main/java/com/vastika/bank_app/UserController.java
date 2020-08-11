package com.vastika.bank_app;

import java.util.Scanner;

import com.vastika.bank_app.model.AccountBalance;
import com.vastika.bank_app.model.AccountInfo;
import com.vastika.bank_app.service.AccountBalanceService;
import com.vastika.bank_app.service.AccountBalanceServiceImpl;
import com.vastika.bank_app.service.AccountInfoService;
import com.vastika.bank_app.service.AccountInfoServiceImpl;

/**
 * Hello world!
 *
 */
public class UserController 
{
	public static AccountInfo getUserData(String type, Scanner sc) {
		
		AccountInfo account_setup= new AccountInfo();
		
		
//		 if(type.contentEquals("update")) {
//			 System.out.print("\n\t Enter id:  ");
//			 int id = sc.nextInt();
//			 account_setup.setId(id);
//		 }
		 System.out.print("\n\t Enter your name: ");
	    	String name = sc.nextLine(); 
	    		account_setup.setAccountName(name);
	    	
	    	
	    	System.out.print("\n\t Enter your address: ");
	    	String address = sc.nextLine(); 
	    	account_setup.setAddress(address);
	    	
	    	System.out.print("\n\t Enter your mobile number: ");
	    	long number = sc.nextLong();
	    	
	    	account_setup.setMobileNo(number);
	    	
	    	sc.nextLine();
	    	System.out.print("\n\t Enter id type: ");
	    	String passNumber = sc.nextLine();
	    	account_setup.setUniqueIdType(passNumber);
	    	
	    	
		return account_setup;
	}
	
    public static void main( String[] args )
    {
      
    	
    	AccountInfoService info =  new AccountInfoServiceImpl();
    	AccountBalanceService balance = new AccountBalanceServiceImpl();
    		
    	String decision="";
    	
    	
    	Scanner sc= new Scanner(System.in); 
    	
    	
    
    	
    	
    	 do {
    		 System.out.println("Enter your choice for operation from create/withdraw/deposit: ");
        	 String choice = sc.next();
        	 
        	 sc.nextLine();
        	 switch(choice) {
        	 
        	 
        	 case "create":
        		
        	    	
        			AccountInfo acc = getUserData(choice,sc);
        			 int saved = info.saveUserInfo(acc);
        	    	if(saved >=1)
        	    		System.out.println("New Account created...");
        	    	else 
        	    		System.out.println("Not created.....");
        		 break;
        		 
        	 case "withdraw":
        		 
        		 break;
        		 
        	 case "deposit":
        		 
        		 AccountBalance newbalance = new AccountBalance(); 
        		 
        		 System.out.print("Enter your id: ");
        		 int id = sc.nextInt();
        		 
        		 newbalance.setAccountInfoId(id);
        		 
        		 System.out.print("Enter the balance to deposit: ");
        		 double amt = sc.nextDouble(); 
        		 
        		 newbalance.setDepositAmount(amt);
        		 int depoSaved = balance.depositeAmount(newbalance);
        		 
        		 if(depoSaved >=1)
     	    		System.out.println("deposit balance changed in database");
     	    	else 
     	    		System.out.println("Not changed.....");
        		 break;
        		 
        	default:
        		System.out.println("Wrong input for choice!");
        		break;
        	 }
        	 System.out.println("Do you want to perform next? y or n");
        	 decision = sc.next();
    	 }
    	 while(decision.equalsIgnoreCase("y"));
    
   

    	
    	sc.close();
    	
    }
}
