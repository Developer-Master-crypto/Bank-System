package com.vishnu.bank;

import java.util.Scanner;

public class Open 
{
    public static mainaccount ma = new mainaccount();
    
    public void AccountOpen(Scanner input)
    {
        System.out.println("Thank you for opening bank account in our branch");
        System.out.println("Enter you name to open account");
        String name=input.next();
        input.nextLine();
        
        System.out.println("Enter your phone number: ");
        long phone = input.nextLong();
        
        if(phone < 10) {
                System.out.println("Invalid phone number");
            } else {
                System.out.println("Valid phone number");
            }
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        
        System.out.println("Enter your address: ");
        input.nextLine();
        String address = input.nextLine();
        
        System.out.println("Enter your email: ");
        input.nextLine();
        String email = input.nextLine();
        
        System.out.println("Enter your income: ");
        int income = input.nextInt();
        
        System.out.println("Enter your PIN: ");
        int PIN = input.nextInt();
        
        System.out.println("Enter the amount to deposit to the account: ");
        double amount = input.nextDouble();
        
        account at = new account(name,phone,age,address,email,income,PIN,amount);
        at.setname(name);
        at.setphone(phone);
        at.setage(age);
        at.setaddress(address);
        at.setemail(email);
        at.setincome(income);
        at.setPIN(PIN);
        if(amount<=0){
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            at.setamount(amount);
            System.out.println("Amount deposited successfully. Current balance: " + at.getamount());
        }


        ma.accountDetails.add(at);
        ma.balance.add(amount);
        System.out.println("Account opened successfully. current balance:"+at.getamount());

    }

    
    

}
