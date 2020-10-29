package com.syntax.class14;

public class EqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        String name="Marta";
        String name1="MARTA";
        String name2="mArTa";
        System.out.println(name.equalsIgnoreCase(name1)&&name.equalsIgnoreCase(name2));

    }
}
