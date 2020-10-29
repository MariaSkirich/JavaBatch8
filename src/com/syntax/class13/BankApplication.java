package com.syntax.class13;

public class BankApplication {
    public static void main(String[] args) {
        Account burjusAccount=new Account();
        burjusAccount.accountID="123";
        burjusAccount.userName="Burju";
        burjusAccount.password="pass123";
        burjusAccount.balance=1_000_000;
        burjusAccount.typeOfAccount="checking";
        burjusAccount.limit=125;
        boolean isLoggedIn=burjusAccount.login("abcd123","abjfad");
        if (isLoggedIn){
            System.out.println("Welcome to Syntax bank");
        } else {
            System.out.println("Invalid username or password");
        }


        Account mariasAccount=new Account();
        mariasAccount.accountID="357";
        mariasAccount.userName="Maria";
        mariasAccount.password="mypass1";
        mariasAccount.balance=15_000;
        mariasAccount.typeOfAccount="saving";
        mariasAccount.limit=100;
        mariasAccount.transfer();





    }
}
