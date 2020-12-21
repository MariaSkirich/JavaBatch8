package com.syntax.class32;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSetDifference {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Raspberry");
        hashSet.add("Apple");
        hashSet.add("Strawberry");
        hashSet.add("Avocado");
        hashSet.add("Mango");

        for (String element:hashSet) {
            System.out.println(element);
        }

        List<String> arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Raspberry");
        arrayList.add("Apple");
        arrayList.add("Strawberry");
        arrayList.add("Avocado");
        arrayList.add("Mango");

    }

}
