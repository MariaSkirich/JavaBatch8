package com.syntax.class20;

public class StudentHW {
    String name;
    String address;
    StudentHW (String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println("Name is "+name);
        System.out.println("Address is "+address);
    }
    public static void main(String[] args) {
        StudentHW student1 = new StudentHW("Maria","Ukraine");
        student1.displayInfo();
        StudentHW student2 = new StudentHW("Mike","USA");
        student2.displayInfo();
    }
}
