package com.syntax.class21;

public class GrandParents {
    int money;
    GrandParents(){
        System.out.println("This constructor is from GrandParents");
    }
    GrandParents(int money){
        this.money=money;
        System.out.println("This constructor is to initialize money "+this.money);
    }
    void print(){
        System.out.println("I have this money"+money);
    }
}
