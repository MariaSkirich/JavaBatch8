package com.syntax.class31;

public class ABCBank extends CreditCard {
    int cardLimit;

    ABCBank(String creditCardType, int cardLimit) {
        super(creditCardType);
        this.cardLimit = cardLimit;
    }

    @Override
    void colorOfCard() {
        System.out.println("The color of the ABCBank credit card is green");
    }

    @Override
    void typeOfCard() {
        System.out.println("The type of the ABCBank credit card is " + creditCardType);
    }

    void limit() {
        System.out.println("The limit on the ABCBank card is " + cardLimit);
    }
}
