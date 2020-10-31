package com.syntax.class15;

public class Task2 {
    public static void main(String[] args) {
        String value = "GreatGatsby";


        if (!value.isEmpty()) {
            if (value.length() % 2 != 0 || value.length() >= 3) {
                System.out.println(value.charAt(value.length() / 2));
            }
        }
        String reverse ="";
        for (int i = value.length() - 1; i >= 0; i--) {
            reverse += value.charAt(i);
        }
        System.out.println("The reverse word of the value is: " + reverse);
    }
}
