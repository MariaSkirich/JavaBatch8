package com.syntax.class33;

import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Set<String> fruits=new LinkedHashSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapefruit");
        fruits.add("Watermelon");
        fruits.add("Cherries");
        fruits.add("Avocado");

        String allValues="";

        Iterator<String> iterator= fruits.iterator();
        while(iterator.hasNext()){
            allValues+= iterator.next();
        }
        System.out.println(allValues);

        List<Integer> integerList=new LinkedList<>();
        integerList.add(17);
        integerList.add(86);
        integerList.add(68);
        integerList.add(15);
        integerList.add(28);
        integerList.add(30);
        integerList.add(17);
        integerList.add(15);

        int sum=0;
        Iterator<Integer> iterator1= integerList.listIterator();
        while(iterator1.hasNext()){
            sum+=iterator1.next();
        }
        System.out.println(sum);



    }
}
