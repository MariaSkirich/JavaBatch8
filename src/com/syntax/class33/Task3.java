package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy=new HashMap();
        bestBuy.put(123,"iPhone");
        bestBuy.put(456, "MacBook");
        bestBuy.put(789, "iWatch");
        bestBuy.put(147, "iPad");
        bestBuy.put(258, "iMac");
        bestBuy.put(369, "AirPods");

        Set<Map.Entry<Integer, String>> bestBuySet=bestBuy.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator=bestBuySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
