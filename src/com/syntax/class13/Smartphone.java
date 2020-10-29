package com.syntax.class13;

public class Smartphone {
   String brand;
   String color;
   String model;


    void call(String phoneNumber){
        System.out.println(brand+model+" is calling "+phoneNumber);
    }

    void text(String text){

        System.out.println(brand+model+" sends text: "+text);
    }
    void photo(){
        System.out.println(brand+model+" is taking a photo");
    }
    void SMS (){
        System.out.println(brand+model+" is sending SMS");
    }

}
