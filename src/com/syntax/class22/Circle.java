package com.syntax.class22;

public class Circle extends Shape{

    Circle(double radius){
        super(radius);
    }

    public void calcArea(){
        double area=3.14*radius*radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Circle obj=new Circle(2);
        obj.calcArea();
    }
}
