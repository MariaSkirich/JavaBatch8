package com.syntax.class25;

public class FinalMethodChildClass extends FinalMethodClass{
    @Override
    double add(double num1, double num2) {
        System.out.println("New code added in the Child class");
        return super.add(num1, num2);
    }
//    final public void printName(){
//        System.out.println("Hello World!");
//    }
}
