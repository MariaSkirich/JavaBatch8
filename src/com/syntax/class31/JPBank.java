package com.syntax.class31;

public class JPBank extends CreditCard {
    String sizeOfTheCard;
    JPBank(String creditCardType, String sizeOfTheCard){
        super(creditCardType);
        this.sizeOfTheCard=sizeOfTheCard;
    }

    @Override
    void colorOfCard() {
        System.out.println("The color of the JPB credit card is yellow");
    }

    @Override
    void typeOfCard() {
        System.out.println("The type of the JPB credit card is "+creditCardType);
    }
    void size(){
        System.out.println("The size of the JPB credit card is "+sizeOfTheCard);
    }
}
