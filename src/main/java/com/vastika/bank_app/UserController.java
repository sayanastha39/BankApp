package com.vastika.bank_app;

import java.util.Scanner;

import com.vastika.bank_app.model.AccountInfo;
import com.vastika.bank_app.service.AccountInfoService;
import com.vastika.bank_app.service.AccountInfoServiceImpl;

/**
 * Hello world!
 *
 */
public class UserController 
{
    public static void main( String[] args )
    {
      
    	
    	AccountInfoService info =  new AccountInfoServiceImpl();
    		AccountInfo account_setup = new AccountInfo();
    	
    	
    	Scanner sc= new Scanner(System.in); 
    	
    	
    	System.out.println("Enter id: ");
    	int id = sc.nextInt();
    	account_setup.setId(id);
    	sc.nextLine();
    	
    	System.out.println("Enter your name: ");
    	String name = sc.nextLine(); 
    		account_setup.setAccount_name(name);
    	
    	System.out.println("Enter your address: ");
    	String address = sc.nextLine(); 
    	account_setup.setAddress(address);
    	
    	System.out.println("Enter your mobile number");
    	long number = sc.nextLong();
    	
    	account_setup.setMobile_no(number);
    	
    	
    	System.out.println("Enter your passport number: ");
    	long passNumber = sc.nextLong();
    	account_setup.setPassport_number(passNumber);
    	
    	
    	int saved = info.saveUserInfo(account_setup);
    	
    	if(saved >=1)
    		System.out.println("Saved.....");
    	else 
    		System.out.println("Not saved....");
    	
    	sc.close();
    	
    }
}
