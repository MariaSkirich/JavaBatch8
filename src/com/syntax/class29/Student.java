package com.syntax.class29;

public class Student implements PrintInfo, PayFee {
    @Override
    public void printName() {
        System.out.println("My name is Maria");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("My number is 1235468");
    }

    @Override
    public void printAddress() {
        System.out.println("My address is Dnipro, Ukraine");
    }

    @Override
    public void payFee() {
        System.out.println("Please, pay your fee");
    }
}
