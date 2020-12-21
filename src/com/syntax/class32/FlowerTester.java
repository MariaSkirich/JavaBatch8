package com.syntax.class32;

import java.util.ArrayList;

public class FlowerTester {
    public static void main(String[] args) {
        ArrayList<Flower> flowerArrayList=new ArrayList<>();
        flowerArrayList.add(new SunFlower("Sunflower", "Yellow"));
        flowerArrayList.add(new Rose("Rose", "Pink"));
        flowerArrayList.add(new Tulip("Tulip", "Red"));

        for(Flower flower:flowerArrayList){
            System.out.println("Name of the flower is "+flower.name+". Color is "+flower.color);
            flower.bloom();
            System.out.println();
        }

    }
}
