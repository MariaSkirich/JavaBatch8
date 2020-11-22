package com.syntax.class21;

public class ParentClass {
    int money;

    ParentClass(int money) {
        this.money = money;
        System.out.println("From parent");
    }

    void marry() {
        System.out.println("Parents have been married for more than 30 years. They have this much money "+money);
    }
}
