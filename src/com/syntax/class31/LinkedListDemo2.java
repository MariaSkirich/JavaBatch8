package com.syntax.class31;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> cities=new LinkedList<>();
        cities.add("Dnipro");
        cities.add("Moscow");
        cities.add("Kiev");
        cities.add("Las Vegas");
        cities.add("Washington");
        cities.add("New York");
        System.out.println(cities);

        cities.addFirst("Prague");
        cities.addLast("Paris");
        cities.add(3, "New Orleans");
        System.out.println(cities);



    }
}
