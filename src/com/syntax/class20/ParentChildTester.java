package com.syntax.class20;

public class ParentChildTester {
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.print();

        Child child=new Child();
        child.print();
        child.differentPrint();
    }

}
