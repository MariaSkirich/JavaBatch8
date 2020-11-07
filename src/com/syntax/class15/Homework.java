package com.syntax.class15;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        System.out.println("--------------Task 1--------------");
        String value = "This is a string for a reverse task";

        for (int i = value.length() - 1; i >= 0; i--) {
            System.out.print(value.charAt(i));
        }
        System.out.println();
        System.out.println("--------------Task 2--------------");
        String str = "I love coding and I love Java";
        String a[] = str.split(" ");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("----------ANOTHER VERSION----------");
        String val = "I love coding and I love Java";
        String v[] = str.split(" ");

        System.out.println(Arrays.toString(v));
        for (int i = 0; i < v.length; i++) {//we convert String to StringBuilder to reverse characters
            StringBuilder stringBuilder = new StringBuilder(v[i]);
            v[i] = stringBuilder.reverse().toString();
        }
        System.out.println(Arrays.toString(v));

        System.out.println("--------------Task 3--------------");
        String str1 = "abba";
        String revstr1 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            revstr1 = revstr1 + str1.charAt(i);
        }
        if (str1.equals(revstr1)) {
            System.out.println(str1 + " is a palindrome");
        } else {
            System.out.println(str1 + " is not a palindrome");
        }
        System.out.println("--------------Task 4---------------");
        String b = "I love Java";
        String c = "Java loves me";

        System.out.println("My string before swap looks like: " + b + " " + c);
        b = b + c;
        c = b.substring(0, b.length() - c.length());
        b = b.substring(c.length());
        System.out.println("After swaping my string looks like: " + b + " " + c);


    }
}

