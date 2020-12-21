package com.syntax.class30;

import java.util.Arrays;

public class ArrayIssues {
    public static void main(String[] args) {
        String name = "Maria";
        String name1 = "Mike";
        String name2 = "Veronika";
        //variables can hold 1 value of the specific data type
        //arrays can help to hold thousands of values
        int initialSize = 3;
        int elementsStored = 0;
        String[] names = new String[initialSize];
        names[0] = "Maria";
        names[1] = "Mike";
        names[2] = "Veronika";

        System.out.println(names.length);
        names=expandArray(names);
        names[3] = "Burju";
        names[4] = "Ali";
        names[5] = "Ali";
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));


    }
    public static String[] expandArray(String[] oldArray){
        String[] newArray = new String[oldArray.length * 2];
        for(int i=0; i< oldArray.length; i++){
            newArray[i]=oldArray[i];
        };

        return newArray;
    }
}
