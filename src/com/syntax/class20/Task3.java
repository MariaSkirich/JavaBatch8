package com.syntax.class20;

public class Task3 {
    String name;
    int age;
    double salary;

    private Task3(String name) {
        this.name = name;
    }

    Task3(int age){
        this.age=age;
    }

    public Task3(double salary){
        this.salary=salary;
    }

    public static void main(String[] args) {
        Task3 obj=new Task3("Maria");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.salary);

        Task3 obj1=new Task3(27);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.salary);

        Task3 obj2=new Task3(12000.00);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.salary);

    }
}
