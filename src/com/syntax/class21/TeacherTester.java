package com.syntax.class21;

public class TeacherTester {
    public static void main(String[] args) {
        ChemistryTeacher obj=new ChemistryTeacher();
        obj.degree="PHD in Chemistry";
        obj.education="Washington University";
        obj.name="Miss Jackson";
        obj.subject="Chemistry";
        obj.salary=12_000.00;
        obj.experience=4;
        obj.print();
        obj.periodicTable=false;
        obj.printC();

        MathTeacher obj1=new MathTeacher(3, 1, 4, 2);
        obj1.printM();

    }

}
