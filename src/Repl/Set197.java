package Repl;

import java.util.HashSet;
import java.util.Set;

public class Set197 {
    public static void main (String[] args){
        Set<Integer> hashSet=new HashSet<>();
        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(999);
        hashSet.add(999);
        hashSet.add(999);
        System.out.println(hashSet);
    }
}
