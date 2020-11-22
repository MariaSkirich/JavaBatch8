package com.syntax.class26;

abstract public class Phone {
    public void makeCalls(){
        System.out.println("Phone makes calls");
    }
    public void sendText(){
        System.out.println("Phone sends text");
    }
    public abstract void viewPicture();
    public abstract void unlock();

}
abstract class Iphone extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("We can check out the photos using the photos app");
    }

}
class IphoneCHild extends Iphone{
    @Override
    public void unlock() {
        System.out.println("Can unlock using face");
    }
}
class Samsung extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("To view pictures use the gallery app");
    }

    @Override
    public void unlock() {
        System.out.println("To unlock use graphic password");
    }
}
