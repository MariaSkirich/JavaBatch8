package com.syntax.class21;

public class Julia extends Parent {
    Julia() {
        System.out.println("Constructor from Julia");
    }

    Julia(int money) {
        super(money);
    }

    public static void main(String[] args) {
        Julia obj = new Julia(12_000);
        obj.print();

    }
}
