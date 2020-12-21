package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(12.88);
        doubleArrayList.add(8.88);
        doubleArrayList.add(25.44);
        doubleArrayList.add(14.86);
        doubleArrayList.add(256.47);
        doubleArrayList.add(31.29);

        System.out.println("The array list before removing elements");
        System.out.println(doubleArrayList);

        Iterator<Double> iterator = doubleArrayList.iterator();

        while (iterator.hasNext()){
            if(iterator.next()<20){
                iterator.remove();
            }
            }
        System.out.println("After removing elements");
        System.out.println(doubleArrayList);

        }
    }

