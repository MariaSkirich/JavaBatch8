package com.syntax.class13;

import java.util.Scanner;

public class Account {
    String accountID;
    String userName;
    String password;
    String typeOfAccount;
    double balance;
    double limit;
    double transferAmount;


    boolean login(String enteredUsername, String enteredPassword) {
        if (userName.equals(enteredUsername) && password.equals(enteredPassword)) {
            return true;
        } else {
            return false;
        }
    }

    double transfer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the amount of transfer");
        transferAmount = scan.nextInt();
        if (transferAmount < balance) {
            return balance = balance - transferAmount;
            } else {
            System.out.println("Operation is invalid. " + balance + " is less than the amount of transfer");
            }
        return 0;
    }
}






