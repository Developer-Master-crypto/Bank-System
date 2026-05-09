package com.vishnu.bank;
import java.util.Scanner;
public class debit 
{

    public static void WithdrawalMoney(Scanner input) 
    {
    
        System.out.println("Enter your name to withdraw money");
        String name = input.next();
        input.nextLine();
        
        mainaccount ma = Open.ma;  // Use the shared static instance
        
        // Find the user's index in accountDetails
        int userIndex = -1;
        for(int i = 0; i < ma.accountDetails.size(); i++)
        {
            if(ma.accountDetails.get(i).getname().equals(name)) 
            {
                userIndex = i;
                break;
            }
        }
        
        if(userIndex != -1) 
        {
            System.out.println("Enter the amount to withdraw: ");
            double amount = input.nextDouble();
            
            if(amount > 0) 
            {
                
                    if(amount <= ma.balance.get(userIndex)) 
                    {
                        ma.balance.set(userIndex, ma.balance.get(userIndex) - amount);
                        System.out.println("Amount withdrawn successfully. Current balance: " + ma.balance.get(userIndex));
                    } else {
                        System.out.println("Insufficient balance. Current balance: " + ma.balance.get(userIndex));
                    }
            } else {
                System.out.println("Invalid amount. Please enter a positive value.");
            }
            
        } else {
            System.out.println("Name does not match any existing account. or\n account does not exist. or\n create an account first");
        }
        input.close();
    }
}

