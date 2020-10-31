package com.syntax.class15;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("------------Task1-----------------------");
        String value = "My name is Maria and I don't like wasting time";

        String newString = value.replaceAll(" ", "");
        System.out.println(newString);

        System.out.println("--------------Task2----------------------");
        String value2 = "%$*@ 18756 /18jshy #21*&";

        int counter = 0;
        for (int i = 0; i < value2.length(); i++) {
            if (Character.isAlphabetic(value2.charAt(i))) {
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println("------------Task3--------------------------");

        String sentence1 = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String sentence2 = sentence1.replaceAll("[A-Z a-z]", "");
        System.out.println("Amount of sentences: " + sentence2.length());


    }
}

