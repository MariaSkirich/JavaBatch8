package com.syntax.class18;

public class Student {
    String studentName;
    int studentID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Student stud1=new Student();
        stud1.studentName="Maria Skirich";
        stud1.studentID=8;
        Student.numberOfStudents++;

        System.out.println(stud1.numberOfStudents);

        Student stud2=new Student();
        stud2.studentName="Mike Domenech";
        stud2.studentID=15;
        Student.numberOfStudents++;

        System.out.println(stud2.numberOfStudents);
    }
}
