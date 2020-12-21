package com.syntax.class31;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet=new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Raspberry");
        treeSet.add("Apple");
        treeSet.add("Strawberry");
        treeSet.add("Avocado");
        treeSet.add("Mango");

        System.out.println(treeSet);

        Set<Integer> treeSet1=new TreeSet<>();
        treeSet1.add(85);
        treeSet1.add(479);
        treeSet1.add(786);
        treeSet1.add(42);
        treeSet1.add(79);
        treeSet1.add(4);

        System.out.println(treeSet1);
    }
}
