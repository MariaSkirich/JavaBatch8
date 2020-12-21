package com.syntax.class31;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Valery","BMW");
        Pet pet = new Pet("Den","Dinosaur");
        List<Insurance> insurances = new ArrayList<>();
        insurances.add(car);
        insurances.add(pet);
        for (Insurance eachObject:insurances) {
            eachObject.getQuote();
            eachObject.cancelInsurance();
        }
    }
}


