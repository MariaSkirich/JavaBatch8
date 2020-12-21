package com.syntax.class30;

import java.util.ArrayList;

public class ArrayListClearAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Maria");
        arrayList1.add("Glenn");
        arrayList1.add("Jacob");
        arrayList1.add("Veronika");
        arrayList1.add("Jim");
        arrayList1.add("Ali");
        arrayList1.add("Mia");
        System.out.println(arrayList1);
        arrayList1.clear();
        System.out.println(arrayList1);

    }
}
