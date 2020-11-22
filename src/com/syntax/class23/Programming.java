package com.syntax.class23;

public class Programming {
    public Programming(){
        System.out.println("I love programming languages!");
    }
    public Programming(String value){
        System.out.println("I love "+value);
    }

    public static void main(String[] args) {
        Programming obj=new Programming();
        Programming obj1=new Programming("cookies");
        Programming obj2=new Programming("chocolate");
    }
}
