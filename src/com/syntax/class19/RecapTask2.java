package com.syntax.class19;

public class RecapTask2 {
    public static String reverseString(String string){
        StringBuilder stringBuilder=new StringBuilder(string);
        stringBuilder.reverse();

        return string;
    }

    public static void main(String[] args) {
        String abc=RecapTask2.reverseString("MARIA");
        System.out.println(abc);
    }
}
