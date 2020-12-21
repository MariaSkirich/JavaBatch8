package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(12.88);
        doubleArrayList.add(8.88);
        doubleArrayList.add(25.44);
        doubleArrayList.add(366.6);
        doubleArrayList.add(8.88);
        doubleArrayList.add(21.44);
        doubleArrayList.add(86.6);
        System.out.println(doubleArrayList);

//        for (Double element:doubleArrayList){
//            if(element<20){
//                doubleArrayList.remove(element);
//            }
//        }
        //runtime error because the size of array changes and we can't iterate over
        //elements using the sane loop

//        for(int i=0; i<doubleArrayList.size(); i++){
//            if(doubleArrayList.get(i)<20){
//                doubleArrayList.remove(doubleArrayList.get(i));
//            }
//        }

        Iterator<Double> iterator = doubleArrayList.iterator();

        while (iterator.hasNext()){
            Double next = iterator.next();
            if(next<20){
                iterator.remove();
            }
        }
        System.out.println("After removing elements less than 20");
        System.out.println(doubleArrayList);
    }
}
