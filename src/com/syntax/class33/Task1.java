package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> building = new HashMap();
        building.put(1, "Syntax");
        building.put(1, "Google");
        building.put(2, "Facebook");
        building.put(3, "Twitter");
        building.put(4, "Google");
        building.put(5, "Lingua");
        building.put(6, "TikTok");
        building.put(7, "Facebook");

        int size = building.size();
        System.out.println(size);

        building.replace(4, "Samsung");
        building.remove(7);

        //System.out.println(building); - simple way of printing a map

        Set<Map.Entry<Integer, String>> setEntry= building.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator=setEntry.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
