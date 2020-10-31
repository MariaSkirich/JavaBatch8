package com.syntax.class14;

public class SigningUp {
    public static void main(String[] args) {
        Login newLogin = new Login();
        boolean newUsername = newLogin.userNameInput("Username: ");
        boolean newPassword = newLogin.passwordInput("Password: ");

       if (newUsername && newPassword){
           System.out.println("Congratulations! Your username and password have been created!");
        }




    }
}
