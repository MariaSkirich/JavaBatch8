package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String,Double> storeItems=new HashMap<>();
        storeItems.put("Milk", 3.20);
        storeItems.put("Bread", 0.6);
        storeItems.put("Cake", 40.0);
        storeItems.put("Diapers", 39.99);
        storeItems.put("Eggs", 4.99);

        HashMap<String,Double> storeItems2=new HashMap<>();
        storeItems2.put("Strawberries", 12.15);
        storeItems2.put("Coffee", 3.00);
        storeItems2.put("Yogurt", 8.99);
        storeItems2.put("Cheese", 16.00);
        storeItems2.put("Butter", 3.70);

        storeItems2.putAll(storeItems);
        Set<String> set=storeItems2.keySet();
        Double sum=0.0;
        storeItems2.remove("Cheese");
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            String item= iterator.next();

            if(storeItems2.get(item)!=null){
                sum+=storeItems2.get(item);
            }
        }

        System.out.println("Total of all goods is "+sum);

    }
}
