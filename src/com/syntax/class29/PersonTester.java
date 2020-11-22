package com.syntax.class29;

public class PersonTester {
    public static void main(String[] args) {
        Person davitObj = new Person("Davit", "123456789", 25, 30000);
        Person mikeObj=new Person("Mike","4556983214",30,750);

        /*System.out.println(davit.taxPaid);
        davit.taxPaid=0;  //CE cannot access and modify data
        System.out.println(davit.taxPaid);*/
        davitObj.setTaxPaid("45641351", -1);
        davitObj.setTaxPaid("123456789", -1);
        System.out.println(davitObj.getTaxPaid("45641351"));
        System.out.println(davitObj.getTaxPaid("123456789"));

        System.out.println(mikeObj.getTaxPaid("4556983214"));


    }
}
