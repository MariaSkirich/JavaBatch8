package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(14.25);
        doubleArrayList.add(78.45);
        doubleArrayList.add(88.32);
        doubleArrayList.add(47.26);
        doubleArrayList.add(85.42);

        Iterator<Double> iterator=doubleArrayList.iterator();
//        System.out.println(iterator.hasNext());//we check if the collection has the next element
//        System.out.println(iterator.next());//we print out the next element

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
