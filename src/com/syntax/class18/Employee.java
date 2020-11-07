package com.syntax.class18;

public class Employee {
    int empID;
    double salary;
    static String CEO;

    public static void main(String[] args) {
        Employee emp=new Employee();

        emp.empID=124;
        emp.salary=4200.45;
        Employee.CEO="Sumair";

        Employee emp1=new Employee();

        emp1.empID=145;
        emp1.salary=6700.41;

        System.out.println(emp1.CEO);
    }

}
