package com.syntax.class31;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(12.88);
        doubleArrayList.add(14.44);
        doubleArrayList.add(78.6);
        System.out.println(doubleArrayList);

        doubleArrayList.set(2,74.55);//replace the value at index 2 to 74.55
        System.out.println(doubleArrayList);

        doubleArrayList.remove(0);//removing the value at index 0 in the array

        for(Double element:doubleArrayList){
            System.out.println(element);
        }

        for (int i=doubleArrayList.size()-1; i>=0; i--){
            System.out.println(doubleArrayList.get(i)); //printing elements of the array in the reverse order
        }

    }
}
