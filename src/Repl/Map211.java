package Repl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map211 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        Set<Map.Entry<String, String>> mapSet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = mapSet.iterator();
        System.out.println("HashMap Before Replace :");
        while (iterator.hasNext()) {
            Map.Entry<String, String> element = iterator.next();
            System.out.println(element.getKey() + " : " + element.getValue());
        }
        map.replace("THREE", "ASEL");
        map.replace("FIVE", "SUMAIR");
        System.out.println("HashMap After Replace :");
        
        Iterator<Map.Entry<String, String>> iterator2 = mapSet.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> element = iterator2.next();
            System.out.println(element.getKey() + " : " + element.getValue());
        }
    }
}

