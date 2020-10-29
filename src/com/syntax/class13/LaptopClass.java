package com.syntax.class13;

public class LaptopClass {
    public static void main(String[] args) {
        Laptop lap1=new Laptop();
        lap1.make="Dell";
        lap1.model="G5 15";
        lap1.hardDriveCapacity=1;
        lap1.ramCapacity=16;
        lap1.color="black";
        lap1.processor="Intel Core i7";
        lap1.GPU="Nvidia Geforce GTX";

        lap1.playMovies();
        lap1.browseInternet();
        lap1.makeVideoCall("Mom");
        String model = lap1.getModel();
        System.out.println(model);
        int ramCapacity = lap1.getRamCapacity();
        System.out.println(ramCapacity);
        System.out.println(lap1.upgradeRam(5));
    }
}
