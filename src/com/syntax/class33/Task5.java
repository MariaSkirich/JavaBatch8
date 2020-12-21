package com.syntax.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {
        String[] citiesArray = {"Paris", "Moscow", "Washington DC", "Helsinki", "Oslo", "Berlin", "Ottawa"};
        Map<String, Integer> citiesMap = new TreeMap<>();
        for (int i = 0; i < citiesArray.length; i++) {
            citiesMap.put(citiesArray[i], citiesArray[i].length());
        }
        System.out.println(citiesMap);
        Set<Map.Entry<String, Integer>> citiesSet = citiesMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = citiesSet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> element = iterator.next();
            if (element.getValue() > 7) {
                iterator.remove();
            }
        }
        System.out.println(citiesMap);
    }
}
