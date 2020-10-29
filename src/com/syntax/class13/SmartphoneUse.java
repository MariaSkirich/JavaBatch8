package com.syntax.class13;

public class SmartphoneUse {
    public static void main(String[] args) {
        Smartphone ph1=new Smartphone();
        ph1.brand="Apple";
        ph1.color="silver";
        ph1.model=" 11 Pro Max";

        ph1.call("0951689968");
        ph1.text("I love you");
        ph1.photo();
        ph1.SMS();

        Smartphone ph2=new Smartphone();
        ph2.brand="Samsung";
        ph2.color="white";
        ph2.model=" S 20";

        ph2.call("0635428798");
        ph2.text("Brb in five");
        ph2.photo();
        ph2.SMS();
    }
}
