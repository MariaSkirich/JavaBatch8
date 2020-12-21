package com.syntax.class31;

public class Car extends Insurance {
    String carModel;
    Car(String name, String carModel){
        super(name);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("The price for car insurance is $100 ("+insuranceName+", "+carModel+")");
    }
    @Override
    void cancelInsurance() {
        System.out.println("You have cancelled your car insurance");
    }
}



