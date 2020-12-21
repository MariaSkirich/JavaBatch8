package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Dnipro");
        cities.add("Moscow");
        cities.add("Kiev");
        cities.add("Las Vegas");
        cities.add("Washington");
        cities.add("New York");
        System.out.println(cities);

//        while (iterator.hasNext()) {
//            if (iterator.next().endsWith("o")) {
//                iterator.remove();
//            }
//        }
        cities.removeIf(s -> s.endsWith("o"));
        System.out.println(cities);

    }
}
