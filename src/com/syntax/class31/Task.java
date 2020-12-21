package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        for(int i=2; i<=50; i+=2){
            integerArrayList.add(i);
        }
        System.out.println("Even numbers from 1 to 50 are "+integerArrayList);
        Iterator<Integer> iterator=integerArrayList.iterator();
        while(iterator.hasNext()){
            int s= iterator.next();
            if(s%5==0){
                iterator.remove();
            } else{
                System.out.print(s+" ");
            }
        }

    }
}
