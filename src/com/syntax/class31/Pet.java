package com.syntax.class31;

public class Pet extends Insurance {
    String petType;
    Pet(String name, String type){
        super(name);
        this.petType=type;
    }
    @Override
    void getQuote() {
        System.out.println("The price for pet insurance is $10 ("+insuranceName+", "+petType+")");
    }
    @Override
    void cancelInsurance() {
        System.out.println("You have cancelled your pet insurance");
    }

}
