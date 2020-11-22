package com.syntax.class19;

public class RecapTask3 {
    private static String vowelsOnly(String name) {
        name.replaceAll("[^AEIOUaeiou]", "");

        return name;
    }

    public static void main(String[] args) {
        RecapTask3 obj1=new RecapTask3();
        System.out.println(vowelsOnly("Maria"));
    }
}
