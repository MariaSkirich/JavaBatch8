package com.syntax.class26;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] allComputersInSingleVariable = {new Apple("Apple"), new Lenovo("Lenovo"), new HP("HP")};

        for (Computer c : allComputersInSingleVariable) {
            c.run();
            c.storage();
            c.transfer();
            c.save();
        }
    Lenovo obj=new Lenovo("Lenovo");
        obj.tabletMode();

    }

}
