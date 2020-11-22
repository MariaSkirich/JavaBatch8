package com.syntax.class21;

public class Teacher {
    String name;
    int experience;
    double salary;
    String degree;
    String education;
    String subject;

    Teacher(String name, int experience, String degree, String subject) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
        this.degree = degree;
        this.subject = subject;
    }

    Teacher(String name, int experience, String degree, String subject, double salary, String education) {
        this(name, experience, degree, subject);
        this.salary=salary;
        this.education=education;
    }

    public Teacher() {
    }

    void print(){
        System.out.println("The teacher "+name+" has "+experience+" years of experience");
        System.out.println("The teacher "+name+" has a salary in the amount of "+salary);
        System.out.println("The teacher "+name+" has a degree in "+degree+" based on "+education);
        System.out.println("The teacher "+name+" manages this subject "+subject);
    }
}
