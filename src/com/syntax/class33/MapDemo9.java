package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo9 {
    public static void main(String[] args) {
        HashMap<String,Double> storeItems=new HashMap<>();
        storeItems.put("Milk", 3.20);
        storeItems.put("Bread", 0.6);
        storeItems.put("Cake", 40.0);
        storeItems.put("Diapers", 39.99);
        storeItems.put("Eggs", 4.99);



        Iterator<Map.Entry<String, Double>> iterator=storeItems.entrySet().iterator();

        System.out.println(storeItems);
        while(iterator.hasNext()){
            Map.Entry<String, Double> next= iterator.next();
            if(next.getValue()>10){
                iterator.remove();
            }
        }
        System.out.println(storeItems);
    }

}
