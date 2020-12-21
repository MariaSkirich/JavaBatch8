package com.syntax.class30;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Maria");
        arrayList1.add("Glenn");
        arrayList1.add("Jacob");
        arrayList1.add("Veronika");
        arrayList1.add("Jim");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Burju");
        arrayList2.add("Jenny");
        arrayList2.add("Mike");
        arrayList2.add("Ali");
        arrayList2.add("Mia");
        arrayList2.addAll(arrayList1);
        //arrayList2.addAll(0, arrayList1);
        Collections.sort(arrayList2);//sorts elements alphabetically
        System.out.println(arrayList2);

    }

}
