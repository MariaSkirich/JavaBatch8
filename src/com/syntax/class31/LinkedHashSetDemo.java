package com.syntax.class31;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Raspberry");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Strawberry");
        linkedHashSet.add("Avocado");
        linkedHashSet.add("Mango");

        System.out.println(linkedHashSet);
    }
}
