package com.syntax.class31;

public class XYZBank extends CreditCard {
    String expiration;
    XYZBank(String creditCardType, String expiration){
        super(creditCardType);
        this.expiration=expiration;
    }

    @Override
    void colorOfCard() {
        System.out.println("The color of the XYZ credit card is blue");
    }

    @Override
    void typeOfCard() {
        System.out.println("The type of the XYZ credit card is "+creditCardType);
    }
    void expirationDate(){
        System.out.println("Expiration date of the XYZ card is "+expiration);
    }
}
