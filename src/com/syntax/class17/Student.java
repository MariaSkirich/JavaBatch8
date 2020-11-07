package com.syntax.class17;

public class Student {
    String name;
    int age;
    double marks;
    static int numberOfStudentsEnrolled;


    public void printInfo() {
        System.out.println("Name " + name + " Age " + age + " Marks " + marks);
    }

    public void printMarks(){
        System.out.println(" Marks "+marks);
    }

    public void studentsRegistered(){
        System.out.println("Total number of students enrolled for now is "+numberOfStudentsEnrolled);
    }
}
