package Repl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map212 {
    public static void display(Map<String, Integer> map) {

        if (!map.isEmpty()) {
            Set<Map.Entry<String, Integer>> mapSet = map.entrySet();
            Iterator<Map.Entry<String, Integer>> iterator = mapSet.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("Map is empty");
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> fruits=new HashMap<>();
        fruits.put("mango",10);
        fruits.put("apple",30);
        fruits.put("orange",20);

        display(fruits);
        fruits.clear();
        display(fruits);
    }
}
