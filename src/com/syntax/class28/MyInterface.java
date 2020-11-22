package com.syntax.class28;

public interface MyInterface extends MyInterface2,MyInterface3 {

    //before Java8
    String name="Hello";
    public void printInfo();

    //Java 8
    static void printNumber(){
        System.out.println("12453871");
    }
    default void printName(){
        //default methods are used to support lambdas
    }
}
