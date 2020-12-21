package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRetainAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Maria");
        arrayList1.add("Glenn");
        arrayList1.add("Jacob");
        arrayList1.add("Veronika");
        arrayList1.add("Jim");
        arrayList1.add("Ali");
        arrayList1.add("Mia");
        System.out.println(arrayList1.size());

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Burju");
        arrayList2.add("Jenny");
        arrayList2.add("Mike");
        arrayList2.add("Ali");
        arrayList2.add("Mia");


        arrayList1.retainAll(arrayList2);//saves only those elements repeated in both lists
        System.out.println(arrayList1.size());
        System.out.println(arrayList1);

        int[] arr=new int[2];
        arr[0]=10;
        arr[1]=20;
        System.out.println(Arrays.toString(arr));
        arr[0]=20;
        System.out.println(Arrays.toString(arr));
    }
}
