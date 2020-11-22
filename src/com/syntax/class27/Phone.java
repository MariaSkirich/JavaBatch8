package com.syntax.class27;

public abstract class Phone {
    public void call(){
        System.out.println("We can make calls");
    }
    public void text(){
        System.out.println("We can send text");
    }
    public abstract void takePics();
    public abstract void playMusic();
}
class Iphone extends Phone{

    @Override
    public void takePics() {
        System.out.println("Can take good pictures in low light");
    }

    @Override
    public void playMusic() {
        System.out.println("Iphone can play music from iTunes");
    }
    public void faceTime(){
        System.out.println("I can make video calls");
    }
}
