package com.syntax.class14;

import java.util.Scanner;

public class Login {
    String enteredUsername;
    String enteredPassword;


    boolean userNameInput(String message) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your username");
            enteredUsername = scan.nextLine();
            if (enteredUsername.isEmpty()) {
                System.out.println("Username cannot be empty");
            } else {
                break;
            }
        }
        return true;
    }

    boolean passwordInput(String message2) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your password");
            enteredPassword = scan.nextLine();
            if (enteredPassword.isEmpty() || enteredPassword.length() < 8 || enteredPassword.equals(enteredUsername)) {
                System.out.println("--Password cannot be empty \n--Passowrd is too short \n--Password cannot contain username");
            } else {
                System.out.println("Please, enter your password one more time");

                if (enteredPassword.equals(scan.nextLine())) {
                    break;
                } else {
                    System.out.println("Passwords do not match");
                }
            }
        }
        return true;
    }

}
