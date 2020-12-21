package com.syntax.class35;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Map<String, Integer> hashMap=new Hashtable<>();//thread safe and will not allow null values
        hashMap.put(null,111);
        hashMap.put("Vladimir",null);//null not allowed in values, will get an error
        hashMap.put("Maria", 333);
        hashMap.put("Danis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jassor", 666);



    }
}
