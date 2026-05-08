package com.vishnu.bank;

import java.util.ArrayList;
import java.util.Scanner;
class mainaccount {
    static Scanner input = new Scanner(System.in);
    ArrayList<account> accountDetails = new ArrayList<>();
    ArrayList<Double> balance = new ArrayList<>();
    public static void main(String[] args) {
        while(true){
                System.out.println("\n\n\n ");
                System.out.println("Welcome to the bank");
                System.out.println("How can i help you");
                System.out.println("Our services are:");
                System.out.println("\t 1). Opening a new Bank Account");
                System.out.println("\t 2). Depositing money to the existing Bank Account");
                System.out.println("\t 3). WithDrawn of money from existing Bank Account");
                System.out.println("\t 4). Exit");
                int choice= input.nextInt();
                switch (choice) {
                    case 1 ->{
                        Open op = new Open();
                        op.AccountOpen(input);
                    }
                    case 2-> {
                        DepositAccount DA = new DepositAccount();
                        DA.DepositMoney(input);
                    }
                    
                    case 3-> {
                        debit db = new debit();
                        db.WithdrawalMoney(input);
                    }
                    case 4-> {
                        System.out.println("Thank you for using our services");
                        System.exit(0);
                    }
                    
                    default-> {
                        System.out.println("Wrong Input");
                        throw new AssertionError();
                    }
                }

            input.close(); 
            }
           

    }
        

}
