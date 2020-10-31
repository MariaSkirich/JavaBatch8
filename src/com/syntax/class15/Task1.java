package com.syntax.class15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Mom, what is your name?");
        String momName= scan.nextLine();
        System.out.println("What is your name, dad?");
        String dadName= scan.nextLine();
        System.out.println("Are you expecting a boy or a girl?");
        String baby = scan.nextLine();

        if (baby.equalsIgnoreCase("girl")) {
            System.out.println("Suggested baby name: "  + momName.substring(0, 2) + dadName.substring(dadName.length()-3, dadName.length()));
        } else if (baby.equalsIgnoreCase("boy")) {
            System.out.println("Suggested baby name: " + dadName.substring(0, 3) + momName.substring(momName.length()-2, momName.length()));
        }

    }
}
