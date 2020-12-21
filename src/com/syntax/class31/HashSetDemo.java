package com.syntax.class31;

import java.util.HashSet;
import java.util.Set;


public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Raspberry");
        hashSet.add("Apple");
        hashSet.add("Strawberry");
        hashSet.add("Avocado");
        hashSet.add("Mango");

        System.out.println(hashSet);

    }
}
