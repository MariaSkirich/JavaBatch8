package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Maria");
        arrayList1.add("Glenn");
        arrayList1.add("Jacob");
        arrayList1.add("Veronika");
        arrayList1.add("Jim");
        arrayList1.add("Ali");
        arrayList1.add("Mia");


        System.out.println("Enhanced For Loop");
        for(String name:arrayList1){
            System.out.println(name);
        };

        System.out.println("For Loop");
        for (int i=0; i<arrayList1.size(); i++){
            System.out.println(arrayList1.get(i));
        }


        System.out.println("While Loop");
        int index=0;
        while(index<arrayList1.size()){
            System.out.println(arrayList1.get(index));
            index++;
        }
        System.out.println("Iterator");
        Iterator<String> iterator=arrayList1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
