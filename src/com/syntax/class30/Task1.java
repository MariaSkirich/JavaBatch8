package com.syntax.class30;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        arrayList.add("Maria");
        arrayList.add("Glenn");
        arrayList.add("Jacob");
        arrayList.add("Veronika");
        arrayList.add("Jim");
        System.out.println("Is the array list empty? "+arrayList.isEmpty());
        System.out.println("Does the array list contain Glenn? "+arrayList.contains("Glenn"));
        System.out.println("What is the size of the array list? "+arrayList.size());
        System.out.println(arrayList);

    }
}
