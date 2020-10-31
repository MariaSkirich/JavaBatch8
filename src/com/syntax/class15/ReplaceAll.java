package com.syntax.class15;

public class ReplaceAll {
    public static void main(String[] args) {
        String mix="My fjzbzhdjsoi 171736 name is *^&^&Maria";

        System.out.println(mix.replaceAll("[0-9]", ""));
        System.out.println(mix.replaceAll("[a-z]",""));
        System.out.println(mix.replaceAll("[^A-Z, a-z, 0-9]", ""));
    }
}
