package com.syntax.class31;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionCountries {
    public static void main(String[] args) {
        Set<String> treeSet=new TreeSet<>();
        treeSet.add("Ukraine");
        treeSet.add("Russia");
        treeSet.add("Belarus");
        treeSet.add("USA");
        treeSet.add("Poland");
        treeSet.add("Germany");
        treeSet.add("France");


        for(String country:treeSet){
            System.out.print(country+", ");
        }
        System.out.println();
        //the same thing can be done with iterator
        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }
    }
}
