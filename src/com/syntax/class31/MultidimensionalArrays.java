package com.syntax.class31;

import java.util.ArrayList;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outerArrayList=new ArrayList<>();
        ArrayList<Integer> innerArrayList=new ArrayList<>();
        innerArrayList.add(88);
        innerArrayList.add(10);
        innerArrayList.add(24);
        innerArrayList.add(45);
        outerArrayList.add(innerArrayList);

        ArrayList<Integer> innerArrayList1=new ArrayList<>();
        innerArrayList1.add(17);
        innerArrayList1.add(15);
        innerArrayList1.add(758);
        innerArrayList1.add(862);
        outerArrayList.add(innerArrayList1);

        System.out.println(outerArrayList);
    }
}
