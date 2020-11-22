package com.syntax.class28;

public class ChildClass implements MyInterface, MyInterface2{

    @Override
    public void printInfo() {
        System.out.println("My name is Maria and I'm a freelance writer");
    }

    @Override
    public void printAddress() {
        System.out.println("Ukraine, Dnipro");
    }

    @Override
    public void printNameAndAddress() {
        System.out.println("My name is Maria, I live in Dnipro");
    }
}
