package com.syntax.class24;

public class DogTester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.appearance();
        dog.bark();
        dog.eat();
        dog.sleep();
        dog=new Chow();//CE
        dog.appearance();

        Chow chow=(Chow) dog;
        chow.hunt();
        chow.special();
    }
}
