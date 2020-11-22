package com.syntax.class26;

class SmartMachine {
    public void smart() {
        System.out.println("I am a smart machine");
    }
}

public class Computer extends SmartMachine {
    String brand;

    Computer(String brand) {
        this.brand = brand;
    }

    public void run() {
        System.out.println(brand + " can run");
    }

    public void save() {
        System.out.println(brand + " can store data");
    }

    public void transfer() {
        System.out.println(brand + " can transfer data");
    }

    public void storage() {
        System.out.println(brand + " can store data");
    }

}
class Apple extends Computer{

    Apple(String brand) {
        super(brand);
    }

    @Override
    public void run() {

        System.out.println(brand+" runs faster");
    }

    @Override
    public void storage() {
        System.out.println(brand+" saves the data in a different way");
    }

    @Override
    public void transfer() {
        super.transfer();
    }
}
class Lenovo extends Computer{

    Lenovo(String brand) {
        super(brand);
    }
    void tabletMode(){
        System.out.println(brand+" can also be used as a tablet");
    }
}

class HP extends Computer{

    HP(String brand) {
        super(brand);
    }
    public void secure(){
        System.out.println(brand+" can be unlocked with fingerprints");
    }
}
