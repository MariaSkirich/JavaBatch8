package com.syntax.class17;

public class Main {
    public static void main(String[] args) {
        Task1 obj=new Task1();
        String email = obj.createEmail("Maria", "Rybak", "gmail");
        System.out.println(email);
        Task2 obj1=new Task2();
        boolean prime1=obj1.isPrime(5);
        System.out.println("is num1 prime? " +prime1);

        Variables var=new Variables();
        var.varsDemo();
        var.varsDemo1();

        Student stud=new Student();
        stud.name="Maria";
        stud.age=27;
        stud.marks=90;
        Student.numberOfStudentsEnrolled++;//this is how we add more students to the static variable
        stud.printInfo();
        stud.printMarks();
        stud.studentsRegistered();

        Student stud1=new Student();
        stud1.name="Mike";
        stud1.age=31;
        stud1.marks=95;
        Student.numberOfStudentsEnrolled++;
        stud1.printInfo();
        stud1.printMarks();
        stud1.studentsRegistered();


    }
}
