package com.syntax.class15;

public class SubString {
    public static void main(String[] args) {
        String value="my name is Masha Skirich";
        System.out.println (value.substring(5)); //first five characters will be ignored
        System.out.println(value.substring(0));
        //System.out.println(value.substring(-1));//getting an error because string index is out of range

        System.out.println(value.substring(5,10));//skips first 5 characters and then 10
        System.out.println(value.substring(6,11)+value.substring(5,10));

    }
}
