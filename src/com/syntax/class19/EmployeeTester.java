package com.syntax.class19;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.age);


        Employee employee1 =new Employee(100, "maria", 'c');
        System.out.println(employee1.age);
        //constructor.print();

    }
}
