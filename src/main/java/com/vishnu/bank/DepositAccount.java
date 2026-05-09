package com.vishnu.bank;

import java.util.Scanner;

public class DepositAccount {

     mainaccount ma = Open.ma;  // Use the shared static instance
    
     public void DepositMoney(Scanner input)
     { 

         
             System.out.println("Enter your name to deposit money");
             String name=input.next();
             input.nextLine();
             if(name.equals(ma.accountDetails.contains(name))) {
                 System.out.println("Enter the amount to deposit: ");
                 double amount = input.nextDouble();
                 if(amount > 0) {
                    amount+=amount;
                     ma.balance.add(amount);
                     System.out.println("Amount deposited successfully. Current balance: " + amount);
                     
                 } else {
                     System.out.println("Invalid amount. Please enter a positive value.");
                 }
             } else {
                 System.out.println("Name does not match any existing account. or\n account does not exist. or\n create an account first");
             }
            }
    





    }

    

