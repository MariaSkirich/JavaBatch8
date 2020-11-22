package com.syntax.class29;

public class Employee implements PrintInfo, PayFee{
    @Override
    public void printName() {
        System.out.println("My name is John Snow");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("My phone number is 1245");
    }

    @Override
    public void printAddress() {
        System.out.println("My address is Moscow, Russia");
    }

    @Override
    public void payFee() {
        System.out.println("I am an employee, I shouldn't pay any fees");
    }
}
