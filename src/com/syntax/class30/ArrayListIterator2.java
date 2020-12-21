package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(49);
        arrayList.add(21);

        Iterator<Integer> iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
