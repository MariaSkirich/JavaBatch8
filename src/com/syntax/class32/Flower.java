package com.syntax.class32;

public abstract class Flower {
    String name;
    String color;
    Flower(String name, String color){
        this.name=name;
        this.color=color;
    }
    public abstract void bloom();
}
class Rose extends Flower{

    Rose(String name, String color) {
        super(name, color);
    }

    @Override
    public void bloom() {
        System.out.println(name+" blooms in March");
    }
}
class Tulip extends Flower{

    Tulip(String name, String color) {
        super(name, color);
    }

    @Override
    public void bloom() {
        System.out.println(name+" blooms in May");
    }
}
class SunFlower extends Flower{

    SunFlower(String name, String color) {
        super(name, color);
    }

    @Override
    public void bloom() {
        System.out.println(name+" blooms in August");
    }
}
