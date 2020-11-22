package com.syntax.class22;

public class MethodOverloading {

    public void print() {
        System.out.println("Print with no arguments");
    }

    public void print(String name, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Hello " + name);
        }

    }
    public void print(int number, String name){
        System.out.println("Name is "+name+" Number is "+number);
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.print();
        obj.print("Maria", 3);
        obj.print(3, "Maria");
    }
}
