package com.syntax.class23;

public class MariaFamilyTester {
    public static void main(String[] args) {
        MariaParents obj=new MariaParents();
        MariaParents[] family_array=new MariaParents[2];
        family_array[0]=new Maria();
        family_array[1]=new Julia();

        for(MariaParents ob:family_array){
            ob.eat();
            ob.sleep();
        }


    }
}
