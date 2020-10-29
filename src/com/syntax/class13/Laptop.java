package com.syntax.class13;

public class Laptop {

    String make;
    String model;
    int hardDriveCapacity;
    int ramCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies(){
        System.out.println("Playing movies");
    }
    void browseInternet(){
        System.out.println("Browsing the Internet");
    }
    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }
    public String getModel(){
        return model;
    }
    int getRamCapacity(){
        return ramCapacity*2;
    }
    int upgradeRam(int newRamUnit){
return newRamUnit*getRamCapacity();
    }
}
