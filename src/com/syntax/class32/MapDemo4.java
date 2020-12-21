package com.syntax.class32;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<Integer, String> stringMap=new HashMap<>();
        stringMap.put(111,"Sabeen loves PTI");
        stringMap.put(222, "PTI is something about Pakistan");
        System.out.println(stringMap.containsKey(111));
        System.out.println(stringMap.containsValue("PTI is something about Pakistan"));

    }
}
