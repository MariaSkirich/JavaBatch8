package com.syntax.class31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainBank {
    public static void main(String[] args) {
        ABCBank abcBank=new ABCBank("credit", 12000);
        XYZBank xyzBank=new XYZBank("debit", "2022/10");
        JPBank jpBank=new JPBank("debit", "small");
        List<CreditCard> list=new LinkedList<>();
        list.add(abcBank);
        list.add(xyzBank);
        list.add(jpBank);
        for (CreditCard element:list){
            element.colorOfCard();
            element.typeOfCard();
        }
        abcBank.limit();
        xyzBank.expirationDate();
        jpBank.size();

    }
}
