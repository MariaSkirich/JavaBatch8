package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Dnipro");
        cities.add("Moscow");
        cities.add("Kiev");
        cities.add("Las Vegas");
        cities.add("Washington");
        cities.add("New York");
        System.out.println(cities);

        Iterator<String> iterator= cities.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().endsWith("o")) {
                iterator.remove();
            }
        }
            System.out.println(cities);

    }
}
