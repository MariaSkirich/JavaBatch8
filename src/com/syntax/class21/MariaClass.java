package com.syntax.class21;

public class MariaClass extends ParentClass {
    int money;
    MariaClass(int money){
        super(money);
       System.out.println("From child ");
    }
    void marry(){
        super.marry();
        System.out.println("No, parents have been married for more than 35 years"+this.money);
    }

    public static void main(String[] args) {
        MariaClass obj=new MariaClass(12_000);
        obj.marry();
    }
}
