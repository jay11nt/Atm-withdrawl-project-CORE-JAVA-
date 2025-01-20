package java_project;

import java.util.Scanner;


class ATM 
{
    float balance;
    int pin= 1234;
 
    
    void checkpin()
    {
    	System.out.println("enter your pin");  
    	
        Scanner s = new Scanner (System.in);
        int pin = s.nextInt();
        int timer= s.nextInt();
        
        
        if(pin==1234)
            {
        	menu();
             }
        
        else
           {
        	System.out.println("enter a valid pin");
           }
    }
    
    public void menu()
    {
    	System.out.println("enter your choice-");
    	System.out.println("1. check A/C balance-");
    	System.out.println("2. withdraw the money-");
    	System.out.println("3. deposit the money-");
    	System.out.println("4. exit");
    	
    	Scanner s = new Scanner(System.in);
    	int option = s.nextInt();
    	
    	if(option==1)
    	   {
    	      checkBalance();
    	   }
    		  else if (option==2)
         		{
    		 	 withdrawMoney();
    	       	 	}
    	
    		 else if(option==3)
    	 		{
    		  	 depositMoney();
    			}
    	
    		else if(option==4)
    			{
    		  	  //exit(); 
    		  	  return;
    			}
    	
    	else
    	{
    	    System.out.println("invalid choice try again");
    	}
    	
    }
    
    public void checkBalance()
    {
    	System.out.println("balance-"+ balance);
        menu();
    }
    
    
    public void withdrawMoney()
    {
    	System.out.println("enter amount to withdraw-");
    	Scanner s= new Scanner(System.in);
    	float amount = s.nextFloat();
    	
    	if (amount==balance)
    		{
    		System.out.println("insufficient balance");
    		}
    	
    	else
    		{
    		balance=balance-amount;
    		System.out.println("amount withdrawl sucessfully.");
    		}
    	
    	 menu();
    }
    
    
    public void depositMoney()
    {
    	System.out.println("enter deposit amount");
    	Scanner s= new Scanner(System.in);
    	float amount= s.nextFloat();
    	
    	if(amount>50000)
    	   {
    		System.out.println("above 50000RS/- deposit money, visit branch with PAN card");
    	   }
    	
    	else
    	   {
    		balance=balance+amount;
    		System.out.println("Amount deposited sucessfully");
    	   }
    	menu();
    }   
}

public class ATMmachine {
	public static void main(String [] args)
	{
		ATM obj =new ATM();
		obj.checkpin();
	}
	
}
