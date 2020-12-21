package com.syntax.class32;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicates {
    public static void main(String[] args) {
        /*How can you remove all duplicates from ArrayList?*/
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        Set<String> removeDuplicate = new LinkedHashSet<>(aList);
        System.out.println(removeDuplicate);
    }
}
