package com.syntax.class19;

public class Employee {
    int age;
    String name;
    char grade;

    Employee() {
        System.out.println("I will be called every time you create an object of this class");
    }
    Employee(int ageValue, String nameValue, char characterValue) {
        System.out.println("I am not a useless constructor. I am initializing your fields");

        if(ageValue>60 || ageValue<18){
            System.out.println("You should not be working. Please, retire or wait to be 18 y.o.!");
        } else {
            age = ageValue;

        }
        if(nameValue.length()>25){
            System.out.println("Please, use short name like Aladin");
        } else{
            name = nameValue;
        }

        grade = characterValue;
    }

    void print() {
        System.out.println("Number is " + age + " Name is " + name + " Character is " + grade);
    }

}
