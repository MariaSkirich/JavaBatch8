package com.syntax.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        Person emilyObj = new Person("Emily", "Matthews", 31, 80000);
        Person jackObj = new Person("Jack", "Black", 28, 110000);
        Person jasonObj = new Person("Jason", "Stephenson", 48, 160000);
        Person lisaObj = new Person("Lisa", "Simpson", 12, 1000);
        Person edwardObj = new Person("Edward", "Brown", 35, 95000);

        Map<Integer, Person> personMap = new TreeMap<>();
        personMap.put(1, emilyObj);
        personMap.put(2, jackObj);
        personMap.put(3, jasonObj);
        personMap.put(4, lisaObj);
        personMap.put(6, edwardObj);

        Set<Map.Entry<Integer, Person>> personEntrySet = personMap.entrySet();
        Iterator<Map.Entry<Integer, Person>> iterator = personEntrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Person> next = iterator.next();
            System.out.println(next.toString());
        }


    }
}

class Person {
    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person() {
    }

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }

    public void printDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


}
