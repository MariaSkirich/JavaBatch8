package com.syntax.class23;

public class Task2 {
    static void print (double var){
        System.out.println(var);
    }
    static void print (int var){
        System.out.println(var);
    }
    static void print (String var){
        System.out.println(var);
    }

    public static void main(String[] args) {
        Task2.print(12.24);
        Task2.print(4);
        Task2.print("Maria");
    }
}
