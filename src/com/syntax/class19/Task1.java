package com.syntax.class19;

public class Task1 {
    int age;
    String name;
    char grade;

    Task1(){
        System.out.println("This constructor does not have any parameters. That's why this line is printed.");
    }
    Task1(int ageValue, String nameValue, char gradeValue){
        age=ageValue;
        name=nameValue;
        grade=gradeValue;
    }

    public static void main(String[] args) {
        Task1 obj=new Task1(24, "Marina", 'c');
        Task1 obj1=new Task1();
        Task1 obj2=new Task1(27, "Anton", 'A');
    }
}
