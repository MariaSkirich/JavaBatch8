package com.syntax.class31;

public abstract class CreditCard {
    String creditCardType;
    CreditCard(String creditCardType){
        this.creditCardType=creditCardType;
    }
    abstract void colorOfCard();
    abstract void typeOfCard();
    public void welcome(){
        System.out.println("Welcome to "+creditCardType);
    }
}
