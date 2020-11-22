package com.syntax.class19;

public class Students {
/*
Write a java program of Class Students that takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each students name.
 */
String studentName;
    int javaGrade;
    int manTGrade;
    int sdlcGrade;

    Students(String studentNameC, int javaGradeC, int manTGradeC, int sdlcGradeC){
        studentName=studentNameC;
        javaGrade=javaGradeC;
        manTGrade=manTGradeC;
        sdlcGrade=sdlcGradeC;
    }

    void printGradeAverage(){
        int avrg=(javaGrade+manTGrade+sdlcGrade)/3;
        System.out.println("Average mark for the "+studentName+" is "+avrg);
    }

    public static void main(String[] args) {
        Students s1=new Students("Maria", 90, 95, 98);
        s1.printGradeAverage();
        Students s2=new Students("Mike", 98, 94, 96);
        s2.printGradeAverage();
        Students s3=new Students("Veronika", 92, 97, 99);
        s3.printGradeAverage();

    }
}
