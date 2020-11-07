package com.syntax.class17;

import java.sql.SQLOutput;

public class Task3 {
char getGrage(int marks){
    char grade;
    if(marks>=90 && marks<=100){
        grade='A';
    } else if(marks>=80 && marks<90){
        grade='B';
    } else if(marks>=70 && marks<80){
        grade='C';
    } else if(marks>=60 && marks<70){
        grade='D';
    }else{
        grade='F';
    }
return grade;
}

    public static void main(String[] args) {
        Task3 obj=new Task3();
        System.out.println(" obj.getGrade(90) "+obj.getGrage(90));
        System.out.println(" obj.getGrade(80) "+obj.getGrage(80));
    }
}
