package com.syntax.class16;

import com.syntax.class13.Dog;

public class Methods {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        //dog1.bark(); - can't import method from another package
        //we can make method public and will make it available in other packages
        dog1.bark();
        System.out.println(addNumbers(10,12));
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;


    }
}
