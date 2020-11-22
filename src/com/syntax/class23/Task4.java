package com.syntax.class23;

public class Task4 {
    double getArea(double len){

        return len*len;
    }
    double getArea(double len, double width){
        return len*width;
    }

    public static void main(String[] args) {
        Task4 obj=new Task4();
        obj.getArea(4.25);
        obj.getArea(4.25, 6.25);

    }
}
