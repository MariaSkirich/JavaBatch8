package com.syntax.class30;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemo2 {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(8);
        arrayList.add(846);
        arrayList.add(7);
        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(new Integer(10));
        System.out.println(arrayList.contains(new Integer(25)));
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList);
    }
}
