package com.syntax.class31;

public abstract class Insurance {
    String insuranceName;
    Insurance(String name){
        this.insuranceName=name;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
}
