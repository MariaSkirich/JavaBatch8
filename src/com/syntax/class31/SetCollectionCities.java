package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollectionCities {
    public static void main(String[] args) {
        Set<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("New York");
        linkedHashSet.add("Moscow");
        linkedHashSet.add("London");
        linkedHashSet.add("Kiev");
        linkedHashSet.add("Adelaide");
        linkedHashSet.add("Addis Ababa");
        linkedHashSet.add("Las Vegas");
        linkedHashSet.add("San Francisco");
        linkedHashSet.add("Los Angeles");

        Iterator<String> iterator=linkedHashSet.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(linkedHashSet);
    }
}
